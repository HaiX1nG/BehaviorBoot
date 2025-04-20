package com.example.service;

import com.example.bean.UserRetentionAnalysis;
import com.example.dao.UserRetentionAnalysisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRetentionAnalysisImpl implements UserRetentionAnalysisServiceI{
    @Autowired
    private UserRetentionAnalysisDao userRetentionAnalysisDao;
    @Override
    public List<UserRetentionAnalysis> getUserRetentionAnalysis() {
        List<UserRetentionAnalysis> userRetentionAnalyses = userRetentionAnalysisDao.getUserRetentionAnalysis();
        if (userRetentionAnalyses == null || userRetentionAnalyses.size() == 0) {
            throw new RuntimeException("查询为空");
        }
        return userRetentionAnalyses;
    }
}
