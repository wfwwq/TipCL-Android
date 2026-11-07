package com.tipcl.android.download

import com.tipcl.android.core.forgelike.CommandSink
import com.tipcl.android.core.forgelike.HostJavaLocator
import com.tipcl.android.core.launch.RuntimeRequirement
import com.tipcl.android.core.runtime.LocalRuntimeCatalog
import com.tipcl.android.launch.TipCLRuntimeProvisioner
import java.io.File
import java.nio.file.Path

/**
 * Forge processors 执行期的 app 侧支撑：
 * - [ProvisionedJavaLocator]：把 core-runtime 供给的 JRE（本地侧载或远程下载解包）
 *   注入 core-forgelike [ProcessorRunner] 所需的 [HostJavaLocator]；
 * - [CapturingCommandSink]：真实进程执行 processor，捕获 stderr 供失败提示摘要。
 */

/**
 * Android 宿主的 java 定位器：优先复用已就绪 JRE（按 [preferredMajor] 与常见大版本
 * 依次探测），全部未就绪时通过 [TipCLRuntimeProvisioner] 走下载源供给（sources.json
 * 或侧载目录）。首次成功后缓存路径，processor 逐条命令不再重复探测。
 */
class ProvisionedJavaLocator(appDataDir: Path) : HostJavaLocator {

    private val provisioner = TipCLRuntimeProvisioner(appDataDir)
    private val catalog = LocalRuntimeCatalog(appDataDir)

    /** 由当前安装的原版版本 javaVersion 推导的优先大版本（installForge 每次安装前设置）。 */
    @Volatile
    var preferredMajor: Int = 8
        private set

    @Volatile
    private var cachedJava: String? = null

    fun setPreferredMajor(major: Int) {
        preferredMajor = major
        cachedJava = null
    }

    override fun locate(): String? {
        cachedJava?.let { return it }
        // 已就绪 JRE 直接复用，避免为 processor 触发整包 JRE 下载。
        listOf(preferredMajor, 17, 21, 8).distinct().forEach { major ->
            catalog.provisioned(major)?.let { home ->
                LocalRuntimeCatalog.resolveJavaBinary(home)?.toString()?.let {
                    cachedJava = it
                    return it
                }
            }
        }
        // 全部未就绪：走常规供给链（sources.json 下载 / 侧载识别），失败返回 null。
        val handle = runCatching { provisioner.ensureRuntime(RuntimeRequirement(preferredMajor), null) }.getOrNull()
        return handle?.javaExecutable?.also { cachedJava = it }
    }
}

/**
 * [CommandSink] 生产实现：以独立进程执行 processor 工具 jar，stdout 静默排空防管道
 * 阻塞，stderr 捕获限量保留。退出码非 0 时抛出带 stderr 尾部摘要的异常——摘要随
 * ProcessorRunner 的失败一路冒泡，最终呈现在向导的"Forge 安装失败于第 N 步"提示中。
 */
class CapturingCommandSink : CommandSink {

    override fun run(command: List<String>, workingDir: File): Int {
        val process = ProcessBuilder(command)
            .directory(workingDir)
            .start()
        // stdout 排空（内容不关心，但不排会撑满管道缓冲卡死进程）
        Thread { runCatching { process.inputStream.use { it.readBytes() } } }.start()
        val stderr = process.errorStream.readBytes().toString(Charsets.UTF_8)
        val exit = process.waitFor()
        if (exit != 0) {
            throw IllegalStateException(
                "processor 命令退出码 $exit\nstderr 摘要：\n${summarize(stderr)}",
            )
        }
        return exit
    }

    /** stderr 尾部若干非空行（报错通常在末尾），并截断单行超长内容。 */
    private fun summarize(stderr: String, maxLines: Int = 8): String =
        stderr.lines()
            .filter { it.isNotBlank() }
            .takeLast(maxLines)
            .joinToString("\n") { if (it.length > 200) it.take(200) + "…" else it }
}
