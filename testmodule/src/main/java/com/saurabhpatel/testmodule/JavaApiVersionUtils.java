package com.saurabhpatel.testmodule;

import android.os.Build;

public class JavaApiVersionUtils {

    private JavaApiVersionUtils() {

    }

    /**
     * Check if API Version &gt;= 26
     *
     * @return true if API Version &gt;= 26
     */
    public static boolean hasOreo() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.O;
    }
}

