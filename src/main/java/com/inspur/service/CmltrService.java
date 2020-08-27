package com.inspur.service;

import com.inspur.bean.Cmltr;

import java.util.List;

public interface CmltrService {

    List<Cmltr> list(String cmId, String cmTdate,String cmSub);

    Integer add(Cmltr cmltr);

    Cmltr getCmltrById(Integer id);

    Integer deleteById(Integer id);

    Integer update(Cmltr cmltr);

    Integer delCmltrs(List<Integer> delIds);
}
