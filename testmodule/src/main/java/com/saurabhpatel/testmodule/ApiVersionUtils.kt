package com.saurabhpatel.testmodule

import android.os.Build

object ApiVersionUtils {
    /**
     * Check if API Version &gt;= 26
     *
     * @return true if API Version &gt;= 26
     */
    @JvmStatic
    fun hasOreo() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O
}

