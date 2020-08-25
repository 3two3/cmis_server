package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.Dict;
import com.inspur.bean.DictType;
import com.inspur.service.DictService;
import com.inspur.service.DictTypeService;
import com.inspur.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/dict")
public class DictController {
    @Autowired
    DictService dictService;
    @Autowired
    DictTypeService dictTypeService;

    @ResponseBody
    @GetMapping("/dicts")
    public Result getDicts(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, @RequestParam(value = "query", defaultValue = "") String query, @RequestParam(value = "selectType", defaultValue = "") String selectType) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        List<Dict> dicts = dictService.list(query, selectType);
        List<DictType> types = dictTypeService.list();
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(dicts, 5);
        if (dicts != null) {//查询成功
            return Result.success().add("pageInfo", pageInfo).add("types", types);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getDictById(@PathVariable("id") Integer id) {
        Dict dict = dictService.getDictById(id);
        if (dict != null) {
            return Result.success().add("dict", dict);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @GetMapping("/getDictByType/{id}")
    public Result getDictByType(@PathVariable("id") Integer id) {
        List<Dict> dicts = dictService.getDictByType(id);
        if (dicts.size() > 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/addDict")
    public Result addDict(@RequestBody Dict dict) {
        List<Dict> dictByName = dictService.queryByDictName(dict.getDictName());
        if (dictByName.size() > 0) {
            return Result.fail().setMsg("已有此标签名，不可重复添加！");
        }
        int num = dictService.add(dict);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/addDictType")
    public Result addDictType(@RequestBody DictType dictType) {
        List<DictType> dictTypeByName = dictTypeService.getDictTypeByName(dictType.getDictTypeName());
        if (dictTypeByName.size() > 0) {
            return Result.fail().setMsg("已有此字典类型，不可重复添加！");
        }
        int num = dictTypeService.add(dictType);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail().setMsg("添加字典类型失败");
        }
    }

    @ResponseBody
    @PostMapping("/updateDict")
    public Result updateDict(@RequestBody Dict dict) {
        List<Dict> dictByName = dictService.queryByDictName(dict.getDictName());
        if (dictByName.size() > 0) {
            return Result.fail().setMsg("已有此标签名，不可重复添加！");
        }
        int num = dictService.update(dict);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delDict/{id}")
    public Result deleteDictById(@PathVariable("id") Integer id) {
        int num = dictService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delDictType/{id}")
    public Result deleteDictType(@PathVariable("id") Integer id) {
        int num = dictTypeService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delDicts/{ids}")
    public Result delDicts(@PathVariable("ids") Integer[] ids) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = dictService.delDicts(delIds);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

}
