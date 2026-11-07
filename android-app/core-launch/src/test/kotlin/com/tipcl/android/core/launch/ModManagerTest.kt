package com.tipcl.android.core.launch

import java.nio.file.Files
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import kotlin.io.path.readBytes
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertTrue

class ModManagerTest {

    private fun tempRoot(): java.nio.file.Path = Files.createTempDirectory("tipcl-mods-test")

    /** 构造带 fabric.mod.json 的最小 mod jar 字节。 */
    private fun modJarBytes(id: String, version: String = "1.0.0", depends: String = "{}"): ByteArray {
        val bos = java.io.ByteArrayOutputStream()
        ZipOutputStream(bos).use { zip ->
            zip.putNextEntry(ZipEntry("fabric.mod.json"))
            val json = """{"id":"$id","version":"$version","depends":$depends}"""
            zip.write(json.toByteArray())
            zip.closeEntry()
            zip.putNextEntry(ZipEntry("assets/$id/icon.png"))
            zip.write(byteArrayOf(1, 2, 3))
            zip.closeEntry()
        }
        return bos.toByteArray()
    }

    private fun sha1Hex(bytes: ByteArray): String =
        java.security.MessageDigest.getInstance("SHA-1").digest(bytes).joinToString("") { "%02x".format(it) }

