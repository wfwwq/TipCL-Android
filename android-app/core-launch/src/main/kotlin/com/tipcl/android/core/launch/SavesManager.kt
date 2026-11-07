package com.tipcl.android.core.launch

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.util.concurrent.ConcurrentHashMap
import java.util.zip.Deflater
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream
import java.util.zip.ZipOutputStream
import kotlin.io.path.outputStream

/**
 * Minecraft 存档管理与备份回滚器（对标桌面端 TipCL 的"打包备份 + 回滚前先备份当前状态"）。
 *
 * 目录布局（与 [InstanceManager] 对齐，saves 为实例根下的共享目录）：
 *
 * ```
 * <root>/saves/<世界名>/level.dat, region/ ...          # 存档本体（只做文件级操作）
 * <appData>/backups/<世界名>/<时间戳>-<note>.zip        # 备份包（zip 内含 manifest.json）
 * ```
 *
 * 设计要点：
 * - 不解析 NBT：世界名即目录名，元数据全部来自文件系统（修改时间/大小）。
 * - 备份 zip：目录结构保留；按扩展名选择 Store（已压缩格式）或 Deflate。
 * - 恢复原子性：先解压到暂存目录再 rename 交换；旧目录改名保留，新目录就位成功后才删除，
 *   中途任一步失败都可回退原名。
 * - 安全网：restoreWorld 在覆盖前**强制**把当前存档再备份一份（manifest.source = safety-net），
 *   该行为不可关闭、不可跳过。
 * - 并发保护：按世界名的锁表，同一世界同时只允许一个备份/恢复操作，冲突抛 [LaunchException]。
 */
