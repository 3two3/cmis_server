package com.inspur.dao;

import com.inspur.bean.Cmlevel;
import com.inspur.bean.CmlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmlevelMapper {
    long countByExample(CmlevelExample example);

    int deleteByExample(CmlevelExample example);

    int deleteByPrimaryKey(Integer cmKey);

    int insert(Cmlevel record);

    int insertSelective(Cmlevel record);

    List<Cmlevel> selectByExample(CmlevelExample example);

    Cmlevel selectByPrimaryKey(Integer cmKey);

    int updateByExampleSelective(@Param("record") Cmlevel record, @Param("example") CmlevelExample example);

    int updateByExample(@Param("record") Cmlevel record, @Param("example") CmlevelExample example);

    int updateByPrimaryKeySelective(Cmlevel record);

    int updateByPrimaryKey(Cmlevel record);
}