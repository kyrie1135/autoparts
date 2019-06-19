package com.mixone.portal.admin.app.controller;

import com.mixone.portal.admin.app.model.*;
import com.mixone.portal.admin.app.service.ApplicationService;
import com.mixone.portal.admin.app.service.ModuleResService;
import com.mixone.portal.admin.app.service.ModuleService;
import com.mixone.portal.admin.util.IdUtil;
import com.mixone.portal.admin.util.UserLoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class ApplicationController {
    @Autowired
    ApplicationService applicationService;
    @Autowired
    ModuleService moduleService;
    @Autowired
    ModuleResService moduleResService;



    @CrossOrigin
    @RequestMapping("/applist")
    public String lists(Model model, HttpServletRequest request){
        return "/jsp/admin/app_list";
    }


    @RequestMapping(value = "/app", method = RequestMethod.GET)
    public @ResponseBody Object apps(Application app,
                                     Model model, HttpServletRequest request){

        ApplicationExample example =new ApplicationExample();
        ApplicationExample.Criteria criteria=example.createCriteria();
        criteria.andCurrentStatusEqualTo("0");

        if(null != app.getAppName() && !"".equalsIgnoreCase(app.getAppName())){
            criteria.andAppNameLike(app.getAppName());
        }

        List<Application> apps= applicationService.selectByExample(example);

        if(null != apps && apps.size() != 0){
            return apps;
        }else {
            return new Application();
        }
    }

    @RequestMapping(value = "/app", method = RequestMethod.POST)
    public @ResponseBody Application appAdd(@RequestBody Application app,
                                     Model model, HttpServletRequest request) {

        String appId= IdUtil.nextId().toString();
        app.setAppId(appId);
        app.setCurrentStatus("0");
        app.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        app.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        app.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        app.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        applicationService.insert(app);

        return app;
    }

    @Transactional
    @RequestMapping(value = "/app", method = RequestMethod.PUT)
    public @ResponseBody Application appEdit(@RequestBody Application app,
                                            Model model, HttpServletRequest request) {

        app.setCurrentStatus("0");
        app.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        app.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        //更新模块表冗余信息
        ModuleExample moduleExample = new ModuleExample();
        moduleExample.createCriteria().andAppIdEqualTo(app.getAppId());
        Module module =new Module();
        module.setAppName(app.getAppName());
        module.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        module.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        //更新模块资源表冗余信息
        ModuleResExample moduleResExample = new ModuleResExample();
        moduleResExample.createCriteria().andAppIdEqualTo(app.getAppId());
        ModuleRes moduleRes =new ModuleRes();
        moduleRes.setAppName(app.getAppName());
        moduleRes.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        moduleRes.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        applicationService.updateByPrimaryKeySelective(app);
        moduleService.updateByExampleSelective(module,moduleExample);
        moduleResService.updateByExampleSelective(moduleRes,moduleResExample);

        return app;
    }

    @Transactional
    @RequestMapping(value = "/app", method = RequestMethod.DELETE)
    public @ResponseBody Application appDel(@RequestBody Application app,
                                            Model model, HttpServletRequest request) {
        ModuleExample moduleExample = new ModuleExample();
        moduleExample.createCriteria().andAppIdEqualTo(app.getAppId());

        ModuleResExample moduleResExample = new ModuleResExample();
        moduleResExample.createCriteria().andAppIdEqualTo(app.getAppId());

        applicationService.deleteByPrimaryKey(app.getAppId());
        moduleService.deleteByExample(moduleExample);
        moduleResService.deleteByExample(moduleResExample);

        return app;
    }

}
