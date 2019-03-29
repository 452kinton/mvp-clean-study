package com.gdut.kintonliu.cleanmvpbykt.base;

import com.gdut.kintonliu.cleanmvpbykt.data.base.ResponseEntity;

public interface CallBack {
    void onSuccess(ResponseEntity e);
    void onError();
}
