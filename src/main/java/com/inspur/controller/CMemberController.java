package com.inspur.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.bean.CMember;
import com.inspur.bean.Cminfo;
import com.inspur.service.CMemberService;
import com.inspur.service.CminfoService;
import com.inspur.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@CrossOrigin
@Controller
@RequestMapping("/member")
public class CMemberController {
    @Autowired
    CMemberService cMemberService;

    @Autowired
    CminfoService cminfoService;

    @ResponseBody
    @PostMapping("/login")
    public Result login(@RequestBody CMember cMember, HttpServletRequest request) {
        CMember member = cMemberService.getMember(cMember);
        if (member != null) {//登录成功
            //生成Token令牌
            String token = UUID.randomUUID() + "";
            //把token令牌存入存入Session
            request.getSession().setAttribute("token", token);
            request.getSession().setAttribute("role", member.getRoleId() + "");
            Integer cmId = cMemberService.selectCmIdByName(member);
            request.getSession().setAttribute("cmId", cmId);
            request.getSession().setAttribute("cmName", member.getMemName());
            request.getSession().setAttribute("member", member);
            return Result.success().add("token", token).add("member", member);
        } else {//登录失败
            return Result.fail();
        }
    }

    @ResponseBody
    @GetMapping("/logout")
    public Result logout(HttpServletRequest request) {
        HttpSession session = request.getSession();//得到session中所有的属性名
        session.invalidate();
        return Result.success();
    }

    @ResponseBody
    @GetMapping("/list")
    public Result getMembers(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, @RequestParam(value = "memberId", defaultValue = "") String memberId, @RequestParam(value = "memberName", defaultValue = "") String memberName) {
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        List<CMember> cMembers = cMemberService.list(memberId, memberName);
        //使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的所有数据,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(cMembers, 5);
        if (cMembers != null) {//查询成功
            List<String> names = new ArrayList<>();
            for (CMember cMember : cMembers) {
                names.add(cMember.getMemName());
            }
            List<Cminfo> cminfos = cminfoService.getIsNotMember(names);
            return Result.success().add("pageInfo", pageInfo).add("cminfos", cminfos);
        } else {//查询失败
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/addMember")
    public Result addMember(@RequestBody CMember cMember) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
        String now = dateFormat.format(date);
        cMember.setRegisterTime(now);
        int num = cMemberService.add(cMember);
        if (num != 0) {
            return Result.success();
        }
        return Result.fail();
    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Result getCMemberById(@PathVariable("id") Integer id) {
        CMember cMember = cMemberService.getMemberById(id);
        if (cMember != null) {
            return Result.success().add("cMember", cMember);
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @PostMapping("/updateCMember")
    public Result updateCMember(@RequestBody CMember cMember) {
        int num = cMemberService.update(cMember);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCMember/{id}")
    public Result delCMemberById(@PathVariable("id") Integer id) {
        int num = cMemberService.deleteById(id);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @ResponseBody
    @DeleteMapping("/delCMembers/{ids}")
    public Result delCminfos(@PathVariable("ids") Integer[] ids) {
        List<Integer> delIds = new ArrayList<>(ids.length);
        for (Integer i : ids) {
            delIds.add(i);
        }
        int num = cMemberService.delCMembers(delIds);
        if (num != 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }
}