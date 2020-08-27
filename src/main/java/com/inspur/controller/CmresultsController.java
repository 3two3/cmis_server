package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.Cminfo;
import com.inspur.bean.Cmresults;
import com.inspur.bean.Dict;
import com.inspur.service.CminfoService;
import com.inspur.service.CmresultsService;
import com.inspur.service.DictService;
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
@RequestMapping("/cmResults")
public class CmresultsController {
    @Autowired
    CmresultsService cmresultsService;

    @Autowired
    CminfoService cminfoService;

    @Autowired
    DictService dictService;

    @ResponseBody
    @GetMapping("/list")
    public Result getCmresults(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                               @RequestParam(value = "cmId", defaultValue = "") String cmId,
                               @RequestParam(value = "cmYear", defaultValue = "") String cmYear) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        //获取客户经理信息，可多条件查询
        List<Cmresults> cmresults = cmresultsService.list(cmId, cmYear);
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(cmresults, 5);
        if (cmresults != null) {//查询成功
            List<Dict> workResults = dictService.queryByTypeName("工作业绩");
            List<Cminfo> cminfos = cminfoService.list("", "", "", "");
            return Result.success().add("pageInfo", pageInfo).add("cminfos", cminfos).add("workResults", workResults);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/addCmresult")
    public Result addCmresult(@RequestBody Cmresults cmresults, HttpServletRequest request) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
        String now = dateFormat.format(date);
        cmresults.setCmModificationDate(now);
        Object cmName = request.getSession().getAttribute("cmName");
        cmresults.setCmModificationPerson((String) cmName);

        int num = cmresultsService.add(cmresults);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getCmresultById(@PathVariable("id") Integer id) {
        Cmresults cmresults = cmresultsService.getCmresultById(id);
        if (cmresults != null) {
            return Result.success().add("cmresults", cmresults);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCmresult/{id}")
    public Result delCmresultById(@PathVariable("id") Integer id) {
        int num = cmresultsService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/updateCmresult")
    public Result updateCmresult(@RequestBody Cmresults cmresults) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
        String now = dateFormat.format(date);
        cmresults.setCmModificationDate(now);
        int num = cmresultsService.update(cmresults);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCmresults/{ids}")
    public Result delCmresults(@PathVariable("ids") Integer[] ids) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = cmresultsService.delCmresults(delIds);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/checkYear")
    public Result checkYear(@RequestParam("year") String year, @RequestParam("cmId") String cmId) {
        if (!"".equals(cmId)){
            List<Cmresults> cinfoByCmSsn = cmresultsService.getCmresultByYear(year,cmId);
            if (cinfoByCmSsn.size() > 0) {
                return Result.fail();
            }
        }
        return Result.success();
    }
}
