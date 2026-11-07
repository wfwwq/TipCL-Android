package com.tipcl.android.core.launch

import java.nio.file.Path

/**
 * 参数拼装器：由 [VersionSpec]（合并继承链后）与 [LaunchOptions] 产出
 * 完整的 JVM 参数与 game 参数，以及最终的完整进程命令行。
 *
 * 兼容两种版本 JSON 形态：
 * - 现代（1.13+）：[VersionSpec.arguments] 的 jvm/game 数组，逐项做 rules 过滤与
 *   `${占位符}` 替换；
 * - 旧版：[VersionSpec.minecraftArguments] 空格串（仅 game 部分，JVM 参数仅保留
 *   内存与 classpath）。
 */
class LaunchArgsBuilder(
    private val os: String = RuleEvaluator.currentOs(),
    private val arch: String = RuleEvaluator.currentArch(),
) {

    /**
     * 构造 JVM 参数（不含 java 可执行文件本身；末尾为 -cp 与主类之后的 game 参数
     * 由 [buildGameArgs] 追加）。
     *
     * @param spec 合并继承链后的版本
     * @param options 用户启动选项
     * @param nativesDir natives 解压目录
     * @param classpath classpath 字符串（已用平台分隔符拼好）
     * @param librariesDir 共享 libraries 根目录（占位 ${library_directory}）
     */
    fun buildJvmArgs(
        spec: VersionSpec,
        options: LaunchOptions,
        nativesDir: Path,
        classpath: String,
        librariesDir: Path,
    ): List<String> {
        val args = mutableListOf<String>()
        options.minMemoryMb?.let { args += "-Xms${it}M" }
        options.maxMemoryMb?.let { args += "-Xmx${it}M" }
        args += options.extraJvmArgs

        val features = buildFeatures(spec, options)
        val substitutions = buildSubstitutions(spec, options, nativesDir, classpath, librariesDir)
        spec.arguments?.jvm
            ?.filter { RuleEvaluator.evaluate(it.rules, os, arch, features) }
            ?.forEach { arg -> args += arg.values.map { substitute(it, substitutions) } }

        args += "-Djava.library.path=${nativesDir.toAbsolutePath()}"
        args += "-cp"
        args += classpath
        return args
    }

    /**
     * 构造 game 参数。现代版本走 arguments.game；旧版本走 minecraftArguments。
     * 之后依次追加：demo、分辨率/全屏、服务器直连、用户附加参数。
     */
    fun buildGameArgs(spec: VersionSpec, options: LaunchOptions, gameDir: Path): List<String> {
        val substitutions = buildSubstitutions(spec, options, Path.of(""), "", Path.of(""), gameDir)
        val features = buildFeatures(spec, options)
        val args = mutableListOf<String>()

        val modern = spec.arguments?.game
        // 继承链合并后 arguments 恒非 null（可能为空列表）：旧版 minecraftArguments
        // 版本与现代 arguments 混合时，game 列表为空应回退到旧版参数串。
        if (!modern.isNullOrEmpty()) {
            modern.filter { RuleEvaluator.evaluate(it.rules, os, arch, features) }
                .forEach { arg -> args += arg.values.map { substitute(it, substitutions) } }
        } else if (spec.minecraftArguments != null) {
            args += spec.minecraftArguments.split(' ').filter { it.isNotBlank() }
                .map { substitute(it, substitutions) }
        }

        if (options.demo) args += "--demo"
        if (options.windowWidth != null && options.windowHeight != null) {
            args += listOf("--width", options.windowWidth.toString(), "--height", options.windowHeight.toString())
        }
        if (options.fullscreen) args += "--fullscreen"
        if (options.serverAddress != null) {
            args += listOf("--server", options.serverAddress)
            options.serverPort?.let { args += listOf("--port", it.toString()) }
        }
        args += options.extraGameArgs
        return args
    }

    /**
     * 一站式完整命令行：java、jvm 参数、主类、game 参数。
     *
     * @param gameDir 游戏工作目录（--version/game_directory 均基于它）
     */
    fun buildFullCommand(
        spec: VersionSpec,
        options: LaunchOptions,
        nativesDir: Path,
        classpath: String,
        librariesDir: Path,
        gameDir: Path,
    ): List<String> =
        listOf(options.javaExecutable) +
            buildJvmArgs(spec, options, nativesDir, classpath, librariesDir) +
            spec.mainClass +
            buildGameArgs(spec, options, gameDir)

    /** 依据选项推导激活的 feature 集合（供 rules 过滤）。 */
    fun buildFeatures(spec: VersionSpec, options: LaunchOptions): Map<String, Boolean> = mapOf(
        "is_demo_user" to options.demo,
        "has_custom_resolution" to (options.windowWidth != null && options.windowHeight != null),
        "has_quick_play_support" to spec.arguments?.game.orEmpty()
            .any { it.values.contains("${'$'}{quickPlayPath}") },
    )

    /** 全部占位符取值。 */
    private fun buildSubstitutions(
        spec: VersionSpec,
        options: LaunchOptions,
        nativesDir: Path,
        classpath: String,
        librariesDir: Path,
        gameDir: Path? = null,
    ): Map<String, String> {
    val gameDirValue = gameDir?.toAbsolutePath()?.toString() ?: options.gameDirectory ?: "."
    val subs = mutableMapOf(
        "auth_player_name" to options.playerName,
        "auth_uuid" to options.resolvedUuid.toString(),
        "auth_access_token" to options.accessToken,
        "auth_xuid" to "0",
        "clientid" to options.launcherName,
        "user_type" to "msa",
        "version_name" to spec.id,
        "version_type" to (spec.type ?: ""),
        "assets_index_name" to (spec.assetIndex?.id ?: spec.assets ?: "legacy"),
        "assets_root" to (if (gameDirValue == ".") "assets" else "$gameDirValue/assets"),
        "game_directory" to gameDirValue,
        "game_assets" to "${'$'}{game_assets}",
        "launcher_name" to options.launcherName,
        "launcher_version" to options.launcherVersion,
        "natives_directory" to nativesDir.toAbsolutePath().toString(),
        "classpath" to classpath,
        "classpath_separator" to pathSeparator,
        "library_directory" to librariesDir.toAbsolutePath().toString(),
        "quickPlayPath" to "${'$'}{quickPlayPath}",
        "quickPlaySingleplayer" to "${'$'}{quickPlaySingleplayer}",
        "quickPlayMultiplayer" to "${'$'}{quickPlayMultiplayer}",
        "quickPlayRealms" to "${'$'}{quickPlayRealms}",
        "user_properties" to "{}",
    )
    // 分辨率占位符仅在用户设置时替换，未设置则保留原样（该参数已被 feature 规则过滤）。
    options.windowWidth?.let { subs["resolution_width"] = it.toString() }
    options.windowHeight?.let { subs["resolution_height"] = it.toString() }
    return subs
    }

    /** 替换 `${key}` 占位符；无对应值的原样保留。 */
    private fun substitute(arg: String, subs: Map<String, String>): String =
        Regex("\\$\\{([a-zA-Z0-9_]+)\\}").replace(arg) { match ->
            subs[match.groupValues[1]] ?: match.value
        }

    private val pathSeparator: String = System.getProperty("path.separator") ?: ":"
}
