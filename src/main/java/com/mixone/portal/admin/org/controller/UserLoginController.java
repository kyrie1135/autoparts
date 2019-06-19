package com.mixone.portal.admin.org.controller;

import com.mixone.portal.admin.org.model.*;
import com.mixone.portal.admin.org.service.OrgPersonService;
import com.mixone.portal.admin.org.service.PartyService;
import com.mixone.portal.admin.org.service.PersonService;
import com.mixone.portal.admin.org.service.UserLoginService;
import com.mixone.portal.admin.right.model.RolePartyExample;
import com.mixone.portal.admin.right.service.RolePartyService;
import com.mixone.portal.admin.util.EncryptUtil;
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
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;
    @Autowired
    private PersonService personService;
    @Autowired
    private PartyService partyService;
    @Autowired
    private OrgPersonService orgPersonService;
    @Autowired
    private RolePartyService rolePartyService;

    @CrossOrigin
    @RequestMapping("/userlist")
    public String lists(Model model, HttpServletRequest request){
        return "/jsp/admin/user_list";
    }

    //查询列表
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public @ResponseBody Object users(UserLogin userLogin,
                                      Model model, HttpServletRequest request) {

        UserLoginExample example=new UserLoginExample();
        UserLoginExample.Criteria criteria=example.createCriteria();
        criteria.andCurrentStatusEqualTo("0");


        if(null !=userLogin.getUserLoginId() && !"".equalsIgnoreCase(userLogin.getUserLoginId())){
            criteria.andUserLoginIdEqualTo(userLogin.getUserLoginId());
        }
        if(null !=userLogin.getUserName() && !"".equalsIgnoreCase(userLogin.getUserName())){
            criteria.andUserLoginIdEqualTo(userLogin.getUserName());
        }
        if(null !=userLogin.getMobile() && !"".equalsIgnoreCase(userLogin.getMobile())){
            criteria.andMobileEqualTo(userLogin.getMobile());
        }
        if(null !=userLogin.getEmail() && !"".equalsIgnoreCase(userLogin.getEmail())){
            criteria.andEmailEqualTo(userLogin.getEmail());
        }
        List<UserLogin> users= new ArrayList<>();
        users=userLoginService.selectByExample(example);


        return users;
    }

    //注册用户
    @Transactional
    @RequestMapping(value = "/user" , method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    UserLogin userRegister(@RequestBody UserLogin userLogin,
                           Model model, HttpServletRequest request){
        String partyId= IdUtil.nextId().toString();
        userLogin.setPartyId(partyId);
        userLogin.setCurrentPassword(EncryptUtil.encryptSHA256(userLogin.getCurrentPassword()));
        userLogin.setUserName(userLogin.getLastName()+userLogin.getFirstName());
        userLogin.setCurrentStatus("0");
        userLogin.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        userLogin.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        userLogin.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        userLogin.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        Party party =new Party();
        party.setPartyId(partyId);
        party.setCurrentStatus("0");
        party.setPartyName(userLogin.getUserName());

        party.setPartyType("0");//0-个人；1-企业（组织）
        party.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        party.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        party.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        party.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        Person person =new Person();
        person.setPersonId(partyId);
        person.setPartyId(partyId);
        person.setFullName(userLogin.getUserName());
        person.setLastName(userLogin.getLastName());
        person.setFirstName(userLogin.getFirstName());
        person.setCurrentStatus("0");
        person.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        person.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        person.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        person.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        OrgPerson orgPerson =new OrgPerson();
        orgPerson.setOrgPersonId(IdUtil.nextId().toString());
        orgPerson.setOrgId(userLogin.getOrgId());
        orgPerson.setPersonId(userLogin.getPartyId());
        orgPerson.setFromDate(new Timestamp(System.currentTimeMillis()));

        userLoginService.insert(userLogin) ;
        partyService.insertSelective(party);
        personService.insertSelective(person);
        orgPersonService.insert(orgPerson);

        return userLogin;
    }

    //注册用户
    @Transactional
    @RequestMapping(value = "/user" , method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    UserLogin userEdit(@RequestBody UserLogin userLogin,
                       Model model, HttpServletRequest request){

        userLogin.setUserName(userLogin.getLastName()+userLogin.getFirstName());
        userLogin.setCurrentStatus("0");
        userLogin.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        userLogin.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        Party party =new Party();
        party.setPartyId(userLogin.getPartyId());
        party.setCurrentStatus("0");
        party.setPartyName(userLogin.getUserName());
        party.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        party.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        Person person =new Person();
        person.setPersonId(userLogin.getPartyId());
        person.setPartyId(userLogin.getPartyId());
        person.setFullName(userLogin.getUserName());
        person.setLastName(userLogin.getLastName());
        person.setFirstName(userLogin.getFirstName());
        person.setCurrentStatus("0");
        person.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        person.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));


        userLoginService.updateByPrimaryKeySelective(userLogin) ;
        partyService.updateByPrimaryKeySelective(party);
        personService.updateByPrimaryKeySelective(person);

        return userLogin;
    }

    //注册用户
    @Transactional
    @RequestMapping(value = "/user" , method = RequestMethod.DELETE, produces = "application/json")
    public @ResponseBody
    UserLogin userDel(@RequestBody UserLogin userLogin,
                      Model model, HttpServletRequest request){
        //假删除
//        userLogin.setCurrentStatus("1");
//        userLogin.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
//        userLogin.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
//
//        Party party =new Party();
//        party.setPartyId(userLogin.getPartyId());
//        party.setCurrentStatus("1");
//        party.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
//        party.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
//
//        Person person =new Person();
//        person.setPersonId(userLogin.getPartyId());
//        person.setCurrentStatus("1");
//        person.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
//        person.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        //2 真删除
        userLoginService.deleteByPrimaryKey(userLogin.getPartyId());
        partyService.deleteByPrimaryKey(userLogin.getPartyId());
        personService.deleteByPrimaryKey(userLogin.getPartyId());

        //删除组织关系
        OrgPersonExample example =new OrgPersonExample();
        example.createCriteria().andPersonIdEqualTo(userLogin.getPartyId());
        orgPersonService.deleteByExample(example);

        //删除角色关系
        RolePartyExample rolePartyExample = new RolePartyExample();
        rolePartyExample.createCriteria().andPartyIdEqualTo(userLogin.getPartyId());
        rolePartyService.deleteByExample(rolePartyExample);

        return userLogin;
    }

    @RequestMapping(value = "/users/{parentOrgId}", method = RequestMethod.GET)
    public @ResponseBody Object getOrgPersons(@PathVariable("parentOrgId") String parentOrgId){
        OrgPersonExample example =new OrgPersonExample();
        OrgPersonExample.Criteria criteria=example.createCriteria();
        criteria.andOrgIdEqualTo(parentOrgId);
        List<OrgPerson> orgPersonList =orgPersonService.selectByExample(example);

        List<UserLogin> users = new ArrayList<>();
        if(orgPersonList.size()>0){
            List<String> pids=new ArrayList<>();
            for (OrgPerson orgPerson:orgPersonList){
                pids.add(orgPerson.getPersonId());
            }
            UserLoginExample example1=new UserLoginExample();
            UserLoginExample.Criteria criteria1=example1.createCriteria();
            criteria1.andCurrentStatusEqualTo("0");
            criteria1.andPartyIdIn(pids);
            users= userLoginService.selectByExample(example1);
        }

        return users;
    }

}
