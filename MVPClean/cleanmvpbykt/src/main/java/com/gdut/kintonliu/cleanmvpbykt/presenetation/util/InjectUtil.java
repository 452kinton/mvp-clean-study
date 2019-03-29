package com.gdut.kintonliu.cleanmvpbykt.presenetation.util;


import com.gdut.kintonliu.cleanmvpbykt.data.source.Repository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class InjectUtil {

    //获取Repository
    public static Repository provideDianRepository() {

        return Repository.getInstance();
    }

    //创建UseCase
    /*public static LoginUseCase provideLoginUseCase() {

        return new LoginUseCase(Schedulers.io(), AndroidSchedulers.mainThread(), provideDianRepository());
    }*/

}
