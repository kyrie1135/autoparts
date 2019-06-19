package com.mixone.autoparts.autopart.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class AutoPart implements Serializable {
    private String autopartId;

    private String autocarNo;

    private String autopartName;

    private Double autopartPrice;

    private Integer autopartQuantity;

    private Double autopartTotal;

    private String purchaser;

    private Date purchaseTime;

    private Integer isDel;

    private Date createdTime;

    private String createdUserLogin;

    private Date lastUpdatedTime;

    private String lastUpdatedUserLogin;

    private static final long serialVersionUID = 1L;

    public String getAutopartId() {
        return autopartId;
    }

    public void setAutopartId(String autopartId) {
        this.autopartId = autopartId;
    }

    public String getAutocarNo() {
        return autocarNo;
    }

    public void setAutocarNo(String autocarNo) {
        this.autocarNo = autocarNo;
    }

    public String getAutopartName() {
        return autopartName;
    }

    public void setAutopartName(String autopartName) {
        this.autopartName = autopartName;
    }

    public Double getAutopartPrice() {
        return autopartPrice;
    }

    public void setAutopartPrice(Double autopartPrice) {
        this.autopartPrice = autopartPrice;
    }

    public Integer getAutopartQuantity() {
        return autopartQuantity;
    }

    public void setAutopartQuantity(Integer autopartQuantity) {
        this.autopartQuantity = autopartQuantity;
    }

    public Double getAutopartTotal() {
        return autopartTotal;
    }

    public void setAutopartTotal(Double autopartTotal) {
        this.autopartTotal = autopartTotal;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
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