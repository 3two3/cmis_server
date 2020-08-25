package com.inspur.service.impl;

import com.inspur.bean.DictType;
import com.inspur.bean.DictTypeExample;
import com.inspur.dao.CDictTypeMapper;
import com.inspur.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictTypeServiceImpl implements DictTypeService {
    @Autowired
    CDictTypeMapper dictTypeMapper;

    @Override
    public List<DictType> list() {
        return dictTypeMapper.selectByExample(null);
    }

    @Override
    public DictType getDictTypeById(Integer id) {
        return dictTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer add(DictType dictType) {
        return dictTypeMapper.insert(dictType);
    }

    @Override
    public Integer deleteById(Integer id) {
        return dictTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<DictType> getDictTypeByName(String name) {
        DictTypeExample dictTypeExample = new DictTypeExample();
        DictTypeExample.Criteria criteria = dictTypeExample.createCriteria();
        criteria.andDictTypeNameEqualTo(name);
        return dictTypeMapper.selectByExample(dictTypeExample);
    }

}
