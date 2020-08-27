package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.Cminfo;
import com.inspur.bean.Dict;
import com.inspur.service.CminfoService;
import com.inspur.service.DictService;
import com.inspur.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/cminfo")
public class CminfoController {
    @Autowired
    CminfoService cminfoService;
    @Autowired
    DictService dictService;

    @ResponseBody
    @GetMapping("/list")
    public Result getCminfos(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                             @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                             @RequestParam(value = "cmUnit", defaultValue = "") String cmUnit,
                             @RequestParam(value = "cmId", defaultValue = "") String cmId,
                             @RequestParam(value = "cmName", defaultValue = "") String cmName,
                             @RequestParam(value = "cmStatus", defaultValue = "") String cmStatus) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        //获取客户经理信息，可多条件查询
        List<Cminfo> cminfos = cminfoService.list(cmUnit, cmId, cmName, cmStatus);
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(cminfos, 5);
        if (cminfos != null) {//查询成功
            //获取民族字典列表
            List<Dict> nations = dictService.queryByTypeName("民族");
            List<Dict> politicalOutlook = dictService.queryByTypeName("政治面貌");
            List<Dict> education = dictService.queryByTypeName("学历");
            List<Dict> academicDegree = dictService.queryByTypeName("学位");
            List<Dict> businessLine = dictService.queryByTypeName("业务条线");
            List<Dict> grade = dictService.queryByTypeName("客户经理等级");
            List<Dict> branchDept = dictService.queryByTypeName("省分行、二级分行、支行人员可选部门");
            List<Dict> outlets = dictService.queryByTypeName("网点人员可选部门");
            return Result.success().add("pageInfo", pageInfo)
                    .add("nations", nations)
                    .add("politicalOutlook", politicalOutlook)
                    .add("education", education)
                    .add("academicDegree", academicDegree)
                    .add("businessLine", businessLine)
                    .add("grade", grade)
                    .add("branchDept", branchDept)
                    .add("outlets", outlets);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @GetMapping("/reportList")
    public Result getReportCminfos(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                   @RequestParam(value = "cmUnit", defaultValue = "") String cmUnit,
                                   @RequestParam(value = "cmStatus", defaultValue = "") String cmStatus,
                                   @RequestParam(value = "cmSex", defaultValue = "") String cmSex,
                                   @RequestParam(value = "cmEducation", defaultValue = "") String cmEducation,
                                   @RequestParam(value = "cmProfessionalTitles", defaultValue = "") String cmProfessionalTitles,
                                   @RequestParam(value = "cmLevel", defaultValue = "") String cmLevel) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        //获取客户经理信息，可多条件查询
        List<Cminfo> cminfos = cminfoService.reportList(cmUnit, cmStatus, cmSex, cmEducation, cmProfessionalTitles, cmLevel);
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(cminfos, 5);
        if (cminfos != null) {//查询成功
            List<Dict> education = dictService.queryByTypeName("学历");
            List<Dict> grade = dictService.queryByTypeName("客户经理等级");
            return Result.success().add("pageInfo", pageInfo)
                    .add("cmEducation_arr", education)
                    .add("cmLevel_arr", grade);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/checkIdCardIsOnly")
    public Result checkIdCardIsOnly(@RequestParam("idCard") String idCard) {
        List<Cminfo> cminfoByCmSsn = cminfoService.getCminfoByCmSsn(idCard);
        if (cminfoByCmSsn.size() > 0) {
            return Result.fail();
        }
        return Result.success();
    }

    @ResponseBody
    @PostMapping("/addCminfo")
    public Result addCminfo(@RequestBody Cminfo cminfo) {
        int num = cminfoService.add(cminfo);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getCminfoById(@PathVariable("id") Integer id) {
        Cminfo cminfo = cminfoService.getCminfoById(id);
        if (cminfo != null) {
            return Result.success().add("cminfo", cminfo);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCminfo/{id}")
    public Result delCminfoById(@PathVariable("id") Integer id) {
        int num = cminfoService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/updateCminfo")
    public Result updateCminfo(@RequestBody Cminfo cminfo) {
        int num = cminfoService.update(cminfo);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCminfos/{ids}")
    public Result delCminfos(@PathVariable("ids") Integer[] ids) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = cminfoService.delCminfos(delIds);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }
}
