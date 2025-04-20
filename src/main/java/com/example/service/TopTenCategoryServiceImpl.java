package com.example.service;

import com.example.bean.TopTenCategory;
import com.example.dao.TopTenCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopTenCategoryServiceImpl implements TopTenCategoryServiceI {
    @Autowired
    private TopTenCategoryDao topTenCategoryDao;
    public List<TopTenCategory> getTopTenCategory() {
        List<TopTenCategory> topTenCategoryList = topTenCategoryDao.getTopTenCategory();
        if (topTenCategoryList == null || topTenCategoryList.size() == 0) {
            throw new RuntimeException("查询为空");
        }
        return topTenCategoryList;
    }
}
