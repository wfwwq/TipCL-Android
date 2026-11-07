package com.tipcl.android.core.forgelike

import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ProcessorRunnerTest {

    private class FixedJavaLocator(val path: String = "/fake/jre/bin/java") : HostJavaLocator {
        override fun locate(): String? = path
    }

    private fun newRunner(
        tmp: File,
        sink: DryRunCommandSink,
        data: Map<String, String> = emptyMap(),
    ) = ProcessorRunner(
        javaLocator = FixedJavaLocator(),
        libraryDir = File(tmp, "libraries"),
        workingDir = File(tmp, "work"),
        data = data,
        commandSink = sink,
    )

    @Test
    fun `maven 布局路径生成`() {
        assertEquals(
            "net/minecraftforge/forge/1.20.1-47.1.0/forge-1.20.1-47.1.0.jar",
            ProcessorRunner.mavenPath("net.minecraftforge:forge:1.20.1-47.1.0"),
        )
        assertEquals(
            "de/oceanlabs/mcp/mcp_config/1.20.1-20230612.114412/mcp_config-1.20.1-20230612.114412.zip",
            ProcessorRunner.mavenPath("de.oceanlabs.mcp:mcp_config:1.20.1-20230612.114412@zip"),
        )
        assertEquals(
            "org/ow2/asm/asm/9.5/asm-9.5-sources.jar",
            ProcessorRunner.mavenPath("org.ow2.asm:asm:9.5:sources"),
        )
    }

    @Test
    fun `下载任务镜像注入与候选 URL 顺序`() {
        val tmp = createTempDir()
        val runner = newRunner(tmp, DryRunCommandSink())
        val urls = runner.candidateUrls(
            "com.example:tool:1.0",
            baseUrl = "https://example.com/maven/",
        )
        // 声明 url 优先 → 官方 maven 兜底，且路径为 Maven 布局；注入 mirror 后镜像排最前。
        assertEquals(
            listOf(
                "https://example.com/maven/com/example/tool/1.0/tool-1.0.jar",
                "https://maven.minecraftforge.net/maven/com/example/tool/1.0/tool-1.0.jar",
            ),
            urls,
        )
        val withMirror = ProcessorRunner(
            FixedJavaLocator(), File(tmp, "l"), File(tmp, "w"), emptyMap(),
            mirrorBaseUrls = listOf("https://mirror.example/maven"), commandSink = DryRunCommandSink(),
        )
        assertTrue(withMirror.candidateUrls("com.example:tool:1.0", null)
            .first() == "https://mirror.example/maven/com/example/tool/1.0/tool-1.0.jar")
        tmp.deleteRecursively()
    }

    @Test
    fun `命令组装与占位符展开`() {
        val tmp = createTempDir()
        val work = File(tmp, "work").apply { mkdirs() }
        File(work, "client.jar").writeText("x")
        val sink = DryRunCommandSink()
        val runner = newRunner(tmp, sink, data = mapOf(
            "MINECRAFT_JAR" to "client.jar",
            "SIDE" to "client",
            "MAP" to "{ROOT}/mappings.tsrg",
            "ROOT" to tmp.absolutePath,
            "mainClass" to "com.example.Patcher",
        ))
        val task = ForgePendingTask.RunProcessor(
            mainArtifact = "net.minecraftforge:forge:1.0",
            classpath = listOf("org.ow2.asm:asm:9.5"),
            args = listOf("--input", "{MINECRAFT_JAR}", "--side", "{SIDE}", "--map", "{MAP}"),
            outputs = mapOf("net.minecraftforge:forge:1.0" to "client-patched.jar"),
        )
        // 模拟 processor 已产出产物（DryRun 不真跑）。
        File(work, "client-patched.jar").writeText("patched")
        val result = runner.run(task) as ProcessorRunner.TaskResult.Processor
        val command = result.command
        // java -cp mainArtifact;classpath mainClass args...
        assertEquals("/fake/jre/bin/java", command[0])
        assertEquals("-cp", command[1])
        val cp = command[2].split(File.pathSeparator)
        assertEquals(2, cp.size)
        assertEquals(
            File(tmp, "libraries/net/minecraftforge/forge/1.0/forge-1.0.jar").absolutePath,
            File(cp[0]).absolutePath,
        )
        assertEquals(
            File(tmp, "libraries/org/ow2/asm/asm/9.5/asm-9.5.jar").absolutePath,
            File(cp[1]).absolutePath,
        )
        assertEquals("com.example.Patcher", command[3])
        assertEquals(
            listOf("--input", File(work, "client.jar").path, "--side", "client", "--map", File(tmp, "mappings.tsrg").path),
            command.drop(4),
        )
        assertTrue(sink.recorded.size == 1)
        tmp.deleteRecursively()
    }

    @Test
    fun `未知占位符报错`() {
        val tmp = createTempDir()
        val runner = newRunner(tmp, DryRunCommandSink())
        assertFailsWith<IllegalArgumentException> { runner.expand("{NOT_A_KEY}") }
        tmp.deleteRecursively()
    }

    @Test
    fun `outputs 校验通过后断点重跑跳过 processor`() {
        val tmp = createTempDir()
        val libs = File(tmp, "libraries")
        val work = File(tmp, "work").apply { mkdirs() }
        val sink = DryRunCommandSink()
        val runner = newRunner(tmp, sink, data = mapOf("mainClass" to "X"))
        // 预置库构件与产物，使 sha1 匹配 = processor 已完成。
        val produced = File(work, "patched.jar").apply { writeText("patched-content") }
        val artifact = File(libs, "g/a/1/a-1.jar").apply { parentFile.mkdirs(); writeText("patched-content") }
        val task = ForgePendingTask.RunProcessor(
            mainArtifact = "g:a:1",
            classpath = emptyList(),
            args = emptyList(),
            outputs = mapOf("g:a:1" to "patched.jar"),
        )
        assertTrue(runner.outputsSatisfied(task.outputs))
        val result = runner.run(task) as ProcessorRunner.TaskResult.Processor
        assertTrue(result.skipped)
        assertTrue(sink.recorded.isEmpty(), "已完成 processor 不应再执行命令")

        // sha1 不一致时视为未完成，重跑后产物覆写构件。
        artifact.writeText("stale")
        assertFalse(runner.outputsSatisfied(task.outputs))
        val rerun = runner.run(task) as ProcessorRunner.TaskResult.Processor
        assertFalse(rerun.skipped)
        assertEquals("patched-content", artifact.readText())
        tmp.deleteRecursively()
    }

    @Test
    fun `带叹号后缀的 output 回写 jar 条目`() {
        val tmp = createTempDir()
        val libs = File(tmp, "libraries")
        val work = File(tmp, "work").apply { mkdirs() }
        val sink = DryRunCommandSink()
        val runner = newRunner(tmp, sink, data = mapOf("mainClass" to "X"))
        val jarPath = "g/b/1/b-1.jar"
        val jar = File(libs, jarPath).apply { parentFile.mkdirs() }
        java.util.jar.JarOutputStream(jar.outputStream()).use { out ->
            out.putNextEntry(java.util.jar.JarEntry("a.class"))
            out.write("old".toByteArray())
            out.closeEntry()
        }
        val replacement = File(work, "entry.class").apply { writeText("new-entry") }
        val task = ForgePendingTask.RunProcessor(
            mainArtifact = "g:b:1",
            classpath = emptyList(),
            args = emptyList(),
            outputs = mapOf("g:b:1" to "entry.class!"),
        )
        val result = runner.run(task) as ProcessorRunner.TaskResult.Processor
        assertFalse(result.skipped)
        java.util.jar.JarFile(jar).use { jf ->
            // 语义：产物文件以同名条目写回 jar；其余条目保留。
            assertEquals("new-entry", jf.getInputStream(jf.getJarEntry("entry.class")).readBytes().decodeToString())
            assertEquals("old", jf.getInputStream(jf.getJarEntry("a.class")).readBytes().decodeToString())
        }
        // 回写完成后 outputs 满足，重跑跳过。
        assertTrue(runner.outputsSatisfied(task.outputs))
        assertTrue((runner.run(task) as ProcessorRunner.TaskResult.Processor).skipped)
        tmp.deleteRecursively()
    }

    @Test
    fun `processor 失败退出码抛异常且不校验 outputs`() {
        val tmp = createTempDir()
        val failing = object : CommandSink {
            override fun run(command: List<String>, workingDir: File): Int = 3
        }
        val runner = ProcessorRunner(
            FixedJavaLocator(), File(tmp, "l"), File(tmp, "w"),
            data = mapOf("mainClass" to "X"), commandSink = failing,
        )
        val ex = assertFailsWith<IllegalStateException> {
            runner.run(ForgePendingTask.RunProcessor("g:c:1", emptyList(), emptyList(), emptyMap()))
        }
        assertTrue("退出码 3" in ex.message.orEmpty())
        tmp.deleteRecursively()
    }

    @Test
    fun `buildPendingTasks 产出三类任务并按序执行`() {
        val profileJson = """
            {
              "minecraft": "1.20.1",
              "version": "47.1.0",
              "libraries": [{"name": "org.ow2.asm:asm:9.5"}],
              "processors": [
                {
                  "jar": "net.minecraftforge:forge:1.20.1-47.1.0:recom",
                  "classpath": ["org.ow2.asm:asm:9.5"],
                  "args": ["--input", "{MINECRAFT_JAR}"],
                  "outputs": {"net.minecraftforge:forge:1.20.1-47.1.0:recom": "client.jar"}
                },
                {"sides": ["server"], "jar": "g:server-only:1", "args": []}
              ],
              "data": {
                "MINECRAFT_JAR": {"client": "{ROOT}/versions/1.20.1/1.20.1.jar", "server": "server.jar"}
              }
            }
        """.trimIndent()
        val installer = ForgeInstaller()
        val profile = installer.parseInstallProfile(profileJson)
        val tasks = installer.buildPendingTasks(profile)
        // client 侧：1 下载 + 1 processor（server-only 被过滤）+ finalize。
        assertTrue(tasks.size == 3)
        assertTrue(tasks[0] is ForgePendingTask.DownloadLibrary)
        assertTrue(tasks[1] is ForgePendingTask.RunProcessor)
        assertTrue(tasks[2] is ForgePendingTask.FinalizeVersionJson)

        val tmp = createTempDir()
        // processor 的 output 产物需预置，模拟已执行完成。
        File(tmp, "work").apply { mkdirs() }.resolve("client.jar").writeText("patched")
        val finalizedIds = mutableListOf<String>()
        val sink = DryRunCommandSink()
        val runner = ProcessorRunner(
            FixedJavaLocator(), File(tmp, "libraries"), File(tmp, "work"),
            data = mapOf("MINECRAFT_JAR" to "versions/1.20.1/1.20.1.jar", "mainClass" to "X"),
            commandSink = sink,
            finalize = { finalizedIds += it.newId },
        )
        val results = runner.runAll(tasks)
        assertEquals(3, results.size)
        assertTrue(results[2] is ProcessorRunner.TaskResult.Finalize)
        assertEquals(listOf("1.20.1-forge-47.1.0"), finalizedIds)
        assertEquals(1, sink.recorded.size)
        tmp.deleteRecursively()
    }
}
