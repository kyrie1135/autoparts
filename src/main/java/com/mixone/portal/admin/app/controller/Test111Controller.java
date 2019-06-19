package com.mixone.portal.admin.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Test111Controller {


    @RequestMapping("/apptest1")
    public String applist(String appId, Model model,
                          HttpServletRequest request,
                          RedirectAttributes redirectAttributes){

//        redirectAttributes.addAttribute("appId","1111");

        return "redirect:apptest2?appId="+appId;
    }

    @RequestMapping("/apptest2")
    public String applist2(String appId, Model model,
                          HttpServletRequest request){

        model.addAttribute("applist","");
        return "app_list";
    }

}
