package com.inspur.bean;

public class Certificate {
    private Integer cmKey;

    private String cmId;

    private String cmCertificateName;

    private String cmCertificateType;

    private String cmCertificateNo;

    private String cmCertificateUnit;

    private String cmStartDate;

    private String cmEndDate;

    private Integer cmPeriod;

    private String cmCertificateUrl;

    private String cmInvalid;

    private String cmRemark;

    private String cmModificationDate;

    private String cmModificationPerson;

    private String cmRemarks;

    private String delFlag;

    public Integer getCmKey() {
        return cmKey;
    }

    public void setCmKey(Integer cmKey) {
        this.cmKey = cmKey;
    }

    public String getCmId() {
        return cmId;
    }

    public void setCmId(String cmId) {
        this.cmId = cmId == null ? null : cmId.trim();
    }

    public String getCmCertificateName() {
        return cmCertificateName;
    }

    public void setCmCertificateName(String cmCertificateName) {
        this.cmCertificateName = cmCertificateName == null ? null : cmCertificateName.trim();
    }

    public String getCmCertificateType() {
        return cmCertificateType;
    }

    public void setCmCertificateType(String cmCertificateType) {
        this.cmCertificateType = cmCertificateType == null ? null : cmCertificateType.trim();
    }

    public String getCmCertificateNo() {
        return cmCertificateNo;
    }

    public void setCmCertificateNo(String cmCertificateNo) {
        this.cmCertificateNo = cmCertificateNo == null ? null : cmCertificateNo.trim();
    }

    public String getCmCertificateUnit() {
        return cmCertificateUnit;
    }

    public void setCmCertificateUnit(String cmCertificateUnit) {
        this.cmCertificateUnit = cmCertificateUnit == null ? null : cmCertificateUnit.trim();
    }

    public String getCmStartDate() {
        return cmStartDate;
    }

    public void setCmStartDate(String cmStartDate) {
        this.cmStartDate = cmStartDate == null ? null : cmStartDate.trim();
    }

    public String getCmEndDate() {
        return cmEndDate;
    }

    public void setCmEndDate(String cmEndDate) {
        this.cmEndDate = cmEndDate == null ? null : cmEndDate.trim();
    }

    public Integer getCmPeriod() {
        return cmPeriod;
    }

    public void setCmPeriod(Integer cmPeriod) {
        this.cmPeriod = cmPeriod;
    }

    public String getCmCertificateUrl() {
        return cmCertificateUrl;
    }

    public void setCmCertificateUrl(String cmCertificateUrl) {
        this.cmCertificateUrl = cmCertificateUrl == null ? null : cmCertificateUrl.trim();
    }

    public String getCmInvalid() {
        return cmInvalid;
    }

    public void setCmInvalid(String cmInvalid) {
        this.cmInvalid = cmInvalid == null ? null : cmInvalid.trim();
    }

    public String getCmRemark() {
        return cmRemark;
    }

    public void setCmRemark(String cmRemark) {
        this.cmRemark = cmRemark == null ? null : cmRemark.trim();
    }

    public String getCmModificationDate() {
        return cmModificationDate;
    }

    public void setCmModificationDate(String cmModificationDate) {
        this.cmModificationDate = cmModificationDate == null ? null : cmModificationDate.trim();
    }

    public String getCmModificationPerson() {
        return cmModificationPerson;
    }

    public void setCmModificationPerson(String cmModificationPerson) {
        this.cmModificationPerson = cmModificationPerson == null ? null : cmModificationPerson.trim();
    }

    public String getCmRemarks() {
        return cmRemarks;
    }

    public void setCmRemarks(String cmRemarks) {
        this.cmRemarks = cmRemarks == null ? null : cmRemarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}