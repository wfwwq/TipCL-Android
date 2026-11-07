package com.tipcl.android.core.launch

import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Forge/Quilt 派生版本 → 启动链路回归（M4 收尾）：
 *
 * 内嵌「Forge finalize 后形态」与「Quilt profile 形态」的版本 JSON 样例，
 * 走完整链路：InstanceManager.installInstance 落盘 → LaunchService.loadMergedSpec
 * （inheritsFrom 合并）→ LibraryResolver → LaunchService.assembleLaunchPlan，
 * 断言 LaunchPlan 的 mainClass / classpath / jvmArgs / gameArgs 正确。
 */
class ForgeQuiltLaunchChainTest {

    /** 原版父版本（Forge/Quilt 均继承它）：带 assetIndex 与 javaVersion 17。 */
    private val vanillaJson = """
        {
          "id": "1.20.1",
          "type": "release",
          "mainClass": "net.minecraft.client.main.Main",
          "arguments": {
            "game": [
              "--username", "${'$'}{auth_player_name}",
              "--version", "${'$'}{version_name}",
              "--assetsDir", "${'$'}{assets_root}",
              "--assetIndex", "${'$'}{assets_index_name}"
            ],
            "jvm": [
              "-Djava.library.path=${'$'}{natives_directory}"
            ]
          },
          "libraries": [
            {"name": "com.mojang:brigadier:1.0.18", "downloads": {"artifact": {"url": "https://libraries.minecraft.net/com/mojang/brigadier/1.0.18/brigadier-1.0.18.jar", "sha1": "abc", "size": 100}}}
          ],
          "assetIndex": {"id": "8", "url": "https://piston-meta.mojang.com/v1/packages/xx/8.json", "totalSize": 100},
          "javaVersion": {"component": "java-runtime-gamma", "majorVersion": 17}
        }
    """.trimIndent()

    /**
     * Forge finalize 后形态（ForgeVersionJsonFinalizer 产出的运行期版本 JSON 的
     * 真实形态）：id/newId、inheritsFrom=原版、BootstrapLauncher 主类、
     * Forge 风格 jvm arguments（-DignoreList / -DmergeModules / -DlibraryDirectory /
     * -Djava.io.tmpdir / -p 模块路径）、libraries 为 name+url 运行期子集。
     */
    private val forgeFinalJson = """
        {
          "id": "1.20.1-forge-47.1.0",
          "inheritsFrom": "1.20.1",
          "type": "release",
          "mainClass": "cpw.mods.bootstraplauncher.BootstrapLauncher",
          "arguments": {
            "game": [
              "--launchTarget", "forgeclient",
              "--fml.forgeVersion", "47.1.0",
              "--fml.mcVersion", "1.20.1",
              "--fml.forgeGroup", "net.minecraftforge",
              "--fml.mcpVersion", "20230612.114412"
            ],
            "jvm": [
              "-Djava.net.preferIPv6Addresses=system",
              "-DignoreList=bootstraplauncher,securejarhandler,asm-commons,asm-util,asm-analysis,asm-tree,asm,JarJarFileSystems,client-extra,fmlcore,javafmllanguage,lowcodelanguage,mclanguage,forge-,${'$'}{version_name}.jar",
              "-DmergeModules=jna-5.10.0,jna-platform-5.10.0",
              "-DlibraryDirectory=${'$'}{library_directory}",
              "-Djava.io.tmpdir=${'$'}{natives_directory}",
              {"rules": [{"action": "allow", "os": {"name": "windows"}}], "value": [
                "-p", "${'$'}{library_directory}/cpw/mods/bootstraplauncher/1.0.0/bootstraplauncher-1.0.0.jar"
              ]}
            ]
          },
          "libraries": [
            {"name": "net.minecraftforge:forge:1.20.1-47.1.0:client", "url": "https://maven.minecraftforge.net/maven/"},
            {"name": "cpw.mods:bootstraplauncher:1.0.0", "url": "https://maven.minecraftforge.net/maven/"},
            {"name": "cpw.mods:securejarhandler:2.1.10", "url": "https://maven.minecraftforge.net/maven/"},
            {"name": "org.ow2.asm:asm:9.5", "url": "https://maven.minecraftforge.net/maven/"}
          ]
        }
    """.trimIndent()

    /** Quilt profile 形态：QuiltClient 主类 + name+url 库（无 arguments，继承原版）。 */
    private val quiltJson = """
        {
          "id": "1.20.1-quilt-0.21.0",
          "inheritsFrom": "1.20.1",
          "type": "release",
          "mainClass": "org.quiltmc.loader.impl.launch.quilt.QuiltClient",
          "libraries": [
            {"name": "org.quiltmc:quilt-loader:0.21.0", "url": "https://maven.quiltmc.org/repository/release/"},
            {"name": "org.quiltmc:quilted-fabric-api:8.0.0-alpha.3+0.99.0-1.20.1", "url": "https://maven.quiltmc.org/repository/release/"}
          ]
        }
    """.trimIndent()

