package com.example.kintonliu.mvpclean.domain;

import android.support.annotation.NonNull;

import com.example.kintonliu.mvpclean.data.base.RequestEntity;
import com.example.kintonliu.mvpclean.data.base.ResponseEntity;
import com.example.kintonliu.mvpclean.presenetation.util.Preconditions;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

/**
 * Created by Kinton on 2018/12/23
 * UseCase基类
 */
public abstract class BaseUseCase<P extends RequestEntity, Q extends ResponseEntity> {
    private final Scheduler observerThread;
    private final Scheduler subcriberThread;
    private final CompositeDisposable disposables;

    public BaseUseCase(Scheduler observerThread, Scheduler subcriberThread) {
        this.observerThread = observerThread;
        this.subcriberThread = subcriberThread;
        this.disposables = new CompositeDisposable();
    }

    protected abstract Observable<Q> buildUseCaseObservable(P request);

    public void execute(DisposableObserver<Q> observer, P request) {
        Preconditions.checkNotNull(observer);
        final Observable<Q> observable = this.buildUseCaseObservable(request)
                .subscribeOn(observerThread)
                .observeOn(subcriberThread);
        addDisposable(observable.subscribeWith(observer));
    }

    /**
     * Dispose from current {@link CompositeDisposable}.
     */
    public void dispose() {
        if (!disposables.isDisposed()) {
            disposables.dispose();
        }
    }

    /**
     * Dispose from current {@link CompositeDisposable}.
     */
    public void addDisposable(@NonNull Disposable disposable) {
        Preconditions.checkNotNull(disposable);
        Preconditions.checkNotNull(disposables);
        disposables.add(disposable);
    }

}
