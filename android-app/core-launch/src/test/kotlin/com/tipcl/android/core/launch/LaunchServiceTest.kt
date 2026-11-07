package com.tipcl.android.core.launch

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject
import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * LaunchService 端到端测试：内嵌样例版本 JSON（原版 + fabric 派生链），
 * 断言 LaunchPlan 的参数、classpath、资源缺失清单、运行时选择与进度回调时序。
 */
class LaunchServiceTest {

    private val vanillaJson = """
        {
          "id": "1.20.1-t",
          "type": "release",
          "mainClass": "net.minecraft.client.main.Main",
          "arguments": {
            "game": [
              "--username", "${'$'}{auth_player_name}",
              "--version", "${'$'}{version_name}",
              "--assetsDir", "${'$'}{assets_root}",
              {"rules": [{"action": "allow", "features": {"is_demo_user": true}}], "value": ["--demo"]}
            ],
            "jvm": [
              {"rules": [{"action": "allow", "os": {"name": "windows"}}], "value": "-Xincgc"},
              "-Djava.library.path=${'$'}{natives_directory}",
              "-cp", "${'$'}{classpath}"
            ]
          },
          "libraries": [
            {"name": "com.mojang:brigadier:1.0.18", "downloads": {"artifact": {"url": "https://libraries.minecraft.net/com/mojang/brigadier/1.0.18/brigadier-1.0.18.jar", "sha1": "abc", "size": 100}}},
            {"name": "org.lwjgl:lwjgl:3.2.2", "downloads": {"artifact": {"url": "https://libraries.minecraft.net/org/lwjgl/lwjgl/3.2.2/lwjgl-3.2.2.jar", "size": 10}}, "natives": {"windows": "natives-windows", "linux": "natives-linux"}}
          ],
          "assetIndex": {"id": "8", "url": "https://piston-meta.mojang.com/v1/packages/xx/8.json", "totalSize": 100},
          "javaVersion": {"component": "java-runtime-gamma", "majorVersion": 17}
        }
    """.trimIndent()

    private val fabricJson = """
        {
          "id": "1.20.1-t-fabric",
          "inheritsFrom": "1.20.1-t",
          "type": "release",
          "mainClass": "net.fabricmc.loader.impl.launch.knot.KnotClient",
          "arguments": {"game": ["--fabric"]},
          "libraries": [
            {"name": "net.fabricmc:fabric-loader:0.15.0", "url": "https://maven.fabricmc.net"}
          ]
        }
    """.trimIndent()

    private class FakeProvisioner(var ready: Boolean = true) : RuntimeProvisioner {
        val ensured = mutableListOf<RuntimeRequirement>()
        var lastListener: ProgressListener? = null

        override fun isRuntimeReady(requirement: RuntimeRequirement): Boolean = ready

        override fun ensureRuntime(requirement: RuntimeRequirement, listener: ProgressListener?): RuntimeHandle {
            ensured.add(requirement)
            lastListener = listener
            listener?.onProgress(LaunchStage.PROVISION_RUNTIME, 1, 2)
            listener?.onProgress(LaunchStage.PROVISION_RUNTIME, 2, 2)
            return RuntimeHandle("/fake/jdk-${requirement.major}/bin/java", requirement.major)
        }
    }

    private class RecordingListener : ProgressListener {
        val events = mutableListOf<String>()

        override fun onStage(stage: LaunchStage, detail: String) {
            events.add("stage:${stage.name}")
        }

        override fun onProgress(stage: LaunchStage, done: Int, total: Int) {
            events.add("progress:${stage.name}:$done/$total")
        }
    }

    private fun newRoot() = Files.createTempDirectory("launchsvc")

    private fun install(root: java.nio.file.Path, id: String, json: String) {
        val dir = root.resolve("versions").resolve(id)
        Files.createDirectories(dir)
        Files.writeString(dir.resolve("$id.json"), json)
    }

