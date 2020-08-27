package com.inspur.service.impl;

import com.inspur.bean.Cmltr;
import com.inspur.bean.CmltrExample;
import com.inspur.dao.CmltrMapper;
import com.inspur.service.CmltrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmltrServiceImpl implements CmltrService {
    @Autowired
    CmltrMapper cmltrMapper;

    @Override
    public List<Cmltr> list(String cmId, String cmTdate, String cmSub) {
        CmltrExample cmltrExample = new CmltrExample();
        CmltrExample.Criteria criteria = cmltrExample.createCriteria();
        if ("".equals(cmId) && "".equals(cmTdate) && "".equals(cmSub)) {
            return cmltrMapper.selectByExample(null);
        }
        if (!"".equals(cmId)) {
            int i = Integer.parseInt(cmId);
            criteria.andCmIdEqualTo(i);
        }
        if (!"".equals(cmTdate)) {
            criteria.andCmTdateEqualTo(cmTdate);
        }
        if (!"".equals(cmSub)) {
            criteria.andCmTunitEqualTo(cmSub);
        }
        return cmltrMapper.selectByExample(cmltrExample);
    }

    @Override
    public Integer add(Cmltr cmltr) {
        return cmltrMapper.insert(cmltr);
    }

    @Override
    public Cmltr getCmltrById(Integer id) {
        return cmltrMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cmltrMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Cmltr cmltr) {
        return cmltrMapper.updateByPrimaryKey(cmltr);
    }

    @Override
    public Integer delCmltrs(List<Integer> delIds) {
        CmltrExample cmltrExample = new CmltrExample();
        CmltrExample.Criteria criteria = cmltrExample.createCriteria();
        criteria.andCmKeyIn(delIds);
        return cmltrMapper.deleteByExample(cmltrExample);
    }
}
