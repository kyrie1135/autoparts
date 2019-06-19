package com.mixone.portal.admin.org.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserLoginExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPartyIdIsNull() {
            addCriterion("PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartyIdIsNotNull() {
            addCriterion("PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartyIdEqualTo(String value) {
            addCriterion("PARTY_ID =", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotEqualTo(String value) {
            addCriterion("PARTY_ID <>", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdGreaterThan(String value) {
            addCriterion("PARTY_ID >", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTY_ID >=", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdLessThan(String value) {
            addCriterion("PARTY_ID <", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdLessThanOrEqualTo(String value) {
            addCriterion("PARTY_ID <=", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdLike(String value) {
            addCriterion("PARTY_ID like", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotLike(String value) {
            addCriterion("PARTY_ID not like", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdIn(List<String> values) {
            addCriterion("PARTY_ID in", values, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotIn(List<String> values) {
            addCriterion("PARTY_ID not in", values, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdBetween(String value1, String value2) {
            addCriterion("PARTY_ID between", value1, value2, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotBetween(String value1, String value2) {
            addCriterion("PARTY_ID not between", value1, value2, "partyId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdIsNull() {
            addCriterion("USER_LOGIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdIsNotNull() {
            addCriterion("USER_LOGIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdEqualTo(String value) {
            addCriterion("USER_LOGIN_ID =", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotEqualTo(String value) {
            addCriterion("USER_LOGIN_ID <>", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdGreaterThan(String value) {
            addCriterion("USER_LOGIN_ID >", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_ID >=", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLessThan(String value) {
            addCriterion("USER_LOGIN_ID <", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLessThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_ID <=", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLike(String value) {
            addCriterion("USER_LOGIN_ID like", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotLike(String value) {
            addCriterion("USER_LOGIN_ID not like", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdIn(List<String> values) {
            addCriterion("USER_LOGIN_ID in", values, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotIn(List<String> values) {
            addCriterion("USER_LOGIN_ID not in", values, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_ID between", value1, value2, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_ID not between", value1, value2, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordIsNull() {
            addCriterion("CURRENT_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordIsNotNull() {
            addCriterion("CURRENT_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordEqualTo(String value) {
            addCriterion("CURRENT_PASSWORD =", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordNotEqualTo(String value) {
            addCriterion("CURRENT_PASSWORD <>", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordGreaterThan(String value) {
            addCriterion("CURRENT_PASSWORD >", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_PASSWORD >=", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordLessThan(String value) {
            addCriterion("CURRENT_PASSWORD <", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_PASSWORD <=", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordLike(String value) {
            addCriterion("CURRENT_PASSWORD like", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordNotLike(String value) {
            addCriterion("CURRENT_PASSWORD not like", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordIn(List<String> values) {
            addCriterion("CURRENT_PASSWORD in", values, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordNotIn(List<String> values) {
            addCriterion("CURRENT_PASSWORD not in", values, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordBetween(String value1, String value2) {
            addCriterion("CURRENT_PASSWORD between", value1, value2, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordNotBetween(String value1, String value2) {
            addCriterion("CURRENT_PASSWORD not between", value1, value2, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andPasswordHintIsNull() {
            addCriterion("PASSWORD_HINT is null");
            return (Criteria) this;
        }

        public Criteria andPasswordHintIsNotNull() {
            addCriterion("PASSWORD_HINT is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordHintEqualTo(Integer value) {
            addCriterion("PASSWORD_HINT =", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintNotEqualTo(Integer value) {
            addCriterion("PASSWORD_HINT <>", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintGreaterThan(Integer value) {
            addCriterion("PASSWORD_HINT >", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintGreaterThanOrEqualTo(Integer value) {
            addCriterion("PASSWORD_HINT >=", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintLessThan(Integer value) {
            addCriterion("PASSWORD_HINT <", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintLessThanOrEqualTo(Integer value) {
            addCriterion("PASSWORD_HINT <=", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintIn(List<Integer> values) {
            addCriterion("PASSWORD_HINT in", values, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintNotIn(List<Integer> values) {
            addCriterion("PASSWORD_HINT not in", values, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintBetween(Integer value1, Integer value2) {
            addCriterion("PASSWORD_HINT between", value1, value2, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintNotBetween(Integer value1, Integer value2) {
            addCriterion("PASSWORD_HINT not between", value1, value2, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("LAST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("LAST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("LAST_NAME =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("LAST_NAME <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("LAST_NAME >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_NAME >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("LAST_NAME <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("LAST_NAME <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("LAST_NAME like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("LAST_NAME not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("LAST_NAME in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("LAST_NAME not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("LAST_NAME between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("LAST_NAME not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("FIRST_NAME =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("FIRST_NAME <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("FIRST_NAME >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("FIRST_NAME <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("FIRST_NAME like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("FIRST_NAME not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("FIRST_NAME in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("FIRST_NAME not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("FIRST_NAME between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeIsNull() {
            addCriterion("MOBILE_COUNTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeIsNotNull() {
            addCriterion("MOBILE_COUNTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeEqualTo(String value) {
            addCriterion("MOBILE_COUNTRY_CODE =", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeNotEqualTo(String value) {
            addCriterion("MOBILE_COUNTRY_CODE <>", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeGreaterThan(String value) {
            addCriterion("MOBILE_COUNTRY_CODE >", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_COUNTRY_CODE >=", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeLessThan(String value) {
            addCriterion("MOBILE_COUNTRY_CODE <", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_COUNTRY_CODE <=", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeLike(String value) {
            addCriterion("MOBILE_COUNTRY_CODE like", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeNotLike(String value) {
            addCriterion("MOBILE_COUNTRY_CODE not like", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeIn(List<String> values) {
            addCriterion("MOBILE_COUNTRY_CODE in", values, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeNotIn(List<String> values) {
            addCriterion("MOBILE_COUNTRY_CODE not in", values, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeBetween(String value1, String value2) {
            addCriterion("MOBILE_COUNTRY_CODE between", value1, value2, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeNotBetween(String value1, String value2) {
            addCriterion("MOBILE_COUNTRY_CODE not between", value1, value2, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andIsSystemIsNull() {
            addCriterion("IS_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andIsSystemIsNotNull() {
            addCriterion("IS_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andIsSystemEqualTo(String value) {
            addCriterion("IS_SYSTEM =", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemNotEqualTo(String value) {
            addCriterion("IS_SYSTEM <>", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemGreaterThan(String value) {
            addCriterion("IS_SYSTEM >", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SYSTEM >=", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemLessThan(String value) {
            addCriterion("IS_SYSTEM <", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemLessThanOrEqualTo(String value) {
            addCriterion("IS_SYSTEM <=", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemLike(String value) {
            addCriterion("IS_SYSTEM like", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemNotLike(String value) {
            addCriterion("IS_SYSTEM not like", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemIn(List<String> values) {
            addCriterion("IS_SYSTEM in", values, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemNotIn(List<String> values) {
            addCriterion("IS_SYSTEM not in", values, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemBetween(String value1, String value2) {
            addCriterion("IS_SYSTEM between", value1, value2, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemNotBetween(String value1, String value2) {
            addCriterion("IS_SYSTEM not between", value1, value2, "isSystem");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutIsNull() {
            addCriterion("HAS_LOGGED_OUT is null");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutIsNotNull() {
            addCriterion("HAS_LOGGED_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutEqualTo(String value) {
            addCriterion("HAS_LOGGED_OUT =", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutNotEqualTo(String value) {
            addCriterion("HAS_LOGGED_OUT <>", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutGreaterThan(String value) {
            addCriterion("HAS_LOGGED_OUT >", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_LOGGED_OUT >=", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutLessThan(String value) {
            addCriterion("HAS_LOGGED_OUT <", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutLessThanOrEqualTo(String value) {
            addCriterion("HAS_LOGGED_OUT <=", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutLike(String value) {
            addCriterion("HAS_LOGGED_OUT like", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutNotLike(String value) {
            addCriterion("HAS_LOGGED_OUT not like", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutIn(List<String> values) {
            addCriterion("HAS_LOGGED_OUT in", values, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutNotIn(List<String> values) {
            addCriterion("HAS_LOGGED_OUT not in", values, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutBetween(String value1, String value2) {
            addCriterion("HAS_LOGGED_OUT between", value1, value2, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutNotBetween(String value1, String value2) {
            addCriterion("HAS_LOGGED_OUT not between", value1, value2, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeIsNull() {
            addCriterion("REQUIRE_PASSWORD_CHANGE is null");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeIsNotNull() {
            addCriterion("REQUIRE_PASSWORD_CHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeEqualTo(String value) {
            addCriterion("REQUIRE_PASSWORD_CHANGE =", value, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeNotEqualTo(String value) {
            addCriterion("REQUIRE_PASSWORD_CHANGE <>", value, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeGreaterThan(String value) {
            addCriterion("REQUIRE_PASSWORD_CHANGE >", value, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_PASSWORD_CHANGE >=", value, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeLessThan(String value) {
            addCriterion("REQUIRE_PASSWORD_CHANGE <", value, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_PASSWORD_CHANGE <=", value, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeLike(String value) {
            addCriterion("REQUIRE_PASSWORD_CHANGE like", value, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeNotLike(String value) {
            addCriterion("REQUIRE_PASSWORD_CHANGE not like", value, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeIn(List<String> values) {
            addCriterion("REQUIRE_PASSWORD_CHANGE in", values, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeNotIn(List<String> values) {
            addCriterion("REQUIRE_PASSWORD_CHANGE not in", values, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeBetween(String value1, String value2) {
            addCriterion("REQUIRE_PASSWORD_CHANGE between", value1, value2, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andRequirePasswordChangeNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_PASSWORD_CHANGE not between", value1, value2, "requirePasswordChange");
            return (Criteria) this;
        }

        public Criteria andLastLocaleIsNull() {
            addCriterion("LAST_LOCALE is null");
            return (Criteria) this;
        }

        public Criteria andLastLocaleIsNotNull() {
            addCriterion("LAST_LOCALE is not null");
            return (Criteria) this;
        }

        public Criteria andLastLocaleEqualTo(String value) {
            addCriterion("LAST_LOCALE =", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleNotEqualTo(String value) {
            addCriterion("LAST_LOCALE <>", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleGreaterThan(String value) {
            addCriterion("LAST_LOCALE >", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LOCALE >=", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleLessThan(String value) {
            addCriterion("LAST_LOCALE <", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleLessThanOrEqualTo(String value) {
            addCriterion("LAST_LOCALE <=", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleLike(String value) {
            addCriterion("LAST_LOCALE like", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleNotLike(String value) {
            addCriterion("LAST_LOCALE not like", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleIn(List<String> values) {
            addCriterion("LAST_LOCALE in", values, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleNotIn(List<String> values) {
            addCriterion("LAST_LOCALE not in", values, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleBetween(String value1, String value2) {
            addCriterion("LAST_LOCALE between", value1, value2, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleNotBetween(String value1, String value2) {
            addCriterion("LAST_LOCALE not between", value1, value2, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneIsNull() {
            addCriterion("LAST_TIME_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneIsNotNull() {
            addCriterion("LAST_TIME_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneEqualTo(String value) {
            addCriterion("LAST_TIME_ZONE =", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneNotEqualTo(String value) {
            addCriterion("LAST_TIME_ZONE <>", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneGreaterThan(String value) {
            addCriterion("LAST_TIME_ZONE >", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_TIME_ZONE >=", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneLessThan(String value) {
            addCriterion("LAST_TIME_ZONE <", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneLessThanOrEqualTo(String value) {
            addCriterion("LAST_TIME_ZONE <=", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneLike(String value) {
            addCriterion("LAST_TIME_ZONE like", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneNotLike(String value) {
            addCriterion("LAST_TIME_ZONE not like", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneIn(List<String> values) {
            addCriterion("LAST_TIME_ZONE in", values, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneNotIn(List<String> values) {
            addCriterion("LAST_TIME_ZONE not in", values, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneBetween(String value1, String value2) {
            addCriterion("LAST_TIME_ZONE between", value1, value2, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneNotBetween(String value1, String value2) {
            addCriterion("LAST_TIME_ZONE not between", value1, value2, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeIsNull() {
            addCriterion("DISABLED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeIsNotNull() {
            addCriterion("DISABLED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeEqualTo(Date value) {
            addCriterion("DISABLED_TIME =", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeNotEqualTo(Date value) {
            addCriterion("DISABLED_TIME <>", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeGreaterThan(Date value) {
            addCriterion("DISABLED_TIME >", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DISABLED_TIME >=", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeLessThan(Date value) {
            addCriterion("DISABLED_TIME <", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeLessThanOrEqualTo(Date value) {
            addCriterion("DISABLED_TIME <=", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeIn(List<Date> values) {
            addCriterion("DISABLED_TIME in", values, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeNotIn(List<Date> values) {
            addCriterion("DISABLED_TIME not in", values, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeBetween(Date value1, Date value2) {
            addCriterion("DISABLED_TIME between", value1, value2, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeNotBetween(Date value1, Date value2) {
            addCriterion("DISABLED_TIME not between", value1, value2, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledByIsNull() {
            addCriterion("DISABLED_BY is null");
            return (Criteria) this;
        }

        public Criteria andDisabledByIsNotNull() {
            addCriterion("DISABLED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledByEqualTo(String value) {
            addCriterion("DISABLED_BY =", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotEqualTo(String value) {
            addCriterion("DISABLED_BY <>", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByGreaterThan(String value) {
            addCriterion("DISABLED_BY >", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByGreaterThanOrEqualTo(String value) {
            addCriterion("DISABLED_BY >=", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByLessThan(String value) {
            addCriterion("DISABLED_BY <", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByLessThanOrEqualTo(String value) {
            addCriterion("DISABLED_BY <=", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByLike(String value) {
            addCriterion("DISABLED_BY like", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotLike(String value) {
            addCriterion("DISABLED_BY not like", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByIn(List<String> values) {
            addCriterion("DISABLED_BY in", values, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotIn(List<String> values) {
            addCriterion("DISABLED_BY not in", values, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByBetween(String value1, String value2) {
            addCriterion("DISABLED_BY between", value1, value2, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotBetween(String value1, String value2) {
            addCriterion("DISABLED_BY not between", value1, value2, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsIsNull() {
            addCriterion("SUCCESSIVE_FAILED_LOGINS is null");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsIsNotNull() {
            addCriterion("SUCCESSIVE_FAILED_LOGINS is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsEqualTo(Integer value) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS =", value, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsNotEqualTo(Integer value) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS <>", value, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsGreaterThan(Integer value) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS >", value, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS >=", value, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsLessThan(Integer value) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS <", value, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsLessThanOrEqualTo(Integer value) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS <=", value, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsIn(List<Integer> values) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS in", values, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsNotIn(List<Integer> values) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS not in", values, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsBetween(Integer value1, Integer value2) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS between", value1, value2, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andSuccessiveFailedLoginsNotBetween(Integer value1, Integer value2) {
            addCriterion("SUCCESSIVE_FAILED_LOGINS not between", value1, value2, "successiveFailedLogins");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNull() {
            addCriterion("CURRENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("CURRENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(String value) {
            addCriterion("CURRENT_STATUS =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(String value) {
            addCriterion("CURRENT_STATUS <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(String value) {
            addCriterion("CURRENT_STATUS >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_STATUS >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(String value) {
            addCriterion("CURRENT_STATUS <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_STATUS <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLike(String value) {
            addCriterion("CURRENT_STATUS like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotLike(String value) {
            addCriterion("CURRENT_STATUS not like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<String> values) {
            addCriterion("CURRENT_STATUS in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<String> values) {
            addCriterion("CURRENT_STATUS not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(String value1, String value2) {
            addCriterion("CURRENT_STATUS between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(String value1, String value2) {
            addCriterion("CURRENT_STATUS not between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIsNull() {
            addCriterion("CREATED_USER_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIsNotNull() {
            addCriterion("CREATED_USER_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginEqualTo(String value) {
            addCriterion("CREATED_USER_LOGIN =", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginNotEqualTo(String value) {
            addCriterion("CREATED_USER_LOGIN <>", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginGreaterThan(String value) {
            addCriterion("CREATED_USER_LOGIN >", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER_LOGIN >=", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginLessThan(String value) {
            addCriterion("CREATED_USER_LOGIN <", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER_LOGIN <=", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginLike(String value) {
            addCriterion("CREATED_USER_LOGIN like", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginNotLike(String value) {
            addCriterion("CREATED_USER_LOGIN not like", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIn(List<String> values) {
            addCriterion("CREATED_USER_LOGIN in", values, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginNotIn(List<String> values) {
            addCriterion("CREATED_USER_LOGIN not in", values, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginBetween(String value1, String value2) {
            addCriterion("CREATED_USER_LOGIN between", value1, value2, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER_LOGIN not between", value1, value2, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIsNull() {
            addCriterion("LAST_UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIsNotNull() {
            addCriterion("LAST_UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TIME =", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TIME <>", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_TIME >", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TIME >=", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeLessThan(Date value) {
            addCriterion("LAST_UPDATED_TIME <", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TIME <=", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TIME in", values, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TIME not in", values, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TIME between", value1, value2, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TIME not between", value1, value2, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIsNull() {
            addCriterion("LAST_UPDATED_USER_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIsNotNull() {
            addCriterion("LAST_UPDATED_USER_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginEqualTo(String value) {
            addCriterion("LAST_UPDATED_USER_LOGIN =", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginNotEqualTo(String value) {
            addCriterion("LAST_UPDATED_USER_LOGIN <>", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginGreaterThan(String value) {
            addCriterion("LAST_UPDATED_USER_LOGIN >", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATED_USER_LOGIN >=", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginLessThan(String value) {
            addCriterion("LAST_UPDATED_USER_LOGIN <", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATED_USER_LOGIN <=", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginLike(String value) {
            addCriterion("LAST_UPDATED_USER_LOGIN like", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginNotLike(String value) {
            addCriterion("LAST_UPDATED_USER_LOGIN not like", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIn(List<String> values) {
            addCriterion("LAST_UPDATED_USER_LOGIN in", values, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginNotIn(List<String> values) {
            addCriterion("LAST_UPDATED_USER_LOGIN not in", values, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginBetween(String value1, String value2) {
            addCriterion("LAST_UPDATED_USER_LOGIN between", value1, value2, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATED_USER_LOGIN not between", value1, value2, "lastUpdatedUserLogin");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}