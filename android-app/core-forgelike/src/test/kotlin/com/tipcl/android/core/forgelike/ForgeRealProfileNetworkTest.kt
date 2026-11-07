package com.tipcl.android.core.forgelike

import java.io.File
import java.security.MessageDigest
import org.junit.jupiter.api.Tag
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * 真实 Forge installer 实测（M4.5，NETTEST.md 记录结论）：
 *
 * 下载 Forge 1.20.1 推荐版（47.4.28）官方 installer jar，从 jar 内解出
 * install_profile.json / version.json，验证 [ForgeInstaller] 的解析与任务展开、
 * [ProcessorRunner] 的命令组装（DryRun，不真跑 processor 工具链）。
 *
 * 全部用例打 @Tag("network")：默认 `test` 任务排除该 tag，不跑网络；
 * 手动 `gradle :core-forgelike:networkTest` 执行。installer jar 缓存于
 * `tools/forge-cache/`，已存在且 sha256 匹配时零网络流量。
 */
@Tag("network")
class ForgeRealProfileNetworkTest {

    companion object {
        const val FORGE_VERSION = "1.20.1-47.4.28"
        const val INSTALLER_URL =
            "https://maven.minecraftforge.net/net/minecraftforge/forge/$FORGE_VERSION/forge-$FORGE_VERSION-installer.jar"
        const val INSTALLER_SHA256 = "d615397a6b2f1e99d4b454e2db2b4ca2e94be91d5e0243c8c7e023d965db39e7"

        /** data 表之外的运行期特殊键（官方 installer 语义，由安装器注入而非 profile 声明）。 */
        val SPECIAL_KEYS = setOf("ROOT", "SIDE", "INSTALLER", "MINECRAFT_JAR")
    }

    private class FixedJavaLocator(val path: String = "/fake/jre/bin/java") : HostJavaLocator {
        override fun locate(): String? = path
    }

    /** 定位 tools/forge-cache（从测试工作目录向上找项目根）。 */
    private fun cacheDir(): File {
        var dir = File(System.getProperty("user.dir")).absoluteFile
        repeat(4) {
            val candidate = File(dir, "tools/forge-cache")
            if (candidate.isDirectory) return candidate
            dir = dir.parentFile ?: return@repeat
        }
        return File(File(System.getProperty("user.dir")), "tools/forge-cache").apply { mkdirs() }
    }

    /** 取 installer jar：缓存命中且 sha256 匹配则零下载，否则按官方 maven URL 拉取。 */
    private fun ensureInstallerJar(): File {
        val cache = cacheDir()
        val jar = File(cache, "forge-$FORGE_VERSION-installer.jar")
        if (jar.isFile && sha256(jar) == INSTALLER_SHA256) return jar
        UrlDownloader.download(INSTALLER_URL, jar)
        assertEquals(INSTALLER_SHA256, sha256(jar), "installer jar sha256 不匹配")
        return jar
    }

    private fun sha256(file: File): String {
        val md = MessageDigest.getInstance("SHA-256")
        file.inputStream().use { input ->
            val buf = ByteArray(8192)
            while (true) {
                val n = input.read(buf)
                if (n <= 0) break
                md.update(buf, 0, n)
            }
        }
        return md.digest().joinToString("") { "%02x".format(it) }
    }

    private fun readJarEntry(jar: File, entry: String): String =
        java.util.jar.JarFile(jar).use { jf ->
            jf.getInputStream(jf.getJarEntry(entry)).readBytes().decodeToString()
        }

