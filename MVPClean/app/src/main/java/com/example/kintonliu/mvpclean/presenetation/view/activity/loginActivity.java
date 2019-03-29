package com.example.kintonliu.mvpclean.presenetation.view.activity;

import com.example.kintonliu.mvpclean.R;
import com.example.kintonliu.mvpclean.data.base.RequestEntity;
import com.example.kintonliu.mvpclean.data.base.ResponseEntity;
import com.example.kintonliu.mvpclean.data.entity.UserInfo;
import com.example.kintonliu.mvpclean.presenetation.base.BaseActivity;
import com.example.kintonliu.mvpclean.presenetation.base.BasePresenter;
import com.example.kintonliu.mvpclean.presenetation.presenter.LoginPresenter;
import com.example.kintonliu.mvpclean.presenetation.view.LoginView;

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
    public UserInfo getLoginRequest() {
        return new UserInfo().setPassword(getPassword()).setUsername(getAccount());
    }

    @Override
    public void onSuccess(ResponseEntity e) {

    }

    @Override
    public void onError() {

    }

    @Override
    public RequestEntity getRequestEntity() {
        return null;
    }
}
