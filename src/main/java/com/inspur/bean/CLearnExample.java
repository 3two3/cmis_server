package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CLearnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CLearnExample() {
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

        public Criteria andLKeyIsNull() {
            addCriterion("L_KEY is null");
            return (Criteria) this;
        }

        public Criteria andLKeyIsNotNull() {
            addCriterion("L_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andLKeyEqualTo(Integer value) {
            addCriterion("L_KEY =", value, "lKey");
            return (Criteria) this;
        }

        public Criteria andLKeyNotEqualTo(Integer value) {
            addCriterion("L_KEY <>", value, "lKey");
            return (Criteria) this;
        }

        public Criteria andLKeyGreaterThan(Integer value) {
            addCriterion("L_KEY >", value, "lKey");
            return (Criteria) this;
        }

        public Criteria andLKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("L_KEY >=", value, "lKey");
            return (Criteria) this;
        }

        public Criteria andLKeyLessThan(Integer value) {
            addCriterion("L_KEY <", value, "lKey");
            return (Criteria) this;
        }

        public Criteria andLKeyLessThanOrEqualTo(Integer value) {
            addCriterion("L_KEY <=", value, "lKey");
            return (Criteria) this;
        }

        public Criteria andLKeyIn(List<Integer> values) {
            addCriterion("L_KEY in", values, "lKey");
            return (Criteria) this;
        }

        public Criteria andLKeyNotIn(List<Integer> values) {
            addCriterion("L_KEY not in", values, "lKey");
            return (Criteria) this;
        }

        public Criteria andLKeyBetween(Integer value1, Integer value2) {
            addCriterion("L_KEY between", value1, value2, "lKey");
            return (Criteria) this;
        }

        public Criteria andLKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("L_KEY not between", value1, value2, "lKey");
            return (Criteria) this;
        }

        public Criteria andLNameIsNull() {
            addCriterion("L_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLNameIsNotNull() {
            addCriterion("L_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLNameEqualTo(String value) {
            addCriterion("L_NAME =", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotEqualTo(String value) {
            addCriterion("L_NAME <>", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThan(String value) {
            addCriterion("L_NAME >", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThanOrEqualTo(String value) {
            addCriterion("L_NAME >=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThan(String value) {
            addCriterion("L_NAME <", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThanOrEqualTo(String value) {
            addCriterion("L_NAME <=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLike(String value) {
            addCriterion("L_NAME like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotLike(String value) {
            addCriterion("L_NAME not like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameIn(List<String> values) {
            addCriterion("L_NAME in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotIn(List<String> values) {
            addCriterion("L_NAME not in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameBetween(String value1, String value2) {
            addCriterion("L_NAME between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotBetween(String value1, String value2) {
            addCriterion("L_NAME not between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLTypeIsNull() {
            addCriterion("L_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLTypeIsNotNull() {
            addCriterion("L_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLTypeEqualTo(String value) {
            addCriterion("L_TYPE =", value, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeNotEqualTo(String value) {
            addCriterion("L_TYPE <>", value, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeGreaterThan(String value) {
            addCriterion("L_TYPE >", value, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeGreaterThanOrEqualTo(String value) {
            addCriterion("L_TYPE >=", value, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeLessThan(String value) {
            addCriterion("L_TYPE <", value, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeLessThanOrEqualTo(String value) {
            addCriterion("L_TYPE <=", value, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeLike(String value) {
            addCriterion("L_TYPE like", value, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeNotLike(String value) {
            addCriterion("L_TYPE not like", value, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeIn(List<String> values) {
            addCriterion("L_TYPE in", values, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeNotIn(List<String> values) {
            addCriterion("L_TYPE not in", values, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeBetween(String value1, String value2) {
            addCriterion("L_TYPE between", value1, value2, "lType");
            return (Criteria) this;
        }

        public Criteria andLTypeNotBetween(String value1, String value2) {
            addCriterion("L_TYPE not between", value1, value2, "lType");
            return (Criteria) this;
        }

        public Criteria andLDesIsNull() {
            addCriterion("L_DES is null");
            return (Criteria) this;
        }

        public Criteria andLDesIsNotNull() {
            addCriterion("L_DES is not null");
            return (Criteria) this;
        }

        public Criteria andLDesEqualTo(String value) {
            addCriterion("L_DES =", value, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesNotEqualTo(String value) {
            addCriterion("L_DES <>", value, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesGreaterThan(String value) {
            addCriterion("L_DES >", value, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesGreaterThanOrEqualTo(String value) {
            addCriterion("L_DES >=", value, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesLessThan(String value) {
            addCriterion("L_DES <", value, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesLessThanOrEqualTo(String value) {
            addCriterion("L_DES <=", value, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesLike(String value) {
            addCriterion("L_DES like", value, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesNotLike(String value) {
            addCriterion("L_DES not like", value, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesIn(List<String> values) {
            addCriterion("L_DES in", values, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesNotIn(List<String> values) {
            addCriterion("L_DES not in", values, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesBetween(String value1, String value2) {
            addCriterion("L_DES between", value1, value2, "lDes");
            return (Criteria) this;
        }

        public Criteria andLDesNotBetween(String value1, String value2) {
            addCriterion("L_DES not between", value1, value2, "lDes");
            return (Criteria) this;
        }

        public Criteria andLUrlIsNull() {
            addCriterion("L_URL is null");
            return (Criteria) this;
        }

        public Criteria andLUrlIsNotNull() {
            addCriterion("L_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLUrlEqualTo(String value) {
            addCriterion("L_URL =", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotEqualTo(String value) {
            addCriterion("L_URL <>", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlGreaterThan(String value) {
            addCriterion("L_URL >", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlGreaterThanOrEqualTo(String value) {
            addCriterion("L_URL >=", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLessThan(String value) {
            addCriterion("L_URL <", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLessThanOrEqualTo(String value) {
            addCriterion("L_URL <=", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLike(String value) {
            addCriterion("L_URL like", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotLike(String value) {
            addCriterion("L_URL not like", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlIn(List<String> values) {
            addCriterion("L_URL in", values, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotIn(List<String> values) {
            addCriterion("L_URL not in", values, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlBetween(String value1, String value2) {
            addCriterion("L_URL between", value1, value2, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotBetween(String value1, String value2) {
            addCriterion("L_URL not between", value1, value2, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLLineIsNull() {
            addCriterion("L_LINE is null");
            return (Criteria) this;
        }

        public Criteria andLLineIsNotNull() {
            addCriterion("L_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andLLineEqualTo(String value) {
            addCriterion("L_LINE =", value, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineNotEqualTo(String value) {
            addCriterion("L_LINE <>", value, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineGreaterThan(String value) {
            addCriterion("L_LINE >", value, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineGreaterThanOrEqualTo(String value) {
            addCriterion("L_LINE >=", value, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineLessThan(String value) {
            addCriterion("L_LINE <", value, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineLessThanOrEqualTo(String value) {
            addCriterion("L_LINE <=", value, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineLike(String value) {
            addCriterion("L_LINE like", value, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineNotLike(String value) {
            addCriterion("L_LINE not like", value, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineIn(List<String> values) {
            addCriterion("L_LINE in", values, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineNotIn(List<String> values) {
            addCriterion("L_LINE not in", values, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineBetween(String value1, String value2) {
            addCriterion("L_LINE between", value1, value2, "lLine");
            return (Criteria) this;
        }

        public Criteria andLLineNotBetween(String value1, String value2) {
            addCriterion("L_LINE not between", value1, value2, "lLine");
            return (Criteria) this;
        }

        public Criteria andLUperIsNull() {
            addCriterion("L_UPER is null");
            return (Criteria) this;
        }

        public Criteria andLUperIsNotNull() {
            addCriterion("L_UPER is not null");
            return (Criteria) this;
        }

        public Criteria andLUperEqualTo(Integer value) {
            addCriterion("L_UPER =", value, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperNotEqualTo(Integer value) {
            addCriterion("L_UPER <>", value, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperGreaterThan(Integer value) {
            addCriterion("L_UPER >", value, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperGreaterThanOrEqualTo(Integer value) {
            addCriterion("L_UPER >=", value, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperLessThan(Integer value) {
            addCriterion("L_UPER <", value, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperLessThanOrEqualTo(Integer value) {
            addCriterion("L_UPER <=", value, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperLike(Integer value) {
            addCriterion("L_UPER like", value, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperNotLike(Integer value) {
            addCriterion("L_UPER not like", value, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperIn(List<Integer> values) {
            addCriterion("L_UPER in", values, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperNotIn(List<Integer> values) {
            addCriterion("L_UPER not in", values, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperBetween(Integer value1, Integer value2) {
            addCriterion("L_UPER between", value1, value2, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUperNotBetween(Integer value1, Integer value2) {
            addCriterion("L_UPER not between", value1, value2, "lUper");
            return (Criteria) this;
        }

        public Criteria andLUnitIsNull() {
            addCriterion("L_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andLUnitIsNotNull() {
            addCriterion("L_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andLUnitEqualTo(String value) {
            addCriterion("L_UNIT =", value, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitNotEqualTo(String value) {
            addCriterion("L_UNIT <>", value, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitGreaterThan(String value) {
            addCriterion("L_UNIT >", value, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitGreaterThanOrEqualTo(String value) {
            addCriterion("L_UNIT >=", value, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitLessThan(String value) {
            addCriterion("L_UNIT <", value, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitLessThanOrEqualTo(String value) {
            addCriterion("L_UNIT <=", value, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitLike(String value) {
            addCriterion("L_UNIT like", value, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitNotLike(String value) {
            addCriterion("L_UNIT not like", value, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitIn(List<String> values) {
            addCriterion("L_UNIT in", values, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitNotIn(List<String> values) {
            addCriterion("L_UNIT not in", values, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitBetween(String value1, String value2) {
            addCriterion("L_UNIT between", value1, value2, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLUnitNotBetween(String value1, String value2) {
            addCriterion("L_UNIT not between", value1, value2, "lUnit");
            return (Criteria) this;
        }

        public Criteria andLDateIsNull() {
            addCriterion("L_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLDateIsNotNull() {
            addCriterion("L_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLDateEqualTo(String value) {
            addCriterion("L_DATE =", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotEqualTo(String value) {
            addCriterion("L_DATE <>", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateGreaterThan(String value) {
            addCriterion("L_DATE >", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateGreaterThanOrEqualTo(String value) {
            addCriterion("L_DATE >=", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateLessThan(String value) {
            addCriterion("L_DATE <", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateLessThanOrEqualTo(String value) {
            addCriterion("L_DATE <=", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateLike(String value) {
            addCriterion("L_DATE like", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotLike(String value) {
            addCriterion("L_DATE not like", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateIn(List<String> values) {
            addCriterion("L_DATE in", values, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotIn(List<String> values) {
            addCriterion("L_DATE not in", values, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateBetween(String value1, String value2) {
            addCriterion("L_DATE between", value1, value2, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotBetween(String value1, String value2) {
            addCriterion("L_DATE not between", value1, value2, "lDate");
            return (Criteria) this;
        }

        public Criteria andLRemarksIsNull() {
            addCriterion("L_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andLRemarksIsNotNull() {
            addCriterion("L_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andLRemarksEqualTo(String value) {
            addCriterion("L_REMARKS =", value, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksNotEqualTo(String value) {
            addCriterion("L_REMARKS <>", value, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksGreaterThan(String value) {
            addCriterion("L_REMARKS >", value, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("L_REMARKS >=", value, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksLessThan(String value) {
            addCriterion("L_REMARKS <", value, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksLessThanOrEqualTo(String value) {
            addCriterion("L_REMARKS <=", value, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksLike(String value) {
            addCriterion("L_REMARKS like", value, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksNotLike(String value) {
            addCriterion("L_REMARKS not like", value, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksIn(List<String> values) {
            addCriterion("L_REMARKS in", values, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksNotIn(List<String> values) {
            addCriterion("L_REMARKS not in", values, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksBetween(String value1, String value2) {
            addCriterion("L_REMARKS between", value1, value2, "lRemarks");
            return (Criteria) this;
        }

        public Criteria andLRemarksNotBetween(String value1, String value2) {
            addCriterion("L_REMARKS not between", value1, value2, "lRemarks");
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