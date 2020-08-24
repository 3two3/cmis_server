package com.inspur.service;

import com.inspur.bean.MenuManagement;

import java.util.List;

public interface MenuManagementService {

    List<MenuManagement> list();

    Integer add(MenuManagement menuManagement);

    MenuManagement getMenuById(Integer id);

    Integer update(MenuManagement menuManagement);

    Integer deleteById(Integer id);

    List<MenuManagement> getMenuByParentId(Integer id);
}
