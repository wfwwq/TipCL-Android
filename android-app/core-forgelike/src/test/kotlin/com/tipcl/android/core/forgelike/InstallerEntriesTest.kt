package com.tipcl.android.core.forgelike

import java.io.File
import java.util.jar.JarEntry
import java.util.jar.JarOutputStream
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * installer jar 内部资源解析（M4.5 NETTEST 边界 #6）离线验证：
 * 自打 zip 构造带 `data/`、`maven/` 条目的合成 installer jar，覆盖
 * 识别、解出、值改写、maven 库复用、二次运行缓存五条路径。
 */
class InstallerEntriesTest {

    private class FixedJavaLocator(val path: String = "/fake/jre/bin/java") : HostJavaLocator {
        override fun locate(): String? = path
    }


    /** 构造合成 installer jar：data/client.lzma + data/server.lzma + 内嵌 maven 构件。 */
    private fun syntheticInstaller(dir: File): File {
        val jar = File(dir, "synthetic-installer.jar")
        JarOutputStream(jar.outputStream()).use { out ->
            fun put(name: String, content: String) {
                out.putNextEntry(JarEntry(name))
                out.write(content.toByteArray())
                out.closeEntry()
            }
            put("install_profile.json", "{}")
            put("data/client.lzma", "CLIENT-BINPATCH-PAYLOAD")
            put("data/server.lzma", "SERVER-BINPATCH-PAYLOAD")
            put("maven/com/example/lib/1.0/lib-1.0.jar", "MAVEN-EMBEDDED-LIB")
        }
        return jar
    }

    @Test
    fun `内部条目识别与解出到 workingDir`() {
        val tmp = createTempDir()
        val jar = syntheticInstaller(tmp)
        val work = File(tmp, "work")
        val entries = InstallerEntries(jar, work)

        assertTrue(entries.isInternalValue("/data/client.lzma"))
        assertTrue(entries.isInternalValue("/maven/com/example/lib/1.0/lib-1.0.jar"))
        assertFalse(entries.isInternalValue("/data/missing.lzma"), "jar 内不存在的条目不算内部引用")
        assertFalse(entries.isInternalValue("/etc/passwd"))
        assertFalse(entries.isInternalValue("client.lzma"))
        assertFalse(entries.isInternalValue("'[g:a:1]'"))

        // 映射：/data/client.lzma → workingDir/data/client.lzma，内容为 jar 内原始字节。
        val resolved = entries.resolve("/data/client.lzma")
        assertEquals(File(work, "data/client.lzma").absoluteFile, resolved.absoluteFile)
        assertEquals("CLIENT-BINPATCH-PAYLOAD", resolved.readText())

        assertFailsWith<IllegalArgumentException> { entries.resolve("/data/missing.lzma") }
        assertFailsWith<IllegalArgumentException> { entries.resolve("client.lzma") }
        tmp.deleteRecursively()
    }

    @Test
    fun `ProcessorRunner DryRun 命令含解出路径而非 data 原值`() {
        val tmp = createTempDir()
        val jar = syntheticInstaller(tmp)
        val work = File(tmp, "work").apply { mkdirs() }
        val sink = DryRunCommandSink()
        val runner = ProcessorRunner(
            javaLocator = FixedJavaLocator(),
            libraryDir = File(tmp, "libraries"),
            workingDir = work,
            data = mapOf(
                "BINPATCH" to "/data/client.lzma",
                "EMBEDDED" to "/maven/com/example/lib/1.0/lib-1.0.jar",
                "mainClass" to "com.example.BinaryPatchTool",
            ),
            commandSink = sink,
            installerEntries = InstallerEntries(jar, work, libraryDir = File(tmp, "libraries")),
        )
        val result = runner.run(
            ForgePendingTask.RunProcessor(
                mainArtifact = "com.example:tool:1.0",
                classpath = emptyList(),
                args = listOf("--binpatches", "{BINPATCH}", "--lib", "{EMBEDDED}"),
                outputs = emptyMap(),
            ),
        ) as ProcessorRunner.TaskResult.Processor
        val args = result.command.drop(4)
        // 解出后的文件系统路径，而非 /data/、/maven/ 原值。
        assertEquals(File(work, "data/client.lzma").absolutePath, args[1])
        assertEquals(File(work, "maven/com/example/lib/1.0/lib-1.0.jar").absolutePath, args[3])
        assertTrue(args.none { it.startsWith("/data/") || it.startsWith("/maven/") })
        assertTrue(File(work, "data/client.lzma").isFile)
        tmp.deleteRecursively()
    }

