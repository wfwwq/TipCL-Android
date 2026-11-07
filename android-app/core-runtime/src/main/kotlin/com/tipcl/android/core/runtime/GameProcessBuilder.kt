package com.tipcl.android.core.runtime

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.TimeUnit

/**
 * 用供给的 JRE 以 ProcessBuilder 拉起游戏主进程。
 *
 * 注入项：
 * - `-Djava.library.path=<nativeDir>`：指向打包的 tipcl_runtime.so 所在目录（jniLibs），
 *   让游戏 System.loadLibrary("tipcl_runtime") 时命中我们的 GLFW 桩。
 * - `-Dtipcl.app.data=<appDataDir>`：游戏侧存档/配置根目录。
 * - `-Dtipcl.game.window=<w>x<h>`：虚拟窗口尺寸（GLFW 桩 glfwGetWindowSize 用）。
 *
 * 进程环境：
 * - HOME=<appDataDir>（游戏/JRE 会在 ~ 下写 .minecraft 等目录）
 * - TMPDIR=<appDataDir>/tmp（Android 上 /tmp 不存在，必须显式给）
 * - PATH=<javaHome>/bin:/system/bin:/system/xbin
 * - 工作目录 = instanceDir（实例目录，默认 appDataDir）
 *
 * 日志：stdout/stderr 各起一条守护线程异步泵读，行级回调 +
 * stderr 尾部环形缓冲（崩溃时随 [GameExit.stderrTail] 结构化回传）。
 *
 * 依赖注入：classpath、mainClass 等全部来自 [LaunchArgsProvider]，不直接依赖 core-launch。
 */
