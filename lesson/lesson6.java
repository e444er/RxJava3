package com.moon.rxjava3.lesson;


import static java.lang.Thread.sleep;

import android.annotation.SuppressLint;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;
//
//public class lesson6 {
//
//    public static void main(String[] args) {
//        asynsFlowble();
//    }
//
//    @SuppressLint("CheckResult")
//        Flowable.range(1, 10000)
//                .map(Item::new)
//                .observeOn(Schedulers.io())
//                .subscribe(item -> {
//                    sleep(1000);
//                    System.out.println("reveived myitem " + item.id + "\n");
//                });
//        try {
//            sleep(Long.MAX_VALUE);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    class Item {
//        int id;
//
//        public Item(int id) {
//            this.id = id;
//            System.out.println("Itme is created" + id);
//        }
//    }
//}