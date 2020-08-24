package com.inspur.service.impl;

import com.inspur.bean.MenuParent;
import com.inspur.dao.CMenuParentMapper;
import com.inspur.service.MenuParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuParentServiceImpl implements MenuParentService {
    @Autowired
    CMenuParentMapper menuParentMapper;

    @Override
    public List<MenuParent> list() {
        return menuParentMapper.selectByExample(null);
    }

    @Override
    public Integer add(MenuParent menuParent) {
        return menuParentMapper.insert(menuParent);
    }

    @Override
    public Integer update(MenuParent menuParent) {
        return menuParentMapper.updateByPrimaryKey(menuParent);
    }

    @Override
    public Integer deleteById(Integer id) {
        return menuParentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public MenuParent getMenuParentById(Integer id) {
        return menuParentMapper.selectByPrimaryKey(id);
    }
}