class SavesManager(
    /** 实例根目录（其下 saves/ 为存档根）。 */
    private val root: Path,
    /** 应用数据目录（其下 backups/ 为备份根）。 */
    private val appData: Path,
) {

    val savesDir: Path get() = root.resolve("saves")
    val backupsDir: Path get() = appData.resolve("backups")

    // ---------------------------------------------------------------- 存档列表

    /** saves 下一个世界条目。 */
    data class WorldInfo(
        val dirName: String,
        /** 不解析 NBT，世界名即目录名。 */
        val name: String,
        /** 最近修改时间（epoch millis，取目录 mtime 与内部文件最大 mtime 的较大者）。 */
        val lastModified: Long,
        /** 递归统计的总大小（字节）。 */
        val sizeBytes: Long,
        /** 递归文件数。 */
        val fileCount: Int,
    )

    /** 列出 [instanceId] 实例（saves/ 下）的全部世界，按目录名排序。目录不存在返回空。 */
    fun listWorlds(instanceId: String): List<WorldInfo> {
        if (!Files.isDirectory(savesDir)) return emptyList()
        return Files.list(savesDir).use { stream ->
            stream.filter { Files.isDirectory(it) }
                .map { dir ->
                    val stat = dirStat(dir)
                    WorldInfo(
                        dirName = dir.fileName.toString(),
                        name = dir.fileName.toString(),
                        lastModified = stat.second,
                        sizeBytes = stat.first,
                        fileCount = stat.third,
                    )
                }
                .toList()
                .sortedBy { it.dirName }
        }
    }

    /** 递归统计目录：(总字节, 最大 mtime, 文件数)。 */
    private fun dirStat(dir: Path): Triple<Long, Long, Int> {
        var bytes = 0L
        var mtime = Files.getLastModifiedTime(dir).toMillis()
        var count = 0
        Files.walk(dir).use { stream ->
            stream.filter { Files.isRegularFile(it) }.forEach { f ->
                bytes += Files.size(f)
                val fm = Files.getLastModifiedTime(f).toMillis()
                if (fm > mtime) mtime = fm
                count++
            }
        }
        return Triple(bytes, mtime, count)
    }

    // ---------------------------------------------------------------- 备份

    /** 一个备份包的元信息（来自文件名与 zip 内 manifest，读取失败时字段为 null）。 */
    data class BackupInfo(
        val world: String,
        val fileName: String,
        val path: Path,
        val sizeBytes: Long,
        val lastModified: Long,
        val manifest: BackupManifest?,
    )

    @Serializable
    data class BackupManifest(
        val world: String,
        val instanceId: String,
        val note: String,
        val createdAt: Long,
        val totalBytes: Long,
        val fileCount: Int,
        /** normal = 手动备份；safety-net = 恢复前自动安全网（不可关闭）。 */
        val source: String,
    )

    /**
     * 备份世界 `saves/<world>` 为 `<appData>/backups/<world>/<时间戳>-<note>.zip`。
     * zip 内首条目为 `manifest.json`，其余按保留目录结构打包。
     * 同一世界已有备份/恢复进行中时抛 [LaunchException]。
     */
    fun backupWorld(instanceId: String, world: String, note: String = ""): Path {
        checkWorldName(world)
        return withWorldLock(instanceId, world) { doBackup(instanceId, world, note, source = SOURCE_NORMAL) }
    }

    private fun doBackup(instanceId: String, world: String, note: String, source: String): Path {
        val worldDir = savesDir.resolve(world)
        if (!Files.isDirectory(worldDir)) {
            throw LaunchException("世界不存在: $world (于 $savesDir)")
        }
        val targetDir = backupsDir.resolve(world)
        Files.createDirectories(targetDir)
        val stat = dirStat(worldDir)
        val manifest = BackupManifest(
            world = world,
            instanceId = instanceId,
            note = note,
            createdAt = System.currentTimeMillis(),
            totalBytes = stat.first,
            fileCount = stat.third,
            source = source,
        )
        val zipPath = targetDir.resolve("${formatTimestamp(manifest.createdAt)}-${sanitize(note)}.zip")
        ZipOutputStream(Files.newOutputStream(zipPath).buffered()).use { zip ->
            zip.setLevel(Deflater.BEST_SPEED)
            zip.putNextEntry(ZipEntry(MANIFEST_ENTRY))
            zip.write(JSON.encodeToString(BackupManifest.serializer(), manifest).toByteArray())
            zip.closeEntry()
            Files.walk(worldDir).use { stream ->
                stream.filter { Files.isRegularFile(it) }.sorted().forEach { f ->
                    val rel = worldDir.relativize(f).toString().replace(File.separatorChar, '/')
                    val entry = ZipEntry("$world/$rel")
                    if (isPrecompressed(rel)) entry.method = ZipEntry.STORED
                    // STORED 需要预先填好 size/crc
                    if (entry.method == ZipEntry.STORED) {
                        val crc = java.util.zip.CRC32()
                        Files.newInputStream(f).use { input ->
                            val buf = ByteArray(64 * 1024)
                            while (true) {
                                val n = input.read(buf)
                                if (n < 0) break
                                crc.update(buf, 0, n)
                            }
                        }
                        entry.size = Files.size(f)
                        entry.crc = crc.value
                    }
                    entry.time = Files.getLastModifiedTime(f).toMillis()
                    zip.putNextEntry(entry)
                    Files.newInputStream(f).use { it.copyTo(zip) }
                    zip.closeEntry()
                }
            }
        }
        return zipPath
    }

    /** 列出某世界的全部备份（文件名倒序 = 新的在前）。忽略非 zip 与子目录内容。 */
    fun listBackups(instanceId: String, world: String): List<BackupInfo> {
        val dir = backupsDir.resolve(world)
        if (!Files.isDirectory(dir)) return emptyList()
        return Files.list(dir).use { stream ->
            stream.filter { Files.isRegularFile(it) && it.fileName.toString().endsWith(".zip") }
                .map { p -> toBackupInfo(world, p) }
                .toList()
                .sortedByDescending { it.fileName }
        }
    }

    /** 列出备份根下全部世界的备份（按世界名、文件名排序）。 */
    fun listAllBackups(instanceId: String): List<BackupInfo> {
        if (!Files.isDirectory(backupsDir)) return emptyList()
        return Files.list(backupsDir).use { worlds ->
            worlds.filter { Files.isDirectory(it) }
                .toList()
                .sortedBy { it.fileName.toString() }
                .flatMap { worldDir ->
                    Files.list(worldDir).use { stream ->
                        stream.filter { Files.isRegularFile(it) && it.fileName.toString().endsWith(".zip") }
                            .toList()
                            .sortedBy { it.fileName.toString() }
                            .map { toBackupInfo(worldDir.fileName.toString(), it) }
                    }
                }
        }
    }

    private fun toBackupInfo(world: String, p: Path): BackupInfo {
        val manifest = readManifest(p)
        return BackupInfo(
            world = world,
            fileName = p.fileName.toString(),
            path = p,
            sizeBytes = Files.size(p),
            lastModified = Files.getLastModifiedTime(p).toMillis(),
            manifest = manifest,
        )
    }

    private fun readManifest(zipPath: Path): BackupManifest? = try {
        ZipInputStream(Files.newInputStream(zipPath).buffered()).use { zip ->
            var entry = zip.nextEntry
            while (entry != null) {
                if (!entry.isDirectory && entry.name == MANIFEST_ENTRY) {
                    return JSON.decodeFromString(BackupManifest.serializer(), zip.readBytes().decodeToString())
                }
                entry = zip.nextEntry
            }
            null
        }
    } catch (_: Exception) {
        null
    }

    /** 删除备份文件；不存在返回 false。 */
    fun deleteBackup(world: String, fileName: String): Boolean {
        val p = backupsDir.resolve(world).resolve(fileName)
        if (!Files.isRegularFile(p)) return false
        Files.delete(p)
        return true
    }

    /** 备份空间统计：(备份包总数, 总字节, 各世界字节映射)。 */
    data class BackupStats(val backupCount: Int, val totalBytes: Long, val bytesPerWorld: Map<String, Long>)

    fun backupStats(): BackupStats {
        val perWorld = linkedMapOf<String, Long>()
        var count = 0
        var total = 0L
        for (info in listAllBackups(instanceId = "")) {
            count++
            total += info.sizeBytes
            perWorld[info.world] = (perWorld[info.world] ?: 0L) + info.sizeBytes
        }
        return BackupStats(count, total, perWorld)
    }

    // ---------------------------------------------------------------- 恢复

    /**
     * 恢复备份到 `saves/<world>`：
     * 1. 安全网（强制，不可关闭）：先把当前存档备份一份（note = safety-net）；
     * 2. 解压到暂存目录 `saves/.restore-<world>-<ts>`；
     * 3. 旧目录改名 `.old-<world>-<ts>` → 暂存改名就位 → 删除旧目录；
     *    任一步失败则把旧目录改回原名并清理暂存。
     * 备份 zip 与目标世界名不匹配时拒绝（防误恢复）。
     */
    fun restoreWorld(
        instanceId: String,
        world: String,
        backupFile: Path,
        /** 仅供测试注入：在暂存完成后、交换前触发，用于模拟中断。 */
        internalBeforeSwap: (() -> Unit)? = null,
    ) {
        require(Files.isRegularFile(backupFile)) { "备份文件不存在: $backupFile" }
        checkWorldName(world)
        withWorldLock(instanceId, world) {
            val manifest = readManifest(backupFile)
                ?: throw LaunchException("备份缺少 manifest，无法确认来源世界: $backupFile")
            if (manifest.world != world) {
                throw LaunchException("备份属于世界「${manifest.world}」，拒绝恢复到「$world」")
            }
            // 1. 安全网：覆盖前强制备份当前状态（不可关闭）
            if (Files.isDirectory(savesDir.resolve(world))) {
                doBackup(instanceId, world, note = SAFETY_NET_NOTE, source = SOURCE_SAFETY_NET)
            }
            val staging = savesDir.resolve("$STAGING_PREFIX$world-${formatTimestamp(System.currentTimeMillis())}")
            val oldDir = savesDir.resolve("$OLD_PREFIX$world-${formatTimestamp(System.currentTimeMillis())}")
            try {
                // 2. 先解压到暂存目录
                Files.createDirectories(staging)
                unzipInto(backupFile, staging, stripPrefix = "$world/")
                try {
                    internalBeforeSwap?.invoke()
                } catch (e: Exception) {
                    throw LaunchException("恢复在交换前被中断: ${e.message}", e)
                }
                // 3. 原子交换：旧目录改名保留 → 暂存就位 → 成功后删旧
                val hadOld = Files.isDirectory(savesDir.resolve(world))
                if (hadOld) {
                    Files.move(savesDir.resolve(world), oldDir, StandardCopyOption.REPLACE_EXISTING)
                }
                try {
                    Files.move(staging, savesDir.resolve(world))
                } catch (e: Exception) {
                    if (hadOld && Files.isDirectory(oldDir) && !Files.exists(savesDir.resolve(world))) {
                        Files.move(oldDir, savesDir.resolve(world))
                    }
                    throw LaunchException("恢复交换失败，已回退原存档: ${e.message}", e)
                }
                if (Files.isDirectory(oldDir)) deleteRecursively(oldDir)
            } finally {
                if (Files.exists(staging)) deleteRecursively(staging)
            }
        }
    }

    /** 清理历史中断遗留的暂存/旧目录（`.restore-*`、`.old-*`）。返回清理数。 */
    fun cleanupStaleStaging(): Int {
        if (!Files.isDirectory(savesDir)) return 0
        var n = 0
        Files.list(savesDir).use { stream ->
            stream.filter { Files.isDirectory(it) }
                .map { it.fileName.toString() }
                .toList()
                .filter { it.startsWith(STAGING_PREFIX) || it.startsWith(OLD_PREFIX) }
                .forEach {
                    deleteRecursively(savesDir.resolve(it))
                    n++
                }
        }
        return n
    }

    private fun unzipInto(zipPath: Path, targetDir: Path, stripPrefix: String) {
        ZipInputStream(Files.newInputStream(zipPath).buffered()).use { zip ->
            var entry = zip.nextEntry
            while (entry != null) {
                if (!entry.isDirectory) {
                    val rel = if (stripPrefix.isNotEmpty() && entry.name.startsWith(stripPrefix)) {
                        entry.name.removePrefix(stripPrefix)
                    } else if (entry.name == MANIFEST_ENTRY) {
                        null
                    } else {
                        entry.name
                    }
                    if (!rel.isNullOrBlank()) {
                        val target = targetDir.resolve(rel.replace('/', File.separatorChar))
                        Files.createDirectories(target.parent)
                        Files.newOutputStream(target).use { zip.copyTo(it) }
                    }
                }
                entry = zip.nextEntry
            }
        }
    }

    // ---------------------------------------------------------------- 并发锁

    private val lockRegistry = ConcurrentHashMap<String, Any>()

    /** 按实例+世界名的互斥执行；已被占用时立即抛 [LaunchException]，不等待。 */
    private fun <T> withWorldLock(instanceId: String, world: String, block: () -> T): T {
        val key = "$instanceId/$world"
        if (lockRegistry.putIfAbsent(key, LOCK_TOKEN) != null) {
            throw LaunchException("世界「$world」已有备份/恢复操作进行中，请稍后再试")
        }
        try {
            return block()
        } finally {
            lockRegistry.remove(key)
        }
    }

    private fun checkWorldName(world: String) {
        require(world.isNotBlank() && !world.contains('/') && !world.contains('\\') && world != "." && world != "..") {
            "非法世界目录名: $world"
        }
    }

    private fun deleteRecursively(dir: Path) {
        Files.walk(dir).use { stream ->
            stream.sorted(java.util.Comparator.reverseOrder()).forEach { Files.deleteIfExists(it) }
        }
    }

    companion object {
        const val MANIFEST_ENTRY = "manifest.json"
        const val SOURCE_NORMAL = "normal"
        const val SOURCE_SAFETY_NET = "safety-net"
        const val SAFETY_NET_NOTE = "restore-safety-net"
        const val STAGING_PREFIX = ".restore-"
        const val OLD_PREFIX = ".old-"

        private val LOCK_TOKEN = Any()
        private val JSON = Json { ignoreUnknownKeys = true }

        /** 已压缩扩展名用 STORED（不重复压缩，节省 CPU）。 */
        private val STORED_EXTENSIONS = setOf(
            "zip", "jar", "png", "jpg", "jpeg", "gif", "webp", "ogg", "mp3", "wav", "gz", "bz2", "7z", "mp4",
        )

        internal fun isPrecompressed(name: String): Boolean =
            name.substringAfterLast('.', "").lowercase() in STORED_EXTENSIONS

        internal fun formatTimestamp(millis: Long): String {
            val cal = java.util.Calendar.getInstance().apply { timeInMillis = millis }
            return "%04d%02d%02d-%02d%02d%02d".format(
                cal.get(java.util.Calendar.YEAR),
                cal.get(java.util.Calendar.MONTH) + 1,
                cal.get(java.util.Calendar.DAY_OF_MONTH),
                cal.get(java.util.Calendar.HOUR_OF_DAY),
                cal.get(java.util.Calendar.MINUTE),
                cal.get(java.util.Calendar.SECOND),
            )
        }

        internal fun sanitize(note: String): String =
            note.replace(Regex("[^\\w\\-\\u4e00-\\u9fa5]+"), "-").trim('-').ifBlank { "backup" }
    }
}
