package com.tipcl.android.core.runtime

import java.nio.file.Path

/**
 * 启动参数来源抽象。core-runtime 只依赖此接口，
 * 实际的版本清单解析/内存推算由 core-launch 提供（依赖倒置，避免模块反向依赖）。
 */
interface LaunchArgsProvider {
    data class LaunchSpec(
        /** JVM 参数（-Xmx、-D 系统属性等，不含 java.library.path，由 runtime 注入）。 */
        val jvmArgs: List<String>,
        /** 主类全限定名。 */
        val mainClass: String,
        /** classpath 条目（已展开的绝对路径），可空则用 -cp 拼接。 */
        val classpath: List<Path>,
        /** 传给主类的程序参数。 */
        val programArgs: List<String>,
    )

    fun provide(): LaunchSpec
}
