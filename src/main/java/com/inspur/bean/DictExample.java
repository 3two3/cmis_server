package com.inspur.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictExample() {
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

        public Criteria andDictIdIsNull() {
            addCriterion("DICT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictIdIsNotNull() {
            addCriterion("DICT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictIdEqualTo(Integer value) {
            addCriterion("DICT_ID =", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotEqualTo(Integer value) {
            addCriterion("DICT_ID <>", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThan(Integer value) {
            addCriterion("DICT_ID >", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DICT_ID >=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThan(Integer value) {
            addCriterion("DICT_ID <", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThanOrEqualTo(Integer value) {
            addCriterion("DICT_ID <=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdIn(List<Integer> values) {
            addCriterion("DICT_ID in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotIn(List<Integer> values) {
            addCriterion("DICT_ID not in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdBetween(Integer value1, Integer value2) {
            addCriterion("DICT_ID between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DICT_ID not between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictNameIsNull() {
            addCriterion("DICT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDictNameIsNotNull() {
            addCriterion("DICT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDictNameEqualTo(String value) {
            addCriterion("DICT_NAME =", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameNotEqualTo(String value) {
            addCriterion("DICT_NAME <>", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameGreaterThan(String value) {
            addCriterion("DICT_NAME >", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_NAME >=", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameLessThan(String value) {
            addCriterion("DICT_NAME <", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameLessThanOrEqualTo(String value) {
            addCriterion("DICT_NAME <=", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameLike(String value) {
            addCriterion("DICT_NAME like", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameNotLike(String value) {
            addCriterion("DICT_NAME not like", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameIn(List<String> values) {
            addCriterion("DICT_NAME in", values, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameNotIn(List<String> values) {
            addCriterion("DICT_NAME not in", values, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameBetween(String value1, String value2) {
            addCriterion("DICT_NAME between", value1, value2, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameNotBetween(String value1, String value2) {
            addCriterion("DICT_NAME not between", value1, value2, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNull() {
            addCriterion("DICT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNotNull() {
            addCriterion("DICT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDictValueEqualTo(Integer value) {
            addCriterion("DICT_VALUE =", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotEqualTo(Integer value) {
            addCriterion("DICT_VALUE <>", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThan(Integer value) {
            addCriterion("DICT_VALUE >", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("DICT_VALUE >=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThan(Integer value) {
            addCriterion("DICT_VALUE <", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThanOrEqualTo(Integer value) {
            addCriterion("DICT_VALUE <=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueIn(List<Integer> values) {
            addCriterion("DICT_VALUE in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotIn(List<Integer> values) {
            addCriterion("DICT_VALUE not in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueBetween(Integer value1, Integer value2) {
            addCriterion("DICT_VALUE between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotBetween(Integer value1, Integer value2) {
            addCriterion("DICT_VALUE not between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNull() {
            addCriterion("DICT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNotNull() {
            addCriterion("DICT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeEqualTo(String value) {
            addCriterion("DICT_TYPE =", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotEqualTo(String value) {
            addCriterion("DICT_TYPE <>", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThan(String value) {
            addCriterion("DICT_TYPE >", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE >=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThan(String value) {
            addCriterion("DICT_TYPE <", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE <=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLike(String value) {
            addCriterion("DICT_TYPE like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotLike(String value) {
            addCriterion("DICT_TYPE not like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeIn(List<String> values) {
            addCriterion("DICT_TYPE in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotIn(List<String> values) {
            addCriterion("DICT_TYPE not in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeBetween(String value1, String value2) {
            addCriterion("DICT_TYPE between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotBetween(String value1, String value2) {
            addCriterion("DICT_TYPE not between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionIsNull() {
            addCriterion("DICT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionIsNotNull() {
            addCriterion("DICT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionEqualTo(String value) {
            addCriterion("DICT_DESCRIPTION =", value, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionNotEqualTo(String value) {
            addCriterion("DICT_DESCRIPTION <>", value, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionGreaterThan(String value) {
            addCriterion("DICT_DESCRIPTION >", value, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_DESCRIPTION >=", value, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionLessThan(String value) {
            addCriterion("DICT_DESCRIPTION <", value, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DICT_DESCRIPTION <=", value, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionLike(String value) {
            addCriterion("DICT_DESCRIPTION like", value, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionNotLike(String value) {
            addCriterion("DICT_DESCRIPTION not like", value, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionIn(List<String> values) {
            addCriterion("DICT_DESCRIPTION in", values, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionNotIn(List<String> values) {
            addCriterion("DICT_DESCRIPTION not in", values, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionBetween(String value1, String value2) {
            addCriterion("DICT_DESCRIPTION between", value1, value2, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictDescriptionNotBetween(String value1, String value2) {
            addCriterion("DICT_DESCRIPTION not between", value1, value2, "dictDescription");
            return (Criteria) this;
        }

        public Criteria andDictSortIsNull() {
            addCriterion("DICT_SORT is null");
            return (Criteria) this;
        }

        public Criteria andDictSortIsNotNull() {
            addCriterion("DICT_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andDictSortEqualTo(BigDecimal value) {
            addCriterion("DICT_SORT =", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortNotEqualTo(BigDecimal value) {
            addCriterion("DICT_SORT <>", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortGreaterThan(BigDecimal value) {
            addCriterion("DICT_SORT >", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DICT_SORT >=", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortLessThan(BigDecimal value) {
            addCriterion("DICT_SORT <", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DICT_SORT <=", value, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortIn(List<BigDecimal> values) {
            addCriterion("DICT_SORT in", values, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortNotIn(List<BigDecimal> values) {
            addCriterion("DICT_SORT not in", values, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DICT_SORT between", value1, value2, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DICT_SORT not between", value1, value2, "dictSort");
            return (Criteria) this;
        }

        public Criteria andDictRemarksIsNull() {
            addCriterion("DICT_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andDictRemarksIsNotNull() {
            addCriterion("DICT_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andDictRemarksEqualTo(String value) {
            addCriterion("DICT_REMARKS =", value, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksNotEqualTo(String value) {
            addCriterion("DICT_REMARKS <>", value, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksGreaterThan(String value) {
            addCriterion("DICT_REMARKS >", value, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_REMARKS >=", value, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksLessThan(String value) {
            addCriterion("DICT_REMARKS <", value, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksLessThanOrEqualTo(String value) {
            addCriterion("DICT_REMARKS <=", value, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksLike(String value) {
            addCriterion("DICT_REMARKS like", value, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksNotLike(String value) {
            addCriterion("DICT_REMARKS not like", value, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksIn(List<String> values) {
            addCriterion("DICT_REMARKS in", values, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksNotIn(List<String> values) {
            addCriterion("DICT_REMARKS not in", values, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksBetween(String value1, String value2) {
            addCriterion("DICT_REMARKS between", value1, value2, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDictRemarksNotBetween(String value1, String value2) {
            addCriterion("DICT_REMARKS not between", value1, value2, "dictRemarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("DEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("DEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("DEL_FLAG =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("DEL_FLAG <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("DEL_FLAG >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("DEL_FLAG <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("DEL_FLAG like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("DEL_FLAG not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("DEL_FLAG in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("DEL_FLAG not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("DEL_FLAG between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("DEL_FLAG not between", value1, value2, "delFlag");
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