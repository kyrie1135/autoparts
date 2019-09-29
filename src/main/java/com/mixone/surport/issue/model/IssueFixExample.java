package com.mixone.surport.issue.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IssueFixExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public IssueFixExample() {
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

        public Criteria andIssueFixIdIsNull() {
            addCriterion("issue_fix_id is null");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdIsNotNull() {
            addCriterion("issue_fix_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdEqualTo(String value) {
            addCriterion("issue_fix_id =", value, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdNotEqualTo(String value) {
            addCriterion("issue_fix_id <>", value, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdGreaterThan(String value) {
            addCriterion("issue_fix_id >", value, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdGreaterThanOrEqualTo(String value) {
            addCriterion("issue_fix_id >=", value, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdLessThan(String value) {
            addCriterion("issue_fix_id <", value, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdLessThanOrEqualTo(String value) {
            addCriterion("issue_fix_id <=", value, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdLike(String value) {
            addCriterion("issue_fix_id like", value, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdNotLike(String value) {
            addCriterion("issue_fix_id not like", value, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdIn(List<String> values) {
            addCriterion("issue_fix_id in", values, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdNotIn(List<String> values) {
            addCriterion("issue_fix_id not in", values, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdBetween(String value1, String value2) {
            addCriterion("issue_fix_id between", value1, value2, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueFixIdNotBetween(String value1, String value2) {
            addCriterion("issue_fix_id not between", value1, value2, "issueFixId");
            return (Criteria) this;
        }

        public Criteria andIssueIdIsNull() {
            addCriterion("issue_id is null");
            return (Criteria) this;
        }

        public Criteria andIssueIdIsNotNull() {
            addCriterion("issue_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssueIdEqualTo(String value) {
            addCriterion("issue_id =", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotEqualTo(String value) {
            addCriterion("issue_id <>", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThan(String value) {
            addCriterion("issue_id >", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThanOrEqualTo(String value) {
            addCriterion("issue_id >=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThan(String value) {
            addCriterion("issue_id <", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThanOrEqualTo(String value) {
            addCriterion("issue_id <=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLike(String value) {
            addCriterion("issue_id like", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotLike(String value) {
            addCriterion("issue_id not like", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdIn(List<String> values) {
            addCriterion("issue_id in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotIn(List<String> values) {
            addCriterion("issue_id not in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdBetween(String value1, String value2) {
            addCriterion("issue_id between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotBetween(String value1, String value2) {
            addCriterion("issue_id not between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentIsNull() {
            addCriterion("issue_fix_content is null");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentIsNotNull() {
            addCriterion("issue_fix_content is not null");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentEqualTo(String value) {
            addCriterion("issue_fix_content =", value, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentNotEqualTo(String value) {
            addCriterion("issue_fix_content <>", value, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentGreaterThan(String value) {
            addCriterion("issue_fix_content >", value, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentGreaterThanOrEqualTo(String value) {
            addCriterion("issue_fix_content >=", value, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentLessThan(String value) {
            addCriterion("issue_fix_content <", value, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentLessThanOrEqualTo(String value) {
            addCriterion("issue_fix_content <=", value, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentLike(String value) {
            addCriterion("issue_fix_content like", value, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentNotLike(String value) {
            addCriterion("issue_fix_content not like", value, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentIn(List<String> values) {
            addCriterion("issue_fix_content in", values, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentNotIn(List<String> values) {
            addCriterion("issue_fix_content not in", values, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentBetween(String value1, String value2) {
            addCriterion("issue_fix_content between", value1, value2, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixContentNotBetween(String value1, String value2) {
            addCriterion("issue_fix_content not between", value1, value2, "issueFixContent");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeIsNull() {
            addCriterion("issue_fix_time is null");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeIsNotNull() {
            addCriterion("issue_fix_time is not null");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeEqualTo(Date value) {
            addCriterion("issue_fix_time =", value, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeNotEqualTo(Date value) {
            addCriterion("issue_fix_time <>", value, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeGreaterThan(Date value) {
            addCriterion("issue_fix_time >", value, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("issue_fix_time >=", value, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeLessThan(Date value) {
            addCriterion("issue_fix_time <", value, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeLessThanOrEqualTo(Date value) {
            addCriterion("issue_fix_time <=", value, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeIn(List<Date> values) {
            addCriterion("issue_fix_time in", values, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeNotIn(List<Date> values) {
            addCriterion("issue_fix_time not in", values, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeBetween(Date value1, Date value2) {
            addCriterion("issue_fix_time between", value1, value2, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixTimeNotBetween(Date value1, Date value2) {
            addCriterion("issue_fix_time not between", value1, value2, "issueFixTime");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdIsNull() {
            addCriterion("issue_fix_user_id is null");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdIsNotNull() {
            addCriterion("issue_fix_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdEqualTo(String value) {
            addCriterion("issue_fix_user_id =", value, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdNotEqualTo(String value) {
            addCriterion("issue_fix_user_id <>", value, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdGreaterThan(String value) {
            addCriterion("issue_fix_user_id >", value, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("issue_fix_user_id >=", value, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdLessThan(String value) {
            addCriterion("issue_fix_user_id <", value, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdLessThanOrEqualTo(String value) {
            addCriterion("issue_fix_user_id <=", value, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdLike(String value) {
            addCriterion("issue_fix_user_id like", value, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdNotLike(String value) {
            addCriterion("issue_fix_user_id not like", value, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdIn(List<String> values) {
            addCriterion("issue_fix_user_id in", values, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdNotIn(List<String> values) {
            addCriterion("issue_fix_user_id not in", values, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdBetween(String value1, String value2) {
            addCriterion("issue_fix_user_id between", value1, value2, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIdNotBetween(String value1, String value2) {
            addCriterion("issue_fix_user_id not between", value1, value2, "issueFixUserId");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIsNull() {
            addCriterion("issue_fix_user is null");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIsNotNull() {
            addCriterion("issue_fix_user is not null");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserEqualTo(String value) {
            addCriterion("issue_fix_user =", value, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserNotEqualTo(String value) {
            addCriterion("issue_fix_user <>", value, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserGreaterThan(String value) {
            addCriterion("issue_fix_user >", value, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserGreaterThanOrEqualTo(String value) {
            addCriterion("issue_fix_user >=", value, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserLessThan(String value) {
            addCriterion("issue_fix_user <", value, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserLessThanOrEqualTo(String value) {
            addCriterion("issue_fix_user <=", value, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserLike(String value) {
            addCriterion("issue_fix_user like", value, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserNotLike(String value) {
            addCriterion("issue_fix_user not like", value, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserIn(List<String> values) {
            addCriterion("issue_fix_user in", values, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserNotIn(List<String> values) {
            addCriterion("issue_fix_user not in", values, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserBetween(String value1, String value2) {
            addCriterion("issue_fix_user between", value1, value2, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixUserNotBetween(String value1, String value2) {
            addCriterion("issue_fix_user not between", value1, value2, "issueFixUser");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeIsNull() {
            addCriterion("issue_fix_type is null");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeIsNotNull() {
            addCriterion("issue_fix_type is not null");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeEqualTo(String value) {
            addCriterion("issue_fix_type =", value, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeNotEqualTo(String value) {
            addCriterion("issue_fix_type <>", value, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeGreaterThan(String value) {
            addCriterion("issue_fix_type >", value, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeGreaterThanOrEqualTo(String value) {
            addCriterion("issue_fix_type >=", value, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeLessThan(String value) {
            addCriterion("issue_fix_type <", value, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeLessThanOrEqualTo(String value) {
            addCriterion("issue_fix_type <=", value, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeLike(String value) {
            addCriterion("issue_fix_type like", value, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeNotLike(String value) {
            addCriterion("issue_fix_type not like", value, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeIn(List<String> values) {
            addCriterion("issue_fix_type in", values, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeNotIn(List<String> values) {
            addCriterion("issue_fix_type not in", values, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeBetween(String value1, String value2) {
            addCriterion("issue_fix_type between", value1, value2, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andIssueFixTypeNotBetween(String value1, String value2) {
            addCriterion("issue_fix_type not between", value1, value2, "issueFixType");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIsNull() {
            addCriterion("created_user_login is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIsNotNull() {
            addCriterion("created_user_login is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginEqualTo(String value) {
            addCriterion("created_user_login =", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginNotEqualTo(String value) {
            addCriterion("created_user_login <>", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginGreaterThan(String value) {
            addCriterion("created_user_login >", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("created_user_login >=", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginLessThan(String value) {
            addCriterion("created_user_login <", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginLessThanOrEqualTo(String value) {
            addCriterion("created_user_login <=", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginLike(String value) {
            addCriterion("created_user_login like", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginNotLike(String value) {
            addCriterion("created_user_login not like", value, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIn(List<String> values) {
            addCriterion("created_user_login in", values, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginNotIn(List<String> values) {
            addCriterion("created_user_login not in", values, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginBetween(String value1, String value2) {
            addCriterion("created_user_login between", value1, value2, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginNotBetween(String value1, String value2) {
            addCriterion("created_user_login not between", value1, value2, "createdUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIsNull() {
            addCriterion("last_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIsNotNull() {
            addCriterion("last_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeEqualTo(Date value) {
            addCriterion("last_updated_time =", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotEqualTo(Date value) {
            addCriterion("last_updated_time <>", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeGreaterThan(Date value) {
            addCriterion("last_updated_time >", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_updated_time >=", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeLessThan(Date value) {
            addCriterion("last_updated_time <", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_updated_time <=", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIn(List<Date> values) {
            addCriterion("last_updated_time in", values, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotIn(List<Date> values) {
            addCriterion("last_updated_time not in", values, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("last_updated_time between", value1, value2, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_updated_time not between", value1, value2, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIsNull() {
            addCriterion("last_updated_user_login is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIsNotNull() {
            addCriterion("last_updated_user_login is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginEqualTo(String value) {
            addCriterion("last_updated_user_login =", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginNotEqualTo(String value) {
            addCriterion("last_updated_user_login <>", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginGreaterThan(String value) {
            addCriterion("last_updated_user_login >", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("last_updated_user_login >=", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginLessThan(String value) {
            addCriterion("last_updated_user_login <", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginLessThanOrEqualTo(String value) {
            addCriterion("last_updated_user_login <=", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginLike(String value) {
            addCriterion("last_updated_user_login like", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginNotLike(String value) {
            addCriterion("last_updated_user_login not like", value, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIn(List<String> values) {
            addCriterion("last_updated_user_login in", values, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginNotIn(List<String> values) {
            addCriterion("last_updated_user_login not in", values, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginBetween(String value1, String value2) {
            addCriterion("last_updated_user_login between", value1, value2, "lastUpdatedUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginNotBetween(String value1, String value2) {
            addCriterion("last_updated_user_login not between", value1, value2, "lastUpdatedUserLogin");
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