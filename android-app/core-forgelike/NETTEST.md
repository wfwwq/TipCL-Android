# core-forgelike NETTEST — 真实 Forge installer 解析实测（M4.5）+ Quilt meta 联网实测（M4）

- 日期：2026-11-07
- 方式：`gradle :core-forgelike:networkTest`（`@Tag("network")` 隔离，离线 `test` 不受影响）
- 测试类：`ForgeRealProfileNetworkTest`（4 用例）

## 真实 installer

- 版本：Forge 1.20.1 推荐版 **47.4.28**（promotions_slim.json `1.20.1-recommended`）
- URL：`https://maven.minecraftforge.net/net/minecraftforge/forge/1.20.1-47.4.28/forge-1.20.1-47.4.28-installer.jar`
- SHA-256：`d615397a6b2f1e99d4b454e2db2b4ca2e94be91d5e0243c8c7e023d965db39e7`
- 大小：8,859,760 字节；缓存于 `tools/forge-cache/`，命中且哈希匹配时零网络流量

## 真实 install_profile.json 概况（spec 1 新式格式）

| 项目 | 实测值 |
| --- | --- |
| `minecraft` / `version` | `1.20.1` / `1.20.1-forge-47.4.28`（version 已是全名，非裸加载器号） |
| `processors` | 10 个（6 client 侧可跑，4 个 `sides:["server"]` 被过滤） |
| `libraries` | 36 条，全部为 `downloads.artifact.{path,url,sha1,size}` 新式格式（无 `url`/`clientreq`） |
| `data` | 13 键（BINPATCH、MAPPINGS、MC_SLIM、MC_SRG、PATCHED…） |
| 主工具 | installertools:1.4.1 / jarsplitter:1.1.4 / ForgeAutoRenamingTool:0.1.22 / binarypatcher:1.1.1 |

关键实测语义（此前离线模型未覆盖）：

1. **data 值三种记号**：`'[...]'` 包裹的常量（如 MCP_VERSION=`'20230612.114412'`，需剥引号）、
   `[g:a:v[:classifier][@ext]]` Maven 构件引用（如 MC_SRG，需展开为库内绝对路径）、
   installer jar 内部条目路径（如 BINPATCH=`/data/client.lzma`——**已解决**，见边界 #6 与
   `InstallerEntries` 解析层：展开时解出到 workingDir 并改写为文件系统路径）。
2. **outputs 的 key 也是 `{KEY}` 占位符**（`{"{MC_SLIM}": "{MC_SLIM_SHA}"}`），需先经 data
   表解析出 Maven 坐标再定位构件；value 展开后是 workingDir 相对路径。
3. **args 中除 `{KEY}` 外还有字面 `[...]` 构件引用**（MCP_DATA 的 `--input`），同样需展开。
4. 运行期特殊键（profile 之外由安装器注入）：`ROOT`、`SIDE`、`INSTALLER`、`MINECRAFT_JAR`。

## 集成测试结果（networkTest，3/3 通过）

1. `真实 installer jar 解析 install_profile 并展开任务清单`：下载→jar 解包→解析→buildPendingTasks。
   断言：10 processors、36 libraries、13 data 键；client 侧保留 6 个 RunProcessor（server-only
   按 args 全列表比对确认被过滤）；每个 RunProcessor 的 mainArtifact/args/classpath 非空；
   args/outputs 中全部 `{KEY}` ⊆ data 表 ∪ 4 个特殊键；新式 version 全名不做重复前缀拼接。
2. `ProcessorRunner DryRun 组装前两个 client processor 命令`：DryRunCommandSink 干跑前 2 个
   （MCP_DATA、DOWNLOAD_MOJMAPS）。断言：`java -cp <库内 Maven 布局路径…> …` 组装合法、
   无残留 `{KEY}`/未剥引号；MCP_DATA 字面 `[...]` 输入展开为 mcp_config zip 库路径、
   `{MAPPINGS}` 输出为 mappings.txt 库路径；`{SIDE}`→`client`、`{MOJMAPS}`→client mappings 路径。
