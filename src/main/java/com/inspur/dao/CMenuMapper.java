package com.inspur.dao;

import com.inspur.bean.MenuManagement;
import com.inspur.bean.MenuManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CMenuMapper {
    long countByExample(MenuManagementExample example);

    int deleteByExample(MenuManagementExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(MenuManagement record);

    int insertSelective(MenuManagement record);

    List<MenuManagement> selectByExample(MenuManagementExample example);

    MenuManagement selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") MenuManagement record, @Param("example") MenuManagementExample example);

    int updateByExample(@Param("record") MenuManagement record, @Param("example") MenuManagementExample example);

    int updateByPrimaryKeySelective(MenuManagement record);

    int updateByPrimaryKey(MenuManagement record);
}