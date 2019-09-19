package com.mixone.api.controller;

import com.mixone.api.model.SignData;
import com.mixone.api.util.SignUtil;
import com.mixone.portal.admin.org.model.UserLogin;
import com.mixone.portal.admin.org.service.UserLoginService;
import com.mixone.portal.admin.util.JsonObject;
import com.mixone.portal.admin.util.LoginValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    UserLoginService userLoginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    Object login(UserLogin userLogin) {

        UserLogin user = userLoginService.findByLoginId(userLogin.getUserLoginId());
        if (user != null) {
            if (LoginValidate.validate(userLogin.getCurrentPassword(), user.getCurrentPassword())) {
                return user;
            }
        }
        //账号或密码错误!,返回错误码
        return "20044";
    }
}
