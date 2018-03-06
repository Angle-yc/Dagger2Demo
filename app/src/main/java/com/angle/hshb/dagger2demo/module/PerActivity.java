package com.angle.hshb.dagger2demo.module;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by angle
 * 2018/3/6.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {
}
