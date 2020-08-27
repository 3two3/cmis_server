package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificateExample() {
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

        public Criteria andCmCertificateNameIsNull() {
            addCriterion("CM_CERTIFICATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameIsNotNull() {
            addCriterion("CM_CERTIFICATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NAME =", value, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameNotEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NAME <>", value, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameGreaterThan(String value) {
            addCriterion("CM_CERTIFICATE_NAME >", value, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NAME >=", value, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameLessThan(String value) {
            addCriterion("CM_CERTIFICATE_NAME <", value, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameLessThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NAME <=", value, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameLike(String value) {
            addCriterion("CM_CERTIFICATE_NAME like", value, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameNotLike(String value) {
            addCriterion("CM_CERTIFICATE_NAME not like", value, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_NAME in", values, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameNotIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_NAME not in", values, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_NAME between", value1, value2, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNameNotBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_NAME not between", value1, value2, "cmCertificateName");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeIsNull() {
            addCriterion("CM_CERTIFICATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeIsNotNull() {
            addCriterion("CM_CERTIFICATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_TYPE =", value, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeNotEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_TYPE <>", value, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeGreaterThan(String value) {
            addCriterion("CM_CERTIFICATE_TYPE >", value, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_TYPE >=", value, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeLessThan(String value) {
            addCriterion("CM_CERTIFICATE_TYPE <", value, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_TYPE <=", value, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeLike(String value) {
            addCriterion("CM_CERTIFICATE_TYPE like", value, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeNotLike(String value) {
            addCriterion("CM_CERTIFICATE_TYPE not like", value, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_TYPE in", values, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeNotIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_TYPE not in", values, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_TYPE between", value1, value2, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_TYPE not between", value1, value2, "cmCertificateType");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoIsNull() {
            addCriterion("CM_CERTIFICATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoIsNotNull() {
            addCriterion("CM_CERTIFICATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NO =", value, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoNotEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NO <>", value, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoGreaterThan(String value) {
            addCriterion("CM_CERTIFICATE_NO >", value, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NO >=", value, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoLessThan(String value) {
            addCriterion("CM_CERTIFICATE_NO <", value, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NO <=", value, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoLike(String value) {
            addCriterion("CM_CERTIFICATE_NO like", value, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoNotLike(String value) {
            addCriterion("CM_CERTIFICATE_NO not like", value, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_NO in", values, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoNotIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_NO not in", values, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_NO between", value1, value2, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNoNotBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_NO not between", value1, value2, "cmCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitIsNull() {
            addCriterion("CM_CERTIFICATE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitIsNotNull() {
            addCriterion("CM_CERTIFICATE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_UNIT =", value, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitNotEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_UNIT <>", value, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitGreaterThan(String value) {
            addCriterion("CM_CERTIFICATE_UNIT >", value, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_UNIT >=", value, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitLessThan(String value) {
            addCriterion("CM_CERTIFICATE_UNIT <", value, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitLessThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_UNIT <=", value, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitLike(String value) {
            addCriterion("CM_CERTIFICATE_UNIT like", value, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitNotLike(String value) {
            addCriterion("CM_CERTIFICATE_UNIT not like", value, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_UNIT in", values, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitNotIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_UNIT not in", values, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_UNIT between", value1, value2, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUnitNotBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_UNIT not between", value1, value2, "cmCertificateUnit");
            return (Criteria) this;
        }

        public Criteria andCmStartDateIsNull() {
            addCriterion("CM_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmStartDateIsNotNull() {
            addCriterion("CM_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmStartDateEqualTo(String value) {
            addCriterion("CM_START_DATE =", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateNotEqualTo(String value) {
            addCriterion("CM_START_DATE <>", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateGreaterThan(String value) {
            addCriterion("CM_START_DATE >", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_START_DATE >=", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateLessThan(String value) {
            addCriterion("CM_START_DATE <", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateLessThanOrEqualTo(String value) {
            addCriterion("CM_START_DATE <=", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateLike(String value) {
            addCriterion("CM_START_DATE like", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateNotLike(String value) {
            addCriterion("CM_START_DATE not like", value, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateIn(List<String> values) {
            addCriterion("CM_START_DATE in", values, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateNotIn(List<String> values) {
            addCriterion("CM_START_DATE not in", values, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateBetween(String value1, String value2) {
            addCriterion("CM_START_DATE between", value1, value2, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmStartDateNotBetween(String value1, String value2) {
            addCriterion("CM_START_DATE not between", value1, value2, "cmStartDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateIsNull() {
            addCriterion("CM_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmEndDateIsNotNull() {
            addCriterion("CM_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmEndDateEqualTo(String value) {
            addCriterion("CM_END_DATE =", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateNotEqualTo(String value) {
            addCriterion("CM_END_DATE <>", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateGreaterThan(String value) {
            addCriterion("CM_END_DATE >", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_END_DATE >=", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateLessThan(String value) {
            addCriterion("CM_END_DATE <", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateLessThanOrEqualTo(String value) {
            addCriterion("CM_END_DATE <=", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateLike(String value) {
            addCriterion("CM_END_DATE like", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateNotLike(String value) {
            addCriterion("CM_END_DATE not like", value, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateIn(List<String> values) {
            addCriterion("CM_END_DATE in", values, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateNotIn(List<String> values) {
            addCriterion("CM_END_DATE not in", values, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateBetween(String value1, String value2) {
            addCriterion("CM_END_DATE between", value1, value2, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmEndDateNotBetween(String value1, String value2) {
            addCriterion("CM_END_DATE not between", value1, value2, "cmEndDate");
            return (Criteria) this;
        }

        public Criteria andCmPeriodIsNull() {
            addCriterion("CM_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andCmPeriodIsNotNull() {
            addCriterion("CM_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andCmPeriodEqualTo(Integer value) {
            addCriterion("CM_PERIOD =", value, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmPeriodNotEqualTo(Integer value) {
            addCriterion("CM_PERIOD <>", value, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmPeriodGreaterThan(Integer value) {
            addCriterion("CM_PERIOD >", value, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_PERIOD >=", value, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmPeriodLessThan(Integer value) {
            addCriterion("CM_PERIOD <", value, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("CM_PERIOD <=", value, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmPeriodIn(List<Integer> values) {
            addCriterion("CM_PERIOD in", values, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmPeriodNotIn(List<Integer> values) {
            addCriterion("CM_PERIOD not in", values, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmPeriodBetween(Integer value1, Integer value2) {
            addCriterion("CM_PERIOD between", value1, value2, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_PERIOD not between", value1, value2, "cmPeriod");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlIsNull() {
            addCriterion("CM_CERTIFICATE_URL is null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlIsNotNull() {
            addCriterion("CM_CERTIFICATE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_URL =", value, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlNotEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_URL <>", value, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlGreaterThan(String value) {
            addCriterion("CM_CERTIFICATE_URL >", value, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_URL >=", value, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlLessThan(String value) {
            addCriterion("CM_CERTIFICATE_URL <", value, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlLessThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_URL <=", value, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlLike(String value) {
            addCriterion("CM_CERTIFICATE_URL like", value, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlNotLike(String value) {
            addCriterion("CM_CERTIFICATE_URL not like", value, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_URL in", values, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlNotIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_URL not in", values, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_URL between", value1, value2, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmCertificateUrlNotBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_URL not between", value1, value2, "cmCertificateUrl");
            return (Criteria) this;
        }

        public Criteria andCmInvalidIsNull() {
            addCriterion("CM_INVALID is null");
            return (Criteria) this;
        }

        public Criteria andCmInvalidIsNotNull() {
            addCriterion("CM_INVALID is not null");
            return (Criteria) this;
        }

        public Criteria andCmInvalidEqualTo(String value) {
            addCriterion("CM_INVALID =", value, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidNotEqualTo(String value) {
            addCriterion("CM_INVALID <>", value, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidGreaterThan(String value) {
            addCriterion("CM_INVALID >", value, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_INVALID >=", value, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidLessThan(String value) {
            addCriterion("CM_INVALID <", value, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidLessThanOrEqualTo(String value) {
            addCriterion("CM_INVALID <=", value, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidLike(String value) {
            addCriterion("CM_INVALID like", value, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidNotLike(String value) {
            addCriterion("CM_INVALID not like", value, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidIn(List<String> values) {
            addCriterion("CM_INVALID in", values, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidNotIn(List<String> values) {
            addCriterion("CM_INVALID not in", values, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidBetween(String value1, String value2) {
            addCriterion("CM_INVALID between", value1, value2, "cmInvalid");
            return (Criteria) this;
        }

        public Criteria andCmInvalidNotBetween(String value1, String value2) {
            addCriterion("CM_INVALID not between", value1, value2, "cmInvalid");
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