package com.mixone.api.controller;

import com.mixone.api.model.SignData;
import com.mixone.autoparts.autopart.model.AutoPart;
import com.mixone.portal.admin.util.*;
import com.mixone.surport.issue.model.*;
import com.mixone.surport.issue.service.IssueFixService;
import com.mixone.surport.issue.service.IssuePicService;
import com.mixone.surport.issue.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Controller
public class ApiIssueController {

    @Autowired
    IssueService issueService;
    @Autowired
    IssuePicService issuePicService;
    @Autowired
    IssueFixService issueFixService;

    @RequestMapping(value = "/issue", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Object addIssue(@RequestBody Issue issue, HttpServletRequest request) {

//        Object signDataJson = map.get("signData");
//        Object issueJson = map.get("issue");
//        Object issuePicJson = map.get("issuePic");
        try {
//            SignData signData = JsonXMLUtils.json2obj(signDataJson.toString(),SignData.class);
//            Issue issue = JsonXMLUtils.json2obj(issueJson.toString(),Issue.class);
//            IssuePicJson issuePicTemp = JsonXMLUtils.json2obj(issuePicJson.toString(),IssuePicJson.class);
//
//            String srcData = issue.getIssueTitle()+issue.getReporter();
//            //验证签名
//            if(!RSAUtils.verify(srcData.getBytes(),RSAUtils.publicKey, HexBinUtil.decode2String(signData.getSignData()))){
//                //账号或密码错误!,返回错误码
//                return "20044";
//            }

            issue.setIssueId(IdUtil.nextId().toString());
            issue.setIssueStatus("0");
            issue.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
            issue.setCreatedTime(new Timestamp(System.currentTimeMillis()));
            issue.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
            issue.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
            issueService.insertSelective(issue);

            if (null != issue.getIssuePic() && !"".equalsIgnoreCase(issue.getIssuePic())) {
                IssuePic issuePic = new IssuePic();
                issuePic.setIssuePicId(IdUtil.nextId().toString());
                issuePic.setIssueId(issue.getIssueId());
                issuePic.setIssuePic(HexBinUtil.decode(issue.getIssuePic()));
                issuePicService.insertSelective(issuePic);
            }

            return issue;
        } catch (Exception e) {
            e.printStackTrace();
            return "20044";
        }
    }


    @RequestMapping(value = "/issue", method = RequestMethod.GET)
    public @ResponseBody
    Object getIssue(String reporterId, String issueId,
                    String issueStatus, HttpServletRequest request) {

        IssueExample issueExample = new IssueExample();
        IssueExample.Criteria criteria = issueExample.createCriteria();
        //不需要写成 ORDER BY issue_status, created_time desc
        issueExample.setOrderByClause(" issue_status, created_time desc ");
        if (null != reporterId && !"".equalsIgnoreCase(reporterId)) {
            criteria.andReporterIdEqualTo(reporterId);
        }
        if (null != issueId && !"".equalsIgnoreCase(issueId)) {
            criteria.andIssueIdEqualTo(issueId);
        }
        if (null != issueStatus && !"".equalsIgnoreCase(issueStatus)) {
            criteria.andIssueStatusEqualTo(issueStatus);
        }

        List<Issue> list = issueService.selectByExample(issueExample);


        //如果issueId有值,即为查询单个问题,则返回图片及其他信息
        if (null != issueId && !"".equalsIgnoreCase(issueId)) {

            if (list.size() > 0) {
                Issue issue = new Issue();
                issue = list.get(0);

                //查找图片
                IssuePicExample issuePicExample = new IssuePicExample();
                IssuePicExample.Criteria picCriteria = issuePicExample.createCriteria();
                picCriteria.andIssueIdEqualTo(issueId);
                List<IssuePic> issuePicList = issuePicService.selectByExampleWithBLOBs(issuePicExample);
                if (issuePicList.size() > 0) {
                    IssuePic issuePic = issuePicList.get(0);
                    byte[] picByte = issuePic.getIssuePic();
                    if (null != picByte) {
                        //传回图片
                        issue.setIssuePic(HexBinUtil.encode(picByte));
                    }
                }
                //查找解决方法及反馈意见
                IssueFixExample issueFixExample = new IssueFixExample();
                IssueFixExample.Criteria fixCriteria = issueFixExample.createCriteria();
                fixCriteria.andIssueIdEqualTo(issueId);
                List<IssueFix> issueFixList = issueFixService.selectByExample(issueFixExample);
                if (issueFixList.size() > 0) {
                    SimpleDateFormat ft =
                            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                    for (IssueFix fix : issueFixList) {
                        if ("1".equalsIgnoreCase(fix.getIssueFixType())) {
                            issue.setIssueFeedback(
                                    fix.getIssueFixContent()
                                            + "\n"
                                            + fix.getIssueFixUser()
                                            + ":"
                                            + ft.format(fix.getCreatedTime())
                            );
                        } else {
                            String originFix = issue.getIssueFix() == null ? "" : issue.getIssueFix()+ "\n";
                            issue.setIssueFix(
                                            originFix
                                            +
                                            fix.getIssueFixContent()
                                            + "\n"
                                            + fix.getIssueFixUser()
                                            + ":"
                                            + ft.format(fix.getCreatedTime())

                            );

                        }
                    }
                }

                list.clear();
                list.add(issue);
            }
        }
        return list;
    }

    @RequestMapping(value = "/issue", method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    Object fixIssue(@RequestBody IssueFix issueFix, HttpServletRequest request) {
        if (null != issueFix) {
            issueFix.setIssueFixId(IdUtil.nextId().toString());
            issueFix.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
            issueFix.setCreatedTime(new Timestamp(System.currentTimeMillis()));
            issueFix.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
            issueFix.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
            issueFixService.insertSelective(issueFix);
            if ("1".equalsIgnoreCase(issueFix.getIssueFixType())) {
                //报告人反馈意见
                Issue issue = issueService.selectByPrimaryKey(issueFix.getIssueId());
                //设置问题已解决
                issue.setIssueId(issueFix.getIssueId());
                issue.setIssueStatus("1");
                issueService.updateByPrimaryKeySelective(issue);
            } else {
                //解决办法
            }
            return issueFix;
        }
        return "20044";
    }

}
