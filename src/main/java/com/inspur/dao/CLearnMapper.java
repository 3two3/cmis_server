package com.inspur.dao;

import com.inspur.bean.CLearn;
import com.inspur.bean.CLearnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CLearnMapper {
    long countByExample(CLearnExample example);

    int deleteByExample(CLearnExample example);

    int deleteByPrimaryKey(Integer lKey);

    int insert(CLearn record);

    int insertSelective(CLearn record);

    List<CLearn> selectByExample(CLearnExample example);

    CLearn selectByPrimaryKey(Integer lKey);

    int updateByExampleSelective(@Param("record") CLearn record, @Param("example") CLearnExample example);

    int updateByExample(@Param("record") CLearn record, @Param("example") CLearnExample example);

    int updateByPrimaryKeySelective(CLearn record);

    int updateByPrimaryKey(CLearn record);
}