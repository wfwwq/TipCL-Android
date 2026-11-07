package com.tipcl.android.core.forgelike

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FinalizeVersionJsonTest {

    private val profileJson = """
        {
          "minecraft": "1.20.1",
          "version": "47.1.0",
          "libraries": [
            {"name": "net.minecraftforge:forge:1.20.1-47.1.0", "url": "https://maven.minecraftforge.net/maven/"},
            {"name": "org.ow2.asm:asm:9.5"},
            {"name": "g:server-only:1", "clientreq": false}
          ]
        }
    """.trimIndent()

    @Test
    fun `按 profile 生成可启动版本 JSON`() {
        val profile = ForgeInstaller().parseInstallProfile(profileJson)
        val finalizer = ForgeVersionJsonFinalizer(profile)
        val out = finalizer.finalize(ForgePendingTask.FinalizeVersionJson("1.20.1-forge-47.1.0"))

        assertTrue("\"id\": \"1.20.1-forge-47.1.0\"" in out)
        assertTrue("\"inheritsFrom\": \"1.20.1\"" in out)
        assertTrue("\"mainClass\": \"cpw.mods.modlauncher.Launcher\"" in out)
        // clientreq=false 的构件不出现在运行期 libraries。
        assertFalse(out.contains("server-only"))
        assertTrue(out.contains("net.minecraftforge:forge:1.20.1-47.1.0"))
        assertTrue(out.contains("https://maven.minecraftforge.net/maven/"))
        assertTrue(out.contains("org.ow2.asm:asm:9.5"))
    }

    @Test
    fun `从 M4 骨架升级并去掉 pending 标记`() {
        val skeleton = ForgeInstaller().install("1.20.1", "47.1.0").second
        assertTrue(skeleton.contains("tipclPendingForgeProcessing"))

        val profile = ForgeInstaller().parseInstallProfile(profileJson)
        val finalizer = ForgeVersionJsonFinalizer(profile)
        val out = finalizer.finalizeFromSkeleton(
            ForgePendingTask.FinalizeVersionJson("1.20.1-forge-47.1.0"),
            skeleton,
        )
        assertFalse(out.contains("tipclPendingForgeProcessing"))
        assertFalse(out.contains("tipclForgeLoaderVersion\": \"47.1.0\", \"tipclPendingForgeProcessing"))
        assertTrue(out.contains("\"inheritsFrom\": \"1.20.1\""))
    }

    @Test
    fun `非骨架 JSON 拒绝重复 finalize`() {
        val profile = ForgeInstaller().parseInstallProfile(profileJson)
        val finalizer = ForgeVersionJsonFinalizer(profile)
        val alreadyFinal = "{\"id\": \"x\"}"
        try {
            finalizer.finalizeFromSkeleton(ForgePendingTask.FinalizeVersionJson("x"), alreadyFinal)
            throw AssertionError("应当抛出 IllegalArgumentException")
        } catch (e: IllegalArgumentException) {
            // 预期路径
        }
    }
}
