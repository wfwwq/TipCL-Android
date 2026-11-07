package com.tipcl.android.core.launch

import kotlinx.serialization.Serializable
import java.io.ByteArrayInputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.security.MessageDigest
import java.util.concurrent.TimeUnit
import java.util.zip.ZipInputStream

/**
 * Fabric 模组（mods 目录）管理器，基于 [InstanceManager] 的实例根目录：
 *
 * ```
 * root/mods/<modid>.jar          启用
 * root/mods/<modid>.jar.disabled 禁用（改名实现）
 * ```
 *
 * fabric.mod.json 从 mod jar 内读取（ZipInputStream 扫描 META 入口），
 * 提供 id/version/depends 的简单冲突检查（依赖是否由已安装 mod 提供，
 * 版本约束做宽松匹配：原样相等或忽略 `^~>=<` 前缀后的主版本前缀匹配）。
 *
 * 下载通过 [downloader] 抽象：生产默认 OkHttp，测试注入假实现；可选 sha1 校验。
 */
class ModManager(
    private val root: Path,
    /** 文件下载器：输入 URL 返回字节流；失败应抛异常。 */
    private val downloader: (String) -> ByteArray = DEFAULT_DOWNLOADER,
) {

    /** mods 目录（不主动创建）。 */
    val modsDir: Path get() = root.resolve("mods")

    /** fabric.mod.json 的最小模型。 */
    @Serializable
    data class FabricModJson(
        val id: String,
        val version: String? = null,
        val name: String? = null,
        /** 依赖声明：modid -> 版本约束（空串表示任意）。 */
        val depends: Map<String, String> = emptyMap(),
        /** 冲突声明：modid -> 版本约束。 */
        val breaks: Map<String, String> = emptyMap(),
        /** 本 mod 提供的替代 id（depends 满足判定时一并计入）。 */
        val provides: List<String> = emptyList(),
    )

    /** mods 目录中一个条目。 */
    data class InstalledMod(
        val fileName: String,
        /** false 表示处于禁用状态（.disabled 后缀）。 */
        val enabled: Boolean,
        /** 从 jar 内 fabric.mod.json 解析出的元数据；不可解析为 null。 */
        val info: FabricModJson?,
    )

    /** 依赖检查结果：缺失或冲突的 modid 及原因。 */
    data class DependencyIssue(val modId: String, val reason: String)

    /** 列出 mods 目录全部条目（按文件名排序；目录不存在返回空）。 */
    fun listMods(): List<InstalledMod> {
        if (!Files.isDirectory(modsDir)) return emptyList()
        return Files.list(modsDir).use { stream ->
            stream.filter { Files.isRegularFile(it) }
                .map { p ->
                    val name = p.fileName.toString()
                    if (name.endsWith(DISABLED_SUFFIX)) {
                        InstalledMod(name.removeSuffix(DISABLED_SUFFIX), enabled = false,
                            info = readModJson(p))
                    } else {
                        InstalledMod(name, enabled = true, info = readModJson(p))
                    }
                }
                .toList()
                .sortedBy { it.fileName }
        }
    }

    /**
     * 安装本地 mod 文件：复制到 mods 目录为 `<原文件名>.jar`（无后缀文件补 .jar）。
     * [expectedSha1] 非 null 时先校验，不匹配抛 [LaunchException]。
     */
    fun installMod(source: Path, expectedSha1: String? = null): Path {
        require(Files.isRegularFile(source)) { "mod 源文件不存在: $source" }
        if (expectedSha1 != null) verifySha1(Files.readAllBytes(source), expectedSha1, source.fileName.toString())
        Files.createDirectories(modsDir)
        val targetName = source.fileName.toString().let { if (it.endsWith(".jar")) it else "$it.jar" }
        val target = uniqueTarget(targetName)
        return Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING)
    }

    /**
     * 从 [url] 下载 mod 文件安装（字节写入临时文件后走 [installMod]）。
     * [expectedSha1] 非 null 时校验，不匹配抛 [LaunchException]。
     */
    fun downloadMod(url: String, expectedSha1: String? = null): Path {
        val bytes = runCatching { downloader(url) }
            .getOrElse { throw LaunchException("下载 mod 失败: $url (${it.message})", it) }
        if (expectedSha1 != null) verifySha1(bytes, expectedSha1, url)
        Files.createDirectories(modsDir)
        val name = url.substringBefore('?').substringAfterLast('/').ifBlank { "mod.jar" }
        val targetName = name.let { if (it.endsWith(".jar")) it else "$it.jar" }
        val target = uniqueTarget(targetName)
        Files.write(target, bytes)
        return target
    }

    /** 删除 mod 文件（启用态或禁用态均可），不存在返回 false。 */
    fun deleteMod(fileName: String): Boolean {
        val direct = modsDir.resolve(fileName)
        val disabled = modsDir.resolve(fileName + DISABLED_SUFFIX)
        return when {
            Files.isRegularFile(direct) -> { Files.delete(direct); true }
            Files.isRegularFile(disabled) -> { Files.delete(disabled); true }
            else -> false
        }
    }

    /** 禁用：改名加 `.disabled` 后缀。已是禁用态或不存在返回 false。 */
    fun disableMod(fileName: String): Boolean {
        val direct = modsDir.resolve(fileName)
        if (!Files.isRegularFile(direct)) return false
        Files.move(direct, modsDir.resolve(fileName + DISABLED_SUFFIX), StandardCopyOption.REPLACE_EXISTING)
        return true
    }

    /** 启用：去掉 `.disabled` 后缀。已是启用态或不存在返回 false。 */
    fun enableMod(fileName: String): Boolean {
        val disabled = modsDir.resolve(fileName + DISABLED_SUFFIX)
        if (!Files.isRegularFile(disabled)) return false
        Files.move(disabled, modsDir.resolve(fileName), StandardCopyOption.REPLACE_EXISTING)
        return true
    }

    /**
     * 依赖冲突检查：[candidate] 的每个 depends 须由 [installed] 中某 mod 的
     * id/provides 提供，且版本约束满足（宽松匹配）；breaks 命中即冲突。
     * 返回全部问题，为空表示可安装。
     */
    fun checkDependencies(candidate: FabricModJson, installed: List<InstalledMod>): List<DependencyIssue> {
        val providedIds = installed.asSequence()
            .filter { it.enabled && it.info != null }
            .flatMap { m ->
                val info = m.info!!
                buildList {
                    add(info.id to info.version)
                    info.provides.forEach { add(it to info.version) }
                }
            }
            .toList()

        val issues = mutableListOf<DependencyIssue>()
        for ((depId, constraint) in candidate.depends) {
            val match = providedIds.firstOrNull { it.first == depId }
            if (match == null) {
                issues.add(DependencyIssue(depId, "缺失依赖：未安装 $depId"))
            } else if (!constraintSatisfied(match.second, constraint)) {
                issues.add(DependencyIssue(depId, "版本不满足：需要 $constraint，实际 ${match.second ?: "未知"}"))
            }
        }
        for ((breakId, constraint) in candidate.breaks) {
            val match = providedIds.firstOrNull { it.first == breakId }
            if (match != null && constraintSatisfied(match.second, constraint)) {
                issues.add(DependencyIssue(breakId, "与已安装 mod 冲突：breaks $breakId $constraint"))
            }
        }
        return issues
    }

    /** 读取 mod jar 内的 fabric.mod.json；无法读取/解析返回 null。 */
    fun readModJson(jar: Path): FabricModJson? {
        if (!Files.isRegularFile(jar)) return null
        return try {
            ZipInputStream(Files.newInputStream(jar)).use { zip ->
                var entry = zip.nextEntry
                while (entry != null) {
                    if (!entry.isDirectory && entry.name == FABRIC_MOD_JSON) {
                        return parseFabricModJson(zip.readBytes().decodeToString())
                    }
                    entry = zip.nextEntry
                }
                null
            }
        } catch (_: Exception) {
            null
        }
    }

    /** 解析 fabric.mod.json 文本；非法返回 null。 */
    fun parseFabricModJson(text: String): FabricModJson? = try {
        MOD_JSON.decodeFromString(FabricModJson.serializer(), text)
    } catch (_: Exception) {
        null
    }

    private fun uniqueTarget(targetName: String): Path {
        var target = modsDir.resolve(targetName)
        var i = 1
        while (Files.exists(target)) {
            val dot = targetName.lastIndexOf('.')
            val base = if (dot > 0) targetName.substring(0, dot) else targetName
            val ext = if (dot > 0) targetName.substring(dot) else ""
            target = modsDir.resolve("$base-$i$ext")
            i++
        }
        return target
    }

    private fun verifySha1(bytes: ByteArray, expected: String, label: String) {
        val actual = MessageDigest.getInstance("SHA-1").digest(bytes)
            .joinToString("") { "%02x".format(it) }
        if (!actual.equals(expected.lowercase(), ignoreCase = false)) {
            throw LaunchException("SHA1 校验失败: $label 期望 $expected 实际 $actual")
        }
    }

    companion object {
        const val FABRIC_MOD_JSON = "fabric.mod.json"
        const val DISABLED_SUFFIX = ".disabled"

        private val MOD_JSON = kotlinx.serialization.json.Json { ignoreUnknownKeys = true }

        /**
         * 版本约束宽松匹配：空约束或 `*` 任意；支持 `>=/<=/>/</^/~/=/无前缀`。
         * 比较段均为数字时逐段比较（短版本补 0）；否则退化为字符串前缀匹配。
         * `^`/`~` 视为"主版本相同即可"（不实现完整 SemVer 语义）。
         */
        internal fun constraintSatisfied(version: String?, constraint: String): Boolean {
            val raw = constraint.trim()
            if (raw.isBlank() || raw == "*") return true
            if (version == null) return false
            if (version == raw) return true

            val op = when {
                raw.startsWith(">=") -> ">="; raw.startsWith("<=") -> "<="
                raw.startsWith(">") -> ">"; raw.startsWith("<") -> "<"
                raw.startsWith("^") || raw.startsWith("~") -> "^"
                raw.startsWith("=") -> "="
                else -> ""
            }
            val cleaned = raw.removePrefix(">=") .removePrefix("<=") .removePrefix(">")
                .removePrefix("<").removePrefix("^").removePrefix("~")
                .removePrefix("=").trim()
            if (cleaned.isBlank()) return true
            val cmp = compareVersions(version, cleaned) ?: return version.startsWith(cleaned)
            return when (op) {
                ">=" -> cmp >= 0
                ">" -> cmp > 0
                "<=" -> cmp <= 0
                "<" -> cmp < 0
                "=" -> cmp == 0
                // ^ / ~：宽松视为主版本相同即可
                "^" -> compareVersions(version.substringBefore('-'), cleaned.substringBefore('-').let { "$it.0" })?.let { it >= 0 } == true
                else -> version.startsWith(cleaned)
            }
        }

        /** 逐段数字比较，两版本段数可不同（短者补 0）；含非数字段返回 null。 */
        private fun compareVersions(a: String, b: String): Int? {
            val as_ = a.split('.')
            val bs = b.split('.')
            val n = maxOf(as_.size, bs.size)
            for (i in 0 until n) {
                val av = as_.getOrNull(i)?.toIntOrNull() ?: return null
                val bv = bs.getOrNull(i)?.toIntOrNull() ?: return null
                if (av != bv) return av.compareTo(bv)
            }
            return 0
        }

        private val DEFAULT_DOWNLOADER: (String) -> ByteArray = { url ->
            val client = okhttp3.OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build()
            client.newCall(okhttp3.Request.Builder().url(url).build()).execute().use { resp ->
                val body = resp.body?.bytes()
                if (!resp.isSuccessful || body == null) {
                    throw LaunchException("下载 HTTP ${resp.code}: $url")
                }
                body
            }
        }
    }
}
