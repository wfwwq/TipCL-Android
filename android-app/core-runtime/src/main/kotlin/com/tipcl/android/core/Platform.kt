package com.tipcl.android.core

import java.nio.file.Path

/**
 * TipCL 各模块共享的平台约定（占位接口）。
 *
 * 公共约定（供其他模块遵循，不在此处引入额外依赖）：
 * - 所有 core 模块只依赖 JDK/kotlin-stdlib，平台实现（Android/JVM/Node）由 app 层注入；
 * - core-runtime 提供 JVM 侧注入环境，core-launch 提供版本清单与下载，
 *   core-input 产生输入事件，app 层负责把三者粘合；
 * - 日志统一走 [PlatformHooks.log]，tag 约定为 "TipCL.<module>"（如 "TipCL.launch"）。
 */
interface PlatformHooks {
    /** 模块可读写的数据目录（Android 上对应 filesDir 的绝对路径）。 */
    fun appDataDir(): Path

    /** 统一日志出口；实现方负责落到 logcat/文件等。 */
    fun log(tag: String, msg: String)
}
