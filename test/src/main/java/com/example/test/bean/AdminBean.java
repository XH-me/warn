package com.example.test.bean;

import lombok.Data;

@Data
public class
AdminBean {
    private int id;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private  String enable;

    public AdminBean() {
    }

    @Override
    public String toString() {
        return "AdminBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", enable='" + enable + '\'' +
                '}';
    }

    public AdminBean(int id, String username, String password, String email, String mobile, String enable) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.enable = enable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public AdminBean(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public AdminBean(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
