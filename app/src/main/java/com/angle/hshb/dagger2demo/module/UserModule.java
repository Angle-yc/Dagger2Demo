package com.angle.hshb.dagger2demo.module;

import android.content.Context;
import android.util.Log;

import com.angle.hshb.dagger2demo.module.login.UserStore;
import com.angle.hshb.dagger2demo.module.register.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by angle
 *
 * 2018/3/6.
 */

@Module
public class UserModule {

    public static final String TAG ="Dagger_UserModule";
    Context context;

    public UserModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public ApiService providerApiService(){
        ApiService apiService = new ApiService(context);
        Log.i(TAG,"providerApiServiceRelease"+apiService);
        return apiService;
    }

    @Provides
    public String providerUrl(){
        return "www.baidu.com";
    }

    @Provides
    public Context ProviderContext(){
        return context;
    }


    @Provides
    public UserManager providerUserManager(ApiService apiService, UserStore userStore){
        return new UserManager(userStore,apiService);
    }

}
