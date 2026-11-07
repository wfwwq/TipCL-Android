# core-launch 版本清单与镜像源联网实测报告（M4）

日期：2026-11-07
环境：Windows 10 x64 / JDK17 (Temurin 17.0.20) / Gradle 8.7 / OkHttp 4.12.0 / kotlinx-serialization 1.7.3

## 运行命令

```bash
# 离线回归（默认 test 任务，已排除 @Tag("network")）
gradlew :core-launch:test

# 网络实测（手动触发）
gradlew :core-launch:networkTest
```

网络实测源集：`core-launch/src/test/kotlin/com/tipcl/android/core/launch/NetworkIntegrationTest.kt`
（8 个用例，全部 `@Tag("network")`，默认单测不跑；用例 5 为镜像策略补充新增，
故早期记录中出现过「7 个用例」的口径）

## 实测结果（全部真实网络输出）

| # | 用例 | 状态 | 关键数据 |
|---|------|------|---------|
| 1a | Mojang piston-meta manifest 拉取 + 结构校验 + 缓存二次命中 | 通过 | versions=922，release=26.3，~278772 字节，首次 1836ms；二次命中 7ms（fetchtime 文件未重写） |
| 1b | BMCLAPI manifest 镜像（bmclapi2.bangbang93.com/mc/game/version_manifest_v2.json） | 通过 | versions=922，480ms |
| 2a | 1.20.1 版本 JSON 下载 + 解析 + LibraryResolver 全量解析 + 3 个 library HEAD | 通过 | 88 条 library，JSON 34974 字节，131ms；classpath=64，nativesMap=0（现代版本预期）；HEAD 200 ×3（oshi-core / gson / lwjgl-glfw-natives-windows） |
| 2b | 同链路走 BMCLAPI 镜像（LibraryResolver(BMCLAPI)）+ 3 个 library HEAD | 通过 | URL 拼装 `bmclapi2.bangbang93.com/maven/...` 全部 HEAD 200（oshi-core / gson / guava-failureaccess） |
| 3a | 1.20.1 assetIndex 下载 + sha1 校验 + 结构校验 + 抽样资源对象 HEAD | 通过 | objects=3598，去重 pending=3575，419ms |
| 3b | assetIndex 经 BMCLAPI manifest + BMCLAPI 资源对象 base HEAD | 通过 | objects=3598；注意：BMCLAPI 版本 JSON 的 assetIndex.url 仍指向 piston-meta（镜像未改写该指针），资源对象 base 换 `bmclapi2.bangbang93.com/assets` 后 HEAD 200 |
| 4 | fabric-meta 枚举 1.20.1 loader 版本 + 拉 profile JSON 归一 + 归一后 LibraryResolver 解析 | 通过 | loader 列表 255 项，最新 0.20.1 (stable)，743ms；profile 归一后 id=1.20.1-fabric，libraries=8，731ms，classpath 解析首项 `org/ow2/asm/asm/9.10.1/asm-9.10.1.jar` → maven.fabricmc.net |
| 5 | **MirrorPolicy 改写后真实可达**（M4 镜像策略补充，2026-11-07 二次实测） | 通过 | `MirrorPolicy.BMCLAPI.rewriteVersionSpec` 将 assetIndex.url 改写为 `bmclapi2.bangbang93.com/v1/packages/<sha1>/5.json`，下载解析 objects=3598 且 sha1 校验通过（4186ms）；client jar 改写后 HEAD 200；资源对象 `bmclapi2.bangbang93.com/assets/<hash2>/<hash>` HEAD 200 |

8/8 通过，0 失败。（2b 用例首轮曾出现镜像集群节点对 HEAD 返回 403 的瞬时波动，重跑通过，
与代码无关；BMCLAPI 为多节点 CDN，单节点偶发 403/5xx 属正常，生产链路由
`MirrorFallbackInterceptor` 兜底回退官方源。）

## 实测中发现并已修复的 bug

1. **`VersionManifest.manifestVersion` 为必填字段，真实 Mojang 清单会反序列化失败**（`VersionManifest.kt`）。
   官方 `version_manifest_v2.json` 顶层只有 `latest`/`versions`，没有 `manifestVersion` 字段；
   离线单测的 fixture 是自造 JSON 所以从未暴露。修复：改为 `val manifestVersion: Int = 2` 默认值，API 语义不变。

2. **`FabricInstaller.LoaderEntry` 结构与线上 fabric-meta v2 不符**（`FabricInstaller.kt`）。
   线上 `/v2/versions/loader/:game` 返回嵌套形态 `{"loader": {"version", "stable"}, "intermediary": ..., "launcherMeta": ...}`，
   原实现按扁平 `{version, stable}` 建模，真实拉取直接 `MissingFieldException`。
   修复：新增 `LoaderEntrySerializer`，兼容嵌套（线上）与扁平（旧约定）两种形态，`LoaderEntry(version, stable)` 公开 API 不变。

