package com.inspur.bean;

import java.io.Serializable;

public class CMember implements Serializable {

    private Integer memId;

    private String memName;

    private String memPass;

    private String memSex;

    private String memBorn;

    private String memMail;

    private String memQuestion;

    private String memAnswer;

    private String registerTime;

    private String lastTime;

    private String isShow;

    private String roleId;

    private String memRemarks;

    private String delFlag;

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName == null ? null : memName.trim();
    }

    public String getMemPass() {
        return memPass;
    }

    public void setMemPass(String memPass) {
        this.memPass = memPass == null ? null : memPass.trim();
    }

    public String getMemSex() {
        return memSex;
    }

    public void setMemSex(String memSex) {
        this.memSex = memSex == null ? null : memSex.trim();
    }

    public String getMemBorn() {
        return memBorn;
    }

    public void setMemBorn(String memBorn) {
        this.memBorn = memBorn == null ? null : memBorn.trim();
    }

    public String getMemMail() {
        return memMail;
    }

    public void setMemMail(String memMail) {
        this.memMail = memMail == null ? null : memMail.trim();
    }

    public String getMemQuestion() {
        return memQuestion;
    }

    public void setMemQuestion(String memQuestion) {
        this.memQuestion = memQuestion == null ? null : memQuestion.trim();
    }

    public String getMemAnswer() {
        return memAnswer;
    }

    public void setMemAnswer(String memAnswer) {
        this.memAnswer = memAnswer == null ? null : memAnswer.trim();
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow == null ? null : isShow.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getMemRemarks() {
        return memRemarks;
    }

    public void setMemRemarks(String memRemarks) {
        this.memRemarks = memRemarks == null ? null : memRemarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}