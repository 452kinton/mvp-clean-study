package com.example.kintonliu.mvpclean.data.source;

import com.example.kintonliu.mvpclean.data.base.ResponseEntity;

import io.reactivex.Observable;

public class Repository {
    private static Repository INSTANCE;

    private Repository(){
    }

    public static Repository getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Repository();
        return INSTANCE;
    }

    public Observable<ResponseEntity> getUser(String loginAccount, String loginPsw) {
        return null;
    }

}
