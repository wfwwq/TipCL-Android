# TipCL-Android 构建说明

TipCL 安卓端自研重写工程：纯 Kotlin + Jetpack Compose，Gradle 多模块。
进度跟踪见 `../docs/REWRITE-PLAN.md`（仓库根 `docs/`）。

## 环境

- JDK 17（`JAVA_HOME` 需指向 JDK17）
- Android SDK：compileSdk 35（SDK Platform 35 + Build-Tools 34/35），minSdk 26，targetSdk 35
- NDK r26+（CI 固定 r27c）与 CMake 3.22.1（`core-runtime` 的 native 部分必需）
- 本地变量 `ANDROID_HOME` 或 `local.properties` 中的 `sdk.dir`（后者不应提交）

## 模块

| 模块 | 类型 | 说明 |
|---|---|---|
| `:app` | com.android.application | 入口模块，`applicationId=com.tipcl.android`；LauncherActivity / GameHostActivity、平台注入与崩溃收集（`CrashReporter`） |
| `:core-launch` | kotlin("jvm") | 版本清单 / 启动资源解析 / 实例与启动参数构建（VersionManifest、InstanceManager、LaunchArgsBuilder），纯 JVM |
| `:core-runtime` | com.android.library | 运行时环境 + NDK native（CMake 3.22.1，abiFilters arm64-v8a / x86_64）：GameProcessBuilder、JavaRuntimeProvider、共享约定 `com.tipcl.android.core.Platform` |
| `:core-input` | com.android.library | 输入事件通道与触控状态机（InputSink / InputPointerEvent、TouchRouter、LookGesture、DirectionStick、VirtualButton、HotbarTap；源码无 android.* 依赖） |
| `:core-ui` | com.android.library | Compose 组件层（material3，依赖 `:core-input`）；游戏内文字输入层 `TextInputController` / `ChatInputBar`（T 键打开聊天栏、Android IME 中文组字、commit 逐字符注入 + 回车、ESC/返回取消，期间独占输入通道暂停游戏手势） |
| `:core-forgelike` | kotlin("jvm") | Forge-like 安装模型（kotlinx-serialization），纯 JVM：ForgeInstallProfile / ForgeInstaller / ProcessorRunner / ForgeVersionJsonFinalizer / QuiltInstaller |
| `:core-audio` | com.android.library | 音频桥（NDK/CMake）：OpenAL Soft 供给（`OpenAlProvisioner` 下载/sha256/解包/复用）+ 自研 shim `openal_shim.c`（dlopen 转发，无真库时 no-op 降级），与 openal-soft 仅动态链接边界交互 |

共享约定：`core-runtime/src/main/kotlin/com/tipcl/android/core/Platform.kt` 中的
`interface PlatformHooks { fun appDataDir(): Path; fun log(tag: String, msg: String) }`。
core 模块不互相依赖，由 `:app` 注入平台实现并粘合。

## 下载管线（M4，app 侧）

网络与下载全部位于 `app/src/main/kotlin/com/tipcl/android/download/`，UI 只订阅状态：

| 文件 | 职责 |
|---|---|
| `DownloadModels.kt` | 进度一次建模：`DownloadPhase`（VERSION_JSON/CLIENT_JAR/LIBRARIES/ASSET_INDEX/ASSETS/DONE）、`DownloadProgress`（总/已完字节、文件计数、当前文件名、速度）、`InstallState`（Idle/Running/Completed/Failed）、`VersionListItem` |
| `HttpProvider.kt` | App 层共享 OkHttp（core-launch 对 okhttp 是 `implementation` 不透传，`:app` 自行声明同版本 4.12.0） |
| `VersionRepository.kt` | 包装 core-launch `VersionManifestFetcher`：内存缓存 → 磁盘缓存（`instances/meta/version_manifest_v2.json`，TTL 30 分钟）→ 联网刷新；失败逐层回退并在结果中标注 `fromCache`/`error` |
| `InstanceDownloadService.kt` | 安装编排器：自有 `CoroutineScope(SupervisorJob + IO)`，`state: StateFlow<InstallState>` 节流发射（约 150ms）；vanilla 与 fabric 共用同一管线 |

状态流设计（文字图）：

