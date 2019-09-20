package com.mixone.api.controller;

import com.mixone.api.model.SignData;
import com.mixone.autoparts.autocar.model.AutoCar;
import com.mixone.autoparts.autocar.model.AutoCarExample;
import com.mixone.autoparts.autocar.service.AutoCarService;
import com.mixone.autoparts.autopart.model.AutoPart;
import com.mixone.autoparts.autopart.model.AutoPartExample;
import com.mixone.autoparts.autopart.service.AutoPartService;
import com.mixone.portal.admin.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/v1")
public class ApiAutoPartsController {
    @Autowired
    AutoPartService autoPartService;

    @Autowired
    AutoCarService autoCarService;

    @RequestMapping(value = "/cars",
            method = RequestMethod.GET)
    public @ResponseBody
    Object getAutoCars(@RequestBody Map<String,Object> map) {
        Object signDataJson = map.get("signData");
        try{
            SignData signData = JsonXMLUtils.json2obj(signDataJson.toString(),SignData.class);
            String srcData = "hbxy";
            //验证签名
            if(!RSAUtils.verify(srcData.getBytes(),RSAUtils.publicKey, HexBinUtil.decode2String(signData.getSignData()))){
                //账号或密码错误!,返回错误码
                return "hello";
            }
        }catch (Exception e){
            e.printStackTrace();
            return "hello";
        }

        AutoCarExample example = new AutoCarExample();
        AutoCarExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(" created_time desc");
        criteria.andIsDelEqualTo(0);

        List<AutoCar> autoCars = autoCarService.selectByExample(example);
        return autoCars;
    }



    @RequestMapping(value = "/part", method = RequestMethod.GET)
    public @ResponseBody
    Object autopart(@RequestBody Map<String,Object> map){
        Object signDataJson = map.get("signData");
        try{
            SignData signData = JsonXMLUtils.json2obj(signDataJson.toString(),SignData.class);
            String srcData = "hbxy";
            //验证签名
            if(!RSAUtils.verify(srcData.getBytes(),RSAUtils.publicKey, HexBinUtil.decode2String(signData.getSignData()))){
                //账号或密码错误!,返回错误码
                return "hello";
            }
        }catch (Exception e){
            e.printStackTrace();
            return "hello";
        }



        AutoPartExample example = new AutoPartExample();
        example.setOrderByClause(" created_time desc");

        AutoPartExample.Criteria criteria=example.createCriteria();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        criteria.andIsDelEqualTo(0);

        List<AutoPart> autoParts = autoPartService.selectByExample(example);

        return autoParts;

    }


    @RequestMapping(value = "/part",method= RequestMethod.POST,produces = "application/json")
    public @ResponseBody
    Object addAutopart(@RequestBody Map<String,Object> map, HttpServletRequest request){
        Object signDataJson = map.get("signData");
        Object autopartJson = map.get("autopart");
        try{
            SignData signData = JsonXMLUtils.json2obj(signDataJson.toString(),SignData.class);
            AutoPart autopart = JsonXMLUtils.json2obj(signDataJson.toString(),AutoPart.class);

            String srcData = autopart.getAutocarNo()+autopart.getAutopartName();
            //验证签名
            if(!RSAUtils.verify(srcData.getBytes(),RSAUtils.publicKey, HexBinUtil.decode2String(signData.getSignData()))){
                //账号或密码错误!,返回错误码
                return "20044";
            }

            autopart.setAutopartId(IdUtil.nextId().toString());
            autopart.setIsDel(0);
            autopart.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
            autopart.setCreatedTime(new Timestamp(System.currentTimeMillis()));
            autopart.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
            autopart.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
            autoPartService.insert(autopart);
            return autopart;
        }catch (Exception e){
            e.printStackTrace();
            return "20044";
        }

    }

}
