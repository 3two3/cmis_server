package com.inspur.service;

import com.inspur.bean.Certificate;
import com.inspur.bean.Cmresults;

import java.util.List;

public interface CertificateService {
    List<Certificate> list(String cmId, String rewardType);

    Integer add(Certificate certificate);

    Certificate getCertificateById(Integer id);

    Integer deleteById(Integer id);

    Integer update(Certificate certificate);

    Integer delCertificates(List<Integer> delIds);

}