```
UI（向导步骤3）                 InstanceDownloadService
────────────                    ────────────────────────
state.collectAsState() ◄──── StateFlow<InstallState>
                                  │ Running(DownloadProgress)   ← 每 150ms 节流发射
                                  │   phase: VERSION_JSON
                                  │     ├─ VersionManifestFetcher.findVersion → fetchVersionJson
                                  │     └─ InstanceManager.installInstance 落盘 versions/<id>/<id>.json
                                  │   phase: CLIENT_JAR
                                  │     └─ downloads.client.url（org.json 从 JSON 原文提取，
                                  │        VersionSpec 未建模顶层 downloads）→ versions/<id>/<id>.jar
                                  │   phase: LIBRARIES
                                  │     └─ LibraryResolver.resolve(合并链 libraries) → 逐个
                                  │        流式下载（.part → 原子改名，sha1 校验，已存在跳过）
                                  │   phase: ASSET_INDEX
                                  │     └─ AssetInstaller.fetchAssetIndex
                                  │   phase: ASSETS
                                  │     └─ AssetInstaller.install 按 64 个/批分批并发，
                                  │        批间更新进度并响应取消
                                  │ Completed(instanceId) / Failed(message)
cancel() ────────────────► 取消标志 + Job.cancel()；finally 统一删除 .part 残留
```

Fabric 路径：先按原版 id 落盘原版版本 JSON，再调 core-launch `FabricInstaller.install`
生成派生版本（`<vanilla>-fabric`，inheritsFrom 指向原版），`mergeWithParent` 合并后走同一
library/assets 管线。Forge 走 core-forgelike `ForgeInstaller`（install_profile 解析 →
processors 真执行，app 侧 `ForgeSupport` 注入 HostJavaLocator 等支撑），UI 上 loader 选择
已放开四项（vanilla / fabric / quilt / forge），Forge 标注「实验性」并在选中时展示风险提示；
Quilt 走 `QuiltInstaller`，meta 不可达时回退本地骨架版本并向用户提示降级。

### Loader 支持矩阵

| Loader | 安装路径 | 进度阶段 | 失败/降级行为 | 重试 |
|---|---|---|---|---|
| vanilla | 清单 → 版本 JSON → client jar → libraries → assets | VERSION_JSON…ASSETS | Failed，可重试 | 已下载文件跳过 |
| fabric | 原版落盘 → fabric-meta profile → 派生版本落盘 → 同 vanilla 管线 | 同上 | meta 失败抛错 | 同上 |
| quilt | 原版落盘 → Quilt meta（core-forgelike `QuiltInstaller`）→ 派生版本 → 同 vanilla 管线 | 同上 | meta 不可达回退本地骨架版本（`tipclPendingQuiltLibraries` 标记），`Completed.warning` 提示降级 | 同上 |
| forge（实验性） | 原版落盘 → 下载 installer（官方 maven）→ 解包 install_profile + data → `ForgeInstaller.buildPendingTasks` → app 注入 `ProvisionedJavaLocator`（core-runtime JRE）与 `CapturingCommandSink` 的 `ProcessorRunner` 真执行 processors → `ForgeVersionJsonFinalizer` 落盘 → 合并原版走 libraries/assets | 新增 FORGE_SETUP、FORGE_PROCESSORS（阶段名 + processor 序号 i/N） | 失败提示「Forge 安装失败于第 N 步」+ stderr 摘要 | 以相同参数重跑：installer/原版 jar 已存在跳过，已完成 processor 由 outputs 校验自动跳过（断点续跑） |

## 存档与资源包管理（M4，app 侧）

单实例管理页 `app/src/main/kotlin/com/tipcl/android/manage/InstanceManageScreens.kt`
（实例卡片长按 → "管理"进入，Tab 分段：存档 / 资源包）：

- 存档管理：包装 core-launch `SavesManager`（只读使用，全部阻塞调用包
  `withContext(Dispatchers.IO)`，进度为世界级不确定式指示）。支持世界备份（可填备注）、
  备份列表（还原 / 删除）、备份空间统计（`backupStats`）。还原前二次确认，并说明
  SavesManager 的强制安全网行为（先自动备份当前状态）；世界锁冲突（LaunchException）
  转为"该世界有操作进行中"提示。
