package com.mixone.portal.admin.app.controller;

import com.mixone.portal.admin.app.model.Application;
import com.mixone.portal.admin.app.model.ApplicationExample;
import com.mixone.portal.admin.app.model.ModuleExample;
import com.mixone.portal.admin.app.service.AppService;
import com.mixone.portal.admin.app.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/test")
public class AppController {
    @Autowired
    private AppService appService;

    @Autowired
    private ModuleService moduleService;

    //请求的方式: /admin/applist?appName=''
    @RequestMapping("/applist")
    public String applist(String appName, Model model,
                          HttpServletRequest request){

        ApplicationExample example=new ApplicationExample();

        if(null != appName && !"".equalsIgnoreCase(appName)){
            ApplicationExample.Criteria criteria= example.createCriteria();
            criteria.andAppNameLike(appName);
         }

        List<Application> apps = appService.selectByExample(example);


        model.addAttribute("applist",apps);
        return "/jsp/app_list";
    }

    //新增应用
    @RequestMapping("/appadd")
    public String appAdd(Application app,
                         Model model,HttpServletRequest request,
                         RedirectAttributes redirectAttributes){


        //app.setCreatedTime();
        //app.setCreatedUserLogin();
//        appService.insert(app);
//
        redirectAttributes.addAttribute("appName","AAAA");
        return "redirect:applist";
    }

    //去到修改页面
    @RequestMapping("/toappedit")
    public String toAppEdit(String appId,
                            Model model,HttpServletRequest request){

        if(null != appId && !"".equalsIgnoreCase(appId)){
            Application app=appService.selectByPrimaryKey(appId);

            model.addAttribute("app",app);
        }

        return "/jsp/appedit";
    }

    //修改页面,点击保存按钮后,保存信息
    @RequestMapping("/appedit")
    public String appEdit(Application app,
                          Model model,HttpServletRequest request){

        //app.setLastUpdatedUserLogin();
        //app.setLastUpdatedTime();
        appService.updateByPrimaryKeySelective(app);

        return "redirect:applist";
    }

    @Transactional
    @RequestMapping("/appdel")
    public String addDel(String appId,
                         Model model,HttpServletRequest request){
        //1 删除主表数据
        appService.deleteByPrimaryKey(appId);

        //TODO:
        //2 删除子表或者关联表数据
        //2.1 构造一个appId的查询条件
        ModuleExample example = new ModuleExample();
        example.createCriteria().andAppIdEqualTo(appId);
        //2.2 根据条件删除
        moduleService.deleteByExample(example);

        //3



        return "redirect:applist";
    }

    @RequestMapping("/test")
    public String moduleAdd(String appId, Model model ,
                            HttpServletRequest request){

        return "redirect:/applist2";
    }

    @RequestMapping("/applist2")
    public String applist2(String appId, Model model,
                          HttpServletRequest request){

        ApplicationExample example=new ApplicationExample();


        List<Application> apps = appService.selectByExample(example);


        model.addAttribute("applist",apps);
        return "/jsp/app_list";
    }

}
