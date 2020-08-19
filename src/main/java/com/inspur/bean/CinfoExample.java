package com.inspur.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CinfoExample() {
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

        public Criteria andCSsnIsNull() {
            addCriterion("C_SSN is null");
            return (Criteria) this;
        }

        public Criteria andCSsnIsNotNull() {
            addCriterion("C_SSN is not null");
            return (Criteria) this;
        }

        public Criteria andCSsnEqualTo(String value) {
            addCriterion("C_SSN =", value, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnNotEqualTo(String value) {
            addCriterion("C_SSN <>", value, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnGreaterThan(String value) {
            addCriterion("C_SSN >", value, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnGreaterThanOrEqualTo(String value) {
            addCriterion("C_SSN >=", value, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnLessThan(String value) {
            addCriterion("C_SSN <", value, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnLessThanOrEqualTo(String value) {
            addCriterion("C_SSN <=", value, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnLike(String value) {
            addCriterion("C_SSN like", value, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnNotLike(String value) {
            addCriterion("C_SSN not like", value, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnIn(List<String> values) {
            addCriterion("C_SSN in", values, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnNotIn(List<String> values) {
            addCriterion("C_SSN not in", values, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnBetween(String value1, String value2) {
            addCriterion("C_SSN between", value1, value2, "cSsn");
            return (Criteria) this;
        }

        public Criteria andCSsnNotBetween(String value1, String value2) {
            addCriterion("C_SSN not between", value1, value2, "cSsn");
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

        public Criteria andCTelIsNull() {
            addCriterion("C_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCTelIsNotNull() {
            addCriterion("C_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCTelEqualTo(String value) {
            addCriterion("C_TEL =", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotEqualTo(String value) {
            addCriterion("C_TEL <>", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelGreaterThan(String value) {
            addCriterion("C_TEL >", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelGreaterThanOrEqualTo(String value) {
            addCriterion("C_TEL >=", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelLessThan(String value) {
            addCriterion("C_TEL <", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelLessThanOrEqualTo(String value) {
            addCriterion("C_TEL <=", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelLike(String value) {
            addCriterion("C_TEL like", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotLike(String value) {
            addCriterion("C_TEL not like", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelIn(List<String> values) {
            addCriterion("C_TEL in", values, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotIn(List<String> values) {
            addCriterion("C_TEL not in", values, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelBetween(String value1, String value2) {
            addCriterion("C_TEL between", value1, value2, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotBetween(String value1, String value2) {
            addCriterion("C_TEL not between", value1, value2, "cTel");
            return (Criteria) this;
        }

        public Criteria andCSalaryIsNull() {
            addCriterion("C_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andCSalaryIsNotNull() {
            addCriterion("C_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andCSalaryEqualTo(BigDecimal value) {
            addCriterion("C_SALARY =", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryNotEqualTo(BigDecimal value) {
            addCriterion("C_SALARY <>", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryGreaterThan(BigDecimal value) {
            addCriterion("C_SALARY >", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("C_SALARY >=", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryLessThan(BigDecimal value) {
            addCriterion("C_SALARY <", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("C_SALARY <=", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryIn(List<BigDecimal> values) {
            addCriterion("C_SALARY in", values, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryNotIn(List<BigDecimal> values) {
            addCriterion("C_SALARY not in", values, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_SALARY between", value1, value2, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_SALARY not between", value1, value2, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCBalanceIsNull() {
            addCriterion("C_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andCBalanceIsNotNull() {
            addCriterion("C_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCBalanceEqualTo(BigDecimal value) {
            addCriterion("C_BALANCE =", value, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCBalanceNotEqualTo(BigDecimal value) {
            addCriterion("C_BALANCE <>", value, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCBalanceGreaterThan(BigDecimal value) {
            addCriterion("C_BALANCE >", value, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("C_BALANCE >=", value, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCBalanceLessThan(BigDecimal value) {
            addCriterion("C_BALANCE <", value, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("C_BALANCE <=", value, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCBalanceIn(List<BigDecimal> values) {
            addCriterion("C_BALANCE in", values, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCBalanceNotIn(List<BigDecimal> values) {
            addCriterion("C_BALANCE not in", values, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_BALANCE between", value1, value2, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_BALANCE not between", value1, value2, "cBalance");
            return (Criteria) this;
        }

        public Criteria andCDebtIsNull() {
            addCriterion("C_DEBT is null");
            return (Criteria) this;
        }

        public Criteria andCDebtIsNotNull() {
            addCriterion("C_DEBT is not null");
            return (Criteria) this;
        }

        public Criteria andCDebtEqualTo(BigDecimal value) {
            addCriterion("C_DEBT =", value, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCDebtNotEqualTo(BigDecimal value) {
            addCriterion("C_DEBT <>", value, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCDebtGreaterThan(BigDecimal value) {
            addCriterion("C_DEBT >", value, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("C_DEBT >=", value, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCDebtLessThan(BigDecimal value) {
            addCriterion("C_DEBT <", value, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("C_DEBT <=", value, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCDebtIn(List<BigDecimal> values) {
            addCriterion("C_DEBT in", values, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCDebtNotIn(List<BigDecimal> values) {
            addCriterion("C_DEBT not in", values, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_DEBT between", value1, value2, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_DEBT not between", value1, value2, "cDebt");
            return (Criteria) this;
        }

        public Criteria andCBusinessIsNull() {
            addCriterion("C_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andCBusinessIsNotNull() {
            addCriterion("C_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andCBusinessEqualTo(String value) {
            addCriterion("C_BUSINESS =", value, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessNotEqualTo(String value) {
            addCriterion("C_BUSINESS <>", value, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessGreaterThan(String value) {
            addCriterion("C_BUSINESS >", value, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("C_BUSINESS >=", value, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessLessThan(String value) {
            addCriterion("C_BUSINESS <", value, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessLessThanOrEqualTo(String value) {
            addCriterion("C_BUSINESS <=", value, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessLike(String value) {
            addCriterion("C_BUSINESS like", value, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessNotLike(String value) {
            addCriterion("C_BUSINESS not like", value, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessIn(List<String> values) {
            addCriterion("C_BUSINESS in", values, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessNotIn(List<String> values) {
            addCriterion("C_BUSINESS not in", values, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessBetween(String value1, String value2) {
            addCriterion("C_BUSINESS between", value1, value2, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCBusinessNotBetween(String value1, String value2) {
            addCriterion("C_BUSINESS not between", value1, value2, "cBusiness");
            return (Criteria) this;
        }

        public Criteria andCUnitIsNull() {
            addCriterion("C_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCUnitIsNotNull() {
            addCriterion("C_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCUnitEqualTo(String value) {
            addCriterion("C_UNIT =", value, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitNotEqualTo(String value) {
            addCriterion("C_UNIT <>", value, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitGreaterThan(String value) {
            addCriterion("C_UNIT >", value, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitGreaterThanOrEqualTo(String value) {
            addCriterion("C_UNIT >=", value, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitLessThan(String value) {
            addCriterion("C_UNIT <", value, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitLessThanOrEqualTo(String value) {
            addCriterion("C_UNIT <=", value, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitLike(String value) {
            addCriterion("C_UNIT like", value, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitNotLike(String value) {
            addCriterion("C_UNIT not like", value, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitIn(List<String> values) {
            addCriterion("C_UNIT in", values, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitNotIn(List<String> values) {
            addCriterion("C_UNIT not in", values, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitBetween(String value1, String value2) {
            addCriterion("C_UNIT between", value1, value2, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCUnitNotBetween(String value1, String value2) {
            addCriterion("C_UNIT not between", value1, value2, "cUnit");
            return (Criteria) this;
        }

        public Criteria andCAddIsNull() {
            addCriterion("C_ADD is null");
            return (Criteria) this;
        }

        public Criteria andCAddIsNotNull() {
            addCriterion("C_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andCAddEqualTo(String value) {
            addCriterion("C_ADD =", value, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddNotEqualTo(String value) {
            addCriterion("C_ADD <>", value, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddGreaterThan(String value) {
            addCriterion("C_ADD >", value, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddGreaterThanOrEqualTo(String value) {
            addCriterion("C_ADD >=", value, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddLessThan(String value) {
            addCriterion("C_ADD <", value, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddLessThanOrEqualTo(String value) {
            addCriterion("C_ADD <=", value, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddLike(String value) {
            addCriterion("C_ADD like", value, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddNotLike(String value) {
            addCriterion("C_ADD not like", value, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddIn(List<String> values) {
            addCriterion("C_ADD in", values, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddNotIn(List<String> values) {
            addCriterion("C_ADD not in", values, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddBetween(String value1, String value2) {
            addCriterion("C_ADD between", value1, value2, "cAdd");
            return (Criteria) this;
        }

        public Criteria andCAddNotBetween(String value1, String value2) {
            addCriterion("C_ADD not between", value1, value2, "cAdd");
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