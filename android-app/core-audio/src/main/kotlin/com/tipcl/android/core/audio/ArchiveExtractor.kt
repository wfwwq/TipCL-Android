package com.tipcl.android.core.audio

import java.io.IOException
import java.nio.file.Path

/**
 * 归档解包能力抽象。
 *
 * core-audio 不直接依赖 core-runtime（那边的 TarExtractor/下载器面向 JRE 供给），
 * 而是以此接口注入解包实现。调用方（app 装配层）负责传入一个把
 * [archive] 解到 [destDir] 的实现（可包装 core-runtime 的 TarExtractor /
 * java.util.zip.ZipInputStream 等）。
 *
 * 契约：
 * - 覆盖/合并语义：destDir 已存在的同名文件允许覆盖（便于版本升级复用）；
 * - 剥离发布包公共顶层目录不是本接口职责，由实现方决定并写进其文档；
 * - 失败必须抛 [IOException]，不得留下"看起来成功"的部分结果
 *   （实现方应先解到临时目录再原子 rename，或失败时清理）。
 */
fun interface ArchiveExtractor {
    fun extract(archive: Path, destDir: Path)
}
