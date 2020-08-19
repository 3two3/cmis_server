package com.inspur.dao;

import com.inspur.bean.Cmregular;
import com.inspur.bean.CmregularExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmregularMapper {
    long countByExample(CmregularExample example);

    int deleteByExample(CmregularExample example);

    int deleteByPrimaryKey(Integer cmKey);

    int insert(Cmregular record);

    int insertSelective(Cmregular record);

    List<Cmregular> selectByExample(CmregularExample example);

    Cmregular selectByPrimaryKey(Integer cmKey);

    int updateByExampleSelective(@Param("record") Cmregular record, @Param("example") CmregularExample example);

    int updateByExample(@Param("record") Cmregular record, @Param("example") CmregularExample example);

    int updateByPrimaryKeySelective(Cmregular record);

    int updateByPrimaryKey(Cmregular record);
}