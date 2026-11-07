package com.tipcl.android.core.launch

import kotlinx.serialization.Serializable

/**
 * Mojang 版本 JSON 中 `rules[].os` 的结构，三个字段均可选；
 * 全部指定时需同时满足才视为匹配。
 */
@Serializable
data class OsRule(
    /** 操作系统名：windows / linux / osx。 */
    val name: String? = null,
    /** 架构：官方主要使用 x86（32 位）与 arm64。 */
    val arch: String? = null,
    /** 正则匹配的系统版本号（极少使用）。 */
    val version: String? = null,
)

/**
 * 一条规则：`action` 为 allow / disallow，可选的 [os] 与 [features] 条件
 * 决定该规则是否适用。无任何条件时对所有环境适用。
 */
@Serializable
data class Rule(
    val action: String,
    val os: OsRule? = null,
    /** feature 条件，例如 {"is_demo_user": true}；需全部满足。 */
    val features: Map<String, Boolean> = emptyMap(),
)

/**
 * Mojang 规则求值器。
 *
 * 语义（与官方启动器一致）：当 [rules] 非空时，默认结果为“不适用”（false）；
 * 自前向后依次检查每条规则，能适用（os/features 条件全部满足）的规则中
 * **最后一条** 的 action 决定最终结果。rules 为空时默认适用。
 */
object RuleEvaluator {

    /**
     * 求值一组规则。
     *
     * @param rules 版本 JSON 中的 rules 数组，可为空
     * @param os 当前操作系统名（windows/linux/osx）
     * @param arch 当前架构（x86/x86_64/arm64）
     * @param features 当前启用的启动 feature 集合（如 has_custom_resolution=true）
     * @return 该对象是否适用于当前环境
     */
    fun evaluate(
        rules: List<Rule>,
        os: String,
        arch: String,
        features: Map<String, Boolean>,
    ): Boolean {
        if (rules.isEmpty()) return true
        var result = false
        for (rule in rules) {
            if (ruleApplies(rule, os, arch, features)) {
                result = rule.action == "allow"
            }
        }
        return result
    }

    private fun ruleApplies(rule: Rule, os: String, arch: String, features: Map<String, Boolean>): Boolean {
        rule.os?.let { osRule ->
            if (osRule.name != null && !osRule.name.equals(os, ignoreCase = true)) return false
            if (osRule.arch != null && !archMatches(osRule.arch, arch)) return false
            if (osRule.version != null && !Regex(osRule.version).matches(System.getProperty("os.version") ?: "")) return false
        }
        for ((key, expected) in rule.features) {
            if (features[key] != expected) return false
        }
        return true
    }

    /** 归一化比较架构名，amd64 与 x86_64 视为同义。 */
    private fun archMatches(ruleArch: String, currentArch: String): Boolean {
        val a = normalizeArch(ruleArch)
        val b = normalizeArch(currentArch)
        return a == b
    }

    /**
     * 将常见架构描述归一化为 x86 / x86_64 / arm64 之一；
     * 无法识别时原样小写返回。
     */
    fun normalizeArch(raw: String): String {
        val s = raw.lowercase().trim()
        return when {
            s in setOf("amd64", "x86_64", "x86-64", "em64t") -> "x86_64"
            s in setOf("x86", "i386", "i486", "i586", "i686", "ia32") -> "x86"
            s in setOf("arm64", "aarch64") -> "arm64"
            else -> s
        }
    }

    /**
     * 从 JVM 系统属性推导当前操作系统名（windows/linux/osx），
     * 其他系统返回原始小写值。
     */
    fun currentOs(): String {
        val name = System.getProperty("os.name")?.lowercase() ?: return "unknown"
        return when {
            "win" in name -> "windows"
            "mac" in name || "darwin" in name -> "osx"
            "linux" in name || "sunos" in name || "unix" in name -> "linux"
            else -> name
        }
    }

    /** 从 JVM 系统属性推导当前架构（已归一化）。 */
    fun currentArch(): String = normalizeArch(System.getProperty("os.arch") ?: "unknown")
}
