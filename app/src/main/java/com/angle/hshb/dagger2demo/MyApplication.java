package com.angle.hshb.dagger2demo;

import android.app.Application;

import com.angle.hshb.dagger2demo.module.AppComponent;

/**
 * Created by angle
 * 2018/3/6.
 */

public class MyApplication extends Application{

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

    }

}
