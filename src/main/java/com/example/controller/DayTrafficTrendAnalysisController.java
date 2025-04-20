package com.example.controller;

import com.example.bean.DayTrafficTrendAnalysis;
import com.example.service.DayTrafficTrendAnalysisServiceI;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/day")
@CrossOrigin
public class DayTrafficTrendAnalysisController {
    @Resource
    private DayTrafficTrendAnalysisServiceI dayTrafficTrendAnalysisServiceI;
    @RequestMapping("/select")
    @ResponseBody
    public List<DayTrafficTrendAnalysis> getDayTrafficTrendAnalysis() {
        return dayTrafficTrendAnalysisServiceI.getDayTrafficTrendAnalysis();
    }
}
