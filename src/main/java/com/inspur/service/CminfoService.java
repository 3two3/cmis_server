package com.inspur.service;

import com.inspur.bean.Cminfo;

import java.util.List;

public interface CminfoService {
    List<Cminfo> list(String cmUnit, String cmId, String cmName, String cmStatus);

    Integer add(Cminfo cminfo);

    Integer deleteById(Integer id);

    Integer update(Cminfo cminfo);

    Integer delCminfos(List<Integer> ids);

    Cminfo getCminfoById(Integer id);

    List<Cminfo> reportList(String cmUnit, String cmStatus, String cmSex, String cmEducation, String cmProfessionalTitles, String cmLevel);

    List<Cminfo> getIsNotMember(List<String> names);

    List<Cminfo> getCminfoByCmSsn(String cmSsn);
}
