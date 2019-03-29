package com.example.kintonliu.mvpclean.presenetation.base;

import com.example.kintonliu.mvpclean.base.CallBack;
import com.example.kintonliu.mvpclean.data.base.RequestEntity;

public  interface BaseView extends CallBack{
     RequestEntity getRequestEntity();

}
