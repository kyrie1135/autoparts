package com.mixone.autoparts.autopart.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AutoPartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AutoPartExample() {
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

        public Criteria andAutopartIdIsNull() {
            addCriterion("autopart_id is null");
            return (Criteria) this;
        }

        public Criteria andAutopartIdIsNotNull() {
            addCriterion("autopart_id is not null");
            return (Criteria) this;
        }

        public Criteria andAutopartIdEqualTo(String value) {
            addCriterion("autopart_id =", value, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdNotEqualTo(String value) {
            addCriterion("autopart_id <>", value, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdGreaterThan(String value) {
            addCriterion("autopart_id >", value, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdGreaterThanOrEqualTo(String value) {
            addCriterion("autopart_id >=", value, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdLessThan(String value) {
            addCriterion("autopart_id <", value, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdLessThanOrEqualTo(String value) {
            addCriterion("autopart_id <=", value, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdLike(String value) {
            addCriterion("autopart_id like", value, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdNotLike(String value) {
            addCriterion("autopart_id not like", value, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdIn(List<String> values) {
            addCriterion("autopart_id in", values, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdNotIn(List<String> values) {
            addCriterion("autopart_id not in", values, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdBetween(String value1, String value2) {
            addCriterion("autopart_id between", value1, value2, "autopartId");
            return (Criteria) this;
        }

        public Criteria andAutopartIdNotBetween(String value1, String value2) {
            addCriterion("autopart_id not between", value1, value2, "autopartId");
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

        public Criteria andAutopartNameIsNull() {
            addCriterion("autopart_name is null");
            return (Criteria) this;
        }

        public Criteria andAutopartNameIsNotNull() {
            addCriterion("autopart_name is not null");
            return (Criteria) this;
        }

        public Criteria andAutopartNameEqualTo(String value) {
            addCriterion("autopart_name =", value, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameNotEqualTo(String value) {
            addCriterion("autopart_name <>", value, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameGreaterThan(String value) {
            addCriterion("autopart_name >", value, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameGreaterThanOrEqualTo(String value) {
            addCriterion("autopart_name >=", value, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameLessThan(String value) {
            addCriterion("autopart_name <", value, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameLessThanOrEqualTo(String value) {
            addCriterion("autopart_name <=", value, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameLike(String value) {
            addCriterion("autopart_name like", value, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameNotLike(String value) {
            addCriterion("autopart_name not like", value, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameIn(List<String> values) {
            addCriterion("autopart_name in", values, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameNotIn(List<String> values) {
            addCriterion("autopart_name not in", values, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameBetween(String value1, String value2) {
            addCriterion("autopart_name between", value1, value2, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartNameNotBetween(String value1, String value2) {
            addCriterion("autopart_name not between", value1, value2, "autopartName");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceIsNull() {
            addCriterion("autopart_price is null");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceIsNotNull() {
            addCriterion("autopart_price is not null");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceEqualTo(Double value) {
            addCriterion("autopart_price =", value, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceNotEqualTo(Double value) {
            addCriterion("autopart_price <>", value, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceGreaterThan(Double value) {
            addCriterion("autopart_price >", value, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("autopart_price >=", value, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceLessThan(Double value) {
            addCriterion("autopart_price <", value, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceLessThanOrEqualTo(Double value) {
            addCriterion("autopart_price <=", value, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceIn(List<Double> values) {
            addCriterion("autopart_price in", values, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceNotIn(List<Double> values) {
            addCriterion("autopart_price not in", values, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceBetween(Double value1, Double value2) {
            addCriterion("autopart_price between", value1, value2, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartPriceNotBetween(Double value1, Double value2) {
            addCriterion("autopart_price not between", value1, value2, "autopartPrice");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityIsNull() {
            addCriterion("autopart_quantity is null");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityIsNotNull() {
            addCriterion("autopart_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityEqualTo(Integer value) {
            addCriterion("autopart_quantity =", value, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityNotEqualTo(Integer value) {
            addCriterion("autopart_quantity <>", value, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityGreaterThan(Integer value) {
            addCriterion("autopart_quantity >", value, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("autopart_quantity >=", value, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityLessThan(Integer value) {
            addCriterion("autopart_quantity <", value, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("autopart_quantity <=", value, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityIn(List<Integer> values) {
            addCriterion("autopart_quantity in", values, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityNotIn(List<Integer> values) {
            addCriterion("autopart_quantity not in", values, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityBetween(Integer value1, Integer value2) {
            addCriterion("autopart_quantity between", value1, value2, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("autopart_quantity not between", value1, value2, "autopartQuantity");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalIsNull() {
            addCriterion("autopart_total is null");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalIsNotNull() {
            addCriterion("autopart_total is not null");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalEqualTo(Double value) {
            addCriterion("autopart_total =", value, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalNotEqualTo(Double value) {
            addCriterion("autopart_total <>", value, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalGreaterThan(Double value) {
            addCriterion("autopart_total >", value, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("autopart_total >=", value, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalLessThan(Double value) {
            addCriterion("autopart_total <", value, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalLessThanOrEqualTo(Double value) {
            addCriterion("autopart_total <=", value, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalIn(List<Double> values) {
            addCriterion("autopart_total in", values, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalNotIn(List<Double> values) {
            addCriterion("autopart_total not in", values, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalBetween(Double value1, Double value2) {
            addCriterion("autopart_total between", value1, value2, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andAutopartTotalNotBetween(Double value1, Double value2) {
            addCriterion("autopart_total not between", value1, value2, "autopartTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNull() {
            addCriterion("purchaser is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNotNull() {
            addCriterion("purchaser is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserEqualTo(String value) {
            addCriterion("purchaser =", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotEqualTo(String value) {
            addCriterion("purchaser <>", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThan(String value) {
            addCriterion("purchaser >", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThanOrEqualTo(String value) {
            addCriterion("purchaser >=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThan(String value) {
            addCriterion("purchaser <", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThanOrEqualTo(String value) {
            addCriterion("purchaser <=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLike(String value) {
            addCriterion("purchaser like", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotLike(String value) {
            addCriterion("purchaser not like", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserIn(List<String> values) {
            addCriterion("purchaser in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotIn(List<String> values) {
            addCriterion("purchaser not in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserBetween(String value1, String value2) {
            addCriterion("purchaser between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotBetween(String value1, String value2) {
            addCriterion("purchaser not between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNull() {
            addCriterion("purchase_time is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNotNull() {
            addCriterion("purchase_time is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeEqualTo(Date value) {
            addCriterion("purchase_time =", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotEqualTo(Date value) {
            addCriterion("purchase_time <>", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThan(Date value) {
            addCriterion("purchase_time >", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("purchase_time >=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThan(Date value) {
            addCriterion("purchase_time <", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("purchase_time <=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIn(List<Date> values) {
            addCriterion("purchase_time in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotIn(List<Date> values) {
            addCriterion("purchase_time not in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeBetween(Date value1, Date value2) {
            addCriterion("purchase_time between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("purchase_time not between", value1, value2, "purchaseTime");
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