3. `version_json 与 profile 元数据一致`：jar 内 version.json id 与 profile.version 一致；
   finalize 产物含 36 条库与 `cpw.mods.modlauncher.Launcher` 主类。

## 实测发现与修复清单

| # | 发现 | 修复 |
| --- | --- | --- |
| 1 | 新式 libraries 无 `url`/`clientreq`，下载元数据在 `downloads.artifact`，旧模型全部解析为 null | `ForgeInstallProfile.ProfileLibrary` 增加 `downloads/artifact(path,url,sha1,size)` 建模与 `downloadBaseUrl` 兜底；DownloadLibrary 取 `downloadBaseUrl` |
| 2 | 新式 profile `version` 字段已是 `1.20.1-forge-47.4.28` 全名，`instanceIdFor` 会拼成 `1.20.1-1.20.1-forge-…` | `buildPendingTasks` 对含 `forge` 的 version 直接用作 newId（旧式裸号仍走 instanceIdFor） |
| 3 | data 值的单引号常量与 `[...]` 构件引用未处理，args 会拿到带记号的裸串 | `ProcessorRunner.expandInternal`：展开后剥对称单引号；`[g:a:v:classifier@ext]` 解析为库目录内 Maven 布局绝对路径 |
| 4 | outputs key 为 `{MC_SLIM}` 等占位符，旧实现直接把 `{…}` 当 Maven 坐标交给 mavenPath | 新增 `outputArtifactCoordinate`：outputs key 经展开+剥引号/方括号还原为纯坐标；outputs value 展开（保持 workingDir 相对语义，不转绝对路径） |
| 5 | outputs/`!` jar 条目回写在占位符 outputs 下同样需要先解析 key | `outputsSatisfied`/`applyOutputs` 统一走 `outputArtifactCoordinate` |
| 6 | data 表 `BINPATCH=/data/client.lzma` 指向 **installer jar 内部条目**而非文件系统路径，ProcessorRunner 正式执行时原样传给 binarypatcher 必失败 | 新增 `InstallerEntries` 解析层（详见下节）；`ProcessorRunner.expandInternal` 展开末段特判注入，DryRun 实测命令已改写为解出路径 |

## 边界 #6：installer jar 内部资源解析（已解决，M4.5）

- 通用化处理：data 展开值凡命中 `/data/...`、`/maven/...` 前缀 **且条目真实存在于
  installer jar 内**（防 Unix 绝对路径误判），统一走 [InstallerEntries]：
  - 解出映射：`/data/client.lzma` → `workingDir/data/client.lzma`、`/maven/<rel>` →
    `workingDir/maven/<rel>`，内容为 jar 内原始字节；
  - 缓存：进程内条目缓存 + 落盘"存在且字节数一致即复用"，二次运行零重复解出；
    副本损坏（字节数不符）自动重解；
  - `/maven/` 通用化：解出后按同相对 Maven 布局路径同步进 libraries 目录
    （已存在不覆盖），DownloadLibrary 的"已存在则跳过下载"语义天然复用该副本。
- 接线：`ProcessorRunner` 新增可选 `installerEntries` 参数（null 保持旧行为）；
  展开发生在 `expandInternal` 末段（引号/方括号剥离之后、相对路径解析之前），对
  args 与 outputs 路径一并生效。真实 profile 中仅 BINPATCH 命中该形态。
- 验证（全部通过）：
  - 离线 `test` 15 例（新增 `InstallerEntriesTest` 4 例：合成 installer jar 验证识别/
    解出/DryRun 命令改写/maven 库复用跳过下载/二次运行缓存）；
  - `networkTest` 4 例（新增"BINPATCH 内部条目解出并改写进 DryRun 命令"：真实
    47.4.28 installer，binarypatcher 命令中 `{BINPATCH}` → `work/data/client.lzma`
    绝对路径，无 `/data/` 原值独立参数，解出字节数与 jar 条目一致）。