    @Test
    fun `真实 installer jar 解析 install_profile 并展开任务清单`() {
        val installerJar = ensureInstallerJar()
        val installer = ForgeInstaller()

        val profileText = readJarEntry(installerJar, "install_profile.json")
        val profile = installer.parseInstallProfile(profileText)

        // 真实 profile 概况（1.20.1-47.4.28 实测值，NETTEST.md 同步记录）。
        assertEquals("1.20.1", profile.minecraft)
        assertEquals("1.20.1-forge-47.4.28", profile.version)
        assertEquals(10, profile.processors.size)
        assertEquals(36, profile.libraries.size)
        assertEquals(13, profile.data.size)
        // 新式 spec 1 libraries：无 url/clientreq，全带 downloads.artifact 元数据。
        assertTrue(profile.libraries.all { it.url == null && it.clientreq == null })
        assertTrue(profile.libraries.all { it.downloads?.artifact?.url != null })
        assertTrue(profile.libraries.all { it.downloads?.artifact?.sha1?.length == 40 })

        // 任务展开：client 侧过滤 + 数量与占位符完备性。
        val tasks = installer.buildPendingTasks(profile)
        val expectedProcessors = profile.processors
            .filter { it.sides == null || "client" in it.sides }
        assertTrue(expectedProcessors.isNotEmpty())
        val runProcessorTasks = tasks.filterIsInstance<ForgePendingTask.RunProcessor>()
        assertEquals(expectedProcessors.size, runProcessorTasks.size)
        assertEquals(6, runProcessorTasks.size, "client 侧应保留 6 个 processor（4 个 server-only 被过滤）")
        assertTrue(tasks.filterIsInstance<ForgePendingTask.DownloadLibrary>().size == 36)
        assertTrue(tasks.last() is ForgePendingTask.FinalizeVersionJson)
        assertEquals(
            "1.20.1-forge-47.4.28",
            (tasks.last() as ForgePendingTask.FinalizeVersionJson).newId,
            "新式 profile 的 version 已含 forge 全名，不应重复拼前缀",
        )
        // 每个 RunProcessor 的关键信息非空。
        runProcessorTasks.forEach { task ->
            assertTrue(task.mainArtifact.isNotBlank())
            assertTrue(task.args.isNotEmpty())
            assertTrue(task.classpath.isNotEmpty())
        }
        // server-only processor 确实被过滤：按 args 全列表比对（同构件可被多侧复用，
        // 如 installertools 既服务 server 也服务 client，不能按 jar 坐标判断）。
        val keptArgSets = runProcessorTasks.map { it.args }.toSet()
        profile.processors.filter { it.sides == listOf("server") }.forEach {
            assertTrue(it.args.toList() !in keptArgSets, "server-only processor 未被过滤: ${it.args.firstOrNull()}")
        }

        // args/outputs 中出现的 {KEY} 必须能被 data 表 + 运行期特殊键覆盖。
        val placeholderRegex = Regex("\\{([A-Za-z0-9_.]+)}")
        val knownKeys = profile.data.keys + SPECIAL_KEYS
        runProcessorTasks.forEach { task ->
            (task.args + task.outputs.keys + task.outputs.values).forEach { raw ->
                placeholderRegex.findAll(raw).forEach { m ->
                    assertTrue(
                        m.groupValues[1] in knownKeys,
                        "占位符 {${m.groupValues[1]}} 不在 data 表/特殊键中",
                    )
                }
            }
        }
    }

    @Test
    fun `ProcessorRunner DryRun 组装前两个 client processor 命令`() {
        val installerJar = ensureInstallerJar()
        val installer = ForgeInstaller()
        val profile = installer.parseInstallProfile(readJarEntry(installerJar, "install_profile.json"))
        val tasks = installer.buildPendingTasks(profile)
            .filterIsInstance<ForgePendingTask.RunProcessor>()

        val tmp = createTempDir(prefix = "tipcl-forge-nettest")
        try {
            val work = File(tmp, "work").apply { mkdirs() }
            // data 表 client 侧取值 + 运行期特殊键（ROOT/INSTALLER/MINECRAFT_JAR/SIDE）。
            val data = profile.data.mapValues { it.value.client } + mapOf(
                "SIDE" to "client",
                "ROOT" to work.absolutePath,
                "INSTALLER" to installerJar.absolutePath,
                // 真实安装中为原版 client jar 路径；DryRun 不真跑，占位路径即可。
                "MINECRAFT_JAR" to File(work, "minecraft-client.jar").path,
            )
            val sink = DryRunCommandSink()
            val runner = ProcessorRunner(
                javaLocator = FixedJavaLocator(),
                libraryDir = File(tmp, "libraries"),
                workingDir = work,
                data = data,
                commandSink = sink,
            )

            // DryRun：只干跑前 2 个 client processor（均为 outputs 为空的 installertools，
            // 命令组装即完成；后面的 processor 带 outputs 产物校验，DryRun 不产出真产物）。
            tasks.take(2).forEach { runner.run(it) }
            assertEquals(2, sink.recorded.size)

            // 前 2 个 client processor（实测）：MCP_DATA 与 DOWNLOAD_MOJMAPS（installertools）。
            val first2 = tasks.take(2)
            assertEquals(2, sink.recorded.size)
            first2.zip(sink.recorded).forEach { (task, recorded) ->
                val (command, cwd) = recorded
                assertEquals(work.absoluteFile, cwd.absoluteFile)
                assertEquals("/fake/jre/bin/java", command[0])
                assertEquals("-cp", command[1])
                // 主构件 + classpath 至少 2 个条目，全部为库目录内 Maven 布局路径。
                val cp = command[2].split(File.pathSeparator)
                assertTrue(cp.size >= 2, "classpath 应含主构件与依赖")
                cp.forEach { assertTrue(it.startsWith(File(tmp, "libraries").absolutePath), it) }
                assertEquals("net.minecraftforge:installertools:1.4.1", task.mainArtifact)
                // 占位符全部展开：命令中不应残留 {KEY}、未解析 '[...]' 引用或单引号常量。
                command.drop(3).forEach { arg ->
                    assertTrue(!arg.contains(Regex("\\{[A-Za-z0-9_.]+}")), "未展开占位符: $arg")
                    assertTrue(!arg.startsWith("'"), "未剥引号常量: $arg")
                }
            }
            val libs = File(tmp, "libraries").absolutePath
            val cmd0 = sink.recorded[0].first.drop(3)
            // MCP_DATA：--input 的字面 '[...]' 构件引用已展开为 mcp_config zip 的库路径。
            assertEquals(
                File(libs, "de/oceanlabs/mcp/mcp_config/1.20.1-20230612.114412/mcp_config-1.20.1-20230612.114412.zip").path,
                cmd0[cmd0.indexOf("--input") + 1],
            )
            assertEquals(
                File(libs, "de/oceanlabs/mcp/mcp_config/1.20.1-20230612.114412/mcp_config-1.20.1-20230612.114412-mappings.txt").path,
                cmd0[cmd0.indexOf("--output") + 1],
            )
            val cmd1 = sink.recorded[1].first.drop(3)
            // DOWNLOAD_MOJMAPS：{SIDE} → client，{MOJMAPS} → 库内 mappings@txt 路径。
            assertEquals("client", cmd1[cmd1.indexOf("--side") + 1])
            assertEquals(
                File(libs, "net/minecraft/client/1.20.1-20230612.114412/client-1.20.1-20230612.114412-mappings.txt").path,
                cmd1[cmd1.indexOf("--output") + 1],
            )
        } finally {
            tmp.deleteRecursively()
        }
    }

