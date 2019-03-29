package com.gdut.kintonliu.cleanmvpbykt.presenetation.view;

import com.gdut.kintonliu.cleanmvpbykt.data.entity.UserInfo;
import com.gdut.kintonliu.cleanmvpbykt.presenetation.base.BaseView;

public interface LoginView extends BaseView {
    String getAccount();
    String getPassword();
    UserInfo getLoginRequest();
}
