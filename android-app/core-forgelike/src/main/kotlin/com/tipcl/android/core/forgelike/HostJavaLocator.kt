package com.tipcl.android.core.forgelike

import java.io.File

/**
 * 定位一个可执行 Java 运行时的启动器命令。
 *
 * 语义分层：
 * - 桌面 JVM 宿主（含单元测试）：默认实现 [DefaultHostJavaLocator] 查找 JAVA_HOME
 *   与 PATH 上的 `java` 可执行文件；
 * - Android 宿主：processors 需要真正的 JVM 进程（SpecialSource / BinaryPatch 等
 *   工具 jar），ART 不是 JVM，因此 app 侧必须注入 JRE 路径（如捆绑的 Termux/JVM
 *   移植版），在构建 [ProcessorRunner] 时传入自定义 [HostJavaLocator] 实现，
 *   返回 app 安装的 JRE 下的 `java` 绝对路径。
 */
interface HostJavaLocator {
    /** 返回可执行的 java 程序路径（如 `C:\jdk\bin\java.exe`）；找不到返回 null。 */
    fun locate(): String?
}

/** 桌面/测试默认实现：JAVA_HOME 优先，其次 PATH 上的 java。 */
class DefaultHostJavaLocator : HostJavaLocator {

    override fun locate(): String? {
        val home = System.getenv("JAVA_HOME")
        if (!home.isNullOrBlank()) {
            val exe = javaExecutable(File(home))
            if (exe != null) return exe.absolutePath
        }
        // PATH 语义：交给进程创建器按平台默认解析裸命令名。
        val onPath = System.getenv("PATH")
            ?.split(File.pathSeparator)
            ?.map { File(it.trim()) }
            ?.firstNotNullOfOrNull { dir ->
                val exe = javaExecutable(dir)
                exe?.takeIf { it.isFile }
            }
        return onPath?.absolutePath ?: "java"
    }

    private fun javaExecutable(homeDir: File): File? {
        val bin = if (homeDir.name == "bin") homeDir else File(homeDir, "bin")
        return candidates.firstNotNullOfOrNull { File(bin, it).takeIf { f -> f.isFile } }
    }

    private companion object {
        val candidates = listOf("java.exe", "java")
    }
}
