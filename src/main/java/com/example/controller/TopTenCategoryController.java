package com.example.controller;

import com.example.bean.TopTenCategory;
import com.example.service.TopTenCategoryServiceI;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/top10category")
@CrossOrigin
public class TopTenCategoryController {
    @Resource
    private TopTenCategoryServiceI topTenCategoryServiceI;
    @RequestMapping("/select")
    @ResponseBody
    public List<TopTenCategory> getTopTenCategory() {
        return topTenCategoryServiceI.getTopTenCategory();
    }
}
