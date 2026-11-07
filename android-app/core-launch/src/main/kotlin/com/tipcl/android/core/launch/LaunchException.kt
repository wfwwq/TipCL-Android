package com.tipcl.android.core.launch

/**
 * core-launch 模块统一业务异常：清单获取失败、版本 JSON 损坏、资源下载失败等
 * 可向 UI 层呈现的启动阶段错误均以本类型抛出，便于上层集中捕获。
 */
class LaunchException(message: String, cause: Throwable? = null) : Exception(message, cause)
