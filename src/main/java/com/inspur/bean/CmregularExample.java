package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CmregularExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmregularExample() {
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

        public Criteria andCmRegularDateIsNull() {
            addCriterion("CM_REGULAR_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateIsNotNull() {
            addCriterion("CM_REGULAR_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateEqualTo(String value) {
            addCriterion("CM_REGULAR_DATE =", value, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateNotEqualTo(String value) {
            addCriterion("CM_REGULAR_DATE <>", value, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateGreaterThan(String value) {
            addCriterion("CM_REGULAR_DATE >", value, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_REGULAR_DATE >=", value, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateLessThan(String value) {
            addCriterion("CM_REGULAR_DATE <", value, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateLessThanOrEqualTo(String value) {
            addCriterion("CM_REGULAR_DATE <=", value, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateLike(String value) {
            addCriterion("CM_REGULAR_DATE like", value, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateNotLike(String value) {
            addCriterion("CM_REGULAR_DATE not like", value, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateIn(List<String> values) {
            addCriterion("CM_REGULAR_DATE in", values, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateNotIn(List<String> values) {
            addCriterion("CM_REGULAR_DATE not in", values, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateBetween(String value1, String value2) {
            addCriterion("CM_REGULAR_DATE between", value1, value2, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularDateNotBetween(String value1, String value2) {
            addCriterion("CM_REGULAR_DATE not between", value1, value2, "cmRegularDate");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelIsNull() {
            addCriterion("CM_REGULAR_PERSONNEL is null");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelIsNotNull() {
            addCriterion("CM_REGULAR_PERSONNEL is not null");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelEqualTo(String value) {
            addCriterion("CM_REGULAR_PERSONNEL =", value, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelNotEqualTo(String value) {
            addCriterion("CM_REGULAR_PERSONNEL <>", value, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelGreaterThan(String value) {
            addCriterion("CM_REGULAR_PERSONNEL >", value, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("CM_REGULAR_PERSONNEL >=", value, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelLessThan(String value) {
            addCriterion("CM_REGULAR_PERSONNEL <", value, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelLessThanOrEqualTo(String value) {
            addCriterion("CM_REGULAR_PERSONNEL <=", value, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelLike(String value) {
            addCriterion("CM_REGULAR_PERSONNEL like", value, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelNotLike(String value) {
            addCriterion("CM_REGULAR_PERSONNEL not like", value, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelIn(List<String> values) {
            addCriterion("CM_REGULAR_PERSONNEL in", values, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelNotIn(List<String> values) {
            addCriterion("CM_REGULAR_PERSONNEL not in", values, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelBetween(String value1, String value2) {
            addCriterion("CM_REGULAR_PERSONNEL between", value1, value2, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularPersonnelNotBetween(String value1, String value2) {
            addCriterion("CM_REGULAR_PERSONNEL not between", value1, value2, "cmRegularPersonnel");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeIsNull() {
            addCriterion("CM_REGULAR_THEME is null");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeIsNotNull() {
            addCriterion("CM_REGULAR_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeEqualTo(String value) {
            addCriterion("CM_REGULAR_THEME =", value, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeNotEqualTo(String value) {
            addCriterion("CM_REGULAR_THEME <>", value, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeGreaterThan(String value) {
            addCriterion("CM_REGULAR_THEME >", value, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_REGULAR_THEME >=", value, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeLessThan(String value) {
            addCriterion("CM_REGULAR_THEME <", value, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeLessThanOrEqualTo(String value) {
            addCriterion("CM_REGULAR_THEME <=", value, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeLike(String value) {
            addCriterion("CM_REGULAR_THEME like", value, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeNotLike(String value) {
            addCriterion("CM_REGULAR_THEME not like", value, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeIn(List<String> values) {
            addCriterion("CM_REGULAR_THEME in", values, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeNotIn(List<String> values) {
            addCriterion("CM_REGULAR_THEME not in", values, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeBetween(String value1, String value2) {
            addCriterion("CM_REGULAR_THEME between", value1, value2, "cmRegularTheme");
            return (Criteria) this;
        }

        public Criteria andCmRegularThemeNotBetween(String value1, String value2) {
            addCriterion("CM_REGULAR_THEME not between", value1, value2, "cmRegularTheme");
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