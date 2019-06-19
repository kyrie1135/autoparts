package com.mixone.portal.admin.right.controller;

import com.mixone.portal.admin.app.model.ModuleRes;
import com.mixone.portal.admin.app.model.ModuleResExample;
import com.mixone.portal.admin.app.service.ModuleResService;
import com.mixone.portal.admin.right.model.*;
import com.mixone.portal.admin.right.service.RolePartyService;
import com.mixone.portal.admin.right.service.RoleRightService;
import com.mixone.portal.admin.right.service.RoleService;
import com.mixone.portal.admin.util.IdUtil;
import com.mixone.portal.admin.util.UserLoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleRightService roleRightService;
    @Autowired
    private RolePartyService rolePartyService;
    @Autowired
    private ModuleResService moduleResService;

    @RequestMapping("/rolelist")
    public String lists(Model model, HttpServletRequest request){

        return "/jsp/admin/role_list";
    }



    @RequestMapping("/toroleadd")
    public String roletoadd(Model model, HttpServletRequest request){
        ModuleResExample example=new ModuleResExample();
        ModuleResExample.Criteria criteria=example.createCriteria();
        criteria.andCurrentStatusEqualTo("0");
        example.setOrderByClause(" app_name,module_name,order_index");
        List<ModuleRes> lists= moduleResService.selectByExample(example);
        model.addAttribute("resourcelist",lists);

        return "/jsp/admin/role_add";
    }


    @Transactional
    @RequestMapping("/roleadd")
    public String roleadd(Role role, Model model, HttpServletRequest request){

        String[]  rightIds   =  request.getParameterValues("rightId");

        String roleId= IdUtil.nextId().toString();
        role.setRoleId(roleId);
        role.setCurrentStatus("0");
        role.setRoleDesc(role.getRoleName());
        role.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        role.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        role.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        role.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));


        roleService.insert(role);

        if(rightIds != null){
            for(int i=0;i<rightIds.length;i++){
                RoleRight roleRight=new RoleRight();
                roleRight.setRoleRightId(IdUtil.nextId().toString());
                roleRight.setRoleId(roleId);
                roleRight.setResourceId(rightIds[i]);

                roleRightService.insert(roleRight);
            }
        }


        return "redirect:rolelist";
    }


    @RequestMapping(value = "/role", method = RequestMethod.GET)
    public @ResponseBody Object roles(Role role, Model model, HttpServletRequest request){
        RoleExample example=new RoleExample();
        RoleExample.Criteria criteria=example.createCriteria();

        criteria.andCurrentStatusEqualTo("0");


        List<Role> roles= roleService.selectByExample(example);

        return roles;
    }

    @Transactional
    @RequestMapping(value = "/role" ,method = RequestMethod.PUT)
    public @ResponseBody Object roleEdit(@RequestBody RoleRights roleRights, Model model, HttpServletRequest request){

        Role role= new Role();

        role.setRoleId(roleRights.getRoleId());
        role.setRoleName(roleRights.getRoleName());
        role.setRoleCode(roleRights.getRoleCode());
        role.setCurrentStatus("0");
        role.setRoleDesc(roleRights.getRoleName());
        role.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        role.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        roleService.updateByPrimaryKeySelective(role);

            RoleRightExample example = new RoleRightExample();
            example.createCriteria().andRoleIdEqualTo(roleRights.getRoleId());
            roleRightService.deleteByExample(example);
        if(roleRights.getResourceIds() != null){

            for(int i=0;i<roleRights.getResourceIds().length;i++){
                RoleRight roleRight=new RoleRight();
                roleRight.setRoleRightId(IdUtil.nextId().toString());
                roleRight.setRoleId(roleRights.getRoleId());
                roleRight.setResourceId(roleRights.getResourceIds()[i]);

                roleRightService.insert(roleRight);
            }
        }

        return role;
    }

    @Transactional
    @RequestMapping(value = "/role" ,method = RequestMethod.DELETE)
    public @ResponseBody Object roleDel(@RequestBody Role role, Model model, HttpServletRequest request){
        //设置条件,删除已分配给角色的权限
        RoleRightExample rightExample = new RoleRightExample();
        rightExample.createCriteria().andRoleIdEqualTo(role.getRoleId());

        //设置条件,删除已分配给用户的角色
        RolePartyExample partyExample = new RolePartyExample();
        partyExample.createCriteria().andRoleIdEqualTo(role.getRoleId());

        roleService.deleteByPrimaryKey(role.getRoleId());
        roleRightService.deleteByExample(rightExample);
        rolePartyService.deleteByExample(partyExample);

        return role;
    }

    //获得已授权的权限资源列表
    @RequestMapping(value = "/roleright", method = RequestMethod.GET)
    public @ResponseBody Object roleright(Role role, Model model, HttpServletRequest request){
        //获得该角色已经授权的权限
        RoleRightExample roleRightExample =new RoleRightExample();
        RoleRightExample.Criteria roleRightCriteria=roleRightExample.createCriteria();
        roleRightCriteria.andRoleIdEqualTo(role.getRoleId());
        List<RoleRight> roleRights=roleRightService.selectByExample(roleRightExample);

        List<String> rds=new ArrayList();
        if(roleRights.size()>0){
            for(RoleRight rr: roleRights){
                rds.add(rr.getResourceId());
            }

            //获得已授权资源权限列表
            ModuleResExample example1=new ModuleResExample();
            ModuleResExample.Criteria criteria1=example1.createCriteria();
            criteria1.andCurrentStatusEqualTo("0");
            criteria1.andResourceIdIn(rds);
            example1.setOrderByClause(" app_name,module_name,order_index");
            List<ModuleRes> lists1= moduleResService.selectByExample(example1);
            return lists1;

        }else {
            return new ArrayList<ModuleRes>();
        }
    }

    //获得尚未授权的权限资源列表
    @RequestMapping(value = "/roleright2", method = RequestMethod.GET)
    public @ResponseBody Object roleright2(Role role, Model model, HttpServletRequest request){
        //获得该角色已经授权的权限
        RoleRightExample roleRightExample =new RoleRightExample();
        RoleRightExample.Criteria roleRightCriteria=roleRightExample.createCriteria();
        roleRightCriteria.andRoleIdEqualTo(role.getRoleId());
        List<RoleRight> roleRights=roleRightService.selectByExample(roleRightExample);

        List<String> rds=new ArrayList();
        for(RoleRight rr: roleRights){
            rds.add(rr.getResourceId());
        }

        //获得尚未授权资源权限列表
        ModuleResExample example2=new ModuleResExample();
        ModuleResExample.Criteria criteria2=example2.createCriteria();
        criteria2.andCurrentStatusEqualTo("0");
        if(rds.size() > 0){
            criteria2.andResourceIdNotIn(rds);
        }
        example2.setOrderByClause(" app_name,module_name,order_index");
        List<ModuleRes> lists2= moduleResService.selectByExample(example2);

        return lists2;
    }
}
