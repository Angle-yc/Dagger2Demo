package com.angle.hshb.dagger2demo.module;

import com.angle.hshb.dagger2demo.module.login.UserStore;
import com.angle.hshb.dagger2demo.module.register.ApiService;

/**
 * Created by angle
 * 2018/3/6.
 */

public class UserManager {
    UserStore userStore;
    ApiService apiService;


    public UserManager(UserStore userStore, ApiService apiService) {
        this.userStore = userStore;
        this.apiService = apiService;
    }

    public void register(){
        apiService.register();
        userStore.login();
    }

}
