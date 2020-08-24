package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.CminfoWork;
import com.inspur.service.CminfoWorkService;
import com.inspur.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("cminfoWork")
public class CminfoWorkController {

    @Autowired
    CminfoWorkService cminfoWorkService;

    @ResponseBody
    @GetMapping("/list")
    public Result getCminfoWorks(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                 @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                 @RequestParam(value = "cmId", defaultValue = "") String cmId,
                                 @RequestParam(value = "cmDate", defaultValue = "") String cmDate) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        //获取客户经理信息，可多条件查询
        List<CminfoWork> cminfoWorks = cminfoWorkService.list(cmId, cmDate);
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(cminfoWorks, 5);
        if (cminfoWorks != null) {//查询成功
            return Result.success().add("pageInfo", pageInfo);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/addCminfoWork")
    public Result addCminfoWork(@RequestBody CminfoWork cminfoWork, HttpServletRequest request) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
        String now = dateFormat.format(date);
        cminfoWork.setCmDate(now);
        Object cmId = request.getSession().getAttribute("cmId");
        cminfoWork.setCmId((Integer) cmId);
        int num = cminfoWorkService.add(cminfoWork);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getCminfoWorkById(@PathVariable("id") Integer id) {
        CminfoWork cminfoWork = cminfoWorkService.getCminfoWorkById(id);
        if (cminfoWork != null) {
            return Result.success().add("cminfoWork", cminfoWork);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCminfoWork/{id}")
    public Result delCminfoWorkById(@PathVariable("id") Integer id) {
        int num = cminfoWorkService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/updateCminfoWork")
    public Result updateCminfoWork(@RequestBody CminfoWork cminfoWork) {
        int num = cminfoWorkService.update(cminfoWork);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCminfoWorks/{ids}")
    public Result delCminfoWorks(@PathVariable("ids") Integer[] ids) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = cminfoWorkService.delCminfoWorks(delIds);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }
}
