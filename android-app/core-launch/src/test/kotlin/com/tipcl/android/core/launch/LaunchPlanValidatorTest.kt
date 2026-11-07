package com.tipcl.android.core.launch

import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/** LaunchPlanValidator 各失败路径测试。 */
class LaunchPlanValidatorTest {

    private val vanillaJson = """
        {
          "id": "1.20.1-t",
          "type": "release",
          "mainClass": "net.minecraft.client.main.Main",
          "arguments": {"game": ["--username", "${'$'}{auth_player_name}"], "jvm": []},
          "libraries": [
            {"name": "com.mojang:brigadier:1.0.18", "downloads": {"artifact": {"url": "https://libraries.minecraft.net/com/mojang/brigadier/1.0.18/brigadier-1.0.18.jar", "size": 100}}}
          ],
          "assetIndex": {"id": "8", "url": "https://piston-meta.mojang.com/v1/packages/xx/8.json"},
          "javaVersion": {"component": "java-runtime-gamma", "majorVersion": 17}
        }
    """.trimIndent()

    private val fabricJson = """
        {
          "id": "1.20.1-t-fabric",
          "inheritsFrom": "1.20.1-t",
          "mainClass": "net.fabricmc.loader.impl.launch.knot.KnotClient",
          "libraries": []
        }
    """.trimIndent()

    private fun newRoot() = Files.createTempDirectory("validator")

    private fun install(root: java.nio.file.Path, id: String, json: String) {
        val dir = root.resolve("versions").resolve(id)
        Files.createDirectories(dir)
        Files.writeString(dir.resolve("$id.json"), json)
    }

    private val options = LaunchOptions(javaExecutable = "/fake/java")

    /** 写入齐备的 asset index 与对象文件，使资源检查通过。 */
    private fun seedCompleteAssets(root: java.nio.file.Path) {
        val assets = root.resolve("assets")
        Files.createDirectories(assets.resolve("indexes"))
        Files.writeString(assets.resolve("indexes").resolve("8.json"), """{"objects": {"a.png": {"hash": "aabbcc", "size": 3}}}""")
        Files.createDirectories(assets.resolve("objects").resolve("aa"))
        Files.write(assets.resolve("objects").resolve("aa").resolve("aabbcc"), ByteArray(3))
    }

