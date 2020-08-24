package com.inspur.service.impl;

import com.inspur.bean.Cmregular;
import com.inspur.bean.CmregularExample;
import com.inspur.dao.CmregularMapper;
import com.inspur.service.CmRegularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmRegularServiceImpl implements CmRegularService {

    @Autowired
    CmregularMapper cmregularMapper;

    @Override
    public List<Cmregular> list(String cmId, String cmRegularDate, String cmRegularTheme) {
        CmregularExample cmregularExample = new CmregularExample();
        CmregularExample.Criteria criteria = cmregularExample.createCriteria();
        if ("".equals(cmId) && "".equals(cmRegularDate) && "".equals(cmRegularTheme)) {
            return cmregularMapper.selectByExample(null);
        }
        if (!"".equals(cmId)) {
            int cmid = Integer.parseInt(cmId);
            criteria.andCmIdEqualTo(cmid);
        }
        if (!"".equals(cmRegularDate)) {
            criteria.andCmRegularDateEqualTo(cmRegularDate);
        }
        if (!"".equals(cmRegularTheme)) {
            cmRegularTheme = "%" + cmRegularTheme + "%";
            criteria.andCmRegularThemeLike(cmRegularTheme);
        }
        return cmregularMapper.selectByExample(cmregularExample);
    }

    @Override
    public Integer add(Cmregular cmregular) {
        return cmregularMapper.insert(cmregular);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cmregularMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Cmregular cmregular) {
        return cmregularMapper.updateByPrimaryKey(cmregular);
    }

    @Override
    public Integer delCmregulars(List<Integer> ids) {
        CmregularExample cmregularExample = new CmregularExample();
        CmregularExample.Criteria criteria = cmregularExample.createCriteria();
        criteria.andCmKeyIn(ids);
        return cmregularMapper.deleteByExample(cmregularExample);
    }

    @Override
    public Cmregular getCmregularById(Integer id) {
        return cmregularMapper.selectByPrimaryKey(id);
    }
}
