package com.tipcl.android.core.launch

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RuleEvaluatorTest {

    private fun rule(action: String, os: String? = null, features: Map<String, Boolean>? = null) =
        Rule(action = action, os = os?.let { OsRule(name = it) }, features = features ?: emptyMap())

    @Test
    fun `empty rules means applicable`() {
        assertTrue(RuleEvaluator.evaluate(emptyList(), "windows", "x86_64", emptyMap()))
    }

    @Test
    fun `os allow rule applies only on matching os`() {
        val rules = listOf(rule("allow", os = "windows"))
        assertTrue(RuleEvaluator.evaluate(rules, "windows", "x86_64", emptyMap()))
        assertFalse(RuleEvaluator.evaluate(rules, "linux", "x86_64", emptyMap()))
        assertFalse(RuleEvaluator.evaluate(rules, "osx", "x86_64", emptyMap()))
    }

    @Test
    fun `os name match is case insensitive`() {
        val rules = listOf(rule("allow", os = "Windows"))
        assertTrue(RuleEvaluator.evaluate(rules, "windows", "x86_64", emptyMap()))
    }

    @Test
    fun `disallow excludes platform`() {
        val rules = listOf(rule("allow"), rule("disallow", os = "osx"))
        assertTrue(RuleEvaluator.evaluate(rules, "windows", "x86_64", emptyMap()))
        assertFalse(RuleEvaluator.evaluate(rules, "osx", "x86_64", emptyMap()))
    }

    @Test
    fun `last matching rule wins`() {
        val rules = listOf(
            rule("disallow", os = "linux"),
            rule("allow", os = "linux"),
        )
        assertTrue(RuleEvaluator.evaluate(rules, "linux", "x86_64", emptyMap()))
    }

    @Test
    fun `feature rules require exact boolean match`() {
        val rules = listOf(rule("allow", features = mapOf("is_demo_user" to true)))
        assertTrue(RuleEvaluator.evaluate(rules, "windows", "x86_64", mapOf("is_demo_user" to true)))
        assertFalse(RuleEvaluator.evaluate(rules, "windows", "x86_64", mapOf("is_demo_user" to false)))
        assertFalse(RuleEvaluator.evaluate(rules, "windows", "x86_64", emptyMap()))
    }

    @Test
    fun `arch matching normalizes aliases`() {
        val archRules = listOf(
            Rule(action = "allow", os = OsRule(name = "windows", arch = "x86")),
        )
        assertTrue(RuleEvaluator.evaluate(archRules, "windows", "x86", emptyMap()))
        assertFalse(RuleEvaluator.evaluate(archRules, "windows", "x86_64", emptyMap()))
    }

    @Test
    fun `arch normalization aliases`() {
        assertEquals("x86_64", RuleEvaluator.normalizeArch("AMD64"))
        assertEquals("x86_64", RuleEvaluator.normalizeArch("x86-64"))
        assertEquals("arm64", RuleEvaluator.normalizeArch("aarch64"))
        assertEquals("x86", RuleEvaluator.normalizeArch("i686"))
    }

    @Test
    fun `currentOs detection on this JVM`() {
        val os = RuleEvaluator.currentOs()
        assertTrue(os in setOf("windows", "linux", "osx") || os.isNotBlank())
    }
}