修复后 15 个离线测试全部回归通过（ProcessorRunnerTest 8 + FinalizeVersionJsonTest 3 + InstallerEntriesTest 4）。

## Quilt meta 联网实测（M4，2026-11-07）

- 日期：2026-11-07
- 测试类：`QuiltMetaNetworkTest`（4 用例，`@Tag("network")`，随 Forge 4 例一起由
  `gradle :core-forgelike:networkTest` 执行；离线 `test` 不含网络用例）
- 端点：`https://meta.quiltmc.org/v3/versions/loader/1.20.1`（枚举）与
  `/1.20.1/<loader>/profile/json`（profile）
- 耗时：单次 `install()`（枚举外手动锁定版本、仅 profile 拉取+改写）558ms；
  QuiltMetaNetworkTest 4 例合计 12.4s（含多次枚举/profile 请求）
- 实测版本：1.20.1 共 **310 个 loader 构建**，过滤预发布（含 `-beta.` 等）后
  latest stable = **0.30.2**（列表顺序乱序，需按数字分段比较而非取首项）

### meta profile 实测概况（0.30.2）

| 项目 | 实测值 |
| --- | --- |
| `mainClass` | `org.quiltmc.loader.impl.launch.knot.KnotClient`（Quilt 命名空间，非 Fabric 的 `net.fabricmc...`） |
| `id`（meta 原值） | `quilt-loader-0.30.2-1.20.1`（Fabric 风格，被 `QuiltInstaller.install` 改写为 `1.20.1-quilt-0.30.2`） |
| `inheritsFrom` / `type` | `1.20.1` / `release` |
| `libraries` | 11 条（name + 自定义 Maven base URL 两种字段，无 downloads 节点——Fabric 形态） |
| `arguments` | 仅含 `game` 数组（无 `jvm` 键，解析模型须给默认值） |

11 条 library：sponge-mixin 0.17.4+mixin.0.8.7、quilt-json5、asm 族（9.10.1）、
quilt-config 1.3.3、**quilt-loader 0.30.2**、**hashed 1.20.1**（Quilt 特有）、
**intermediary 1.20.1**（指向 maven.fabricmc.net）；quilt 构件指向
`https://maven.quiltmc.org/repository/release/`。

### 集成测试结果（networkTest，4/4 通过）

1. `meta 枚举 1_20_1 loader 版本并选中 latest stable`：310 构建、latest stable=0.30.2。
2. `latest stable profile 经 QuiltInstaller 产出结构与 Fabric 形态对齐`：id 改写、
   inheritsFrom/type/mainClass 断言；quilt-loader/intermediary/hashed 三类必需库齐全；
   每条 library 带 Maven base URL（与 FabricInstaller 产物形态一致）。
3. `profile JSON 经内嵌最小 VersionSpec 语义模型回环解析`：测试内嵌
   `MinimalSpec`（字段同构 core-launch `VersionSpec`，ignoreUnknownKeys + 默认值语义），
   落盘文本可回环解析，不依赖 core-launch 模块。
4. `meta 不可达时回退本地骨架`：坏域名 + 2s 超时 → 骨架 JSON（Fabric Knot 主类占位、
   libraries 空数组、`tipclPendingQuiltLibraries: true`）。

### 结论与备注

- `QuiltInstaller` 联网链路与回退逻辑实测无解析 bug，未改动生产代码。
- 备注（非 bug）：回退骨架 mainClass 用 Fabric `net.fabricmc...KnotClient` 占位，
  与 meta 实测的 Quilt `org.quiltmc...KnotClient` 命名空间不同；骨架本身声明
  `tipclPendingQuiltLibraries: true` 标记待联网补全，启动前须以联网 profile 覆盖。

## 复现

```bash
JAVA_HOME=<jdk17> gradle -g tools/gradle-home :core-forgelike:test          # 离线 15 例
JAVA_HOME=<jdk17> gradle -g tools/gradle-home :core-forgelike:networkTest   # 联网 8 例（Forge 4 + Quilt 4）
```
