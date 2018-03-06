package com.angle.hshb.dagger2demo.module.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.angle.hshb.dagger2demo.MainActivity;
import com.angle.hshb.dagger2demo.R;
import com.angle.hshb.dagger2demo.module.UserModule;
import com.angle.hshb.dagger2demo.module.register.ApiService;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {
    public static final String TAG =  "Dagger_LoginActivity";

    @Inject
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DaggerLoginComponent.builder().userModule(new UserModule(this)).build().inject(this);
        Log.i(TAG,"ApiService : "+apiService);
    }

    public void gogogo(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
