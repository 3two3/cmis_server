package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.Cinfo;
import com.inspur.service.CinfoService;
import com.inspur.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/cinfo")
public class CinfoController {

    @Autowired
    CinfoService cinfoService;

    @ResponseBody
    @GetMapping("/list")
    public Result getDicts(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                           @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                           @RequestParam(value = "cCmId", defaultValue = "") String cCmId,
                           @RequestParam(value = "cName", defaultValue = "") String cName,
                           @RequestParam(value = "cSsn", defaultValue = "") String cSsn) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        //获取客户经理信息，可多条件查询
        List<Cinfo> cinfos = cinfoService.list(cCmId, cName, cSsn);
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(cinfos, 5);
        if (cinfos != null) {//查询成功
            return Result.success().add("pageInfo", pageInfo);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/checkIdCardIsOnly")
    public Result checkIdCardIsOnly(@RequestParam("idCard") String idCard) {
        List<Cinfo> cinfoByCmSsn = cinfoService.getCinfoByCSsn(idCard);
        if (cinfoByCmSsn.size() > 0) {
            return Result.fail();
        }
        return Result.success();
    }

    @ResponseBody
    @PostMapping("/addCinfo")
    public Result addCminfo(@RequestBody Cinfo cinfo, HttpServletRequest request) {
        Object cmId = request.getSession().getAttribute("cmId");
        Object cmName = request.getSession().getAttribute("cmName");
        cinfo.setcCmId((Integer) cmId);
        cinfo.setcRemarks((String) cmName);
        int num = cinfoService.add(cinfo);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getCinfoById(@PathVariable("id") Integer id, HttpServletRequest request) {
        Cinfo cinfo = cinfoService.getCinfoById(id);
        String role = (String) request.getSession().getAttribute("role");
        if (!"0".equals(role)) {
            Integer cmId = (Integer) request.getSession().getAttribute("cmId");
            if (!cmId.equals(cinfo.getcCmId())) {
                return Result.fail().setMsg("无法操作其他用户的客户信息！");
            }
        }
        if (cinfo != null) {
            return Result.success().add("cinfo", cinfo);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCinfo/{id}")
    public Result delCinfoById(@PathVariable("id") Integer id, HttpServletRequest request) {
        Cinfo cinfo = cinfoService.getCinfoById(id);
        String role = (String) request.getSession().getAttribute("role");
        if (!"0".equals(role)) {
            Integer cmId = (Integer) request.getSession().getAttribute("cmId");
            if (!cmId.equals(cinfo.getcCmId())) {
                return Result.fail().setMsg("无法操作其他用户的客户信息！");
            }
        }
        int num = cinfoService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/updateCinfo")
    public Result updateCinfo(@RequestBody Cinfo cinfo) {
        int num = cinfoService.update(cinfo);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCinfos/{ids}")
    public Result delCinfos(@PathVariable("ids") Integer[] ids, HttpServletRequest request) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = cinfoService.delCinfos(delIds);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }
}
