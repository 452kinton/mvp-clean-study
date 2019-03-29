package com.example.kintonliu.mvpclean.base;

import com.example.kintonliu.mvpclean.data.base.ResponseEntity;

public interface CallBack {
    void onSuccess(ResponseEntity e);
    void onError();
}
