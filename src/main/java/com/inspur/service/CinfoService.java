package com.inspur.service;

import com.inspur.bean.Cinfo;
import com.inspur.bean.Cminfo;

import java.util.List;

public interface CinfoService {
    List<Cinfo> list(String cCmId, String cName, String cSsn);

    Integer add(Cinfo cinfo);

    Cinfo getCinfoById(Integer id);

    Integer deleteById(Integer id);

    Integer update(Cinfo cinfo);

    Integer delCinfos(List<Integer> delIds);

    List<Cinfo> getCinfoByCSsn(String cSsn);
}
