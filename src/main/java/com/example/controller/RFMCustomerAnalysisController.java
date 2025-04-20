package com.example.controller;

import com.example.bean.RFMCustomerAnalysis;
import com.example.service.RFMCustomerAnalysisServiceI;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/rfm")
@CrossOrigin
public class RFMCustomerAnalysisController {
    @Resource
    private RFMCustomerAnalysisServiceI rfmCustomerAnalysisServiceI;
    @RequestMapping("/select")
    @ResponseBody
    public List<RFMCustomerAnalysis> getRFMCustomerAnalysis(){
        return rfmCustomerAnalysisServiceI.getRFMCustomerAnalysis();
    }
}
