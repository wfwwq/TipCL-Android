package com.tipcl.android

import android.content.Context
import android.content.SharedPreferences
import org.json.JSONArray
import org.json.JSONObject
import java.io.File

/** 实例的 UI 元数据（core-launch InstanceManager 只管目录，这里补齐列表页展示字段）。 */
data class InstanceMeta(
    val id: String,
    val mcVersion: String,
    val loader: String,
    val createdAt: Long,
    var lastPlayedAt: Long = 0L,
)

/**
 * 实例元数据仓库：以 SharedPreferences 持久化一个 JSON 数组，
 * 目录层的真实数据（versions/<id>/<id>.json）由 core-launch 的
 * InstanceManager 管理，本类只存列表页所需的展示/排序信息。
 *
 * 内存缓存：首次 [list] 读一次磁盘后驻留，后续 list/upsert/remove/markPlayed
 * 全部走内存（写路径 apply() 异步落盘）。冷启动的首次读取由 UI 在
 * Dispatchers.IO 上完成，保证主线程零磁盘 IO。
 */
class TipCLInstanceStore(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    /** 实例根目录（Mojang 布局），与 InstanceManager 共用。 */
    val instancesRoot: File = File(context.filesDir, "instances")

    @Volatile
    private var cache: List<InstanceMeta>? = null

    fun list(): List<InstanceMeta> = cache ?: readFromPrefs().also { cache = it }

    private fun readFromPrefs(): List<InstanceMeta> {
        val arr = runCatching { JSONArray(prefs.getString(KEY_INSTANCES, "[]")) }.getOrDefault(JSONArray())
        return (0 until arr.length()).map { i ->
            val o = arr.getJSONObject(i)
            InstanceMeta(
                id = o.getString("id"),
                mcVersion = o.getString("mcVersion"),
                loader = o.optString("loader", "vanilla"),
                createdAt = o.optLong("createdAt", 0L),
                lastPlayedAt = o.optLong("lastPlayedAt", 0L),
            )
        }.sortedByDescending { it.lastPlayedAt.takeIf { t -> t > 0 } ?: it.createdAt }
    }

    fun upsert(meta: InstanceMeta) {
        val next = list().filterNot { it.id == meta.id } + meta
        cache = next
        persist(next)
    }

    fun remove(id: String) {
        val next = list().filterNot { it.id == id }
        cache = next
        persist(next)
    }

    fun markPlayed(id: String, at: Long = System.currentTimeMillis()) {
        val meta = list().firstOrNull { it.id == id } ?: return
        upsert(meta.copy(lastPlayedAt = at))
    }

    private fun persist(metas: List<InstanceMeta>) {
        val arr = JSONArray()
        metas.forEach { m ->
            arr.put(
                JSONObject()
                    .put("id", m.id)
                    .put("mcVersion", m.mcVersion)
                    .put("loader", m.loader)
                    .put("createdAt", m.createdAt)
                    .put("lastPlayedAt", m.lastPlayedAt),
            )
        }
        prefs.edit().putString(KEY_INSTANCES, arr.toString()).apply()
    }

    private companion object {
        const val PREFS_NAME = "tipcl_instances"
        const val KEY_INSTANCES = "instances"
    }
}
