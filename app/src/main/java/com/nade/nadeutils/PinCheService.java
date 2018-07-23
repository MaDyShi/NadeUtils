package com.nade.nadeutils;

import com.nade.utils.AppInfo;
import com.nade.utils.ServiceApi;
import com.nade.utils.Url;

import retrofit2.http.GET;

public interface PinCheService {

    @GET(Url.appInfo)
    io.reactivex.Observable<AppInfo> myAppInfo();


}
