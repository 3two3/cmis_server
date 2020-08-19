package com.inspur.dao;

import com.inspur.bean.CMenuParent;
import com.inspur.bean.CMenuParentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CMenuParentMapper {
    long countByExample(CMenuParentExample example);

    int deleteByExample(CMenuParentExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(CMenuParent record);

    int insertSelective(CMenuParent record);

    List<CMenuParent> selectByExample(CMenuParentExample example);

    CMenuParent selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") CMenuParent record, @Param("example") CMenuParentExample example);

    int updateByExample(@Param("record") CMenuParent record, @Param("example") CMenuParentExample example);

    int updateByPrimaryKeySelective(CMenuParent record);

    int updateByPrimaryKey(CMenuParent record);
}