- 资源包管理：列 `instancesRoot/resourcepacks/` 下的 zip（大小 / 日期）；SAF 导入
  （系统文件选择器流式拷入，重名自动加时间戳后缀）；删除；损坏检测（`ZipFile`
  按 Central Directory 解析失败标红）。激活由游戏内"选项 → 资源包"完成，本页不接管。

取消语义：每个文件/每批之间 `currentCoroutineContext().ensureActive()`；下载字节回调中
轮询取消标志中断 socket 流，保证长文件秒级响应取消。安装完成后向导写入
`InstanceMeta`，列表卡片随即刷新为可启动态；重装同 id 实例会覆盖旧骨架 JSON，
顺带清除历史的 `tipclPendingVanillaDownload` 标记。

## 全局设置（设置页，LauncherActivity SettingsScreen）

设置项持久化于 `TipCLSettingsStore`（`tipcl_settings` SharedPreferences）：

- 最大内存（1024–8192 MB）/ 附加 JVM 参数 / 触控灵敏度（0.2–3.0x）
- 启用声音（默认开）：关闭时启动链路跳过 `AudioInitHook` 的 `-Dopenal.library.path`
  注入与 OpenAL 音频供给（`OpenAlProvisioner` 不触发下载），GameHost 状态栏
  提示一次"声音已关闭（设置中可开启）"；开启时行为与原先完全一致

## 构建

```bash
./gradlew :app:assembleDebug
./gradlew :app:assembleRelease
./gradlew :core-launch:test :core-input:test :core-runtime:testDebugUnitTest
```

版本统一由 `gradle/libs.versions.toml` 管理：AGP 8.5.2 / Kotlin 2.0.20 / compose-bom 2024.09.03。
`versionName` 定义在 `app/build.gradle.kts`，发行产物命名 `TipCL-<versionName>-android.apk`。

### Wrapper 注意事项

**已解决**：`gradle/wrapper/gradle-wrapper.jar` 已随仓库提交（连同 `gradlew`、
`gradlew.bat`、`gradle-wrapper.properties`），由本地 Gradle 8.7 执行
`gradle wrapper --gradle-version 8.7` 正式生成，并通过了
`gradlew --version` / `gradlew help` 自举验证。CI 的
`gradle/actions/wrapper-validation@v4` 可以直接校验通过，新环境无需任何
预处理即可 `./gradlew` 自举。`.gitignore` 已显式保留该 jar
（`!gradle/wrapper/gradle-wrapper.jar`），请勿再次忽略。

**distributionUrl 采用官方源** `services.gradle.org/distributions/gradle-8.7-bin.zip`。
原因：CI 运行在海外 runner 上，官方源可达且快；腾讯镜像虽也可达但链路更慢。
国内开发者若下载慢，可在 `GRADLE_USER_HOME` 下用 `gradle.properties` 的
`distributionUrl` 覆盖，或直接用本地 Gradle 8.7 运行（wrapper jar 已在仓库，
不需要再手动生成）。依赖仓库（google()/mavenCentral()）如受限，可在
`settings.gradle.kts` 中取消阿里云镜像注释。

### 崩溃收集

`app/src/main/kotlin/com/tipcl/android/CrashReporter.kt` 在 `LauncherActivity.onCreate`
安装 `Thread.setDefaultUncaughtExceptionHandler`：未捕获异常会把
时间戳 + 堆栈 + buildInfo（版本、Android 版本、设备/ABI）写入
`<appData>/crash/crash-<yyyyMMdd-HHmmss-SSS>.txt`（appData 取
`getExternalFilesDir(null)`，不可用时回退 `filesDir`），随后交还系统默认处理器。
目录只保留最近 20 份报告。

### 签名

release 签名通过环境变量注入（未配置时回退 debug 签名，仅限本地调试）：

```
TIPCL_SIGNING_STORE_FILE / TIPCL_SIGNING_STORE_PASSWORD
TIPCL_SIGNING_KEY_ALIAS / TIPCL_SIGNING_KEY_PASSWORD
```

release 当前 minify 关闭（`isMinifyEnabled = false`），ProGuard 规则文件已预留。

## 构建配置说明（构建配置一致性审计，2026-11-07）

