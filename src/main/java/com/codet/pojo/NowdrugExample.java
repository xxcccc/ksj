package com.codet.pojo;

import java.util.ArrayList;
import java.util.List;

public class NowdrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NowdrugExample() {
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

        public Criteria andNowdrugidIsNull() {
            addCriterion("nowDrugId is null");
            return (Criteria) this;
        }

        public Criteria andNowdrugidIsNotNull() {
            addCriterion("nowDrugId is not null");
            return (Criteria) this;
        }

        public Criteria andNowdrugidEqualTo(Integer value) {
            addCriterion("nowDrugId =", value, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andNowdrugidNotEqualTo(Integer value) {
            addCriterion("nowDrugId <>", value, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andNowdrugidGreaterThan(Integer value) {
            addCriterion("nowDrugId >", value, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andNowdrugidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nowDrugId >=", value, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andNowdrugidLessThan(Integer value) {
            addCriterion("nowDrugId <", value, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andNowdrugidLessThanOrEqualTo(Integer value) {
            addCriterion("nowDrugId <=", value, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andNowdrugidIn(List<Integer> values) {
            addCriterion("nowDrugId in", values, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andNowdrugidNotIn(List<Integer> values) {
            addCriterion("nowDrugId not in", values, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andNowdrugidBetween(Integer value1, Integer value2) {
            addCriterion("nowDrugId between", value1, value2, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andNowdrugidNotBetween(Integer value1, Integer value2) {
            addCriterion("nowDrugId not between", value1, value2, "nowdrugid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidIsNull() {
            addCriterion("healtRecordsId is null");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidIsNotNull() {
            addCriterion("healtRecordsId is not null");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidEqualTo(Integer value) {
            addCriterion("healtRecordsId =", value, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidNotEqualTo(Integer value) {
            addCriterion("healtRecordsId <>", value, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidGreaterThan(Integer value) {
            addCriterion("healtRecordsId >", value, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("healtRecordsId >=", value, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidLessThan(Integer value) {
            addCriterion("healtRecordsId <", value, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidLessThanOrEqualTo(Integer value) {
            addCriterion("healtRecordsId <=", value, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidIn(List<Integer> values) {
            addCriterion("healtRecordsId in", values, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidNotIn(List<Integer> values) {
            addCriterion("healtRecordsId not in", values, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidBetween(Integer value1, Integer value2) {
            addCriterion("healtRecordsId between", value1, value2, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andHealtrecordsidNotBetween(Integer value1, Integer value2) {
            addCriterion("healtRecordsId not between", value1, value2, "healtrecordsid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidIsNull() {
            addCriterion("drugAndNumId is null");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidIsNotNull() {
            addCriterion("drugAndNumId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidEqualTo(Integer value) {
            addCriterion("drugAndNumId =", value, "drugandnumid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidNotEqualTo(Integer value) {
            addCriterion("drugAndNumId <>", value, "drugandnumid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidGreaterThan(Integer value) {
            addCriterion("drugAndNumId >", value, "drugandnumid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugAndNumId >=", value, "drugandnumid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidLessThan(Integer value) {
            addCriterion("drugAndNumId <", value, "drugandnumid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidLessThanOrEqualTo(Integer value) {
            addCriterion("drugAndNumId <=", value, "drugandnumid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidIn(List<Integer> values) {
            addCriterion("drugAndNumId in", values, "drugandnumid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidNotIn(List<Integer> values) {
            addCriterion("drugAndNumId not in", values, "drugandnumid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidBetween(Integer value1, Integer value2) {
            addCriterion("drugAndNumId between", value1, value2, "drugandnumid");
            return (Criteria) this;
        }

        public Criteria andDrugandnumidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugAndNumId not between", value1, value2, "drugandnumid");
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