package com.tipcl.android.core.launch

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class VersionSpecTest {

    private val modernJson = """
    {
      "id": "1.20.4",
      "type": "release",
      "mainClass": "net.minecraft.client.main.Main",
      "arguments": {
        "game": [
          "--username",
          "${'$'}{auth_player_name}",
          { "rules": [{ "action": "allow", "features": { "is_demo_user": true } }],
            "value": "--demo" },
          { "rules": [{ "action": "allow", "features": { "has_custom_resolution": true } }],
            "value": ["--width", "${'$'}{resolution_width}", "--height", "${'$'}{resolution_height}"] }
        ],
        "jvm": [
          { "rules": [{ "action": "allow", "os": { "name": "windows" } }],
            "value": "-XstartOnFirstThread" },
          "-Djava.net.preferIPv6Addresses=system",
          "-DignoreList=bootstrapLauncher"
        ]
      },
      "libraries": [
        {
          "name": "com.google.code.gson:gson:2.10.1",
          "downloads": {
            "artifact": {
              "url": "https://libraries.minecraft.net/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar",
              "sha1": "d8b0d0c0d0c0d0c0d0c0d0c0d0c0d0c0d0c0d0c0",
              "size": 283845
            }
          }
        },
        {
          "name": "org.lwjgl.lwjgl:lwjgl:3.3.1",
          "downloads": {},
          "rules": [{ "action": "allow", "os": { "name": "osx" } }]
        },
        {
          "name": "net.java.dev.jna:jna:5.12.1",
          "downloads": {
            "artifact": { "url": "https://libraries.minecraft.net/net/java/dev/jna/jna/5.12.1/jna-5.12.1.jar" },
            "classifiers": {
              "natives-windows": { "url": "https://libraries.minecraft.net/net/java/dev/jna/jna/5.12.1/jna-5.12.1-natives-windows.jar" }
            }
          },
          "natives": { "windows": "natives-windows", "linux": "natives-linux" }
        }
      ],
      "assetIndex": {
        "id": "17",
        "url": "https://piston-meta.mojang.com/v1/assets/17/xx/17.json",
        "sha1": "aaaa",
        "totalSize": 400000000
      },
      "assets": "17",
      "javaVersion": { "component": "java-runtime-gamma", "majorVersion": 17 }
    }
    """.trimIndent()

    private val legacyJson = """
    {
      "id": "1.7.10",
      "type": "release",
      "mainClass": "net.minecraft.client.main.Main",
      "minecraftArguments": "--username ${'$'}{auth_player_name} --version ${'$'}{version_name} --gameDir ${'$'}{game_directory}",
      "libraries": [
        { "name": "net.sf.jopt-simple:jopt-simple:4.6" }
      ],
      "assets": "1.7.10"
    }
    """.trimIndent()

    @Test
    fun `parse modern json`() {
        val spec = VersionSpec.parse(modernJson)
        assertEquals("1.20.4", spec.id)
        assertEquals("net.minecraft.client.main.Main", spec.mainClass)
        assertNull(spec.inheritsFrom)
        assertNotNull(spec.arguments)
        assertEquals(4, spec.arguments!!.game.size)
        assertEquals(3, spec.arguments!!.jvm.size)
        assertEquals(17, spec.javaVersion!!.majorVersion)
        assertEquals("17", spec.assetIndex!!.id)
        assertEquals(3, spec.libraries.size)
    }

    @Test
    fun `parse string and object arguments`() {
        val spec = VersionSpec.parse(modernJson)
        assertEquals(listOf("--username"), spec.arguments!!.game[0].values)
        assertTrue(spec.arguments!!.game[1].rules.isEmpty())
        assertEquals(listOf("\${auth_player_name}"), spec.arguments!!.game[1].values)
        val demoArg = spec.arguments!!.game[2]
        assertTrue(demoArg.rules.isNotEmpty())
        assertEquals(listOf("--demo"), demoArg.values)
        val resolutionArg = spec.arguments!!.game[3]
        assertEquals(
            listOf("--width", "\${resolution_width}", "--height", "\${resolution_height}"),
            resolutionArg.values,
        )
    }

    @Test
    fun `parse legacy json`() {
        val spec = VersionSpec.parse(legacyJson)
        assertEquals("1.7.10", spec.id)
        assertNull(spec.arguments)
        assertTrue(spec.minecraftArguments!!.contains("--username"))
        assertEquals("1.7.10", spec.assets)
    }

    @Test
    fun `merge with parent combines libraries and arguments`() {
        val parent = VersionSpec.parse(modernJson)
        val childJson = """
        {
          "id": "1.20.4-fabric",
          "inheritsFrom": "1.20.4",
          "mainClass": "net.fabricmc.loader.impl.launch.knot.KnotClient",
          "arguments": { "game": ["--fabric"], "jvm": ["-Dfabric=true"] },
          "libraries": [
            { "name": "net.fabricmc:fabric-loader:0.15.0",
              "url": "https://maven.fabricmc.net/" }
          ]
        }
        """.trimIndent()
        val child = VersionSpec.parse(childJson).mergeWithParent(parent)

        assertEquals("1.20.4-fabric", child.id)
        assertEquals("net.fabricmc.loader.impl.launch.knot.KnotClient", child.mainClass)
        assertEquals(4, child.libraries.size)
        assertEquals(listOf("--fabric", "--username", "\${auth_player_name}", "--demo", "--width"), child.arguments!!.game.take(5).map { it.values.first() })
        assertEquals("-Dfabric=true", child.arguments!!.jvm.first().values.first())
        assertEquals("17", child.assetIndex!!.id)
        assertEquals(17, child.javaVersion!!.majorVersion)
        assertTrue(child.minecraftArguments == null)
        assertFalse(child.libraries.any { it.name == "net.fabricmc:fabric-loader:0.15.0" && it.downloads != null })
    }

    @Test
    fun `unknown fields are ignored`() {
        val json = """
        { "id": "x", "mainClass": "M", "someFutureField": { "a": 1 },
          "downloads": { "client": { "url": "http://e/c.jar", "sha1": "s", "size": 1 } } }
        """.trimIndent()
        val spec = VersionSpec.parse(json)
        assertEquals("x", spec.id)
        assertEquals("M", spec.mainClass)
    }
}
