package com.wdl.libcore;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this.getApplicationContext();
        WLibrary.set(this.getApplicationContext());
    }

    public static Context get() {
        return mContext;
    }
}
