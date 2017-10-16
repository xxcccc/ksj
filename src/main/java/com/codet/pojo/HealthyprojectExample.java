package com.codet.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HealthyprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HealthyprojectExample() {
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

        public Criteria andProjecttimearrangetypeidIsNull() {
            addCriterion("projectTimeArrangeTypeId is null");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidIsNotNull() {
            addCriterion("projectTimeArrangeTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidEqualTo(Integer value) {
            addCriterion("projectTimeArrangeTypeId =", value, "projecttimearrangetypeid");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidNotEqualTo(Integer value) {
            addCriterion("projectTimeArrangeTypeId <>", value, "projecttimearrangetypeid");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidGreaterThan(Integer value) {
            addCriterion("projectTimeArrangeTypeId >", value, "projecttimearrangetypeid");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectTimeArrangeTypeId >=", value, "projecttimearrangetypeid");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidLessThan(Integer value) {
            addCriterion("projectTimeArrangeTypeId <", value, "projecttimearrangetypeid");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("projectTimeArrangeTypeId <=", value, "projecttimearrangetypeid");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidIn(List<Integer> values) {
            addCriterion("projectTimeArrangeTypeId in", values, "projecttimearrangetypeid");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidNotIn(List<Integer> values) {
            addCriterion("projectTimeArrangeTypeId not in", values, "projecttimearrangetypeid");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidBetween(Integer value1, Integer value2) {
            addCriterion("projectTimeArrangeTypeId between", value1, value2, "projecttimearrangetypeid");
            return (Criteria) this;
        }

        public Criteria andProjecttimearrangetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectTimeArrangeTypeId not between", value1, value2, "projecttimearrangetypeid");
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

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
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

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("overTime is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("overTime is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(Date value) {
            addCriterion("overTime =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(Date value) {
            addCriterion("overTime <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(Date value) {
            addCriterion("overTime >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("overTime >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(Date value) {
            addCriterion("overTime <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(Date value) {
            addCriterion("overTime <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<Date> values) {
            addCriterion("overTime in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<Date> values) {
            addCriterion("overTime not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(Date value1, Date value2) {
            addCriterion("overTime between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(Date value1, Date value2) {
            addCriterion("overTime not between", value1, value2, "overtime");
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