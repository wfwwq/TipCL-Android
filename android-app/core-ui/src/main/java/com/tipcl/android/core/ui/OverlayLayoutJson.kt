package com.tipcl.android.core.ui

import org.json.JSONArray
import org.json.JSONObject

/**
 * 布局 JSON 编解码（纯 JVM，无 Android 依赖，单测直测）。
 *
 * 格式（version 1）：
 * ```
 * {
 *   "version": 1,
 *   "buttons": [{"name","key","behavior","x","y","sizeDp","alpha"}...],
 *   "joystick": {"cx","cy","r","deadZone","floating"},
 *   "globalAlpha": 1.0
 * }
 * ```
 * 旧格式（无 version/globalAlpha/deadZone）解码时取安全默认值，
 * 保证既有持久化数据可平滑读取。
 */
object OverlayLayoutJson {

    fun encode(layout: OverlayLayout): String {
        val arr = JSONArray()
        layout.buttons.forEach { b ->
            arr.put(
                JSONObject()
                    .put("name", b.name)
                    .put("key", b.key)
                    .put("behavior", b.behavior)
                    .put("x", b.anchorXF.toDouble())
                    .put("y", b.anchorYF.toDouble())
                    .put("sizeDp", b.sizeDp.toDouble())
                    .put("alpha", b.alpha.toDouble())
            )
        }
        val joy = layout.joystick
        return JSONObject()
            .put("version", layout.version)
            .put("buttons", arr)
            .put(
                "joystick",
                JSONObject()
                    .put("cx", joy.centerXF.toDouble())
                    .put("cy", joy.centerYF.toDouble())
                    .put("r", joy.radiusF.toDouble())
                    .put("deadZone", joy.deadZoneF.toDouble())
                    .put("floating", joy.floating)
            )
            .put("globalAlpha", layout.globalAlpha.toDouble())
            .toString()
    }

    fun decode(json: String): OverlayLayout {
        val obj = JSONObject(json)
        val arr = obj.getJSONArray("buttons")
        val buttons = buildList {
            for (i in 0 until arr.length()) {
                val b = arr.getJSONObject(i)
                add(
                    ButtonSpec(
                        name = b.getString("name"),
                        key = b.getInt("key"),
                        behavior = b.optString("behavior", "HOLD"),
                        anchorXF = b.getDouble("x").toFloat(),
                        anchorYF = b.getDouble("y").toFloat(),
                        sizeDp = b.getDouble("sizeDp").toFloat(),
                        alpha = b.getDouble("alpha").toFloat(),
                    )
                )
            }
        }
        val j = obj.getJSONObject("joystick")
        return OverlayLayout(
            version = obj.optInt("version", OverlayLayout.VERSION),
            buttons = buttons,
            joystick = JoystickSpec(
                centerXF = j.getDouble("cx").toFloat(),
                centerYF = j.getDouble("cy").toFloat(),
                radiusF = j.getDouble("r").toFloat(),
                deadZoneF = j.optDouble("deadZone", JoystickSpec().deadZoneF.toDouble()).toFloat(),
                floating = j.optBoolean("floating", false),
            ),
            globalAlpha = obj.optDouble("globalAlpha", 1.0).toFloat(),
        )
    }
}
