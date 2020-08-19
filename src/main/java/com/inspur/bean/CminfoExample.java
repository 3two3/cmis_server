package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CminfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CminfoExample() {
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

        public Criteria andCmNameIsNull() {
            addCriterion("CM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmNameIsNotNull() {
            addCriterion("CM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmNameEqualTo(String value) {
            addCriterion("CM_NAME =", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotEqualTo(String value) {
            addCriterion("CM_NAME <>", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThan(String value) {
            addCriterion("CM_NAME >", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_NAME >=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThan(String value) {
            addCriterion("CM_NAME <", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThanOrEqualTo(String value) {
            addCriterion("CM_NAME <=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLike(String value) {
            addCriterion("CM_NAME like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotLike(String value) {
            addCriterion("CM_NAME not like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameIn(List<String> values) {
            addCriterion("CM_NAME in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotIn(List<String> values) {
            addCriterion("CM_NAME not in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameBetween(String value1, String value2) {
            addCriterion("CM_NAME between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotBetween(String value1, String value2) {
            addCriterion("CM_NAME not between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmSexIsNull() {
            addCriterion("CM_SEX is null");
            return (Criteria) this;
        }

        public Criteria andCmSexIsNotNull() {
            addCriterion("CM_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andCmSexEqualTo(String value) {
            addCriterion("CM_SEX =", value, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexNotEqualTo(String value) {
            addCriterion("CM_SEX <>", value, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexGreaterThan(String value) {
            addCriterion("CM_SEX >", value, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SEX >=", value, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexLessThan(String value) {
            addCriterion("CM_SEX <", value, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexLessThanOrEqualTo(String value) {
            addCriterion("CM_SEX <=", value, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexLike(String value) {
            addCriterion("CM_SEX like", value, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexNotLike(String value) {
            addCriterion("CM_SEX not like", value, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexIn(List<String> values) {
            addCriterion("CM_SEX in", values, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexNotIn(List<String> values) {
            addCriterion("CM_SEX not in", values, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexBetween(String value1, String value2) {
            addCriterion("CM_SEX between", value1, value2, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSexNotBetween(String value1, String value2) {
            addCriterion("CM_SEX not between", value1, value2, "cmSex");
            return (Criteria) this;
        }

        public Criteria andCmSsnIsNull() {
            addCriterion("CM_SSN is null");
            return (Criteria) this;
        }

        public Criteria andCmSsnIsNotNull() {
            addCriterion("CM_SSN is not null");
            return (Criteria) this;
        }

        public Criteria andCmSsnEqualTo(String value) {
            addCriterion("CM_SSN =", value, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnNotEqualTo(String value) {
            addCriterion("CM_SSN <>", value, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnGreaterThan(String value) {
            addCriterion("CM_SSN >", value, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SSN >=", value, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnLessThan(String value) {
            addCriterion("CM_SSN <", value, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnLessThanOrEqualTo(String value) {
            addCriterion("CM_SSN <=", value, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnLike(String value) {
            addCriterion("CM_SSN like", value, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnNotLike(String value) {
            addCriterion("CM_SSN not like", value, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnIn(List<String> values) {
            addCriterion("CM_SSN in", values, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnNotIn(List<String> values) {
            addCriterion("CM_SSN not in", values, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnBetween(String value1, String value2) {
            addCriterion("CM_SSN between", value1, value2, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmSsnNotBetween(String value1, String value2) {
            addCriterion("CM_SSN not between", value1, value2, "cmSsn");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayIsNull() {
            addCriterion("CM_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayIsNotNull() {
            addCriterion("CM_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayEqualTo(String value) {
            addCriterion("CM_BIRTHDAY =", value, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayNotEqualTo(String value) {
            addCriterion("CM_BIRTHDAY <>", value, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayGreaterThan(String value) {
            addCriterion("CM_BIRTHDAY >", value, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("CM_BIRTHDAY >=", value, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayLessThan(String value) {
            addCriterion("CM_BIRTHDAY <", value, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayLessThanOrEqualTo(String value) {
            addCriterion("CM_BIRTHDAY <=", value, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayLike(String value) {
            addCriterion("CM_BIRTHDAY like", value, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayNotLike(String value) {
            addCriterion("CM_BIRTHDAY not like", value, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayIn(List<String> values) {
            addCriterion("CM_BIRTHDAY in", values, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayNotIn(List<String> values) {
            addCriterion("CM_BIRTHDAY not in", values, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayBetween(String value1, String value2) {
            addCriterion("CM_BIRTHDAY between", value1, value2, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmBirthdayNotBetween(String value1, String value2) {
            addCriterion("CM_BIRTHDAY not between", value1, value2, "cmBirthday");
            return (Criteria) this;
        }

        public Criteria andCmAgeIsNull() {
            addCriterion("CM_AGE is null");
            return (Criteria) this;
        }

        public Criteria andCmAgeIsNotNull() {
            addCriterion("CM_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andCmAgeEqualTo(Integer value) {
            addCriterion("CM_AGE =", value, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmAgeNotEqualTo(Integer value) {
            addCriterion("CM_AGE <>", value, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmAgeGreaterThan(Integer value) {
            addCriterion("CM_AGE >", value, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_AGE >=", value, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmAgeLessThan(Integer value) {
            addCriterion("CM_AGE <", value, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmAgeLessThanOrEqualTo(Integer value) {
            addCriterion("CM_AGE <=", value, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmAgeIn(List<Integer> values) {
            addCriterion("CM_AGE in", values, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmAgeNotIn(List<Integer> values) {
            addCriterion("CM_AGE not in", values, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmAgeBetween(Integer value1, Integer value2) {
            addCriterion("CM_AGE between", value1, value2, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_AGE not between", value1, value2, "cmAge");
            return (Criteria) this;
        }

        public Criteria andCmNationIsNull() {
            addCriterion("CM_NATION is null");
            return (Criteria) this;
        }

        public Criteria andCmNationIsNotNull() {
            addCriterion("CM_NATION is not null");
            return (Criteria) this;
        }

        public Criteria andCmNationEqualTo(String value) {
            addCriterion("CM_NATION =", value, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationNotEqualTo(String value) {
            addCriterion("CM_NATION <>", value, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationGreaterThan(String value) {
            addCriterion("CM_NATION >", value, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationGreaterThanOrEqualTo(String value) {
            addCriterion("CM_NATION >=", value, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationLessThan(String value) {
            addCriterion("CM_NATION <", value, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationLessThanOrEqualTo(String value) {
            addCriterion("CM_NATION <=", value, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationLike(String value) {
            addCriterion("CM_NATION like", value, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationNotLike(String value) {
            addCriterion("CM_NATION not like", value, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationIn(List<String> values) {
            addCriterion("CM_NATION in", values, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationNotIn(List<String> values) {
            addCriterion("CM_NATION not in", values, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationBetween(String value1, String value2) {
            addCriterion("CM_NATION between", value1, value2, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmNationNotBetween(String value1, String value2) {
            addCriterion("CM_NATION not between", value1, value2, "cmNation");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeIsNull() {
            addCriterion("CM_POLITICAL_LANDSCAPE is null");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeIsNotNull() {
            addCriterion("CM_POLITICAL_LANDSCAPE is not null");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeEqualTo(String value) {
            addCriterion("CM_POLITICAL_LANDSCAPE =", value, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeNotEqualTo(String value) {
            addCriterion("CM_POLITICAL_LANDSCAPE <>", value, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeGreaterThan(String value) {
            addCriterion("CM_POLITICAL_LANDSCAPE >", value, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_POLITICAL_LANDSCAPE >=", value, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeLessThan(String value) {
            addCriterion("CM_POLITICAL_LANDSCAPE <", value, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeLessThanOrEqualTo(String value) {
            addCriterion("CM_POLITICAL_LANDSCAPE <=", value, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeLike(String value) {
            addCriterion("CM_POLITICAL_LANDSCAPE like", value, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeNotLike(String value) {
            addCriterion("CM_POLITICAL_LANDSCAPE not like", value, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeIn(List<String> values) {
            addCriterion("CM_POLITICAL_LANDSCAPE in", values, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeNotIn(List<String> values) {
            addCriterion("CM_POLITICAL_LANDSCAPE not in", values, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeBetween(String value1, String value2) {
            addCriterion("CM_POLITICAL_LANDSCAPE between", value1, value2, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmPoliticalLandscapeNotBetween(String value1, String value2) {
            addCriterion("CM_POLITICAL_LANDSCAPE not between", value1, value2, "cmPoliticalLandscape");
            return (Criteria) this;
        }

        public Criteria andCmHometownIsNull() {
            addCriterion("CM_HOMETOWN is null");
            return (Criteria) this;
        }

        public Criteria andCmHometownIsNotNull() {
            addCriterion("CM_HOMETOWN is not null");
            return (Criteria) this;
        }

        public Criteria andCmHometownEqualTo(String value) {
            addCriterion("CM_HOMETOWN =", value, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownNotEqualTo(String value) {
            addCriterion("CM_HOMETOWN <>", value, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownGreaterThan(String value) {
            addCriterion("CM_HOMETOWN >", value, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownGreaterThanOrEqualTo(String value) {
            addCriterion("CM_HOMETOWN >=", value, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownLessThan(String value) {
            addCriterion("CM_HOMETOWN <", value, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownLessThanOrEqualTo(String value) {
            addCriterion("CM_HOMETOWN <=", value, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownLike(String value) {
            addCriterion("CM_HOMETOWN like", value, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownNotLike(String value) {
            addCriterion("CM_HOMETOWN not like", value, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownIn(List<String> values) {
            addCriterion("CM_HOMETOWN in", values, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownNotIn(List<String> values) {
            addCriterion("CM_HOMETOWN not in", values, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownBetween(String value1, String value2) {
            addCriterion("CM_HOMETOWN between", value1, value2, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmHometownNotBetween(String value1, String value2) {
            addCriterion("CM_HOMETOWN not between", value1, value2, "cmHometown");
            return (Criteria) this;
        }

        public Criteria andCmPhotoIsNull() {
            addCriterion("CM_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andCmPhotoIsNotNull() {
            addCriterion("CM_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andCmPhotoEqualTo(String value) {
            addCriterion("CM_PHOTO =", value, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoNotEqualTo(String value) {
            addCriterion("CM_PHOTO <>", value, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoGreaterThan(String value) {
            addCriterion("CM_PHOTO >", value, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PHOTO >=", value, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoLessThan(String value) {
            addCriterion("CM_PHOTO <", value, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoLessThanOrEqualTo(String value) {
            addCriterion("CM_PHOTO <=", value, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoLike(String value) {
            addCriterion("CM_PHOTO like", value, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoNotLike(String value) {
            addCriterion("CM_PHOTO not like", value, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoIn(List<String> values) {
            addCriterion("CM_PHOTO in", values, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoNotIn(List<String> values) {
            addCriterion("CM_PHOTO not in", values, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoBetween(String value1, String value2) {
            addCriterion("CM_PHOTO between", value1, value2, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmPhotoNotBetween(String value1, String value2) {
            addCriterion("CM_PHOTO not between", value1, value2, "cmPhoto");
            return (Criteria) this;
        }

        public Criteria andCmEducationIsNull() {
            addCriterion("CM_EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andCmEducationIsNotNull() {
            addCriterion("CM_EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andCmEducationEqualTo(String value) {
            addCriterion("CM_EDUCATION =", value, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationNotEqualTo(String value) {
            addCriterion("CM_EDUCATION <>", value, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationGreaterThan(String value) {
            addCriterion("CM_EDUCATION >", value, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationGreaterThanOrEqualTo(String value) {
            addCriterion("CM_EDUCATION >=", value, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationLessThan(String value) {
            addCriterion("CM_EDUCATION <", value, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationLessThanOrEqualTo(String value) {
            addCriterion("CM_EDUCATION <=", value, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationLike(String value) {
            addCriterion("CM_EDUCATION like", value, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationNotLike(String value) {
            addCriterion("CM_EDUCATION not like", value, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationIn(List<String> values) {
            addCriterion("CM_EDUCATION in", values, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationNotIn(List<String> values) {
            addCriterion("CM_EDUCATION not in", values, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationBetween(String value1, String value2) {
            addCriterion("CM_EDUCATION between", value1, value2, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmEducationNotBetween(String value1, String value2) {
            addCriterion("CM_EDUCATION not between", value1, value2, "cmEducation");
            return (Criteria) this;
        }

        public Criteria andCmDegreeIsNull() {
            addCriterion("CM_DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andCmDegreeIsNotNull() {
            addCriterion("CM_DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andCmDegreeEqualTo(String value) {
            addCriterion("CM_DEGREE =", value, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeNotEqualTo(String value) {
            addCriterion("CM_DEGREE <>", value, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeGreaterThan(String value) {
            addCriterion("CM_DEGREE >", value, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_DEGREE >=", value, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeLessThan(String value) {
            addCriterion("CM_DEGREE <", value, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeLessThanOrEqualTo(String value) {
            addCriterion("CM_DEGREE <=", value, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeLike(String value) {
            addCriterion("CM_DEGREE like", value, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeNotLike(String value) {
            addCriterion("CM_DEGREE not like", value, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeIn(List<String> values) {
            addCriterion("CM_DEGREE in", values, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeNotIn(List<String> values) {
            addCriterion("CM_DEGREE not in", values, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeBetween(String value1, String value2) {
            addCriterion("CM_DEGREE between", value1, value2, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmDegreeNotBetween(String value1, String value2) {
            addCriterion("CM_DEGREE not between", value1, value2, "cmDegree");
            return (Criteria) this;
        }

        public Criteria andCmStatusIsNull() {
            addCriterion("CM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCmStatusIsNotNull() {
            addCriterion("CM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCmStatusEqualTo(String value) {
            addCriterion("CM_STATUS =", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusNotEqualTo(String value) {
            addCriterion("CM_STATUS <>", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusGreaterThan(String value) {
            addCriterion("CM_STATUS >", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CM_STATUS >=", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusLessThan(String value) {
            addCriterion("CM_STATUS <", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusLessThanOrEqualTo(String value) {
            addCriterion("CM_STATUS <=", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusLike(String value) {
            addCriterion("CM_STATUS like", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusNotLike(String value) {
            addCriterion("CM_STATUS not like", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusIn(List<String> values) {
            addCriterion("CM_STATUS in", values, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusNotIn(List<String> values) {
            addCriterion("CM_STATUS not in", values, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusBetween(String value1, String value2) {
            addCriterion("CM_STATUS between", value1, value2, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusNotBetween(String value1, String value2) {
            addCriterion("CM_STATUS not between", value1, value2, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedIsNull() {
            addCriterion("CM_GRADUATED is null");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedIsNotNull() {
            addCriterion("CM_GRADUATED is not null");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedEqualTo(String value) {
            addCriterion("CM_GRADUATED =", value, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedNotEqualTo(String value) {
            addCriterion("CM_GRADUATED <>", value, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedGreaterThan(String value) {
            addCriterion("CM_GRADUATED >", value, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedGreaterThanOrEqualTo(String value) {
            addCriterion("CM_GRADUATED >=", value, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedLessThan(String value) {
            addCriterion("CM_GRADUATED <", value, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedLessThanOrEqualTo(String value) {
            addCriterion("CM_GRADUATED <=", value, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedLike(String value) {
            addCriterion("CM_GRADUATED like", value, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedNotLike(String value) {
            addCriterion("CM_GRADUATED not like", value, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedIn(List<String> values) {
            addCriterion("CM_GRADUATED in", values, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedNotIn(List<String> values) {
            addCriterion("CM_GRADUATED not in", values, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedBetween(String value1, String value2) {
            addCriterion("CM_GRADUATED between", value1, value2, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmGraduatedNotBetween(String value1, String value2) {
            addCriterion("CM_GRADUATED not between", value1, value2, "cmGraduated");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesIsNull() {
            addCriterion("CM_PROFESSIONAL_TITLES is null");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesIsNotNull() {
            addCriterion("CM_PROFESSIONAL_TITLES is not null");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesEqualTo(String value) {
            addCriterion("CM_PROFESSIONAL_TITLES =", value, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesNotEqualTo(String value) {
            addCriterion("CM_PROFESSIONAL_TITLES <>", value, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesGreaterThan(String value) {
            addCriterion("CM_PROFESSIONAL_TITLES >", value, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PROFESSIONAL_TITLES >=", value, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesLessThan(String value) {
            addCriterion("CM_PROFESSIONAL_TITLES <", value, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesLessThanOrEqualTo(String value) {
            addCriterion("CM_PROFESSIONAL_TITLES <=", value, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesLike(String value) {
            addCriterion("CM_PROFESSIONAL_TITLES like", value, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesNotLike(String value) {
            addCriterion("CM_PROFESSIONAL_TITLES not like", value, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesIn(List<String> values) {
            addCriterion("CM_PROFESSIONAL_TITLES in", values, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesNotIn(List<String> values) {
            addCriterion("CM_PROFESSIONAL_TITLES not in", values, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesBetween(String value1, String value2) {
            addCriterion("CM_PROFESSIONAL_TITLES between", value1, value2, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmProfessionalTitlesNotBetween(String value1, String value2) {
            addCriterion("CM_PROFESSIONAL_TITLES not between", value1, value2, "cmProfessionalTitles");
            return (Criteria) this;
        }

        public Criteria andCmHiredateIsNull() {
            addCriterion("CM_HIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andCmHiredateIsNotNull() {
            addCriterion("CM_HIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmHiredateEqualTo(String value) {
            addCriterion("CM_HIREDATE =", value, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateNotEqualTo(String value) {
            addCriterion("CM_HIREDATE <>", value, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateGreaterThan(String value) {
            addCriterion("CM_HIREDATE >", value, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_HIREDATE >=", value, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateLessThan(String value) {
            addCriterion("CM_HIREDATE <", value, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateLessThanOrEqualTo(String value) {
            addCriterion("CM_HIREDATE <=", value, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateLike(String value) {
            addCriterion("CM_HIREDATE like", value, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateNotLike(String value) {
            addCriterion("CM_HIREDATE not like", value, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateIn(List<String> values) {
            addCriterion("CM_HIREDATE in", values, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateNotIn(List<String> values) {
            addCriterion("CM_HIREDATE not in", values, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateBetween(String value1, String value2) {
            addCriterion("CM_HIREDATE between", value1, value2, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmHiredateNotBetween(String value1, String value2) {
            addCriterion("CM_HIREDATE not between", value1, value2, "cmHiredate");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeIsNull() {
            addCriterion("CM_ENTRY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeIsNotNull() {
            addCriterion("CM_ENTRY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeEqualTo(String value) {
            addCriterion("CM_ENTRY_TIME =", value, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeNotEqualTo(String value) {
            addCriterion("CM_ENTRY_TIME <>", value, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeGreaterThan(String value) {
            addCriterion("CM_ENTRY_TIME >", value, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ENTRY_TIME >=", value, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeLessThan(String value) {
            addCriterion("CM_ENTRY_TIME <", value, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeLessThanOrEqualTo(String value) {
            addCriterion("CM_ENTRY_TIME <=", value, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeLike(String value) {
            addCriterion("CM_ENTRY_TIME like", value, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeNotLike(String value) {
            addCriterion("CM_ENTRY_TIME not like", value, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeIn(List<String> values) {
            addCriterion("CM_ENTRY_TIME in", values, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeNotIn(List<String> values) {
            addCriterion("CM_ENTRY_TIME not in", values, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeBetween(String value1, String value2) {
            addCriterion("CM_ENTRY_TIME between", value1, value2, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmEntryTimeNotBetween(String value1, String value2) {
            addCriterion("CM_ENTRY_TIME not between", value1, value2, "cmEntryTime");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsIsNull() {
            addCriterion("CM_FINANCIAL_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsIsNotNull() {
            addCriterion("CM_FINANCIAL_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsEqualTo(Integer value) {
            addCriterion("CM_FINANCIAL_YEARS =", value, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsNotEqualTo(Integer value) {
            addCriterion("CM_FINANCIAL_YEARS <>", value, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsGreaterThan(Integer value) {
            addCriterion("CM_FINANCIAL_YEARS >", value, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_FINANCIAL_YEARS >=", value, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsLessThan(Integer value) {
            addCriterion("CM_FINANCIAL_YEARS <", value, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsLessThanOrEqualTo(Integer value) {
            addCriterion("CM_FINANCIAL_YEARS <=", value, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsIn(List<Integer> values) {
            addCriterion("CM_FINANCIAL_YEARS in", values, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsNotIn(List<Integer> values) {
            addCriterion("CM_FINANCIAL_YEARS not in", values, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsBetween(Integer value1, Integer value2) {
            addCriterion("CM_FINANCIAL_YEARS between", value1, value2, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmFinancialYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_FINANCIAL_YEARS not between", value1, value2, "cmFinancialYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsIsNull() {
            addCriterion("CM_WORKING_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsIsNotNull() {
            addCriterion("CM_WORKING_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsEqualTo(Integer value) {
            addCriterion("CM_WORKING_YEARS =", value, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsNotEqualTo(Integer value) {
            addCriterion("CM_WORKING_YEARS <>", value, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsGreaterThan(Integer value) {
            addCriterion("CM_WORKING_YEARS >", value, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_WORKING_YEARS >=", value, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsLessThan(Integer value) {
            addCriterion("CM_WORKING_YEARS <", value, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsLessThanOrEqualTo(Integer value) {
            addCriterion("CM_WORKING_YEARS <=", value, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsIn(List<Integer> values) {
            addCriterion("CM_WORKING_YEARS in", values, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsNotIn(List<Integer> values) {
            addCriterion("CM_WORKING_YEARS not in", values, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsBetween(Integer value1, Integer value2) {
            addCriterion("CM_WORKING_YEARS between", value1, value2, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmWorkingYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_WORKING_YEARS not between", value1, value2, "cmWorkingYears");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeIsNull() {
            addCriterion("CM_EXIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeIsNotNull() {
            addCriterion("CM_EXIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeEqualTo(String value) {
            addCriterion("CM_EXIT_TIME =", value, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeNotEqualTo(String value) {
            addCriterion("CM_EXIT_TIME <>", value, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeGreaterThan(String value) {
            addCriterion("CM_EXIT_TIME >", value, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_EXIT_TIME >=", value, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeLessThan(String value) {
            addCriterion("CM_EXIT_TIME <", value, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeLessThanOrEqualTo(String value) {
            addCriterion("CM_EXIT_TIME <=", value, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeLike(String value) {
            addCriterion("CM_EXIT_TIME like", value, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeNotLike(String value) {
            addCriterion("CM_EXIT_TIME not like", value, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeIn(List<String> values) {
            addCriterion("CM_EXIT_TIME in", values, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeNotIn(List<String> values) {
            addCriterion("CM_EXIT_TIME not in", values, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeBetween(String value1, String value2) {
            addCriterion("CM_EXIT_TIME between", value1, value2, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmExitTimeNotBetween(String value1, String value2) {
            addCriterion("CM_EXIT_TIME not between", value1, value2, "cmExitTime");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearIsNull() {
            addCriterion("CM_RESULTS_LAST_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearIsNotNull() {
            addCriterion("CM_RESULTS_LAST_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearEqualTo(Integer value) {
            addCriterion("CM_RESULTS_LAST_YEAR =", value, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearNotEqualTo(Integer value) {
            addCriterion("CM_RESULTS_LAST_YEAR <>", value, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearGreaterThan(Integer value) {
            addCriterion("CM_RESULTS_LAST_YEAR >", value, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_RESULTS_LAST_YEAR >=", value, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearLessThan(Integer value) {
            addCriterion("CM_RESULTS_LAST_YEAR <", value, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearLessThanOrEqualTo(Integer value) {
            addCriterion("CM_RESULTS_LAST_YEAR <=", value, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearIn(List<Integer> values) {
            addCriterion("CM_RESULTS_LAST_YEAR in", values, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearNotIn(List<Integer> values) {
            addCriterion("CM_RESULTS_LAST_YEAR not in", values, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearBetween(Integer value1, Integer value2) {
            addCriterion("CM_RESULTS_LAST_YEAR between", value1, value2, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmResultsLastYearNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_RESULTS_LAST_YEAR not between", value1, value2, "cmResultsLastYear");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsIsNull() {
            addCriterion("CM_YEAR_CREDITS is null");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsIsNotNull() {
            addCriterion("CM_YEAR_CREDITS is not null");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsEqualTo(Integer value) {
            addCriterion("CM_YEAR_CREDITS =", value, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsNotEqualTo(Integer value) {
            addCriterion("CM_YEAR_CREDITS <>", value, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsGreaterThan(Integer value) {
            addCriterion("CM_YEAR_CREDITS >", value, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_YEAR_CREDITS >=", value, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsLessThan(Integer value) {
            addCriterion("CM_YEAR_CREDITS <", value, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsLessThanOrEqualTo(Integer value) {
            addCriterion("CM_YEAR_CREDITS <=", value, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsIn(List<Integer> values) {
            addCriterion("CM_YEAR_CREDITS in", values, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsNotIn(List<Integer> values) {
            addCriterion("CM_YEAR_CREDITS not in", values, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsBetween(Integer value1, Integer value2) {
            addCriterion("CM_YEAR_CREDITS between", value1, value2, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmYearCreditsNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_YEAR_CREDITS not between", value1, value2, "cmYearCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsIsNull() {
            addCriterion("CM_TOTAL_CREDITS is null");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsIsNotNull() {
            addCriterion("CM_TOTAL_CREDITS is not null");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsEqualTo(Integer value) {
            addCriterion("CM_TOTAL_CREDITS =", value, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsNotEqualTo(Integer value) {
            addCriterion("CM_TOTAL_CREDITS <>", value, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsGreaterThan(Integer value) {
            addCriterion("CM_TOTAL_CREDITS >", value, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_TOTAL_CREDITS >=", value, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsLessThan(Integer value) {
            addCriterion("CM_TOTAL_CREDITS <", value, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsLessThanOrEqualTo(Integer value) {
            addCriterion("CM_TOTAL_CREDITS <=", value, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsIn(List<Integer> values) {
            addCriterion("CM_TOTAL_CREDITS in", values, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsNotIn(List<Integer> values) {
            addCriterion("CM_TOTAL_CREDITS not in", values, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsBetween(Integer value1, Integer value2) {
            addCriterion("CM_TOTAL_CREDITS between", value1, value2, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmTotalCreditsNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_TOTAL_CREDITS not between", value1, value2, "cmTotalCredits");
            return (Criteria) this;
        }

        public Criteria andCmLevelIsNull() {
            addCriterion("CM_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCmLevelIsNotNull() {
            addCriterion("CM_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCmLevelEqualTo(String value) {
            addCriterion("CM_LEVEL =", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotEqualTo(String value) {
            addCriterion("CM_LEVEL <>", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelGreaterThan(String value) {
            addCriterion("CM_LEVEL >", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LEVEL >=", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelLessThan(String value) {
            addCriterion("CM_LEVEL <", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelLessThanOrEqualTo(String value) {
            addCriterion("CM_LEVEL <=", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelLike(String value) {
            addCriterion("CM_LEVEL like", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotLike(String value) {
            addCriterion("CM_LEVEL not like", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelIn(List<String> values) {
            addCriterion("CM_LEVEL in", values, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotIn(List<String> values) {
            addCriterion("CM_LEVEL not in", values, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelBetween(String value1, String value2) {
            addCriterion("CM_LEVEL between", value1, value2, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotBetween(String value1, String value2) {
            addCriterion("CM_LEVEL not between", value1, value2, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmUnitIsNull() {
            addCriterion("CM_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCmUnitIsNotNull() {
            addCriterion("CM_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCmUnitEqualTo(String value) {
            addCriterion("CM_UNIT =", value, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitNotEqualTo(String value) {
            addCriterion("CM_UNIT <>", value, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitGreaterThan(String value) {
            addCriterion("CM_UNIT >", value, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitGreaterThanOrEqualTo(String value) {
            addCriterion("CM_UNIT >=", value, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitLessThan(String value) {
            addCriterion("CM_UNIT <", value, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitLessThanOrEqualTo(String value) {
            addCriterion("CM_UNIT <=", value, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitLike(String value) {
            addCriterion("CM_UNIT like", value, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitNotLike(String value) {
            addCriterion("CM_UNIT not like", value, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitIn(List<String> values) {
            addCriterion("CM_UNIT in", values, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitNotIn(List<String> values) {
            addCriterion("CM_UNIT not in", values, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitBetween(String value1, String value2) {
            addCriterion("CM_UNIT between", value1, value2, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmUnitNotBetween(String value1, String value2) {
            addCriterion("CM_UNIT not between", value1, value2, "cmUnit");
            return (Criteria) this;
        }

        public Criteria andCmDeptIsNull() {
            addCriterion("CM_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andCmDeptIsNotNull() {
            addCriterion("CM_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andCmDeptEqualTo(String value) {
            addCriterion("CM_DEPT =", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptNotEqualTo(String value) {
            addCriterion("CM_DEPT <>", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptGreaterThan(String value) {
            addCriterion("CM_DEPT >", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptGreaterThanOrEqualTo(String value) {
            addCriterion("CM_DEPT >=", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptLessThan(String value) {
            addCriterion("CM_DEPT <", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptLessThanOrEqualTo(String value) {
            addCriterion("CM_DEPT <=", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptLike(String value) {
            addCriterion("CM_DEPT like", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptNotLike(String value) {
            addCriterion("CM_DEPT not like", value, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptIn(List<String> values) {
            addCriterion("CM_DEPT in", values, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptNotIn(List<String> values) {
            addCriterion("CM_DEPT not in", values, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptBetween(String value1, String value2) {
            addCriterion("CM_DEPT between", value1, value2, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmDeptNotBetween(String value1, String value2) {
            addCriterion("CM_DEPT not between", value1, value2, "cmDept");
            return (Criteria) this;
        }

        public Criteria andCmPositionIsNull() {
            addCriterion("CM_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andCmPositionIsNotNull() {
            addCriterion("CM_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andCmPositionEqualTo(String value) {
            addCriterion("CM_POSITION =", value, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionNotEqualTo(String value) {
            addCriterion("CM_POSITION <>", value, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionGreaterThan(String value) {
            addCriterion("CM_POSITION >", value, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionGreaterThanOrEqualTo(String value) {
            addCriterion("CM_POSITION >=", value, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionLessThan(String value) {
            addCriterion("CM_POSITION <", value, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionLessThanOrEqualTo(String value) {
            addCriterion("CM_POSITION <=", value, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionLike(String value) {
            addCriterion("CM_POSITION like", value, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionNotLike(String value) {
            addCriterion("CM_POSITION not like", value, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionIn(List<String> values) {
            addCriterion("CM_POSITION in", values, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionNotIn(List<String> values) {
            addCriterion("CM_POSITION not in", values, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionBetween(String value1, String value2) {
            addCriterion("CM_POSITION between", value1, value2, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmPositionNotBetween(String value1, String value2) {
            addCriterion("CM_POSITION not between", value1, value2, "cmPosition");
            return (Criteria) this;
        }

        public Criteria andCmTelIsNull() {
            addCriterion("CM_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCmTelIsNotNull() {
            addCriterion("CM_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCmTelEqualTo(String value) {
            addCriterion("CM_TEL =", value, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelNotEqualTo(String value) {
            addCriterion("CM_TEL <>", value, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelGreaterThan(String value) {
            addCriterion("CM_TEL >", value, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TEL >=", value, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelLessThan(String value) {
            addCriterion("CM_TEL <", value, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelLessThanOrEqualTo(String value) {
            addCriterion("CM_TEL <=", value, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelLike(String value) {
            addCriterion("CM_TEL like", value, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelNotLike(String value) {
            addCriterion("CM_TEL not like", value, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelIn(List<String> values) {
            addCriterion("CM_TEL in", values, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelNotIn(List<String> values) {
            addCriterion("CM_TEL not in", values, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelBetween(String value1, String value2) {
            addCriterion("CM_TEL between", value1, value2, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmTelNotBetween(String value1, String value2) {
            addCriterion("CM_TEL not between", value1, value2, "cmTel");
            return (Criteria) this;
        }

        public Criteria andCmMobileIsNull() {
            addCriterion("CM_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCmMobileIsNotNull() {
            addCriterion("CM_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCmMobileEqualTo(String value) {
            addCriterion("CM_MOBILE =", value, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileNotEqualTo(String value) {
            addCriterion("CM_MOBILE <>", value, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileGreaterThan(String value) {
            addCriterion("CM_MOBILE >", value, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CM_MOBILE >=", value, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileLessThan(String value) {
            addCriterion("CM_MOBILE <", value, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileLessThanOrEqualTo(String value) {
            addCriterion("CM_MOBILE <=", value, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileLike(String value) {
            addCriterion("CM_MOBILE like", value, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileNotLike(String value) {
            addCriterion("CM_MOBILE not like", value, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileIn(List<String> values) {
            addCriterion("CM_MOBILE in", values, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileNotIn(List<String> values) {
            addCriterion("CM_MOBILE not in", values, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileBetween(String value1, String value2) {
            addCriterion("CM_MOBILE between", value1, value2, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmMobileNotBetween(String value1, String value2) {
            addCriterion("CM_MOBILE not between", value1, value2, "cmMobile");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesIsNull() {
            addCriterion("CM_BUSINESS_LINES is null");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesIsNotNull() {
            addCriterion("CM_BUSINESS_LINES is not null");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesEqualTo(String value) {
            addCriterion("CM_BUSINESS_LINES =", value, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesNotEqualTo(String value) {
            addCriterion("CM_BUSINESS_LINES <>", value, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesGreaterThan(String value) {
            addCriterion("CM_BUSINESS_LINES >", value, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesGreaterThanOrEqualTo(String value) {
            addCriterion("CM_BUSINESS_LINES >=", value, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesLessThan(String value) {
            addCriterion("CM_BUSINESS_LINES <", value, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesLessThanOrEqualTo(String value) {
            addCriterion("CM_BUSINESS_LINES <=", value, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesLike(String value) {
            addCriterion("CM_BUSINESS_LINES like", value, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesNotLike(String value) {
            addCriterion("CM_BUSINESS_LINES not like", value, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesIn(List<String> values) {
            addCriterion("CM_BUSINESS_LINES in", values, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesNotIn(List<String> values) {
            addCriterion("CM_BUSINESS_LINES not in", values, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesBetween(String value1, String value2) {
            addCriterion("CM_BUSINESS_LINES between", value1, value2, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmBusinessLinesNotBetween(String value1, String value2) {
            addCriterion("CM_BUSINESS_LINES not between", value1, value2, "cmBusinessLines");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberIsNull() {
            addCriterion("CM_CERTIFICATE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberIsNotNull() {
            addCriterion("CM_CERTIFICATE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NUMBER =", value, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberNotEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NUMBER <>", value, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberGreaterThan(String value) {
            addCriterion("CM_CERTIFICATE_NUMBER >", value, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NUMBER >=", value, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberLessThan(String value) {
            addCriterion("CM_CERTIFICATE_NUMBER <", value, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("CM_CERTIFICATE_NUMBER <=", value, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberLike(String value) {
            addCriterion("CM_CERTIFICATE_NUMBER like", value, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberNotLike(String value) {
            addCriterion("CM_CERTIFICATE_NUMBER not like", value, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_NUMBER in", values, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberNotIn(List<String> values) {
            addCriterion("CM_CERTIFICATE_NUMBER not in", values, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_NUMBER between", value1, value2, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("CM_CERTIFICATE_NUMBER not between", value1, value2, "cmCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateIsNull() {
            addCriterion("CM_QUALIFICATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateIsNotNull() {
            addCriterion("CM_QUALIFICATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateEqualTo(String value) {
            addCriterion("CM_QUALIFICATION_DATE =", value, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateNotEqualTo(String value) {
            addCriterion("CM_QUALIFICATION_DATE <>", value, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateGreaterThan(String value) {
            addCriterion("CM_QUALIFICATION_DATE >", value, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_QUALIFICATION_DATE >=", value, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateLessThan(String value) {
            addCriterion("CM_QUALIFICATION_DATE <", value, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateLessThanOrEqualTo(String value) {
            addCriterion("CM_QUALIFICATION_DATE <=", value, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateLike(String value) {
            addCriterion("CM_QUALIFICATION_DATE like", value, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateNotLike(String value) {
            addCriterion("CM_QUALIFICATION_DATE not like", value, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateIn(List<String> values) {
            addCriterion("CM_QUALIFICATION_DATE in", values, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateNotIn(List<String> values) {
            addCriterion("CM_QUALIFICATION_DATE not in", values, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateBetween(String value1, String value2) {
            addCriterion("CM_QUALIFICATION_DATE between", value1, value2, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationDateNotBetween(String value1, String value2) {
            addCriterion("CM_QUALIFICATION_DATE not between", value1, value2, "cmQualificationDate");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodIsNull() {
            addCriterion("CM_QUALIFICATION_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodIsNotNull() {
            addCriterion("CM_QUALIFICATION_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodEqualTo(Integer value) {
            addCriterion("CM_QUALIFICATION_PERIOD =", value, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodNotEqualTo(Integer value) {
            addCriterion("CM_QUALIFICATION_PERIOD <>", value, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodGreaterThan(Integer value) {
            addCriterion("CM_QUALIFICATION_PERIOD >", value, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_QUALIFICATION_PERIOD >=", value, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodLessThan(Integer value) {
            addCriterion("CM_QUALIFICATION_PERIOD <", value, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("CM_QUALIFICATION_PERIOD <=", value, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodIn(List<Integer> values) {
            addCriterion("CM_QUALIFICATION_PERIOD in", values, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodNotIn(List<Integer> values) {
            addCriterion("CM_QUALIFICATION_PERIOD not in", values, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodBetween(Integer value1, Integer value2) {
            addCriterion("CM_QUALIFICATION_PERIOD between", value1, value2, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmQualificationPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_QUALIFICATION_PERIOD not between", value1, value2, "cmQualificationPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberIsNull() {
            addCriterion("CM_STATUS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberIsNotNull() {
            addCriterion("CM_STATUS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberEqualTo(String value) {
            addCriterion("CM_STATUS_NUMBER =", value, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberNotEqualTo(String value) {
            addCriterion("CM_STATUS_NUMBER <>", value, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberGreaterThan(String value) {
            addCriterion("CM_STATUS_NUMBER >", value, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CM_STATUS_NUMBER >=", value, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberLessThan(String value) {
            addCriterion("CM_STATUS_NUMBER <", value, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberLessThanOrEqualTo(String value) {
            addCriterion("CM_STATUS_NUMBER <=", value, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberLike(String value) {
            addCriterion("CM_STATUS_NUMBER like", value, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberNotLike(String value) {
            addCriterion("CM_STATUS_NUMBER not like", value, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberIn(List<String> values) {
            addCriterion("CM_STATUS_NUMBER in", values, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberNotIn(List<String> values) {
            addCriterion("CM_STATUS_NUMBER not in", values, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberBetween(String value1, String value2) {
            addCriterion("CM_STATUS_NUMBER between", value1, value2, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberNotBetween(String value1, String value2) {
            addCriterion("CM_STATUS_NUMBER not between", value1, value2, "cmStatusNumber");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateIsNull() {
            addCriterion("CM_STATUS_NUMBER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateIsNotNull() {
            addCriterion("CM_STATUS_NUMBER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateEqualTo(String value) {
            addCriterion("CM_STATUS_NUMBER_DATE =", value, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateNotEqualTo(String value) {
            addCriterion("CM_STATUS_NUMBER_DATE <>", value, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateGreaterThan(String value) {
            addCriterion("CM_STATUS_NUMBER_DATE >", value, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_STATUS_NUMBER_DATE >=", value, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateLessThan(String value) {
            addCriterion("CM_STATUS_NUMBER_DATE <", value, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateLessThanOrEqualTo(String value) {
            addCriterion("CM_STATUS_NUMBER_DATE <=", value, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateLike(String value) {
            addCriterion("CM_STATUS_NUMBER_DATE like", value, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateNotLike(String value) {
            addCriterion("CM_STATUS_NUMBER_DATE not like", value, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateIn(List<String> values) {
            addCriterion("CM_STATUS_NUMBER_DATE in", values, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateNotIn(List<String> values) {
            addCriterion("CM_STATUS_NUMBER_DATE not in", values, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateBetween(String value1, String value2) {
            addCriterion("CM_STATUS_NUMBER_DATE between", value1, value2, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberDateNotBetween(String value1, String value2) {
            addCriterion("CM_STATUS_NUMBER_DATE not between", value1, value2, "cmStatusNumberDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodIsNull() {
            addCriterion("CM_STATUS_NUMBER_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodIsNotNull() {
            addCriterion("CM_STATUS_NUMBER_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodEqualTo(Integer value) {
            addCriterion("CM_STATUS_NUMBER_PERIOD =", value, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodNotEqualTo(Integer value) {
            addCriterion("CM_STATUS_NUMBER_PERIOD <>", value, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodGreaterThan(Integer value) {
            addCriterion("CM_STATUS_NUMBER_PERIOD >", value, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_STATUS_NUMBER_PERIOD >=", value, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodLessThan(Integer value) {
            addCriterion("CM_STATUS_NUMBER_PERIOD <", value, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("CM_STATUS_NUMBER_PERIOD <=", value, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodIn(List<Integer> values) {
            addCriterion("CM_STATUS_NUMBER_PERIOD in", values, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodNotIn(List<Integer> values) {
            addCriterion("CM_STATUS_NUMBER_PERIOD not in", values, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATUS_NUMBER_PERIOD between", value1, value2, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmStatusNumberPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATUS_NUMBER_PERIOD not between", value1, value2, "cmStatusNumberPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberIsNull() {
            addCriterion("CM_LEVEL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberIsNotNull() {
            addCriterion("CM_LEVEL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberEqualTo(String value) {
            addCriterion("CM_LEVEL_NUMBER =", value, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberNotEqualTo(String value) {
            addCriterion("CM_LEVEL_NUMBER <>", value, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberGreaterThan(String value) {
            addCriterion("CM_LEVEL_NUMBER >", value, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LEVEL_NUMBER >=", value, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberLessThan(String value) {
            addCriterion("CM_LEVEL_NUMBER <", value, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberLessThanOrEqualTo(String value) {
            addCriterion("CM_LEVEL_NUMBER <=", value, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberLike(String value) {
            addCriterion("CM_LEVEL_NUMBER like", value, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberNotLike(String value) {
            addCriterion("CM_LEVEL_NUMBER not like", value, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberIn(List<String> values) {
            addCriterion("CM_LEVEL_NUMBER in", values, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberNotIn(List<String> values) {
            addCriterion("CM_LEVEL_NUMBER not in", values, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberBetween(String value1, String value2) {
            addCriterion("CM_LEVEL_NUMBER between", value1, value2, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelNumberNotBetween(String value1, String value2) {
            addCriterion("CM_LEVEL_NUMBER not between", value1, value2, "cmLevelNumber");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateIsNull() {
            addCriterion("CM_LEVEL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateIsNotNull() {
            addCriterion("CM_LEVEL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateEqualTo(String value) {
            addCriterion("CM_LEVEL_DATE =", value, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateNotEqualTo(String value) {
            addCriterion("CM_LEVEL_DATE <>", value, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateGreaterThan(String value) {
            addCriterion("CM_LEVEL_DATE >", value, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LEVEL_DATE >=", value, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateLessThan(String value) {
            addCriterion("CM_LEVEL_DATE <", value, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateLessThanOrEqualTo(String value) {
            addCriterion("CM_LEVEL_DATE <=", value, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateLike(String value) {
            addCriterion("CM_LEVEL_DATE like", value, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateNotLike(String value) {
            addCriterion("CM_LEVEL_DATE not like", value, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateIn(List<String> values) {
            addCriterion("CM_LEVEL_DATE in", values, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateNotIn(List<String> values) {
            addCriterion("CM_LEVEL_DATE not in", values, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateBetween(String value1, String value2) {
            addCriterion("CM_LEVEL_DATE between", value1, value2, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelDateNotBetween(String value1, String value2) {
            addCriterion("CM_LEVEL_DATE not between", value1, value2, "cmLevelDate");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodIsNull() {
            addCriterion("CM_LEVEL_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodIsNotNull() {
            addCriterion("CM_LEVEL_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodEqualTo(Integer value) {
            addCriterion("CM_LEVEL_PERIOD =", value, "cmLevelPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodNotEqualTo(Integer value) {
            addCriterion("CM_LEVEL_PERIOD <>", value, "cmLevelPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodGreaterThan(Integer value) {
            addCriterion("CM_LEVEL_PERIOD >", value, "cmLevelPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_LEVEL_PERIOD >=", value, "cmLevelPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodLessThan(Integer value) {
            addCriterion("CM_LEVEL_PERIOD <", value, "cmLevelPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("CM_LEVEL_PERIOD <=", value, "cmLevelPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodIn(List<Integer> values) {
            addCriterion("CM_LEVEL_PERIOD in", values, "cmLevelPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodNotIn(List<Integer> values) {
            addCriterion("CM_LEVEL_PERIOD not in", values, "cmLevelPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodBetween(Integer value1, Integer value2) {
            addCriterion("CM_LEVEL_PERIOD between", value1, value2, "cmLevelPeriod");
            return (Criteria) this;
        }

        public Criteria andCmLevelPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_LEVEL_PERIOD not between", value1, value2, "cmLevelPeriod");
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