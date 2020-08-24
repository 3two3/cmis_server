package com.inspur.service.impl;

import com.inspur.bean.CmarketingRecord;
import com.inspur.bean.CmarketingRecordExample;
import com.inspur.dao.CmarketingRecordMapper;
import com.inspur.service.CmarketingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmarketingRecordServiceImpl implements CmarketingRecordService {
    @Autowired
    CmarketingRecordMapper cmarketingRecordMapper;

    @Override
    public List<CmarketingRecord> list(String cCmId, String cName) {
        CmarketingRecordExample cmarketingRecordExample = new CmarketingRecordExample();
        CmarketingRecordExample.Criteria criteria = cmarketingRecordExample.createCriteria();
        if ("".equals(cCmId) && "".equals(cName)) {
            return cmarketingRecordMapper.selectByExample(null);
        }
        if (!"".equals(cCmId)) {
            int i = Integer.parseInt(cCmId);
            criteria.andCCmIdEqualTo(i);
        }
        if (!"".equals(cName)) {
            cName = "%" + cName + "%";
            criteria.andCNameLike(cName);
        }
        return cmarketingRecordMapper.selectByExample(cmarketingRecordExample);
    }

    @Override
    public Integer add(CmarketingRecord cmarketingRecord) {
        return cmarketingRecordMapper.insert(cmarketingRecord);
    }

    @Override
    public Integer delMarkRecords(List<Integer> delIds) {
        CmarketingRecordExample cmarketingRecordExample = new CmarketingRecordExample();
        CmarketingRecordExample.Criteria criteria = cmarketingRecordExample.createCriteria();
        criteria.andCKeyIn(delIds);
        return cmarketingRecordMapper.deleteByExample(cmarketingRecordExample);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cmarketingRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CmarketingRecord getMarkRecordById(Integer id) {
        return cmarketingRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer update(CmarketingRecord cmarketingRecord) {
        return cmarketingRecordMapper.updateByPrimaryKey(cmarketingRecord);
    }
}
