package com.nade.utils;



import retrofit2.http.GET;

public interface ServiceApi {

    @GET(Url.appInfo)
    io.reactivex.Observable<AppInfo> getAppInfo();


}
