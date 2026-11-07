package com.tipcl.android.core.launch

/**
 * 设备内存档位。由 [MemoryProfile.of] 按设备总内存推导，
 * 调用方负责把 ActivityManager 的 totalMem 换算成 MB 传入——core-launch 只收数字。
 */
enum class MemoryTier(
    /** 是否建议在该档位设备上启动游戏。 */
    val launchRecommended: Boolean,
) {
    /** ≤3GB：不建议启动（MC 1.20.1 最低需求约 3GB 可用），仅允许低配尝试。 */
    DISABLED(false),

    /** 4GB：可启动，保守分配。 */
    LOW(true),

    /** 6GB：标准档。 */
    MID(true),

    /** ≥8GB：充裕档。 */
    HIGH(true),
}

/** 内存分配调整说明，供设置页/启动前向用户展示。 */
data class MemoryNote(
    val level: Level,
    val message: String,
) {
    enum class Level { INFO, WARNING }

    companion object {
        fun info(message: String) = MemoryNote(Level.INFO, message)
        fun warning(message: String) = MemoryNote(Level.WARNING, message)
    }
}

/**
 * 按设备总内存推导的推荐内存分配。
 * 推荐值已做安全上限钳制：max ≤ 总内存 45%（为系统与游戏 native 内存留余量）。
 */
data class MemoryProfile(
    val tier: MemoryTier,
    val totalMemMb: Int,
    val recommendedMinMb: Int,
    val recommendedMaxMb: Int,
    /** 产生 [recommendedMaxMb] 的说明（钳制原因、禁启提示等）。 */
    val notes: List<MemoryNote>,
) {
    companion object {
        /** 推荐档位的安全上限比例：max ≤ 总内存 45%。 */
        const val RECOMMENDED_MAX_RATIO = 0.45

        /** 用户显式设置的上限比例：max ≤ 总内存 60%。 */
        const val USER_MAX_RATIO = 0.60


        /**
         * 档位表（totalMemMB 为设备总内存，非可用内存）：
         * - ≤3072（≤3GB）：禁启档，min 512 / max 1024 仅限尝试
         * - ≤4096（4GB）：min 1024 / max 2048
         * - ≤6144（6GB）：min 1536 / max 2560
         * - 其余（≥8GB）：min 2048 / max 4096
         * 推荐值超出总内存 45% 上限时自动下调并记录原因。
         */
        fun of(totalMemMB: Int): MemoryProfile {
            require(totalMemMB > 0) { "totalMemMB 必须为正数，实际: $totalMemMB" }
            val (tier, rawMin, rawMax) = when {
                totalMemMB <= 3072 -> Triple(
                    MemoryTier.DISABLED, 512, 1024,
                )
                totalMemMB <= 4096 -> Triple(
                    MemoryTier.LOW, 1024, 2048,
                )
                totalMemMB <= 6144 -> Triple(
                    MemoryTier.MID, 1536, 2560,
                )
                else -> Triple(
                    MemoryTier.HIGH, 2048, 4096,
                )
            }

            val notes = mutableListOf<MemoryNote>()
            if (tier == MemoryTier.DISABLED) {
                notes += MemoryNote.warning(
                    "设备内存不足 3GB，低于 Minecraft 1.20.1 的最低运行需求；" +
                        "建议不要启动。如仍要尝试，可使用 min ${rawMin}MB / max ${rawMax}MB 的最低配置。"
                )
            }

            val cap = (totalMemMB * RECOMMENDED_MAX_RATIO).toInt()
            var min = rawMin
            var max = rawMax
            if (max > cap) {
                max = cap
                notes += MemoryNote.info(
                    "推荐上限 ${rawMax}MB 超过安全上限（总内存 $totalMemMB 的 45% = ${cap}MB），" +
                        "已自动下调 max 至 ${cap}MB，为系统与游戏 native 内存留出余量。"
                )
            }
            if (min > max) {
                min = max
                notes += MemoryNote.warning(
                    "总内存过低，初始堆已同步下调至 ${min}MB。"
                )
            }
            return MemoryProfile(tier, totalMemMB, min, max, notes)
        }
    }
}
