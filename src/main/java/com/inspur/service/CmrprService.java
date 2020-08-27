package com.inspur.service;

import com.inspur.bean.Cmrpr;

import java.util.List;

public interface CmrprService {
    List<Cmrpr> list(String cmId, String cmTpye);

    Integer add(Cmrpr cmrpr);

    Cmrpr getCmrprById(Integer id);

    Integer deleteById(Integer id);

    Integer update(Cmrpr cmrpr);

    Integer delCmrprs(List<Integer> delIds);
}
