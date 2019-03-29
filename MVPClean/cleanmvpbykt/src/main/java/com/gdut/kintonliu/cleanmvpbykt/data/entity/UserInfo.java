package com.gdut.kintonliu.cleanmvpbykt.data.entity;

import com.example.kintonliu.mvpclean.data.base.RequestEntity;

public class UserInfo extends RequestEntity {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public UserInfo setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserInfo setUsername(String username) {
        this.username = username;
        return this;
    }
}
