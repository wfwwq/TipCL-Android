package com.tipcl.android.core.ui

import com.tipcl.android.core.input.Keys
import kotlin.math.hypot
import kotlin.math.roundToInt

/**
 * 覆盖层布局描述。所有坐标/尺寸使用屏幕相对量（0..1），
 * 使布局在分辨率与旋转间可迁移；换算到像素在 pipeline 完成。
 */
data class ButtonSpec(
    val name: String,
    val key: Int,
    /** "HOLD"=按住保持 / "TAP"=点按；对应 core-input VirtualButton.Behavior。 */
    val behavior: String,
    /** 按钮中心相对屏幕坐标（宽/高比例）。 */
    val anchorXF: Float,
    val anchorYF: Float,
    /** 按钮直径（dp）。 */
    val sizeDp: Float,
    /** 透明度 0..1（1 不透明）。 */
    val alpha: Float,
)

data class JoystickSpec(
    /** 摇杆底座默认位置（未按下时的展示位），相对屏幕坐标。 */
    val centerXF: Float = 0.14f,
    val centerYF: Float = 0.74f,
    /** 摇杆半径相对屏幕宽度的比例。 */
    val radiusF: Float = 0.11f,
    /** 死区半径占摇杆半径的比例（0..1），低于该比例的偏移视为无输入。 */
    val deadZoneF: Float = 0.12f,
    /** 浮动摇杆：按点即底座中心，动态绘制；false 为固定底座。 */
    val floating: Boolean = false,
)

data class OverlayLayout(
    /** 布局 JSON 版本号，便于未来迁移（当前 1）。 */
    val version: Int = VERSION,
    val buttons: List<ButtonSpec>,
    val joystick: JoystickSpec = JoystickSpec(),
    /** 全局透明度乘数（0.1..1），与单键 alpha 相乘后用于渲染。 */
    val globalAlpha: Float = 1f,
) {
    /** 取指定名字的按键（编辑器以 name 为身份键）。 */
    fun button(name: String): ButtonSpec? = buttons.firstOrNull { it.name == name }

    companion object {
        const val VERSION = 1

        /** 默认键位：跳跃=Space、潜行=Shift、聊天=T、背包=E、丢弃=Q。 */
        fun default(): OverlayLayout = OverlayLayout(
            buttons = listOf(
                ButtonSpec("跳跃", Keys.SPACE, "HOLD", 0.86f, 0.72f, 76f, 0.5f),
                ButtonSpec("潜行", Keys.SHIFT_LEFT, "HOLD", 0.72f, 0.86f, 64f, 0.5f),
                ButtonSpec("聊天", GlfwKeys.KEY_T, "TAP", 0.86f, 0.54f, 56f, 0.5f),
                ButtonSpec("背包", GlfwKeys.KEY_E, "TAP", 0.94f, 0.44f, 56f, 0.5f),
                ButtonSpec("丢弃", GlfwKeys.KEY_Q, "TAP", 0.78f, 0.44f, 56f, 0.5f),
            ),
            joystick = JoystickSpec(),
        )
    }
}

// ---------------- 纯几何逻辑（JVM 可测，与 Compose 渲染解耦） ----------------

object OverlayGeometry {

    /** 编辑网格间距（px）：拖动/摇杆位置吸附到该网格。 */
    const val GRID_PX = 8f

    /** 像素坐标吸附到 [GRID_PX] 网格。 */
    fun snapToGridPx(px: Float, gridPx: Float = GRID_PX): Float =
        (px / gridPx).roundToInt() * gridPx

    /** 相对坐标（0..1）按屏幕像素宽吸附到网格。屏幕尺寸非法时原样返回。 */
    fun snapAnchorF(anchorF: Float, screenPx: Int, gridPx: Float = GRID_PX): Float {
        if (screenPx <= 0) return anchorF
        return snapToGridPx(anchorF * screenPx, gridPx) / screenPx
    }

