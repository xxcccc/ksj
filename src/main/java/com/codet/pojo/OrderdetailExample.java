package com.codet.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdetailExample() {
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

        public Criteria andOrderdetailidIsNull() {
            addCriterion("orderDetailId is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNotNull() {
            addCriterion("orderDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidEqualTo(Integer value) {
            addCriterion("orderDetailId =", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotEqualTo(Integer value) {
            addCriterion("orderDetailId <>", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThan(Integer value) {
            addCriterion("orderDetailId >", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderDetailId >=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThan(Integer value) {
            addCriterion("orderDetailId <", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("orderDetailId <=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIn(List<Integer> values) {
            addCriterion("orderDetailId in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotIn(List<Integer> values) {
            addCriterion("orderDetailId not in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidBetween(Integer value1, Integer value2) {
            addCriterion("orderDetailId between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderDetailId not between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andTorderidIsNull() {
            addCriterion("tOrderId is null");
            return (Criteria) this;
        }

        public Criteria andTorderidIsNotNull() {
            addCriterion("tOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andTorderidEqualTo(Integer value) {
            addCriterion("tOrderId =", value, "torderid");
            return (Criteria) this;
        }

        public Criteria andTorderidNotEqualTo(Integer value) {
            addCriterion("tOrderId <>", value, "torderid");
            return (Criteria) this;
        }

        public Criteria andTorderidGreaterThan(Integer value) {
            addCriterion("tOrderId >", value, "torderid");
            return (Criteria) this;
        }

        public Criteria andTorderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tOrderId >=", value, "torderid");
            return (Criteria) this;
        }

        public Criteria andTorderidLessThan(Integer value) {
            addCriterion("tOrderId <", value, "torderid");
            return (Criteria) this;
        }

        public Criteria andTorderidLessThanOrEqualTo(Integer value) {
            addCriterion("tOrderId <=", value, "torderid");
            return (Criteria) this;
        }

        public Criteria andTorderidIn(List<Integer> values) {
            addCriterion("tOrderId in", values, "torderid");
            return (Criteria) this;
        }

        public Criteria andTorderidNotIn(List<Integer> values) {
            addCriterion("tOrderId not in", values, "torderid");
            return (Criteria) this;
        }

        public Criteria andTorderidBetween(Integer value1, Integer value2) {
            addCriterion("tOrderId between", value1, value2, "torderid");
            return (Criteria) this;
        }

        public Criteria andTorderidNotBetween(Integer value1, Integer value2) {
            addCriterion("tOrderId not between", value1, value2, "torderid");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("itemId is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemId is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Integer value) {
            addCriterion("itemId =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Integer value) {
            addCriterion("itemId <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Integer value) {
            addCriterion("itemId >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemId >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Integer value) {
            addCriterion("itemId <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Integer value) {
            addCriterion("itemId <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Integer> values) {
            addCriterion("itemId in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Integer> values) {
            addCriterion("itemId not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Integer value1, Integer value2) {
            addCriterion("itemId between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("itemId not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andSumpriceIsNull() {
            addCriterion("sumPrice is null");
            return (Criteria) this;
        }

        public Criteria andSumpriceIsNotNull() {
            addCriterion("sumPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSumpriceEqualTo(Float value) {
            addCriterion("sumPrice =", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceNotEqualTo(Float value) {
            addCriterion("sumPrice <>", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceGreaterThan(Float value) {
            addCriterion("sumPrice >", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("sumPrice >=", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceLessThan(Float value) {
            addCriterion("sumPrice <", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceLessThanOrEqualTo(Float value) {
            addCriterion("sumPrice <=", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceIn(List<Float> values) {
            addCriterion("sumPrice in", values, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceNotIn(List<Float> values) {
            addCriterion("sumPrice not in", values, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceBetween(Float value1, Float value2) {
            addCriterion("sumPrice between", value1, value2, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceNotBetween(Float value1, Float value2) {
            addCriterion("sumPrice not between", value1, value2, "sumprice");
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