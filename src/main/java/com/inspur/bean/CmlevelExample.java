package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CmlevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmlevelExample() {
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

        public Criteria andCmHoldDateIsNull() {
            addCriterion("CM_HOLD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateIsNotNull() {
            addCriterion("CM_HOLD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateEqualTo(String value) {
            addCriterion("CM_HOLD_DATE =", value, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateNotEqualTo(String value) {
            addCriterion("CM_HOLD_DATE <>", value, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateGreaterThan(String value) {
            addCriterion("CM_HOLD_DATE >", value, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_HOLD_DATE >=", value, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateLessThan(String value) {
            addCriterion("CM_HOLD_DATE <", value, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateLessThanOrEqualTo(String value) {
            addCriterion("CM_HOLD_DATE <=", value, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateLike(String value) {
            addCriterion("CM_HOLD_DATE like", value, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateNotLike(String value) {
            addCriterion("CM_HOLD_DATE not like", value, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateIn(List<String> values) {
            addCriterion("CM_HOLD_DATE in", values, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateNotIn(List<String> values) {
            addCriterion("CM_HOLD_DATE not in", values, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateBetween(String value1, String value2) {
            addCriterion("CM_HOLD_DATE between", value1, value2, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldDateNotBetween(String value1, String value2) {
            addCriterion("CM_HOLD_DATE not between", value1, value2, "cmHoldDate");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelIsNull() {
            addCriterion("CM_HOLD_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelIsNotNull() {
            addCriterion("CM_HOLD_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelEqualTo(String value) {
            addCriterion("CM_HOLD_LEVEL =", value, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelNotEqualTo(String value) {
            addCriterion("CM_HOLD_LEVEL <>", value, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelGreaterThan(String value) {
            addCriterion("CM_HOLD_LEVEL >", value, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CM_HOLD_LEVEL >=", value, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelLessThan(String value) {
            addCriterion("CM_HOLD_LEVEL <", value, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelLessThanOrEqualTo(String value) {
            addCriterion("CM_HOLD_LEVEL <=", value, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelLike(String value) {
            addCriterion("CM_HOLD_LEVEL like", value, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelNotLike(String value) {
            addCriterion("CM_HOLD_LEVEL not like", value, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelIn(List<String> values) {
            addCriterion("CM_HOLD_LEVEL in", values, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelNotIn(List<String> values) {
            addCriterion("CM_HOLD_LEVEL not in", values, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelBetween(String value1, String value2) {
            addCriterion("CM_HOLD_LEVEL between", value1, value2, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldLevelNotBetween(String value1, String value2) {
            addCriterion("CM_HOLD_LEVEL not between", value1, value2, "cmHoldLevel");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeIsNull() {
            addCriterion("CM_HOLD_TPYE is null");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeIsNotNull() {
            addCriterion("CM_HOLD_TPYE is not null");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeEqualTo(String value) {
            addCriterion("CM_HOLD_TPYE =", value, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeNotEqualTo(String value) {
            addCriterion("CM_HOLD_TPYE <>", value, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeGreaterThan(String value) {
            addCriterion("CM_HOLD_TPYE >", value, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_HOLD_TPYE >=", value, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeLessThan(String value) {
            addCriterion("CM_HOLD_TPYE <", value, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeLessThanOrEqualTo(String value) {
            addCriterion("CM_HOLD_TPYE <=", value, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeLike(String value) {
            addCriterion("CM_HOLD_TPYE like", value, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeNotLike(String value) {
            addCriterion("CM_HOLD_TPYE not like", value, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeIn(List<String> values) {
            addCriterion("CM_HOLD_TPYE in", values, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeNotIn(List<String> values) {
            addCriterion("CM_HOLD_TPYE not in", values, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeBetween(String value1, String value2) {
            addCriterion("CM_HOLD_TPYE between", value1, value2, "cmHoldTpye");
            return (Criteria) this;
        }

        public Criteria andCmHoldTpyeNotBetween(String value1, String value2) {
            addCriterion("CM_HOLD_TPYE not between", value1, value2, "cmHoldTpye");
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