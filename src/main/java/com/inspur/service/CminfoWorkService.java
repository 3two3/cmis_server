package com.inspur.service;

import com.inspur.bean.CminfoWork;

import java.util.List;

public interface CminfoWorkService {
    List<CminfoWork> list(String cmId, String cmDate);

    Integer add(CminfoWork cminfoWork);

    CminfoWork getCminfoWorkById(Integer id);

    Integer deleteById(Integer id);

    Integer update(CminfoWork cminfoWork);

    Integer delCminfoWorks(List<Integer> delIds);
}
