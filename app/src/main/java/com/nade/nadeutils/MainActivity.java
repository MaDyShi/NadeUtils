package com.nade.nadeutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.nade.utils.AppInfo;
import com.nade.utils.OkInterceptor;
import com.nade.utils.ServiceApi;
import com.nade.utils.Url;
import com.nade.utils.util.NetHelper;
import com.nade.utils.util.ObServableTF;

import io.reactivex.observers.DisposableObserver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  Utils.getAppinfo();
       new NetHelper(new OkInterceptor(), Url.baseUrl)
                .create(PinCheService.class)
                .myAppInfo()
                .compose(new ObServableTF())
                .subscribe(new DisposableObserver() {
                    @Override
                    public void onNext(Object o) {
                        AppInfo info = (AppInfo) o;
                        Log.d("tag", "onNext: 成功--"+info.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("tag", "onError: 失败--"+e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }




}
