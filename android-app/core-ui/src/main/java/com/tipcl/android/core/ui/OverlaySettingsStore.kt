package com.tipcl.android.core.ui

import android.content.Context

/**
 * 布局与灵敏度的持久化接口。core-ui 不绑定具体存储实现，
 * app 层提供 SharedPreferences 实现；键位 JSON 同时落一份到 appData
 * 目录（由实现方负责），便于调试与导出。
 */
interface OverlaySettingsStore {
    fun loadLayout(): OverlayLayout?
    fun saveLayout(layout: OverlayLayout)
    fun loadSensitivity(): Float
    fun saveSensitivity(value: Float)

    companion object {
        const val DEFAULT_SENSITIVITY = com.tipcl.android.core.input.LookGesture.DEFAULT_SENSITIVITY
    }
}

/** SharedPreferences + org.json 实现。键位 JSON 存于 prefs，并镜像到 appData 文件。 */
class SharedPrefsOverlaySettings(
    context: Context,
    private val appDataDir: java.nio.file.Path? = null,
) : OverlaySettingsStore {

    private val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    override fun loadLayout(): OverlayLayout? {
        val json = prefs.getString(KEY_LAYOUT, null) ?: return null
        return runCatching<OverlayLayout> { decode(json) }.getOrNull()
    }

    override fun saveLayout(layout: OverlayLayout) {
        val json = encode(layout)
        prefs.edit().putString(KEY_LAYOUT, json).apply()
        runCatching {
            appDataDir?.let { dir ->
                java.nio.file.Files.createDirectories(dir)
                java.nio.file.Files.write(dir.resolve(LAYOUT_FILE), json.toByteArray())
            }
        }
    }

    override fun loadSensitivity(): Float =
        prefs.getFloat(KEY_SENSITIVITY, OverlaySettingsStore.DEFAULT_SENSITIVITY)

    override fun saveSensitivity(value: Float) {
        prefs.edit().putFloat(KEY_SENSITIVITY, value).apply()
    }

    // 编解码统一走 OverlayLayoutJson（纯 JVM，可单测往返）。
    private fun encode(layout: OverlayLayout): String = OverlayLayoutJson.encode(layout)

    private fun decode(json: String): OverlayLayout = OverlayLayoutJson.decode(json)

    private companion object {
        const val PREFS_NAME = "tipcl_overlay"
        const val KEY_LAYOUT = "layout_json"
        const val KEY_SENSITIVITY = "look_sensitivity"
        const val LAYOUT_FILE = "overlay_layout.json"
    }
}
