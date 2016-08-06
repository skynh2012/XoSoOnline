package com.duyanh.niit.ketquaonline.util;

import android.util.Log;

import com.duyanh.niit.ketquaonline.common.Common;

/**
 * Created by Administrator on 06/08/2016.
 */
public class LogUtil {
    /**
     * Log debug
     *
     * @param tag
     * @param message
     */
    public static void logD(String tag, String message) {
        if (Common.isDebug) {
            Log.d(tag, message);
        }
    }

    /**
     * Log debug
     *
     * @param tag
     * @param message
     */
    public static void logE(String tag, String message) {
        if (Common.isDebug) {
            Log.e(tag, message);
        }
    }
}
