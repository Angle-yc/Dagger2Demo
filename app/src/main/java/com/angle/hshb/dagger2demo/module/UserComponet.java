package com.angle.hshb.dagger2demo.module;

import com.angle.hshb.dagger2demo.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by angle
 * 2018/3/6.
 */

@Singleton
@Component(modules = {UserModule.class})
public interface UserComponet {

    void inject(MainActivity activity);
}
