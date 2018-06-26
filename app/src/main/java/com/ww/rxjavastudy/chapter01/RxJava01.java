package com.ww.rxjavastudy.chapter01;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

/**
 * Created by HP on 2018/6/26.
 *
 * @author by wangWei
 */

public class RxJava01 {

    public static void main(String[] args) {
//        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
//                e.onNext(1);
//                e.onNext(2);
//                e.onNext(3);
//                e.onComplete();
//            }
//        });
//        Observer<Integer> observer = new Observer<Integer>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//                System.out.println("onSubscribe");
//            }
//
//            @Override
//            public void onNext(Integer value) {
//
//                System.out.println("onNext"+ value);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//                System.out.println("onComplete");
//            }
//        };
//        observable.subscribe(observer);
//        Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
//                //ObservableEmitter发射器   onNext  onError onComplete
//                e.onNext(1);
//                e.onComplete();
//            }
//        }).subscribe(new Observer<Integer>() {
//            Disposable disposable;
//
//            @Override
//            public void onSubscribe(Disposable d) {
//                disposable = d;
//                System.out.println("subscribe");
//            }
//
//            @Override
//            public void onNext(Integer value) {
//                //disposable.dispose();
//                //调用dispose()并不会导致上游不再继续发送事件, 上游会继续发送剩余的事件.
//                System.out.println("onnext=" + value);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//                System.out.println("complete");
//            }
//        });
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {

            }
        }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
//带有一个Consumer参数的方法表示下游只关心onNext事件, 其他的事件我假装没看见,
            }
        });
    }
}
