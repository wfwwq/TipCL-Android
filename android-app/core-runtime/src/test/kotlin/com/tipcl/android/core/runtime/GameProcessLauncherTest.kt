package com.tipcl.android.core.runtime

import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class GameProcessLauncherTest {

    private fun tempDir(tag: String): Path = Files.createTempDirectory("gpl-$tag")

    private fun spec(
        mainClass: String = "com.example.Main",
        classpath: List<String> = listOf("/data/libs/a.jar", "/data/libs/b.jar"),
        javaExecutable: String = Paths.get(
            System.getProperty("java.home"), "bin",
            if (System.getProperty("os.name").contains("win", true)) "java.exe" else "java",
        ).toString(),
        nativesDir: String = tempDir("natives").toString(),
        nativeJars: List<String> = emptyList(),
    ) = GameLaunchSpec(
        mainClass = mainClass,
        classpath = classpath,
        jvmArgs = listOf("-Xmx512m"),
        gameArgs = listOf("--username", "Steve"),
        javaExecutable = javaExecutable,
        workingDir = tempDir("work").toString(),
        nativeLibDir = nativesDir,
        nativeJars = nativeJars,
    )

    // ---- 命令组装 ----

    @Test
    fun buildsFullCommandLine() {
        val launcher = GameProcessLauncher(GameProcessBuilder(NoRuntime, NoArgs))
        val s = spec()
        val cmd = launcher.buildCommand(s)

        assertEquals(
            listOf(
                s.javaExecutable,
                "-Xmx512m",
                "-Djava.library.path=${s.nativeLibDir}",
                "-cp", "/data/libs/a.jar${File.pathSeparator}/data/libs/b.jar",
                "com.example.Main",
                "--username", "Steve",
            ),
            cmd,
        )
    }

    @Test
    fun emptyJvmArgsAndGameArgsOmitted() {
        val launcher = GameProcessLauncher(GameProcessBuilder(NoRuntime, NoArgs))
        val s = spec().copy(jvmArgs = emptyList(), gameArgs = emptyList())
        val cmd = launcher.buildCommand(s)

        assertEquals(listOf(s.javaExecutable, "-Djava.library.path=${s.nativeLibDir}", "-cp", s.classpath.joinToString(File.pathSeparator), "com.example.Main"), cmd)
    }

    // ---- 校验失败（进程启动前） ----

    @Test
    fun missingJavaExecutableFails() {
        val launcher = GameProcessLauncher(GameProcessBuilder(NoRuntime, NoArgs))
        val bad = spec(javaExecutable = "/nonexistent/jre/bin/java")

        val e = assertFailsWith<GameProcessLauncher.LaunchValidationException> {
            launcher.launch(bad)
        }
        assertTrue(e.message!!.contains("java 可执行文件不存在"))
    }

    @Test
    fun blankMainClassFails() {
        val launcher = GameProcessLauncher(GameProcessBuilder(NoRuntime, NoArgs))
        assertFailsWith<GameProcessLauncher.LaunchValidationException> {
            launcher.launch(spec(mainClass = " "))
        }
    }

    @Test
    fun emptyClasspathFails() {
        val launcher = GameProcessLauncher(GameProcessBuilder(NoRuntime, NoArgs))
        assertFailsWith<GameProcessLauncher.LaunchValidationException> {
            launcher.launch(spec(classpath = emptyList()))
        }
    }

    @Test
    fun missingNativeJarFailsBeforeProcessStart() {
        val launcher = GameProcessLauncher(GameProcessBuilder(NoRuntime, NoArgs))
        val s = spec(nativeJars = listOf(tempDir("nj").resolve("gone.jar").toString()))

        val e = assertFailsWith<NativeLibraryExtractor.NativeExtractException> {
            launcher.launch(s)
        }
        assertTrue(e.message!!.contains("gone.jar"))
    }

    @Test
    fun ensureExtractedRunsBeforeLaunch() {
        val dir = tempDir("prelaunch")
        val nativesDir = dir.resolve("natives")
        val jar = dir.resolve("n.jar")
        java.util.zip.ZipOutputStream(Files.newOutputStream(jar)).use { zip ->
            zip.putNextEntry(java.util.zip.ZipEntry("lib/x86_64/libz.so"))
            zip.write("socontent".toByteArray())
            zip.closeEntry()
        }

        val launcher = GameProcessLauncher(
            GameProcessBuilder(NoRuntime, NoArgs),
            NativeLibraryExtractor(abi = "x86_64"),
        )
        val s = spec(nativesDir = nativesDir.toString(), nativeJars = listOf(jar.toString()))

        // javaExecutable 存在但主类不存在 → 进程会立刻失败退出；
        // 此处只断言解压已在进程校验之后、拉起之前完成
        try {
            launcher.launch(s).process.waitFor()
        } catch (_: Exception) { /* 进程级失败不影响本测试目标 */ }

        assertTrue(Files.isRegularFile(nativesDir.resolve("libz.so")))
    }

    // ---- 假注入桩 ----

    private object NoRuntime : JavaRuntimeProvider {
        override fun list() = emptyList<JavaRuntimeProvider.ProvisionedRuntime>()
        override fun provision(majorVersion: Int) = throw UnsupportedOperationException()
    }

    private object NoArgs : LaunchArgsProvider {
        override fun provide() = LaunchArgsProvider.LaunchSpec(emptyList(), "unused", emptyList(), emptyList())
    }
}
