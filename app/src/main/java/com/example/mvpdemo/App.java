package com.example.mvpdemo;

import android.app.Application;

import com.example.mvpdemo.utils.log.MLog;

/**
 * @author enid
 * @date 2019/3/6
 * @description
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        MLog.plat(new DebugLog());
    }
}
