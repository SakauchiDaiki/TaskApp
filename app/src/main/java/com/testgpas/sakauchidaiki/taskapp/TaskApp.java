package com.testgpas.sakauchidaiki.taskapp;

/**
 * Created by sakauchidaiki on 2018/01/11.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}