package com.gdut.kintonliu.cleanmvpbykt.presenetation.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {
    public Unbinder unbinder;
    protected BasePresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(bindView());
        unbinder = ButterKnife.bind(this);
        mPresenter = getPresenter();
        initData();
        initEvent();
    }

    protected abstract void initEvent();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detach();
    }

    protected abstract BasePresenter getPresenter();

    protected abstract void initData();

    protected abstract int bindView();
}
