package com.inspur.service;

import com.inspur.bean.CMember;

import java.util.List;

public interface CMemberService {
    CMember getMember(CMember cMember);

    CMember findByMemberName(String MemberName);

    List<CMember> list(String memberId, String memberName);

    Integer add(CMember cMember);

    CMember getMemberById(Integer id);

    Integer update(CMember cMember);

    Integer deleteById(Integer id);

    Integer delCMembers(List<Integer> delIds);

    Integer selectCmIdByName(CMember cMember);
}
