package com.mixone.portal.admin.app.model;

import java.io.Serializable;
import java.util.Date;

/**
 * MO_APPLICATION
 * @author 
 */
public class Application implements Serializable {
    private String appId;

    private String appName;

    private String appCode;

    private String appIconUrl;

    private String appUrl;

    private String appDeveloper;

    /**
     * 是否管理模块：0-否；1-是
     */
    private String isAdmin;

    private Integer orderIndex;

    /**
     * 0-正常；1-禁用
     */
    private String currentStatus;

    private Date createdTime;

    private String createdUserLogin;

    private Date lastUpdatedTime;

    private String lastUpdatedUserLogin;

    private static final long serialVersionUID = 1L;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAppIconUrl() {
        return appIconUrl;
    }

    public void setAppIconUrl(String appIconUrl) {
        this.appIconUrl = appIconUrl;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getAppDeveloper() {
        return appDeveloper;
    }

    public void setAppDeveloper(String appDeveloper) {
        this.appDeveloper = appDeveloper;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
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