package com.codet.pojo;

import java.util.ArrayList;
import java.util.List;

public class SufferdiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SufferdiseaseExample() {
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

        public Criteria andSufferdiseaseidIsNull() {
            addCriterion("sufferDiseaseId is null");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidIsNotNull() {
            addCriterion("sufferDiseaseId is not null");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidEqualTo(Integer value) {
            addCriterion("sufferDiseaseId =", value, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidNotEqualTo(Integer value) {
            addCriterion("sufferDiseaseId <>", value, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidGreaterThan(Integer value) {
            addCriterion("sufferDiseaseId >", value, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sufferDiseaseId >=", value, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidLessThan(Integer value) {
            addCriterion("sufferDiseaseId <", value, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidLessThanOrEqualTo(Integer value) {
            addCriterion("sufferDiseaseId <=", value, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidIn(List<Integer> values) {
            addCriterion("sufferDiseaseId in", values, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidNotIn(List<Integer> values) {
            addCriterion("sufferDiseaseId not in", values, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidBetween(Integer value1, Integer value2) {
            addCriterion("sufferDiseaseId between", value1, value2, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andSufferdiseaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("sufferDiseaseId not between", value1, value2, "sufferdiseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidIsNull() {
            addCriterion("diseaseTypeId is null");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidIsNotNull() {
            addCriterion("diseaseTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidEqualTo(Integer value) {
            addCriterion("diseaseTypeId =", value, "diseasetypeid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidNotEqualTo(Integer value) {
            addCriterion("diseaseTypeId <>", value, "diseasetypeid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidGreaterThan(Integer value) {
            addCriterion("diseaseTypeId >", value, "diseasetypeid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("diseaseTypeId >=", value, "diseasetypeid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidLessThan(Integer value) {
            addCriterion("diseaseTypeId <", value, "diseasetypeid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("diseaseTypeId <=", value, "diseasetypeid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidIn(List<Integer> values) {
            addCriterion("diseaseTypeId in", values, "diseasetypeid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidNotIn(List<Integer> values) {
            addCriterion("diseaseTypeId not in", values, "diseasetypeid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidBetween(Integer value1, Integer value2) {
            addCriterion("diseaseTypeId between", value1, value2, "diseasetypeid");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("diseaseTypeId not between", value1, value2, "diseasetypeid");
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