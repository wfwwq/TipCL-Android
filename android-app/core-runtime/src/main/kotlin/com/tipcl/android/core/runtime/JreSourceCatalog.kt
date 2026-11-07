package com.tipcl.android.core.runtime

/**
 * JRE 源目录：majors 8/17/21 × aarch64/x86_64 的精选下载源清单（纯数据，无 IO）。
 *
 * 来源优先级（同一档位从上到下取第一个可用项）：
 *  1. [JreSourceTier.ADOPTIUM] — Adoptium Temurin glibc linux JRE，tar.gz，
 *     RemoteRuntimeProvider 解包器直接支持。全部 6 档 sha256 已钉
 *     （取自各 release 官方 .sha256.txt，2026-11-07 抓取；17/aarch64 一条
 *     另经 JreProvisionE2ETest 全链实测下载+校验+解包通过）。
 *  2. [JreSourceTier.POJAV] — PojavLauncherTeam android-openjdk-build-multiarch
 *     release 资产（bionic 链接，天然贴合 Android），但发布格式 tar.xz，
 *     当前解包器不支持——收录为备用，待解包器扩展后启用，sha256 TODO。
 *  3. [JreSourceTier.TERMUX] — Termux main 仓库 openjdk 包（bionic，deb）。
 *     当前 stable 索引只有 openjdk-21/25（17/8 已被移出主仓库），deb 格式
 *     同样待解包器支持；sha256 取自 apt Packages 索引（可复现）。
 *
 * sha256 的复抓/复核脚本见 core-runtime/scripts/gen-jre-source-catalog.py。
 *
 * arch 约定：[JreSourceEntry.arch] 沿用 RuntimeSource 的 "aarch64"/"x86_64"；
 * [JreSourceEntry.androidAbi] 为 Android ABI 名（"arm64-v8a"/"x86_64"），
 * 查询接口两种都接受（见 [CatalogService.sourceFor]）。
 */
enum class JreSourceTier(val displayName: String) {
    /** Adoptium Temurin（glibc linux，tar.gz）——首选，已实测。 */
    ADOPTIUM("Adoptium Temurin (linux glibc)"),

    /** PojavLauncherTeam android-openjdk-build-multiarch（bionic，tar.xz）——备用。 */
    POJAV("PojavLauncherTeam android-openjdk-build-multiarch"),

    /** Termux main 仓库（bionic，deb）——备用。 */
    TERMUX("Termux main repository"),
}

/** 目录中的一条 JRE 源记录（url 为直链模板已展开的固定版本，保证复现性）。 */
data class JreSourceEntry(
    val tier: JreSourceTier,
    val majorVersion: Int,
    val arch: String,
    val androidAbi: String,
    val url: String,
    /** 空 = TODO（真机实测后钉）；非空 = 下载侧硬校验依据。 */
    val sha256: String,
    val format: String,
    /** sha256 是否已从官方渠道钉死。 */
    val sha256Pinned: Boolean,
    /** RemoteRuntimeProvider 解包器当前是否支持该格式。 */
    val supportedByUnpacker: Boolean,
    val bytes: Long = -1L,
    val note: String = "",
) {
    /** 若该条可用（sha256 已钉且格式受支持）则转为 [RuntimeSource]，否则 null。 */
    fun toRuntimeSource(): RuntimeSource? =
        if (sha256Pinned && supportedByUnpacker && sha256.isNotEmpty())
            RuntimeSource(url, sha256, majorVersion, arch, format)
        else null
}

/** 缺失档位的可读异常（message 面向 UI 直接展示）。 */
class JreSourceUnavailableException(message: String) : RuntimeException(message)

/**
 * 目录查询服务：按 (major, arch) 供源，缺失档位给可读错误。
 * 纯内存，不碰网络/磁盘。
 */
class CatalogService(private val entries: List<JreSourceEntry> = JreSourceCatalog.ALL) {

    /**
     * 返回该档位最优先的可用 [RuntimeSource]，无可用源时返回 null。
     * @param arch 接受 "aarch64"/"x86_64" 或 Android ABI "arm64-v8a"。
     */
    fun sourceFor(major: Int, arch: String): RuntimeSource? {
        val a = normalizeArch(arch) ?: return null
        return entries.asSequence()
            .filter { it.majorVersion == major && it.arch.equals(a, ignoreCase = true) }
            .map { it.toRuntimeSource() }
            .firstOrNull { it != null }
    }

