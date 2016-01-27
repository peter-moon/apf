package com.moon.apf;

import android.app.Application;
import android.content.Context;

/**
 * Created by moon on 2016. 1. 27..
 */
public class ApfApplication extends Application {

    public static Context _applicationContext;
    public static Context _currentActivityContext;

    @Override
    public void onCreate() {
        super.onCreate();

        _applicationContext = getApplicationContext();
    }

    public void setCurrentActivityContext(Context activityContext){
        _currentActivityContext = activityContext;
    }
}
