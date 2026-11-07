package com.tipcl.android

import android.content.Context
import android.content.pm.ApplicationInfo
import android.os.StrictMode
import android.util.Log

/**
 * M6 启动性能巡检：debug 构建在主线程安装 StrictMode ThreadPolicy
 * （detectDiskReads / detectDiskWrites / detectNetwork），违规以日志报警。
 *
 * 线程策略是线程局部的：在主线程 install 后只监控主线程，后台/协程 IO 线程
 * 不受影响，因此"冷启动主线程零违规"可以直接用 logcat 中是否出现
 * `TipCL.StrictMode` 相关 StrictMode violation 来验收。
 *
 * release 构建为空操作（按 FLAG_DEBUGGABLE 判定），不引入任何开销。
 */
object StrictModeCompat {

    private const val TAG = "TipCL.StrictMode"

    fun install(context: Context) {
        val debuggable = context.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0
        if (!debuggable) return
        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectDiskReads()
                .detectDiskWrites()
                .detectNetwork()
                .penaltyLog()
                .build(),
        )
        Log.i(TAG, "strict mode thread policy installed (disk reads/writes + network, penalty=log)")
    }
}
