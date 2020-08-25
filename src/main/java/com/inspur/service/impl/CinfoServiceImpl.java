package com.inspur.service.impl;

import com.inspur.bean.Cinfo;
import com.inspur.bean.CinfoExample;
import com.inspur.dao.CinfoMapper;
import com.inspur.service.CinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinfoServiceImpl implements CinfoService {
    @Autowired
    CinfoMapper cinfoMapper;

    @Override
    public List<Cinfo> list(String cCmId, String cName, String cSsn) {
        CinfoExample cinfoExample = new CinfoExample();
        CinfoExample.Criteria criteria = cinfoExample.createCriteria();
        if ("".equals(cCmId) && "".equals(cName) && "".equals(cSsn)) {
            return cinfoMapper.selectByExample(null);
        }
        if (!"".equals(cCmId)) {
            int i = Integer.parseInt(cCmId);
            criteria.andCCmIdEqualTo(i);
        }
        if (!"".equals(cName)) {
            cName = "%" + cName + "%";
            criteria.andCNameLike(cName);
        }
        if (!"".equals(cSsn)) {
            cSsn = "%" + cSsn + "%";
            criteria.andCSsnLike(cSsn);
        }
        return cinfoMapper.selectByExample(cinfoExample);
    }

    @Override
    public Integer add(Cinfo cinfo) {
        return cinfoMapper.insert(cinfo);
    }

    @Override
    public Cinfo getCinfoById(Integer id) {
        return cinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Cinfo cinfo) {
        return cinfoMapper.updateByPrimaryKey(cinfo);
    }

    @Override
    public Integer delCinfos(List<Integer> delIds) {
        CinfoExample cinfoExample = new CinfoExample();
        CinfoExample.Criteria criteria = cinfoExample.createCriteria();
        criteria.andCKeyIn(delIds);
        return cinfoMapper.deleteByExample(cinfoExample);
    }
}
