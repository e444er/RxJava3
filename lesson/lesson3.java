package com.moon.rxjava3.lesson;


import android.annotation.SuppressLint;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Action;

public class lesson3 {

    @SuppressLint("CheckResult")
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.range(2,5);

        observable.subscribe(item ->{
            System.out.println(item);
        });

        Observable<Long> observable2 = Observable.interval(2, TimeUnit.MILLISECONDS);

        observable2.subscribe(item ->{
            System.out.println(item);
        });


        Observable<Long> timeobservable = Observable.timer(5,TimeUnit.SECONDS);

        timeobservable.subscribe(item ->{
            System.out.println("5 seconds");
        });

        Action acton = () -> System.out.println("Hello world");

        Completable completable = Completable.fromAction(acton);

        completable.subscribe(()-> {
            System.out.println("Action ends");
        });
    }
}