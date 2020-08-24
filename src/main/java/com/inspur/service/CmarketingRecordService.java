package com.inspur.service;

import com.inspur.bean.CmarketingRecord;

import java.util.List;

public interface CmarketingRecordService {
    List<CmarketingRecord> list(String cCmId, String cName);

    Integer add(CmarketingRecord cmarketingRecord);

    Integer delMarkRecords(List<Integer> delIds);

    Integer deleteById(Integer id);

    CmarketingRecord getMarkRecordById(Integer id);

    Integer update(CmarketingRecord cmarketingRecord);
}
