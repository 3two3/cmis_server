package com.inspur.service;

import com.inspur.bean.MenuParent;

import java.util.List;

public interface MenuParentService {
    List<MenuParent> list();

    Integer add(MenuParent menuParent);

    Integer update(MenuParent menuParent);

    Integer deleteById(Integer id);

    MenuParent getMenuParentById(Integer id);

}