    /** 旧版（1.12-）Forge 形态：minecraftArguments 串含 --tweakClass。 */
    private val legacyForgeJson = """
        {
          "id": "1.12.2-forge-14.23.5.2859",
          "inheritsFrom": "1.12.2",
          "type": "release",
          "mainClass": "net.minecraftforge.launchwrapper.TerminalTweaker",
          "minecraftArguments": "--username ${'$'}{auth_player_name} --version ${'$'}{version_name} --gameDir ${'$'}{game_directory} --tweakClass net.minecraftforge.fml.common.launcher.FMLTweaker",
          "libraries": [
            {"name": "net.minecraftforge:forge:1.12.2-14.23.5.2859", "url": "https://maven.minecraftforge.net/maven/"}
          ]
        }
    """.trimIndent()

    private val legacyVanillaJson = """
        {
          "id": "1.12.2",
          "type": "release",
          "mainClass": "net.minecraft.client.main.Main",
          "minecraftArguments": "--username ${'$'}{auth_player_name} --version ${'$'}{version_name}",
          "libraries": [
            {"name": "com.mojang:brigadier:1.0.18", "downloads": {"artifact": {"url": "https://libraries.minecraft.net/com/mojang/brigadier/1.0.18/brigadier-1.0.18.jar"}}}
          ]
        }
    """.trimIndent()

    private fun newService(root: java.nio.file.Path): LaunchService = LaunchService(InstanceManager(root))

    private fun options() = LaunchOptions(
        javaExecutable = "/fake/java",
        minMemoryMb = 1024,
        maxMemoryMb = 4096,
    )

    @Test
    fun `forge finalized version assembles complete launch plan through the chain`() {
        val root = Files.createTempDirectory("forge-chain")
        val im = InstanceManager(root)
        im.installInstance("1.20.1", vanillaJson)
        im.installInstance("1.20.1-forge-47.1.0", forgeFinalJson)
        val service = newService(root)

        // 合并后的 spec 直接检查一次（loadMergedSpec 环节）
        val merged = service.loadMergedSpec("1.20.1-forge-47.1.0")
        assertEquals("cpw.mods.bootstraplauncher.BootstrapLauncher", merged.mainClass)
        // 子版本参数在前、父版本补足
        assertEquals("-Djava.net.preferIPv6Addresses=system", merged.arguments!!.jvm.first().values.first())
        assertTrue(merged.arguments!!.jvm.any { it.values.contains("-Djava.library.path=${'$'}{natives_directory}") })

        val plan = service.assembleLaunchPlan("1.20.1-forge-47.1.0", options())

        assertEquals("1.20.1-forge-47.1.0", plan.versionId)
        assertEquals("cpw.mods.bootstraplauncher.BootstrapLauncher", plan.mainClass)
        // javaVersion 继承自原版（17）
        assertEquals(RuntimeRequirement(17), plan.javaRequirement)

        // classpath：Forge 子版本构件在前，原版 brigadier 补在后
        val cpNames = plan.libraryResolution.classpath.map { it.name }
        assertEquals(
            listOf(
                "net.minecraftforge:forge:1.20.1-47.1.0:client",
                "cpw.mods:bootstraplauncher:1.0.0",
                "cpw.mods:securejarhandler:2.1.10",
                "org.ow2.asm:asm:9.5",
                "com.mojang:brigadier:1.0.18",
            ),
            cpNames,
        )
        val cpString = plan.jvmArgs[plan.jvmArgs.indexOf("-cp") + 1]
        assertTrue(cpString.contains("forge-1.20.1-47.1.0-client.jar"))
        assertTrue(cpString.contains("bootstraplauncher-1.0.0.jar"))
        assertTrue(cpString.indexOf("bootstraplauncher") < cpString.indexOf("brigadier"))

        // JVM 参数：Forge 的 -DignoreList 等占位符全部被替换
        val nativesDirTail = "versions${java.io.File.separatorChar}1.20.1-forge-47.1.0${java.io.File.separatorChar}natives"
        assertTrue(plan.jvmArgs.any { it.startsWith("-DignoreList=") && it.endsWith("forge-,1.20.1-forge-47.1.0.jar") })
        assertTrue(plan.jvmArgs.any { it.startsWith("-DlibraryDirectory=") && it.contains("libraries") })
        assertTrue(plan.jvmArgs.any { it.startsWith("-Djava.io.tmpdir=") && it.endsWith(nativesDirTail) })
        // 模块路径按规则仅 windows 生效；-p 值中的 library_directory 已替换
        val isWindows = System.getProperty("os.name").lowercase().contains("windows")
        val pIndex = plan.jvmArgs.indexOf("-p")
        if (isWindows) {
            assertTrue(pIndex >= 0, "windows 下 -p 模块路径应生效")
            // library_directory 为系统路径（反斜杠），JSON 内路径段保持正斜杠
            assertTrue(plan.jvmArgs[pIndex + 1].endsWith("/cpw/mods/bootstraplauncher/1.0.0/bootstraplauncher-1.0.0.jar"))
        } else {
            assertTrue(pIndex == -1, "非 windows 规则不应注入 -p 模块路径")
        }
        // 不残留任何未替换占位符
        assertTrue(plan.jvmArgs.none { it.contains("\${'$'}{") }, "jvmArgs 不得残留 \${...} 占位符: ${plan.jvmArgs}")
        // -cp 位于末尾，其后是 game 参数拼接（LaunchPlan 分离存储）
        assertEquals(plan.jvmArgs.lastIndex, plan.jvmArgs.indexOf("-cp") + 1)

        // game 参数：Forge launchTarget（子在前）+ 原版 --username（父在后）
        assertTrue(plan.gameArgs.take(2) == listOf("--launchTarget", "forgeclient"))
        assertTrue(plan.gameArgs.containsAll(listOf("--fml.forgeVersion", "47.1.0", "--fml.mcVersion", "1.20.1")))
        assertTrue(plan.gameArgs.contains("--username"))
        assertTrue(plan.gameArgs.contains("1.20.1-forge-47.1.0"))
    }

