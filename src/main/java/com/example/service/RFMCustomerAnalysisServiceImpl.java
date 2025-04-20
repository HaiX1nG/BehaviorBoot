package com.example.service;

import com.example.bean.RFMCustomerAnalysis;
import com.example.dao.RFMCustomerAnalysisDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RFMCustomerAnalysisServiceImpl implements RFMCustomerAnalysisServiceI{
    @Resource
    private RFMCustomerAnalysisDao rfmCustomerAnalysisDao;
    @Override
    public List<RFMCustomerAnalysis> getRFMCustomerAnalysis() {
        List<RFMCustomerAnalysis> rfmCustomerAnalyses = rfmCustomerAnalysisDao.getRFMCustomerAnalysis();
        if (rfmCustomerAnalyses == null || rfmCustomerAnalyses.size() == 0) {
            throw new RuntimeException("查询为空");
        }
        return rfmCustomerAnalysisDao.getRFMCustomerAnalysis();
    }
}
