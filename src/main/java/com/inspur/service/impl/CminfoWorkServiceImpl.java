package com.inspur.service.impl;

import com.inspur.bean.CminfoWork;
import com.inspur.bean.CminfoWorkExample;
import com.inspur.dao.CminfoWorkMapper;
import com.inspur.service.CminfoWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CminfoWorkServiceImpl implements CminfoWorkService {
    @Autowired
    CminfoWorkMapper cminfoWorkMapper;

    @Override
    public List<CminfoWork> list(String cmId, String cmDate) {
        CminfoWorkExample cminfoWorkExample = new CminfoWorkExample();
        CminfoWorkExample.Criteria criteria = cminfoWorkExample.createCriteria();
        if ("".equals(cmId) && "".equals(cmDate)) {
            return cminfoWorkMapper.selectByExample(null);
        }
        if (!"".equals(cmId)) {
            int i = Integer.parseInt(cmId);
            criteria.andCmIdEqualTo(i);
        }
        if (!"".equals(cmDate)) {
            criteria.andCmDateEqualTo(cmDate);
        }
        return cminfoWorkMapper.selectByExample(cminfoWorkExample);
    }

    @Override
    public Integer add(CminfoWork cminfoWork) {
        return cminfoWorkMapper.insert(cminfoWork);
    }

    @Override
    public CminfoWork getCminfoWorkById(Integer id) {
        return cminfoWorkMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cminfoWorkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(CminfoWork cminfoWork) {
        return cminfoWorkMapper.updateByPrimaryKey(cminfoWork);
    }

    @Override
    public Integer delCminfoWorks(List<Integer> delIds) {
        CminfoWorkExample cminfoWorkExample = new CminfoWorkExample();
        CminfoWorkExample.Criteria criteria = cminfoWorkExample.createCriteria();
        criteria.andCmKeyIn(delIds);
        return cminfoWorkMapper.deleteByExample(cminfoWorkExample);
    }
}
