package com.angle.hshb.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.angle.hshb.dagger2demo.module.DaggerUserComponet;
import com.angle.hshb.dagger2demo.module.UserManager;
import com.angle.hshb.dagger2demo.module.UserModule;
import com.angle.hshb.dagger2demo.module.register.ApiService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Dagger_MainActivity";

    @Inject
    UserManager userManager;

    @Inject
    ApiService apiService;

    @Inject
    ApiService apiService1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerUserComponet
//                .builder()
//                .userModule(new UserModule(this))
//                .build()
//                .inject(this);
//        userManager.register();
//        Log.i(TAG,"onCreate:"+userManager);

        DaggerUserComponet.builder().userModule(new UserModule(this)).build().inject(this);
        userManager.register();
        Log.i(TAG,"ApiService = "+apiService);
        Log.i(TAG,"ApiService1 = "+apiService1);

    }
}
