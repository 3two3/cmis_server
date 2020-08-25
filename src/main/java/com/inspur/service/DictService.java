package com.inspur.service;

import com.inspur.bean.Dict;
import com.inspur.bean.DictType;

import java.util.List;

public interface DictService {

    List<Dict> list(String query, String selectType);

    Dict getDictById(Integer id);

    Integer add(Dict dict);

    Integer update(Dict dict);

    Integer deleteById(Integer id);

    Integer delDicts(List<Integer> ids);

    List<Dict> getDictByType(Integer id);

    List<Dict> queryByTypeName(String typeName);

    List<Dict> queryByDictName(String dictName);
}
