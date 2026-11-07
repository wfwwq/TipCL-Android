package com.tipcl.android.core.forgelike

/**
 * 模加载器安装接口的本地副本。
 *
 * 注意：core-launch 中已存在同名接口 `com.tipcl.android.core.launch.ModLoaderInstaller`，
 * 本模块刻意不依赖 core-launch（避免安装期模块与启动期模块产生编译耦合），
 * 因此按相同签名复制一份。app 层负责桥接：core-forgelike 的实现对象在 app 中
 * 以适配器包装后传入 core-launch 的接口消费点。
 */
interface ModLoaderInstaller {
    /** 该加载器的标识（fabric / quilt / forge）。 */
    val id: String

    /**
     * 为原版版本 [vanillaId] 安装 modloader，返回新版本 id 与版本 JSON 文本。
     * 实现应把结果交给实例管理器落盘（core-launch InstanceManager.installInstance）。
     *
     * @param vanillaId 已安装的原版版本 id
     * @param loaderVersion 加载器版本号
     * @return 生成的新版本 id 与版本 JSON 文本
     */
    fun install(vanillaId: String, loaderVersion: String): Pair<String, String>
}
