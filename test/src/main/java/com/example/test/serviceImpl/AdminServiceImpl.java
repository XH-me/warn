package com.example.test.serviceImpl;

import com.example.test.bean.AdminBean;
import com.example.test.mapper.AdminMapper;
import com.example.test.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    //将DAO注入Service层
    @Resource
    private AdminMapper adminMapper;

    @Override
    public AdminBean login(String username,String password){
        return  adminMapper.login(username,password);
    }
}
