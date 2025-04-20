package com.example.controller;

import com.example.bean.UserRetentionAnalysis;
import com.example.service.UserRetentionAnalysisServiceI;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/UserRetentionAnalysis")
@CrossOrigin
public class UserRetentionAnalysisController {
    @Resource
    private UserRetentionAnalysisServiceI userRetentionAnalysisServiceI;
    @RequestMapping("/select")
    @ResponseBody
    public List<UserRetentionAnalysis> getUserRetentionAnalysis() {
        return userRetentionAnalysisServiceI.getUserRetentionAnalysis();
    }
}
