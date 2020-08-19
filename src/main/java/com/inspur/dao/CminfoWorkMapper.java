package com.inspur.dao;

import com.inspur.bean.CminfoWork;
import com.inspur.bean.CminfoWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CminfoWorkMapper {
    long countByExample(CminfoWorkExample example);

    int deleteByExample(CminfoWorkExample example);

    int deleteByPrimaryKey(Integer cmKey);

    int insert(CminfoWork record);

    int insertSelective(CminfoWork record);

    List<CminfoWork> selectByExampleWithBLOBs(CminfoWorkExample example);

    List<CminfoWork> selectByExample(CminfoWorkExample example);

    CminfoWork selectByPrimaryKey(Integer cmKey);

    int updateByExampleSelective(@Param("record") CminfoWork record, @Param("example") CminfoWorkExample example);

    int updateByExampleWithBLOBs(@Param("record") CminfoWork record, @Param("example") CminfoWorkExample example);

    int updateByExample(@Param("record") CminfoWork record, @Param("example") CminfoWorkExample example);

    int updateByPrimaryKeySelective(CminfoWork record);

    int updateByPrimaryKeyWithBLOBs(CminfoWork record);

    int updateByPrimaryKey(CminfoWork record);
}