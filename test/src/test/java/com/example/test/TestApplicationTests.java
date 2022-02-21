package com.example.test;

import com.example.test.bean.AdminBean;
import com.example.test.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@MapperScan("com.example.test.mapper")
@SpringBootTest
public class TestApplicationTests {
    @Autowired
    AdminService adminService;
    @Autowired
    DataSource dataSource;
   @Test
    public void contextLoads() {
        AdminBean adminBean = adminService.login("111","111");
        System.out.println("用户id：");
        System.out.println(adminBean.getId());
    }
    @Test
     public void contextLoads1() throws Exception {
        System.out.println("获取的数据库连接为:"+dataSource.getConnection());
    }
}
