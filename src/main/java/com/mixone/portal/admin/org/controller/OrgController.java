package com.mixone.portal.admin.org.controller;

import com.mixone.portal.admin.org.model.*;
import com.mixone.portal.admin.org.service.OrgPersonService;
import com.mixone.portal.admin.org.service.OrgService;
import com.mixone.portal.admin.org.service.PartyService;
import com.mixone.portal.admin.util.GlobalVar;
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
public class OrgController {

    @Autowired
    OrgService orgService;
    @Autowired
    PartyService partyService;
    @Autowired
    OrgPersonService orgPersonService;

    GlobalVar globalVar;

    @RequestMapping("/orglist")
    public String lists(){
       return "/jsp/admin/org_list";
    }


    @RequestMapping("/toOrgList")
    public String toOrgList(String currentPage, Model model) {

        OrgExample example =new OrgExample();
        OrgExample.Criteria criteria=example.createCriteria();
        criteria.andCurrentStatusEqualTo("0");


        List<Org> rList = orgService.selectByExample(example);

        //model.addAttribute("page", page);
        model.addAttribute("org_list", rList);
        model.addAttribute("GlobalVar",globalVar);

        return "/jsp/admin/org_list";
    }

    @Transactional
    @RequestMapping(value = "/org", method = RequestMethod.POST ,produces = "application/json")
    public @ResponseBody
    Org addOrg(@RequestBody Org org, Model model, HttpServletRequest request) {

        String partyId = IdUtil.nextId().toString();
        org.setOrgId(partyId);
        org.setPartyId(partyId);
        org.setCurrentStatus("0");
        org.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        org.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        org.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        org.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        Party party =new Party();
        party.setPartyId(partyId);
        party.setCurrentStatus("0");
        party.setPartyName(org.getOrgName());

        party.setPartyType("1");//0-个人；1-企业（组织）
        party.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        party.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        party.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        party.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        orgService.insert(org);
        partyService.insertSelective(party);

        return org;
    }

    // 删除组织信息
    @Transactional
    @RequestMapping(value = "/org/{partyId}", method = RequestMethod.DELETE)
    public @ResponseBody String deleteOrg(@PathVariable("partyId") String partyId,HttpServletRequest request) {
        Org org=new Org();
        org.setOrgId(partyId);
        org.setCurrentStatus("1");
        org.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        org.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        orgService.updateByPrimaryKeySelective(org);

        Party party =new Party();
        party.setPartyId(partyId);
        party.setCurrentStatus("1");
        party.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        party.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        partyService.updateByPrimaryKeySelective(party);


        OrgPerson orgPerson =new OrgPerson();
        orgPerson.setOrgId("0");

        OrgPersonExample example =new OrgPersonExample();
        example.createCriteria().andOrgIdEqualTo(partyId);

        orgPersonService.updateByExampleSelective(orgPerson,example);

//        partyService.deleteByPrimaryKey(partyId);
//        orgService.deleteByPrimaryKey(partyId);//org_id = party_id
        return "200";
    }

    @RequestMapping(value = "/org/{partyId}", method = RequestMethod.GET)
    public @ResponseBody
    Org getOrg(@PathVariable("partyId") String partyId){
        Org org=orgService.selectByPrimaryKey(partyId);
        return org;
    }

    @RequestMapping(value="/org/{partyId}",method=RequestMethod.PUT,produces = "application/json")
    public @ResponseBody
    Org updateOrg(@RequestBody Org org, HttpServletRequest request){
        org.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        org.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        orgService.updateByPrimaryKeySelective(org);

        return org;
    }

    @RequestMapping(value = "/orgs/{parentOrgId}", method = RequestMethod.GET)
    public @ResponseBody Object getOrgs(@PathVariable("parentOrgId") String parentOrgId){
        OrgExample example =new OrgExample();
        OrgExample.Criteria criteria =example.createCriteria();
        criteria.andCurrentStatusEqualTo("0");
        example.setOrderByClause(" order_index");
        if(parentOrgId !=null && !"".equalsIgnoreCase(parentOrgId)){
            criteria.andParentOrgIdEqualTo(parentOrgId);

        }
        List<Org> orgs=orgService.selectByExample(example);

        return orgs;
    }


    @RequestMapping(value = "/orgs/node/{parentOrgId}", method = RequestMethod.GET)
    public @ResponseBody Object getOrgNode(@PathVariable("parentOrgId") String parentOrgId){



        List<OrgNode> orgNodes=orgService.findOrgNode(parentOrgId);

        return orgNodes;
    }
}