### version catalog 策略

- 所有可声明版本的依赖与插件统一走 `gradle/libs.versions.toml`（AGP 8.5.2 / Kotlin 2.0.20
  / compose-bom 2024.09.03 / okhttp 4.12.0 / kotlinx-serialization-json 1.7.3 /
  org.json 20240303 / material 1.12.0 等），模块侧只写 `libs.xxx` 别名。
- 本次审计已收拢：`core-forgelike`（kotlinx-serialization-json）、`core-ui`（org.json）
  改为 catalog 别名；删除了 catalog 中无人引用的僵尸条目
  `androidx-junit` / `androidx-espresso-core`（及其 version 项）。
- 已登记但模块侧仍是硬编码（模块由其他代理负责，待其空闲后收拢）：
  - `:app`：`com.squareup.okhttp3:okhttp:4.12.0`（catalog 已有 `libs.okhttp`，改一行即可）
  - `:core-launch`：okhttp 4.12.0 与 kotlinx-serialization-json 1.7.3（同上）
  - `:core-audio` / `:core-runtime`：`junit:junit:4.13.2`（catalog 已有 `libs.junit`）
- 维护约定：新增依赖一律先进 catalog 再引用，禁止在模块 build.gradle.kts 内联版本号。

### NDK 策略

- CI 固定 NDK r27c（= 27.2.12479018，见 `.github/workflows/android-ci.yml` env 注释），
  与 `core-runtime` 的 `ndkVersion = "27.2.12479018"` 严格一致；setup-ndk 预装 +
  `ANDROID_NDK_HOME` 导出后 AGP 不会再自动下载第二份 NDK。
- gradle-home 缓存由 `gradle/actions/setup-gradle@v4` 自带（`~/.gradle`）；NDK 走
  setup-ndk 独立路径，二者不重叠，无需额外去重配置。

### 一致性基线（当前值）

| 项 | 值 | 说明 |
|---|---|---|
| compileSdk / targetSdk | 35 | 全部模块一致 |
| minSdk | 26 | 全部模块一致 |
| JVM 目标 | 17 | Android 模块 `jvmTarget=17` + Java 17；纯 JVM 模块 `jvmToolchain(17)` |
| Kotlin | 2.0.20 | 统一由 catalog `kotlin` version 经插件别名提供 |

### 已知漂移项（记录，未改动）

1. `:core-audio` 未设置 `ndkVersion`（`:core-runtime` 设了 27.2.12479018）。AGP 8.5.2
   默认 NDK 为 26.1.11309408，若本地/CI 只装了 r27c 且未导出 `ANDROID_NDK_HOME`，
   core-audio 可能触发 NDK 自动下载或版本不匹配告警。等该模块空闲后补
   `ndkVersion = "27.2.12479018"` 统一。
2. 库模块插件声明风格不一：`alias(libs.plugins.kotlin.android)`（app）vs
   `id("org.jetbrains.kotlin.android")`（core-runtime/core-audio）vs
   `kotlin("android")`（core-input/core-ui）。三者版本都由根项目
   `apply false` 的 catalog 别名钉住，行为一致，仅风格漂移；统一为 alias 属低优先级清理。
3. `:app`、`:core-launch`、`:core-audio`、`:core-runtime` 的硬编码依赖版本尚未收拢
   （见上「version catalog 策略」清单）。
4. `core-runtime` 的 `defaultConfig` 块在 build.gradle.kts 中出现了两次（native 配置与
   consumerProguardFiles 分写），功能等价但可合并；等该模块空闲后清理。

## 发行流程

### CI（`.github/workflows/android-ci.yml`）

- 推送到 `main`：`build-debug`（matrix: full / arm64）完整构建（含 NDK/CMake 的
  `assembleDebug`）+ 单元测试（`:core-launch:test :core-input:test :core-runtime:testDebugUnitTest`），
  上传测试报告与 APK artifact；另有 `native-arm64` job 专项试跑 native 编译链。
  任一 job 失败自动上传 `android-app/last-build.log`。
- 推送 `v*` tag：`build-release` 构建 `assembleRelease` + 测试 → 解码 keystore →
  apksigner 签名为 `TipCL-<version>-android.apk` → `apksigner verify` →
  自动创建 GitHub Release 上传。

