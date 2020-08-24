package com.inspur.service;

import com.inspur.bean.CLearn;

import java.util.List;

public interface CLearnService {
    Integer add(CLearn cLearn);

    List<CLearn> list(String lName, String lType);

    CLearn getCLearnById(Integer id);

    Integer deleteById(Integer id);

    Integer update(CLearn cLearn);

    Integer delCLearns(List<Integer> delIds);

}
