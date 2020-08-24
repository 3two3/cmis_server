package com.inspur.service.impl;

import com.inspur.bean.CMember;
import com.inspur.bean.CMemberExample;
import com.inspur.dao.CMemberMapper;
import com.inspur.service.CMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CMemberServiceImpl implements CMemberService {
    @Autowired
    CMemberMapper cMemberMapper;

    @Override
    public CMember getMember(CMember cMember) {
        CMemberExample cMemberExample = new CMemberExample();
        CMemberExample.Criteria criteria = cMemberExample.createCriteria();
        if (cMember.getMemName() != null && cMember.getMemPass() != null) {
            criteria.andMemNameEqualTo(cMember.getMemName());
            criteria.andMemPassEqualTo(cMember.getMemPass());
            List<CMember> cMembers = cMemberMapper.selectByExample(cMemberExample);
            if (cMembers.size() != 0) {
                return cMembers.get(0);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public CMember findByMemberName(String MemberName) {
        CMemberExample cMemberExample = new CMemberExample();
        CMemberExample.Criteria criteria = cMemberExample.createCriteria();
        criteria.andMemNameEqualTo(MemberName);
        List<CMember> cMembers = cMemberMapper.selectByExample(cMemberExample);
        if (cMembers.size() > 0) {
            return cMembers.get(0);
        }
        return null;
    }

    @Override
    public List<CMember> list(String memberId, String memberName) {
        CMemberExample cMemberExample = new CMemberExample();
        CMemberExample.Criteria criteria = cMemberExample.createCriteria();
        if ("".equals(memberId) && "".equals(memberName)) {
            return cMemberMapper.selectByExample(null);
        }
        if (!"".equals(memberId)) {
            int member_Id = Integer.parseInt(memberId);
            criteria.andMemIdEqualTo(member_Id);
        }
        if (!"".equals(memberName)) {
            memberName = "%" + memberName + "%";
            criteria.andMemNameLike(memberName);
        }
        return cMemberMapper.selectByExample(cMemberExample);
    }

    @Override
    public Integer add(CMember cMember) {
        return cMemberMapper.insert(cMember);
    }

    @Override
    public CMember getMemberById(Integer id) {
        return cMemberMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer update(CMember cMember) {
        return cMemberMapper.updateByPrimaryKey(cMember);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cMemberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer delCMembers(List<Integer> delIds) {
        CMemberExample cMemberExample = new CMemberExample();
        CMemberExample.Criteria criteria = cMemberExample.createCriteria();
        criteria.andMemIdIn(delIds);
        return cMemberMapper.deleteByExample(cMemberExample);
    }

    @Override
    public Integer selectCmIdByName(CMember cMember) {
        return cMemberMapper.selectCmIdByName(cMember.getMemName());
    }
}
