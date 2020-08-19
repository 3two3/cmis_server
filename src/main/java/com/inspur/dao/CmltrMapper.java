package com.inspur.dao;

import com.inspur.bean.Cmltr;
import com.inspur.bean.CmltrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmltrMapper {
    long countByExample(CmltrExample example);

    int deleteByExample(CmltrExample example);

    int deleteByPrimaryKey(Integer cmKey);

    int insert(Cmltr record);

    int insertSelective(Cmltr record);

    List<Cmltr> selectByExample(CmltrExample example);

    Cmltr selectByPrimaryKey(Integer cmKey);

    int updateByExampleSelective(@Param("record") Cmltr record, @Param("example") CmltrExample example);

    int updateByExample(@Param("record") Cmltr record, @Param("example") CmltrExample example);

    int updateByPrimaryKeySelective(Cmltr record);

    int updateByPrimaryKey(Cmltr record);
}