    @Test
    fun `healthy instance yields no issues`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        seedCompleteAssets(root)
        val validator = LaunchPlanValidator(InstanceManager(root))
        assertEquals(emptyList(), validator.validate("1.20.1-t", options))
    }

    @Test
    fun `missing version json`() {
        val root = newRoot()
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("ghost", options)
        assertEquals(1, issues.size)
        assertEquals(ValidationCode.VERSION_JSON_MISSING, issues[0].code)
        assertEquals(ValidationSeverity.ERROR, issues[0].severity)
    }

    @Test
    fun `corrupt version json`() {
        val root = newRoot()
        install(root, "bad", "{not json")
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("bad", options)
        assertEquals(1, issues.size)
        assertEquals(ValidationCode.VERSION_JSON_CORRUPT, issues[0].code)
    }

    @Test
    fun `missing parent in inheritance chain`() {
        val root = newRoot()
        install(root, "1.20.1-t-fabric", fabricJson)
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("1.20.1-t-fabric", options)
        assertTrue(issues.any { it.code == ValidationCode.PARENT_MISSING })
    }

    @Test
    fun `corrupt parent json`() {
        val root = newRoot()
        install(root, "1.20.1-t-fabric", fabricJson)
        install(root, "1.20.1-t", "nonsense{")
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("1.20.1-t-fabric", options)
        assertTrue(issues.any { it.code == ValidationCode.VERSION_JSON_CORRUPT && it.message.contains("父版本") })
    }

    @Test
    fun `blank mainClass flagged`() {
        val root = newRoot()
        install(root, "b", """{"id":"b","mainClass":""}""")
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("b", options)
        assertTrue(issues.any { it.code == ValidationCode.MAIN_CLASS_INVALID })
    }

    @Test
    fun `empty classpath flagged`() {
        val root = newRoot()
        install(root, "nolib", """{"id":"nolib","mainClass":"M","libraries":[]}""")
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("nolib", options)
        assertTrue(issues.any { it.code == ValidationCode.CLASSPATH_EMPTY })
    }

    @Test
    fun `missing asset index flagged`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("1.20.1-t", options)
        assertTrue(issues.any { it.code == ValidationCode.ASSET_INDEX_MISSING })
    }

    @Test
    fun `incomplete asset objects flagged as warning`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val index = """{"objects": {"a.png": {"hash": "aabbcc", "size": 3}}}"""
        val indexes = root.resolve("assets").resolve("indexes")
        Files.createDirectories(indexes)
        Files.writeString(indexes.resolve("8.json"), index)
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("1.20.1-t", options)
        val asset = issues.first { it.code == ValidationCode.ASSETS_INCOMPLETE }
        assertEquals(ValidationSeverity.WARNING, asset.severity)
        assertTrue(asset.message.contains("1"))
    }

    @Test
    fun `complete assets yield no asset issues`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val index = """{"objects": {"a.png": {"hash": "aabbcc", "size": 3}}}"""
        val assets = root.resolve("assets")
        Files.createDirectories(assets.resolve("indexes"))
        Files.writeString(assets.resolve("indexes").resolve("8.json"), index)
        Files.createDirectories(assets.resolve("objects").resolve("aa"))
        Files.write(assets.resolve("objects").resolve("aa").resolve("aabbcc"), ByteArray(3))
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("1.20.1-t", options)
        assertEquals(emptyList(), issues)
    }

    @Test
    fun `runtime not ready flagged when no javaExecutable given`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val validator = LaunchPlanValidator(InstanceManager(root)) { requirement ->
            requirement.major != 17
        }
        val issues = validator.validate("1.20.1-t", LaunchOptions(javaExecutable = ""))
        assertTrue(issues.any { it.code == ValidationCode.RUNTIME_NOT_READY })
        // 用户显式指定 java 可执行文件时跳过 JRE 检查
        seedCompleteAssets(root)
        assertEquals(emptyList(), validator.validate("1.20.1-t", options))
    }

    @Test
    fun `runtime ready via provisioner yields no issue`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        val provisioner = object : RuntimeProvisioner {
            override fun isRuntimeReady(requirement: RuntimeRequirement) = requirement.major == 17

            override fun ensureRuntime(requirement: RuntimeRequirement, listener: ProgressListener?) =
                RuntimeHandle("/fake/java", requirement.major)
        }
        val validator = LaunchPlanValidator(InstanceManager(root), runtimeReady = provisioner::isRuntimeReady)
        seedCompleteAssets(root)
        assertEquals(emptyList(), validator.validate("1.20.1-t", LaunchOptions(javaExecutable = "")))
    }

    // ---- Forge / Quilt 派生实例体检 ----

    private val forgeFinalJson = """
        {
          "id": "1.20.1-t-forge",
          "inheritsFrom": "1.20.1-t",
          "mainClass": "cpw.mods.bootstraplauncher.BootstrapLauncher",
          "arguments": {"jvm": ["-DignoreList=${'$'}{version_name}"]},
          "libraries": [
            {"name": "net.minecraftforge:forge:1.20.1-47.1.0:client", "url": "https://maven.minecraftforge.net/maven/"},
            {"name": "cpw.mods:bootstraplauncher:1.0.0", "url": "https://maven.minecraftforge.net/maven/"}
          ]
        }
    """.trimIndent()

    private val forgeWithoutLoaderJson = """
        {
          "id": "1.20.1-t-forge-broken",
          "inheritsFrom": "1.20.1-t",
          "mainClass": "cpw.mods.bootstraplauncher.BootstrapLauncher",
          "libraries": []
        }
    """.trimIndent()

    private val quiltJson = """
        {
          "id": "1.20.1-t-quilt",
          "inheritsFrom": "1.20.1-t",
          "mainClass": "org.quiltmc.loader.impl.launch.quilt.QuiltClient",
          "libraries": [
            {"name": "org.quiltmc:quilt-loader:0.21.0", "url": "https://maven.quiltmc.org/repository/release/"}
          ]
        }
    """.trimIndent()

    private val quiltWithoutLoaderJson = """
        {
          "id": "1.20.1-t-quilt-broken",
          "inheritsFrom": "1.20.1-t",
          "mainClass": "org.quiltmc.loader.impl.launch.quilt.QuiltClient",
          "libraries": []
        }
    """.trimIndent()

    @Test
    fun `healthy forge derived instance yields no issues`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        install(root, "1.20.1-t-forge", forgeFinalJson)
        seedCompleteAssets(root)
        val validator = LaunchPlanValidator(InstanceManager(root))
        assertEquals(emptyList(), validator.validate("1.20.1-t-forge", options))
    }

    @Test
    fun `healthy quilt derived instance yields no issues`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        install(root, "1.20.1-t-quilt", quiltJson)
        seedCompleteAssets(root)
        val validator = LaunchPlanValidator(InstanceManager(root))
        assertEquals(emptyList(), validator.validate("1.20.1-t-quilt", options))
    }

    @Test
    fun `forge instance missing loader libraries gives readable issue`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        install(root, "1.20.1-t-forge-broken", forgeWithoutLoaderJson)
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("1.20.1-t-forge-broken", options)
        // 原版 brigadier 仍在 → classpath 非空；但 Forge 构件缺失必须单独报出
        assertTrue(issues.none { it.code == ValidationCode.CLASSPATH_EMPTY })
        val issue = issues.first { it.code == ValidationCode.LOADER_LIBRARIES_MISSING }
        assertEquals(ValidationSeverity.ERROR, issue.severity)
        assertTrue(issue.message.contains("net.minecraftforge"))
        assertTrue(issue.message.contains("cpw.mods.bootstraplauncher.BootstrapLauncher"))
    }

    @Test
    fun `quilt instance missing loader libraries gives readable issue`() {
        val root = newRoot()
        install(root, "1.20.1-t", vanillaJson)
        install(root, "1.20.1-t-quilt-broken", quiltWithoutLoaderJson)
        val validator = LaunchPlanValidator(InstanceManager(root))
        val issues = validator.validate("1.20.1-t-quilt-broken", options)
        val issue = issues.first { it.code == ValidationCode.LOADER_LIBRARIES_MISSING }
        assertTrue(issue.message.contains("org.quiltmc"))
    }
}
