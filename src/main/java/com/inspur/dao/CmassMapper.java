package com.inspur.dao;

import com.inspur.bean.Cmass;
import com.inspur.bean.CmassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmassMapper {
    long countByExample(CmassExample example);

    int deleteByExample(CmassExample example);

    int deleteByPrimaryKey(Integer cmKey);

    int insert(Cmass record);

    int insertSelective(Cmass record);

    List<Cmass> selectByExample(CmassExample example);

    Cmass selectByPrimaryKey(Integer cmKey);

    int updateByExampleSelective(@Param("record") Cmass record, @Param("example") CmassExample example);

    int updateByExample(@Param("record") Cmass record, @Param("example") CmassExample example);

    int updateByPrimaryKeySelective(Cmass record);

    int updateByPrimaryKey(Cmass record);
}