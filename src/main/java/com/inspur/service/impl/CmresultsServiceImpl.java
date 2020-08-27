package com.inspur.service.impl;

import com.inspur.bean.Cmresults;
import com.inspur.bean.CmresultsExample;
import com.inspur.dao.CmresultsMapper;
import com.inspur.service.CmresultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmresultsServiceImpl implements CmresultsService {
    @Autowired
    CmresultsMapper cmresultsMapper;

    @Override
    public List<Cmresults> list(String cmId, String cmYear) {
        CmresultsExample cmresultsExample = new CmresultsExample();
        CmresultsExample.Criteria criteria = cmresultsExample.createCriteria();
        if ("".equals(cmId) && "".equals(cmYear)) {
            return cmresultsMapper.selectByExample(null);
        }
        if (!"".equals(cmId)) {
            int i = Integer.parseInt(cmId);
            criteria.andCmIdEqualTo(i);
        }
        if (!"".equals(cmYear)) {
            cmYear = "%" + cmYear + "%";
            criteria.andCmYearLike(cmYear);
        }
        return cmresultsMapper.selectByExample(cmresultsExample);
    }

    @Override
    public Integer add(Cmresults cmresults) {
        return cmresultsMapper.insert(cmresults);
    }

    @Override
    public Cmresults getCmresultById(Integer id) {
        return cmresultsMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cmresultsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Cmresults cmresults) {
        return cmresultsMapper.updateByPrimaryKey(cmresults);
    }

    @Override
    public Integer delCmresults(List<Integer> delIds) {
        CmresultsExample cmresultsExample = new CmresultsExample();
        CmresultsExample.Criteria criteria = cmresultsExample.createCriteria();
        criteria.andCmKeyIn(delIds);
        return cmresultsMapper.deleteByExample(cmresultsExample);
    }

    @Override
    public List<Cmresults> getCmresultByYear(String year, String cmId) {
        CmresultsExample cmresultsExample = new CmresultsExample();
        CmresultsExample.Criteria criteria = cmresultsExample.createCriteria();
        criteria.andCmYearEqualTo(year);
        int i = Integer.parseInt(cmId);
        criteria.andCmIdEqualTo(i);
        return cmresultsMapper.selectByExample(cmresultsExample);
    }
}
