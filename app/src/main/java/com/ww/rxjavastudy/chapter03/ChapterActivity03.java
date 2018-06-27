package com.ww.rxjavastudy.chapter03;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ww.rxjavastudy.R;

/**
 * Created by HP on 2018/6/26.
 *
 * @author by wangWei
 */

public class ChapterActivity03 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter03);
//        Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
//                e.onNext(1);
//                e.onNext(2);
//                e.onNext(3);
//            }
//        }).map(new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) throws Exception {
//                return "the result is  " + integer;
//            }
//        }).subscribe(new Consumer<String>() {
//            @Override
//            public void accept(String s) throws Exception {
//                Log.e("tag", "转换以后的数据==" + s);
//            }
//        });
        //FlatMap将一个发送事件的上游Observable变换为多个发送事件的Observables，
        // 然后将它们发射的事件合并后放进一个单独的Observable里.
        //它没有顺序 contactmap
//        Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
//                e.onNext(1);
//                e.onNext(2);
//                e.onNext(3);
//            }
//        }).flatMap(new Function<Integer, ObservableSource<String>>() {
//            @Override
//            public ObservableSource<String apply(Integer integer) throws Exception {
//                final List<String> list = new ArrayList<>();
//                for (int i = 0; i < 3; i++) {
//                    list.add("I am value " + integer);
//                }
//                return Observable.fromIterable(list).delay(10, TimeUnit.MILLISECONDS);
//
//            }
//        }).subscribe(new Consumer<String>() {
//            @Override
//            public void accept(String s) throws Exception {
//                Log.d("tag", s);
//            }
//        });

    }
}
