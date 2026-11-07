package com.tipcl.android.core.runtime

import java.net.HttpURLConnection
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.zip.GZIPInputStream
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Assume
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

/**
 * JRE 供给端到端实测（真实网络 + 真实发布产物）。
 *
 * 源固定为 Adoptium Temurin 17.0.13+11 的 aarch64 linux JRE（tar.gz），
 * sha256 与官方 .sha256.txt 核对一致后写死，保证复现性。
 * 选它而非 PojavLauncherTeam 的 bionic 构建是因为后者 release 资产全为
 * tar.xz，本模块解包器（无第三方依赖）只支持 tar.gz/zip——如实取舍。
 *
 * 默认跳过（Assume 门控），设 TIPCL_NETTEST=1 才执行，不污染常规回归。
 * 下载/解包结果落在 tipcl.jre.cache.dir（默认 <tmp>/tipcl-jre-e2e），
 * 重复运行第二次 provision 命中本地目录、零下载。
 *
 * 注意：产物是 aarch64 ELF，宿主 x64 Windows 无法执行，故不做
 * `java -version` 实测，按跨架构约定验证文件树完整性
 * （bin/java + lib/modules + release 文件 JAVA_VERSION）。
 */
// 「network」隔离：本类测试靠 Assume 门控跳过（TIPCL_NETTEST=1 才执行）。
// 不用 @Tag 因当前 junit 4.13.2 缓存 jar 缺 org.junit.Tag；类名前缀 E2E 便于 --tests 过滤。
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class JreProvisionE2ETest {

    companion object {
        const val SOURCE_URL =
            "https://github.com/adoptium/temurin17-binaries/releases/download/" +
                "jdk-17.0.13%2B11/OpenJDK17U-jre_aarch64_linux_hotspot_17.0.13_11.tar.gz"
        /** 官方 sha256.txt：OpenJDK17U-jre_aarch64_linux_hotspot_17.0.13_11.tar.gz */
        const val SOURCE_SHA256 = "97c4fb748eaa1292fb2f28fec90a3eba23e35974ef67f8b3aa304ad4db2ba162"
        const val SOURCE_BYTES = 45_432_834L
        const val MAJOR = 17
        const val EXPECTED_JAVA_VERSION = "17.0.13"
        val SOURCE = RuntimeSource(SOURCE_URL, SOURCE_SHA256, MAJOR, "aarch64", "tar.gz")
    }

    /** 缓存根：持久、可重复跑。gradle -Ptipcl.jre.cache.dir=... 覆盖。 */
    private val cacheDir: Path by lazy {
        Paths.get(
            System.getProperty(
                "tipcl.jre.cache.dir",
                Paths.get(System.getProperty("java.io.tmpdir"), "tipcl-jre-e2e").toString(),
            ),
        )
    }

    private fun nettestEnabled(): Boolean =
        System.getenv("TIPCL_NETTEST") == "1" || System.getProperty("tipcl.nettest") == "1"

    private fun newProvider(catalog: LocalRuntimeCatalog): RemoteRuntimeProvider =
        RemoteRuntimeProvider(catalog, listOf(SOURCE), "aarch64", RemoteRuntimeProvider.NOOP)

    /** 跨架构文件树完整性：bin/java + lib/modules + release 的 JAVA_VERSION。 */
    private fun assertTreeComplete(home: Path) {
        assertTrue("bin/java 缺失", Files.isRegularFile(home.resolve("bin").resolve("java")))
        assertTrue("lib/ 结构缺失", Files.isRegularFile(home.resolve("lib").resolve("modules")))
        val major = LocalRuntimeCatalog.releaseFileMajor(home)
        assertEquals("release 文件 major 解析", MAJOR, major)
        val text = home.resolve("release")
            .let { if (Files.exists(it)) String(Files.readAllBytes(it)) else "" }
        assertTrue("JAVA_VERSION 期望 $EXPECTED_JAVA_VERSION", text.contains("""JAVA_VERSION="$EXPECTED_JAVA_VERSION""""))
    }

    @Test
    fun `a1 provision 从真实源下载 sha256 校验 解包并登记全链`() {
        Assume.assumeTrue("set TIPCL_NETTEST=1 to run", nettestEnabled())
        val catalog = LocalRuntimeCatalog(cacheDir)
        val provider = newProvider(catalog)
        val archive = catalog.jreRoot.resolve("archives").resolve("17.tar.gz")

        val t0 = System.currentTimeMillis()
        val home = provider.provision(MAJOR)
        val provisionMs = System.currentTimeMillis() - t0

        assertTrue("provision 返回目录不存在: $home", Files.isDirectory(home))
        assertEquals(SOURCE_BYTES, Files.size(archive))
        Sha256.verify(archive, SOURCE_SHA256) // 不匹配即抛
        assertTreeComplete(home)

        // LocalRuntimeCatalog 扫描/登记全链
        val listed = catalog.list().firstOrNull { it.majorVersion == MAJOR }
        assertEquals("list() 未登记供给目录", home.toString(), listed?.home?.toString())
        assertEquals(home, catalog.provisioned(MAJOR))

        // 可执行位跟踪：解包器必须把 bin/java 记为可执行（Android 侧 chmod 依据）
        val reextract = Files.createTempDirectory("tipcl-ree2e")
        Files.newInputStream(archive).use { raw ->
            java.util.zip.GZIPInputStream(raw).use { gz ->
                val entries = TarExtractor.extract(gz, reextract, stripLeadingDir = true)
                assertTrue(
                    "bin/java 未被标记可执行",
                    TarExtractor.executableRelPaths(entries).any { it == "bin/java" },
                )
                assertTrue(
                    "entry 名应与落盘布局一致（strip 顶层目录）",
                    entries.any { it.name == "bin/java" },
                )
            }
        }
        reextract.toFile().deleteRecursively()

        // 第二次供给：命中已就绪目录，归档 mtime 不变 = 零下载
        val mtimeBefore = Files.getLastModifiedTime(archive)
        val t1 = System.currentTimeMillis()
        val home2 = provider.provision(MAJOR)
        val cachedMs = System.currentTimeMillis() - t1
        assertEquals(home, home2)
        assertEquals("第二次供给发生了重新下载", mtimeBefore, Files.getLastModifiedTime(archive))
        assertTrue("缓存命中不应耗时 ${cachedMs}ms", cachedMs < 10_000)

        // 清理链：伪造损坏目录，cleanupCorrupt 必须清掉且不误伤有效供给
        val corrupt = catalog.jreRoot.resolve("9")
        Files.createDirectories(corrupt)
        val removed = catalog.cleanupCorrupt()
        assertTrue("损坏目录未被清理: $removed", corrupt in removed)
        assertFalse(Files.exists(corrupt))
        assertEquals(home, catalog.provisioned(MAJOR))
    }

    @Test
    fun `a2 断点续传 从真实源以 Range 续完剩余字节`() {
        Assume.assumeTrue("set TIPCL_NETTEST=1 to run", nettestEnabled())
        Assume.assumeTrue(
            "依赖 a1 已缓存归档作为续传种子",
            Files.isRegularFile(LocalRuntimeCatalog(cacheDir).jreRoot.resolve("archives").resolve("17.tar.gz")),
        )
        val catalog = LocalRuntimeCatalog(cacheDir)
        val dest = catalog.jreRoot.resolve("archives").resolve("resume-check.tar.gz")
        val part = dest.resolveSibling("resume-check.tar.gz.part")

        // 种子：取已缓存归档的前 (total-1MB) 字节 → 续传只需从真网拉最后 1MB
        val cached = catalog.jreRoot.resolve("archives").resolve("17.tar.gz")
        val seedLen = SOURCE_BYTES - 1_000_000
        Files.deleteIfExists(part) // 上次失败残留
        Files.createDirectories(part.parent)
        Files.newInputStream(cached).use { input ->
            Files.newByteChannel(
                part,
                StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING,
            ).use { ch ->
                val buf = ByteArray(65536)
                var remaining = seedLen
                while (remaining > 0) {
                    val n = input.read(buf, 0, minOf(buf.size.toLong(), remaining.toLong()).toInt())
                    check(n > 0)
                    ch.write(java.nio.ByteBuffer.wrap(buf, 0, n))
                    remaining -= n
                }
            }
        }

        val t0 = System.currentTimeMillis()
        newProvider(catalog).downloadWithResume(SOURCE_URL, dest)
        val ms = System.currentTimeMillis() - t0

        assertEquals(SOURCE_BYTES, Files.size(dest))
        Sha256.verify(dest, SOURCE_SHA256) // 续传拼接后整档校验
        assertFalse(".part 应被移走", Files.exists(part))
        Files.deleteIfExists(dest) // 校验完即清，不占缓存
        // ms 仅供 NOTES 记录：断言只保证功能正确
        assertNotEquals(0L, ms)
    }
}
