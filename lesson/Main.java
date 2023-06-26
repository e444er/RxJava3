package com.moon.rxjava3.lesson;


import android.annotation.SuppressLint;

import io.reactivex.rxjava3.core.Observable;

public class Main {

    @SuppressLint("CheckResult")
    public static void main(String[] args) {
        Observable<String> observable = Observable.create(emitter -> {
            emitter.onNext("Click no 1");
            emitter.onNext("Click no 1");
            emitter.onNext("Click no 1");
            emitter.onComplete();
        });


        observable.subscribe((@SuppressLint("CheckResult") String item) -> {
            System.out.println(item);
        }, throwable -> {
            System.out.println(throwable.getMessage());
        }, () -> {
            System.out.println("ON Complete !");
        });
    }
}