    /** 按钮半径（px）：sizeDp * density / 2。 */
    fun buttonRadiusPx(spec: ButtonSpec, density: Float): Float = spec.sizeDp * density / 2f

    /**
     * 两个按钮（圆形）中心距是否小于半径和，即区域重叠。
     * 相切（距离 == 半径和）不算重叠。
     */
    fun buttonsOverlap(
        a: ButtonSpec,
        b: ButtonSpec,
        screenWpx: Int,
        screenHpx: Int,
        density: Float,
    ): Boolean {
        if (screenWpx <= 0 || screenHpx <= 0) return false
        val ax = a.anchorXF * screenWpx
        val ay = a.anchorYF * screenHpx
        val bx = b.anchorXF * screenWpx
        val by = b.anchorYF * screenHpx
        val dist = hypot((ax - bx).toDouble(), (ay - by).toDouble())
        val rSum = buttonRadiusPx(a, density) + buttonRadiusPx(b, density)
        return dist < rSum
    }

    /** 布局中所有存在重叠的按键名集合（红色描边用）。 */
    fun overlappingNames(
        layout: OverlayLayout,
        screenWpx: Int,
        screenHpx: Int,
        density: Float,
    ): Set<String> {
        val result = mutableSetOf<String>()
        val buttons = layout.buttons
        for (i in buttons.indices) {
            for (j in i + 1 until buttons.size) {
                if (buttonsOverlap(buttons[i], buttons[j], screenWpx, screenHpx, density)) {
                    result.add(buttons[i].name)
                    result.add(buttons[j].name)
                }
            }
        }
        return result
    }

    /** 重叠对数量（保存提示用）。 */
    fun overlappingPairCount(
        layout: OverlayLayout,
        screenWpx: Int,
        screenHpx: Int,
        density: Float,
    ): Int {
        var count = 0
        val buttons = layout.buttons
        for (i in buttons.indices) {
            for (j in i + 1 until buttons.size) {
                if (buttonsOverlap(buttons[i], buttons[j], screenWpx, screenHpx, density)) count++
            }
        }
        return count
    }

    /** 在布局中生成不与既有按键重名的唯一名字（追加 2、3…）。 */
    fun uniqueName(layout: OverlayLayout, base: String): String {
        val taken = layout.buttons.map { it.name }.toSet()
        if (base !in taken) return base
        var n = 2
        while ("$base$n" in taken) n++
        return "$base$n"
    }
}

// ---------------- 预设键位表（添加按键用） ----------------

/** 添加按键的预设：分组展示，label 为按钮显示名，code 为 GLFW 键码。 */
data class KeyPreset(val group: String, val label: String, val code: Int)

object KeyPresets {

    val ALL: List<KeyPreset> = buildList {
        // 字母（MC 常用前置，其余字母同码表规律：GLFW = 大写 ASCII）
        for (c in 'A'..'Z') add(KeyPreset("字母", c.toString(), c.code))
        // 数字
        for (n in 1..9) add(KeyPreset("数字", n.toString(), 48 + n))
        add(KeyPreset("数字", "0", 48))
        // 方向键
        add(KeyPreset("方向键", "↑", 265))
        add(KeyPreset("方向键", "↓", 264))
        add(KeyPreset("方向键", "←", 263))
        add(KeyPreset("方向键", "→", 262))
        // 功能键
        add(KeyPreset("功能键", "Space", Keys.SPACE))
        add(KeyPreset("功能键", "Shift", Keys.SHIFT_LEFT))
        add(KeyPreset("功能键", "Ctrl", 341))
        add(KeyPreset("功能键", "Alt", 342))
        add(KeyPreset("功能键", "Tab", 258))
        add(KeyPreset("功能键", "Esc", GlfwKeys.ESCAPE))
        add(KeyPreset("功能键", "Enter", GlfwKeys.KEY_ENTER))
        for (f in 1..12) add(KeyPreset("功能键", "F$f", 289 + f))
    }
}
