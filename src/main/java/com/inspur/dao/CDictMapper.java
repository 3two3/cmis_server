package com.inspur.dao;

import com.inspur.bean.CDict;
import com.inspur.bean.CDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDictMapper {
    long countByExample(CDictExample example);

    int deleteByExample(CDictExample example);

    int deleteByPrimaryKey(Integer dictId);

    int insert(CDict record);

    int insertSelective(CDict record);

    List<CDict> selectByExample(CDictExample example);

    CDict selectByPrimaryKey(Integer dictId);

    int updateByExampleSelective(@Param("record") CDict record, @Param("example") CDictExample example);

    int updateByExample(@Param("record") CDict record, @Param("example") CDictExample example);

    int updateByPrimaryKeySelective(CDict record);

    int updateByPrimaryKey(CDict record);
}