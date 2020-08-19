package com.inspur.dao;

import com.inspur.bean.Cmrpr;
import com.inspur.bean.CmrprExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmrprMapper {
    long countByExample(CmrprExample example);

    int deleteByExample(CmrprExample example);

    int deleteByPrimaryKey(Integer cmKey);

    int insert(Cmrpr record);

    int insertSelective(Cmrpr record);

    List<Cmrpr> selectByExample(CmrprExample example);

    Cmrpr selectByPrimaryKey(Integer cmKey);

    int updateByExampleSelective(@Param("record") Cmrpr record, @Param("example") CmrprExample example);

    int updateByExample(@Param("record") Cmrpr record, @Param("example") CmrprExample example);

    int updateByPrimaryKeySelective(Cmrpr record);

    int updateByPrimaryKey(Cmrpr record);
}