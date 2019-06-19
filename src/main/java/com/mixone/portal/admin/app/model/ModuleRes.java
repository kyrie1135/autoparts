package com.mixone.portal.admin.app.model;

import java.io.Serializable;
import java.util.Date;

/**
 * MO_MODULE_RES
 * @author 
 */
public class ModuleRes implements Serializable {
    private String resourceId;

    private String appId;

    private String appName;

    private String moduleId;

    private String moduleName;

    private String resourceName;

    private String resourceCode;

    /**
     * 菜单menu
            操作operator -- create等
     */
    private String resourceType;

    private String resourceIconUrl;

    private String resourceUrl;

    /**
     * 是否需要权限：0-否；1-是
     */
    private String needRight;

    private Integer orderIndex;

    private Long resourceParentId;

    /**
     * 0-正常；1-禁用
     */
    private String currentStatus;

    private Date createdTime;

    private String createdUserLogin;

    private Date lastUpdatedTime;

    private String lastUpdatedUserLogin;

    private static final long serialVersionUID = 1L;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

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

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceIconUrl() {
        return resourceIconUrl;
    }

    public void setResourceIconUrl(String resourceIconUrl) {
        this.resourceIconUrl = resourceIconUrl;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getNeedRight() {
        return needRight;
    }

    public void setNeedRight(String needRight) {
        this.needRight = needRight;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public Long getResourceParentId() {
        return resourceParentId;
    }

    public void setResourceParentId(Long resourceParentId) {
        this.resourceParentId = resourceParentId;
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