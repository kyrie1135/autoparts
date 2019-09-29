package com.mixone.surport.issue.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IssueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public IssueExample() {
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

        public Criteria andIssueTitleIsNull() {
            addCriterion("issue_title is null");
            return (Criteria) this;
        }

        public Criteria andIssueTitleIsNotNull() {
            addCriterion("issue_title is not null");
            return (Criteria) this;
        }

        public Criteria andIssueTitleEqualTo(String value) {
            addCriterion("issue_title =", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleNotEqualTo(String value) {
            addCriterion("issue_title <>", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleGreaterThan(String value) {
            addCriterion("issue_title >", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleGreaterThanOrEqualTo(String value) {
            addCriterion("issue_title >=", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleLessThan(String value) {
            addCriterion("issue_title <", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleLessThanOrEqualTo(String value) {
            addCriterion("issue_title <=", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleLike(String value) {
            addCriterion("issue_title like", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleNotLike(String value) {
            addCriterion("issue_title not like", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleIn(List<String> values) {
            addCriterion("issue_title in", values, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleNotIn(List<String> values) {
            addCriterion("issue_title not in", values, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleBetween(String value1, String value2) {
            addCriterion("issue_title between", value1, value2, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleNotBetween(String value1, String value2) {
            addCriterion("issue_title not between", value1, value2, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueContentIsNull() {
            addCriterion("issue_content is null");
            return (Criteria) this;
        }

        public Criteria andIssueContentIsNotNull() {
            addCriterion("issue_content is not null");
            return (Criteria) this;
        }

        public Criteria andIssueContentEqualTo(String value) {
            addCriterion("issue_content =", value, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentNotEqualTo(String value) {
            addCriterion("issue_content <>", value, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentGreaterThan(String value) {
            addCriterion("issue_content >", value, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentGreaterThanOrEqualTo(String value) {
            addCriterion("issue_content >=", value, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentLessThan(String value) {
            addCriterion("issue_content <", value, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentLessThanOrEqualTo(String value) {
            addCriterion("issue_content <=", value, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentLike(String value) {
            addCriterion("issue_content like", value, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentNotLike(String value) {
            addCriterion("issue_content not like", value, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentIn(List<String> values) {
            addCriterion("issue_content in", values, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentNotIn(List<String> values) {
            addCriterion("issue_content not in", values, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentBetween(String value1, String value2) {
            addCriterion("issue_content between", value1, value2, "issueContent");
            return (Criteria) this;
        }

        public Criteria andIssueContentNotBetween(String value1, String value2) {
            addCriterion("issue_content not between", value1, value2, "issueContent");
            return (Criteria) this;
        }

        public Criteria andReporterIsNull() {
            addCriterion("reporter is null");
            return (Criteria) this;
        }

        public Criteria andReporterIsNotNull() {
            addCriterion("reporter is not null");
            return (Criteria) this;
        }

        public Criteria andReporterEqualTo(String value) {
            addCriterion("reporter =", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotEqualTo(String value) {
            addCriterion("reporter <>", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThan(String value) {
            addCriterion("reporter >", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThanOrEqualTo(String value) {
            addCriterion("reporter >=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThan(String value) {
            addCriterion("reporter <", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThanOrEqualTo(String value) {
            addCriterion("reporter <=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLike(String value) {
            addCriterion("reporter like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotLike(String value) {
            addCriterion("reporter not like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIn(List<String> values) {
            addCriterion("reporter in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotIn(List<String> values) {
            addCriterion("reporter not in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterBetween(String value1, String value2) {
            addCriterion("reporter between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotBetween(String value1, String value2) {
            addCriterion("reporter not between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIdIsNull() {
            addCriterion("reporter_id is null");
            return (Criteria) this;
        }

        public Criteria andReporterIdIsNotNull() {
            addCriterion("reporter_id is not null");
            return (Criteria) this;
        }

        public Criteria andReporterIdEqualTo(String value) {
            addCriterion("reporter_id =", value, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdNotEqualTo(String value) {
            addCriterion("reporter_id <>", value, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdGreaterThan(String value) {
            addCriterion("reporter_id >", value, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdGreaterThanOrEqualTo(String value) {
            addCriterion("reporter_id >=", value, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdLessThan(String value) {
            addCriterion("reporter_id <", value, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdLessThanOrEqualTo(String value) {
            addCriterion("reporter_id <=", value, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdLike(String value) {
            addCriterion("reporter_id like", value, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdNotLike(String value) {
            addCriterion("reporter_id not like", value, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdIn(List<String> values) {
            addCriterion("reporter_id in", values, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdNotIn(List<String> values) {
            addCriterion("reporter_id not in", values, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdBetween(String value1, String value2) {
            addCriterion("reporter_id between", value1, value2, "reporterId");
            return (Criteria) this;
        }

        public Criteria andReporterIdNotBetween(String value1, String value2) {
            addCriterion("reporter_id not between", value1, value2, "reporterId");
            return (Criteria) this;
        }

        public Criteria andIssueTypeIsNull() {
            addCriterion("issue_type is null");
            return (Criteria) this;
        }

        public Criteria andIssueTypeIsNotNull() {
            addCriterion("issue_type is not null");
            return (Criteria) this;
        }

        public Criteria andIssueTypeEqualTo(String value) {
            addCriterion("issue_type =", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeNotEqualTo(String value) {
            addCriterion("issue_type <>", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeGreaterThan(String value) {
            addCriterion("issue_type >", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("issue_type >=", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeLessThan(String value) {
            addCriterion("issue_type <", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeLessThanOrEqualTo(String value) {
            addCriterion("issue_type <=", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeLike(String value) {
            addCriterion("issue_type like", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeNotLike(String value) {
            addCriterion("issue_type not like", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeIn(List<String> values) {
            addCriterion("issue_type in", values, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeNotIn(List<String> values) {
            addCriterion("issue_type not in", values, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeBetween(String value1, String value2) {
            addCriterion("issue_type between", value1, value2, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeNotBetween(String value1, String value2) {
            addCriterion("issue_type not between", value1, value2, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueStatusIsNull() {
            addCriterion("issue_status is null");
            return (Criteria) this;
        }

        public Criteria andIssueStatusIsNotNull() {
            addCriterion("issue_status is not null");
            return (Criteria) this;
        }

        public Criteria andIssueStatusEqualTo(String value) {
            addCriterion("issue_status =", value, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusNotEqualTo(String value) {
            addCriterion("issue_status <>", value, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusGreaterThan(String value) {
            addCriterion("issue_status >", value, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusGreaterThanOrEqualTo(String value) {
            addCriterion("issue_status >=", value, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusLessThan(String value) {
            addCriterion("issue_status <", value, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusLessThanOrEqualTo(String value) {
            addCriterion("issue_status <=", value, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusLike(String value) {
            addCriterion("issue_status like", value, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusNotLike(String value) {
            addCriterion("issue_status not like", value, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusIn(List<String> values) {
            addCriterion("issue_status in", values, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusNotIn(List<String> values) {
            addCriterion("issue_status not in", values, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusBetween(String value1, String value2) {
            addCriterion("issue_status between", value1, value2, "issueStatus");
            return (Criteria) this;
        }

        public Criteria andIssueStatusNotBetween(String value1, String value2) {
            addCriterion("issue_status not between", value1, value2, "issueStatus");
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