    /** 同 [sourceFor]，缺失时抛 [JreSourceUnavailableException]（message 可直接给 UI）。 */
    fun requireSource(major: Int, arch: String): RuntimeSource =
        sourceFor(major, arch)
            ?: throw JreSourceUnavailableException(unavailableMessage(major, arch))

    /** 供 UI 的可读错误文案："该版本 JRE 暂缺" + 已收录档位清单。 */
    fun unavailableMessage(major: Int, arch: String): String {
        val a = normalizeArch(arch) ?: arch
        val covered = entries.map { "${it.majorVersion}/${it.androidAbi}" }
            .distinct()
            .sorted()
            .joinToString(", ")
        return "该版本 JRE 暂缺：Java $major @ $a 在源目录中没有可用下载源。" +
            "目录已收录档位：$covered"
    }

    companion object {
        /** 归一化 arch：Android ABI → RuntimeSource arch 约定；未知返回 null。 */
        fun normalizeArch(arch: String): String? = when (arch.lowercase()) {
            "arm64-v8a", "aarch64", "arm64" -> "aarch64"
            "x86_64", "x64", "amd64" -> "x86_64"
            else -> null
        }
    }
}

/** 静态目录数据。更新流程：跑 scripts/gen-jre-source-catalog.py → 粘贴替换。 */
object JreSourceCatalog {

