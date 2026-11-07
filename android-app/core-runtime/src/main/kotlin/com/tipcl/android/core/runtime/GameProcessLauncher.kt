package com.tipcl.android.core.runtime

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/**
 * 弱类型启动描述：GameProcessLauncher 的输入。
 *
 * 有意不 import core-launch 的 LaunchPlan——app 层从 LaunchPlan 逐字段拷贝组装
 * 本类（或写一个映射扩展），保持 core-runtime 对 core-launch 的零编译期依赖。
 *
 * @param mainClass        游戏主类全限定名
 * @param classpath        classpath 条目（绝对路径字符串，保序）
 * @param jvmArgs          JVM 参数（-Xmx、-D…，不含 java.library.path，由 launcher 注入）
 * @param gameArgs         传给主类的程序参数（--username 等）
 * @param javaExecutable   java 可执行文件绝对路径（来自 RuntimeProvisioner / 用户指定）
 * @param workingDir       进程工作目录（实例目录 / --game_directory）
 * @param nativeLibDir     .so 解压目标目录，同时注入 -Djava.library.path 与 LD_LIBRARY_PATH
 * @param nativeJars       待解压的 natives 构件 jar 路径（来自 LibraryResolution.natives
 *                         的 librariesDir+relativePath 展开；空则跳过解压直接启动）
 * @param env              额外环境变量（覆盖默认注入项）
 */
data class GameLaunchSpec(
    val mainClass: String,
    val classpath: List<String>,
    val jvmArgs: List<String> = emptyList(),
    val gameArgs: List<String> = emptyList(),
    val javaExecutable: String,
    val workingDir: String,
    val nativeLibDir: String,
    val nativeJars: List<String> = emptyList(),
    val env: Map<String, String> = emptyMap(),
)

/**
 * GameProcessBuilder 之上的启动编排层：
 *
 * 1. 校验 [GameLaunchSpec]（java 可执行文件存在且可执行，否则启动前即失败）；
 * 2. 先 [NativeLibraryExtractor.ensureExtracted]（全量在位则缓存跳过）；
 * 3. 组装完整命令行并拉起进程，stdout/stderr 泵与退出回传
 *    （[GameProcessBuilder.ProcessLogs] / [GameProcessBuilder.GameExit]）复用
 *    GameProcessBuilder 既有机制。
 */
class GameProcessLauncher(
    private val builder: GameProcessBuilder,
    private val extractor: NativeLibraryExtractor = NativeLibraryExtractor(),
) {

    class LaunchValidationException(message: String) : IOException(message)

    /** 纯函数命令组装，便于单测。 */
    internal fun buildCommand(spec: GameLaunchSpec): List<String> = buildList {
        add(spec.javaExecutable)
        addAll(spec.jvmArgs)
        add("-Djava.library.path=${spec.nativeLibDir}")
        add("-cp")
        add(spec.classpath.joinToString(File.pathSeparator))
        add(spec.mainClass)
        addAll(spec.gameArgs)
    }

    /**
     * 校验 → 解压 natives → 拉起进程。
     * 校验失败抛 [LaunchValidationException]；natives jar 损坏抛
     * [NativeLibraryExtractor.NativeExtractException]，两者均发生在进程启动前。
     */
    fun launch(spec: GameLaunchSpec): GameProcessBuilder.LaunchResult {
        validate(spec)

        if (spec.nativeJars.isNotEmpty()) {
            extractor.ensureExtracted(spec.nativeJars.map(Paths::get), Paths.get(spec.nativeLibDir))
        }

        val command = buildCommand(spec)
        val workingDir = Paths.get(spec.workingDir)
        Files.createDirectories(workingDir)

        val pb = ProcessBuilder(command)
            .directory(workingDir.toFile())
            .redirectErrorStream(false)

        with(pb.environment()) {
            // LD_LIBRARY_PATH 前置 natives 目录，与 GameProcessBuilder 行为一致
            put("LD_LIBRARY_PATH", buildString {
                append(spec.nativeLibDir)
                System.getenv("LD_LIBRARY_PATH")?.let { append(File.pathSeparator); append(it) }
            })
            // 调用方显式项最后覆盖（含 TMPDIR、HOME 等 Android 必需项）
            putAll(spec.env)
        }

        val process = pb.start()
        val logs = GameProcessBuilder.ProcessLogs(200)
        builder.pump(process, logs)
        return GameProcessBuilder.LaunchResult(process, command, logs)
    }

    /** 阻塞等待退出并回传结构化结果，见 [GameProcessBuilder.awaitExit]。 */
    fun awaitExit(
        result: GameProcessBuilder.LaunchResult,
        timeoutSeconds: Long = 0,
    ): GameProcessBuilder.GameExit = builder.awaitExit(result, timeoutSeconds)

    /** 主动停止进程（destroy → 5s 后 forcibly），见 [GameProcessBuilder.stop]。 */
    fun stop(result: GameProcessBuilder.LaunchResult) = builder.stop(result)

    private fun validate(spec: GameLaunchSpec) {
        if (spec.mainClass.isBlank()) throw LaunchValidationException("mainClass 为空")
        if (spec.classpath.isEmpty()) throw LaunchValidationException("classpath 为空")
        val java = Paths.get(spec.javaExecutable)
        if (!Files.isRegularFile(java)) {
            throw LaunchValidationException("java 可执行文件不存在: ${spec.javaExecutable} " +
                "(JRE 未供给？检查 RuntimeProvisioner 结果)")
        }
        if (!Files.isExecutable(java)) {
            throw LaunchValidationException("java 可执行文件不可执行: ${spec.javaExecutable}")
        }
        if (spec.nativeLibDir.isBlank()) throw LaunchValidationException("nativeLibDir 为空")
    }
}
