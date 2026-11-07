package com.tipcl.android.core.runtime

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

/** JreSourceCatalog 目录结构与 CatalogService 选择逻辑（纯内存，无网络）。 */
class JreSourceCatalogTest {

    private val service = CatalogService()

    // ---- 目录结构完整性 ----

    @Test
    fun `tier1 覆盖矩阵完整 8-17-21 × aarch64-x86_64`() {
        for (major in JreSourceCatalog.REQUIRED_MAJORS) {
            for (arch in JreSourceCatalog.REQUIRED_ARCHES) {
                val entry = JreSourceCatalog.ALL.firstOrNull {
                    it.tier == JreSourceTier.ADOPTIUM &&
                        it.majorVersion == major && it.arch == arch
                }
                assertNotNull("Tier1 缺档位 $major/$arch", entry)
                entry!!
                assertTrue("Tier1 $major/$arch sha256 未钉", entry.sha256Pinned)
                assertTrue("Tier1 $major/$arch sha256 为空", entry.sha256.isNotEmpty())
                assertTrue("Tier1 $major/$arch sha256 应为 64 位 hex",
                    entry.sha256.matches(Regex("[0-9a-f]{64}")))
                assertTrue("Tier1 $major/$arch 应被解包器支持", entry.supportedByUnpacker)
                assertEquals("tar.gz", entry.format)
                assertTrue("Tier1 $major/$arch 应记录字节数", entry.bytes > 0)
            }
        }
    }

    @Test
    fun `所有 url 均为 https 直链且无占位符残留`() {
        for (e in JreSourceCatalog.ALL) {
            assertTrue("非 https: ${e.url}", e.url.startsWith("https://"))
            assertFalse("url 含 TODO 占位: ${e.url}", e.url.contains("TODO"))
            assertTrue("url 含花括号模板未展开: ${e.url}", !e.url.contains('{'))
        }
    }

    @Test
    fun `17 aarch64 tier1 与已实测 E2E 常量一致`() {
        val entry = JreSourceCatalog.ALL.first {
            it.tier == JreSourceTier.ADOPTIUM && it.majorVersion == 17 && it.arch == "aarch64"
        }
        assertEquals(JreProvisionE2ETest.SOURCE_URL, entry.url)
        assertEquals(JreProvisionE2ETest.SOURCE_SHA256, entry.sha256)
        assertEquals(JreProvisionE2ETest.SOURCE_BYTES, entry.bytes)
    }

    @Test
    fun `每个 tier1 档位都有 bionic 备用来源或已注明缺口`() {
        // 备用层的定位：收录了 Pojav 8/arm64、17 两 arch；Termux 21 两 arch；
        // 已证实的缺口（Pojav 无 21、termux 无 8/17）在 note 中如实记录。
        val pojav = JreSourceCatalog.ALL.filter { it.tier == JreSourceTier.POJAV }
        assertTrue(pojav.any { it.majorVersion == 8 && it.arch == "aarch64" })
        assertTrue(pojav.any { it.majorVersion == 17 && it.arch == "aarch64" })
        assertTrue(pojav.any { it.majorVersion == 17 && it.arch == "x86_64" })
        assertTrue("Pojav 备用源 sha256 应为空(待实测钉)", pojav.all { it.sha256.isEmpty() })
        val termux = JreSourceCatalog.ALL.filter { it.tier == JreSourceTier.TERMUX }
        assertTrue(termux.any { it.majorVersion == 21 && it.arch == "aarch64" })
        assertTrue(termux.any { it.majorVersion == 21 && it.arch == "x86_64" })
    }

    // ---- 选择逻辑 ----

    @Test
    fun `sourceFor 返回 tier1 首选且字段正确`() {
        val s = service.sourceFor(17, "aarch64")
        assertNotNull(s)
        s!!
        assertEquals(17, s.majorVersion)
        assertEquals("aarch64", s.arch)
        assertEquals("tar.gz", s.format)
        assertEquals(JreProvisionE2ETest.SOURCE_SHA256, s.sha256)
    }

    @Test
    fun `sourceFor 接受 Android ABI 别名与大小写`() {
        assertEquals(
            service.sourceFor(21, "aarch64"),
            service.sourceFor(21, "arm64-v8a"),
        )
        assertEquals(
            service.sourceFor(21, "aarch64"),
            service.sourceFor(21, "ARM64-V8A"),
        )
        assertEquals(
            service.sourceFor(8, "x86_64"),
            service.sourceFor(8, "x64"),
        )
        assertEquals(
            service.sourceFor(8, "x86_64"),
            service.sourceFor(8, "AMD64"),
        )
    }

    @Test
    fun `toRuntimeSource 只放行 已钉sha256 且解包器支持的条目`() {
        for (e in JreSourceCatalog.ALL) {
            val rs = e.toRuntimeSource()
            if (e.sha256Pinned && e.supportedByUnpacker) {
                assertNotNull("tier1 应可转 RuntimeSource: $e", rs)
            } else {
                assertNull("备用源(未钉/未支持)不得放行: ${e.tier} ${e.majorVersion}", rs)
            }
        }
    }

    @Test
    fun `自定义目录可用自定义清单`() {
        val custom = listOf(
            JreSourceEntry(
                JreSourceTier.ADOPTIUM, 25, "aarch64", "arm64-v8a",
                "https://example.invalid/jre25.tar.gz",
                "", // sha256 未钉
                "tar.gz", sha256Pinned = false, supportedByUnpacker = true,
            ),
        )
        val svc = CatalogService(custom)
        assertNull("未钉 sha256 不放行", svc.sourceFor(25, "arm64-v8a"))
        try {
            svc.requireSource(25, "arm64-v8a")
            fail("requireSource 应抛 JreSourceUnavailableException")
        } catch (e: JreSourceUnavailableException) {
            assertTrue(e.message!!.contains("暂缺"))
        }
    }

    // ---- 缺失档位错误 ----

    @Test
    fun `缺失档位 sourceFor 返回 null 且错误文案可读`() {
        assertNull(service.sourceFor(25, "aarch64"))
        assertNull(service.sourceFor(11, "x86_64"))
        val msg = service.unavailableMessage(25, "arm64-v8a")
        assertTrue("应含'暂缺': $msg", msg.contains("暂缺"))
        assertTrue("应含 major: $msg", msg.contains("25"))
        assertTrue("应含 ABI: $msg", msg.contains("arm64-v8a"))
        assertTrue("应列已收录档位: $msg", msg.contains("17/arm64-v8a"))
    }

    @Test
    fun `未知 arch 也能给出安全响应`() {
        assertNull(service.sourceFor(17, "mips"))
        val msg = service.unavailableMessage(17, "mips")
        assertTrue(msg.contains("暂缺"))
    }
}
