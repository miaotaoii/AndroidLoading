package com.mt.myapplication;

import android.util.Log;

/**
 * 描述：
 * 版权：苏州美好明天机器人技术有限公司
 */
public class MLog {
    private static final boolean DEBUG =true;//开关控制
    private static final String TAG = "mt_log";

    public static void log(String msg) {
        if (DEBUG && msg != null) {
            Log.i(TAG, msg);
        }
    }
}