    val ALL: List<JreSourceEntry> = listOf(
        // ---- Tier 1: Adoptium Temurin (tar.gz, sha256 官方钉死, 解包器支持) ----
        // sha256 来源：各 release 官方 *.tar.gz.sha256.txt（2026-11-07 抓取）
        JreSourceEntry(
            JreSourceTier.ADOPTIUM, 8, "aarch64", "arm64-v8a",
            "https://github.com/adoptium/temurin8-binaries/releases/download/" +
                "jdk8u412-b08/OpenJDK8U-jre_aarch64_linux_hotspot_8u412b08.tar.gz",
            "17550a6a4ddf71ac81ba8f276467bc58f036c123c0f1bafcafd69f70e3e49cf5",
            "tar.gz", sha256Pinned = true, supportedByUnpacker = true, bytes = 40_396_991L,
            note = "Temurin 8u412-b08；HEAD 探测可达（经 api.github.com 资产核名）",
        ),
        JreSourceEntry(
            JreSourceTier.ADOPTIUM, 8, "x86_64", "x86_64",
            "https://github.com/adoptium/temurin8-binaries/releases/download/" +
                "jdk8u412-b08/OpenJDK8U-jre_x64_linux_hotspot_8u412b08.tar.gz",
            "a8d994332a2ff15d48bf04405c3b2f6bd331a928dd96639b15e62891f7172363",
            "tar.gz", sha256Pinned = true, supportedByUnpacker = true, bytes = 41_415_973L,
            note = "Temurin 8u412-b08",
        ),
        JreSourceEntry(
            JreSourceTier.ADOPTIUM, 17, "aarch64", "arm64-v8a",
            "https://github.com/adoptium/temurin17-binaries/releases/download/" +
                "jdk-17.0.13%2B11/OpenJDK17U-jre_aarch64_linux_hotspot_17.0.13_11.tar.gz",
            "97c4fb748eaa1292fb2f28fec90a3eba23e35974ef67f8b3aa304ad4db2ba162",
            "tar.gz", sha256Pinned = true, supportedByUnpacker = true, bytes = 45_432_834L,
            note = "唯一一条全链实测源（JreProvisionE2ETest：下载 45MB + sha256 校验 + 解包 + 文件树完整性全过）",
        ),
        JreSourceEntry(
            JreSourceTier.ADOPTIUM, 17, "x86_64", "x86_64",
            "https://github.com/adoptium/temurin17-binaries/releases/download/" +
                "jdk-17.0.13%2B11/OpenJDK17U-jre_x64_linux_hotspot_17.0.13_11.tar.gz",
            "4086cc7cb2d9e7810141f255063caad10a8a018db5e6b47fa5394c506ab65bff",
            "tar.gz", sha256Pinned = true, supportedByUnpacker = true, bytes = 46_082_619L,
            note = "Temurin 17.0.13+11",
        ),
        JreSourceEntry(
            JreSourceTier.ADOPTIUM, 21, "aarch64", "arm64-v8a",
            "https://github.com/adoptium/temurin21-binaries/releases/download/" +
                "jdk-21.0.5%2B11/OpenJDK21U-jre_aarch64_linux_hotspot_21.0.5_11.tar.gz",
            "e4d02c33aeaf8e1148c1c505e129a709c5bc1889e855d4fb4f001b1780db42b4",
            "tar.gz", sha256Pinned = true, supportedByUnpacker = true, bytes = 50_907_259L,
            note = "Temurin 21.0.5+11",
        ),
        JreSourceEntry(
            JreSourceTier.ADOPTIUM, 21, "x86_64", "x86_64",
            "https://github.com/adoptium/temurin21-binaries/releases/download/" +
                "jdk-21.0.5%2B11/OpenJDK21U-jre_x64_linux_hotspot_21.0.5_11.tar.gz",
            "553dda64b3b1c3c16f8afe402377ffebe64fb4a1721a46ed426a91fd18185e62",
            "tar.gz", sha256Pinned = true, supportedByUnpacker = true, bytes = 51_849_867L,
            note = "Temurin 21.0.5+11",
        ),

        // ---- Tier 2: PojavLauncherTeam android-openjdk-build-multiarch ----
        // bionic 链接更贴合 Android，但发布格式 tar.xz，解包器暂不支持；
        // TODO(真机实测后钉 sha256) 并扩展解包器后把 supportedByUnpacker 翻 true。
        JreSourceEntry(
            JreSourceTier.POJAV, 8, "aarch64", "arm64-v8a",
            "https://github.com/PojavLauncherTeam/android-openjdk-build-multiarch/releases/download/" +
                "jre8-40df388/jre8-arm64-20220811-release.tar.xz",
            "", "tar.xz", sha256Pinned = false, supportedByUnpacker = false,
            note = "TODO(真机实测后钉 sha256)；jre8 release 无 x86_64 资产",
        ),
        JreSourceEntry(
            JreSourceTier.POJAV, 17, "aarch64", "arm64-v8a",
            "https://github.com/PojavLauncherTeam/android-openjdk-build-multiarch/releases/download/" +
                "jre17-ec28559/jre17-arm64-20210825-release.tar.xz",
            "", "tar.xz", sha256Pinned = false, supportedByUnpacker = false,
            note = "TODO(真机实测后钉 sha256)",
        ),
        JreSourceEntry(
            JreSourceTier.POJAV, 17, "x86_64", "x86_64",
            "https://github.com/PojavLauncherTeam/android-openjdk-build-multiarch/releases/download/" +
                "jre17-ec28559/jre17-x86_64-20210825-release.tar.xz",
            "", "tar.xz", sha256Pinned = false, supportedByUnpacker = false,
            note = "TODO(真机实测后钉 sha256)",
        ),
        // 21：PojavLauncherTeam 无 jre21 release（2026-11-07 查证）→ 不收录。

        // ---- Tier 3: Termux main (deb, bionic) ----
        // sha256 取自 apt Packages 索引；deb 待解包器支持。
        // openjdk-17 / openjdk-8 已不在当前 stable 主仓库索引（2026-11-07 查证）→ 不收录。
        JreSourceEntry(
            JreSourceTier.TERMUX, 21, "aarch64", "arm64-v8a",
            "https://packages.termux.dev/apt/termux-main/" +
                "pool/main/o/openjdk-21/openjdk-21_21.0.13-1_aarch64.deb",
            "f48d68d486a08cdb0993e08e61e6d8d47aba3dba8d9634311eace92f681e0244",
            "deb", sha256Pinned = true, supportedByUnpacker = false, bytes = 106_094_164L,
            note = "openjdk-21 21.0.13-1；注意这是 JDK（含 javac）非纯 JRE；deb 解包待支持",
        ),
        JreSourceEntry(
            JreSourceTier.TERMUX, 21, "x86_64", "x86_64",
            "https://packages.termux.dev/apt/termux-main/" +
                "pool/main/o/openjdk-21/openjdk-21_21.0.13-1_x86_64.deb",
            "bb3918ef064e14bb15c32e5b208e5c53f847f890c6a5e47e61d66cbed3a1c81e",
            "deb", sha256Pinned = true, supportedByUnpacker = false, bytes = 107_431_260L,
            note = "openjdk-21 21.0.13-1",
        ),
    )

    /** majors × arch 目录必须覆盖的档位矩阵（Tier 1 口径）。 */
    val REQUIRED_MAJORS = setOf(8, 17, 21)
    val REQUIRED_ARCHES = setOf("aarch64", "x86_64")
}
