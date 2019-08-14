package com.wdl.libcore;

import android.app.Application;
import android.content.Context;

import com.wdl.libcore.util.WLogger;

public class App extends Application
{
    public static Context mContext;

    @Override
    public void onCreate()
    {
        super.onCreate();
        mContext = this.getApplicationContext();
        WLogger.setIsDebug(true);
    }

    public static Context get()
    {
        return mContext;
    }
}
