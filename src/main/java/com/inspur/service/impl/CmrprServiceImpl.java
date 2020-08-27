package com.inspur.service.impl;

import com.inspur.bean.Cmrpr;
import com.inspur.bean.CmrprExample;
import com.inspur.dao.CmrprMapper;
import com.inspur.service.CmrprService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmrprServiceImpl implements CmrprService {
    @Autowired
    CmrprMapper cmrprMapper;

    @Override
    public List<Cmrpr> list(String cmId, String cmTpye) {
        CmrprExample cmrprExample = new CmrprExample();
        CmrprExample.Criteria criteria = cmrprExample.createCriteria();
        if ("".equals(cmId) && "".equals(cmTpye)) {
            return cmrprMapper.selectByExample(null);
        }
        if (!"".equals(cmId)) {
            int i = Integer.parseInt(cmId);
            criteria.andCmIdEqualTo(i);
        }
        if (!"".equals(cmTpye)) {
            criteria.andCmTpyeEqualTo(cmTpye);
        }
        return cmrprMapper.selectByExample(cmrprExample);
    }

    @Override
    public Integer add(Cmrpr cmrpr) {
        return cmrprMapper.insert(cmrpr);
    }

    @Override
    public Cmrpr getCmrprById(Integer id) {
        return cmrprMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cmrprMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Cmrpr cmrpr) {
        return cmrprMapper.updateByPrimaryKey(cmrpr);
    }

    @Override
    public Integer delCmrprs(List<Integer> delIds) {
        CmrprExample cmrprExample = new CmrprExample();
        CmrprExample.Criteria criteria = cmrprExample.createCriteria();
        criteria.andCmKeyIn(delIds);
        return cmrprMapper.deleteByExample(cmrprExample);
    }
}
