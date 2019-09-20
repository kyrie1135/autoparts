package com.mixone.api.controller;

import com.mixone.api.model.SignData;
import com.mixone.portal.admin.org.model.UserLogin;
import com.mixone.portal.admin.org.service.UserLoginService;
import com.mixone.portal.admin.util.HexBinUtil;
import com.mixone.portal.admin.util.JsonXMLUtils;
import com.mixone.portal.admin.util.LoginValidate;
import com.mixone.portal.admin.util.RSAUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    UserLoginService userLoginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    Object login(@RequestBody Map<String,Object> map) {
        try {
            Object signDataJson = map.get("signData");
            Object userLoginJson = map.get("userLogin");

            UserLogin userLogin = JsonXMLUtils.json2obj(userLoginJson.toString(),UserLogin.class);
            SignData signData = JsonXMLUtils.json2obj(signDataJson.toString(),SignData.class);

            String srcData =userLogin.getUserLoginId()+userLogin.getCurrentPassword();

            //验证签名
            if(!RSAUtils.verify(srcData.getBytes(),RSAUtils.publicKey,HexBinUtil.decode2String(signData.getSignData()))){
                //账号或密码错误!,返回错误码
                System.out.println("srcData="+srcData);
                return "20044";
            }

            UserLogin user = userLoginService.findByLoginId(userLogin.getUserLoginId());
            if (user != null) {
                if (LoginValidate.validate(userLogin.getCurrentPassword(), user.getCurrentPassword())) {
                    return user;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return "20044";
        }
        System.out.println("最后错误");
        //账号或密码错误!,返回错误码
        return "20044";
    }
}
