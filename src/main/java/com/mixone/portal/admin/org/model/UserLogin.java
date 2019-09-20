package com.mixone.portal.admin.org.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;

/**
 * MO_USER_LOGIN
 * @author 
 */
public class UserLogin implements Serializable {



    //权限控制列表
    private HashSet rightSet;

    private HashSet notNeedRightSet;

    //
    private String orgId;



    private String partyId;

    private String userLoginId;

    private String currentPassword;

    private Integer passwordHint;

    private String userName;

    private String lastName;

    private String firstName;

    private String email;

    private String mobile;

    private String mobileCountryCode;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public HashSet getRightSet() {
        return rightSet;
    }

    public void setRightSet(HashSet rightSet) {
        this.rightSet = rightSet;
    }

    public HashSet getNotNeedRightSet() {
        return notNeedRightSet;
    }

    public void setNotNeedRightSet(HashSet notNeedRightSet) {
        this.notNeedRightSet = notNeedRightSet;
    }

    /**
     * IS_SYSTEM：0-否；1-是
     */
    private String isSystem;

    /**
     * HAS_LOGGED_OUT：0-否；1-是
     */
    private String hasLoggedOut;

    /**
     * REQUIRE_PASSWORD_CHANGE：0-不需要；1-需要
     */
    private String requirePasswordChange;

    private String lastLocale;

    private String lastTimeZone;

    private Date disabledTime;

    /**
     * DISABLED_BY：（User_Login_ID或PARTY_ID）
     */
    private String disabledBy;

    private Integer successiveFailedLogins;

    /**
     * 0-正常；1-禁用
     */
    private String currentStatus;

    private Date createdTime;

    private String createdUserLogin;

    private Date lastUpdatedTime;

    private String lastUpdatedUserLogin;

//    private static final long serialVersionUID = 1L;

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public Integer getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(Integer passwordHint) {
        this.passwordHint = passwordHint;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public String getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }

    public String getHasLoggedOut() {
        return hasLoggedOut;
    }

    public void setHasLoggedOut(String hasLoggedOut) {
        this.hasLoggedOut = hasLoggedOut;
    }

    public String getRequirePasswordChange() {
        return requirePasswordChange;
    }

    public void setRequirePasswordChange(String requirePasswordChange) {
        this.requirePasswordChange = requirePasswordChange;
    }

    public String getLastLocale() {
        return lastLocale;
    }

    public void setLastLocale(String lastLocale) {
        this.lastLocale = lastLocale;
    }

    public String getLastTimeZone() {
        return lastTimeZone;
    }

    public void setLastTimeZone(String lastTimeZone) {
        this.lastTimeZone = lastTimeZone;
    }

    public Date getDisabledTime() {
        return disabledTime;
    }

    public void setDisabledTime(Date disabledTime) {
        this.disabledTime = disabledTime;
    }

    public String getDisabledBy() {
        return disabledBy;
    }

    public void setDisabledBy(String disabledBy) {
        this.disabledBy = disabledBy;
    }

    public Integer getSuccessiveFailedLogins() {
        return successiveFailedLogins;
    }

    public void setSuccessiveFailedLogins(Integer successiveFailedLogins) {
        this.successiveFailedLogins = successiveFailedLogins;
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