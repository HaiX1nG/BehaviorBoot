package com.example.dao;

import com.example.bean.RFMCustomerAnalysis;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RFMCustomerAnalysisDao {
    List<RFMCustomerAnalysis> getRFMCustomerAnalysis();
}
