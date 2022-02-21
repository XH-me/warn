package com.example.test.mapper;

import com.example.test.bean.AdminBean;
import org.apache.ibatis.annotations.Mapper;

//DAO层访问数据库接口文件

public interface AdminMapper {
    AdminBean login(String username , String password);
}
