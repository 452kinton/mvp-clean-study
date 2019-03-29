package com.example.kintonliu.mvpclean.presenetation.presenter;

import com.example.kintonliu.mvpclean.data.base.Entity;
import com.example.kintonliu.mvpclean.data.base.RequestEntity;
import com.example.kintonliu.mvpclean.data.base.ResponseEntity;
import com.example.kintonliu.mvpclean.domain.usecases.LoginUseCase;
import com.example.kintonliu.mvpclean.presenetation.base.BasePresenter;
import com.example.kintonliu.mvpclean.presenetation.util.InjectUtil;
import com.example.kintonliu.mvpclean.presenetation.view.LoginView;

import io.reactivex.observers.DisposableObserver;

public class LoginPresenter extends BasePresenter<LoginView> {
    private LoginUseCase loginUseCase;

    public LoginPresenter(LoginView view) {
        super(view);
        loginUseCase = InjectUtil.provideLoginUseCase();
    }

    public void login(){
            loginUseCase.execute(new LoginObserver(),getView().getLoginRequest());
    }

    @Override
    public void detach() {
        if(loginUseCase!=null)loginUseCase.dispose();
        super.detach();
    }

    private final class LoginObserver extends DisposableObserver<ResponseEntity> {

        @Override
        public void onNext(ResponseEntity user) {
            getView().onSuccess(user);
        }

        @Override
        public void onError(Throwable e) {
            getView().onError();
        }

        @Override
        public void onComplete() {
        }
    }
}
