package com.inspur.dao;

import com.inspur.bean.Cmresults;
import com.inspur.bean.CmresultsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmresultsMapper {
    long countByExample(CmresultsExample example);

    int deleteByExample(CmresultsExample example);

    int deleteByPrimaryKey(Integer cmKey);

    int insert(Cmresults record);

    int insertSelective(Cmresults record);

    List<Cmresults> selectByExample(CmresultsExample example);

    Cmresults selectByPrimaryKey(Integer cmKey);

    int updateByExampleSelective(@Param("record") Cmresults record, @Param("example") CmresultsExample example);

    int updateByExample(@Param("record") Cmresults record, @Param("example") CmresultsExample example);

    int updateByPrimaryKeySelective(Cmresults record);

    int updateByPrimaryKey(Cmresults record);
}