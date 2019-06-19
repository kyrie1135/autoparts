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
public class ModuleController {
    @Autowired
    private ModuleService moduleService;
    @Autowired
    private ModuleResService moduleResService;

    @Autowired
    private ApplicationService applicationService;

    @CrossOrigin
    @RequestMapping("/modulelist")
    public String lists(Model model, HttpServletRequest request){

        ApplicationExample example =new ApplicationExample();
        example.createCriteria().andCurrentStatusEqualTo("0");

        List<Application> apps= applicationService.selectByExample(example);

        String appId="-1";
        if(null != request.getParameter("appId") && !"".equalsIgnoreCase(request.getParameter("appId"))){
            appId=request.getParameter("appId");
        }

        model.addAttribute("applist",apps);
        model.addAttribute("appId",appId);
        model.addAttribute("appName",request.getParameter("appName"));
        return "/jsp/admin/app_module_list";
    }


    @RequestMapping(value = "/module", method = RequestMethod.GET)
    public @ResponseBody Object modules(Module module,
                                        Model model, HttpServletRequest request){

        ModuleExample example =new ModuleExample();
        ModuleExample.Criteria criteria=example.createCriteria();

        criteria.andCurrentStatusEqualTo("0");

        if(null != module.getModuleName() && !"".equalsIgnoreCase(module.getModuleName())){
            criteria.andModuleNameLike(module.getModuleName());
        }
        if(null != module.getAppId() && !"".equalsIgnoreCase(module.getAppId())){
            criteria.andAppIdEqualTo(module.getAppId());
        }
        List<Module> modules= moduleService.selectByExample(example);

        if(null != modules && modules.size() != 0){
            return modules;
        }else {
            return new Module();
        }
    }


    @Transactional
    @RequestMapping(value = "/module", method = RequestMethod.POST)
    public @ResponseBody
    Module appAdd(@RequestBody Module module,
                  Model model, HttpServletRequest request) {

        String moduleId= IdUtil.nextId().toString();
        module.setModuleId(moduleId);
        module.setCurrentStatus("0");
        module.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        module.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        module.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        module.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        //当新创建一个模块时,自动给其创建一个默认的权限资源,作为模块的导航入口
        ModuleRes moduleRes =new ModuleRes();
        moduleRes.setResourceId(IdUtil.nextId().toString());
        moduleRes.setModuleId(moduleId);
        moduleRes.setResourceName(module.getModuleName()+"");
        moduleRes.setResourceCode(module.getModuleCode()+"_res0");
        moduleRes.setNeedRight(module.getNeedRight());
        moduleRes.setResourceIconUrl(module.getModuleIconUrl());
        moduleRes.setResourceUrl(module.getModuleUrl());
        moduleRes.setOrderIndex(0);
        moduleRes.setResourceType("0");//默认菜单类型的资源
        moduleRes.setCurrentStatus("0");

        //添加冗余信息,方便查询
        moduleRes.setAppId(module.getAppId());
        moduleRes.setAppName(module.getAppName());
        moduleRes.setModuleId(module.getModuleId());
        moduleRes.setModuleName(module.getModuleName());

        moduleRes.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        moduleRes.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        moduleRes.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        moduleRes.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));


        moduleService.insert(module);
        moduleResService.insert(moduleRes);

        return module;
    }

    @Transactional
    @RequestMapping(value = "/module", method = RequestMethod.PUT)
    public @ResponseBody
    Module moduleEdit(@RequestBody Module module,
                      Model model, HttpServletRequest request) {

        module.setCurrentStatus("0");
        module.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        module.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));


        //更新模块资源表冗余信息
        ModuleResExample moduleResExample = new ModuleResExample();
        moduleResExample.createCriteria().andModuleIdEqualTo(module.getModuleId());
        ModuleRes moduleRes =new ModuleRes();
        moduleRes.setModuleName(module.getModuleName());
        moduleRes.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        moduleRes.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        moduleService.updateByPrimaryKeySelective(module);
        moduleResService.updateByExampleSelective(moduleRes,moduleResExample);

        return module;
    }

    @Transactional
    @RequestMapping(value = "/module", method = RequestMethod.DELETE)
    public @ResponseBody
    Module moduleDel(@RequestBody Module module,
                     Model model, HttpServletRequest request) {

        ModuleResExample moduleResExample = new ModuleResExample();
        moduleResExample.createCriteria().andModuleIdEqualTo(module.getModuleId());

        moduleService.deleteByPrimaryKey(module.getModuleId());
        moduleResService.deleteByExample(moduleResExample);

        return module;
    }
}
