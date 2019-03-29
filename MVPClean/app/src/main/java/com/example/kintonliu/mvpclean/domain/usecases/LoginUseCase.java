package com.example.kintonliu.mvpclean.domain.usecases;

import com.example.kintonliu.mvpclean.data.entity.UserInfo;
import com.example.kintonliu.mvpclean.data.source.Repository;
import com.gdut.kintonliu.cleanmvpbykt.data.base.ResponseEntity;
import com.gdut.kintonliu.cleanmvpbykt.domain.BaseUseCase;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class LoginUseCase extends BaseUseCase<UserInfo,ResponseEntity> {

    private final Repository repository;


    public LoginUseCase(Scheduler observerThread, Scheduler subcriberThread,Repository repository) {
        super(observerThread, subcriberThread);
        this.repository = repository;
    }

    @Override
    protected Observable<ResponseEntity> buildUseCaseObservable(UserInfo request) {
        return repository.getUser(request.getUsername(), request.getPassword());
    }
}
