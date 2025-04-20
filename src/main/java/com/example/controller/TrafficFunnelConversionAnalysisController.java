package com.example.controller;

import com.example.bean.TrafficFunnelConversionAnalysis;
import com.example.service.TrafficFunnelConversionAnalysisServiceI;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/TrafficFunnelConversionAnalysis")
@CrossOrigin
public class TrafficFunnelConversionAnalysisController {
    @Resource
    private TrafficFunnelConversionAnalysisServiceI trafficFunnelConversionAnalysisServiceI;
    @RequestMapping("/select")
    @ResponseBody
    public List<TrafficFunnelConversionAnalysis> getTrafficFunnelConversionAnalysis() {
        return trafficFunnelConversionAnalysisServiceI.getTrafficFunnelConversionAnalysis();
    }
}
