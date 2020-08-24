package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.Cminfo;
import com.inspur.bean.Cmregular;
import com.inspur.service.CmRegularService;
import com.inspur.service.CminfoService;
import com.inspur.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("regular")
public class CmRegularController {

    @Autowired
    CmRegularService cmRegularService;

    @Autowired
    CminfoService cminfoService;

    @ResponseBody
    @GetMapping("/list")
    public Result getCmRegulars(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                @RequestParam(value = "cmId", defaultValue = "") String cmId,
                                @RequestParam(value = "cmRegularDate", defaultValue = "") String cmRegularDate,
                                @RequestParam(value = "cmRegularTheme", defaultValue = "") String cmRegularTheme) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        //获取客户经理信息，可多条件查询
        List<Cmregular> cmregulars = cmRegularService.list(cmId, cmRegularDate, cmRegularTheme);
        List<Cminfo> cminfos = cminfoService.list("", "", "", "");
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(cmregulars, 5);
        if (cmregulars != null) {//查询成功
            return Result.success().add("pageInfo", pageInfo).add("cminfos", cminfos);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/addCmregular")
    public Result addCmregular(@RequestBody Cmregular cmregular, HttpServletRequest request) {
        Object cmId = request.getSession().getAttribute("cmId");
        cmregular.setCmId((Integer) cmId);
        int num = cmRegularService.add(cmregular);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getCmregularById(@PathVariable("id") Integer id) {
        Cmregular cmregular = cmRegularService.getCmregularById(id);
        if (cmregular != null) {
            return Result.success().add("cmregular", cmregular);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCmregular/{id}")
    public Result delCmregularById(@PathVariable("id") Integer id) {
        int num = cmRegularService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/updateCmregular")
    public Result updateCmregular(@RequestBody Cmregular cmregular) {
        int num = cmRegularService.update(cmregular);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCmregulars/{ids}")
    public Result delCmregulars(@PathVariable("ids") Integer[] ids) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = cmRegularService.delCmregulars(delIds);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping(value = "/upload")
    public Result uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            return Result.success().setMsg("上传文件为空");
        }
        String fileName = file.getOriginalFilename();
        // 文件上传路径
        Object cmId = request.getSession().getAttribute("cmId");
        String templatePath = "D:/WebStorm/workspace/cmis_ui/public/static/cmRegular/" + cmId;
        System.out.println("文件路径:" + templatePath);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //获取文件名
        String prefixName = fileName.substring(0, fileName.lastIndexOf("."));
        // 解决中文问题,liunx 下中文路径,图片显示问题
        //fileName = UUID.randomUUID() + suffixName;
        File dest0 = new File(templatePath);
        File dest = new File(dest0, "" + File.separator + fileName);
        //文件上传-覆盖
        try {
            // 检测是否存在目录
            if (!dest0.getParentFile().exists()) {
                dest0.getParentFile().mkdirs();
                //检测文件是否存在
            }
            if (!dest.exists()) {
                dest.mkdirs();
            }
            file.transferTo(dest);
            return Result.success().add("filename", fileName + "");
        } catch (Exception e) {
            System.out.println("文件上传错误");
            return Result.fail().setMsg("文件上传错误");
        }
    }
}
