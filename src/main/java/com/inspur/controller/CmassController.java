package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.Cmass;
import com.inspur.bean.Cminfo;
import com.inspur.bean.Dict;
import com.inspur.service.CmassService;
import com.inspur.service.CminfoService;
import com.inspur.service.DictService;
import com.inspur.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/cmass")
public class CmassController {
    @Autowired
    DictService dictService;
    @Autowired
    CminfoService cminfoService;
    @Autowired
    CmassService cmassService;

    @ResponseBody
    @GetMapping("/list")
    public Result getCmasss(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                  @RequestParam(value = "cmId", defaultValue = "") String cmId,
                                  @RequestParam(value = "cmAsstime", defaultValue = "") String cmAsstime) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        //获取客户经理信息，可多条件查询
        List<Cmass> cmasss = cmassService.list(cmId, cmAsstime);
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(cmasss, 5);
        if (cmasss != null) {//查询成功
            List<Dict> cmAssresults = dictService.queryByTypeName("考核结果");
            List<Cminfo> cminfos = cminfoService.list("", "", "", "");
            return Result.success().add("pageInfo", pageInfo).add("cminfos", cminfos).add("cmAssresults", cmAssresults);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/addCmass")
    public Result addCmass(@RequestBody Cmass cmass, HttpServletRequest request) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
        String now = dateFormat.format(date);
        cmass.setCmModificationDate(now);
        Object cmName = request.getSession().getAttribute("cmName");
        cmass.setCmModificationPerson((String) cmName);
        int num = cmassService.add(cmass);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getCmassById(@PathVariable("id") Integer id) {
        Cmass cmass = cmassService.getCmassById(id);
        if (cmass != null) {
            return Result.success().add("cmass", cmass);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCmass/{id}")
    public Result delCmassById(@PathVariable("id") Integer id) {
        int num = cmassService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/updateCmass")
    public Result updateCmass(@RequestBody Cmass cmass) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
        String now = dateFormat.format(date);
        cmass.setCmModificationDate(now);
        int num = cmassService.update(cmass);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCmasss/{ids}")
    public Result delCmasss(@PathVariable("ids") Integer[] ids) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = cmassService.delCmasss(delIds);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping(value = "/upload")
    public Result uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("cmId") String cmId) {
        System.out.println("接收到的文件数据为：" + file);
        if (file.isEmpty()) {
            return Result.success().setMsg("上传文件为空");
        }
        String fileName = file.getOriginalFilename();
        // 文件上传路径
        String templatePath = "D:/WebStorm/workspace/cmis_ui/public/static/cmass/" + cmId;
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