class GameProcessBuilder(
    private val runtimeProvider: JavaRuntimeProvider,
    private val launchArgsProvider: LaunchArgsProvider,
    /** stderr 尾部缓冲保留行数。 */
    private val stderrTailLines: Int = 200,
) {

    data class LaunchResult(
        val process: Process,
        val commandLine: List<String>,
        /** stdout/stderr 异步泵的句柄；awaitExit 用。 */
        val logs: ProcessLogs,
    )

    /** 游戏进程退出结果（结构化回传给 UI/诊断层）。 */
    data class GameExit(
        val exitCode: Int,
        /** stderr 最后 N 行（时间序），崩溃排查主线索。 */
        val stderrTail: List<String>,
        /** true=正常退出/JVM 报告的退出码；false=超时被强制结束或进程对象不可取。 */
        val clean: Boolean,
    )

    /** 双流泵：行回调 + stderr 尾部缓冲。 */
    class ProcessLogs(
        private val stderrTailLines: Int,
        var onStdoutLine: ((String) -> Unit)? = null,
        var onStderrLine: ((String) -> Unit)? = null,
    ) {
        private val tail = ArrayBlockingQueue<String>(stderrTailLines)
        internal var stdoutPump: Thread? = null
        internal var stderrPump: Thread? = null

        /** 已记录 stderr 总行数。 */
        @Volatile
        var stderrLineCount: Int = 0
            private set

        /** stderr 最后 [stderrTailLines] 行的快照。 */
        fun stderrTail(): List<String> = synchronized(tail) { tail.toList() }

        internal fun recordStdout(line: String) { onStdoutLine?.invoke(line) }
        internal fun recordStderr(line: String) {
            synchronized(tail) {
                if (tail.remainingCapacity() == 0) tail.poll()
                tail.offer(line)
                stderrLineCount++
            }
            onStderrLine?.invoke(line)
        }

        internal fun joinPumps(millis: Long) {
            val deadline = System.currentTimeMillis() + millis
            stdoutPump?.join(maxOf(1, deadline - System.currentTimeMillis()))
            stderrPump?.join(maxOf(1, deadline - System.currentTimeMillis()))
        }
    }

    fun launch(
        majorVersion: Int,
        appDataDir: Path,
        nativeLibDir: Path,
        windowWidth: Int = 1280,
        windowHeight: Int = 720,
        instanceDir: Path = appDataDir,
    ): LaunchResult {
        val javaHome = runtimeProvider.provision(majorVersion)
        val javaBin = resolveJavaBinary(javaHome)
        val spec = launchArgsProvider.provide()

        val classpathArg = spec.classpath.joinToString(File.pathSeparator) { it.toString() }

        val command = buildList {
            add(javaBin.toString())
            addAll(spec.jvmArgs)
            add("-Djava.library.path=$nativeLibDir")
            add("-Dtipcl.app.data=$appDataDir")
            add("-Dtipcl.game.window=${windowWidth}x${windowHeight}")
            add("-cp")
            add(classpathArg)
            add(spec.mainClass)
            addAll(spec.programArgs)
        }

        Files.createDirectories(instanceDir)
        val tmpDir = appDataDir.resolve("tmp")
        Files.createDirectories(tmpDir)

        val pb = ProcessBuilder(command)
            .directory(instanceDir.toFile())
            .redirectErrorStream(false)

        with(pb.environment()) {
            put("HOME", appDataDir.toString())
            put("TMPDIR", tmpDir.toString())
            put("PATH", "${javaHome.resolve("bin")}${File.pathSeparator}/system/bin${File.pathSeparator}/system/xbin")
            put("LD_LIBRARY_PATH", buildString {
                append(nativeLibDir)
                System.getenv("LD_LIBRARY_PATH")?.let { append(File.pathSeparator); append(it) }
            })
        }

        val process = pb.start()
        val logs = ProcessLogs(stderrTailLines)
        pump(process, logs)
        return LaunchResult(process, command, logs)
    }

    /**
     * 阻塞等待进程退出并回传结构化结果。
     *
     * @param timeoutSeconds >0 时限时；超时依次 destroy() → 宽限 5s → destroyForcibly()。
     *   强杀时 exitCode 取 exitValue（若可得），clean=false。
     */
    fun awaitExit(result: LaunchResult, timeoutSeconds: Long = 0): GameExit {
        val process = result.process
        val exitedInTime = if (timeoutSeconds <= 0) {
            process.waitFor(); true
        } else {
            process.waitFor(timeoutSeconds, TimeUnit.SECONDS)
        }
        val forced = !exitedInTime && process.isAlive

        if (forced && process.isAlive) {
            process.destroy()
            if (!process.waitFor(5, TimeUnit.SECONDS)) {
                process.destroyForcibly()
                process.waitFor(10, TimeUnit.SECONDS)
            }
        }

        // 等泵线程把残余日志读完（最多 3s），保证 stderrTail 完整
        result.logs.joinPumps(3_000)

        val exitCode = try {
            process.exitValue()
        } catch (e: IllegalThreadStateException) {
            -1
        }
        return GameExit(exitCode, result.logs.stderrTail(), !forced)
    }

    /** 主动停止（用户点退出）：先 destroy 优雅，5s 后 forcibly 兜底。 */
    fun stop(result: LaunchResult) {
        val process = result.process
        if (!process.isAlive) return
        process.destroy()
        if (!process.waitFor(5, TimeUnit.SECONDS)) {
            process.destroyForcibly()
        }
    }

    internal fun pump(process: Process, logs: ProcessLogs) {
        val outThread = Thread({
            try {
                process.inputStream.bufferedReader().useLines { lines ->
                    lines.forEach { logs.recordStdout(it) }
                }
            } catch (_: IOException) { /* 进程关闭时流断开属正常 */ }
        }, "tipcl-game-stdout-pump")
        val errThread = Thread({
            try {
                process.errorStream.bufferedReader().useLines { lines ->
                    lines.forEach { logs.recordStderr(it) }
                }
            } catch (_: IOException) { }
        }, "tipcl-game-stderr-pump")
        outThread.isDaemon = true
        errThread.isDaemon = true
        outThread.start()
        errThread.start()
        logs.stdoutPump = outThread
        logs.stderrPump = errThread
    }

    private fun resolveJavaBinary(javaHome: Path): Path {
        val unix = javaHome.resolve("bin").resolve("java")
        val win = javaHome.resolve("bin").resolve("java.exe")
        return when {
            unix.toFile().canExecute() -> unix
            win.toFile().exists() -> win
            else -> error("No java executable under $javaHome/bin")
        }
    }
}
