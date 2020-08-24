package com.inspur.bean;

import java.util.ArrayList;
import java.util.List;

public class CMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CMemberExample() {
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

        public Criteria andMemIdIsNull() {
            addCriterion("MEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemIdIsNotNull() {
            addCriterion("MEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemIdEqualTo(Integer value) {
            addCriterion("MEM_ID =", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotEqualTo(Integer value) {
            addCriterion("MEM_ID <>", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThan(Integer value) {
            addCriterion("MEM_ID >", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_ID >=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThan(Integer value) {
            addCriterion("MEM_ID <", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_ID <=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLike(Integer value) {
            addCriterion("MEM_ID like", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotLike(Integer value) {
            addCriterion("MEM_ID not like", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdIn(List<Integer> values) {
            addCriterion("MEM_ID in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotIn(List<Integer> values) {
            addCriterion("MEM_ID not in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdBetween(Integer value1, Integer value2) {
            addCriterion("MEM_ID between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_ID not between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNull() {
            addCriterion("MEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNotNull() {
            addCriterion("MEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemNameEqualTo(String value) {
            addCriterion("MEM_NAME =", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotEqualTo(String value) {
            addCriterion("MEM_NAME <>", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThan(String value) {
            addCriterion("MEM_NAME >", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_NAME >=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThan(String value) {
            addCriterion("MEM_NAME <", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThanOrEqualTo(String value) {
            addCriterion("MEM_NAME <=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLike(String value) {
            addCriterion("MEM_NAME like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotLike(String value) {
            addCriterion("MEM_NAME not like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameIn(List<String> values) {
            addCriterion("MEM_NAME in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotIn(List<String> values) {
            addCriterion("MEM_NAME not in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameBetween(String value1, String value2) {
            addCriterion("MEM_NAME between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotBetween(String value1, String value2) {
            addCriterion("MEM_NAME not between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemPassIsNull() {
            addCriterion("MEM_PASS is null");
            return (Criteria) this;
        }

        public Criteria andMemPassIsNotNull() {
            addCriterion("MEM_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andMemPassEqualTo(String value) {
            addCriterion("MEM_PASS =", value, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassNotEqualTo(String value) {
            addCriterion("MEM_PASS <>", value, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassGreaterThan(String value) {
            addCriterion("MEM_PASS >", value, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_PASS >=", value, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassLessThan(String value) {
            addCriterion("MEM_PASS <", value, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassLessThanOrEqualTo(String value) {
            addCriterion("MEM_PASS <=", value, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassLike(String value) {
            addCriterion("MEM_PASS like", value, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassNotLike(String value) {
            addCriterion("MEM_PASS not like", value, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassIn(List<String> values) {
            addCriterion("MEM_PASS in", values, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassNotIn(List<String> values) {
            addCriterion("MEM_PASS not in", values, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassBetween(String value1, String value2) {
            addCriterion("MEM_PASS between", value1, value2, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemPassNotBetween(String value1, String value2) {
            addCriterion("MEM_PASS not between", value1, value2, "memPass");
            return (Criteria) this;
        }

        public Criteria andMemSexIsNull() {
            addCriterion("MEM_SEX is null");
            return (Criteria) this;
        }

        public Criteria andMemSexIsNotNull() {
            addCriterion("MEM_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andMemSexEqualTo(String value) {
            addCriterion("MEM_SEX =", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexNotEqualTo(String value) {
            addCriterion("MEM_SEX <>", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexGreaterThan(String value) {
            addCriterion("MEM_SEX >", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_SEX >=", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexLessThan(String value) {
            addCriterion("MEM_SEX <", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexLessThanOrEqualTo(String value) {
            addCriterion("MEM_SEX <=", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexLike(String value) {
            addCriterion("MEM_SEX like", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexNotLike(String value) {
            addCriterion("MEM_SEX not like", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexIn(List<String> values) {
            addCriterion("MEM_SEX in", values, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexNotIn(List<String> values) {
            addCriterion("MEM_SEX not in", values, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexBetween(String value1, String value2) {
            addCriterion("MEM_SEX between", value1, value2, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexNotBetween(String value1, String value2) {
            addCriterion("MEM_SEX not between", value1, value2, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemBornIsNull() {
            addCriterion("MEM_BORN is null");
            return (Criteria) this;
        }

        public Criteria andMemBornIsNotNull() {
            addCriterion("MEM_BORN is not null");
            return (Criteria) this;
        }

        public Criteria andMemBornEqualTo(String value) {
            addCriterion("MEM_BORN =", value, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornNotEqualTo(String value) {
            addCriterion("MEM_BORN <>", value, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornGreaterThan(String value) {
            addCriterion("MEM_BORN >", value, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_BORN >=", value, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornLessThan(String value) {
            addCriterion("MEM_BORN <", value, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornLessThanOrEqualTo(String value) {
            addCriterion("MEM_BORN <=", value, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornLike(String value) {
            addCriterion("MEM_BORN like", value, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornNotLike(String value) {
            addCriterion("MEM_BORN not like", value, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornIn(List<String> values) {
            addCriterion("MEM_BORN in", values, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornNotIn(List<String> values) {
            addCriterion("MEM_BORN not in", values, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornBetween(String value1, String value2) {
            addCriterion("MEM_BORN between", value1, value2, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemBornNotBetween(String value1, String value2) {
            addCriterion("MEM_BORN not between", value1, value2, "memBorn");
            return (Criteria) this;
        }

        public Criteria andMemMailIsNull() {
            addCriterion("MEM_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMemMailIsNotNull() {
            addCriterion("MEM_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMemMailEqualTo(String value) {
            addCriterion("MEM_MAIL =", value, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailNotEqualTo(String value) {
            addCriterion("MEM_MAIL <>", value, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailGreaterThan(String value) {
            addCriterion("MEM_MAIL >", value, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_MAIL >=", value, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailLessThan(String value) {
            addCriterion("MEM_MAIL <", value, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailLessThanOrEqualTo(String value) {
            addCriterion("MEM_MAIL <=", value, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailLike(String value) {
            addCriterion("MEM_MAIL like", value, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailNotLike(String value) {
            addCriterion("MEM_MAIL not like", value, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailIn(List<String> values) {
            addCriterion("MEM_MAIL in", values, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailNotIn(List<String> values) {
            addCriterion("MEM_MAIL not in", values, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailBetween(String value1, String value2) {
            addCriterion("MEM_MAIL between", value1, value2, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemMailNotBetween(String value1, String value2) {
            addCriterion("MEM_MAIL not between", value1, value2, "memMail");
            return (Criteria) this;
        }

        public Criteria andMemQuestionIsNull() {
            addCriterion("MEM_QUESTION is null");
            return (Criteria) this;
        }

        public Criteria andMemQuestionIsNotNull() {
            addCriterion("MEM_QUESTION is not null");
            return (Criteria) this;
        }

        public Criteria andMemQuestionEqualTo(String value) {
            addCriterion("MEM_QUESTION =", value, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionNotEqualTo(String value) {
            addCriterion("MEM_QUESTION <>", value, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionGreaterThan(String value) {
            addCriterion("MEM_QUESTION >", value, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_QUESTION >=", value, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionLessThan(String value) {
            addCriterion("MEM_QUESTION <", value, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionLessThanOrEqualTo(String value) {
            addCriterion("MEM_QUESTION <=", value, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionLike(String value) {
            addCriterion("MEM_QUESTION like", value, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionNotLike(String value) {
            addCriterion("MEM_QUESTION not like", value, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionIn(List<String> values) {
            addCriterion("MEM_QUESTION in", values, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionNotIn(List<String> values) {
            addCriterion("MEM_QUESTION not in", values, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionBetween(String value1, String value2) {
            addCriterion("MEM_QUESTION between", value1, value2, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemQuestionNotBetween(String value1, String value2) {
            addCriterion("MEM_QUESTION not between", value1, value2, "memQuestion");
            return (Criteria) this;
        }

        public Criteria andMemAnswerIsNull() {
            addCriterion("MEM_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andMemAnswerIsNotNull() {
            addCriterion("MEM_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andMemAnswerEqualTo(String value) {
            addCriterion("MEM_ANSWER =", value, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerNotEqualTo(String value) {
            addCriterion("MEM_ANSWER <>", value, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerGreaterThan(String value) {
            addCriterion("MEM_ANSWER >", value, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_ANSWER >=", value, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerLessThan(String value) {
            addCriterion("MEM_ANSWER <", value, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerLessThanOrEqualTo(String value) {
            addCriterion("MEM_ANSWER <=", value, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerLike(String value) {
            addCriterion("MEM_ANSWER like", value, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerNotLike(String value) {
            addCriterion("MEM_ANSWER not like", value, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerIn(List<String> values) {
            addCriterion("MEM_ANSWER in", values, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerNotIn(List<String> values) {
            addCriterion("MEM_ANSWER not in", values, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerBetween(String value1, String value2) {
            addCriterion("MEM_ANSWER between", value1, value2, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andMemAnswerNotBetween(String value1, String value2) {
            addCriterion("MEM_ANSWER not between", value1, value2, "memAnswer");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("REGISTER_TIME =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("REGISTER_TIME <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("REGISTER_TIME >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("REGISTER_TIME <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("REGISTER_TIME like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("REGISTER_TIME not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("REGISTER_TIME in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("REGISTER_TIME not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("LAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("LAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(String value) {
            addCriterion("LAST_TIME =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(String value) {
            addCriterion("LAST_TIME <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(String value) {
            addCriterion("LAST_TIME >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_TIME >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(String value) {
            addCriterion("LAST_TIME <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_TIME <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLike(String value) {
            addCriterion("LAST_TIME like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotLike(String value) {
            addCriterion("LAST_TIME not like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<String> values) {
            addCriterion("LAST_TIME in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<String> values) {
            addCriterion("LAST_TIME not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(String value1, String value2) {
            addCriterion("LAST_TIME between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_TIME not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("IS_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("IS_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(String value) {
            addCriterion("IS_SHOW =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(String value) {
            addCriterion("IS_SHOW <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(String value) {
            addCriterion("IS_SHOW >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHOW >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(String value) {
            addCriterion("IS_SHOW <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(String value) {
            addCriterion("IS_SHOW <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLike(String value) {
            addCriterion("IS_SHOW like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotLike(String value) {
            addCriterion("IS_SHOW not like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<String> values) {
            addCriterion("IS_SHOW in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<String> values) {
            addCriterion("IS_SHOW not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(String value1, String value2) {
            addCriterion("IS_SHOW between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(String value1, String value2) {
            addCriterion("IS_SHOW not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("ROLE_ID like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("ROLE_ID not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andMemRemarksIsNull() {
            addCriterion("MEM_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andMemRemarksIsNotNull() {
            addCriterion("MEM_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andMemRemarksEqualTo(String value) {
            addCriterion("MEM_REMARKS =", value, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksNotEqualTo(String value) {
            addCriterion("MEM_REMARKS <>", value, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksGreaterThan(String value) {
            addCriterion("MEM_REMARKS >", value, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_REMARKS >=", value, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksLessThan(String value) {
            addCriterion("MEM_REMARKS <", value, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksLessThanOrEqualTo(String value) {
            addCriterion("MEM_REMARKS <=", value, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksLike(String value) {
            addCriterion("MEM_REMARKS like", value, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksNotLike(String value) {
            addCriterion("MEM_REMARKS not like", value, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksIn(List<String> values) {
            addCriterion("MEM_REMARKS in", values, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksNotIn(List<String> values) {
            addCriterion("MEM_REMARKS not in", values, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksBetween(String value1, String value2) {
            addCriterion("MEM_REMARKS between", value1, value2, "memRemarks");
            return (Criteria) this;
        }

        public Criteria andMemRemarksNotBetween(String value1, String value2) {
            addCriterion("MEM_REMARKS not between", value1, value2, "memRemarks");
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