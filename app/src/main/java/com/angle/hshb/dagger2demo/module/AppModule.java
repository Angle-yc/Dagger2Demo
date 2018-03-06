package com.angle.hshb.dagger2demo.module;

import android.util.Log;

import com.angle.hshb.dagger2demo.MyApplication;
import com.angle.hshb.dagger2demo.module.register.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by angle
 * 2018/3/6.
 */

@Module
public class AppModule {
    public static final String TAG = "Dagger_AppModule";
    private MyApplication context;

    public AppModule(MyApplication context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public ApiService providerApiService(){
        ApiService apiService = new ApiService(context);
        Log.i(TAG,"providerApiService : "+apiService);
        return apiService;
    }
}
