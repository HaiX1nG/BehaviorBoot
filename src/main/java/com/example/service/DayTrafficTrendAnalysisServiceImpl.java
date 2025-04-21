package com.example.service;

import com.example.bean.DayTrafficTrendAnalysis;
import com.example.dao.DayTrafficTrendAnalysisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayTrafficTrendAnalysisServiceImpl implements DayTrafficTrendAnalysisServiceI {
    @Autowired
    private DayTrafficTrendAnalysisDao dayTrafficTrendAnalysisDao;
    @Override
    public List<DayTrafficTrendAnalysis> getDayTrafficTrendAnalysis() {
        List<DayTrafficTrendAnalysis> dayTrafficTrendAnalyses = dayTrafficTrendAnalysisDao.getDayTrafficTrendAnalysis();
        if (dayTrafficTrendAnalyses == null || dayTrafficTrendAnalyses.size() == 0) {
            throw new RuntimeException("查询为空");
        }
        return dayTrafficTrendAnalyses;
    }

    @Override
    public Long getAllUser() {
        Long allUser = dayTrafficTrendAnalysisDao.getAllUser();
        if (allUser.equals("")) {
            throw new RuntimeException("查询为空");
        }
        return allUser;
    }
}
