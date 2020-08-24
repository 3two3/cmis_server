package com.inspur.service.impl;

import com.inspur.bean.MenuManagement;
import com.inspur.bean.MenuManagementExample;
import com.inspur.dao.CMenuMapper;
import com.inspur.service.MenuManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("menuManagementService")
@Transactional
public class MenuManagementServiceImpl implements MenuManagementService {
    @Autowired
    CMenuMapper menuManagementMapper;

    @Override
    public List<MenuManagement> list() {
        return menuManagementMapper.selectByExample(null);
    }

    @Override
    public Integer add(MenuManagement menuManagement) {
        return menuManagementMapper.insert(menuManagement);
    }

    @Override
    public MenuManagement getMenuById(Integer id) {
        return menuManagementMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer update(MenuManagement menuManagement) {
        return menuManagementMapper.updateByPrimaryKey(menuManagement);
    }

    @Override
    public Integer deleteById(Integer id) {
        return menuManagementMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<MenuManagement> getMenuByParentId(Integer id) {
        MenuManagementExample MenuManagementExample = new MenuManagementExample();
        MenuManagementExample.Criteria criteria = MenuManagementExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        return menuManagementMapper.selectByExample(MenuManagementExample);
    }
}
