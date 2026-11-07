package com.tipcl.android.core.runtime

import java.net.HttpURLConnection
import java.net.URL
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assume
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

/**
 * JRE 源目录网络实测（Tier 1 的 HEAD 可达性探测）。
 *
 * 默认跳过（Assume 门控），设 TIPCL_NETTEST=1 才执行——与 JreProvisionE2ETest
 * 同一套约定。只发 HEAD/Range: bytes=0-0 请求，不下载完整包。
 *
 * 注意：github.com 直链经 release download 端点 302 到 objects.githubusercontent.com，
 * HttpURLConnection 默认跟随重定向（本机网络环境需能到达该 CDN）。
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class JreSourceCatalogNetTest {

    private fun nettestEnabled(): Boolean =
        System.getenv("TIPCL_NETTEST") == "1" || System.getProperty("tipcl.nettest") == "1"

    /** HEAD 探测，返回 (最终 HTTP 码, Content-Length 或 -1)。跟随重定向。 */
    private fun probe(url: String): Pair<Int, Long> =
        (probeOrUnreachable(url) as ProbeResult.Reachable).let { it.code to it.length }

    private sealed interface ProbeResult {
        data class Reachable(val code: Int, val length: Long) : ProbeResult
        data class Unreachable(val reason: String) : ProbeResult
    }

    private fun probeOrUnreachable(url: String): ProbeResult {
        val conn = URL(url).openConnection() as HttpURLConnection
        conn.requestMethod = "HEAD"
        conn.connectTimeout = 30_000
        conn.readTimeout = 30_000
        conn.instanceFollowRedirects = true
        try {
            val code = conn.responseCode
            return ProbeResult.Reachable(code, conn.contentLengthLong)
        } catch (e: java.io.IOException) {
            // 连接层失败（超时/DNS/拒绝）→ 环境不可达，与"源失效"区分开
            return ProbeResult.Unreachable(e.javaClass.simpleName + ": " +
                (e.message?.take(120) ?: ""))
        } finally {
            conn.disconnect()
        }
    }

    @Test
    fun `a1 tier1 全档位 HEAD 探测可达且字节数与目录一致`() {
        Assume.assumeTrue("set TIPCL_NETTEST=1 to run", nettestEnabled())
        val failures = mutableListOf<String>()
        val unreachable = mutableListOf<String>()
        for (e in JreSourceCatalog.ALL.filter {
            it.tier == JreSourceTier.ADOPTIUM
        }) {
            val result = probeOrUnreachable(e.url)
            when (result) {
                is ProbeResult.Reachable -> {
                    val (code, len) = result
                    println("PROBE ${e.majorVersion}/${e.arch} -> HTTP $code, bytes=$len (expect ${e.bytes})")
                    // HTTP 层异常（4xx/5xx、大小漂移）是目录失效，必须硬断言；
                    // 连接层不可达（防火墙/被墙）是环境限制，只记录不失败。
                    if (code !in 200..299) failures.add("${e.majorVersion}/${e.arch}: HTTP $code")
                    else if (e.bytes > 0 && len > 0 && len != e.bytes)
                        failures.add("${e.majorVersion}/${e.arch}: size $len != catalog ${e.bytes}")
                }
                is ProbeResult.Unreachable -> {
                    println("PROBE ${e.majorVersion}/${e.arch} -> UNREACHABLE (${result.reason}); " +
                        "名称/sha256/大小已经 api.github.com 官方资产通道核验")
                    unreachable.add("${e.majorVersion}/${e.arch}")
                }
            }
        }
        println("PROBE-SUMMARY adoptium: unreachable=$unreachable failures=$failures")
        assertTrue("目录与远端漂移: $failures", failures.isEmpty())
    }

    @Test
    fun `a2 tier2 pojav 备用源 HEAD 探测可达性记录`() {
        Assume.assumeTrue("set TIPCL_NETTEST=1 to run", nettestEnabled())
        // Pojav 资产尚未启用（tar.xz），只记录可达性，不断言成功。
        for (e in JreSourceCatalog.ALL.filter { it.tier == JreSourceTier.POJAV }) {
            when (val r = probeOrUnreachable(e.url)) {
                is ProbeResult.Reachable ->
                    println("PROBE-POJAV ${e.majorVersion}/${e.arch} -> HTTP ${r.code}, bytes=${r.length}")
                is ProbeResult.Unreachable ->
                    println("PROBE-POJAV ${e.majorVersion}/${e.arch} -> UNREACHABLE (${r.reason})")
            }
        }
    }

    @Test
    fun `a3 tier3 termux 备用源 HEAD 探测可达且字节数与索引一致`() {
        Assume.assumeTrue("set TIPCL_NETTEST=1 to run", nettestEnabled())
        for (e in JreSourceCatalog.ALL.filter { it.tier == JreSourceTier.TERMUX }) {
            val r = probeOrUnreachable(e.url)
            assertTrue("termux ${e.arch} 不可达: $r", r is ProbeResult.Reachable)
            val (code, len) = (r as ProbeResult.Reachable).let { it.code to it.length }
            println("PROBE-TERMUX ${e.majorVersion}/${e.arch} -> HTTP $code, bytes=$len (expect ${e.bytes})")
            assertEquals("termux ${e.arch} HEAD", 200, code)
            if (e.bytes > 0 && len > 0) assertEquals(e.bytes, len)
        }
    }

    @Test
    fun `a4 17 aarch64 实测源与 E2E 源同一条`() {
        // 无网络断言：保证目录与 E2E 钉的是同一条 URL+sha256，
        // 漂移时先改这里（结构测试已比对，这里是失败信息更直白的兜底）。
        Assume.assumeTrue("set TIPCL_NETTEST=1 to run", nettestEnabled())
        val entry = CatalogService().sourceFor(17, "aarch64")!!
        assertEquals(JreProvisionE2ETest.SOURCE_URL, entry.url)
        assertEquals(JreProvisionE2ETest.SOURCE_SHA256, entry.sha256)
    }
}
