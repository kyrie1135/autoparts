package com.mixone.portal.admin.org.controller;

import com.mixone.portal.admin.org.model.UserLogin;
import com.mixone.portal.admin.org.model.UserLoginExample;
import com.mixone.portal.admin.org.service.UserLoginService;
import com.mixone.portal.admin.util.EncryptUtil;
import com.mixone.portal.admin.util.UserLoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;

@Controller
public class UserController {

    @Autowired
    UserLoginService userLoginService;

    //用户自己重置密码
    @RequestMapping("/user/changepwd")
    public String tochangepwd(Model model, HttpServletRequest request) {
        if("1".equalsIgnoreCase(UserLoginUtil.getUserLogin(request).getIsSystem())){
            return "/jsp/admin/admin_changepwd";

        }else{
            return "/jsp/admin/user_changepwd";
        }

    }


    @RequestMapping("/user/savepwd")
    public String changepwd(UserLogin user, Model model, HttpServletRequest request){
        user.setPartyId(UserLoginUtil.getUserLogin(request).getPartyId());
        user.setCurrentPassword(EncryptUtil.encryptSHA256(user.getCurrentPassword()));
        user.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        user.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        userLoginService.updateByPrimaryKeySelective(user);
        if("1".equalsIgnoreCase(UserLoginUtil.getUserLogin(request).getIsSystem())) {
            return "/jsp/admin/admin_changepwd_success";
        }else{
            return "/jsp/admin/user_changepwd_success";
        }
    }

    //系统管理员给普通人员重置密码
    @RequestMapping("/admin/resetpwd")
    public String admintoresetpwd(Model model, Long partyId, HttpServletRequest request) {
        model.addAttribute("partyId", partyId);
        return "/jsp/admin/admin_resetpwd";
    }

    @RequestMapping("/admin/savepwd")
    public String adminresetpwd(UserLogin user, Model model, HttpServletRequest request){

        user.setCurrentPassword(EncryptUtil.encryptSHA256(user.getCurrentPassword()));

        user.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        user.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        userLoginService.updateByPrimaryKeySelective(user);

        return "redirect:/admin/userlist";
    }
}
