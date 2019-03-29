package com.example.kintonliu.mvpclean.presenetation.util;

import com.example.kintonliu.mvpclean.data.source.Repository;
import com.example.kintonliu.mvpclean.domain.usecases.LoginUseCase;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class InjectUtil {

    //获取Repository
    public static Repository provideDianRepository() {

        return Repository.getInstance();
    }

    //创建UseCase
    public static LoginUseCase provideLoginUseCase() {

        return new LoginUseCase(Schedulers.io(), AndroidSchedulers.mainThread(), provideDianRepository());
    }

}
