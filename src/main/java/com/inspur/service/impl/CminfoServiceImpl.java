package com.inspur.service.impl;

import com.inspur.bean.Cminfo;
import com.inspur.bean.CminfoExample;
import com.inspur.dao.CminfoMapper;
import com.inspur.service.CminfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CminfoServiceImpl implements CminfoService {
    @Autowired
    CminfoMapper cminfoMapper;

    @Override
    public List<Cminfo> list(String cmUnit, String cmId, String cmName, String cmStatus) {
        CminfoExample cminfoExample = new CminfoExample();
        CminfoExample.Criteria criteria = cminfoExample.createCriteria();
        if ("".equals(cmUnit) && "".equals(cmId) && "".equals(cmName) && "".equals(cmStatus)) {
            return cminfoMapper.selectByExample(null);
        }
        if (!"".equals(cmUnit)) {
            cmUnit = "%" + cmUnit + "%";
            criteria.andCmUnitLike(cmUnit);
        }
        if (!"".equals(cmId)) {
            int cmid = Integer.parseInt(cmId);
            criteria.andCmIdEqualTo(cmid);
        }
        if (!"".equals(cmName)) {
            cmName = "%" + cmName + "%";
            criteria.andCmNameLike(cmName);
        }
        if (!"".equals(cmStatus)) {
            criteria.andCmStatusEqualTo(cmStatus);
        }
        return cminfoMapper.selectByExample(cminfoExample);
    }

    @Override
    public Integer add(Cminfo cminfo) {
        return cminfoMapper.insert(cminfo);
    }

    @Override
    public Integer deleteById(Integer id) {
        return cminfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Cminfo cminfo) {
        return cminfoMapper.updateByPrimaryKey(cminfo);
    }

    @Override
    public Integer delCminfos(List<Integer> ids) {
        CminfoExample cminfoExample = new CminfoExample();
        CminfoExample.Criteria criteria = cminfoExample.createCriteria();
        criteria.andCmIdIn(ids);
        return cminfoMapper.deleteByExample(cminfoExample);
    }

    @Override
    public Cminfo getCminfoById(Integer id) {
        return cminfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Cminfo> reportList(String cmUnit, String cmStatus, String cmSex, String cmEducation, String cmProfessionalTitles, String cmLevel) {
        CminfoExample CminfoExample = new CminfoExample();
        CminfoExample.Criteria criteria = CminfoExample.createCriteria();
        if ("".equals(cmUnit) && "".equals(cmStatus) && "".equals(cmSex) && "".equals(cmEducation) && "".equals(cmProfessionalTitles) && "".equals(cmLevel)) {
            return cminfoMapper.selectByExample(null);
        }
        if (!"".equals(cmUnit)) {
            criteria.andCmUnitEqualTo(cmUnit);
        }
        if (!"".equals(cmStatus)) {
            criteria.andCmStatusEqualTo(cmStatus);
        }
        if (!"".equals(cmSex)) {
            criteria.andCmSexEqualTo(cmSex);
        }
        if (!"".equals(cmEducation)) {
            criteria.andCmEducationEqualTo(cmEducation);
        }
        if (!"".equals(cmProfessionalTitles)) {
            criteria.andCmProfessionalTitlesEqualTo(cmProfessionalTitles);
        }
        if (!"".equals(cmLevel)) {
            criteria.andCmLevelEqualTo(cmLevel);
        }
        return cminfoMapper.selectByExample(CminfoExample);
    }

    @Override
    public List<Cminfo> getIsNotMember(List<String> names) {
        CminfoExample cminfoExample = new CminfoExample();
        CminfoExample.Criteria criteria = cminfoExample.createCriteria();
        criteria.andCmNameNotIn(names);
        return cminfoMapper.selectByExample(cminfoExample);
    }

    @Override
    public List<Cminfo> getCminfoByCmSsn(String cmSsn) {
        CminfoExample cminfoExample = new CminfoExample();
        CminfoExample.Criteria criteria = cminfoExample.createCriteria();
        criteria.andCmSsnEqualTo(cmSsn);
        return cminfoMapper.selectByExample(cminfoExample);
    }
}
