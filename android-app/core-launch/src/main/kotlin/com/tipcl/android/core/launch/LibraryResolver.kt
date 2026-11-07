package com.tipcl.android.core.launch

import java.nio.file.Path

/**
 * Maven 仓库描述：负责按 Maven 布局从 base URL 拼装构件下载地址。
 *
 * 默认提供 Mojang libraries、Fabric maven 与 BMCLAPI 镜像三个常量；
 * 传入自定义 base 即可整体替换下载源。
 */
data class MavenRepository(val base: String) {
    /**
     * 拼装构件 URL：`base/group/path/artifact/version/artifact-version[-classifier].ext`。
     * base 结尾的 `/` 会自动归一。
     */
    fun urlFor(group: String, artifact: String, version: String, classifier: String?, ext: String): String {
        val b = base.trimEnd('/')
        val g = group.replace('.', '/')
        val tail = if (classifier.isNullOrEmpty()) {
            "$artifact-$version.$ext"
        } else {
            "$artifact-$version-$classifier.$ext"
        }
        return "$b/$g/$artifact/$version/$tail"
    }

    companion object {
        /** Mojang 官方 libraries 仓库。 */
        val MOJANG_LIBRARIES = MavenRepository("https://libraries.minecraft.net")

        /** Mojang piston-meta 资源索引 base。 */
        const val MOJANG_META = "https://piston-meta.mojang.com"

        /** Mojang resources（assets 对象文件）base。 */
        const val MOJANG_RESOURCES = "https://resources.download.minecraft.net"

        /** Fabric 官方 maven。 */
        val FABRIC_MAVEN = MavenRepository("https://maven.fabricmc.net")

        /** BMCLAPI 镜像（中国大陆加速），替换 libraries 与 assets 下载源。 */
        val BMCLAPI = MavenRepository("https://bmclapi2.bangbang93.com/maven")
    }
}

/**
 * 解析结果中的一个待处理构件。
 *
 * @param name Maven 坐标原文
 * @param relativePath 相对 libraries 根目录的 Maven 布局路径，可直接用于 classpath
 * @param url 下载地址
 * @param sha1 校验和（官方 JSON 提供；老版本自拼 URL 时为 null）
 * @param size 预期字节数（未知为 0）
 * @param isNative true 表示这是 natives 构件，需解压而非进 classpath
 */
data class ResolvedLibrary(
    val name: String,
    val relativePath: String,
    val url: String,
    val sha1: String?,
    val size: Long,
    val isNative: Boolean,
)

/** LibraryResolver 的输出：classpath 构件（保序去重）与当前平台的 natives 构件。 */
data class LibraryResolution(
    /** 依版本 JSON 声明顺序排列、已去重的 classpath 构件。 */
    val classpath: List<ResolvedLibrary>,
    /** 需解压到 natives 目录的构件。 */
    val natives: List<ResolvedLibrary>,
    /** 继承链中所有 native classifier 的并集（诊断用）。 */
    val nativeClassifiers: Map<String, String>,
)

/**
 * 将版本（含继承链合并后的）library 列表解析为下载清单与 classpath。
 *
 * @param repository 镜像源：非 null 时所有 library 下载 URL 改为该仓库按
 *   Maven 布局拼装；null 时使用 JSON 自带 URL（无则回退 [fallbackRepository]）
 */
