package com.xinliutong.componentized_test;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * description :
 *
 * @author : wzx
 * email : 445826958@qq.com
 * date : 2019/9/24 17:39
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
            ARouter.printStackTrace();
        }
        ARouter.init(this);
    }
}
