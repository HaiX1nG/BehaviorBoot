package com.example.dao;

import com.example.bean.UserRetentionAnalysis;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserRetentionAnalysisDao {
    List<UserRetentionAnalysis> getUserRetentionAnalysis();
}