CI 需要 Secrets（发行管线，见 `../docs/REWRITE-PLAN.md` M6 行）：

| Secret | 内容 |
|---|---|
| `TIPCL_KEYSTORE_BASE64` | keystore 文件的 base64（CI 端 `base64 -d` 还原） |
| `TIPCL_KEYSTORE_PASSWORD` | keystore 口令 |
| `TIPCL_KEY_ALIAS` | 签名 key 别名 |

CI 环境固定：JDK 17（temurin）+ NDK r27c（`nttld/setup-ndk@v1`）+ Gradle（`gradle/actions/setup-gradle@v4`）。

### 本地打包（`scripts/build_rewrite_release.bat`，Windows）

自包含脚本：自动定位或下载便携 JDK17 + Gradle 8.7 + Android SDK 到仓库根
`.tools\`（默认清华/腾讯国内镜像，可用 `MIRROR_JDK17` / `MIRROR_GRADLE` /
`SDK_ZIP_URL` 覆盖；已有本地工具目录可用 `LOCAL_TOOLS_DIR` 指定优先复用），
完整构建 release（含 NDK/CMake，需 `ANDROID_NDK_HOME` 或 SDK 内 ndk 目录），
签名逻辑与 CI 一致（env 注入 keystore，未配置回退 debug 签名），产出：

```
dist\TipCL-<versionName>-android.apk
```

用法：`scripts\build_rewrite_release.bat`（`--help` 查看说明）。
注意脚本为纯 ASCII 文本（cmd 批处理对非 ASCII 注释/字符串在非 UTF-8 代码页下解析会错乱）。

## 冷启动主线程 IO 巡检（M6，app 侧，2026-11-07）

目标：LauncherActivity onCreate → Compose 首帧路径上主线程零磁盘/网络 IO。
工具：`app/.../StrictModeCompat.kt`——debug 构建（FLAG_DEBUGGABLE）在主线程安装
StrictMode ThreadPolicy（detectDiskReads/detectDiskWrites/detectNetwork，penaltyLog），
违规打 logcat（tag `TipCL.StrictMode` 触发的 StrictMode violation）。release 空操作。

排查清单（发现 → 处置）：

| # | 位置 | 发现 | 处置 |
|---|------|------|------|
| 1 | `InstanceListScreen`（LauncherActivity） | `remember { store.list() }` 组合期主线程读 SharedPreferences + JSON 解析 | 改 `LaunchedEffect` + `withContext(Dispatchers.IO)`，未就绪显示骨架（CircularProgressIndicator） |
| 2 | `TipCLInstanceStore` | 每次 list/upsert 都读盘 | 加实例级内存缓存：首读驻留，写路径先更新缓存再 `apply()` 异步落盘，语义不变 |
| 3 | `SettingsScreen`（LauncherActivity） | `remember { store.load() }` 组合期主线程读 SharedPreferences | 改 `LaunchedEffect` + IO，未就绪显示骨架 |
| 4 | `TipCLSettingsStore` | 每实例每次 load 读盘 | 进程级 `@Volatile` 内存缓存 + `preload()`（IO 预热），LauncherActivity onCreate 启动预热协程 |
| 5 | `launchInstance` | 点击启动在主线程 load 设置 + markPlayed 落盘 | 移入 lifecycleScope 协程，设置读取/落盘均在 IO，主线程只 startActivity |
| 6 | 删除实例确认 | 主线程 `InstanceManager.deleteInstance`（目录树删除）+ `store.remove` | 移入 `withContext(Dispatchers.IO)`，完成后再刷新列表 |

已确认无问题的路径：`VersionRepository.list`（内部 Dispatchers.IO）、
`InstanceDownloadService`（自持 IO scope）、`InstanceManageScreen`（SavesManager 全部
withContext(IO)）、`GameHostActivity` 启动链路（后台 thread，属允许的同步读边界）、
`CrashReporter.install`（只装 handler，不落盘）。

验收结果：`gradle :app:compileDebugKotlin` 通过；debug 运行冷启动 logcat 中
StrictMode violation 为零（列表/设置页骨架态兜底，首次读取全部发生在 IO 线程）。
