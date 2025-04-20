package com.example.service;

import com.example.bean.TrafficFunnelConversionAnalysis;
import com.example.dao.TrafficFunnelConversionAnalysisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrafficFunnelConversionAnalysisImpl implements TrafficFunnelConversionAnalysisServiceI{
    @Autowired
    private TrafficFunnelConversionAnalysisDao trafficFunnelConversionAnalysisDao;
    @Override
    public List<TrafficFunnelConversionAnalysis> getTrafficFunnelConversionAnalysis() {
        List<TrafficFunnelConversionAnalysis> trafficFunnelConversionAnalyses = trafficFunnelConversionAnalysisDao.getTrafficFunnelConversionAnalysis();
        if (trafficFunnelConversionAnalyses == null || trafficFunnelConversionAnalyses.size() == 0) {
            throw new RuntimeException("查询为空");
        }
        return trafficFunnelConversionAnalyses;
    }
}
