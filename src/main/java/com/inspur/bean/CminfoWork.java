package com.inspur.bean;

public class CminfoWork {
    private Integer cmKey;

    private String cmId;

    private String cmManagement;

    private String cmProduct;

    private String cmLoan;

    private String cmWarning;

    private String cmIssue;

    private String cmDate;

    private String cmRemarks;

    private String delFlag;

    private String cmWorkProposal;

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

    public String getCmManagement() {
        return cmManagement;
    }

    public void setCmManagement(String cmManagement) {
        this.cmManagement = cmManagement == null ? null : cmManagement.trim();
    }

    public String getCmProduct() {
        return cmProduct;
    }

    public void setCmProduct(String cmProduct) {
        this.cmProduct = cmProduct == null ? null : cmProduct.trim();
    }

    public String getCmLoan() {
        return cmLoan;
    }

    public void setCmLoan(String cmLoan) {
        this.cmLoan = cmLoan == null ? null : cmLoan.trim();
    }

    public String getCmWarning() {
        return cmWarning;
    }

    public void setCmWarning(String cmWarning) {
        this.cmWarning = cmWarning == null ? null : cmWarning.trim();
    }

    public String getCmIssue() {
        return cmIssue;
    }

    public void setCmIssue(String cmIssue) {
        this.cmIssue = cmIssue == null ? null : cmIssue.trim();
    }

    public String getCmDate() {
        return cmDate;
    }

    public void setCmDate(String cmDate) {
        this.cmDate = cmDate == null ? null : cmDate.trim();
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

    public String getCmWorkProposal() {
        return cmWorkProposal;
    }

    public void setCmWorkProposal(String cmWorkProposal) {
        this.cmWorkProposal = cmWorkProposal == null ? null : cmWorkProposal.trim();
    }
}