class LibraryResolver(
    private val repository: MavenRepository? = null,
    private val fallbackRepository: MavenRepository = MavenRepository.MOJANG_LIBRARIES,
) {

    /**
     * 解析 library 列表。
     *
     * @param libraries 合并继承链后的 library 列表（[VersionSpec.mergeWithParent] 产出）
     * @param os 当前系统名，默认自动检测
     * @param arch 当前架构，默认自动检测
     * @param features 启动 feature 集合
     */
    fun resolve(
        libraries: List<VersionSpec.Library>,
        os: String = RuleEvaluator.currentOs(),
        arch: String = RuleEvaluator.currentArch(),
        features: Map<String, Boolean> = emptyMap(),
    ): LibraryResolution {
        val classpath = LinkedHashMap<String, ResolvedLibrary>()
        val natives = LinkedHashMap<String, ResolvedLibrary>()
        val classifiers = LinkedHashMap<String, String>()

        for (lib in libraries) {
            if (!RuleEvaluator.evaluate(lib.rules, os, arch, features)) continue
            lib.natives[os]?.let { classifiers[lib.name] = it }

            val coords = parseCoords(lib.name)
            if (coords == null) continue
            val (group, artifact, version, libClassifier, ext) = coords
            val jarExt = ext ?: "jar"

            // 主构件：优先 downloads.artifact，缺失则按 Maven 布局拼装；
            // 仅声明 name+url（fabric-meta profile JSON 形态）时以 url 为自定义仓库 base
            val artifactInfo = lib.downloads?.artifact
            if (artifactInfo?.url != null || lib.downloads != null || lib.url != null) {
                val url = resolveUrl(artifactInfo?.url, group, artifact, version, libClassifier, jarExt, lib.url)
                val rel = mavenRelativePath(group, artifact, version, libClassifier, jarExt)
                classpath[lib.name] = ResolvedLibrary(
                    name = lib.name,
                    relativePath = rel,
                    url = url,
                    sha1 = artifactInfo?.sha1,
                    size = artifactInfo?.size ?: 0,
                    isNative = false,
                )
            }

            // natives 构件：仅当该平台声明了 classifier
            val nativeClassifier = lib.natives[os]
            if (nativeClassifier != null) {
                val nativeInfo = lib.downloads?.classifiers?.get(nativeClassifier)
                val nativeUrl = resolveUrl(nativeInfo?.url, group, artifact, version, nativeClassifier, "jar")
                val nativeRel = mavenRelativePath(group, artifact, version, nativeClassifier, "jar")
                natives[lib.name] = ResolvedLibrary(
                    name = lib.name,
                    relativePath = nativeRel,
                    url = nativeUrl,
                    sha1 = nativeInfo?.sha1,
                    size = nativeInfo?.size ?: 0,
                    isNative = true,
                )
            }
        }
        return LibraryResolution(classpath.values.toList(), natives.values.toList(), classifiers)
    }

    /** 计算 classpath 字符串（绝对路径，平台分隔符），natives 不包含在内。 */
    fun classpathEntries(resolution: LibraryResolution, librariesRoot: Path): List<String> =
        resolution.classpath.map { librariesRoot.resolve(it.relativePath).toAbsolutePath().toString() }

    /** 构造 natives 解压时的排除清单默认值（META-INF 等恒排除）。 */
    fun defaultExtractExcludes(): List<String> = listOf(
        "META-INF/",
        ".signature",
    )

    /**
     * 下载 URL 决策：镜像源优先；否则使用 JSON 自带 URL；
     * JSON 未提供时回退 [fallbackRepository] 按 Maven 布局拼装。
     */
    private fun resolveUrl(
        jsonUrl: String?,
        group: String,
        artifact: String,
        version: String,
        classifier: String?,
        ext: String,
        baseUrl: String? = null,
    ): String {
        repository?.let { return it.urlFor(group, artifact, version, classifier, ext) }
        if (!jsonUrl.isNullOrBlank()) return jsonUrl
        if (!baseUrl.isNullOrBlank()) return MavenRepository(baseUrl).urlFor(group, artifact, version, classifier, ext)
        return fallbackRepository.urlFor(group, artifact, version, classifier, ext)
    }

    /** 解析 `group:artifact:version[:classifier][@ext]` 坐标，不合法返回 null。 */
    internal fun parseCoords(name: String): Array<String>? {
        val (coordsPart, ext) = name.split('@', limit = 2).let { it[0] to it.getOrElse(1) { "jar" } }
        val parts = coordsPart.split(':')
        if (parts.size < 3) return null
        return arrayOf(parts[0], parts[1], parts[2], parts.getOrNull(3) ?: "", ext)
    }

    private fun mavenRelativePath(group: String, artifact: String, version: String, classifier: String?, ext: String): String {
        val g = group.replace('.', '/')
        val tail = if (classifier.isNullOrEmpty()) "$artifact-$version.$ext" else "$artifact-$version-$classifier.$ext"
        return "$g/$artifact/$version/$tail"
    }
}
