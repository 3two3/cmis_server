package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CmarketingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmarketingRecordExample() {
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

        public Criteria andCKeyIsNull() {
            addCriterion("C_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCKeyIsNotNull() {
            addCriterion("C_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCKeyEqualTo(Integer value) {
            addCriterion("C_KEY =", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotEqualTo(Integer value) {
            addCriterion("C_KEY <>", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyGreaterThan(Integer value) {
            addCriterion("C_KEY >", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_KEY >=", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyLessThan(Integer value) {
            addCriterion("C_KEY <", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyLessThanOrEqualTo(Integer value) {
            addCriterion("C_KEY <=", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyIn(List<Integer> values) {
            addCriterion("C_KEY in", values, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotIn(List<Integer> values) {
            addCriterion("C_KEY not in", values, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyBetween(Integer value1, Integer value2) {
            addCriterion("C_KEY between", value1, value2, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("C_KEY not between", value1, value2, "cKey");
            return (Criteria) this;
        }

        public Criteria andCCmIdIsNull() {
            addCriterion("C_CM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCmIdIsNotNull() {
            addCriterion("C_CM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCmIdEqualTo(Integer value) {
            addCriterion("C_CM_ID =", value, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdNotEqualTo(Integer value) {
            addCriterion("C_CM_ID <>", value, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdGreaterThan(Integer value) {
            addCriterion("C_CM_ID >", value, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_CM_ID >=", value, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdLessThan(Integer value) {
            addCriterion("C_CM_ID <", value, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_CM_ID <=", value, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdLike(Integer value) {
            addCriterion("C_CM_ID like", value, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdNotLike(Integer value) {
            addCriterion("C_CM_ID not like", value, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdIn(List<Integer> values) {
            addCriterion("C_CM_ID in", values, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdNotIn(List<Integer> values) {
            addCriterion("C_CM_ID not in", values, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdBetween(Integer value1, Integer value2) {
            addCriterion("C_CM_ID between", value1, value2, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_CM_ID not between", value1, value2, "cCmId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCManagementIsNull() {
            addCriterion("C_MANAGEMENT is null");
            return (Criteria) this;
        }

        public Criteria andCManagementIsNotNull() {
            addCriterion("C_MANAGEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCManagementEqualTo(String value) {
            addCriterion("C_MANAGEMENT =", value, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementNotEqualTo(String value) {
            addCriterion("C_MANAGEMENT <>", value, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementGreaterThan(String value) {
            addCriterion("C_MANAGEMENT >", value, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementGreaterThanOrEqualTo(String value) {
            addCriterion("C_MANAGEMENT >=", value, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementLessThan(String value) {
            addCriterion("C_MANAGEMENT <", value, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementLessThanOrEqualTo(String value) {
            addCriterion("C_MANAGEMENT <=", value, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementLike(String value) {
            addCriterion("C_MANAGEMENT like", value, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementNotLike(String value) {
            addCriterion("C_MANAGEMENT not like", value, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementIn(List<String> values) {
            addCriterion("C_MANAGEMENT in", values, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementNotIn(List<String> values) {
            addCriterion("C_MANAGEMENT not in", values, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementBetween(String value1, String value2) {
            addCriterion("C_MANAGEMENT between", value1, value2, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCManagementNotBetween(String value1, String value2) {
            addCriterion("C_MANAGEMENT not between", value1, value2, "cManagement");
            return (Criteria) this;
        }

        public Criteria andCDemandIsNull() {
            addCriterion("C_DEMAND is null");
            return (Criteria) this;
        }

        public Criteria andCDemandIsNotNull() {
            addCriterion("C_DEMAND is not null");
            return (Criteria) this;
        }

        public Criteria andCDemandEqualTo(String value) {
            addCriterion("C_DEMAND =", value, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandNotEqualTo(String value) {
            addCriterion("C_DEMAND <>", value, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandGreaterThan(String value) {
            addCriterion("C_DEMAND >", value, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandGreaterThanOrEqualTo(String value) {
            addCriterion("C_DEMAND >=", value, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandLessThan(String value) {
            addCriterion("C_DEMAND <", value, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandLessThanOrEqualTo(String value) {
            addCriterion("C_DEMAND <=", value, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandLike(String value) {
            addCriterion("C_DEMAND like", value, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandNotLike(String value) {
            addCriterion("C_DEMAND not like", value, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandIn(List<String> values) {
            addCriterion("C_DEMAND in", values, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandNotIn(List<String> values) {
            addCriterion("C_DEMAND not in", values, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandBetween(String value1, String value2) {
            addCriterion("C_DEMAND between", value1, value2, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCDemandNotBetween(String value1, String value2) {
            addCriterion("C_DEMAND not between", value1, value2, "cDemand");
            return (Criteria) this;
        }

        public Criteria andCReportIsNull() {
            addCriterion("C_REPORT is null");
            return (Criteria) this;
        }

        public Criteria andCReportIsNotNull() {
            addCriterion("C_REPORT is not null");
            return (Criteria) this;
        }

        public Criteria andCReportEqualTo(String value) {
            addCriterion("C_REPORT =", value, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportNotEqualTo(String value) {
            addCriterion("C_REPORT <>", value, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportGreaterThan(String value) {
            addCriterion("C_REPORT >", value, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportGreaterThanOrEqualTo(String value) {
            addCriterion("C_REPORT >=", value, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportLessThan(String value) {
            addCriterion("C_REPORT <", value, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportLessThanOrEqualTo(String value) {
            addCriterion("C_REPORT <=", value, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportLike(String value) {
            addCriterion("C_REPORT like", value, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportNotLike(String value) {
            addCriterion("C_REPORT not like", value, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportIn(List<String> values) {
            addCriterion("C_REPORT in", values, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportNotIn(List<String> values) {
            addCriterion("C_REPORT not in", values, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportBetween(String value1, String value2) {
            addCriterion("C_REPORT between", value1, value2, "cReport");
            return (Criteria) this;
        }

        public Criteria andCReportNotBetween(String value1, String value2) {
            addCriterion("C_REPORT not between", value1, value2, "cReport");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsIsNull() {
            addCriterion("C_TESTIMONIALS is null");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsIsNotNull() {
            addCriterion("C_TESTIMONIALS is not null");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsEqualTo(String value) {
            addCriterion("C_TESTIMONIALS =", value, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsNotEqualTo(String value) {
            addCriterion("C_TESTIMONIALS <>", value, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsGreaterThan(String value) {
            addCriterion("C_TESTIMONIALS >", value, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsGreaterThanOrEqualTo(String value) {
            addCriterion("C_TESTIMONIALS >=", value, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsLessThan(String value) {
            addCriterion("C_TESTIMONIALS <", value, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsLessThanOrEqualTo(String value) {
            addCriterion("C_TESTIMONIALS <=", value, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsLike(String value) {
            addCriterion("C_TESTIMONIALS like", value, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsNotLike(String value) {
            addCriterion("C_TESTIMONIALS not like", value, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsIn(List<String> values) {
            addCriterion("C_TESTIMONIALS in", values, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsNotIn(List<String> values) {
            addCriterion("C_TESTIMONIALS not in", values, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsBetween(String value1, String value2) {
            addCriterion("C_TESTIMONIALS between", value1, value2, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCTestimonialsNotBetween(String value1, String value2) {
            addCriterion("C_TESTIMONIALS not between", value1, value2, "cTestimonials");
            return (Criteria) this;
        }

        public Criteria andCEvaluationIsNull() {
            addCriterion("C_EVALUATION is null");
            return (Criteria) this;
        }

        public Criteria andCEvaluationIsNotNull() {
            addCriterion("C_EVALUATION is not null");
            return (Criteria) this;
        }

        public Criteria andCEvaluationEqualTo(String value) {
            addCriterion("C_EVALUATION =", value, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationNotEqualTo(String value) {
            addCriterion("C_EVALUATION <>", value, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationGreaterThan(String value) {
            addCriterion("C_EVALUATION >", value, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("C_EVALUATION >=", value, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationLessThan(String value) {
            addCriterion("C_EVALUATION <", value, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationLessThanOrEqualTo(String value) {
            addCriterion("C_EVALUATION <=", value, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationLike(String value) {
            addCriterion("C_EVALUATION like", value, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationNotLike(String value) {
            addCriterion("C_EVALUATION not like", value, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationIn(List<String> values) {
            addCriterion("C_EVALUATION in", values, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationNotIn(List<String> values) {
            addCriterion("C_EVALUATION not in", values, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationBetween(String value1, String value2) {
            addCriterion("C_EVALUATION between", value1, value2, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCEvaluationNotBetween(String value1, String value2) {
            addCriterion("C_EVALUATION not between", value1, value2, "cEvaluation");
            return (Criteria) this;
        }

        public Criteria andCDateIsNull() {
            addCriterion("C_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCDateIsNotNull() {
            addCriterion("C_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCDateEqualTo(String value) {
            addCriterion("C_DATE =", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotEqualTo(String value) {
            addCriterion("C_DATE <>", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateGreaterThan(String value) {
            addCriterion("C_DATE >", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateGreaterThanOrEqualTo(String value) {
            addCriterion("C_DATE >=", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateLessThan(String value) {
            addCriterion("C_DATE <", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateLessThanOrEqualTo(String value) {
            addCriterion("C_DATE <=", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateLike(String value) {
            addCriterion("C_DATE like", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotLike(String value) {
            addCriterion("C_DATE not like", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateIn(List<String> values) {
            addCriterion("C_DATE in", values, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotIn(List<String> values) {
            addCriterion("C_DATE not in", values, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateBetween(String value1, String value2) {
            addCriterion("C_DATE between", value1, value2, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotBetween(String value1, String value2) {
            addCriterion("C_DATE not between", value1, value2, "cDate");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(Integer value) {
            addCriterion("C_ID like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(Integer value) {
            addCriterion("C_ID not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCRemarksIsNull() {
            addCriterion("C_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andCRemarksIsNotNull() {
            addCriterion("C_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andCRemarksEqualTo(String value) {
            addCriterion("C_REMARKS =", value, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksNotEqualTo(String value) {
            addCriterion("C_REMARKS <>", value, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksGreaterThan(String value) {
            addCriterion("C_REMARKS >", value, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("C_REMARKS >=", value, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksLessThan(String value) {
            addCriterion("C_REMARKS <", value, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksLessThanOrEqualTo(String value) {
            addCriterion("C_REMARKS <=", value, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksLike(String value) {
            addCriterion("C_REMARKS like", value, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksNotLike(String value) {
            addCriterion("C_REMARKS not like", value, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksIn(List<String> values) {
            addCriterion("C_REMARKS in", values, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksNotIn(List<String> values) {
            addCriterion("C_REMARKS not in", values, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksBetween(String value1, String value2) {
            addCriterion("C_REMARKS between", value1, value2, "cRemarks");
            return (Criteria) this;
        }

        public Criteria andCRemarksNotBetween(String value1, String value2) {
            addCriterion("C_REMARKS not between", value1, value2, "cRemarks");
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