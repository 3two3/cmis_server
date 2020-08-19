package com.inspur.dao;

import com.inspur.bean.Certificate;
import com.inspur.bean.CertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificateMapper {
    long countByExample(CertificateExample example);

    int deleteByExample(CertificateExample example);

    int deleteByPrimaryKey(Integer cmKey);

    int insert(Certificate record);

    int insertSelective(Certificate record);

    List<Certificate> selectByExample(CertificateExample example);

    Certificate selectByPrimaryKey(Integer cmKey);

    int updateByExampleSelective(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByExample(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByPrimaryKeySelective(Certificate record);

    int updateByPrimaryKey(Certificate record);
}