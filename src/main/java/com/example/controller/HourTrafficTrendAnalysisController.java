package com.example.controller;

import com.example.bean.HourTrafficTrendAnalysis;
import com.example.service.HourTrafficTrendAnalysisServiceI;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hour")
@CrossOrigin
public class HourTrafficTrendAnalysisController {
    @Resource
    private HourTrafficTrendAnalysisServiceI hourTrafficTrendAnalysisServiceI;
    @RequestMapping("/select")
    @ResponseBody
    public List<HourTrafficTrendAnalysis> getHourTrafficTrendAnalysis() {
        return hourTrafficTrendAnalysisServiceI.getHourTrafficTrendAnalysis();
    }
}
