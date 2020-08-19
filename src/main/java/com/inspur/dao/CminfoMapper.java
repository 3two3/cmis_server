package com.inspur.dao;

import com.inspur.bean.Cminfo;
import com.inspur.bean.CminfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CminfoMapper {
    long countByExample(CminfoExample example);

    int deleteByExample(CminfoExample example);

    int deleteByPrimaryKey(Integer cmId);

    int insert(Cminfo record);

    int insertSelective(Cminfo record);

    List<Cminfo> selectByExample(CminfoExample example);

    Cminfo selectByPrimaryKey(Integer cmId);

    int updateByExampleSelective(@Param("record") Cminfo record, @Param("example") CminfoExample example);

    int updateByExample(@Param("record") Cminfo record, @Param("example") CminfoExample example);

    int updateByPrimaryKeySelective(Cminfo record);

    int updateByPrimaryKey(Cminfo record);
}