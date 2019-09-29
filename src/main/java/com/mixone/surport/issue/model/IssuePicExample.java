package com.mixone.surport.issue.model;

import java.util.ArrayList;
import java.util.List;

public class IssuePicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public IssuePicExample() {
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

        public Criteria andIssuePicIdIsNull() {
            addCriterion("issue_pic_id is null");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdIsNotNull() {
            addCriterion("issue_pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdEqualTo(String value) {
            addCriterion("issue_pic_id =", value, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdNotEqualTo(String value) {
            addCriterion("issue_pic_id <>", value, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdGreaterThan(String value) {
            addCriterion("issue_pic_id >", value, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdGreaterThanOrEqualTo(String value) {
            addCriterion("issue_pic_id >=", value, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdLessThan(String value) {
            addCriterion("issue_pic_id <", value, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdLessThanOrEqualTo(String value) {
            addCriterion("issue_pic_id <=", value, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdLike(String value) {
            addCriterion("issue_pic_id like", value, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdNotLike(String value) {
            addCriterion("issue_pic_id not like", value, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdIn(List<String> values) {
            addCriterion("issue_pic_id in", values, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdNotIn(List<String> values) {
            addCriterion("issue_pic_id not in", values, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdBetween(String value1, String value2) {
            addCriterion("issue_pic_id between", value1, value2, "issuePicId");
            return (Criteria) this;
        }

        public Criteria andIssuePicIdNotBetween(String value1, String value2) {
            addCriterion("issue_pic_id not between", value1, value2, "issuePicId");
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

        public Criteria andIssuePicUrlIsNull() {
            addCriterion("issue_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlIsNotNull() {
            addCriterion("issue_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlEqualTo(String value) {
            addCriterion("issue_pic_url =", value, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlNotEqualTo(String value) {
            addCriterion("issue_pic_url <>", value, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlGreaterThan(String value) {
            addCriterion("issue_pic_url >", value, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("issue_pic_url >=", value, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlLessThan(String value) {
            addCriterion("issue_pic_url <", value, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlLessThanOrEqualTo(String value) {
            addCriterion("issue_pic_url <=", value, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlLike(String value) {
            addCriterion("issue_pic_url like", value, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlNotLike(String value) {
            addCriterion("issue_pic_url not like", value, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlIn(List<String> values) {
            addCriterion("issue_pic_url in", values, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlNotIn(List<String> values) {
            addCriterion("issue_pic_url not in", values, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlBetween(String value1, String value2) {
            addCriterion("issue_pic_url between", value1, value2, "issuePicUrl");
            return (Criteria) this;
        }

        public Criteria andIssuePicUrlNotBetween(String value1, String value2) {
            addCriterion("issue_pic_url not between", value1, value2, "issuePicUrl");
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