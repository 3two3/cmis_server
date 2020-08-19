package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CmrprExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmrprExample() {
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

        public Criteria andCmKeyIsNull() {
            addCriterion("CM_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCmKeyIsNotNull() {
            addCriterion("CM_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCmKeyEqualTo(Integer value) {
            addCriterion("CM_KEY =", value, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmKeyNotEqualTo(Integer value) {
            addCriterion("CM_KEY <>", value, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmKeyGreaterThan(Integer value) {
            addCriterion("CM_KEY >", value, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_KEY >=", value, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmKeyLessThan(Integer value) {
            addCriterion("CM_KEY <", value, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmKeyLessThanOrEqualTo(Integer value) {
            addCriterion("CM_KEY <=", value, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmKeyIn(List<Integer> values) {
            addCriterion("CM_KEY in", values, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmKeyNotIn(List<Integer> values) {
            addCriterion("CM_KEY not in", values, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmKeyBetween(Integer value1, Integer value2) {
            addCriterion("CM_KEY between", value1, value2, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_KEY not between", value1, value2, "cmKey");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNull() {
            addCriterion("CM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("CM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(String value) {
            addCriterion("CM_ID =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(String value) {
            addCriterion("CM_ID <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(String value) {
            addCriterion("CM_ID >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ID >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(String value) {
            addCriterion("CM_ID <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(String value) {
            addCriterion("CM_ID <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLike(String value) {
            addCriterion("CM_ID like", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotLike(String value) {
            addCriterion("CM_ID not like", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<String> values) {
            addCriterion("CM_ID in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<String> values) {
            addCriterion("CM_ID not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(String value1, String value2) {
            addCriterion("CM_ID between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(String value1, String value2) {
            addCriterion("CM_ID not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmTpyeIsNull() {
            addCriterion("CM_TPYE is null");
            return (Criteria) this;
        }

        public Criteria andCmTpyeIsNotNull() {
            addCriterion("CM_TPYE is not null");
            return (Criteria) this;
        }

        public Criteria andCmTpyeEqualTo(String value) {
            addCriterion("CM_TPYE =", value, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeNotEqualTo(String value) {
            addCriterion("CM_TPYE <>", value, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeGreaterThan(String value) {
            addCriterion("CM_TPYE >", value, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TPYE >=", value, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeLessThan(String value) {
            addCriterion("CM_TPYE <", value, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeLessThanOrEqualTo(String value) {
            addCriterion("CM_TPYE <=", value, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeLike(String value) {
            addCriterion("CM_TPYE like", value, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeNotLike(String value) {
            addCriterion("CM_TPYE not like", value, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeIn(List<String> values) {
            addCriterion("CM_TPYE in", values, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeNotIn(List<String> values) {
            addCriterion("CM_TPYE not in", values, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeBetween(String value1, String value2) {
            addCriterion("CM_TPYE between", value1, value2, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmTpyeNotBetween(String value1, String value2) {
            addCriterion("CM_TPYE not between", value1, value2, "cmTpye");
            return (Criteria) this;
        }

        public Criteria andCmSubIsNull() {
            addCriterion("CM_SUB is null");
            return (Criteria) this;
        }

        public Criteria andCmSubIsNotNull() {
            addCriterion("CM_SUB is not null");
            return (Criteria) this;
        }

        public Criteria andCmSubEqualTo(String value) {
            addCriterion("CM_SUB =", value, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubNotEqualTo(String value) {
            addCriterion("CM_SUB <>", value, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubGreaterThan(String value) {
            addCriterion("CM_SUB >", value, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SUB >=", value, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubLessThan(String value) {
            addCriterion("CM_SUB <", value, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubLessThanOrEqualTo(String value) {
            addCriterion("CM_SUB <=", value, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubLike(String value) {
            addCriterion("CM_SUB like", value, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubNotLike(String value) {
            addCriterion("CM_SUB not like", value, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubIn(List<String> values) {
            addCriterion("CM_SUB in", values, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubNotIn(List<String> values) {
            addCriterion("CM_SUB not in", values, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubBetween(String value1, String value2) {
            addCriterion("CM_SUB between", value1, value2, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmSubNotBetween(String value1, String value2) {
            addCriterion("CM_SUB not between", value1, value2, "cmSub");
            return (Criteria) this;
        }

        public Criteria andCmDateIsNull() {
            addCriterion("CM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmDateIsNotNull() {
            addCriterion("CM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmDateEqualTo(String value) {
            addCriterion("CM_DATE =", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateNotEqualTo(String value) {
            addCriterion("CM_DATE <>", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateGreaterThan(String value) {
            addCriterion("CM_DATE >", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_DATE >=", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateLessThan(String value) {
            addCriterion("CM_DATE <", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateLessThanOrEqualTo(String value) {
            addCriterion("CM_DATE <=", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateLike(String value) {
            addCriterion("CM_DATE like", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateNotLike(String value) {
            addCriterion("CM_DATE not like", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateIn(List<String> values) {
            addCriterion("CM_DATE in", values, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateNotIn(List<String> values) {
            addCriterion("CM_DATE not in", values, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateBetween(String value1, String value2) {
            addCriterion("CM_DATE between", value1, value2, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateNotBetween(String value1, String value2) {
            addCriterion("CM_DATE not between", value1, value2, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmAunitIsNull() {
            addCriterion("CM_AUNIT is null");
            return (Criteria) this;
        }

        public Criteria andCmAunitIsNotNull() {
            addCriterion("CM_AUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCmAunitEqualTo(String value) {
            addCriterion("CM_AUNIT =", value, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitNotEqualTo(String value) {
            addCriterion("CM_AUNIT <>", value, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitGreaterThan(String value) {
            addCriterion("CM_AUNIT >", value, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitGreaterThanOrEqualTo(String value) {
            addCriterion("CM_AUNIT >=", value, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitLessThan(String value) {
            addCriterion("CM_AUNIT <", value, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitLessThanOrEqualTo(String value) {
            addCriterion("CM_AUNIT <=", value, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitLike(String value) {
            addCriterion("CM_AUNIT like", value, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitNotLike(String value) {
            addCriterion("CM_AUNIT not like", value, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitIn(List<String> values) {
            addCriterion("CM_AUNIT in", values, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitNotIn(List<String> values) {
            addCriterion("CM_AUNIT not in", values, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitBetween(String value1, String value2) {
            addCriterion("CM_AUNIT between", value1, value2, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmAunitNotBetween(String value1, String value2) {
            addCriterion("CM_AUNIT not between", value1, value2, "cmAunit");
            return (Criteria) this;
        }

        public Criteria andCmApersonIsNull() {
            addCriterion("CM_APERSON is null");
            return (Criteria) this;
        }

        public Criteria andCmApersonIsNotNull() {
            addCriterion("CM_APERSON is not null");
            return (Criteria) this;
        }

        public Criteria andCmApersonEqualTo(String value) {
            addCriterion("CM_APERSON =", value, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonNotEqualTo(String value) {
            addCriterion("CM_APERSON <>", value, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonGreaterThan(String value) {
            addCriterion("CM_APERSON >", value, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonGreaterThanOrEqualTo(String value) {
            addCriterion("CM_APERSON >=", value, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonLessThan(String value) {
            addCriterion("CM_APERSON <", value, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonLessThanOrEqualTo(String value) {
            addCriterion("CM_APERSON <=", value, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonLike(String value) {
            addCriterion("CM_APERSON like", value, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonNotLike(String value) {
            addCriterion("CM_APERSON not like", value, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonIn(List<String> values) {
            addCriterion("CM_APERSON in", values, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonNotIn(List<String> values) {
            addCriterion("CM_APERSON not in", values, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonBetween(String value1, String value2) {
            addCriterion("CM_APERSON between", value1, value2, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmApersonNotBetween(String value1, String value2) {
            addCriterion("CM_APERSON not between", value1, value2, "cmAperson");
            return (Criteria) this;
        }

        public Criteria andCmRdateIsNull() {
            addCriterion("CM_RDATE is null");
            return (Criteria) this;
        }

        public Criteria andCmRdateIsNotNull() {
            addCriterion("CM_RDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmRdateEqualTo(String value) {
            addCriterion("CM_RDATE =", value, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateNotEqualTo(String value) {
            addCriterion("CM_RDATE <>", value, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateGreaterThan(String value) {
            addCriterion("CM_RDATE >", value, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_RDATE >=", value, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateLessThan(String value) {
            addCriterion("CM_RDATE <", value, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateLessThanOrEqualTo(String value) {
            addCriterion("CM_RDATE <=", value, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateLike(String value) {
            addCriterion("CM_RDATE like", value, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateNotLike(String value) {
            addCriterion("CM_RDATE not like", value, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateIn(List<String> values) {
            addCriterion("CM_RDATE in", values, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateNotIn(List<String> values) {
            addCriterion("CM_RDATE not in", values, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateBetween(String value1, String value2) {
            addCriterion("CM_RDATE between", value1, value2, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmRdateNotBetween(String value1, String value2) {
            addCriterion("CM_RDATE not between", value1, value2, "cmRdate");
            return (Criteria) this;
        }

        public Criteria andCmAreasonIsNull() {
            addCriterion("CM_AREASON is null");
            return (Criteria) this;
        }

        public Criteria andCmAreasonIsNotNull() {
            addCriterion("CM_AREASON is not null");
            return (Criteria) this;
        }

        public Criteria andCmAreasonEqualTo(String value) {
            addCriterion("CM_AREASON =", value, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonNotEqualTo(String value) {
            addCriterion("CM_AREASON <>", value, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonGreaterThan(String value) {
            addCriterion("CM_AREASON >", value, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonGreaterThanOrEqualTo(String value) {
            addCriterion("CM_AREASON >=", value, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonLessThan(String value) {
            addCriterion("CM_AREASON <", value, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonLessThanOrEqualTo(String value) {
            addCriterion("CM_AREASON <=", value, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonLike(String value) {
            addCriterion("CM_AREASON like", value, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonNotLike(String value) {
            addCriterion("CM_AREASON not like", value, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonIn(List<String> values) {
            addCriterion("CM_AREASON in", values, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonNotIn(List<String> values) {
            addCriterion("CM_AREASON not in", values, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonBetween(String value1, String value2) {
            addCriterion("CM_AREASON between", value1, value2, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmAreasonNotBetween(String value1, String value2) {
            addCriterion("CM_AREASON not between", value1, value2, "cmAreason");
            return (Criteria) this;
        }

        public Criteria andCmRemarkIsNull() {
            addCriterion("CM_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCmRemarkIsNotNull() {
            addCriterion("CM_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCmRemarkEqualTo(String value) {
            addCriterion("CM_REMARK =", value, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkNotEqualTo(String value) {
            addCriterion("CM_REMARK <>", value, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkGreaterThan(String value) {
            addCriterion("CM_REMARK >", value, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CM_REMARK >=", value, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkLessThan(String value) {
            addCriterion("CM_REMARK <", value, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkLessThanOrEqualTo(String value) {
            addCriterion("CM_REMARK <=", value, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkLike(String value) {
            addCriterion("CM_REMARK like", value, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkNotLike(String value) {
            addCriterion("CM_REMARK not like", value, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkIn(List<String> values) {
            addCriterion("CM_REMARK in", values, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkNotIn(List<String> values) {
            addCriterion("CM_REMARK not in", values, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkBetween(String value1, String value2) {
            addCriterion("CM_REMARK between", value1, value2, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmRemarkNotBetween(String value1, String value2) {
            addCriterion("CM_REMARK not between", value1, value2, "cmRemark");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentIsNull() {
            addCriterion("CM_ATTACHMENT is null");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentIsNotNull() {
            addCriterion("CM_ATTACHMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentEqualTo(String value) {
            addCriterion("CM_ATTACHMENT =", value, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentNotEqualTo(String value) {
            addCriterion("CM_ATTACHMENT <>", value, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentGreaterThan(String value) {
            addCriterion("CM_ATTACHMENT >", value, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ATTACHMENT >=", value, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentLessThan(String value) {
            addCriterion("CM_ATTACHMENT <", value, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentLessThanOrEqualTo(String value) {
            addCriterion("CM_ATTACHMENT <=", value, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentLike(String value) {
            addCriterion("CM_ATTACHMENT like", value, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentNotLike(String value) {
            addCriterion("CM_ATTACHMENT not like", value, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentIn(List<String> values) {
            addCriterion("CM_ATTACHMENT in", values, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentNotIn(List<String> values) {
            addCriterion("CM_ATTACHMENT not in", values, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentBetween(String value1, String value2) {
            addCriterion("CM_ATTACHMENT between", value1, value2, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmAttachmentNotBetween(String value1, String value2) {
            addCriterion("CM_ATTACHMENT not between", value1, value2, "cmAttachment");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateIsNull() {
            addCriterion("CM_MODIFICATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateIsNotNull() {
            addCriterion("CM_MODIFICATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateEqualTo(String value) {
            addCriterion("CM_MODIFICATION_DATE =", value, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateNotEqualTo(String value) {
            addCriterion("CM_MODIFICATION_DATE <>", value, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateGreaterThan(String value) {
            addCriterion("CM_MODIFICATION_DATE >", value, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_MODIFICATION_DATE >=", value, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateLessThan(String value) {
            addCriterion("CM_MODIFICATION_DATE <", value, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateLessThanOrEqualTo(String value) {
            addCriterion("CM_MODIFICATION_DATE <=", value, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateLike(String value) {
            addCriterion("CM_MODIFICATION_DATE like", value, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateNotLike(String value) {
            addCriterion("CM_MODIFICATION_DATE not like", value, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateIn(List<String> values) {
            addCriterion("CM_MODIFICATION_DATE in", values, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateNotIn(List<String> values) {
            addCriterion("CM_MODIFICATION_DATE not in", values, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateBetween(String value1, String value2) {
            addCriterion("CM_MODIFICATION_DATE between", value1, value2, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationDateNotBetween(String value1, String value2) {
            addCriterion("CM_MODIFICATION_DATE not between", value1, value2, "cmModificationDate");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonIsNull() {
            addCriterion("CM_MODIFICATION_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonIsNotNull() {
            addCriterion("CM_MODIFICATION_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonEqualTo(String value) {
            addCriterion("CM_MODIFICATION_PERSON =", value, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonNotEqualTo(String value) {
            addCriterion("CM_MODIFICATION_PERSON <>", value, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonGreaterThan(String value) {
            addCriterion("CM_MODIFICATION_PERSON >", value, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonGreaterThanOrEqualTo(String value) {
            addCriterion("CM_MODIFICATION_PERSON >=", value, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonLessThan(String value) {
            addCriterion("CM_MODIFICATION_PERSON <", value, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonLessThanOrEqualTo(String value) {
            addCriterion("CM_MODIFICATION_PERSON <=", value, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonLike(String value) {
            addCriterion("CM_MODIFICATION_PERSON like", value, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonNotLike(String value) {
            addCriterion("CM_MODIFICATION_PERSON not like", value, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonIn(List<String> values) {
            addCriterion("CM_MODIFICATION_PERSON in", values, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonNotIn(List<String> values) {
            addCriterion("CM_MODIFICATION_PERSON not in", values, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonBetween(String value1, String value2) {
            addCriterion("CM_MODIFICATION_PERSON between", value1, value2, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmModificationPersonNotBetween(String value1, String value2) {
            addCriterion("CM_MODIFICATION_PERSON not between", value1, value2, "cmModificationPerson");
            return (Criteria) this;
        }

        public Criteria andCmRemarksIsNull() {
            addCriterion("CM_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andCmRemarksIsNotNull() {
            addCriterion("CM_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andCmRemarksEqualTo(String value) {
            addCriterion("CM_REMARKS =", value, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksNotEqualTo(String value) {
            addCriterion("CM_REMARKS <>", value, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksGreaterThan(String value) {
            addCriterion("CM_REMARKS >", value, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("CM_REMARKS >=", value, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksLessThan(String value) {
            addCriterion("CM_REMARKS <", value, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksLessThanOrEqualTo(String value) {
            addCriterion("CM_REMARKS <=", value, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksLike(String value) {
            addCriterion("CM_REMARKS like", value, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksNotLike(String value) {
            addCriterion("CM_REMARKS not like", value, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksIn(List<String> values) {
            addCriterion("CM_REMARKS in", values, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksNotIn(List<String> values) {
            addCriterion("CM_REMARKS not in", values, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksBetween(String value1, String value2) {
            addCriterion("CM_REMARKS between", value1, value2, "cmRemarks");
            return (Criteria) this;
        }

        public Criteria andCmRemarksNotBetween(String value1, String value2) {
            addCriterion("CM_REMARKS not between", value1, value2, "cmRemarks");
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