package com.example.dao;

import com.example.bean.TopTenCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TopTenCategoryDao {
    List<TopTenCategory> getTopTenCategory();
}
