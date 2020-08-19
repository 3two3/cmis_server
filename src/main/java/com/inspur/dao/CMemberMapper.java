package com.inspur.dao;

import com.inspur.bean.CMember;
import com.inspur.bean.CMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CMemberMapper {
    long countByExample(CMemberExample example);

    int deleteByExample(CMemberExample example);

    int deleteByPrimaryKey(String memId);

    int insert(CMember record);

    int insertSelective(CMember record);

    List<CMember> selectByExample(CMemberExample example);

    CMember selectByPrimaryKey(String memId);

    int updateByExampleSelective(@Param("record") CMember record, @Param("example") CMemberExample example);

    int updateByExample(@Param("record") CMember record, @Param("example") CMemberExample example);

    int updateByPrimaryKeySelective(CMember record);

    int updateByPrimaryKey(CMember record);
}