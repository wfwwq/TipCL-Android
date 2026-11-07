package com.tipcl.android.core.launch

import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.util.zip.ZipEntry
import java.util.zip.ZipFile
import kotlin.io.path.name
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class SavesManagerTest {

    private fun tempRoot(): Path = Files.createTempDirectory("tipcl-saves-test")

    /** 构造假存档目录树：level.dat + region/r.0.0.mca + data/villages.dat。 */
    private fun makeWorld(savesDir: Path, world: String, seed: Int = 0): Path {
        val dir = Files.createDirectories(savesDir.resolve(world))
        Files.write(dir.resolve("level.dat"), "level-$seed".repeat(64).toByteArray())
        Files.createDirectories(dir.resolve("region"))
        Files.write(dir.resolve("region").resolve("r.0.0.mca"), "region-$seed".repeat(128).toByteArray())
        Files.createDirectories(dir.resolve("data"))
        Files.write(dir.resolve("data").resolve("villages.dat"), "data-$seed".toByteArray())
        return dir
    }

    private fun newManager(root: Path, appData: Path) = SavesManager(root, appData)

    // 1. 列存档：目录名即世界名，大小/修改时间来自文件系统
    @Test
    fun `listWorlds 列出目录名与大小修改时间`() {
        val root = tempRoot()
        try {
            makeWorld(root.resolve("saves"), "Alpha")
            makeWorld(root.resolve("saves"), "Beta", seed = 1)
            val manager = newManager(root, root.resolve("appdata"))

            val worlds = manager.listWorlds("inst1")
            assertEquals(listOf("Alpha", "Beta"), worlds.map { it.name })
            assertTrue(worlds.all { it.sizeBytes > 0 })
            assertTrue(worlds.all { it.fileCount == 3 })
            assertTrue(worlds.all { it.lastModified > 0 })
            // 空/不存在 saves 目录
            assertTrue(newManager(tempRoot(), root.resolve("appdata")).listWorlds("x").isEmpty())
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    // 2. 备份内容完整性：条目数、路径、manifest
    @Test
    fun `backupWorld 打包目录结构与 manifest`() {
        val root = tempRoot()
        try {
            makeWorld(root.resolve("saves"), "Alpha")
            val manager = newManager(root, root.resolve("appdata"))

            val zipPath = manager.backupWorld("inst1", "Alpha", note = "手动备份!")
            assertTrue(Files.isRegularFile(zipPath))
            assertTrue(zipPath.parent.toString().endsWith("backups${File.separatorChar}Alpha"))
            assertTrue(zipPath.fileName.toString().contains("手动备份"))

            ZipFile(zipPath.toFile()).use { zip ->
                val names = zip.entries().toList().map { it.name }
                // manifest + 3 个文件条目（目录条目不写）
                assertEquals(4, names.size)
                assertTrue("manifest.json" in names)
                assertTrue("Alpha/level.dat" in names)
                assertTrue("Alpha/region/r.0.0.mca" in names)
                assertTrue("Alpha/data/villages.dat" in names)
                // manifest 内容
                val manifestText = zip.getInputStream(zip.getEntry("manifest.json")).readBytes().decodeToString()
                val manifest = manager.let {
                    kotlinx.serialization.json.Json.decodeFromString(
                        SavesManager.BackupManifest.serializer(), manifestText)
                }
                assertEquals("Alpha", manifest.world)
                assertEquals("inst1", manifest.instanceId)
                assertEquals(3, manifest.fileCount)
                assertEquals(SavesManager.SOURCE_NORMAL, manifest.source)
                assertTrue(manifest.totalBytes > 0)
            }

            // 备份列表与统计
            val backups = manager.listBackups("inst1", "Alpha")
            assertEquals(1, backups.size)
            assertNotNull(backups[0].manifest)
            assertEquals(1, manager.backupStats().backupCount)
            assertTrue(manager.backupStats().totalBytes > 0)
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    // 3. 恢复：覆盖后内容回到备份点，且触发安全网备份
    @Test
    fun `restoreWorld 覆盖恢复并自动触发安全网备份`() {
        val root = tempRoot()
        try {
            val world = makeWorld(root.resolve("saves"), "Alpha", seed = 0)
            val manager = newManager(root, root.resolve("appdata"))
            val backup = manager.backupWorld("inst1", "Alpha", note = "before")

            // 破坏当前状态
            Files.writeString(world.resolve("level.dat"), "corrupted!")
            Files.delete(world.resolve("region").resolve("r.0.0.mca"))
            Files.writeString(world.resolve("region").resolve("extra.mca"), "junk")

            manager.restoreWorld("inst1", "Alpha", backup)

            // 内容回到备份点
            assertEquals("level-0".repeat(64), Files.readString(world.resolve("level.dat")))
            assertTrue(Files.isRegularFile(world.resolve("region").resolve("r.0.0.mca")))
            assertFalse(Files.exists(world.resolve("region").resolve("extra.mca")))
            assertEquals("data-0", Files.readString(world.resolve("data").resolve("villages.dat")))

            // 安全网：多出一个 safety-net 备份（不可关闭的强制行为）
            val backups = manager.listBackups("inst1", "Alpha")
            assertEquals(2, backups.size)
            val safety = backups.first { it.manifest?.source == SavesManager.SOURCE_SAFETY_NET }
            assertEquals(SavesManager.SAFETY_NET_NOTE, safety.manifest?.note)

            // 暂存/旧目录已清理
            assertEquals(0, manager.cleanupStaleStaging())
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    // 4. 故意中断：交换前抛异常 → 原存档完好、暂存目录被清理
    @Test
    fun `restoreWorld 中断时回退并清理暂存`() {
        val root = tempRoot()
        try {
            val world = makeWorld(root.resolve("saves"), "Alpha", seed = 0)
            val manager = newManager(root, root.resolve("appdata"))
            val backup = manager.backupWorld("inst1", "Alpha")

            Files.writeString(world.resolve("level.dat"), "modified-in-flight")

            assertFailsWith<LaunchException> {
                manager.restoreWorld("inst1", "Alpha", backup) {
                    throw IllegalStateException("模拟中断")
                }
            }
            // 原存档未被破坏
            assertEquals("modified-in-flight", Files.readString(world.resolve("level.dat")))
            // 暂存目录已清理
            assertEquals(0, manager.cleanupStaleStaging())
            // 锁已释放：可再次操作
            manager.backupWorld("inst1", "Alpha")
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    // 5. 历史残留暂存目录清理
    @Test
    fun `cleanupStaleStaging 清理历史中断残留`() {
        val root = tempRoot()
        try {
            val saves = Files.createDirectories(root.resolve("saves"))
            makeWorld(saves, "Alpha")
            Files.createDirectories(saves.resolve(".restore-Alpha-20260101-000000"))
            Files.createDirectories(saves.resolve(".old-Alpha-20260101-000000"))
            val manager = newManager(root, root.resolve("appdata"))
            assertEquals(2, manager.cleanupStaleStaging())
            assertEquals(0, manager.cleanupStaleStaging())
            assertTrue(Files.isDirectory(saves.resolve("Alpha")))
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    // 6. 锁冲突：同世界并发只允许一个操作；不同世界互不影响
    @Test
    fun `同世界并发操作锁冲突_不同世界互不影响`() {
        val root = tempRoot()
        try {
            makeWorld(root.resolve("saves"), "Alpha")
            makeWorld(root.resolve("saves"), "Beta")
            val manager = newManager(root, root.resolve("appdata"))

            // 模拟 Alpha 正在备份（占住锁）：反射拿 lockRegistry
            val registryField = SavesManager::class.java.declaredFields.first { it.name == "lockRegistry" }
            registryField.isAccessible = true
            @Suppress("UNCHECKED_CAST")
            val registry = registryField.get(manager) as java.util.concurrent.ConcurrentHashMap<String, Any>
            registry.putIfAbsent("inst1/Alpha", Any())
            val existingBackup = manager.backupWorld("inst0", "Alpha")

            val ex = assertFailsWith<LaunchException> { manager.backupWorld("inst1", "Alpha") }
            assertTrue(ex.message!!.contains("进行中"))
            assertFailsWith<LaunchException> { manager.restoreWorld("inst1", "Alpha", existingBackup) }
            // 不同世界不受影响
            manager.backupWorld("inst1", "Beta")
            // 释放后恢复
            registry.remove("inst1/Alpha")
            manager.backupWorld("inst1", "Alpha")
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    // 7. 备份列表/删除/统计：忽略非 zip 与嵌套目录，删除生效
    @Test
    fun `备份列表删除与统计_忽略非zip条目`() {
        val root = tempRoot()
        try {
            makeWorld(root.resolve("saves"), "Alpha")
            val manager = newManager(root, root.resolve("appdata"))
            val z1 = manager.backupWorld("inst1", "Alpha", note = "a")
            val z2 = manager.backupWorld("inst1", "Alpha", note = "b")
            manager.backupWorld("inst1", "Alpha", note = "c")

            // 干扰项：非 zip 文件与子目录（防遍历歧义）
            val worldBackupDir = root.resolve("appdata").resolve("backups").resolve("Alpha")
            Files.writeString(worldBackupDir.resolve("not-a-backup.txt"), "x")
            Files.createDirectories(worldBackupDir.resolve("nested"))

            val backups = manager.listBackups("inst1", "Alpha")
            assertEquals(3, backups.size)
            assertTrue(backups[0].lastModified >= backups[1].lastModified)

            val all = manager.listAllBackups("inst1")
            assertEquals(3, all.size)

            val stats = manager.backupStats()
            assertEquals(3, stats.backupCount)
            assertEquals(1, stats.bytesPerWorld.size)

            assertTrue(manager.deleteBackup("Alpha", z1.fileName.name))
            assertFalse(manager.deleteBackup("Alpha", "nope.zip"))
            assertEquals(2, manager.listBackups("inst1", "Alpha").size)
            assertTrue(Files.isRegularFile(z2))
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    // 8. 防误恢复：备份不属于目标世界时拒绝；非法世界名拒绝
    @Test
    fun `restoreWorld 拒绝跨世界恢复与非法世界名`() {
        val root = tempRoot()
        try {
            makeWorld(root.resolve("saves"), "Alpha")
            val manager = newManager(root, root.resolve("appdata"))
            val backup = manager.backupWorld("inst1", "Alpha")

            val ex = assertFailsWith<LaunchException> { manager.restoreWorld("inst1", "Beta", backup) }
            assertTrue(ex.message!!.contains("拒绝恢复"))
            assertFailsWith<IllegalArgumentException> { manager.backupWorld("inst1", "../evil") }
            assertFailsWith<IllegalArgumentException> { manager.backupWorld("inst1", "a/b") }
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    // 9. Store/Deflate 压缩方法按扩展名选择
    @Test
    fun `zip 压缩方法按扩展名选择`() {
        val root = tempRoot()
        try {
            val dir = Files.createDirectories(root.resolve("saves").resolve("W"))
            Files.write(dir.resolve("tex.png"), byteArrayOf(-1, -2, -3))
            Files.write(dir.resolve("level.dat"), "plain text data to deflate".repeat(20).toByteArray())
            val manager = newManager(root, root.resolve("appdata"))
            val zipPath = manager.backupWorld("inst1", "W")

            ZipFile(zipPath.toFile()).use { zip ->
                assertEquals(ZipEntry.STORED, zip.getEntry("W/tex.png").method)
                assertEquals(ZipEntry.DEFLATED, zip.getEntry("W/level.dat").method)
            }
        } finally {
            root.toFile().deleteRecursively()
        }
    }
}
