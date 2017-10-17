package com.codet.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HealtrecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HealtrecordsExample() {
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

        public Criteria andHealthconsciousnessidIsNull() {
            addCriterion("healthConsciousnessId is null");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidIsNotNull() {
            addCriterion("healthConsciousnessId is not null");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidEqualTo(Integer value) {
            addCriterion("healthConsciousnessId =", value, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidNotEqualTo(Integer value) {
            addCriterion("healthConsciousnessId <>", value, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidGreaterThan(Integer value) {
            addCriterion("healthConsciousnessId >", value, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("healthConsciousnessId >=", value, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidLessThan(Integer value) {
            addCriterion("healthConsciousnessId <", value, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidLessThanOrEqualTo(Integer value) {
            addCriterion("healthConsciousnessId <=", value, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidIn(List<Integer> values) {
            addCriterion("healthConsciousnessId in", values, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidNotIn(List<Integer> values) {
            addCriterion("healthConsciousnessId not in", values, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidBetween(Integer value1, Integer value2) {
            addCriterion("healthConsciousnessId between", value1, value2, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andHealthconsciousnessidNotBetween(Integer value1, Integer value2) {
            addCriterion("healthConsciousnessId not between", value1, value2, "healthconsciousnessid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidIsNull() {
            addCriterion("ireatmentReviewId is null");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidIsNotNull() {
            addCriterion("ireatmentReviewId is not null");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidEqualTo(Integer value) {
            addCriterion("ireatmentReviewId =", value, "ireatmentreviewid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidNotEqualTo(Integer value) {
            addCriterion("ireatmentReviewId <>", value, "ireatmentreviewid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidGreaterThan(Integer value) {
            addCriterion("ireatmentReviewId >", value, "ireatmentreviewid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ireatmentReviewId >=", value, "ireatmentreviewid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidLessThan(Integer value) {
            addCriterion("ireatmentReviewId <", value, "ireatmentreviewid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidLessThanOrEqualTo(Integer value) {
            addCriterion("ireatmentReviewId <=", value, "ireatmentreviewid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidIn(List<Integer> values) {
            addCriterion("ireatmentReviewId in", values, "ireatmentreviewid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidNotIn(List<Integer> values) {
            addCriterion("ireatmentReviewId not in", values, "ireatmentreviewid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidBetween(Integer value1, Integer value2) {
            addCriterion("ireatmentReviewId between", value1, value2, "ireatmentreviewid");
            return (Criteria) this;
        }

        public Criteria andIreatmentreviewidNotBetween(Integer value1, Integer value2) {
            addCriterion("ireatmentReviewId not between", value1, value2, "ireatmentreviewid");
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

        public Criteria andDiagnosistimeIsNull() {
            addCriterion("diagnosisTime is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeIsNotNull() {
            addCriterion("diagnosisTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosisTime =", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosisTime <>", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeGreaterThan(Date value) {
            addCriterionForJDBCDate("diagnosisTime >", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosisTime >=", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeLessThan(Date value) {
            addCriterionForJDBCDate("diagnosisTime <", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosisTime <=", value, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeIn(List<Date> values) {
            addCriterionForJDBCDate("diagnosisTime in", values, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("diagnosisTime not in", values, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diagnosisTime between", value1, value2, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andDiagnosistimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diagnosisTime not between", value1, value2, "diagnosistime");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryIsNull() {
            addCriterion("familyHistory is null");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryIsNotNull() {
            addCriterion("familyHistory is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryEqualTo(String value) {
            addCriterion("familyHistory =", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryNotEqualTo(String value) {
            addCriterion("familyHistory <>", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryGreaterThan(String value) {
            addCriterion("familyHistory >", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryGreaterThanOrEqualTo(String value) {
            addCriterion("familyHistory >=", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryLessThan(String value) {
            addCriterion("familyHistory <", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryLessThanOrEqualTo(String value) {
            addCriterion("familyHistory <=", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryLike(String value) {
            addCriterion("familyHistory like", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryNotLike(String value) {
            addCriterion("familyHistory not like", value, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryIn(List<String> values) {
            addCriterion("familyHistory in", values, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryNotIn(List<String> values) {
            addCriterion("familyHistory not in", values, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryBetween(String value1, String value2) {
            addCriterion("familyHistory between", value1, value2, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andFamilyhistoryNotBetween(String value1, String value2) {
            addCriterion("familyHistory not between", value1, value2, "familyhistory");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
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