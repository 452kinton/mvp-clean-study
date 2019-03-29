package com.gdut.kintonliu.cleanmvpbykt.presenetation.base;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<T>{
    WeakReference<T> viewReference;

    public BasePresenter(T view){
        attachView(view);
    }

    private void attachView(T view) {
        viewReference = new WeakReference<T>(view);
    }

    private void detachView() {
        if (viewReference != null) {
            viewReference.clear();
            viewReference = null;
        }
    }

    public boolean isViewAttached() {
        return viewReference != null && viewReference.get() != null;
    }

    public T getView() {
        if (!isViewAttached())
            return null;
        return viewReference.get();
    }

    public void detach(){
        detachView();
    }
}
