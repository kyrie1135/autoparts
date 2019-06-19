package com.mixone.autoparts.autocar.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class AutoCar implements Serializable {
    private String autocarId;

    private String autocarNo;

    private String autocarType;

    private String autocarOwner;

    private Integer isDel;

    private Date createdTime;

    private String createdUserLogin;

    private Date lastUpdatedTime;

    private String lastUpdatedUserLogin;

    private static final long serialVersionUID = 1L;

    public String getAutocarId() {
        return autocarId;
    }

    public void setAutocarId(String autocarId) {
        this.autocarId = autocarId;
    }

    public String getAutocarNo() {
        return autocarNo;
    }

    public void setAutocarNo(String autocarNo) {
        this.autocarNo = autocarNo;
    }

    public String getAutocarType() {
        return autocarType;
    }

    public void setAutocarType(String autocarType) {
        this.autocarType = autocarType;
    }

    public String getAutocarOwner() {
        return autocarOwner;
    }

    public void setAutocarOwner(String autocarOwner) {
        this.autocarOwner = autocarOwner;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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