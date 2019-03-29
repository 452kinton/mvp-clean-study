package com.gdut.kintonliu.cleanmvpbykt.presenetation.base;

import com.gdut.kintonliu.cleanmvpbykt.base.CallBack;
import com.gdut.kintonliu.cleanmvpbykt.data.base.RequestEntity;

public  interface BaseView extends CallBack {
     RequestEntity getRequestEntity();

}
