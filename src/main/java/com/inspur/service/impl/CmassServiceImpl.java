package com.inspur.service.impl;

import com.inspur.bean.Cmass;
import com.inspur.bean.CmassExample;
import com.inspur.dao.CmassMapper;
import com.inspur.service.CmassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmassServiceImpl implements CmassService {
    @Autowired
    CmassMapper cmassMapper;

    @Override
    public List<Cmass> list(String cmId, String cmAsstime) {
        CmassExample cmassExample = new CmassExample();
        CmassExample.Criteria criteria = cmassExample.createCriteria();
        if ("".equals(cmId) && "".equals(cmAsstime)) {
            return cmassMapper.selectByExample(null);
        }
        if (!"".equals(cmId)) {
            int i = Integer.parseInt(cmId);
            criteria.andCmIdEqualTo(i);
        }
        if (!"".equals(cmAsstime)) {
            criteria.andCmAsstimeEqualTo(cmAsstime);
        }
        return cmassMapper.selectByExample(cmassExample);
    }

    @Override
    public Integer add(Cmass cmass) {
        return cmassMapper.insert(cmass);
    }

    @Override
    public Cmass getCmassById(Integer id) {
        return cmassMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cmassMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Cmass cmass) {
        return cmassMapper.updateByPrimaryKey(cmass);
    }

    @Override
    public Integer delCmasss(List<Integer> delIds) {
        CmassExample cmassExample = new CmassExample();
        CmassExample.Criteria criteria = cmassExample.createCriteria();
        criteria.andCmKeyIn(delIds);
        return cmassMapper.deleteByExample(cmassExample);
    }
}
