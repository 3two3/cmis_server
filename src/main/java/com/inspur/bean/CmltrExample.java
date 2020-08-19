package com.inspur.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CmltrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmltrExample() {
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

        public Criteria andCmTdateIsNull() {
            addCriterion("CM_TDATE is null");
            return (Criteria) this;
        }

        public Criteria andCmTdateIsNotNull() {
            addCriterion("CM_TDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmTdateEqualTo(String value) {
            addCriterion("CM_TDATE =", value, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateNotEqualTo(String value) {
            addCriterion("CM_TDATE <>", value, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateGreaterThan(String value) {
            addCriterion("CM_TDATE >", value, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TDATE >=", value, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateLessThan(String value) {
            addCriterion("CM_TDATE <", value, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateLessThanOrEqualTo(String value) {
            addCriterion("CM_TDATE <=", value, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateLike(String value) {
            addCriterion("CM_TDATE like", value, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateNotLike(String value) {
            addCriterion("CM_TDATE not like", value, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateIn(List<String> values) {
            addCriterion("CM_TDATE in", values, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateNotIn(List<String> values) {
            addCriterion("CM_TDATE not in", values, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateBetween(String value1, String value2) {
            addCriterion("CM_TDATE between", value1, value2, "cmTdate");
            return (Criteria) this;
        }

        public Criteria andCmTdateNotBetween(String value1, String value2) {
            addCriterion("CM_TDATE not between", value1, value2, "cmTdate");
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

        public Criteria andCmTunitIsNull() {
            addCriterion("CM_TUNIT is null");
            return (Criteria) this;
        }

        public Criteria andCmTunitIsNotNull() {
            addCriterion("CM_TUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCmTunitEqualTo(String value) {
            addCriterion("CM_TUNIT =", value, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitNotEqualTo(String value) {
            addCriterion("CM_TUNIT <>", value, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitGreaterThan(String value) {
            addCriterion("CM_TUNIT >", value, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TUNIT >=", value, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitLessThan(String value) {
            addCriterion("CM_TUNIT <", value, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitLessThanOrEqualTo(String value) {
            addCriterion("CM_TUNIT <=", value, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitLike(String value) {
            addCriterion("CM_TUNIT like", value, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitNotLike(String value) {
            addCriterion("CM_TUNIT not like", value, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitIn(List<String> values) {
            addCriterion("CM_TUNIT in", values, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitNotIn(List<String> values) {
            addCriterion("CM_TUNIT not in", values, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitBetween(String value1, String value2) {
            addCriterion("CM_TUNIT between", value1, value2, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmTunitNotBetween(String value1, String value2) {
            addCriterion("CM_TUNIT not between", value1, value2, "cmTunit");
            return (Criteria) this;
        }

        public Criteria andCmStartdateIsNull() {
            addCriterion("CM_STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andCmStartdateIsNotNull() {
            addCriterion("CM_STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmStartdateEqualTo(String value) {
            addCriterion("CM_STARTDATE =", value, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateNotEqualTo(String value) {
            addCriterion("CM_STARTDATE <>", value, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateGreaterThan(String value) {
            addCriterion("CM_STARTDATE >", value, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_STARTDATE >=", value, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateLessThan(String value) {
            addCriterion("CM_STARTDATE <", value, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateLessThanOrEqualTo(String value) {
            addCriterion("CM_STARTDATE <=", value, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateLike(String value) {
            addCriterion("CM_STARTDATE like", value, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateNotLike(String value) {
            addCriterion("CM_STARTDATE not like", value, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateIn(List<String> values) {
            addCriterion("CM_STARTDATE in", values, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateNotIn(List<String> values) {
            addCriterion("CM_STARTDATE not in", values, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateBetween(String value1, String value2) {
            addCriterion("CM_STARTDATE between", value1, value2, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmStartdateNotBetween(String value1, String value2) {
            addCriterion("CM_STARTDATE not between", value1, value2, "cmStartdate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateIsNull() {
            addCriterion("CM_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andCmEnddateIsNotNull() {
            addCriterion("CM_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmEnddateEqualTo(String value) {
            addCriterion("CM_ENDDATE =", value, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateNotEqualTo(String value) {
            addCriterion("CM_ENDDATE <>", value, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateGreaterThan(String value) {
            addCriterion("CM_ENDDATE >", value, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ENDDATE >=", value, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateLessThan(String value) {
            addCriterion("CM_ENDDATE <", value, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateLessThanOrEqualTo(String value) {
            addCriterion("CM_ENDDATE <=", value, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateLike(String value) {
            addCriterion("CM_ENDDATE like", value, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateNotLike(String value) {
            addCriterion("CM_ENDDATE not like", value, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateIn(List<String> values) {
            addCriterion("CM_ENDDATE in", values, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateNotIn(List<String> values) {
            addCriterion("CM_ENDDATE not in", values, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateBetween(String value1, String value2) {
            addCriterion("CM_ENDDATE between", value1, value2, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmEnddateNotBetween(String value1, String value2) {
            addCriterion("CM_ENDDATE not between", value1, value2, "cmEnddate");
            return (Criteria) this;
        }

        public Criteria andCmKnowIsNull() {
            addCriterion("CM_KNOW is null");
            return (Criteria) this;
        }

        public Criteria andCmKnowIsNotNull() {
            addCriterion("CM_KNOW is not null");
            return (Criteria) this;
        }

        public Criteria andCmKnowEqualTo(String value) {
            addCriterion("CM_KNOW =", value, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowNotEqualTo(String value) {
            addCriterion("CM_KNOW <>", value, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowGreaterThan(String value) {
            addCriterion("CM_KNOW >", value, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowGreaterThanOrEqualTo(String value) {
            addCriterion("CM_KNOW >=", value, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowLessThan(String value) {
            addCriterion("CM_KNOW <", value, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowLessThanOrEqualTo(String value) {
            addCriterion("CM_KNOW <=", value, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowLike(String value) {
            addCriterion("CM_KNOW like", value, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowNotLike(String value) {
            addCriterion("CM_KNOW not like", value, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowIn(List<String> values) {
            addCriterion("CM_KNOW in", values, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowNotIn(List<String> values) {
            addCriterion("CM_KNOW not in", values, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowBetween(String value1, String value2) {
            addCriterion("CM_KNOW between", value1, value2, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmKnowNotBetween(String value1, String value2) {
            addCriterion("CM_KNOW not between", value1, value2, "cmKnow");
            return (Criteria) this;
        }

        public Criteria andCmCreditIsNull() {
            addCriterion("CM_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andCmCreditIsNotNull() {
            addCriterion("CM_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCmCreditEqualTo(Integer value) {
            addCriterion("CM_CREDIT =", value, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmCreditNotEqualTo(Integer value) {
            addCriterion("CM_CREDIT <>", value, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmCreditGreaterThan(Integer value) {
            addCriterion("CM_CREDIT >", value, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_CREDIT >=", value, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmCreditLessThan(Integer value) {
            addCriterion("CM_CREDIT <", value, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmCreditLessThanOrEqualTo(Integer value) {
            addCriterion("CM_CREDIT <=", value, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmCreditIn(List<Integer> values) {
            addCriterion("CM_CREDIT in", values, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmCreditNotIn(List<Integer> values) {
            addCriterion("CM_CREDIT not in", values, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmCreditBetween(Integer value1, Integer value2) {
            addCriterion("CM_CREDIT between", value1, value2, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_CREDIT not between", value1, value2, "cmCredit");
            return (Criteria) this;
        }

        public Criteria andCmScoreIsNull() {
            addCriterion("CM_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andCmScoreIsNotNull() {
            addCriterion("CM_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andCmScoreEqualTo(BigDecimal value) {
            addCriterion("CM_SCORE =", value, "cmScore");
            return (Criteria) this;
        }

        public Criteria andCmScoreNotEqualTo(BigDecimal value) {
            addCriterion("CM_SCORE <>", value, "cmScore");
            return (Criteria) this;
        }

        public Criteria andCmScoreGreaterThan(BigDecimal value) {
            addCriterion("CM_SCORE >", value, "cmScore");
            return (Criteria) this;
        }

        public Criteria andCmScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CM_SCORE >=", value, "cmScore");
            return (Criteria) this;
        }

        public Criteria andCmScoreLessThan(BigDecimal value) {
            addCriterion("CM_SCORE <", value, "cmScore");
            return (Criteria) this;
        }

        public Criteria andCmScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CM_SCORE <=", value, "cmScore");
            return (Criteria) this;
        }

        public Criteria andCmScoreIn(List<BigDecimal> values) {
            addCriterion("CM_SCORE in", values, "cmScore");
            return (Criteria) this;
        }

        public Criteria andCmScoreNotIn(List<BigDecimal> values) {
            addCriterion("CM_SCORE not in", values, "cmScore");
            return (Criteria) this;
        }

        public Criteria andCmScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CM_SCORE between", value1, value2, "cmScore");
            return (Criteria) this;
        }

        public Criteria andCmScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CM_SCORE not between", value1, value2, "cmScore");
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