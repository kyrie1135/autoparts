package com.mixone.autoparts.autocar.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AutoCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AutoCarExample() {
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
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

        public Criteria andAutocarIdIsNull() {
            addCriterion("autocar_id is null");
            return (Criteria) this;
        }

        public Criteria andAutocarIdIsNotNull() {
            addCriterion("autocar_id is not null");
            return (Criteria) this;
        }

        public Criteria andAutocarIdEqualTo(String value) {
            addCriterion("autocar_id =", value, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdNotEqualTo(String value) {
            addCriterion("autocar_id <>", value, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdGreaterThan(String value) {
            addCriterion("autocar_id >", value, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdGreaterThanOrEqualTo(String value) {
            addCriterion("autocar_id >=", value, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdLessThan(String value) {
            addCriterion("autocar_id <", value, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdLessThanOrEqualTo(String value) {
            addCriterion("autocar_id <=", value, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdLike(String value) {
            addCriterion("autocar_id like", value, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdNotLike(String value) {
            addCriterion("autocar_id not like", value, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdIn(List<String> values) {
            addCriterion("autocar_id in", values, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdNotIn(List<String> values) {
            addCriterion("autocar_id not in", values, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdBetween(String value1, String value2) {
            addCriterion("autocar_id between", value1, value2, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarIdNotBetween(String value1, String value2) {
            addCriterion("autocar_id not between", value1, value2, "autocarId");
            return (Criteria) this;
        }

        public Criteria andAutocarNoIsNull() {
            addCriterion("autocar_no is null");
            return (Criteria) this;
        }

        public Criteria andAutocarNoIsNotNull() {
            addCriterion("autocar_no is not null");
            return (Criteria) this;
        }

        public Criteria andAutocarNoEqualTo(String value) {
            addCriterion("autocar_no =", value, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoNotEqualTo(String value) {
            addCriterion("autocar_no <>", value, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoGreaterThan(String value) {
            addCriterion("autocar_no >", value, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoGreaterThanOrEqualTo(String value) {
            addCriterion("autocar_no >=", value, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoLessThan(String value) {
            addCriterion("autocar_no <", value, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoLessThanOrEqualTo(String value) {
            addCriterion("autocar_no <=", value, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoLike(String value) {
            addCriterion("autocar_no like", value, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoNotLike(String value) {
            addCriterion("autocar_no not like", value, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoIn(List<String> values) {
            addCriterion("autocar_no in", values, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoNotIn(List<String> values) {
            addCriterion("autocar_no not in", values, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoBetween(String value1, String value2) {
            addCriterion("autocar_no between", value1, value2, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarNoNotBetween(String value1, String value2) {
            addCriterion("autocar_no not between", value1, value2, "autocarNo");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeIsNull() {
            addCriterion("autocar_type is null");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeIsNotNull() {
            addCriterion("autocar_type is not null");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeEqualTo(String value) {
            addCriterion("autocar_type =", value, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeNotEqualTo(String value) {
            addCriterion("autocar_type <>", value, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeGreaterThan(String value) {
            addCriterion("autocar_type >", value, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("autocar_type >=", value, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeLessThan(String value) {
            addCriterion("autocar_type <", value, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeLessThanOrEqualTo(String value) {
            addCriterion("autocar_type <=", value, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeLike(String value) {
            addCriterion("autocar_type like", value, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeNotLike(String value) {
            addCriterion("autocar_type not like", value, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeIn(List<String> values) {
            addCriterion("autocar_type in", values, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeNotIn(List<String> values) {
            addCriterion("autocar_type not in", values, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeBetween(String value1, String value2) {
            addCriterion("autocar_type between", value1, value2, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarTypeNotBetween(String value1, String value2) {
            addCriterion("autocar_type not between", value1, value2, "autocarType");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerIsNull() {
            addCriterion("autocar_owner is null");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerIsNotNull() {
            addCriterion("autocar_owner is not null");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerEqualTo(String value) {
            addCriterion("autocar_owner =", value, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerNotEqualTo(String value) {
            addCriterion("autocar_owner <>", value, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerGreaterThan(String value) {
            addCriterion("autocar_owner >", value, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("autocar_owner >=", value, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerLessThan(String value) {
            addCriterion("autocar_owner <", value, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerLessThanOrEqualTo(String value) {
            addCriterion("autocar_owner <=", value, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerLike(String value) {
            addCriterion("autocar_owner like", value, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerNotLike(String value) {
            addCriterion("autocar_owner not like", value, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerIn(List<String> values) {
            addCriterion("autocar_owner in", values, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerNotIn(List<String> values) {
            addCriterion("autocar_owner not in", values, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerBetween(String value1, String value2) {
            addCriterion("autocar_owner between", value1, value2, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andAutocarOwnerNotBetween(String value1, String value2) {
            addCriterion("autocar_owner not between", value1, value2, "autocarOwner");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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