    @Test
    fun `maven 内嵌条目同步进库目录且 DownloadLibrary 跳过下载`() {
        val tmp = createTempDir()
        val jar = syntheticInstaller(tmp)
        val work = File(tmp, "work").apply { mkdirs() }
        val libs = File(tmp, "libraries")
        val installerEntries = InstallerEntries(jar, work, libraryDir = libs)

        val runner = ProcessorRunner(
            javaLocator = FixedJavaLocator(),
            libraryDir = libs,
            workingDir = work,
            data = mapOf("EMBEDDED" to "/maven/com/example/lib/1.0/lib-1.0.jar", "mainClass" to "X"),
            commandSink = DryRunCommandSink(),
            installerEntries = installerEntries,
        )
        // 展开 {EMBEDDED}：解出 maven 条目并同步进库目录。
        val expanded = runner.expand("{EMBEDDED}")
        assertEquals(File(work, "maven/com/example/lib/1.0/lib-1.0.jar").absoluteFile, File(expanded).absoluteFile)
        val inLibrary = File(libs, "com/example/lib/1.0/lib-1.0.jar")
        assertTrue(inLibrary.isFile, "maven 条目应同步进库目录")
        assertEquals("MAVEN-EMBEDDED-LIB", inLibrary.readText())

        // DownloadLibrary 对同一构件：已存在 → 跳过下载（下载器一旦被调用即失败）。
        val failDownloader = object : Downloader {
            override fun download(url: String, dest: File) = throw AssertionError("不应触发下载")
        }
        val downloadingRunner = ProcessorRunner(
            javaLocator = FixedJavaLocator(),
            libraryDir = libs,
            workingDir = work,
            data = emptyMap(),
            commandSink = DryRunCommandSink(),
            downloader = failDownloader,
        )
        val libResult = downloadingRunner.run(
            ForgePendingTask.DownloadLibrary(artifact = "com.example:lib:1.0", baseUrl = null),
        ) as ProcessorRunner.TaskResult.Library
        assertEquals(inLibrary.absoluteFile, libResult.file.absoluteFile)
        tmp.deleteRecursively()
    }

    @Test
    fun `二次运行命中解出缓存不重解`() {
        val tmp = createTempDir()
        val jar = syntheticInstaller(tmp)
        val work = File(tmp, "work")
        val entries = InstallerEntries(jar, work)
        val first = entries.resolve("/data/client.lzma")

        // 篡改落盘副本（保持同字节数，模拟内容损坏但尺寸一致）：若重解会被 jar 内
        // 原始字节覆盖，内容不变即证明命中"存在即复用"缓存。
        first.writeText("CLIENT-BINPATCH-TAMPERS")
        val second = InstallerEntries(jar, work).resolve("/data/client.lzma")
        assertEquals(first.absoluteFile, second.absoluteFile)
        assertEquals("CLIENT-BINPATCH-TAMPERS", second.readText(), "落盘副本存在时应复用而非重解")

        // 副本字节数与条目不一致时视为损坏，重新解出。
        val broken = InstallerEntries(jar, work, libraryDir = null).also { _ ->
            first.writeText("short")
        }.resolve("/data/client.lzma")
        assertEquals("CLIENT-BINPATCH-PAYLOAD", broken.readText(), "损坏副本应重解")
        tmp.deleteRecursively()
    }
}
