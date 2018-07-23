package com.nade.utils;

import android.util.Log;

import com.nade.utils.util.NetHelper;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Utils {
    public static void getAppinfo(){
        Retrofit.Builder builder = new Retrofit.Builder();
        OkHttpClient.Builder builder1 = new OkHttpClient.Builder();
        builder1.addInterceptor(new OkInterceptor());
        builder.client(builder1.build());
        builder.baseUrl(Url.baseUrl);
        Retrofit build = builder.addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        build.create(ServiceApi.class).getAppInfo().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<AppInfo>() {
                    @Override
                    public void onNext(AppInfo appInfo) {
                        Log.d("tag", "onNext: app--"+appInfo.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("tag", "onError: 错误--"+e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
        Observable<AppInfo> appInfo = new NetHelper(new OkInterceptor(), Url.baseUrl).create(ServiceApi.class).getAppInfo();




        /*build.create(ServiceApi.class).getAppInfo().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<AppInfo>() {
                    @Override
                    public void onNext(AppInfo dataBean) {
                        Log.d("tag", "onNext: appinfo--"+dataBean.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("tag", "onError: e--"+e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
        */

    }
}
