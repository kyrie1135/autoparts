package com.mixone.portal.admin.org.model;

import java.io.Serializable;
import java.util.Date;

/**
 * MO_PERSON
 * @author 
 */
public class Person implements Serializable {
    private String personId;

    private String partyId;

    private String fullName;

    /**
     * SALUTATION：0-先生；1-女士；2-小姐；4-太太；8-...
     */
    private String salutation;

    private String lastName;

    private String firstName;

    private String midName;

    private String nickname;

    /**
     * GENDER：0-男；1-女；2-...；4-...
     */
    private String gender;

    /**
     * PERSONAL_TITLE-头衔、职务、职称
     */
    private String personalTitle;

    private Date birthDate;

    private Long height;

    private Long weight;

    /**
     * MARITAL_STATUS：0-未婚；1-已婚；2-...；4-...
     */
    private String maritalStatus;

    private String occupation;

    private String comments;

    /**
     * 0-身份证、1-护照、2-- 、4-- 
     */
    private String cardType;

    private String cardId;

    /**
     * 0-正常；1-删除
     */
    private String currentStatus;

    private Integer orderIndex;

    private Date createdTime;

    private String createdUserLogin;

    private Date lastUpdatedTime;

    private String lastUpdatedUserLogin;

    private static final long serialVersionUID = 1L;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
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

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPersonalTitle() {
        return personalTitle;
    }

    public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
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