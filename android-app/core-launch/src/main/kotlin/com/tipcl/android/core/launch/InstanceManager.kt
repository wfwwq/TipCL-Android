package com.tipcl.android.core.launch

import java.nio.file.Files
import java.nio.file.Path

/** 一个实例（版本）在各共享目录中的路径集合。 */
data class InstancePaths(
    /** 实例 id（= versions 子目录名）。 */
    val id: String,
    /** 版本 JSON 所在目录 root/versions/<id>。 */
    val versionDir: Path,
    /** 版本 JSON 文件 root/versions/<id>/<id>.json。 */
    val versionJson: Path,
    /** 共享 libraries 目录。 */
    val librariesDir: Path,
    /** 共享 assets 目录。 */
    val assetsDir: Path,
    /** 共享 logs 目录。 */
    val logsDir: Path,
    /** 共享 saves 目录。 */
    val savesDir: Path,
)

/**
 * 实例（游戏版本）管理器，负责 Mojang 风格的根目录布局：
 *
 * ```
 * root/
 *   versions/<id>/<id>.json (+ 可选 <id>.jar)
 *   libraries/            # 共享 Maven 布局构件库
 *   assets/               # 共享资源对象库（objects/indexes）
 *   logs/
 *   saves/
 *   meta/                 # 版本清单等缓存（VersionManifestFetcher 使用）
 * ```
 *
 * id 即实例标识；删除实例只移除其 versions 子目录，libraries/assets 共享保留。
 */
class InstanceManager(private val root: Path) {

    /** 各共享目录路径（不主动创建）。 */
    val librariesDir: Path get() = root.resolve("libraries")
    val assetsDir: Path get() = root.resolve("assets")
    val logsDir: Path get() = root.resolve("logs")
    val savesDir: Path get() = root.resolve("saves")

    /** 创建实例：写入版本 JSON，返回路径集合（目录随之创建）。 */
    fun installInstance(id: String, versionJsonText: String): InstancePaths {
        require(id.isNotBlank() && !id.contains('/') && !id.contains('\\') && id != "." && id != "..") {
            "非法实例 id: $id"
        }
        val versionDir = root.resolve("versions").resolve(id)
        Files.createDirectories(versionDir)
        val jsonFile = versionDir.resolve("$id.json")
        Files.writeString(jsonFile, versionJsonText)
        return pathsFor(id)
    }

    /** 组装实例路径集合（不检查存在性）。 */
    fun pathsFor(id: String): InstancePaths = InstancePaths(
        id = id,
        versionDir = root.resolve("versions").resolve(id),
        versionJson = root.resolve("versions").resolve(id).resolve("$id.json"),
        librariesDir = librariesDir,
        assetsDir = assetsDir,
        logsDir = logsDir,
        savesDir = savesDir,
    )

    /** 列出全部已安装实例（扫描 versions 下含同名 .json 的目录），按 id 排序。 */
    fun listInstances(): List<InstancePaths> {
        val versionsRoot = root.resolve("versions")
        if (!Files.isDirectory(versionsRoot)) return emptyList()
        return Files.list(versionsRoot).use { stream ->
            stream.filter { Files.isDirectory(it) }
                .map { dir ->
                    val id = dir.fileName.toString()
                    if (Files.isRegularFile(dir.resolve("$id.json"))) id else null
                }
                .toList()
                .filterNotNull()
                .sorted()
                .map { pathsFor(it) }
        }
    }

    /** 删除实例：递归移除 versions/<id>；共享目录不受影响。 */
    fun deleteInstance(id: String): Boolean {
        val dir = root.resolve("versions").resolve(id)
        if (!Files.exists(dir)) return false
        deleteRecursively(dir)
        return true
    }

    /** 读取实例版本 JSON 并解析为 [VersionSpec]；文件缺失或损坏抛 [LaunchException]。 */
    fun loadVersionSpec(paths: InstancePaths): VersionSpec {
        if (!Files.isRegularFile(paths.versionJson)) {
            throw LaunchException("版本 JSON 不存在: ${paths.versionJson}")
        }
        return try {
            VersionSpec.parse(Files.readString(paths.versionJson))
        } catch (e: Exception) {
            throw LaunchException("解析版本 JSON 失败: ${paths.versionJson} (${e.message})", e)
        }
    }

    private fun deleteRecursively(dir: Path) {
        if (Files.isDirectory(dir)) {
            Files.list(dir).use { stream -> stream.forEach { deleteRecursively(it) } }
        }
        Files.deleteIfExists(dir)
    }
}
