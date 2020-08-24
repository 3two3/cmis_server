package com.inspur.dao;

import com.inspur.bean.MenuParent;
import com.inspur.bean.MenuParentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CMenuParentMapper {
    long countByExample(MenuParentExample example);

    int deleteByExample(MenuParentExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(MenuParent record);

    int insertSelective(MenuParent record);

    List<MenuParent> selectByExample(MenuParentExample example);

    MenuParent selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") MenuParent record, @Param("example") MenuParentExample example);

    int updateByExample(@Param("record") MenuParent record, @Param("example") MenuParentExample example);

    int updateByPrimaryKeySelective(MenuParent record);

    int updateByPrimaryKey(MenuParent record);
}