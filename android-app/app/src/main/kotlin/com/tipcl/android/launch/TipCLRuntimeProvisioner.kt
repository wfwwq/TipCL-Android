package com.tipcl.android.launch

import com.tipcl.android.core.launch.LaunchStage
import com.tipcl.android.core.launch.ProgressListener
import com.tipcl.android.core.launch.RuntimeHandle
import com.tipcl.android.core.launch.RuntimeProvisioner
import com.tipcl.android.core.launch.RuntimeRequirement
import com.tipcl.android.core.runtime.LocalRuntimeCatalog
import com.tipcl.android.core.runtime.RemoteRuntimeProvider
import com.tipcl.android.core.runtime.RuntimeSource
import kotlinx.coroutines.flow.MutableStateFlow
import org.json.JSONArray
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

/**
 * core-launch [RuntimeProvisioner] 的 app 层实现：包装 core-runtime 的
 * [LocalRuntimeCatalog]（就绪查询/路径约定）与 [RemoteRuntimeProvider]
 * （远程下载 → sha256 校验 → 解包 → chmod）。
 *
 * 下载源清单从 `<appData>/jre/sources.json` 读取（sha256 必填，杜绝假包）：
 * ```json
 * [{"url":"https://…/jdk17-aarch64.tar.gz","sha256":"…","majorVersion":17,"arch":"aarch64","format":"tar.gz"}]
 * ```
 * 文件缺失或为空数组时，未就绪的版本在 [ensureRuntime] 抛出带指引的
 * [IOException]（真机联调时先放置 sources.json，或侧载 JRE 到
 * `<appData>/jre/<major>/` 由 LocalRuntimeCatalog 直接识别）。
 *
 * 进度转发：RemoteRuntimeProvider 无细粒度回调，这里发阶段级事件
 * （[LaunchStage.PROVISION_RUNTIME]），并同步写入 [runtimeStatus]
 * 状态流供 UI 订阅。解析用 org.json（app 模块无 kotlinx-serialization 依赖）。
 */
class TipCLRuntimeProvisioner(
    appDataDir: Path,
    private val runtimeStatus: MutableStateFlow<String?>? = null,
) : RuntimeProvisioner {

    private val catalog = LocalRuntimeCatalog(appDataDir)
    private val sourcesFile: Path = catalog.jreRoot.resolve(SOURCES_FILE_NAME)

    /** 当前生效的下载源（每次 ensureRuntime 时懒加载，便于真机热更新清单）。 */
    @Volatile
    private var loadedSources: List<RuntimeSource>? = null

    private fun loadSources(): List<RuntimeSource> {
        loadedSources?.let { return it }
        if (!Files.isRegularFile(sourcesFile)) {
            loadedSources = emptyList()
            return emptyList()
        }
        val entries = try {
            val arr = JSONArray(Files.newInputStream(sourcesFile).bufferedReader().readText())
            (0 until arr.length()).map { i ->
                val o = arr.getJSONObject(i)
                RuntimeSource(
                    url = o.getString("url"),
                    sha256 = o.getString("sha256"),
                    majorVersion = o.getInt("majorVersion"),
                    arch = o.getString("arch"),
                    format = o.optString("format", "tar.gz"),
                )
            }
        } catch (e: Exception) {
            throw IOException("解析 $sourcesFile 失败: ${e.message}", e)
        }
        loadedSources = entries
        return entries
    }

    override fun isRuntimeReady(requirement: RuntimeRequirement): Boolean =
        catalog.provisioned(requirement.major) != null

    override fun ensureRuntime(requirement: RuntimeRequirement, listener: ProgressListener?): RuntimeHandle {
        catalog.provisioned(requirement.major)?.let { home ->
            return RuntimeHandle(
                javaExecutable = LocalRuntimeCatalog.resolveJavaBinary(home)?.toString()
                    ?: throw IOException("JRE ${requirement.major} 目录损坏（缺 bin/java）: $home"),
                majorVersion = requirement.major,
            )
        }
        val sources = loadSources()
        if (sources.isEmpty()) {
            throw IOException(
                "JRE ${requirement.displayName} 未就绪且无下载源：请放置 ${sourcesFile}" +
                    "（url/sha256/majorVersion/arch/format），或侧载 JRE 到 ${catalog.homeFor(requirement.major)}",
            )
        }
        report(listener, "下载并解压 ${requirement.displayName}…")
        val provider = RemoteRuntimeProvider(catalog, sources, arch = detectArch())
        val home = try {
            provider.provision(requirement.major)
        } finally {
            // 无论成败都清一次 .part/.staging 残骸，避免占用空间
            runCatching { catalog.cleanupCorrupt() }
        }
        val javaBin = LocalRuntimeCatalog.resolveJavaBinary(home)
            ?: throw IOException("JRE ${requirement.major} 解包后缺 bin/java: $home")
        report(listener, "${requirement.displayName} 就绪")
        return RuntimeHandle(javaBin.toString(), requirement.major)
    }

    private fun report(listener: ProgressListener?, detail: String) {
        listener?.onStage(LaunchStage.PROVISION_RUNTIME, detail)
        runtimeStatus?.value = detail
    }

    private fun detectArch(): String {
        // Android 上 os.arch 通常为 aarch64 / x86_64，与 RuntimeSource.arch 约定一致
        val raw = System.getProperty("os.arch") ?: "unknown"
        val norm = raw.lowercase().let { if (it.startsWith("arm64")) "aarch64" else it }
        return norm
    }

    private companion object {
        const val SOURCES_FILE_NAME = "sources.json"
    }
}
