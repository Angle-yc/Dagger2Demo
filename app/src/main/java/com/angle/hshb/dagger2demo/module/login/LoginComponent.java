package com.angle.hshb.dagger2demo.module.login;

import com.angle.hshb.dagger2demo.module.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by angle
 * 2018/3/6.
 */

@Singleton
@Component(modules = {UserModule.class})
public interface LoginComponent {

     void inject(LoginActivity activity);
}
