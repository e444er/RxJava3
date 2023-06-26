package com.moon.rxjava3.lesson;


import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;

public class lesson5 {

    public static void main(String[] args) {
        Completable comparable = createCompletable();
        comparable.subscribe(new CompletableObserver() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onComplete() {
                System.out.println("Operation is complete");
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }
        });
    }

    private static Completable createCompletable() {
        return Completable.fromAction(deleteItem());
    }

    private static Action deleteItem() {
        return new Action() {
            @Override
            public void run() throws Throwable {
                System.out.println("Delete Item");
            }
        };
    }
}