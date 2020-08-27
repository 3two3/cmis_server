package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.Certificate;
import com.inspur.bean.Cminfo;
import com.inspur.bean.Dict;
import com.inspur.service.CertificateService;
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
@RequestMapping("/certificate")
public class CertificateController {
    @Autowired
    DictService dictService;
    @Autowired
    CminfoService cminfoService;
    @Autowired
    CertificateService certificateService;

    @ResponseBody
    @GetMapping("/list")
    public Result getCertificates(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                  @RequestParam(value = "cmId", defaultValue = "") String cmId,
                                  @RequestParam(value = "cmCertificateType", defaultValue = "") String cmCertificateType) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        //获取客户经理信息，可多条件查询
        List<Certificate> certificates = certificateService.list(cmId, cmCertificateType);
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(certificates, 5);
        if (certificates != null) {//查询成功
            List<Dict> certificateTypes = dictService.queryByTypeName("证书类型");
            List<Cminfo> cminfos = cminfoService.list("", "", "", "");
            return Result.success().add("pageInfo", pageInfo).add("cminfos", cminfos).add("certificateTypes", certificateTypes);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/addCertificate")
    public Result addCertificate(@RequestBody Certificate certificate, HttpServletRequest request) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
        String now = dateFormat.format(date);
        certificate.setCmModificationDate(now);
        Object cmName = request.getSession().getAttribute("cmName");
        certificate.setCmModificationPerson((String) cmName);
        int num = certificateService.add(certificate);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getCertificateById(@PathVariable("id") Integer id) {
        Certificate certificate = certificateService.getCertificateById(id);
        if (certificate != null) {
            return Result.success().add("certificate", certificate);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCertificate/{id}")
    public Result delCertificateById(@PathVariable("id") Integer id) {
        int num = certificateService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/updateCertificate")
    public Result updateCertificate(@RequestBody Certificate certificate) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
        String now = dateFormat.format(date);
        certificate.setCmModificationDate(now);
        int num = certificateService.update(certificate);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCertificates/{ids}")
    public Result delCertificates(@PathVariable("ids") Integer[] ids) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = certificateService.delCertificates(delIds);
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
        String templatePath = "D:/WebStorm/workspace/cmis_ui/public/static/certificate/" + cmId;
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