    @Test
    fun `quilt profile version assembles complete launch plan through the chain`() {
        val root = Files.createTempDirectory("quilt-chain")
        val im = InstanceManager(root)
        im.installInstance("1.20.1", vanillaJson)
        im.installInstance("1.20.1-quilt-0.21.0", quiltJson)
        val service = newService(root)

        val plan = service.assembleLaunchPlan("1.20.1-quilt-0.21.0", options())

        assertEquals("1.20.1-quilt-0.21.0", plan.versionId)
        assertEquals("org.quiltmc.loader.impl.launch.quilt.QuiltClient", plan.mainClass)
        assertEquals(RuntimeRequirement(17), plan.javaRequirement)

        // classpath：Quilt 子版本构件在前、原版补足；url-only 库按 Maven 布局拼路径
        val cpNames = plan.libraryResolution.classpath.map { it.name }
        assertEquals(
            listOf(
                "org.quiltmc:quilt-loader:0.21.0",
                "org.quiltmc:quilted-fabric-api:8.0.0-alpha.3+0.99.0-1.20.1",
                "com.mojang:brigadier:1.0.18",
            ),
            cpNames,
        )
        val cpString = plan.jvmArgs[plan.jvmArgs.indexOf("-cp") + 1]
        assertTrue(cpString.contains("quilt-loader-0.21.0.jar"))
        assertTrue(cpString.indexOf("quilt-loader") < cpString.indexOf("brigadier"))

        // Quilt 无自有 jvm 参数 → 内存/-cp 由拼装器补上；原版 game 参数全部继承
        assertTrue(plan.jvmArgs.contains("-Xms1024M"))
        assertTrue(plan.jvmArgs.contains("-Xmx4096M"))
        assertTrue(plan.gameArgs.contains("--username"))
        assertTrue(plan.gameArgs.contains("1.20.1-quilt-0.21.0"))
    }

    @Test
    fun `legacy forge tweakClass lands in game args not jvm args`() {
        val root = Files.createTempDirectory("legacyforge-chain")
        val im = InstanceManager(root)
        im.installInstance("1.12.2", legacyVanillaJson)
        im.installInstance("1.12.2-forge-14.23.5.2859", legacyForgeJson)
        val service = newService(root)

        val plan = service.assembleLaunchPlan("1.12.2-forge-14.23.5.2859", options())

        assertEquals("net.minecraftforge.launchwrapper.TerminalTweaker", plan.mainClass)
        // 旧版无 javaVersion → 默认 Java 8
        assertEquals(RuntimeRequirement(8), plan.javaRequirement)
        // --tweakClass 及其值出现在 game 侧 minecraftArguments，且不进 jvmArgs
        val twIndex = plan.gameArgs.indexOf("--tweakClass")
        assertTrue(twIndex >= 0)
        assertEquals("net.minecraftforge.fml.common.launcher.FMLTweaker", plan.gameArgs[twIndex + 1])
        assertTrue(plan.jvmArgs.none { it.contains("tweakClass") || it.contains("FMLTweaker") })
        // 占位符已替换，无残留
        assertTrue(plan.gameArgs.none { it.contains("\${'$'}{") }, "gameArgs 不得残留 \${...} 占位符: ${plan.gameArgs}")
        // 子版本 minecraftArguments 优先于父版本
        assertTrue(plan.gameArgs.indexOf("--tweakClass") >= 0 && plan.gameArgs.contains("--version"))
    }
}
