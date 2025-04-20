package com.example.controller;

import com.example.bean.TopTenItem;
import com.example.service.TopTenItemServiceI;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/top10item")
@CrossOrigin
public class TopTenItemController {
    @Resource
    private TopTenItemServiceI topTenItemServiceI;
    @RequestMapping("/select")
    @ResponseBody
    public List<TopTenItem> getTopTenItem() {
        return topTenItemServiceI.getTopTenItem();
    }
}
