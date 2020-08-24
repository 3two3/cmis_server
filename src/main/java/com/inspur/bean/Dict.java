package com.inspur.bean;

import java.math.BigDecimal;

public class Dict {
    private Integer dictId;

    private String dictName;

    private Integer dictValue;

    private String dictType;

    private String dictDescription;

    private BigDecimal dictSort;

    private String dictRemarks;

    private String delFlag;

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    public Integer getDictValue() {
        return dictValue;
    }

    public void setDictValue(Integer dictValue) {
        this.dictValue = dictValue;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getDictDescription() {
        return dictDescription;
    }

    public void setDictDescription(String dictDescription) {
        this.dictDescription = dictDescription == null ? null : dictDescription.trim();
    }

    public BigDecimal getDictSort() {
        return dictSort;
    }

    public void setDictSort(BigDecimal dictSort) {
        this.dictSort = dictSort;
    }

    public String getDictRemarks() {
        return dictRemarks;
    }

    public void setDictRemarks(String dictRemarks) {
        this.dictRemarks = dictRemarks == null ? null : dictRemarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}