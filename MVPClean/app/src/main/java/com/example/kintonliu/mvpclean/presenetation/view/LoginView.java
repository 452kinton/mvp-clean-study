package com.example.kintonliu.mvpclean.presenetation.view;

import com.example.kintonliu.mvpclean.data.entity.UserInfo;
import com.example.kintonliu.mvpclean.presenetation.base.BaseView;

public interface LoginView extends BaseView{
    String getAccount();
    String getPassword();
    UserInfo getLoginRequest();
}
