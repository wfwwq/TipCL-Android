package com.tipcl.android.core.audio

import java.io.File

/**
 * 启动参数注入钩子（纯函数，供 GameProcessBuilder 类调用方在拉起游戏前调用）。
 *
 * MC 1.20.1 / LWJGL3 的 OpenAL 加载路径：
 * - lwjgl-openal 通过 `org.lwjgl.openal.ALC` -> SharedLibraryLoader 加载 OpenAL Soft；
 * - `openal.library.path` 系统属性指定搜索目录（LWJGL 会尝试
 *   `<path>/libopenal.so`，Android 上归到 <path> 根下按名字找）。
 *
 * 因此注入项为：
 * - `-Dopenal.library.path=<nativeLibDir>`：OpenAlProvisioner 供给的产物目录；
 * - 可选 `-Dopenal.device=<name>`：设备名占位（M4 接入）；
 * - 追加 `-Dopenal.soft.*` 类调参留给真机联调（如 `openal.soft.hrtf=false`）。
 *
 * 纯函数：不读环境、不做 IO，输入输出决定论，便于单测。
 */
object AudioInitHook {

    /** 已注入标记属性名（防重复注入，幂等）。 */
    const val PROP_INJECTED = "tipcl.audio.hooked"

    /**
     * 把音频相关 JVM 系统属性追加到 [jvmArgs]。
     *
     * @param nativeLibDir OpenAL Soft so 所在目录（供给器产物目录）
     * @param deviceName   设备名占位，null 时不注入
     * @return 新的参数列表（不改写入参；已含 openal.library.path 时原样返回）
     */
    fun injectOpenAlArgs(
        jvmArgs: List<String>,
        nativeLibDir: File,
        deviceName: String? = null,
    ): List<String> {
        if (jvmArgs.any { it.startsWith("-Dopenal.library.path=") }) return jvmArgs
        val out = jvmArgs.toMutableList()
        out += "-Dopenal.library.path=${nativeLibDir.absolutePath}"
        if (!deviceName.isNullOrBlank()) out += "-Dopenal.device=$deviceName"
        out += "-D$PROP_INJECTED=1"
        return out
    }
}
