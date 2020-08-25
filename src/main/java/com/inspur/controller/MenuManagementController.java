package com.inspur.controller;

import com.inspur.bean.MenuManagement;
import com.inspur.bean.MenuParent;
import com.inspur.service.MenuManagementService;
import com.inspur.service.MenuParentService;
import com.inspur.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/menu")
public class MenuManagementController {
    @Autowired
    MenuManagementService menuManagementService;
    @Autowired
    MenuParentService menuParentService;

    @ResponseBody
    @GetMapping("/list")
    public Result getMenus(HttpServletRequest request) {
        Object token = request.getSession().getAttribute("token");
        if (token == null) {
            return Result.fail().setMsg("用户未登录！");
        }
        //获取用户权限
        Object role = (String) request.getSession().getAttribute("role");
        //String role = "0";
        List<MenuParent> menuParents = menuParentService.list();
        List<MenuManagement> menuManagements = menuManagementService.list();
        if (menuParents != null) {//父菜单不为空
            if ("0".equals(role)) {
                for (MenuParent mp : menuParents) {//循环父菜单
                    List<MenuManagement> menus = new ArrayList();
                    for (MenuManagement mm : menuManagements) {//循环子菜单
                        if (mp.getMenuId() == mm.getParentId()) {//判断父菜单id是否等于当前菜单的父菜单id
                            menus.add(mm);
                        }
                    }
                    mp.setMenus(menus);
                }
                return Result.success().add("menuParents", menuParents);
            } else {
                List<MenuParent> menuParents2 = new ArrayList<>();
                for (MenuParent mp : menuParents) {//循环父菜单
                    List<MenuManagement> menus = new ArrayList();
                    if (role.equals(mp.getIsShow())) {//判断菜单权限是否和用户权限一样
                        for (MenuManagement mm : menuManagements) {//循环子菜单
                            if (role.equals(mm.getIsShow())) {//判断菜单权限是否和用户权限一样
                                if (mp.getMenuId() == mm.getParentId()) {//判断父菜单id是否等于当前菜单的父菜单id
                                    menus.add(mm);
                                }
                            }
                        }
                        mp.setMenus(menus);
                        menuParents2.add(mp);
                    }
                }
                return Result.success().add("menuParents", menuParents2);
            }
        }
        return Result.fail();
    }

    @ResponseBody
    @PostMapping("/addParentMenu")
    public Result addParentMenu(@RequestBody MenuParent menuParent) {
        menuParent.setParentName("根菜单");
        int num = menuParentService.add(menuParent);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @PostMapping("/addMenu")
    public Result addMenu(@RequestBody MenuManagement menuManagement) {
        int num = menuManagementService.add(menuManagement);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @GetMapping("/getParent/{id}")
    @ResponseBody
    public Result getMenuParent(@PathVariable("id") Integer id) {
        MenuParent menuParent = menuParentService.getMenuParentById(id);
        if (menuParent != null) {
            return Result.success().add("menuParent", menuParent);
        }
        return Result.fail();

    }

    @GetMapping("/getMenu/{id}")
    @ResponseBody
    public Result getMenu(@PathVariable("id") Integer id) {
        MenuManagement menuManagement = menuManagementService.getMenuById(id);
        if (menuManagement != null) {
            return Result.success().add("menuManagement", menuManagement);
        }
        return Result.fail();
    }

    @GetMapping("/getMenuByParentId/{id}")
    @ResponseBody
    public Result getMenuByParentId(@PathVariable("id") Integer id) {
        List<MenuManagement> byParentId = menuManagementService.getMenuByParentId(id);
        if (byParentId.size() > 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @PostMapping("/updateMenuParent")
    @ResponseBody
    public Result updateMenuParent(@RequestBody MenuParent menuParent) {
        Integer num = menuParentService.update(menuParent);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @PostMapping("/updateMenu")
    @ResponseBody
    public Result updateMenu(@RequestBody MenuManagement menuManagement) {
        Integer num = menuManagementService.update(menuManagement);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @DeleteMapping("/delMenuParent/{id}")
    @ResponseBody
    public Result deleteMenuParentById(@PathVariable("id") Integer id) {
        Integer num = menuParentService.deleteById(id);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @DeleteMapping("/delMenu/{id}")
    @ResponseBody
    public Result deleteMenuById(@PathVariable("id") Integer id) {
        Integer num = menuManagementService.deleteById(id);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }
}