    @Test
    fun `安装-列表-禁用-启用-删除 全流程`() {
        val root = tempRoot()
        try {
            val manager = ModManager(root)
            val src = root.resolve("in.jar")
            Files.write(src, byteArrayOf(1, 2, 3))

            val installed = manager.installMod(src)
            assertEquals("in.jar", installed.fileName.toString())
            assertTrue(Files.isRegularFile(manager.modsDir.resolve("in.jar")))

            // 无 .jar 后缀的源文件自动补
            val src2 = root.resolve("raw-mod")
            Files.write(src2, byteArrayOf(9))
            assertEquals("raw-mod.jar", manager.installMod(src2).fileName.toString())

            assertEquals(2, manager.listMods().size)
            assertEquals(null, manager.listMods()[0].info) // 非法 jar，info 为 null

            assertTrue(manager.disableMod("in.jar"))
            assertTrue(Files.isRegularFile(manager.modsDir.resolve("in.jar.disabled")))
            assertTrue(!Files.exists(manager.modsDir.resolve("in.jar")))
            assertTrue(manager.listMods().first { it.fileName == "in.jar" }.let { !it.enabled })

            assertTrue(manager.enableMod("in.jar"))
            assertTrue(manager.listMods().first { it.fileName == "in.jar" }.enabled)
            assertTrue(!manager.disableMod("in.jar.disabled-disabled"))
            assertTrue(!manager.enableMod("in.jar"))

            assertTrue(manager.deleteMod("in.jar"))
            assertTrue(!Files.exists(manager.modsDir.resolve("in.jar")))
            assertTrue(!manager.deleteMod("in.jar"))
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    @Test
    fun `fabric_mod_json 从 jar 内解析与 depends 检查`() {
        val root = tempRoot()
        try {
            val manager = ModManager(root)
            val jar = root.resolve("fabric-api.jar")
            Files.write(jar, modJarBytes("fabric-api", "0.97.0", depends = """{"fabricloader":">=0.15.0"}"""))

            val info = manager.readModJson(jar)
            assertEquals("fabric-api", info!!.id)
            assertEquals("0.97.0", info.version)
            assertEquals(mapOf("fabricloader" to ">=0.15.0"), info.depends)

            // 非法 jar 与缺失 jar
            val bad = root.resolve("bad.jar")
            Files.write(bad, byteArrayOf(0))
            assertNull(manager.readModJson(bad))
            assertNull(manager.readModJson(root.resolve("missing.jar")))

            // 装入 mods 目录后列入列表，depends 检查：fabricloader 非已安装 mod，判缺失
            manager.installMod(jar)
            val installed = manager.listMods()
            assertEquals(1, installed.size)
            assertEquals("fabric-api", installed[0].info!!.id)
            val issues = manager.checkDependencies(info, installed)
            assertTrue(issues.isNotEmpty())
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    @Test
    fun `依赖满足与版本约束宽松匹配`() {
        val root = tempRoot()
        try {
            val manager = ModManager(root)
            val base = ModManager.InstalledMod(
                "cloth-config.jar", enabled = true,
                info = ModManager.FabricModJson("cloth-config", "11.1.118", provides = listOf("cloth-config2")),
            )
            val candidate = ModManager.FabricModJson(
                "sodium-extra", "0.5.4",
                depends = mapOf("cloth-config" to ">=11.0.0", "cloth-config2" to ""),
            )
            assertEquals(emptyList(), manager.checkDependencies(candidate, listOf(base)))

            // 缺失依赖
            val missing = manager.checkDependencies(
                ModManager.FabricModJson("x", depends = mapOf("fabric-api" to "")),
                listOf(base),
            )
            assertEquals(1, missing.size)
            assertTrue(missing[0].reason.contains("缺失依赖"))

            // 版本不满足（主版本不同）
            val tooOld = manager.checkDependencies(
                ModManager.FabricModJson("x", depends = mapOf("cloth-config" to ">=12.0.0")),
                listOf(base),
            )
            assertEquals(1, tooOld.size)
            assertTrue(tooOld[0].reason.contains("版本不满足"))

            // breaks 冲突
            val breaks = manager.checkDependencies(
                ModManager.FabricModJson("x", breaks = mapOf("cloth-config" to "*")),
                listOf(base),
            )
            assertEquals(1, breaks.size)
            assertTrue(breaks[0].reason.contains("冲突"))

            // 禁用的 mod 不计入提供者
            val disabledBase = base.copy(enabled = false)
            assertTrue(manager.checkDependencies(candidate, listOf(disabledBase)).isNotEmpty())

            // 约束匹配工具语义
            assertTrue(ModManager.constraintSatisfied("11.1.118", "^11.0.0"))
            assertTrue(ModManager.constraintSatisfied("11.1.118", "~11.0"))
            assertTrue(ModManager.constraintSatisfied("11.1.118", ">=11.0.0"))
            assertTrue(!ModManager.constraintSatisfied("10.9.0", "^11.0.0"))
            assertTrue(ModManager.constraintSatisfied("anything", "*"))
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    @Test
    fun `下载安装与 sha1 校验成功路径`() {
        val root = tempRoot()
        try {
            val bytes = modJarBytes("sodium", "0.5.8")
            val manager = ModManager(root, downloader = { bytes })
            val goodSha1 = sha1Hex(bytes)
            val installed = manager.downloadMod("https://cdn.example.org/mods/sodium-0.5.8.jar", goodSha1)
            assertEquals("sodium-0.5.8.jar", installed.fileName.toString())
            assertTrue(bytes.contentEquals(installed.readBytes()))
            assertEquals("sodium", manager.readModJson(installed)!!.id)
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    @Test
    fun `坏 sha1 时拒绝安装且不落盘`() {
        val root = tempRoot()
        try {
            val manager = ModManager(root, downloader = { byteArrayOf(1) })
            val e = assertFailsWith<LaunchException> {
                manager.downloadMod("https://cdn.example.org/mods/sodium.jar", "deadbeef".repeat(5))
            }
            assertTrue(e.message!!.contains("SHA1"))
            // mods 目录下不应有任何残留
            assertTrue(!Files.isDirectory(manager.modsDir) || Files.list(manager.modsDir).use { it.findAny().isEmpty() })

            // 本地安装同样校验
            val src = root.resolve("m.jar")
            val bytes = modJarBytes("sodium")
            Files.write(src, bytes)
            assertFailsWith<LaunchException> { manager.installMod(src, "deadbeef".repeat(5)) }
            assertTrue(!Files.exists(manager.modsDir.resolve("m.jar")))
        } finally {
            root.toFile().deleteRecursively()
        }
    }

    @Test
    fun `下载失败抛 LaunchException`() {
        val root = tempRoot()
        try {
            val manager = ModManager(root, downloader = { _ -> throw java.io.IOException("HTTP 404") })
            val e = assertFailsWith<LaunchException> { manager.downloadMod("https://cdn.example.org/x.jar") }
            assertTrue(e.message!!.contains("下载 mod 失败"))
        } finally {
            root.toFile().deleteRecursively()
        }
    }
}
