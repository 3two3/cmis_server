package com.inspur.dao;

import com.inspur.bean.CDictType;
import com.inspur.bean.CDictTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDictTypeMapper {
    long countByExample(CDictTypeExample example);

    int deleteByExample(CDictTypeExample example);

    int deleteByPrimaryKey(Integer dictTypeId);

    int insert(CDictType record);

    int insertSelective(CDictType record);

    List<CDictType> selectByExample(CDictTypeExample example);

    CDictType selectByPrimaryKey(Integer dictTypeId);

    int updateByExampleSelective(@Param("record") CDictType record, @Param("example") CDictTypeExample example);

    int updateByExample(@Param("record") CDictType record, @Param("example") CDictTypeExample example);

    int updateByPrimaryKeySelective(CDictType record);

    int updateByPrimaryKey(CDictType record);
}