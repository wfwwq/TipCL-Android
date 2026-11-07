package com.tipcl.android.core.launch

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class FabricInstallerTest {

    // 内嵌样例：fabric-meta /v2/versions/loader/1.20.4/0.16.9/profile/json 的典型响应
    private val sampleProfileJson = """
        {
          "schemaVersion": 1,
          "id": "fabricLoader-0.16.9-1.20.4",
          "version": "0.16.9",
          "inheritsFrom": "1.20.4",
          "mainClass": "net.fabricmc.loader.impl.launch.knot.KnotClient",
          "arguments": { "game": [], "jvm": ["-Dfabric.dli.env=client"] },
          "libraries": [
            { "name": "org.ow2.asm:asm:9.6", "url": "https://maven.fabricmc.net/" },
            { "name": "net.fabricmc:fabric-loader:0.16.9", "url": "https://maven.fabricmc.net/" },
            { "name": "net.fabricmc:intermediary:1.20.4", "url": "https://maven.fabricmc.net/" },
            { "name": "net.fabricmc:sponge-mixin:0.15.4+mixin.0.8.7", "url": "https://maven.fabricmc.net/" }
          ]
        }
    """.trimIndent()

    private val sampleLoaderListJson = """
        [
          { "url": "https://meta.fabricmc.net/v2/versions/loader/0.16.9.json",
            "maven": "https://maven.fabricmc.net/net/fabricmc/fabric-loader/0.16.9/fabric-loader-0.16.9.jar",
            "version": "0.16.9", "stable": true },
          { "url": "https://meta.fabricmc.net/v2/versions/loader/0.16.8.json",
            "maven": "https://maven.fabricmc.net/net/fabricmc/fabric-loader/0.16.8/fabric-loader-0.16.8.jar",
            "version": "0.16.8", "stable": true },
          { "url": "https://meta.fabricmc.net/v2/versions/loader/0.16.7-beta.json",
            "maven": "https://maven.fabricmc.net/net/fabricmc/fabric-loader/0.16.7/fabric-loader-0.16.7.jar",
            "version": "0.16.7", "stable": false }
        ]
    """.trimIndent()

    private val vanilla = VersionSpec(
        id = "1.20.4",
        type = "release",
        mainClass = "net.minecraft.client.main.Main",
        arguments = VersionSpec.Arguments(
            game = listOf(VersionSpec.Argument(listOf("--username"), emptyList())),
            jvm = emptyList(),
        ),
    )

    @Test
    fun `离线构造的派生版本结构正确`() {
        val derived = FabricInstaller().buildDerivedSpec(vanilla, "0.16.9")
        assertEquals("1.20.4-fabric", derived.id)
        assertEquals("1.20.4", derived.inheritsFrom)
        assertEquals(FabricInstaller.KNOT_CLIENT, derived.mainClass)
        assertEquals("release", derived.type)
        // 必需三类 library 均存在且指向 Fabric maven
        val names = derived.libraries.map { it.name }
        assertTrue(names.any { it.startsWith("net.fabricmc:fabric-loader:") }, "缺 fabric-loader: $names")
        assertTrue(names.any { it.startsWith("net.fabricmc:intermediary:1.20.4") }, "缺 intermediary: $names")
        assertTrue(names.any { it.startsWith("net.fabricmc:sponge-mixin:") }, "缺 sponge-mixin: $names")
        assertTrue(derived.libraries.all { it.url == MavenRepository.FABRIC_MAVEN.base })
        // 继承原版 game 参数
        assertEquals(1, derived.arguments?.game?.size)
    }

    @Test
    fun `install 通过 meta profile 归一 id 与 inheritsFrom 并可回环解析`() {
        val requestedUrls = mutableListOf<String>()
        val installer = FabricInstaller(metaFetcher = { url ->
            requestedUrls.add(url)
            sampleProfileJson
        })
        val (newId, jsonText) = installer.install(vanilla, "0.16.9")

        assertEquals("1.20.4-fabric", newId)
        assertTrue(requestedUrls.single().endsWith("/v2/versions/loader/1.20.4/0.16.9/profile/json"))

        val reparsed = VersionSpec.parse(jsonText)
        assertEquals("1.20.4-fabric", reparsed.id)
        assertEquals("1.20.4", reparsed.inheritsFrom)
        assertEquals(FabricInstaller.KNOT_CLIENT, reparsed.mainClass)
        assertEquals(4, reparsed.libraries.size)
        assertEquals("net.fabricmc:fabric-loader:0.16.9", reparsed.libraries[1].name)

        // 与 InstanceManager 协作：落盘 + 继承链合并
        val temp = kotlin.io.path.createTempDirectory("tipcl-fabric-test")
        try {
            val instances = InstanceManager(temp)
            instances.installInstance(vanilla.id, "{}") // 占位（vanilla 本体由测试上下文提供）
            instances.installInstance(newId, jsonText)
            val child = instances.loadVersionSpec(instances.pathsFor(newId))
            val merged = child.mergeWithParent(vanilla)
            assertEquals("net.fabricmc.loader.impl.launch.knot.KnotClient", merged.mainClass)
            // 合并后：子（fabric）libraries 在前，原版 libraries 追加在后
            assertTrue(merged.libraries.any { it.name == "net.fabricmc:fabric-loader:0.16.9" })
            // LibraryResolver 可解析 fabric library（url 声明式回退拼装）
            val resolution = LibraryResolver().resolve(merged.libraries, os = "linux", arch = "64")
            assertTrue(resolution.classpath.any { it.name == "net.fabricmc:fabric-loader:0.16.9" })
        } finally {
            temp.toFile().deleteRecursively()
        }
    }

    @Test
    fun `loader 版本枚举解析与 stableOnly 过滤`() {
        val installer = FabricInstaller(metaFetcher = { sampleLoaderListJson })
        val all = installer.listLoaderVersions("1.20.4")
        assertEquals(listOf("0.16.9", "0.16.8", "0.16.7"), all.map { it.version })
        val stable = installer.listLoaderVersions("1.20.4", stableOnly = true)
        assertEquals(listOf("0.16.9", "0.16.8"), stable.map { it.version })
    }

    @Test
    fun `meta 不可达时抛 LaunchException`() {
        val installer = FabricInstaller(metaFetcher = { _ -> throw java.io.IOException("HTTP 404") })
        val e = assertFailsWith<LaunchException> { installer.install(vanilla, "0.16.9") }
        assertTrue(e.message!!.contains("fabric-meta"))
        assertFailsWith<LaunchException> { installer.listLoaderVersions("1.20.4") }
    }

    @Test
    fun `meta 返回损坏 JSON 时抛 LaunchException`() {
        val installer = FabricInstaller(metaFetcher = { "<html>oops</html>" })
        assertFailsWith<LaunchException> { installer.install(vanilla, "0.16.9") }
    }
}
