package com.inspur.service.impl;

import com.inspur.bean.CLearn;
import com.inspur.bean.CLearnExample;
import com.inspur.dao.CLearnMapper;
import com.inspur.service.CLearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CLearnServiceImpl implements CLearnService {
    @Autowired
    CLearnMapper cLearnMapper;

    @Override
    public Integer add(CLearn cLearn) {
        return cLearnMapper.insert(cLearn);
    }

    @Override
    public List<CLearn> list(String lName, String lType) {
        CLearnExample cLearnExample = new CLearnExample();
        CLearnExample.Criteria criteria = cLearnExample.createCriteria();
        if ("".equals(lName) && "".equals(lType)) {
            return cLearnMapper.selectByExample(null);
        }
        if (!"".equals(lName)) {
            lName = "%" + lName + "%";
            criteria.andLNameLike(lName);
        }
        if (!"".equals(lType)) {
            criteria.andLTypeEqualTo(lType);
        }
        return cLearnMapper.selectByExample(cLearnExample);
    }

    @Override
    public CLearn getCLearnById(Integer id) {
        return cLearnMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cLearnMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(CLearn cLearn) {
        return cLearnMapper.updateByPrimaryKey(cLearn);
    }

    @Override
    public Integer delCLearns(List<Integer> delIds) {
        CLearnExample cLearnExample = new CLearnExample();
        CLearnExample.Criteria criteria = cLearnExample.createCriteria();
        criteria.andLKeyIn(delIds);
        return cLearnMapper.deleteByExample(cLearnExample);
    }
}
