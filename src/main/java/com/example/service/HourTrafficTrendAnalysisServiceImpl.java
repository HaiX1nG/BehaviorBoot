package com.example.service;

import com.example.bean.HourTrafficTrendAnalysis;
import com.example.dao.HourTrafficTrendAnalysisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HourTrafficTrendAnalysisServiceImpl implements HourTrafficTrendAnalysisServiceI{
    @Autowired
    private HourTrafficTrendAnalysisDao hourTrafficTrendAnalysisDao;
    @Override
    public List<HourTrafficTrendAnalysis> getHourTrafficTrendAnalysis() {
        List<HourTrafficTrendAnalysis> hourTrafficTrendAnalyses = hourTrafficTrendAnalysisDao.getHourTrafficTrendAnalysis();
        if (hourTrafficTrendAnalyses == null || hourTrafficTrendAnalyses.size() == 0) {
            throw new RuntimeException("查询为空");
        }
        return hourTrafficTrendAnalyses;
    }
}
