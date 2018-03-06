package com.angle.hshb.dagger2demo.module.register;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by angle
 * 2018/3/6.
 */

public class ApiService {
    public static final String TAG = "Dagger_ApiService";

    Context context;

    @Inject
    public ApiService(Context context) {
        this.context = context;
    }

    public ApiService(String url){
        Log.i(TAG,""+url);
    }


    public void register(){
        //注册的方法
        Log.i(TAG,"Register");
    }
}
