package com.tipcl.android.core.audio

import java.io.File

/**
 * 音频子系统对 app 层的门面（M3 骨架）。
 *
 * 职责边界：
 * - 生命周期：[init] 在游戏进程拉起前调用（完成 OpenAL 供给 + shim 就绪检查），
 *   [shutdown] 在进程退出后释放资源。
 * - 设备选择：占位。MC 1.20.1 走 LWJGL3 OpenAL Soft，默认 alcOpenDevice(null)
 *   即 OpenAL Soft 的默认后端（Android 上为 OpenSL/AAudio 后端，由
 *   OpenAL Soft 内部决定）；显式设备名选择留 M4 真机联调后再定
 *   （可通过 -Dopenal.device=... 透传，见 [AudioInitHook]）。
 *
 * 不做的事：不直接 dlopen / 加载任何 so。真 OpenAL Soft 由 [OpenAlProvisioner]
 * 供给到 nativeLibDir，游戏的 -Dopenal.library.path 指向该目录后由 JVM/游戏侧
 * System.loadLibrary("openal") 命中；core-audio 自带的 openal_shim 仅作为
 * 备用转发层（见 core-audio/src/main/cpp/openal_shim.c 头注释）。
 */
class AudioBridge(
    private val provisioner: OpenAlProvisioner,
) {

    /** init 结果：供给到哪里、命中的源、shim 状态（诊断用结构化回传）。 */
    data class InitReport(
        val nativeLibDir: File,
        /** 实际命中的供给源 URL；缓存复用或无候选时为 null。 */
        val sourceUrl: String?,
        /** true = 目录里已就绪（sha256 校验通过），本次零下载。 */
        val reusedCache: Boolean,
    )

    private var report: InitReport? = null

    /**
     * 初始化音频子系统：确保 nativeLibDir 下有可用的 OpenAL Soft 产物。
     *
     * @throws OpenAlProvisionException 供给失败（下载/校验/解包）且无可用缓存。
     */
    @Synchronized
    fun init(abi: String): InitReport {
        report?.let { return it }
        val r = provisioner.provision(abi)
        val rep = InitReport(r.nativeLibDir.toFile(), r.sourceUrl, r.reusedCache)
        report = rep
        return rep
    }

    /**
     * 设备选择（占位）：M3 只记录，M4 真机联调后接入
     * （映射到 alcOpenDevice 参数或 AAudio 设备 id）。
     */
    fun selectDevice(deviceName: String?) {
        // TODO(M3/真机联调): 记录到 LaunchArgs 侧 -Dopenal.device 或 shim 配置。
    }

    @Synchronized
    fun shutdown() {
        report = null
    }
}
