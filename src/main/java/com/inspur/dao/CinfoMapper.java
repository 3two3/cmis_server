package com.inspur.dao;

import com.inspur.bean.Cinfo;
import com.inspur.bean.CinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CinfoMapper {
    long countByExample(CinfoExample example);

    int deleteByExample(CinfoExample example);

    int deleteByPrimaryKey(Integer cKey);

    int insert(Cinfo record);

    int insertSelective(Cinfo record);

    List<Cinfo> selectByExample(CinfoExample example);

    Cinfo selectByPrimaryKey(Integer cKey);

    int updateByExampleSelective(@Param("record") Cinfo record, @Param("example") CinfoExample example);

    int updateByExample(@Param("record") Cinfo record, @Param("example") CinfoExample example);

    int updateByPrimaryKeySelective(Cinfo record);

    int updateByPrimaryKey(Cinfo record);
}