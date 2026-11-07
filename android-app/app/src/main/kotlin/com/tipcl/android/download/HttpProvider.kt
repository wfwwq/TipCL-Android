package com.tipcl.android.download

import java.util.concurrent.TimeUnit

/**
 * App 层共享 OkHttp 客户端。
 *
 * core-launch 的依赖是 `implementation`，不透传给 :app，因此 app 侧自行声明
 * 同版本 okhttp（见 app/build.gradle.kts），并统一在此构造，保证清单拉取、
 * 库下载、资源下载复用连接池与超时配置。
 */
object HttpProvider {

    val client: okhttp3.OkHttpClient by lazy {
        okhttp3.OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()
    }
}
