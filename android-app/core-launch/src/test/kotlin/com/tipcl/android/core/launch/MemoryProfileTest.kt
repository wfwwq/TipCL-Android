package com.tipcl.android.core.launch

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MemoryProfileTest {

    // ---------- 档位边界 ----------

    @Test
    fun `2999MB falls into disabled tier`() {
        val p = MemoryProfile.of(2999)
        assertEquals(MemoryTier.DISABLED, p.tier)
        assertEquals(512, p.recommendedMinMb)
        assertEquals(1024, p.recommendedMaxMb)
        assertTrue(p.notes.any { it.level == MemoryNote.Level.WARNING && it.message.contains("最低") })
    }

    @Test
    fun `3072MB is exactly 3GB so still disabled`() {
        val p = MemoryProfile.of(3072)
        assertEquals(MemoryTier.DISABLED, p.tier)
        assertEquals(512, p.recommendedMinMb)
        assertEquals(1024, p.recommendedMaxMb)
    }

    @Test
    fun `4096MB is 4GB tier with cap downgrade`() {
        val p = MemoryProfile.of(4096)
        assertEquals(MemoryTier.LOW, p.tier)
        assertEquals(1024, p.recommendedMinMb)
        // 推荐上限 2048 超过 4096 * 0.45 = 1843，自动下调
        assertEquals(1843, p.recommendedMaxMb)
        assertTrue(p.notes.any { it.message.contains("45%") })
    }

    @Test
    fun `6144MB is 6GB tier`() {
        val p = MemoryProfile.of(6144)
        assertEquals(MemoryTier.MID, p.tier)
        assertEquals(1536, p.recommendedMinMb)
        // 2560 <= 6144 * 0.45 = 2764，无需下调
        assertEquals(2560, p.recommendedMaxMb)
    }

    @Test
    fun `8192MB is 8GB tier with cap downgrade`() {
        val p = MemoryProfile.of(8192)
        assertEquals(MemoryTier.HIGH, p.tier)
        assertEquals(2048, p.recommendedMinMb)
        // 4096 超过 8192 * 0.45 = 3686，自动下调
        assertEquals(3686, p.recommendedMaxMb)
        assertTrue(p.notes.isNotEmpty())
    }

    @Test
    fun `16384MB high tier keeps recommended 4096`() {
        val p = MemoryProfile.of(16384)
        assertEquals(MemoryTier.HIGH, p.tier)
        assertEquals(2048, p.recommendedMinMb)
        assertEquals(4096, p.recommendedMaxMb)
        assertTrue(p.notes.none { it.message.contains("下调") })
    }

    @Test
    fun `extremely small device clamps min to cap`() {
        val p = MemoryProfile.of(1024)
        assertEquals(MemoryTier.DISABLED, p.tier)
        // cap = 1024 * 0.45 = 460
        assertEquals(460, p.recommendedMaxMb)
        assertEquals(460, p.recommendedMinMb)
    }

    @Test
    fun `non-positive total memory is rejected`() {
        val ex = try {
            MemoryProfile.of(0)
            null
        } catch (e: IllegalArgumentException) {
            e
        }
        assertTrue(ex != null)
    }

    // ---------- LaunchOptions.forDevice ----------

    @Test
    fun `no override uses recommended values and carries notes`() {
        val o = LaunchOptions.forDevice(6144)
        assertEquals(1536, o.minMemoryMb)
        assertEquals(2560, o.maxMemoryMb)
        assertTrue(o.memoryNotes.none { it.level == MemoryNote.Level.WARNING })
    }

    @Test
    fun `no override on disabled device carries warning note`() {
        val o = LaunchOptions.forDevice(2999)
        assertEquals(512, o.minMemoryMb)
        assertEquals(1024, o.maxMemoryMb)
        assertTrue(o.memoryNotes.any { it.level == MemoryNote.Level.WARNING })
    }

    @Test
    fun `user override takes priority when within 60 percent cap`() {
        val o = LaunchOptions.forDevice(8192, userOverride = 1024 to 3000)
        assertEquals(1024, o.minMemoryMb)
        assertEquals(3000, o.maxMemoryMb)
        // 3000 <= 8192 * 0.6 = 4915，无警告
        assertTrue(o.memoryNotes.none { it.level == MemoryNote.Level.WARNING })
    }

    @Test
    fun `user override above 60 percent is clamped with warning`() {
        val o = LaunchOptions.forDevice(8192, userOverride = 2048 to 6000)
        // 8192 * 0.6 = 4915
        assertEquals(4915, o.maxMemoryMb)
        assertEquals(2048, o.minMemoryMb)
        val warn = o.memoryNotes.filter { it.level == MemoryNote.Level.WARNING }
        assertTrue(warn.any { it.message.contains("60%") && it.message.contains("4915") })
    }

    @Test
    fun `user override min larger than clamped max is pulled down`() {
        val o = LaunchOptions.forDevice(4096, userOverride = 3000 to 4000)
        // cap = 4096 * 0.6 = 2457；min 3000 > 2457 → 一并下调
        assertEquals(2457, o.maxMemoryMb)
        assertEquals(2457, o.minMemoryMb)
        assertTrue(o.memoryNotes.count { it.level == MemoryNote.Level.WARNING } >= 2)
    }

    @Test
    fun `user override on disabled device still allowed with device warning`() {
        val o = LaunchOptions.forDevice(3072, userOverride = 512 to 1024)
        assertEquals(MemoryTier.DISABLED, MemoryProfile.of(3072).tier)
        assertEquals(512, o.minMemoryMb)
        assertEquals(1024, o.maxMemoryMb)
        assertTrue(o.memoryNotes.any { it.message.contains("1.20.1") })
    }

    @Test
    fun `forDevice rejects non-positive memory values`() {
        listOf(0, -1).forEach { total ->
            val ex = try {
                LaunchOptions.forDevice(total)
                null
            } catch (e: IllegalArgumentException) {
                e
            }
            assertTrue(ex != null, "totalMemMB=$total 应被拒绝")
        }
        val ex = try {
            LaunchOptions.forDevice(8192, userOverride = 0 to 1024)
            null
        } catch (e: IllegalArgumentException) {
            e
        }
        assertTrue(ex != null)
    }
}
