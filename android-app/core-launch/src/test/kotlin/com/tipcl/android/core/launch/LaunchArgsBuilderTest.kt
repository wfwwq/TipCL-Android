package com.tipcl.android.core.launch

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LaunchArgsBuilderTest {

    private val builder = LaunchArgsBuilder(os = "windows", arch = "x86_64")

    private val modernSpec = VersionSpec.parse(
        """
        {
          "id": "1.20.4",
          "type": "release",
          "mainClass": "net.minecraft.client.main.Main",
          "arguments": {
            "game": [
              "--username", "${'$'}{auth_player_name}",
              "--version", "${'$'}{version_name}",
              "--assetsDir", "${'$'}{assets_root}",
              "--assetIndex", "${'$'}{assets_index_name}",
              "--uuid", "${'$'}{auth_uuid}",
              "--accessToken", "${'$'}{auth_access_token}",
              "--userType", "${'$'}{user_type}",
              { "rules": [{ "action": "allow", "features": { "has_custom_resolution": true } }],
                "value": ["--width", "${'$'}{resolution_width}", "--height", "${'$'}{resolution_height}"] }
            ],
            "jvm": [
              { "rules": [{ "action": "allow", "os": { "name": "osx" } }],
                "value": "-XstartOnFirstThread" },
              { "rules": [{ "action": "allow", "os": { "name": "windows" } }],
                "value": "-XX:HeapDumpPath=MojangTricksIntelDriversForPerformance" },
              "-Djava.net.preferIPv6Addresses=system"
            ]
          },
          "assetIndex": { "id": "17", "url": "http://e/17.json" },
          "libraries": []
        }
        """.trimIndent(),
    )

    private val legacySpec = VersionSpec.parse(
        """
        {
          "id": "1.7.10",
          "type": "release",
          "mainClass": "net.minecraft.client.main.Main",
          "minecraftArguments": "--username ${'$'}{auth_player_name} --version ${'$'}{version_name} --gameDir ${'$'}{game_directory}",
          "libraries": []
        }
        """.trimIndent(),
    )

    private fun options(
        demo: Boolean = false,
        width: Int? = null,
        fullscreen: Boolean = false,
        server: String? = null,
    ) = LaunchOptions(
        javaExecutable = "java",
        maxMemoryMb = 4096,
        minMemoryMb = 512,
        playerName = "Steve",
        windowWidth = width,
        windowHeight = width?.let { it * 9 / 16 },
        fullscreen = fullscreen,
        demo = demo,
        serverAddress = server,
        serverPort = if (server != null) 25565 else null,
    )

    @Test
    fun `jvm args include memory spec jvm args and classpath`() {
        val args = builder.buildJvmArgs(
            modernSpec, options(), nativesDir = java.nio.file.Path.of("/tmp/n"),
            classpath = "a.jar;b.jar", librariesDir = java.nio.file.Path.of("/tmp/lib"),
        )
        assertEquals("-Xms512M", args[0])
        assertEquals("-Xmx4096M", args[1])
        assertTrue(args.contains("-Djava.net.preferIPv6Addresses=system"))
        assertTrue(args.contains("-XX:HeapDumpPath=MojangTricksIntelDriversForPerformance"))
        // osx 专属参数在 windows 上被 rules 过滤
        assertFalse(args.contains("-XstartOnFirstThread"))
        assertEquals("a.jar;b.jar", args[args.size - 1])
        assertEquals("-cp", args[args.size - 2])
    }

    @Test
    fun `game args substitute placeholders`() {
        val args = builder.buildGameArgs(modernSpec, options(), java.nio.file.Path.of("/game"))
        assertTrue(args.contains("--username"))
        assertEquals("Steve", args[args.indexOf("--username") + 1])
        assertEquals("1.20.4", args[args.indexOf("--version") + 1])
        assertEquals("17", args[args.indexOf("--assetIndex") + 1])
        assertTrue(args[args.indexOf("--assetsDir") + 1].endsWith("assets"))
        // 未设置分辨率 feature：--width 不出现
        assertFalse(args.contains("--width"))
        // uuid 为离线推导
        val uuid = args[args.indexOf("--uuid") + 1]
        assertTrue(uuid.length == 36 && uuid.count { it == '-' } == 4)
    }

    @Test
    fun `resolution feature activates width height`() {
        val args = builder.buildGameArgs(
            modernSpec, options(width = 1280), java.nio.file.Path.of("/game"),
        )
        assertEquals("1280", args[args.indexOf("--width") + 1])
        assertEquals("720", args[args.indexOf("--height") + 1])
    }

    @Test
    fun `demo fullscreen and server appended`() {
        val args = builder.buildGameArgs(
            modernSpec, options(demo = true, fullscreen = true, server = "mc.example.com"),
            java.nio.file.Path.of("/game"),
        )
        assertTrue(args.contains("--demo"))
        assertTrue(args.contains("--fullscreen"))
        assertEquals("mc.example.com", args[args.indexOf("--server") + 1])
        assertEquals("25565", args[args.indexOf("--port") + 1])
    }

    @Test
    fun `legacy minecraftArguments is substituted`() {
        val gameDir = java.nio.file.Path.of("/game")
        val args = builder.buildGameArgs(legacySpec, options(), gameDir)
        assertEquals(
            listOf("--username", "Steve", "--version", "1.7.10", "--gameDir", gameDir.toAbsolutePath().toString()),
            args,
        )
    }

    @Test
    fun `full command shape`() {
        val cmd = builder.buildFullCommand(
            modernSpec, options(),
            nativesDir = java.nio.file.Path.of("/n"),
            classpath = "a.jar", librariesDir = java.nio.file.Path.of("/lib"),
            gameDir = java.nio.file.Path.of("/game"),
        )
        assertEquals("java", cmd.first())
        assertEquals("net.minecraft.client.main.Main", cmd.last { it.startsWith("net.minecraft") })
        assertTrue(cmd.indexOf("net.minecraft.client.main.Main") > cmd.indexOf("-cp"))
        assertTrue(cmd.indexOf("--username") > cmd.indexOf("net.minecraft.client.main.Main"))
    }
}
