package com.inspur.service.impl;

import com.inspur.bean.Certificate;
import com.inspur.bean.CertificateExample;
import com.inspur.dao.CertificateMapper;
import com.inspur.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    CertificateMapper certificateMapper;

    @Override
    public List<Certificate> list(String cmId, String cmCertificateType) {
        CertificateExample certificateExample = new CertificateExample();
        CertificateExample.Criteria criteria = certificateExample.createCriteria();
        if ("".equals(cmId) && "".equals(cmCertificateType)) {
            return certificateMapper.selectByExample(null);
        }
        if (!"".equals(cmId)) {
            int i = Integer.parseInt(cmId);
            criteria.andCmIdEqualTo(i);
        }
        if (!"".equals(cmCertificateType)) {
            criteria.andCmCertificateTypeEqualTo(cmCertificateType);
        }
        return certificateMapper.selectByExample(certificateExample);
    }

    @Override
    public Integer add(Certificate certificate) {
        return certificateMapper.insert(certificate);
    }

    @Override
    public Certificate getCertificateById(Integer id) {
        return certificateMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return certificateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Certificate certificate) {

        return certificateMapper.updateByPrimaryKey(certificate);
    }

    @Override
    public Integer delCertificates(List<Integer> delIds) {
        CertificateExample certificateExample = new CertificateExample();
        CertificateExample.Criteria criteria = certificateExample.createCriteria();
        criteria.andCmKeyIn(delIds);
        return certificateMapper.deleteByExample(certificateExample);
    }
}