    /** 写入样例 asset index，其中 1 个对象本地齐备、1 个缺失。 */
    private fun seedAssets(root: java.nio.file.Path, presentHash: String, missingHash: String) {
        val index = JsonObject(
            mapOf(
                "objects" to JsonObject(
                    mapOf(
                        "present.png" to JsonObject(mapOf("hash" to JsonPrimitive(presentHash), "size" to JsonPrimitive(4))),
                        "missing.ogg" to JsonObject(mapOf("hash" to JsonPrimitive(missingHash), "size" to JsonPrimitive(9))),
                    ),
                ),
            ),
        )
        val indexes = root.resolve("assets").resolve("indexes")
        Files.createDirectories(indexes)
        Files.writeString(indexes.resolve("8.json"), index.toString())
        val obj = root.resolve("assets").resolve("objects").resolve(presentHash.take(2))
        Files.createDirectories(obj)
        Files.write(obj.resolve(presentHash), ByteArray(4))
    }

    @Test
    fun `assembles plan for vanilla version end to end`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        seedAssets(root, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb")
        val service = LaunchService(InstanceManager(root))
        val options = LaunchOptions(
            javaExecutable = "/fake/java",
            minMemoryMb = 512,
            maxMemoryMb = 2048,
            windowWidth = 1280,
            windowHeight = 720,
        )

        val plan = service.assembleLaunchPlan("1.20.1-t", options)

        assertEquals("1.20.1-t", plan.versionId)
        assertEquals("net.minecraft.client.main.Main", plan.mainClass)
        assertEquals(RuntimeRequirement(17), plan.javaRequirement)
        assertEquals("/fake/java", plan.javaExecutable)
        // classpath：两条 library，绝对路径
        assertEquals(2, plan.classpath.size)
        assertTrue(
            plan.classpath[0].endsWith(
                "com/mojang/brigadier/1.0.18/brigadier-1.0.18.jar".replace('/', java.io.File.separatorChar),
            ),
        )
        // natives 构件进入 resolution.natives
        assertEquals(1, plan.libraryResolution.natives.size)
        val expectedClassifier = if (System.getProperty("os.name").lowercase().contains("windows")) "natives-windows" else "natives-linux"
        assertEquals(expectedClassifier, plan.libraryResolution.nativeClassifiers["org.lwjgl:lwjgl:3.2.2"])
        // natives 目录占位
        assertTrue(plan.nativeLibDir.toString().endsWith("versions/1.20.1-t/natives".replace('/', java.io.File.separatorChar)))
        // JVM 参数含内存、-cp 与 classpath 条目
        assertTrue(plan.jvmArgs.contains("-Xms512M"))
        assertTrue(plan.jvmArgs.contains("-Xmx2048M"))
        val cpIndex = plan.jvmArgs.indexOf("-cp")
        assertTrue(cpIndex >= 0)
        val cpValue = plan.jvmArgs[cpIndex + 1]
        assertTrue(cpValue.contains("brigadier"))
        // game 参数含占位替换后的用户名与分辨率
        assertTrue(plan.gameArgs.contains("Player"))
        assertTrue(plan.gameArgs.containsAll(listOf("--width", "1280", "--height", "720")))
        // 资源缺失清单：仅 1 个缺失对象
        assertEquals(1, plan.missingAssets.size)
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", plan.missingAssets[0].hash)
    }

    @Test
    fun `fabric derived version chain merges parent libraries and keeps knot mainClass`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        install(root, "1.20.1-t-fabric", fabricJson)
        val service = LaunchService(InstanceManager(root))

        val plan = service.assembleLaunchPlan(
            "1.20.1-t-fabric",
            LaunchOptions(javaExecutable = "/fake/java"),
        )

