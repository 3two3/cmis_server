package com.inspur.dao;

import com.inspur.bean.CmarketingRecord;
import com.inspur.bean.CmarketingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmarketingRecordMapper {
    long countByExample(CmarketingRecordExample example);

    int deleteByExample(CmarketingRecordExample example);

    int deleteByPrimaryKey(Integer cKey);

    int insert(CmarketingRecord record);

    int insertSelective(CmarketingRecord record);

    List<CmarketingRecord> selectByExample(CmarketingRecordExample example);

    CmarketingRecord selectByPrimaryKey(Integer cKey);

    int updateByExampleSelective(@Param("record") CmarketingRecord record, @Param("example") CmarketingRecordExample example);

    int updateByExample(@Param("record") CmarketingRecord record, @Param("example") CmarketingRecordExample example);

    int updateByPrimaryKeySelective(CmarketingRecord record);

    int updateByPrimaryKey(CmarketingRecord record);
}