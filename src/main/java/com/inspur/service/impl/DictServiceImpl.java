package com.inspur.service.impl;

import com.inspur.bean.Dict;
import com.inspur.bean.DictExample;
import com.inspur.dao.CDictMapper;
import com.inspur.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl implements DictService {
    @Autowired
    CDictMapper dictMapper;

    @Override
    public List<Dict> list(String query, String selectType) {
        DictExample dictExample = new DictExample();
        DictExample.Criteria criteria = dictExample.createCriteria();
        if ("".equals(query) && "".equals(selectType)) {
            return dictMapper.selectByExample(null);
        }
        if (!"".equals(query)) {
            query = "%" + query + "%";
            criteria.andDictNameLike(query);
        }
        if (!"".equals(selectType)) {
            criteria.andDictTypeEqualTo(selectType);
        }
        return dictMapper.selectByExample(dictExample);
    }

    @Override
    public Dict getDictById(Integer id) {
        return dictMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer add(Dict dict) {
        return dictMapper.insert(dict);
    }

    @Override
    public Integer update(Dict dict) {
        return dictMapper.updateByPrimaryKey(dict);
    }

    @Override
    public Integer deleteById(Integer id) {
        return dictMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer delDicts(List<Integer> ids) {
        DictExample dictExample = new DictExample();
        DictExample.Criteria criteria = dictExample.createCriteria();
        criteria.andDictIdIn(ids);
        return dictMapper.deleteByExample(dictExample);
    }

    @Override
    public List<Dict> getDictByType(Integer id) {
        DictExample dictExample = new DictExample();
        DictExample.Criteria criteria = dictExample.createCriteria();
        criteria.andDictValueEqualTo(id);
        return dictMapper.selectByExample(dictExample);
    }

    @Override
    public List<Dict> queryByTypeName(String typeName) {
        DictExample dictExample = new DictExample();
        DictExample.Criteria criteria = dictExample.createCriteria();
        criteria.andDictTypeEqualTo(typeName);
        return dictMapper.selectByExample(dictExample);
    }
}
