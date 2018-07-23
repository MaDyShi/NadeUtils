package com.nade.utils.util;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ObServableTF implements ObservableTransformer {

    @Override
    public ObservableSource apply(Observable upstream) {
        return upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());

    }
}
