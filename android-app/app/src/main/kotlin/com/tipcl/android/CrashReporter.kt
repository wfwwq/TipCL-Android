package com.tipcl.android

import android.content.Context
import android.os.Build
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import kotlin.system.exitProcess

/**
 * 崩溃收集：捕获未处理异常，把时间戳、堆栈与 buildInfo 落盘到
 * `<appData>/crash/`（appData = getExternalFilesDir(null) ?: filesDir）。
 * 写入完成后把异常交还给系统默认处理器，保持系统崩溃对话框/ANR 行为不变。
 */
object CrashReporter {

    private const val DIR_NAME = "crash"
    private const val MAX_FILES = 20

    private val timestamp = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss-SSS")

    fun install(context: Context) {
        val appContext = context.applicationContext
        val systemHandler = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            runCatching { writeReport(appContext, thread, throwable) }
            systemHandler?.uncaughtException(thread, throwable) ?: exitProcess(2)
        }
    }

    private fun writeReport(context: Context, thread: Thread, throwable: Throwable) {
        val dir = crashDir(context).apply { mkdirs() }
        val stack = StringWriter().also { throwable.printStackTrace(PrintWriter(it)) }.toString()
        val file = File(dir, "crash-${ZonedDateTime.now().format(timestamp)}.txt")
        file.writeText(buildReport(context, thread, throwable, stack))

        // 只保留最近 MAX_FILES 份，避免崩溃目录无限膨胀。
        dir.listFiles { f -> f.isFile && f.name.startsWith("crash-") }
            ?.sortedByDescending { it.name }
            ?.drop(MAX_FILES)
            ?.forEach { it.delete() }
    }

    private fun buildReport(context: Context, thread: Thread, throwable: Throwable, stack: String): String = buildString {
        appendLine("== TipCL crash report ==")
        appendLine("time: ${ZonedDateTime.now()}")
        appendLine("thread: ${thread.name} (id=${thread.id})")
        appendLine("exception: ${throwable.javaClass.name}: ${throwable.message}")
        appendLine("--- buildInfo ---")
        appendLine("appVersion: ${appVersion(context)}")
        appendLine("android: ${Build.VERSION.RELEASE} (sdk=${Build.VERSION.SDK_INT})")
        appendLine("device: ${Build.MANUFACTURER} ${Build.MODEL} / abi=${Build.SUPPORTED_ABIS.joinToString(",")}")
        appendLine("--- stacktrace ---")
        append(stack)
    }

    private fun appVersion(context: Context): String = runCatching {
        val pi = context.packageManager.getPackageInfo(context.packageName, 0)
        "${pi.versionName} (${pi.longVersionCode})"
    }.getOrDefault("unknown")

    private fun crashDir(context: Context): File {
        val base = context.getExternalFilesDir(null) ?: context.filesDir
        return File(base, DIR_NAME)
    }
}
