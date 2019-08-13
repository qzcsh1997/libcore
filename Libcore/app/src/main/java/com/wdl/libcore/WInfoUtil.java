package com.wdl.libcore;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * 获取APK版本号、版本名
 */
@SuppressWarnings("unused")
public class WInfoUtil {
    private WInfoUtil() {
    }

    /**
     * 获取版本号
     *
     * @return 版本号
     */
    public static int getVersionCode() {
        int versionCode = 0;
        PackageManager pm = App.get().getPackageManager();
        try {
            PackageInfo pi = pm.getPackageInfo(App.get().getPackageName(), 0);
            versionCode = pi.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return versionCode;
    }

    /**
     * 获取版本名
     *
     * @return 版本名
     */
    public static String getVersionName() {
        String versionName = "";
        PackageManager pm = App.get().getPackageManager();
        try {
            PackageInfo pi = pm.getPackageInfo(App.get().getPackageName(), 0);
            versionName = pi.versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return versionName;
    }
}
