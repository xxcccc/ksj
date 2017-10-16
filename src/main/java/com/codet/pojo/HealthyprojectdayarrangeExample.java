package com.codet.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HealthyprojectdayarrangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HealthyprojectdayarrangeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andHealthyprojectdayarrangeidIsNull() {
            addCriterion("healthyProjectDayArrangeId is null");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidIsNotNull() {
            addCriterion("healthyProjectDayArrangeId is not null");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidEqualTo(Integer value) {
            addCriterion("healthyProjectDayArrangeId =", value, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidNotEqualTo(Integer value) {
            addCriterion("healthyProjectDayArrangeId <>", value, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidGreaterThan(Integer value) {
            addCriterion("healthyProjectDayArrangeId >", value, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("healthyProjectDayArrangeId >=", value, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidLessThan(Integer value) {
            addCriterion("healthyProjectDayArrangeId <", value, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidLessThanOrEqualTo(Integer value) {
            addCriterion("healthyProjectDayArrangeId <=", value, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidIn(List<Integer> values) {
            addCriterion("healthyProjectDayArrangeId in", values, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidNotIn(List<Integer> values) {
            addCriterion("healthyProjectDayArrangeId not in", values, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidBetween(Integer value1, Integer value2) {
            addCriterion("healthyProjectDayArrangeId between", value1, value2, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectdayarrangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("healthyProjectDayArrangeId not between", value1, value2, "healthyprojectdayarrangeid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidIsNull() {
            addCriterion("healthyProjectId is null");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidIsNotNull() {
            addCriterion("healthyProjectId is not null");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidEqualTo(Integer value) {
            addCriterion("healthyProjectId =", value, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidNotEqualTo(Integer value) {
            addCriterion("healthyProjectId <>", value, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidGreaterThan(Integer value) {
            addCriterion("healthyProjectId >", value, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("healthyProjectId >=", value, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidLessThan(Integer value) {
            addCriterion("healthyProjectId <", value, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidLessThanOrEqualTo(Integer value) {
            addCriterion("healthyProjectId <=", value, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidIn(List<Integer> values) {
            addCriterion("healthyProjectId in", values, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidNotIn(List<Integer> values) {
            addCriterion("healthyProjectId not in", values, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidBetween(Integer value1, Integer value2) {
            addCriterion("healthyProjectId between", value1, value2, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andHealthyprojectidNotBetween(Integer value1, Integer value2) {
            addCriterion("healthyProjectId not between", value1, value2, "healthyprojectid");
            return (Criteria) this;
        }

        public Criteria andMaxservernumIsNull() {
            addCriterion("maxServerNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxservernumIsNotNull() {
            addCriterion("maxServerNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxservernumEqualTo(Integer value) {
            addCriterion("maxServerNum =", value, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andMaxservernumNotEqualTo(Integer value) {
            addCriterion("maxServerNum <>", value, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andMaxservernumGreaterThan(Integer value) {
            addCriterion("maxServerNum >", value, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andMaxservernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxServerNum >=", value, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andMaxservernumLessThan(Integer value) {
            addCriterion("maxServerNum <", value, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andMaxservernumLessThanOrEqualTo(Integer value) {
            addCriterion("maxServerNum <=", value, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andMaxservernumIn(List<Integer> values) {
            addCriterion("maxServerNum in", values, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andMaxservernumNotIn(List<Integer> values) {
            addCriterion("maxServerNum not in", values, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andMaxservernumBetween(Integer value1, Integer value2) {
            addCriterion("maxServerNum between", value1, value2, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andMaxservernumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxServerNum not between", value1, value2, "maxservernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("orderNum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("orderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("orderNum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("orderNum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Integer value) {
            addCriterion("orderNum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Integer value) {
            addCriterion("orderNum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Integer value) {
            addCriterion("orderNum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("orderNum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("orderNum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("orderNum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
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