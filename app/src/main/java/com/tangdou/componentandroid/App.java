package com.tangdou.componentandroid;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by vigorous on 18/11/4.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.openLog();     // Print log
        ARouter.openDebug();

        ARouter.init(this);
    }
}
