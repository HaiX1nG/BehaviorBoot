package com.example.dao;

import com.example.bean.TopTenItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TopTenItemDao {
    List<TopTenItem> getTopTenItem();
}
