package com.tipcl.android.core.ui

import kotlin.math.roundToInt
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/** 网格吸附与按键重叠检测（纯 JVM 几何逻辑）。 */
class OverlayGeometryTest {

    // ---------------- 网格吸附 ----------------

    @Test
    fun snapToGridPxSnapsToMultiplesOf8() {
        assertEquals(0f, OverlayGeometry.snapToGridPx(3.9f))
        assertEquals(8f, OverlayGeometry.snapToGridPx(4.0f))
        assertEquals(8f, OverlayGeometry.snapToGridPx(7.9f))
        assertEquals(16f, OverlayGeometry.snapToGridPx(12f))
        // 100/8=12.5，round-half-up 取 13 → 104。
        assertEquals(104f, OverlayGeometry.snapToGridPx(100f))
    }

    @Test
    fun snapAnchorFUsesPixelGrid() {
        // 屏宽 1080px，网格 8px：anchor 0.5 → 540px → 544px（68*8）→ 544/1080。
        assertEquals(544f / 1080f, OverlayGeometry.snapAnchorF(0.5f, 1080), 1e-6f)
        // 非法屏幕尺寸原样返回。
        assertEquals(0.5f, OverlayGeometry.snapAnchorF(0.5f, 0))
    }

    @Test
    fun snapAnchorFIdempotent() {
        val snapped = OverlayGeometry.snapAnchorF(0.3721f, 2400)
        assertEquals(snapped, OverlayGeometry.snapAnchorF(snapped, 2400))
        assertTrue(kotlin.math.abs(snapped - 0.3721f) * 2400 <= OverlayGeometry.GRID_PX / 2f + 0.01f)
    }

    // ---------------- 重叠检测 ----------------

    private val w = 1080
    private val h = 2400
    private val density = 3f

    @Test
    fun overlappingButtonsDetected() {
        // 直径 60dp * 3 = 180px，半径 90px；中心距 100px < 180 → 重叠。
        val a = ButtonSpec("A", 65, "TAP", 0.5f, 0.5f, 60f, 0.5f)
        val b = ButtonSpec("B", 66, "TAP", 0.5f + 100f / w, 0.5f, 60f, 0.5f)
        assertTrue(OverlayGeometry.buttonsOverlap(a, b, w, h, density))
    }

    @Test
    fun touchingButtonsDoNotOverlap() {
        // 中心距恰为半径和（180px）→ 相切不算重叠。
        val a = ButtonSpec("A", 65, "TAP", 0.5f, 0.5f, 60f, 0.5f)
        val b = ButtonSpec("B", 66, "TAP", 0.5f + 180f / w, 0.5f, 60f, 0.5f)
        assertFalse(OverlayGeometry.buttonsOverlap(a, b, w, h, density))
    }

    @Test
    fun distantButtonsDoNotOverlap() {
        val a = ButtonSpec("A", 65, "TAP", 0.1f, 0.1f, 60f, 0.5f)
        val b = ButtonSpec("B", 66, "TAP", 0.9f, 0.9f, 60f, 0.5f)
        assertFalse(OverlayGeometry.buttonsOverlap(a, b, w, h, density))
    }

    @Test
    fun overlappingNamesCoversAllMembersOfPairs() {
        val layout = OverlayLayout(
            buttons = listOf(
                ButtonSpec("A", 65, "TAP", 0.5f, 0.5f, 60f, 0.5f),
                ButtonSpec("B", 66, "TAP", 0.52f, 0.5f, 60f, 0.5f),
                ButtonSpec("C", 67, "TAP", 0.9f, 0.9f, 60f, 0.5f),
            ),
        )
        assertEquals(setOf("A", "B"), OverlayGeometry.overlappingNames(layout, w, h, density))
        assertEquals(1, OverlayGeometry.overlappingPairCount(layout, w, h, density))
    }

    @Test
    fun defaultLayoutHasNoConflicts() {
        assertEquals(0, OverlayGeometry.overlappingPairCount(OverlayLayout.default(), w, h, density))
    }

    // ---------------- 唯一命名 ----------------

    @Test
    fun uniqueNameAppendsSuffixOnCollision() {
        val layout = OverlayLayout(
            buttons = listOf(ButtonSpec("A", 65, "TAP", 0.5f, 0.5f, 56f, 0.5f)),
        )
        assertEquals("A2", OverlayGeometry.uniqueName(layout, "A"))
        assertEquals("B", OverlayGeometry.uniqueName(layout, "B"))
    }
}
