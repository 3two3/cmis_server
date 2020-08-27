package com.inspur.service;

import com.inspur.bean.Certificate;
import com.inspur.bean.Cmass;

import java.util.List;

public interface CmassService {
    List<Cmass> list(String cmId, String cmAsstime);

    Integer add(Cmass cmass);

    Cmass getCmassById(Integer id);

    Integer deleteById(Integer id);

    Integer update(Cmass cmass);

    Integer delCmasss(List<Integer> delIds);
}
