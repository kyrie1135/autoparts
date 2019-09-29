package com.mixone.surport.issue.model;

import java.io.Serializable;
import java.util.Date;

/**
 * issue_fix
 * @author 
 */
public class IssueFix implements Serializable {
    private String issueFixId;

    private String issueId;

    private String issueFixContent;

    private Date issueFixTime;

    private String issueFixUserId;

    private String issueFixUser;

    private String issueFixType;

    private Date createdTime;

    private String createdUserLogin;

    private Date lastUpdatedTime;

    private String lastUpdatedUserLogin;

    private static final long serialVersionUID = 1L;

    public String getIssueFixId() {
        return issueFixId;
    }

    public void setIssueFixId(String issueFixId) {
        this.issueFixId = issueFixId;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueFixContent() {
        return issueFixContent;
    }

    public void setIssueFixContent(String issueFixContent) {
        this.issueFixContent = issueFixContent;
    }

    public Date getIssueFixTime() {
        return issueFixTime;
    }

    public void setIssueFixTime(Date issueFixTime) {
        this.issueFixTime = issueFixTime;
    }

    public String getIssueFixUserId() {
        return issueFixUserId;
    }

    public void setIssueFixUserId(String issueFixUserId) {
        this.issueFixUserId = issueFixUserId;
    }

    public String getIssueFixUser() {
        return issueFixUser;
    }

    public void setIssueFixUser(String issueFixUser) {
        this.issueFixUser = issueFixUser;
    }

    public String getIssueFixType() {
        return issueFixType;
    }

    public void setIssueFixType(String issueFixType) {
        this.issueFixType = issueFixType;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedUserLogin() {
        return createdUserLogin;
    }

    public void setCreatedUserLogin(String createdUserLogin) {
        this.createdUserLogin = createdUserLogin;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public String getLastUpdatedUserLogin() {
        return lastUpdatedUserLogin;
    }

    public void setLastUpdatedUserLogin(String lastUpdatedUserLogin) {
        this.lastUpdatedUserLogin = lastUpdatedUserLogin;
    }
}