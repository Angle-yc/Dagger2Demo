package com.angle.hshb.dagger2demo.module.login;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by angle
 * 2018/3/6.
 */

public class UserStore {
    public static final String TAG = "Dagger_UserStore";

    @Inject
    public UserStore(String path){
        Log.i(TAG,""+path);
    }

    public void login(){
        //登陆的方法
        Log.i(TAG,"login");
    }
}
