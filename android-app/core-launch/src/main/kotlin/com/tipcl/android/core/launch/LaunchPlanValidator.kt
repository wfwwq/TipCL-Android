package com.tipcl.android.core.launch

import java.nio.file.Files

/** 体检问题的机器可读分类。 */
enum class ValidationCode {
    /** 实例版本 JSON 文件不存在。 */
    VERSION_JSON_MISSING,

    /** 版本 JSON 存在但无法解析。 */
    VERSION_JSON_CORRUPT,

    /** 继承链上的父版本 JSON 不存在。 */
    PARENT_MISSING,

    /** 主类名为空/非法。 */
    MAIN_CLASS_INVALID,

    /** classpath 为空（library 全被规则过滤或声明为空）。 */
    CLASSPATH_EMPTY,

    /** assetIndex 声明存在但索引 JSON 文件缺失。 */
    ASSET_INDEX_MISSING,

    /** 资源对象有缺失。 */
    ASSETS_INCOMPLETE,

    /** 所需 JRE 未就绪。 */
    RUNTIME_NOT_READY,

    /**
     * 主类是 mod loader 主类（Forge/Quilt/Fabric），但 libraries 中找不到
     * 对应加载器构件——loader 安装未完成或 finalize 丢失。
     */
    LOADER_LIBRARIES_MISSING,
}

/** 问题严重级别：ERROR 阻止启动，WARNING 可放行。 */
enum class ValidationSeverity { ERROR, WARNING }

/** 一条结构化的体检结果（供 UI 显示"缺什么"）。 */
data class ValidationIssue(
    val code: ValidationCode,
    val severity: ValidationSeverity,
    /** 人类可读描述。 */
    val message: String,
) {
    override fun toString(): String = "[$severity] $code: $message"
}

/**
 * 启动前体检：不抛异常，逐项收集问题并以结构化清单返回。
 *
 * 检查项：版本 JSON 存在且可解析、继承链完整、classpath 非空、
 * assets 索引与对象完整度、mainClass 可读、JRE 就绪。
 *
 * @param instanceManager 实例/版本存储
 * @param libraryResolver library 解析器（classpath 非空判断需与 LaunchService 同源）
 * @param runtimeReady JRE 就绪判定函数；通常为 `{ provisioner.isRuntimeReady(it) }`。
 *   options.javaExecutable 非空时本项自动跳过
 */
