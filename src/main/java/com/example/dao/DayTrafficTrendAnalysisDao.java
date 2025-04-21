package com.example.dao;

import com.example.bean.DayTrafficTrendAnalysis;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

// 数据访问层
@Repository
@Mapper
public interface DayTrafficTrendAnalysisDao {
    List<DayTrafficTrendAnalysis> getDayTrafficTrendAnalysis();
    Long getAllUser();
}
