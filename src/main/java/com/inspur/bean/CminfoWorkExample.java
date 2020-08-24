package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CminfoWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CminfoWorkExample() {
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

        public Criteria andCmManagementIsNull() {
            addCriterion("CM_MANAGEMENT is null");
            return (Criteria) this;
        }

        public Criteria andCmManagementIsNotNull() {
            addCriterion("CM_MANAGEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCmManagementEqualTo(String value) {
            addCriterion("CM_MANAGEMENT =", value, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementNotEqualTo(String value) {
            addCriterion("CM_MANAGEMENT <>", value, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementGreaterThan(String value) {
            addCriterion("CM_MANAGEMENT >", value, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementGreaterThanOrEqualTo(String value) {
            addCriterion("CM_MANAGEMENT >=", value, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementLessThan(String value) {
            addCriterion("CM_MANAGEMENT <", value, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementLessThanOrEqualTo(String value) {
            addCriterion("CM_MANAGEMENT <=", value, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementLike(String value) {
            addCriterion("CM_MANAGEMENT like", value, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementNotLike(String value) {
            addCriterion("CM_MANAGEMENT not like", value, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementIn(List<String> values) {
            addCriterion("CM_MANAGEMENT in", values, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementNotIn(List<String> values) {
            addCriterion("CM_MANAGEMENT not in", values, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementBetween(String value1, String value2) {
            addCriterion("CM_MANAGEMENT between", value1, value2, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmManagementNotBetween(String value1, String value2) {
            addCriterion("CM_MANAGEMENT not between", value1, value2, "cmManagement");
            return (Criteria) this;
        }

        public Criteria andCmProductIsNull() {
            addCriterion("CM_PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andCmProductIsNotNull() {
            addCriterion("CM_PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andCmProductEqualTo(String value) {
            addCriterion("CM_PRODUCT =", value, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductNotEqualTo(String value) {
            addCriterion("CM_PRODUCT <>", value, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductGreaterThan(String value) {
            addCriterion("CM_PRODUCT >", value, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PRODUCT >=", value, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductLessThan(String value) {
            addCriterion("CM_PRODUCT <", value, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductLessThanOrEqualTo(String value) {
            addCriterion("CM_PRODUCT <=", value, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductLike(String value) {
            addCriterion("CM_PRODUCT like", value, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductNotLike(String value) {
            addCriterion("CM_PRODUCT not like", value, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductIn(List<String> values) {
            addCriterion("CM_PRODUCT in", values, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductNotIn(List<String> values) {
            addCriterion("CM_PRODUCT not in", values, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductBetween(String value1, String value2) {
            addCriterion("CM_PRODUCT between", value1, value2, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmProductNotBetween(String value1, String value2) {
            addCriterion("CM_PRODUCT not between", value1, value2, "cmProduct");
            return (Criteria) this;
        }

        public Criteria andCmLoanIsNull() {
            addCriterion("CM_LOAN is null");
            return (Criteria) this;
        }

        public Criteria andCmLoanIsNotNull() {
            addCriterion("CM_LOAN is not null");
            return (Criteria) this;
        }

        public Criteria andCmLoanEqualTo(String value) {
            addCriterion("CM_LOAN =", value, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanNotEqualTo(String value) {
            addCriterion("CM_LOAN <>", value, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanGreaterThan(String value) {
            addCriterion("CM_LOAN >", value, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LOAN >=", value, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanLessThan(String value) {
            addCriterion("CM_LOAN <", value, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanLessThanOrEqualTo(String value) {
            addCriterion("CM_LOAN <=", value, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanLike(String value) {
            addCriterion("CM_LOAN like", value, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanNotLike(String value) {
            addCriterion("CM_LOAN not like", value, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanIn(List<String> values) {
            addCriterion("CM_LOAN in", values, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanNotIn(List<String> values) {
            addCriterion("CM_LOAN not in", values, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanBetween(String value1, String value2) {
            addCriterion("CM_LOAN between", value1, value2, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmLoanNotBetween(String value1, String value2) {
            addCriterion("CM_LOAN not between", value1, value2, "cmLoan");
            return (Criteria) this;
        }

        public Criteria andCmWarningIsNull() {
            addCriterion("CM_WARNING is null");
            return (Criteria) this;
        }

        public Criteria andCmWarningIsNotNull() {
            addCriterion("CM_WARNING is not null");
            return (Criteria) this;
        }

        public Criteria andCmWarningEqualTo(String value) {
            addCriterion("CM_WARNING =", value, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningNotEqualTo(String value) {
            addCriterion("CM_WARNING <>", value, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningGreaterThan(String value) {
            addCriterion("CM_WARNING >", value, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningGreaterThanOrEqualTo(String value) {
            addCriterion("CM_WARNING >=", value, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningLessThan(String value) {
            addCriterion("CM_WARNING <", value, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningLessThanOrEqualTo(String value) {
            addCriterion("CM_WARNING <=", value, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningLike(String value) {
            addCriterion("CM_WARNING like", value, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningNotLike(String value) {
            addCriterion("CM_WARNING not like", value, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningIn(List<String> values) {
            addCriterion("CM_WARNING in", values, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningNotIn(List<String> values) {
            addCriterion("CM_WARNING not in", values, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningBetween(String value1, String value2) {
            addCriterion("CM_WARNING between", value1, value2, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmWarningNotBetween(String value1, String value2) {
            addCriterion("CM_WARNING not between", value1, value2, "cmWarning");
            return (Criteria) this;
        }

        public Criteria andCmIssueIsNull() {
            addCriterion("CM_ISSUE is null");
            return (Criteria) this;
        }

        public Criteria andCmIssueIsNotNull() {
            addCriterion("CM_ISSUE is not null");
            return (Criteria) this;
        }

        public Criteria andCmIssueEqualTo(String value) {
            addCriterion("CM_ISSUE =", value, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueNotEqualTo(String value) {
            addCriterion("CM_ISSUE <>", value, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueGreaterThan(String value) {
            addCriterion("CM_ISSUE >", value, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ISSUE >=", value, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueLessThan(String value) {
            addCriterion("CM_ISSUE <", value, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueLessThanOrEqualTo(String value) {
            addCriterion("CM_ISSUE <=", value, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueLike(String value) {
            addCriterion("CM_ISSUE like", value, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueNotLike(String value) {
            addCriterion("CM_ISSUE not like", value, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueIn(List<String> values) {
            addCriterion("CM_ISSUE in", values, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueNotIn(List<String> values) {
            addCriterion("CM_ISSUE not in", values, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueBetween(String value1, String value2) {
            addCriterion("CM_ISSUE between", value1, value2, "cmIssue");
            return (Criteria) this;
        }

        public Criteria andCmIssueNotBetween(String value1, String value2) {
            addCriterion("CM_ISSUE not between", value1, value2, "cmIssue");
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