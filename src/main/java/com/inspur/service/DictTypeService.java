package com.inspur.service;

import com.inspur.bean.Dict;
import com.inspur.bean.DictType;

import java.util.List;

public interface DictTypeService {

    List<DictType> list();

    DictType getDictTypeById(Integer id);

    Integer add(DictType dictType);

    Integer deleteById(Integer id);

}
