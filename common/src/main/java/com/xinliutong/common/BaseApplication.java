package com.xinliutong.common;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * description :
 *
 * @author : wzx
 * email : 445826958@qq.com
 * date : 2019/9/26 10:17
 */
public class BaseApplication extends Application {
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        if(BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
            ARouter.printStackTrace();
        }
        ARouter.init(this);
    }

    public static Context getContext(){
        return mContext;
    }
}
