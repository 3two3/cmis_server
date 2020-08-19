package com.inspur.bean;

import java.math.BigDecimal;

public class Cinfo {
    private Integer cKey;

    private Integer cCmId;

    private String cSsn;

    private String cName;

    private String cTel;

    private BigDecimal cSalary;

    private BigDecimal cBalance;

    private BigDecimal cDebt;

    private String cBusiness;

    private String cUnit;

    private String cAdd;

    private String cRemarks;

    private String delFlag;

    public Integer getcKey() {
        return cKey;
    }

    public void setcKey(Integer cKey) {
        this.cKey = cKey;
    }

    public Integer getcCmId() {
        return cCmId;
    }

    public void setcCmId(Integer cCmId) {
        this.cCmId = cCmId;
    }

    public String getcSsn() {
        return cSsn;
    }

    public void setcSsn(String cSsn) {
        this.cSsn = cSsn == null ? null : cSsn.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcTel() {
        return cTel;
    }

    public void setcTel(String cTel) {
        this.cTel = cTel == null ? null : cTel.trim();
    }

    public BigDecimal getcSalary() {
        return cSalary;
    }

    public void setcSalary(BigDecimal cSalary) {
        this.cSalary = cSalary;
    }

    public BigDecimal getcBalance() {
        return cBalance;
    }

    public void setcBalance(BigDecimal cBalance) {
        this.cBalance = cBalance;
    }

    public BigDecimal getcDebt() {
        return cDebt;
    }

    public void setcDebt(BigDecimal cDebt) {
        this.cDebt = cDebt;
    }

    public String getcBusiness() {
        return cBusiness;
    }

    public void setcBusiness(String cBusiness) {
        this.cBusiness = cBusiness == null ? null : cBusiness.trim();
    }

    public String getcUnit() {
        return cUnit;
    }

    public void setcUnit(String cUnit) {
        this.cUnit = cUnit == null ? null : cUnit.trim();
    }

    public String getcAdd() {
        return cAdd;
    }

    public void setcAdd(String cAdd) {
        this.cAdd = cAdd == null ? null : cAdd.trim();
    }

    public String getcRemarks() {
        return cRemarks;
    }

    public void setcRemarks(String cRemarks) {
        this.cRemarks = cRemarks == null ? null : cRemarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}