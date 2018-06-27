package com.ww.rxjavastudy.chapter04;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ww.rxjavastudy.R;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by HP on 2018/6/27.
 *
 * @author by wangWei
 */

public class ChapterActivity04 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter04);
        //注意开启线程
        Observable<Integer> observable1 = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                Log.e("tag", "emit==1");
                e.onNext(1);
                Log.e("tag", "emit==2");
                e.onNext(2);
                Log.e("tag", "emit==3");
                e.onNext(3);
                Log.e("tag", "emit==4");
                e.onNext(4);
                Log.e("tag", "emit==5");
                e.onNext(5);
            }
        }).subscribeOn(Schedulers.io());
        Observable<String> observable2 = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception {
                Log.e("tag", "emit==A");
                e.onNext("A");
                Log.e("tag", "emit==B");
                e.onNext("B");
                Log.e("tag", "emit==C");
                e.onNext("C");

            }
        }).subscribeOn(Schedulers.io());
        Observable.zip(observable1, observable2, new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer integer, String s) throws Exception {
                return integer + "   " + s;
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.e("tag", "Subscribe");
            }

            @Override
            public void onNext(String value) {
                Log.e("tag", "onNext---" + value);
            }


            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
//在Android中的应用，如果有一个界面需要两个接口请求的数据，可以用zip

    }
}
