# TipCL 安卓端自研重写计划（一页跟踪表）

自研重写工程位于仓库的 `android-app/` 目录（Gradle 多模块：`app`、`core-launch`、`core-runtime`、`core-input`、`core-ui`、`core-forgelike`、`core-audio`）。
本表为唯一进度跟踪入口，每完成一个里程碑更新「状态」列。里程碑编号以各子代理实际执行的序号为准
（早期计划中「M1 核心运行时」单列一行，实施中已并入 M0/M4，编号整体前移，见 M1 行说明）。

| 里程碑 | 内容 | 验收标准 | 状态 |
| --- | --- | --- | --- |
| M0 骨架搭建 | 建立 `android-app/` Gradle 工程与多模块结构，统一 version catalog（`gradle/libs.versions.toml`），接入 GitHub CI（`.github/workflows/android-ci.yml`、`notices.yml`） | 空工程可 `assembleDebug` 出包；CI 绿灯；第三方清单（`THIRD-PARTY-NOTICES.md`）由 `tools/notices/generate_notices.py --check` 校验通过 | done |
| M1 核心运行时基线 | 原计划单列的运行时基线（主进程通信 / 注入层抽象），实施中并入 M0（工程骨架与 Platform 约定）与 M4（下载/联调链路），不再单列 | — | merged（并入 M0/M4） |
| M2 运行时引擎 | `core-runtime`：自研 GLFW 兼容桩、EGL/GL ES 桥（NDK/CMake 3.22.1，abiFilters arm64-v8a / x86_64）、JRE 供给（下载 / 断点续传 / sha256 / 自研 tar 解包）、游戏进程管理（GameProcessBuilder / JavaRuntimeProvider / InputInjector） | host 自检 28/28 通过；单测 37 例（0 失败 / 2 skipped，见 `core-runtime/NOTES.md`）；NDK native 真机编译、chmod/exec 限制、EGL 回退路径 | code-done（代码完成，待真机） |
| M3 输入引擎与 UI 接线 | `core-input` 触控状态机（点按/长按/拖动/摇杆/虚拟按键/快捷栏）+ `core-ui` Compose 覆盖层（InputOverlay / 游戏菜单 / 布局编辑 / 文字输入层） | 单测 core-input 45 例 + core-ui 21 例全绿；触控六项行为按《触控行为验收清单》真机回归 | code-done（代码完成，待真机） |
| M4 启动与下载管线 | `core-launch` 版本清单 / 库解析 / 资源安装 / Fabric 安装 / MirrorPolicy；app 侧下载向导、存档与资源包管理、CrashReporter | 离线单测 81 例全绿；真实网络实测通过（`core-launch/NETTEST.md` 8/8：Mojang / BMCLAPI / fabric-meta）；真机端到端由 M2/M3 联调覆盖 | done |
| M4.5 Forge-like 接入 | `core-forgelike`：Forge install_profile 解析 / ProcessorRunner / version.json finalize；Quilt 安装；app 侧 loader 选择放开（Forge 标注「实验性」并展示风险提示） | 离线单测 11 例全绿；真实 Forge 1.20.1-47.4.28 installer 网络实测 3/3 通过（`core-forgelike/NETTEST.md`） | done |
| M5 真机回归工具包 | `scripts/device/`（install / logcat_game / touch_regress / perf_sample / run_all）+《触控行为验收清单》新增「五、自动化回归」节 | 触控六项行为可半自动化回归 | done（工具包就绪，待真机实测） |
| M6 发行管线与合规收尾 | release 签名链路（GitHub Secrets: `TIPCL_KEYSTORE_BASE64` / `TIPCL_KEYSTORE_PASSWORD` / `TIPCL_KEY_ALIAS`）、tag 触发 `assembleRelease` + apksigner 签名 + GitHub Release 发布；本地打包走 `scripts/build_rewrite_release.bat`（自包含工具链，国内镜像）；`THIRD-PARTY-NOTICES.md` / `NOTICE.md` 合规材料 | 推送 `v*` tag 产出已签名 APK 且 `apksigner verify` 通过；清单无 UNKNOWN 条目 | in-progress（工具链与合规材料就绪，CI native/测试矩阵与本地打包脚本已完成，待真实 tag 验证发布链路） |

> 维护说明：状态取值 `pending` / `in-progress` / `code-done`（代码完成，待真机验证）/ `done` / `merged` / `blocked`。
> CI 与清单工作流见 `.github/workflows/`。注意：标题界面、进存档等「可玩」结论均以真机验证为准，
> 当前工程尚未有任何真机验证记录，相关表述一律标注「待真机」。

---

## 文档终审记录（2026-11-07，文档一致性终审子代理）

### 检查项与结论

