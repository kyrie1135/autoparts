package com.mixone.portal.admin.util;


import com.mixone.portal.admin.org.model.UserLogin;

import javax.servlet.http.HttpServletRequest;

public class UserLoginUtil {


    public final static UserLogin getUserLogin(HttpServletRequest request){


        UserLogin userLogin = new UserLogin();
        if(null != request.getSession().getAttribute("USER_SESSION")){
            userLogin = (UserLogin)request.getSession().getAttribute("USER_SESSION");
        }else{
            //用于未集成登录验证时,测试使用
            userLogin.setUserLoginId("admin");
            userLogin.setUserName("系统管理员");
        }


        return userLogin;
    }
}