    @Test
    fun `BINPATCH 内部条目解出并改写进 DryRun 命令`() {
        val installerJar = ensureInstallerJar()
        val installer = ForgeInstaller()
        val profile = installer.parseInstallProfile(readJarEntry(installerJar, "install_profile.json"))
        assertEquals("/data/client.lzma", profile.data.getValue("BINPATCH").client)

        val tmp = createTempDir(prefix = "tipcl-forge-binpatch")
        try {
            val work = File(tmp, "work").apply { mkdirs() }
            val data = profile.data.mapValues { it.value.client } + mapOf(
                "SIDE" to "client",
                "ROOT" to work.absolutePath,
                "INSTALLER" to installerJar.absolutePath,
                "MINECRAFT_JAR" to File(work, "minecraft-client.jar").path,
                "mainClass" to "net.minecraftforge.binarypatcher.ConsoleTool",
            )
            val runner = ProcessorRunner(
                javaLocator = FixedJavaLocator(),
                libraryDir = File(tmp, "libraries"),
                workingDir = work,
                data = data,
                commandSink = DryRunCommandSink(),
                installerEntries = InstallerEntries(installerJar, work, libraryDir = File(tmp, "libraries")),
            )

            // 找到消费 {BINPATCH} 的 client processor（binarypatcher）并组装其命令。
            val binpatchTask = installer.buildPendingTasks(profile)
                .filterIsInstance<ForgePendingTask.RunProcessor>()
                .first { "{BINPATCH}" in it.args }
            val command = runner.buildCommand(binpatchTask)
            val extracted = File(work, "data/client.lzma")

            // 命令中不含 /data/ 原值（作为独立参数出现）；{BINPATCH} 已改写为解出后的
            // 文件系统路径。注意解出路径本身含 \data\client.lzma 子串，只能做全等比对。
            assertTrue(command.drop(3).none { it == "/data/client.lzma" || it == "\\data\\client.lzma" })
            assertTrue(command.drop(3).contains(extracted.absolutePath), "命令应包含解出路径: $command")
            // 解出内容与 jar 内条目一致（字节数比对）。
            val entrySize = java.util.jar.JarFile(installerJar).use { it.getJarEntry("data/client.lzma").size }
            assertTrue(extracted.isFile && extracted.length() == entrySize && entrySize > 0L)
            // 二次运行：命中解出缓存，不重复解出。
            val again = InstallerEntries(installerJar, work).resolve("/data/client.lzma")
            assertEquals(extracted.absoluteFile, again.absoluteFile)
        } finally {
            tmp.deleteRecursively()
        }
    }

    @Test
    fun `version_json 与 profile 元数据一致`() {
        val installerJar = ensureInstallerJar()
        val installer = ForgeInstaller()
        val profile = installer.parseInstallProfile(readJarEntry(installerJar, "install_profile.json"))

        val versionJson = readJarEntry(installerJar, "version.json")
        // version.json 的 id 与 profile.version 一致（宽松断言，避免 Forge 自身排版差异）。
        assertTrue("1.20.1-forge-47.4.28" in versionJson)

        // finalize 产出的运行期 JSON：36 条库全保留（新式无 clientreq=false）。
        val finalized = ForgeVersionJsonFinalizer(profile)
            .finalize(ForgePendingTask.FinalizeVersionJson("1.20.1-forge-47.4.28"))
        assertEquals(36, Regex("\"name\"").findAll(finalized).count())
        assertTrue("\"mainClass\": \"cpw.mods.modlauncher.Launcher\"" in finalized)
    }
}
