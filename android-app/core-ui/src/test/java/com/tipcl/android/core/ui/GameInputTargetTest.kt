package com.tipcl.android.core.ui

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * GameInputTarget.postKey 重载兼容性：
 * - 既有两参覆写不受四参重载影响（app 层适配器无需跟随修改）；
 * - 四参调用走默认实现时降级为两参 postKey。
 */
class GameInputTargetTest {

    /** 只覆写两参 postKey 的目标：模拟既有实现方（如 app 层适配器）。 */
    private class LegacyTarget : GameInputTarget {
        val keys = mutableListOf<Pair<Int, Boolean>>()

        override fun postKey(code: Int, press: Boolean) {
            keys.add(code to press)
        }

        override fun postChar(char: Char) = Unit
        override fun postCursorDelta(dx: Float, dy: Float) = Unit
        override fun postMouseButton(mouseButton: Int, press: Boolean) = Unit
    }

    /** 覆写四参 postKey 的目标：需要精确 mods/repeat 语义的实现方。 */
    private class FullTarget : GameInputTarget {
        data class Key(val code: Int, val press: Boolean, val mods: Int, val repeat: Boolean)

        val keys = mutableListOf<Key>()

        override fun postKey(code: Int, press: Boolean) = postKey(code, press, 0, false)

        override fun postKey(code: Int, press: Boolean, mods: Int, repeat: Boolean) {
            keys.add(Key(code, press, mods, repeat))
        }

        override fun postChar(char: Char) = Unit
        override fun postCursorDelta(dx: Float, dy: Float) = Unit
        override fun postMouseButton(mouseButton: Int, press: Boolean) = Unit
    }

    @Test
    fun legacyTwoParamOverride_stillCompiles_andReceivesTwoParamCalls() {
        val target = LegacyTarget()
        target.postKey(GlfwKeys.KEY_T, true)
        target.postKey(GlfwKeys.KEY_T, false)
        assertEquals(
            listOf(GlfwKeys.KEY_T to true, GlfwKeys.KEY_T to false),
            target.keys,
        )
    }

    @Test
    fun fourParamCall_withDefaults_degradesToTwoParamPostKey() {
        val target = LegacyTarget()
        // 四参重载（含默认值）在 LegacyTarget 上走默认实现 → 转发两参 postKey。
        target.postKey(87, true, mods = 0, repeat = false)
        target.postKey(87, false, mods = 0x0001, repeat = true) // 默认实现忽略 mods/repeat
        assertEquals(listOf(87 to true, 87 to false), target.keys)
    }

    @Test
    fun fullOverride_receivesModsAndRepeat() {
        val target = FullTarget()
        target.postKey(340, true, mods = 0x0001, repeat = false)
        target.postKey(340, true, mods = 0x0001, repeat = true)
        assertEquals(2, target.keys.size)
        assertEquals(0x0001, target.keys[0].mods)
        assertEquals(false, target.keys[0].repeat)
        assertEquals(true, target.keys[1].repeat)
    }

    @Test
    fun twoParamCallSite_resolvesToTwoParamOverload_notFourParamDefault() {
        // 与既有调用方（TextInputController / OverlayInputPipeline）同形的调用：
        // 必须命中两参重载而非经四参默认实现绕一圈。
        val target = LegacyTarget()
        val targetRef: GameInputTarget = target
        targetRef.postKey(GlfwKeys.ESCAPE, true)
        assertEquals(listOf(GlfwKeys.ESCAPE to true), target.keys)
        assertTrue(target.keys.isNotEmpty())
    }
}