| 检查项 | 结论 |
| --- | --- |
| 模块清单 vs `android-app/settings.gradle.kts` | 实际 7 个模块（app + core-launch/runtime/input/ui/forgelike/audio）。原计划表与 README-android 模块表均漏 core-audio（README-android 还漏 core-forgelike 早期版本已含），已修正 |
| 测试数量 vs 测试报告 XML（`**/build/test-results/**`，不重跑） | core-launch 离线 81 例（FabricInstaller 5 + ForgeQuiltLaunchChain 3 + LaunchArgsBuilder 6 + LaunchPlanValidator 16 + LaunchService 10 + MirrorPolicy 12 + ModManager 6 + RuleEvaluator 9 + SavesManager 9 + VersionSpec 5）+ networkTest 8 例；core-input debug/release 各 45 例；core-runtime debug 37 例（含 2 skipped）；core-ui 21 例；core-forgelike 离线 11 例 + network 3 例。全部 0 failures |
| 里程碑状态 | 按真实进度重写：M0 done；M1 merged（并入 M0/M4）；M2/M3 code-done（待真机）；M4 / M4.5 done；M5 done（工具包就绪，待真机实测）；M6 in-progress（待 tag）。「可玩」结论全部标注待真机验证 |
| core-launch NETTEST 内部矛盾 | 原文「7 个用例」与「8/8 通过」并存；测试报告 XML 计 NetworkIntegrationTest 为 8 例（用例 5 为镜像策略补充新增），已统一为 8 |
| Forge/Quilt 可用性 | 源码（`LauncherActivity.kt` loader 步骤 + `InstanceDownloadService.installForge/installQuilt`）已支持四 loader 可选，Forge 标注实验性；README-android 原文「Forge/Quilt 按钮置灰，标注 M4.5 接入」过时，已修正 |
| core-input 模块性质 | `build.gradle.kts` 为 com.android.library，但源码无任何 `android.*` import；验收清单原文「纯 Kotlin，无 Android 依赖」措辞易误读，已改为「模块为 Android library，源码无 android.* 依赖」 |
| README-android 引用路径 | `docs/REWRITE-PLAN.md` 实际位于仓库根 `docs/`（不在 android-app/docs/），README-android 中相对引用已改为 `../docs/REWRITE-PLAN.md` |
| 其余文档 | `触控行为验收清单.md`（阈值/测试名与 core-input 源码一致）、`core-runtime/NOTES.md`（37 例计数一致）、`core-audio/NOTES.md`、`core-forgelike/NETTEST.md`（11+3 一致）、`core-input/CHANGELOG.md`、`THIRD-PARTY-NOTICES.md`、`NOTICE.md`、`scripts/device/*.bat` 与 `build_rewrite_release.bat --help` 文案：未发现与事实冲突 |

### 修正列表

1. `docs/REWRITE-PLAN.md`：里程碑表整体重写（模块清单补 core-forgelike/core-audio；状态改为真实进度；新增 `code-done`/`merged` 状态值并更新图例）；追加本终审记录。
2. `android-app/README-android.md`：
   - 进度跟踪引用改为 `../docs/REWRITE-PLAN.md`；
   - 模块表补 `:core-audio` 行，`:core-input` 说明补触控状态机类；
   - 「Forge/Quilt 按钮置灰，标注 M4.5 接入」改为实际情况（四 loader 可选、Forge 实验性 + 风险提示、Quilt 回退骨架机制）；
   - 「CI 需要 Secrets（M5 清单）」去掉过时的里程碑编号引用。
3. `android-app/docs/触控行为验收清单.md`：模块描述改为「模块为 com.android.library，但源码无任何 android.* import（纯 Kotlin 事件模型，JVM 单测）」。
4. `android-app/core-launch/NETTEST.md`：网络实测源集用例数 7 → 8（与 XML 报告及「8/8 通过」一致），历史段落补充说明。

### 遗留疑问（未改动，供后续确认）

1. `core-runtime/NOTES.md`「构建验证」节记录 `:core-launch:test 20 tests`，与当前报告 81 例差距大——该节为 2026-11-07 当时的历史快照，按日期记录保留未改，但读者易误读为当前值。
2. `LauncherActivity.kt` 中 `strWizardForgeQuiltPending()`（"Forge / Quilt 安装管线将于 M4.5 接入，当前不可选"）疑似已无调用点（死字符串），属源码清理项，不属文档修正范围。
3. `core-runtime/NOTES.md` 记录 `:core-runtime:testDebugUnitTest` 曾因 core-launch 插件解析冲突需在临时工程执行——后续 CI 已能完整跑通 `:core-launch:test`，该冲突是否仍在本地环境复现未验证，仅记录。
4. 根 `README.md` 仅描述 `app/Android/` 重打包链路（该链路与脚本真实存在，无事实冲突），未提及 `android-app/` 自研工程；是否补一节指引属内容增补决策，未擅自添加。

### 附注（构建配置一致性审计，2026-11-07）

version catalog 已收拢可改模块（core-forgelike / core-ui）的硬编码版本并清除僵尸条目；
CI 与 core-runtime 的 NDK 版本对齐结论（r27c = 27.2.12479018）已写入
`.github/workflows/android-ci.yml` 注释；完整审计结论（含不可改模块 `:app`、
`:core-launch`、`:core-audio`、`:core-runtime` 的遗留漂移项：okhttp/serialization/junit
硬编码、core-audio 缺 ndkVersion、core-runtime 重复 defaultConfig 块）记录在
`android-app/README-android.md`「构建配置说明」一节。
