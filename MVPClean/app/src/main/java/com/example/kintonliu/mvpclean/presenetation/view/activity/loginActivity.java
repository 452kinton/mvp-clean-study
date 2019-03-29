package com.example.kintonliu.mvpclean.presenetation.view.activity;

import com.example.kintonliu.mvpclean.data.entity.UserInfo;
import com.example.kintonliu.mvpclean.presenetation.presenter.LoginPresenter;
import com.example.kintonliu.mvpclean.presenetation.view.LoginView;
import com.gdut.kintonliu.cleanmvpbykt.data.base.ResponseEntity;
import com.gdut.kintonliu.cleanmvpbykt.presenetation.base.BaseActivity;
import com.gdut.kintonliu.cleanmvpbykt.presenetation.base.BasePresenter;

public class loginActivity extends BaseActivity implements LoginView{
    @Override
    protected void initEvent() {

    }

    @Override
    protected BasePresenter getPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected int bindView() {
        return R.layout.activity_login;
    }

    @Override
    public String getAccount() {
        return "";
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public UserInfo getRequestEntity() {
        return new UserInfo().setPassword(getPassword()).setUsername(getAccount());
    }


    @Override
    public void onSuccess(ResponseEntity e) {

    }

    @Override
    public void onError() {

    }


}
