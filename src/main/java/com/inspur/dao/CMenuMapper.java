package com.inspur.dao;

import com.inspur.bean.CMenu;
import com.inspur.bean.CMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CMenuMapper {
    long countByExample(CMenuExample example);

    int deleteByExample(CMenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(CMenu record);

    int insertSelective(CMenu record);

    List<CMenu> selectByExample(CMenuExample example);

    CMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") CMenu record, @Param("example") CMenuExample example);

    int updateByExample(@Param("record") CMenu record, @Param("example") CMenuExample example);

    int updateByPrimaryKeySelective(CMenu record);

    int updateByPrimaryKey(CMenu record);
}