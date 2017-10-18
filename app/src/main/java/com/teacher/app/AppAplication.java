package com.teacher.app;

import android.app.Application;

import com.vondear.rxtools.RxTool;

/**
 * Created by 侯程月 on 2017/10/17 15:34.
 * 邮箱437286343@qq.com
 */

public class AppAplication extends Application {
public  static AppAplication appAplication;

    public static AppAplication getInstance() {
        return appAplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appAplication=this;
        RxTool.init(this);//初始化Rx工具
    }
}
