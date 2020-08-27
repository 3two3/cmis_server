package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CmassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmassExample() {
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

        public Criteria andCmIdEqualTo(Integer value) {
            addCriterion("CM_ID =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Integer value) {
            addCriterion("CM_ID <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Integer value) {
            addCriterion("CM_ID >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ID >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Integer value) {
            addCriterion("CM_ID <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ID <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLike(Integer value) {
            addCriterion("CM_ID like", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotLike(Integer value) {
            addCriterion("CM_ID not like", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Integer> values) {
            addCriterion("CM_ID in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Integer> values) {
            addCriterion("CM_ID not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeIsNull() {
            addCriterion("CM_ASSTIME is null");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeIsNotNull() {
            addCriterion("CM_ASSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeEqualTo(String value) {
            addCriterion("CM_ASSTIME =", value, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeNotEqualTo(String value) {
            addCriterion("CM_ASSTIME <>", value, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeGreaterThan(String value) {
            addCriterion("CM_ASSTIME >", value, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ASSTIME >=", value, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeLessThan(String value) {
            addCriterion("CM_ASSTIME <", value, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeLessThanOrEqualTo(String value) {
            addCriterion("CM_ASSTIME <=", value, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeLike(String value) {
            addCriterion("CM_ASSTIME like", value, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeNotLike(String value) {
            addCriterion("CM_ASSTIME not like", value, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeIn(List<String> values) {
            addCriterion("CM_ASSTIME in", values, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeNotIn(List<String> values) {
            addCriterion("CM_ASSTIME not in", values, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeBetween(String value1, String value2) {
            addCriterion("CM_ASSTIME between", value1, value2, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAsstimeNotBetween(String value1, String value2) {
            addCriterion("CM_ASSTIME not between", value1, value2, "cmAsstime");
            return (Criteria) this;
        }

        public Criteria andCmAssubIsNull() {
            addCriterion("CM_ASSUB is null");
            return (Criteria) this;
        }

        public Criteria andCmAssubIsNotNull() {
            addCriterion("CM_ASSUB is not null");
            return (Criteria) this;
        }

        public Criteria andCmAssubEqualTo(String value) {
            addCriterion("CM_ASSUB =", value, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubNotEqualTo(String value) {
            addCriterion("CM_ASSUB <>", value, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubGreaterThan(String value) {
            addCriterion("CM_ASSUB >", value, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ASSUB >=", value, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubLessThan(String value) {
            addCriterion("CM_ASSUB <", value, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubLessThanOrEqualTo(String value) {
            addCriterion("CM_ASSUB <=", value, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubLike(String value) {
            addCriterion("CM_ASSUB like", value, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubNotLike(String value) {
            addCriterion("CM_ASSUB not like", value, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubIn(List<String> values) {
            addCriterion("CM_ASSUB in", values, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubNotIn(List<String> values) {
            addCriterion("CM_ASSUB not in", values, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubBetween(String value1, String value2) {
            addCriterion("CM_ASSUB between", value1, value2, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssubNotBetween(String value1, String value2) {
            addCriterion("CM_ASSUB not between", value1, value2, "cmAssub");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodIsNull() {
            addCriterion("CM_ASSPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodIsNotNull() {
            addCriterion("CM_ASSPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodEqualTo(String value) {
            addCriterion("CM_ASSPERIOD =", value, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodNotEqualTo(String value) {
            addCriterion("CM_ASSPERIOD <>", value, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodGreaterThan(String value) {
            addCriterion("CM_ASSPERIOD >", value, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ASSPERIOD >=", value, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodLessThan(String value) {
            addCriterion("CM_ASSPERIOD <", value, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodLessThanOrEqualTo(String value) {
            addCriterion("CM_ASSPERIOD <=", value, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodLike(String value) {
            addCriterion("CM_ASSPERIOD like", value, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodNotLike(String value) {
            addCriterion("CM_ASSPERIOD not like", value, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodIn(List<String> values) {
            addCriterion("CM_ASSPERIOD in", values, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodNotIn(List<String> values) {
            addCriterion("CM_ASSPERIOD not in", values, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodBetween(String value1, String value2) {
            addCriterion("CM_ASSPERIOD between", value1, value2, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssperiodNotBetween(String value1, String value2) {
            addCriterion("CM_ASSPERIOD not between", value1, value2, "cmAssperiod");
            return (Criteria) this;
        }

        public Criteria andCmAssresultIsNull() {
            addCriterion("CM_ASSRESULT is null");
            return (Criteria) this;
        }

        public Criteria andCmAssresultIsNotNull() {
            addCriterion("CM_ASSRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCmAssresultEqualTo(String value) {
            addCriterion("CM_ASSRESULT =", value, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultNotEqualTo(String value) {
            addCriterion("CM_ASSRESULT <>", value, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultGreaterThan(String value) {
            addCriterion("CM_ASSRESULT >", value, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ASSRESULT >=", value, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultLessThan(String value) {
            addCriterion("CM_ASSRESULT <", value, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultLessThanOrEqualTo(String value) {
            addCriterion("CM_ASSRESULT <=", value, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultLike(String value) {
            addCriterion("CM_ASSRESULT like", value, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultNotLike(String value) {
            addCriterion("CM_ASSRESULT not like", value, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultIn(List<String> values) {
            addCriterion("CM_ASSRESULT in", values, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultNotIn(List<String> values) {
            addCriterion("CM_ASSRESULT not in", values, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultBetween(String value1, String value2) {
            addCriterion("CM_ASSRESULT between", value1, value2, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAssresultNotBetween(String value1, String value2) {
            addCriterion("CM_ASSRESULT not between", value1, value2, "cmAssresult");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalIsNull() {
            addCriterion("CM_APPRAISAL is null");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalIsNotNull() {
            addCriterion("CM_APPRAISAL is not null");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalEqualTo(String value) {
            addCriterion("CM_APPRAISAL =", value, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalNotEqualTo(String value) {
            addCriterion("CM_APPRAISAL <>", value, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalGreaterThan(String value) {
            addCriterion("CM_APPRAISAL >", value, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalGreaterThanOrEqualTo(String value) {
            addCriterion("CM_APPRAISAL >=", value, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalLessThan(String value) {
            addCriterion("CM_APPRAISAL <", value, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalLessThanOrEqualTo(String value) {
            addCriterion("CM_APPRAISAL <=", value, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalLike(String value) {
            addCriterion("CM_APPRAISAL like", value, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalNotLike(String value) {
            addCriterion("CM_APPRAISAL not like", value, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalIn(List<String> values) {
            addCriterion("CM_APPRAISAL in", values, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalNotIn(List<String> values) {
            addCriterion("CM_APPRAISAL not in", values, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalBetween(String value1, String value2) {
            addCriterion("CM_APPRAISAL between", value1, value2, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAppraisalNotBetween(String value1, String value2) {
            addCriterion("CM_APPRAISAL not between", value1, value2, "cmAppraisal");
            return (Criteria) this;
        }

        public Criteria andCmAssunitIsNull() {
            addCriterion("CM_ASSUNIT is null");
            return (Criteria) this;
        }

        public Criteria andCmAssunitIsNotNull() {
            addCriterion("CM_ASSUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCmAssunitEqualTo(String value) {
            addCriterion("CM_ASSUNIT =", value, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitNotEqualTo(String value) {
            addCriterion("CM_ASSUNIT <>", value, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitGreaterThan(String value) {
            addCriterion("CM_ASSUNIT >", value, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ASSUNIT >=", value, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitLessThan(String value) {
            addCriterion("CM_ASSUNIT <", value, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitLessThanOrEqualTo(String value) {
            addCriterion("CM_ASSUNIT <=", value, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitLike(String value) {
            addCriterion("CM_ASSUNIT like", value, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitNotLike(String value) {
            addCriterion("CM_ASSUNIT not like", value, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitIn(List<String> values) {
            addCriterion("CM_ASSUNIT in", values, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitNotIn(List<String> values) {
            addCriterion("CM_ASSUNIT not in", values, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitBetween(String value1, String value2) {
            addCriterion("CM_ASSUNIT between", value1, value2, "cmAssunit");
            return (Criteria) this;
        }

        public Criteria andCmAssunitNotBetween(String value1, String value2) {
            addCriterion("CM_ASSUNIT not between", value1, value2, "cmAssunit");
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