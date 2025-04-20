package com.example.service;

import com.example.bean.TopTenItem;
import com.example.dao.TopTenItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopTenItemServiceImpl implements TopTenItemServiceI{
    @Autowired
    private TopTenItemDao topTenItemDao;

    @Override
    public List<TopTenItem> getTopTenItem() {
        List<TopTenItem> topTenItemList = topTenItemDao.getTopTenItem();
        if (topTenItemList == null || topTenItemList.size() == 0) {
            throw new RuntimeException("查询为空");
        }
        return topTenItemList;
    }
}
