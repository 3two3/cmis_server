package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.Cinfo;
import com.inspur.bean.CmarketingRecord;
import com.inspur.service.CinfoService;
import com.inspur.service.CmarketingRecordService;
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
@RequestMapping("markRecord")
public class CmarketingRecordController {
    @Autowired
    CmarketingRecordService cmarketingRecordService;
    @Autowired
    CinfoService cinfoService;

    @ResponseBody
    @GetMapping("/list")
    public Result getCmarketingRecords(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "cCmId", defaultValue = "") String cCmId,
                                       @RequestParam(value = "cName", defaultValue = "") String cName,
                                       HttpServletRequest request) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        List<CmarketingRecord> cmarketingRecords = cmarketingRecordService.list(cCmId, cName);
        Object cmId = request.getSession().getAttribute("cmId");
        List<Cinfo> cinfos = cinfoService.list(cmId + "", "", "");
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(cmarketingRecords, 5);
        if (cmarketingRecords != null) {//查询成功
            return Result.success().add("pageInfo", pageInfo).add("cinfos", cinfos);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/addMarkRecord")
    public Result addMarkRecord(@RequestBody CmarketingRecord cmarketingRecord, HttpServletRequest request) {
        Object cmId = request.getSession().getAttribute("cmId");
        cmarketingRecord.setcCmId((Integer) cmId);
        int num = cmarketingRecordService.add(cmarketingRecord);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getMarkRecordById(@PathVariable("id") Integer id) {
        CmarketingRecord cmarketingRecord = cmarketingRecordService.getMarkRecordById(id);
        if (cmarketingRecord != null) {
            return Result.success().add("cmarketingRecord", cmarketingRecord);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/updateMarkRecord")
    public Result updateMarkRecord(@RequestBody CmarketingRecord cmarketingRecord) {
        int num = cmarketingRecordService.update(cmarketingRecord);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delMarkRecord/{id}")
    public Result delMarkRecord(@PathVariable("id") Integer id) {
        int num = cmarketingRecordService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delMarkRecords/{ids}")
    public Result delMarkRecords(@PathVariable("ids") Integer[] ids) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = cmarketingRecordService.delMarkRecords(delIds);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping(value = "/upload")
    public Result uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("cid") String cid, HttpServletRequest request) {
        System.out.println("接收到的文件数据为：" + file);
        if (file.isEmpty()) {
            return Result.success().setMsg("上传文件为空");
        }
        String fileName = file.getOriginalFilename();
        // 文件上传路径
        Object cmId = request.getSession().getAttribute("cmId");
        String templatePath = "D:/WebStorm/workspace/cmis_ui/public/static/upload/" + cmId + "/" + cid;
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

