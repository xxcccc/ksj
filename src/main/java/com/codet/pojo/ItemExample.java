package com.codet.pojo;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andItemlevelidIsNull() {
            addCriterion("itemLevelId is null");
            return (Criteria) this;
        }

        public Criteria andItemlevelidIsNotNull() {
            addCriterion("itemLevelId is not null");
            return (Criteria) this;
        }

        public Criteria andItemlevelidEqualTo(Integer value) {
            addCriterion("itemLevelId =", value, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemlevelidNotEqualTo(Integer value) {
            addCriterion("itemLevelId <>", value, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemlevelidGreaterThan(Integer value) {
            addCriterion("itemLevelId >", value, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemlevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemLevelId >=", value, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemlevelidLessThan(Integer value) {
            addCriterion("itemLevelId <", value, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemlevelidLessThanOrEqualTo(Integer value) {
            addCriterion("itemLevelId <=", value, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemlevelidIn(List<Integer> values) {
            addCriterion("itemLevelId in", values, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemlevelidNotIn(List<Integer> values) {
            addCriterion("itemLevelId not in", values, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemlevelidBetween(Integer value1, Integer value2) {
            addCriterion("itemLevelId between", value1, value2, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemlevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("itemLevelId not between", value1, value2, "itemlevelid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidIsNull() {
            addCriterion("itemTypeId is null");
            return (Criteria) this;
        }

        public Criteria andItemtypeidIsNotNull() {
            addCriterion("itemTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andItemtypeidEqualTo(Integer value) {
            addCriterion("itemTypeId =", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidNotEqualTo(Integer value) {
            addCriterion("itemTypeId <>", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidGreaterThan(Integer value) {
            addCriterion("itemTypeId >", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemTypeId >=", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidLessThan(Integer value) {
            addCriterion("itemTypeId <", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("itemTypeId <=", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidIn(List<Integer> values) {
            addCriterion("itemTypeId in", values, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidNotIn(List<Integer> values) {
            addCriterion("itemTypeId not in", values, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidBetween(Integer value1, Integer value2) {
            addCriterion("itemTypeId between", value1, value2, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("itemTypeId not between", value1, value2, "itemtypeid");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBenefitflagIsNull() {
            addCriterion("benefitFlag is null");
            return (Criteria) this;
        }

        public Criteria andBenefitflagIsNotNull() {
            addCriterion("benefitFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitflagEqualTo(String value) {
            addCriterion("benefitFlag =", value, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagNotEqualTo(String value) {
            addCriterion("benefitFlag <>", value, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagGreaterThan(String value) {
            addCriterion("benefitFlag >", value, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagGreaterThanOrEqualTo(String value) {
            addCriterion("benefitFlag >=", value, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagLessThan(String value) {
            addCriterion("benefitFlag <", value, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagLessThanOrEqualTo(String value) {
            addCriterion("benefitFlag <=", value, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagLike(String value) {
            addCriterion("benefitFlag like", value, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagNotLike(String value) {
            addCriterion("benefitFlag not like", value, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagIn(List<String> values) {
            addCriterion("benefitFlag in", values, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagNotIn(List<String> values) {
            addCriterion("benefitFlag not in", values, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagBetween(String value1, String value2) {
            addCriterion("benefitFlag between", value1, value2, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andBenefitflagNotBetween(String value1, String value2) {
            addCriterion("benefitFlag not between", value1, value2, "benefitflag");
            return (Criteria) this;
        }

        public Criteria andFlagnumIsNull() {
            addCriterion("flagNum is null");
            return (Criteria) this;
        }

        public Criteria andFlagnumIsNotNull() {
            addCriterion("flagNum is not null");
            return (Criteria) this;
        }

        public Criteria andFlagnumEqualTo(Integer value) {
            addCriterion("flagNum =", value, "flagnum");
            return (Criteria) this;
        }

        public Criteria andFlagnumNotEqualTo(Integer value) {
            addCriterion("flagNum <>", value, "flagnum");
            return (Criteria) this;
        }

        public Criteria andFlagnumGreaterThan(Integer value) {
            addCriterion("flagNum >", value, "flagnum");
            return (Criteria) this;
        }

        public Criteria andFlagnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("flagNum >=", value, "flagnum");
            return (Criteria) this;
        }

        public Criteria andFlagnumLessThan(Integer value) {
            addCriterion("flagNum <", value, "flagnum");
            return (Criteria) this;
        }

        public Criteria andFlagnumLessThanOrEqualTo(Integer value) {
            addCriterion("flagNum <=", value, "flagnum");
            return (Criteria) this;
        }

        public Criteria andFlagnumIn(List<Integer> values) {
            addCriterion("flagNum in", values, "flagnum");
            return (Criteria) this;
        }

        public Criteria andFlagnumNotIn(List<Integer> values) {
            addCriterion("flagNum not in", values, "flagnum");
            return (Criteria) this;
        }

        public Criteria andFlagnumBetween(Integer value1, Integer value2) {
            addCriterion("flagNum between", value1, value2, "flagnum");
            return (Criteria) this;
        }

        public Criteria andFlagnumNotBetween(Integer value1, Integer value2) {
            addCriterion("flagNum not between", value1, value2, "flagnum");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceIsNull() {
            addCriterion("benefitPrice is null");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceIsNotNull() {
            addCriterion("benefitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceEqualTo(Float value) {
            addCriterion("benefitPrice =", value, "benefitprice");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceNotEqualTo(Float value) {
            addCriterion("benefitPrice <>", value, "benefitprice");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceGreaterThan(Float value) {
            addCriterion("benefitPrice >", value, "benefitprice");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("benefitPrice >=", value, "benefitprice");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceLessThan(Float value) {
            addCriterion("benefitPrice <", value, "benefitprice");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceLessThanOrEqualTo(Float value) {
            addCriterion("benefitPrice <=", value, "benefitprice");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceIn(List<Float> values) {
            addCriterion("benefitPrice in", values, "benefitprice");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceNotIn(List<Float> values) {
            addCriterion("benefitPrice not in", values, "benefitprice");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceBetween(Float value1, Float value2) {
            addCriterion("benefitPrice between", value1, value2, "benefitprice");
            return (Criteria) this;
        }

        public Criteria andBenefitpriceNotBetween(Float value1, Float value2) {
            addCriterion("benefitPrice not between", value1, value2, "benefitprice");
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