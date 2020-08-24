package com.inspur.service;

import com.inspur.bean.Cminfo;
import com.inspur.bean.Cmregular;

import java.util.List;

public interface CmRegularService {

    List<Cmregular> list(String cmId, String cmRegularDate, String cmRegularTheme);

    Integer add(Cmregular cmregular);

    Integer deleteById(Integer id);

    Integer update(Cmregular cmregular);

    Integer delCmregulars(List<Integer> ids);

    Cmregular getCmregularById(Integer id);
}
