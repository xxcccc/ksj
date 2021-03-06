package com.codet.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ConsumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumeExample() {
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

        public Criteria andConsumeidIsNull() {
            addCriterion("consumeId is null");
            return (Criteria) this;
        }

        public Criteria andConsumeidIsNotNull() {
            addCriterion("consumeId is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeidEqualTo(Integer value) {
            addCriterion("consumeId =", value, "consumeid");
            return (Criteria) this;
        }

        public Criteria andConsumeidNotEqualTo(Integer value) {
            addCriterion("consumeId <>", value, "consumeid");
            return (Criteria) this;
        }

        public Criteria andConsumeidGreaterThan(Integer value) {
            addCriterion("consumeId >", value, "consumeid");
            return (Criteria) this;
        }

        public Criteria andConsumeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumeId >=", value, "consumeid");
            return (Criteria) this;
        }

        public Criteria andConsumeidLessThan(Integer value) {
            addCriterion("consumeId <", value, "consumeid");
            return (Criteria) this;
        }

        public Criteria andConsumeidLessThanOrEqualTo(Integer value) {
            addCriterion("consumeId <=", value, "consumeid");
            return (Criteria) this;
        }

        public Criteria andConsumeidIn(List<Integer> values) {
            addCriterion("consumeId in", values, "consumeid");
            return (Criteria) this;
        }

        public Criteria andConsumeidNotIn(List<Integer> values) {
            addCriterion("consumeId not in", values, "consumeid");
            return (Criteria) this;
        }

        public Criteria andConsumeidBetween(Integer value1, Integer value2) {
            addCriterion("consumeId between", value1, value2, "consumeid");
            return (Criteria) this;
        }

        public Criteria andConsumeidNotBetween(Integer value1, Integer value2) {
            addCriterion("consumeId not between", value1, value2, "consumeid");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeIsNull() {
            addCriterion("lastConsumeTime is null");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeIsNotNull() {
            addCriterion("lastConsumeTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeEqualTo(Date value) {
            addCriterionForJDBCDate("lastConsumeTime =", value, "lastconsumetime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastConsumeTime <>", value, "lastconsumetime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("lastConsumeTime >", value, "lastconsumetime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastConsumeTime >=", value, "lastconsumetime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeLessThan(Date value) {
            addCriterionForJDBCDate("lastConsumeTime <", value, "lastconsumetime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastConsumeTime <=", value, "lastconsumetime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeIn(List<Date> values) {
            addCriterionForJDBCDate("lastConsumeTime in", values, "lastconsumetime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastConsumeTime not in", values, "lastconsumetime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastConsumeTime between", value1, value2, "lastconsumetime");
            return (Criteria) this;
        }

        public Criteria andLastconsumetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastConsumeTime not between", value1, value2, "lastconsumetime");
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