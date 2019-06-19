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
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class ModuleResController {

    @Autowired
    private ModuleResService moduleResService;
    @Autowired
    private ModuleService moduleService;
    @Autowired
    private ApplicationService appService;


    @CrossOrigin
    @RequestMapping("/modulereslist")
    public String lists(Model model, HttpServletRequest request){

        model.addAttribute("appId",request.getParameter("appId"));
        model.addAttribute("appName",request.getParameter("appName"));
        model.addAttribute("moduleId",request.getParameter("moduleId"));
        model.addAttribute("moduleName",request.getParameter("moduleName"));

        return "/jsp/admin/app_moduleres_list";
    }

    @RequestMapping(value = "/moduleres", method = RequestMethod.GET)
    public @ResponseBody Object modules(ModuleRes moduleRes, Model model, HttpServletRequest request) {

        ModuleResExample example = new ModuleResExample();
        ModuleResExample.Criteria criteria = example.createCriteria();

        criteria.andCurrentStatusEqualTo("0");
        if(null != moduleRes.getModuleId() && !"".equalsIgnoreCase(moduleRes.getModuleId())){
            criteria.andModuleIdEqualTo(moduleRes.getModuleId());
        }

        List<ModuleRes> lists= moduleResService.selectByExample(example);

        if(null != lists && lists.size() != 0){
            return lists;
        }else {
            return new ModuleRes();
        }
    }

    @Transactional
    @RequestMapping(value = "/moduleres", method = RequestMethod.POST)
    public @ResponseBody
    ModuleRes appAdd(@RequestBody ModuleRes moduleRes,
                     Model model, HttpServletRequest request) {

        String moduleResId= IdUtil.nextId().toString();
        moduleRes.setResourceId(moduleResId);
        moduleRes.setResourceType("0");//默认菜单类型的资源
        moduleRes.setCurrentStatus("0");
        moduleRes.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        moduleRes.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        moduleRes.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        moduleRes.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        moduleResService.insert(moduleRes);

        return moduleRes;
    }

    @RequestMapping(value = "/appmodule/node", method = RequestMethod.GET)
    public @ResponseBody Object appmoduleNode(){

        List<AppModuleNode> appNodes=new ArrayList<>();

        ApplicationExample example=new ApplicationExample();
        ApplicationExample.Criteria criteria = example.createCriteria();
        criteria.andCurrentStatusEqualTo("0");
        example.setOrderByClause(" order_index");

        List<Application> apps=appService.selectByExample(example);
        for(Application app:apps){
            AppModuleNode appnode =new AppModuleNode();
            appnode.setId(app.getAppId());
            appnode.setText(app.getAppName());
            appnode.setOrderIndex(app.getOrderIndex());

            ModuleExample moduleExample =new ModuleExample();
            ModuleExample.Criteria moduleCriteria=moduleExample.createCriteria();
            moduleCriteria.andCurrentStatusEqualTo("0");
            moduleCriteria.andAppIdEqualTo(app.getAppId());
            moduleExample.setOrderByClause(" order_index");

            List<Module> modules=moduleService.selectByExample(moduleExample);

            List<AppModuleNode> moduleNodes=new ArrayList<>();
            for(Module module:modules){
                AppModuleNode modulenode =new AppModuleNode();
                modulenode.setId(module.getModuleId());
                modulenode.setText(module.getModuleName());
                modulenode.setParentId(module.getAppId());
                modulenode.setOrderIndex(module.getOrderIndex());
                moduleNodes.add(modulenode);
            }

            appnode.setNodes(moduleNodes);
            appNodes.add(appnode);

        }
        return appNodes;
    }
}
