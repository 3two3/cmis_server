package com.inspur.service;

import com.inspur.bean.Cmresults;

import java.util.List;

public interface CmresultsService {
    List<Cmresults> list(String cmId, String cmYear);

    Integer add(Cmresults cmresults);

    Cmresults getCmresultById(Integer id);

    Integer deleteById(Integer id);

    Integer update(Cmresults cmresults);

    Integer delCmresults(List<Integer> delIds);

    List<Cmresults> getCmresultByYear(String year,String cmId);
}
