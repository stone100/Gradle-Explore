package com.stone.library;

import android.util.Log;

/**
 * 开发工具类 (功能有: log输出, ...)
 * @author stone
 * @date 17/4/1
 */
public final class DevUtil {

    private static final String DEFAULT_TAG = "_app_";

    private static final boolean isDebug = BuildConfig.DEBUG;

    private DevUtil() {
        //no instance
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static void i(String tag, String msg) {
        if(isDebug) Log.i(tag, msg);
    }

    public static void d(String tag, String msg) {
        if(isDebug) Log.d(tag, msg);
    }

    public static void w(String tag, String msg) {
        if(isDebug) Log.w(tag, msg);
    }

    public static void e(String tag, String msg) {
        if(isDebug) Log.e(tag, msg);
    }

    public static void ii(String msg) {
        i(DEFAULT_TAG, msg);
    }

    public static void dd(String msg) {
        d(DEFAULT_TAG, msg);
    }

    public static void ww(String msg) {
        w(DEFAULT_TAG, msg);
    }

    public static void ee(String msg) {
        e(DEFAULT_TAG, msg);
    }
}
