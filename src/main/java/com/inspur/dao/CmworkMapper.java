package com.inspur.dao;

import com.inspur.bean.Cmwork;
import com.inspur.bean.CmworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmworkMapper {
    long countByExample(CmworkExample example);

    int deleteByExample(CmworkExample example);

    int deleteByPrimaryKey(Integer cmKey);

    int insert(Cmwork record);

    int insertSelective(Cmwork record);

    List<Cmwork> selectByExampleWithBLOBs(CmworkExample example);

    List<Cmwork> selectByExample(CmworkExample example);

    Cmwork selectByPrimaryKey(Integer cmKey);

    int updateByExampleSelective(@Param("record") Cmwork record, @Param("example") CmworkExample example);

    int updateByExampleWithBLOBs(@Param("record") Cmwork record, @Param("example") CmworkExample example);

    int updateByExample(@Param("record") Cmwork record, @Param("example") CmworkExample example);

    int updateByPrimaryKeySelective(Cmwork record);

    int updateByPrimaryKeyWithBLOBs(Cmwork record);

    int updateByPrimaryKey(Cmwork record);
}