        assertEquals("1.20.1-t-fabric", plan.versionId)
        assertEquals("net.fabricmc.loader.impl.launch.knot.KnotClient", plan.mainClass)
        // javaVersion 继承自父版本
        assertEquals(RuntimeRequirement(17), plan.javaRequirement)
        // libraries：子在前、父在后
        val names = plan.libraryResolution.classpath.map { it.name }
        assertEquals("net.fabricmc:fabric-loader:0.15.0", names.first())
        assertTrue(names.contains("com.mojang:brigadier:1.0.18"))
        // game 参数既有 fabric 附加项（子在前），也有原版参数
        assertTrue(plan.gameArgs.contains("--fabric"))
        assertTrue(plan.gameArgs.contains("--username"))
    }

    @Test
    fun `missing version json throws LaunchException`() {
        val root = newRoot()
        val service = LaunchService(InstanceManager(root))
        val ex = assertFailsWith<LaunchException> {
            service.assembleLaunchPlan("ghost", LaunchOptions(javaExecutable = "java"))
        }
        assertTrue(ex.message!!.contains("版本 JSON"))
    }

    @Test
    fun `inheritance cycle throws LaunchException`() {
        val root = newRoot()
        install(root, "a", """{"id":"a","mainClass":"A","inheritsFrom":"b"}""")
        install(root, "b", """{"id":"b","mainClass":"B","inheritsFrom":"a"}""")
        val service = LaunchService(InstanceManager(root))
        val ex = assertFailsWith<LaunchException> { service.loadMergedSpec("a") }
        assertTrue(ex.message!!.contains("循环"))
    }

    @Test
    fun `missing parent version throws LaunchException`() {
        val root = newRoot()
        install(root, "1.20.1-t-fabric", fabricJson)
        val service = LaunchService(InstanceManager(root))
        assertFailsWith<LaunchException> { service.loadMergedSpec("1.20.1-t-fabric") }
    }

    @Test
    fun `java requirement defaults to 8 when javaVersion absent`() {
        val root = newRoot()
        install(root, "old", """{"id":"old","mainClass":"M","minecraftArguments":"--username ${'$'}{auth_player_name}"}""")
        val service = LaunchService(InstanceManager(root))
        val plan = service.assembleLaunchPlan("old", LaunchOptions(javaExecutable = "java"))
        assertEquals(RuntimeRequirement(8), plan.javaRequirement)
        // 旧版参数走 minecraftArguments
        assertTrue(plan.gameArgs.contains("Player"))
    }

    @Test
    fun `blank javaExecutable without provisioner throws`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val service = LaunchService(InstanceManager(root))
        assertFailsWith<LaunchException> {
            service.assembleLaunchPlan("1.20.1-t", LaunchOptions(javaExecutable = ""))
        }
    }

    @Test
    fun `provisioner supplies java executable and receives listener`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val provisioner = FakeProvisioner(ready = false)
        val service = LaunchService(InstanceManager(root), runtimeProvisioner = provisioner)
        val listener = RecordingListener()

        val plan = service.assembleLaunchPlan("1.20.1-t", LaunchOptions(javaExecutable = ""), listener)

        // 需求由版本 javaVersion 推导并传给供给器
        assertEquals(listOf(RuntimeRequirement(17)), provisioner.ensured)
        assertEquals("/fake/jdk-17/bin/java", plan.javaExecutable)
        assertEquals(listener, provisioner.lastListener)
    }

    @Test
    fun `progress events fire in stage order`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        seedAssets(root, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb")
        val provisioner = FakeProvisioner(ready = true)
        val service = LaunchService(InstanceManager(root), runtimeProvisioner = provisioner)
        val listener = RecordingListener()

        service.assembleLaunchPlan("1.20.1-t", LaunchOptions(javaExecutable = ""), listener)

        val stageOrder = listener.events
            .filter { it.startsWith("stage:") }
            .map { it.removePrefix("stage:") }
            .distinct()
        assertEquals(
            listOf("RESOLVE_VERSION", "RESOLVE_LIBRARIES", "CHECK_ASSETS", "PROVISION_RUNTIME", "BUILD_PLAN"),
            stageOrder,
        )
        // 供给器在 PROVISION_RUNTIME 阶段上报的进度被透传
        assertTrue(listener.events.contains("progress:PROVISION_RUNTIME:1/2"))
        assertTrue(listener.events.contains("progress:PROVISION_RUNTIME:2/2"))
        // 进度事件晚于资源检测、早于 BUILD_PLAN
        val iAssets = listener.events.indexOfFirst { it == "stage:CHECK_ASSETS" }
        val iProgress = listener.events.indexOfFirst { it.startsWith("progress:PROVISION_RUNTIME") }
        val iBuild = listener.events.indexOfFirst { it == "stage:BUILD_PLAN" }
        assertTrue(iAssets in 0 until iProgress && iProgress < iBuild)
    }

    @Test
    fun `without totalMemMB memory options pass through unchanged`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val service = LaunchService(InstanceManager(root))

        // 未设置内存 → 无 -Xms/-Xmx，notes 为空
        val plan1 = service.assembleLaunchPlan("1.20.1-t", LaunchOptions(javaExecutable = "/fake/java"))
        assertFalse(plan1.jvmArgs.any { it.startsWith("-Xms") || it.startsWith("-Xmx") })
        assertTrue(plan1.memoryNotes.isEmpty())

        // 显式设置内存 → 原样使用
        val plan2 = service.assembleLaunchPlan(
            "1.20.1-t",
            LaunchOptions(javaExecutable = "/fake/java", minMemoryMb = 777, maxMemoryMb = 1234),
        )
        assertTrue(plan2.jvmArgs.contains("-Xms777M"))
        assertTrue(plan2.jvmArgs.contains("-Xmx1234M"))
        assertTrue(plan2.memoryNotes.isEmpty())
    }

    @Test
    fun `auto applies device tier when memory options unspecified`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val service = LaunchService(InstanceManager(root), totalMemMB = 6144L)

        val plan = service.assembleLaunchPlan("1.20.1-t", LaunchOptions(javaExecutable = "/fake/java"))

        // 6GB 档：min 1536 / max 2560
        assertTrue(plan.jvmArgs.contains("-Xms1536M"))
        assertTrue(plan.jvmArgs.contains("-Xmx2560M"))
        // notes 与 MemoryProfile.of(6144) 一致
        assertEquals(MemoryProfile.of(6144).notes, plan.memoryNotes)
    }

    @Test
    fun `auto tier clamps recommendation on low memory device and records note`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        // 4GB：推荐 max 2048 超过 45% 上限 1843，被下调并带说明
        val service = LaunchService(InstanceManager(root), totalMemMB = 4096L)

        val plan = service.assembleLaunchPlan("1.20.1-t", LaunchOptions(javaExecutable = "/fake/java"))

        assertTrue(plan.jvmArgs.contains("-Xms1024M"))
        assertTrue(plan.jvmArgs.contains("-Xmx1843M"))
        val expected = MemoryProfile.of(4096)
        assertEquals(expected.recommendedMaxMb, 1843)
        assertTrue(plan.memoryNotes.isNotEmpty())
        assertTrue(plan.memoryNotes.any { it.level == MemoryNote.Level.INFO })
    }

    @Test
    fun `explicit memory options take priority and are clamped to 60 percent`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val service = LaunchService(InstanceManager(root), totalMemMB = 4096L)

        val plan = service.assembleLaunchPlan(
            "1.20.1-t",
            LaunchOptions(javaExecutable = "/fake/java", minMemoryMb = 1024, maxMemoryMb = 4096),
        )

        // 用户 min/max 生效，但 max 被钳制到 4096 的 60% = 2457
        assertTrue(plan.jvmArgs.contains("-Xms1024M"))
        assertTrue(plan.jvmArgs.contains("-Xmx2457M"))
        assertFalse(plan.jvmArgs.contains("-Xmx4096M"))
        assertTrue(
            plan.memoryNotes.any {
                it.level == MemoryNote.Level.WARNING && it.message.contains("60%")
            },
        )
    }

    @Test
    fun `explicit memory options within cap are used as-is`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val service = LaunchService(InstanceManager(root), totalMemMB = 8192L)

        val plan = service.assembleLaunchPlan(
            "1.20.1-t",
            LaunchOptions(javaExecutable = "/fake/java", minMemoryMb = 1024, maxMemoryMb = 3000),
        )

        assertTrue(plan.jvmArgs.contains("-Xms1024M"))
        assertTrue(plan.jvmArgs.contains("-Xmx3000M"))
    }

    @Test
    fun `zero or negative memory options are treated as unspecified`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val service = LaunchService(InstanceManager(root), totalMemMB = 6144L)

        val plan = service.assembleLaunchPlan(
            "1.20.1-t",
            LaunchOptions(javaExecutable = "/fake/java", minMemoryMb = 0, maxMemoryMb = 0),
        )

        assertTrue(plan.jvmArgs.contains("-Xms1536M"))
        assertTrue(plan.jvmArgs.contains("-Xmx2560M"))
    }

    @Test
    fun `singleton set and get`() {
        val root = newRoot()
        val service = LaunchService(InstanceManager(root))
        LaunchService.setSingleton(service)
        assertEquals(service, LaunchService.singleton())
    }
}
