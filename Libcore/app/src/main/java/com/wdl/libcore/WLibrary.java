package com.wdl.libcore;

import android.content.Context;

@SuppressWarnings("unused")
public class WLibrary {
    private static volatile WLibrary instance;
    private static Context mContext;

    private WLibrary() {
    }

    public static WLibrary getInstance() {
        if (instance == null) {
            synchronized (WLibrary.class) {
                if (instance == null) {
                    instance = new WLibrary();
                }
            }
        }
        return instance;
    }

    static void set(Context context) {
        mContext = context;
    }


    private static Context getContext() {
        return mContext;
    }

}