3. **测试侧认知修正（非产品代码 bug）**：1.20.1 属现代版本，natives 以 `natives-windows` classifier 构件形式进 classpath，
   `LibraryResolution.natives`（旧版 `natives` map 形态）为空是正确行为，实测后调整了用例断言。

## 失败项清单

无。首次运行时上述 2 个产品 bug 曾导致 2 个用例失败（`natives 为空` 断言失败、fabric `MissingFieldException`），
修复后重跑通过（当时用例集 7/7；用例 5 补充后现共 8 例，见上表 8/8）。

## 附注

- 本机到 GitHub 直连不稳，本次全部走 Mojang 官方域（piston-meta / libraries.minecraft.net / resources.download.minecraft.net）
  与 BMCLAPI、fabric-meta，均直接可达，无需代理。
- 未下载全部资源对象（3575 个），仅按验收要求拉取 index 与抽样 HEAD。
- 归一后的 fabric profile 已通过 `VersionSpec.parse` 回环校验并可被 LibraryResolver 解析（自定义仓库 base 形态 URL 正确）。

## 附注：镜像策略落地（M4「镜像源策略完善」，2026-11-07）

实测确认 BMCLAPI 版本 JSON 内 `assetIndex.url` 与 `downloads.client.url` 仍指向 piston-meta /
piston-data 官方域（镜像不下发改写），故新增 `MirrorPolicy` 在镜像激活时显式改写：

**改写规则（依据 BMCLAPI 公开文档 bmclapidoc.bangbang93.com + 本次真实网络实测）**

- 官方 meta/data 域整域前缀替换为镜像根（路径原样保留）：
  `piston-meta.mojang.com` / `piston-data.mojang.com` / `launchermeta.mojang.com` / `launcher.mojang.com`
  → `https://bmclapi2.bangbang93.com`。实测：
  - assetIndex `…/v1/packages/<sha1>/5.json` → 镜像 200 且 sha1 一致（用例 5）
  - client jar `…/v1/objects/<sha1>/client.jar` → 镜像 200（用例 5）
- assets 对象：`resources.download.minecraft.net/<hash2>/<hash>` → 镜像 `/assets/<hash2>/<hash>`（3b/5 均实测 200）
- libraries：`libraries.minecraft.net` → 镜像 `/maven`，沿用既有 `LibraryResolver`（repository 参数）镜像优先逻辑，不重复造
- 任务书曾假设镜像索引路径为 `assets/<indexId>/<文件名>`，实测 HEAD 404，未采用；BMCLAPI 文档
  亦确认其规则是整域前缀替换而非该形态（见 `MirrorPolicy.kt` 头注释）。

**代码落点（仅 core-launch）**

- `MirrorPolicy.kt`（新增）：`MirrorPolicy`（可注入，`OFF` 默认关闭；`rewriteUrl` /
  `rewriteVersionSpec` / `fallbackUrl` / `assetBaseUrl`）与 `MirrorFallbackInterceptor`
  （镜像非 2xx 或 IO 异常 → 按 `fallbackUrl` 回退官方 URL 重试一次，不级联；异常时优先抛原始根因）。
- `VersionSpec.kt`：补齐顶层 `downloads: Downloads?` 字段建模（`Downloads`/`DownloadInfo` 原有）
  并纳入 `mergeWithParent`（子优先），使镜像改写与继承链合并协作（子版本无 assetIndex 时
  继承父版本后仍能被改写）。
- `AssetInstaller` 资源对象 base 经由既有 `assetBaseUrl` 参数传 `MirrorPolicy.assetBaseUrl` 即可，
  未改动。
- 离线单测 `MirrorPolicyTest.kt`（12 例，全部离线/本地 HttpServer）：改写正确性、关闭态不改写、
  幂等性、mergeWithParent 协作、回退映射纯函数、拦截器非 2xx 回退/连接失败回退/不级联重试。

**回退链设计**

请求 → `MirrorFallbackInterceptor`：镜像请求失败（IOException 或非 2xx）→ `fallbackUrl`
按路径特征逆映射（`/v1/packages/*` → piston-meta，其余 `/v1/*` 对象 → piston-data）→
官方 URL 重试一次 → 回退结果如实返回（成功或官方错误均不再重试）。libraries 侧镜像失败
由 `LibraryResolver` 拼装 URL 后由调用方网络层（可装同一拦截器）统一兜底。
