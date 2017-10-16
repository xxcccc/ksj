package com.codet.pojo;

import java.util.ArrayList;
import java.util.List;

public class GetaddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GetaddressExample() {
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

        public Criteria andGetaddressidIsNull() {
            addCriterion("getAddressId is null");
            return (Criteria) this;
        }

        public Criteria andGetaddressidIsNotNull() {
            addCriterion("getAddressId is not null");
            return (Criteria) this;
        }

        public Criteria andGetaddressidEqualTo(Integer value) {
            addCriterion("getAddressId =", value, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andGetaddressidNotEqualTo(Integer value) {
            addCriterion("getAddressId <>", value, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andGetaddressidGreaterThan(Integer value) {
            addCriterion("getAddressId >", value, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andGetaddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("getAddressId >=", value, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andGetaddressidLessThan(Integer value) {
            addCriterion("getAddressId <", value, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andGetaddressidLessThanOrEqualTo(Integer value) {
            addCriterion("getAddressId <=", value, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andGetaddressidIn(List<Integer> values) {
            addCriterion("getAddressId in", values, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andGetaddressidNotIn(List<Integer> values) {
            addCriterion("getAddressId not in", values, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andGetaddressidBetween(Integer value1, Integer value2) {
            addCriterion("getAddressId between", value1, value2, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andGetaddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("getAddressId not between", value1, value2, "getaddressid");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNull() {
            addCriterion("customId is null");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNotNull() {
            addCriterion("customId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomidEqualTo(String value) {
            addCriterion("customId =", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotEqualTo(String value) {
            addCriterion("customId <>", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThan(String value) {
            addCriterion("customId >", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThanOrEqualTo(String value) {
            addCriterion("customId >=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThan(String value) {
            addCriterion("customId <", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThanOrEqualTo(String value) {
            addCriterion("customId <=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLike(String value) {
            addCriterion("customId like", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotLike(String value) {
            addCriterion("customId not like", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidIn(List<String> values) {
            addCriterion("customId in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotIn(List<String> values) {
            addCriterion("customId not in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidBetween(String value1, String value2) {
            addCriterion("customId between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotBetween(String value1, String value2) {
            addCriterion("customId not between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andGetaddressIsNull() {
            addCriterion("getAddress is null");
            return (Criteria) this;
        }

        public Criteria andGetaddressIsNotNull() {
            addCriterion("getAddress is not null");
            return (Criteria) this;
        }

        public Criteria andGetaddressEqualTo(String value) {
            addCriterion("getAddress =", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressNotEqualTo(String value) {
            addCriterion("getAddress <>", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressGreaterThan(String value) {
            addCriterion("getAddress >", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressGreaterThanOrEqualTo(String value) {
            addCriterion("getAddress >=", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressLessThan(String value) {
            addCriterion("getAddress <", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressLessThanOrEqualTo(String value) {
            addCriterion("getAddress <=", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressLike(String value) {
            addCriterion("getAddress like", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressNotLike(String value) {
            addCriterion("getAddress not like", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressIn(List<String> values) {
            addCriterion("getAddress in", values, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressNotIn(List<String> values) {
            addCriterion("getAddress not in", values, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressBetween(String value1, String value2) {
            addCriterion("getAddress between", value1, value2, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressNotBetween(String value1, String value2) {
            addCriterion("getAddress not between", value1, value2, "getaddress");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }
    }

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