class LaunchPlanValidator(
    private val instanceManager: InstanceManager,
    private val libraryResolver: LibraryResolver = LibraryResolver(),
    private val runtimeReady: (RuntimeRequirement) -> Boolean = { true },
) {

    /**
     * 对实例执行全部检查，返回问题清单（为空即可启动）。
     * 版本 JSON 缺失/损坏时提前返回（后续检查无法进行）。
     */
    fun validate(instanceId: String, options: LaunchOptions): List<ValidationIssue> {
        val issues = mutableListOf<ValidationIssue>()
        val paths = instanceManager.pathsFor(instanceId)

        val child = try {
            instanceManager.loadVersionSpec(paths)
        } catch (e: LaunchException) {
            val missing = !Files.isRegularFile(paths.versionJson)
            return listOf(
                ValidationIssue(
                    if (missing) ValidationCode.VERSION_JSON_MISSING else ValidationCode.VERSION_JSON_CORRUPT,
                    ValidationSeverity.ERROR,
                    e.message ?: "版本 JSON 加载失败",
                ),
            )
        }

        // 继承链逐节点合并，收集父版本缺失问题
        var merged = child
        var spec = child
        val seen = mutableSetOf(instanceId)
        while (spec.inheritsFrom != null) {
            val parentId = spec.inheritsFrom!!
            if (!seen.add(parentId)) break
            if (seen.size > LaunchService.MAX_INHERIT_DEPTH) break
            val parentPaths = instanceManager.pathsFor(parentId)
            if (!Files.isRegularFile(parentPaths.versionJson)) {
                issues.add(
                    ValidationIssue(
                        ValidationCode.PARENT_MISSING,
                        ValidationSeverity.ERROR,
                        "父版本 JSON 不存在: $parentId（被 ${spec.id} 继承）",
                    ),
                )
                break
            }
            spec = try {
                instanceManager.loadVersionSpec(parentPaths)
            } catch (e: LaunchException) {
                issues.add(
                    ValidationIssue(
                        ValidationCode.VERSION_JSON_CORRUPT,
                        ValidationSeverity.ERROR,
                        "父版本 JSON 损坏: $parentId (${e.message})",
                    ),
                )
                break
            }
            merged = merged.mergeWithParent(spec)
        }

        if (merged.mainClass.isBlank()) {
            issues.add(
                ValidationIssue(
                    ValidationCode.MAIN_CLASS_INVALID,
                    ValidationSeverity.ERROR,
                    "主类名为空（版本 ${merged.id}）",
                ),
            )
        }

        // classpath 非空（library 解析失败时视为空）
        val resolution = runCatching {
            libraryResolver.resolve(merged.libraries, features = emptyMap())
        }.getOrNull()
        if (resolution == null || resolution.classpath.isEmpty()) {
            issues.add(
                ValidationIssue(
                    ValidationCode.CLASSPATH_EMPTY,
                    ValidationSeverity.ERROR,
                    "classpath 为空：library 全被规则过滤或未声明",
                ),
            )
        }

        // loader 主类必须有对应加载器构件（Forge/Quilt/Fabric 派生版本体检）
        val loaderGroup = loaderGroupOf(merged.mainClass)
        if (loaderGroup != null && resolution != null &&
            resolution.classpath.none { it.name.startsWith(loaderGroup) }
        ) {
            issues.add(
                ValidationIssue(
                    ValidationCode.LOADER_LIBRARIES_MISSING,
                    ValidationSeverity.ERROR,
                    "$loaderGroup 加载器构件缺失（主类 ${merged.mainClass}）：libraries 中没有 $loaderGroup 声明，mod loader 安装可能未完成",
                ),
            )
        }

        // assets 完整度
        merged.assetIndex?.let { indexInfo ->
            val indexFile = paths.assetsDir.resolve("indexes").resolve("${indexInfo.id}.json")
            if (!Files.isRegularFile(indexFile)) {
                issues.add(
                    ValidationIssue(
                        ValidationCode.ASSET_INDEX_MISSING,
                        ValidationSeverity.ERROR,
                        "资源索引缺失: assets/indexes/${indexInfo.id}.json",
                    ),
                )
            } else {
                val missing = try {
                    LaunchService(instanceManager, libraryResolver).computeMissingAssets(merged, paths.assetsDir)
                } catch (_: Exception) {
                    null
                }
                if (missing != null && missing.isNotEmpty()) {
                    issues.add(
                        ValidationIssue(
                            ValidationCode.ASSETS_INCOMPLETE,
                            ValidationSeverity.WARNING,
                            "资源对象缺失 ${missing.size} 个（索引 ${indexInfo.id}）",
                        ),
                    )
                }
            }
        }

        // JRE 就绪（用户显式指定 java 可执行文件时跳过）
        if (options.javaExecutable.isBlank()) {
            val requirement = RuntimeRequirement(merged.javaVersion?.majorVersion ?: LaunchService.DEFAULT_JAVA_MAJOR)
            val ready = runCatching { runtimeReady(requirement) }.getOrDefault(false)
            if (!ready) {
                issues.add(
                    ValidationIssue(
                        ValidationCode.RUNTIME_NOT_READY,
                        ValidationSeverity.ERROR,
                        "所需运行时未就绪: ${requirement.displayName}",
                    ),
                )
            }
        }

        return issues
    }

    /** 主类所属 mod loader 的 Maven group 前缀；非 loader 主类返回 null。 */
    private fun loaderGroupOf(mainClass: String): String? = when {
        mainClass.startsWith("cpw.mods.") -> "net.minecraftforge"
        mainClass.startsWith("org.quiltmc.loader.") -> "org.quiltmc"
        mainClass.startsWith("net.fabricmc.loader.") -> "net.fabricmc"
        else -> null
    }
}
