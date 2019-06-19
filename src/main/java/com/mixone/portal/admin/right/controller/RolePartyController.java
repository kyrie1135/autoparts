package com.mixone.portal.admin.right.controller;

import com.mixone.portal.admin.right.model.*;
import com.mixone.portal.admin.right.service.RolePartyService;
import com.mixone.portal.admin.right.service.RoleService;
import com.mixone.portal.admin.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class RolePartyController {

    @Autowired
    private RoleService roleService;
    @Autowired
    private RolePartyService rolePartyService;

    @RequestMapping("/right")
    public String rightAssign(Model model, HttpServletRequest request){

        return "/jsp/admin/right_assign";
    }

    @RequestMapping("/rightperson")
    public String assign2Person(){
        return "/jsp/admin/right_person";
    }


    //获得尚未授权的对象列表
    @RequestMapping(value = "/roleparty", method = RequestMethod.GET)
    public @ResponseBody Object roles(RoleParty roleparty, Model model, HttpServletRequest request){
        RoleExample example=new RoleExample();
        RoleExample.Criteria criteria=example.createCriteria();

        criteria.andCurrentStatusEqualTo("0");

        //查询该用户已经授权的对象
        RolePartyExample rolePartyExample = new RolePartyExample();
        rolePartyExample.createCriteria().andPartyIdEqualTo(roleparty.getPartyId());
        List<RoleParty> roleParties = rolePartyService.selectByExample(rolePartyExample);
        if(roleParties.size()>0){
            List<String> roleIds= new ArrayList<>();
            for (RoleParty rp: roleParties) {
                roleIds.add(rp.getRoleId());
            }
            //设置查询条件
            criteria.andRoleIdNotIn(roleIds);
        }


        List<Role> roles= roleService.selectByExample(example);

        return roles;
    }

    //获得已授权对象列表
    @RequestMapping(value = "/roleparty2", method = RequestMethod.GET)
    public @ResponseBody Object roles2(RoleParty roleparty, Model model, HttpServletRequest request){
        RoleExample example=new RoleExample();
        RoleExample.Criteria criteria=example.createCriteria();

        criteria.andCurrentStatusEqualTo("0");

        //查询该用户已经授权的对象
        RolePartyExample rolePartyExample = new RolePartyExample();
        rolePartyExample.createCriteria().andPartyIdEqualTo(roleparty.getPartyId());
        List<RoleParty> roleParties = rolePartyService.selectByExample(rolePartyExample);
        if(roleParties.size()>0){
            List<String> roleIds= new ArrayList<>();
            for (RoleParty rp: roleParties) {
                roleIds.add(rp.getRoleId());
            }
            //设置查询条件
            criteria.andRoleIdIn(roleIds);

            List<Role> roles= roleService.selectByExample(example);

            return roles;

        }else {
            return new ArrayList<Role>();
        }
    }


    @Transactional
    @RequestMapping(value = "/roleparty", method = RequestMethod.POST)
    public @ResponseBody Object appAdd(@RequestBody PartyRight partyRight,
                       Model model, HttpServletRequest request) {

        String partyId = partyRight.getPartyId();
        //新授权对象列表
        List<RoleParty> roleParties=partyRight.getRoleParties();

        //先删除数据库中该用户所有已拥有的对象
        RolePartyExample rolePartyExample = new RolePartyExample();
        rolePartyExample.createCriteria().andPartyIdEqualTo(partyId);
        rolePartyService.deleteByExample(rolePartyExample);


        //再把新授权的对象增加到数据库中
        for(RoleParty roleParty : roleParties){
            RoleParty rp= new RoleParty();
            rp.setRolePartyId(IdUtil.nextId().toString());
            rp.setPartyId(roleParty.getPartyId());
            rp.setRoleId(roleParty.getRoleId());
            rp.setRoleName(roleParty.getRoleName());
            rolePartyService.insert(rp);
        }
        return "200";
    }

}
