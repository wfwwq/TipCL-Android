package com.tipcl.android

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/** 全局启动设置：内存、附加 JVM 参数、触控灵敏度。 */
data class LaunchSettings(
    val maxMemoryMb: Int,
    val minMemoryMb: Int,
    val extraJvmArgs: String,
    val touchSensitivity: Float,
    /** 启用声音（默认开）：关闭时启动链路跳过 OpenAL 注入与音频供给。 */
    val soundEnabled: Boolean = true,
)

/**
 * 全局设置仓库（SharedPreferences + 进程级内存缓存）。
 *
 * 首次 [load] 触发一次磁盘读取，之后全部命中内存；[preload] 供冷启动在
 * IO 线程提前完成这次读取，保证主线程 load() 零磁盘 IO（StrictMode 验收）。
 * 写入先更新内存缓存再 apply() 异步落盘，语义不变。
 */
class TipCLSettingsStore(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun load(): LaunchSettings {
        memoryCache?.let { return it }
        val settings = LaunchSettings(
            maxMemoryMb = prefs.getInt(KEY_MAX_MEM, 2048),
            minMemoryMb = prefs.getInt(KEY_MIN_MEM, 512),
            extraJvmArgs = prefs.getString(KEY_JVM_ARGS, "") ?: "",
            touchSensitivity = prefs.getFloat(KEY_SENSITIVITY, 1.0f),
            soundEnabled = prefs.getBoolean(KEY_SOUND_ENABLED, true),
        )
        memoryCache = settings
        return settings
    }

    fun save(s: LaunchSettings) {
        memoryCache = s
        prefs.edit()
            .putInt(KEY_MAX_MEM, s.maxMemoryMb)
            .putInt(KEY_MIN_MEM, s.minMemoryMb)
            .putString(KEY_JVM_ARGS, s.extraJvmArgs)
            .putFloat(KEY_SENSITIVITY, s.touchSensitivity)
            .putBoolean(KEY_SOUND_ENABLED, s.soundEnabled)
            .apply()
    }

    companion object {
        private const val PREFS_NAME = "tipcl_settings"
        private const val KEY_MAX_MEM = "max_memory_mb"
        private const val KEY_MIN_MEM = "min_memory_mb"
        private const val KEY_JVM_ARGS = "extra_jvm_args"
        private const val KEY_SENSITIVITY = "touch_sensitivity"
        private const val KEY_SOUND_ENABLED = "sound_enabled"

        /** 进程级单文件缓存：所有 TipCLSettingsStore 实例共享。 */
        @Volatile
        private var memoryCache: LaunchSettings? = null

        /** 冷启动预热：切 IO 线程读一次 SharedPreferences 使缓存驻留。 */
        suspend fun preload(context: Context) {
            withContext(Dispatchers.IO) {
                if (memoryCache == null) {
                    TipCLSettingsStore(context.applicationContext).load()
                }
            }
        }
    }
}
