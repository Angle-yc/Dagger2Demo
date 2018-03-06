package com.angle.hshb.dagger2demo.module;

import com.angle.hshb.dagger2demo.module.register.ApiService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by angle
 * 2018/3/6.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    /**
     * 全局单列.所以不用Inject Activity
     *
     * @return  返回ApiService实例
     */
    ApiService getApiService();
}
