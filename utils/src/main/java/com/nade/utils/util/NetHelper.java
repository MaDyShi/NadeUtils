package com.nade.utils.util;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetHelper {
    public static Retrofit mRetrofit;
    Interceptor okinter;
    String url;
    public NetHelper(Interceptor okinter, String url) {
        this.okinter = okinter;
        this.url = url;
    }

    public  Retrofit netHelper(Interceptor okinter, String url){
        Retrofit.Builder builder = new Retrofit.Builder();
        OkHttpClient.Builder okbuilder = new OkHttpClient.Builder();
        OkHttpClient client = okbuilder.addInterceptor(okinter)
                .connectTimeout(Constant.NET_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(Constant.READ_TIMEOUT,TimeUnit.SECONDS)
                .writeTimeout(Constant.WIRTE_TIMEOUT,TimeUnit.SECONDS)
                .build();
        return builder.client(client)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
        .build();
    }

    public   <T> T create(Class<T> service){
        return netHelper(okinter,url).create(service);
    }



}
