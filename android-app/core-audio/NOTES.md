# core-audio NOTES

## 0. M3 收尾：host 真库直通验证（2026-11-07）

hostcheck 新增 `--with-real-lib` 模式：shim 对着 openal-soft 官方 Windows
预编译 `soft_oal.dll`（Win64，1.23.1）做直通验证。真库来源与 sha256 见
`tools/openal-cache/provenance.txt`（kcat/openal-soft 官方 Releases bin zip，
gh-proxy.com 镜像下载）。`build_host.bat` 会先跑 STUB 模式，再在 PATH 前插
cache 的 `bin\Win64` 目录跑直通模式（DLL 只对那一次运行可见，STUB 回归不受影响）。

**结论：真库直通 OK。** 两模式自检均 ALL PASSED（输出见下）。直通验证覆盖：
alGenBuffers(16) 零错误、alBufferData 正常数据/未知 format/重复删除的错误码、
alGetBufferi(AL_SIZE) 回读真实数据大小、alGenSources/alSourcei/alSourcef/
alSourceQueueBuffers/alSourcePlay/alSourceStop/alSourceUnqueueBuffers（队列
计数与回吐 buffer 名来自真库）、alIsSource/alIsBuffer 对未生成句柄判假、
alSourcePlay(0xDEAD) 报 AL_INVALID_NAME、扩展探活（AL_EXT_float32 /
alGetProcAddress("alBufferDataStatic")）走真库、诊断面板 forwarding==1 且
STUB 计数不动。

### 本轮修掉的 shim bug（真库直通暴露）

1. **`openal_shim.h` AL 字符串枚举常量全错**（真 bug，直通模式抓出）：
   原值 AL_VERSION=0xB300 / AL_RENDERER=0xB301 / AL_VENDOR=0xB302 /
   AL_EXTENSIONS=0xB303 均不是有效枚举；openal-soft AL/al.h 规范值为
   AL_VENDOR=0xB001 / AL_VERSION=0xB002 / AL_RENDERER=0xB003 /
   AL_EXTENSIONS=0xB004。原值转发给真库会命中 default 分支报
   AL_INVALID_VALUE 返回 NULL（LWJGL 探活会因此把真库判死）。
   STUB 模式没暴露是因为 STUB 的 alGetString 不校验枚举值。
2. hostcheck 补 AL_SIZE=0x2004（原误写 0x2001）、真库 AL_SOURCE_STATE
   断言等直通语义覆盖。

### 直通后与 STUB 的行为差异清单（游戏侧需知）

- `alBufferData` 未知 format：真库报 **AL_INVALID_ENUM**，STUB 报
  AL_INVALID_VALUE（STUB 校验表没对齐真库错误码，留 M4 或直接不管——
  游戏不该传未知 format）。
- `alGetString(AL_VERSION/AL_VENDOR/...)` 无 current context 时真库返回
  NULL 且不报错；STUB 恒返回字符串。游戏初始化顺序必须先
  alcOpenDevice→alcCreateContext→alcMakeContextCurrent 再查版本。
- 对象句柄是真库分配的名字（不再是 STUB 的 1..n 计数）；AL_SIZE/
  AL_BUFFERS_QUEUED 等查询返回真实值（STUB 恒 0）。
- 重复删除 buffer/未生成句柄操作：真库报 AL_INVALID_NAME（STUB 的
  alDeleteBuffers 只做计数递减，不做名册核对——STUB 语义缺口留 TODO）。
- 真库设备名 "OpenAL Soft"、版本串 "1.1 ALSOFT x.y.z"，不再含
  "TipCL openal_shim STUB" 标识（真机日志以此判别走了哪条路）。

### 两种模式自检输出

```
[build_host] compiled OK, running... (STUB mode)
[hostcheck] openal_shim STUB-mode pure logic: ALL PASSED
[build_host] running real-lib pass-through mode with ...\bin\Win64\soft_oal.dll
[hostcheck][real] ALC device = OpenAL Soft
[hostcheck][real] AL_VERSION = 1.1 ALSOFT 1.23.1 (alErr=0x0000)
[hostcheck][real] AL_VENDOR  = OpenAL Community
[hostcheck][real] AL_SOURCE_STATE after play = 0x1012
[hostcheck] openal_shim real-lib pass-through: ALL PASSED
[build_host] hostcheck PASSED
```

回归：`:core-audio:compileReleaseKotlin` BUILD SUCCESSFUL（无真库 STUB
自检保持 ALL PASSED，见上）。

### 构建收口（2026-11-07，审计遗留清零）

- build.gradle.kts 增加 `ndkVersion = "27.2.12479018"`，与 core-runtime/CI
  对齐（此前依赖宿主进程 env 的 NDK 路径，AGP 版本探测不确定）。
- junit `4.13.2` 硬编码改为 version catalog `libs.junit`（catalog 已有
  junit = "4.13.2" 别名，版本不变仅改引用方式）。
- 配置漂移检查：defaultConfig 单块、无重复/漂移，结构与 core-input/
  core-ui 干净版一致，无需额外整改。
- 验证：`:core-audio:compileReleaseKotlin` 与
  `:core-audio:externalNativeBuildRelease`（arm64-v8a + x86_64 CMake
  RelWithDebInfo）均 BUILD SUCCESSFUL；测试任务 NO-SOURCE（本模块当前
  无单元测试源码）。

## 0c. M3 收尾：openal-soft 安卓产物自建（2026-11-07）

供应链候选第 3 条"NDK 交叉编译自建"已做实，成为**首选**产物来源；预编译
下载渠道降为备选。产物：`buildscript/dist/<abi>/libopenal.so`（arm64-v8a +
x86_64，llvm-strip 后各约 1.3 MB）。

- 源码：openal-soft 1.23.1 官方 GitHub release tarball
  URL `https://github.com/kcat/openal-soft/archive/refs/tags/1.23.1.tar.gz`
  （实际经 gh-proxy.com 镜像下载），sha256
  `dfddf3a1f61059853c625b7bb03de8433b455f2f79f89548cbcbd5edca3d4a4a`。
  缓存于 `tools/openal-cache/src/openal-soft-1.23.1.tar.gz`，解压于
  `tools/openal-cache/extracted/openal-soft-1.23.1-src/`。
- 工具链：`tools/ndk/android-ndk-r27c` + `tools/android-sdk/cmake/3.22.1`
  （cmake+ninja）。
- 构建配置：`ANDROID_PLATFORM=android-24`、`-Os`、`LIBTYPE=SHARED`、
  `ALSOFT_EXAMPLES/UTILS=OFF`、HRTF 数据内嵌（默认）。注意 1.23.1 安卓
  只有 OpenSL ES 后端（AAudio 是 1.24 才有），so 链接 `libOpenSLES.so`。
- 复现命令：`android-app/core-audio/buildscript/build_openal_android.sh`
  （一条脚本跑完双 ABI 配置→编译→拷 dist→strip→打印 sha256）。
- 产物 sha256（dist 内 strip 后）：
  - arm64-v8a `libopenal.so` = `c0ebd1f867e9b9aa3273ea4391d22605568fd39153109c8591448898d74e4271`
  - x86_64 `libopenal.so` = `bd362816bb8e34a1b7ba17f16572eee399da29eca6539e3865620fa0c7907f68`
- readelf 验证（llvm-readelf，NDK 自带）：
  - arm64-v8a：ELF64 / AArch64；NEEDED `libOpenSLES.so, libdl, liblog, libm, libc`；
    动态导出 138 个 FUNC，`alcCreateContext / alcOpenDevice / alBufferData /
    alGetString / alSourcePlay` 均在。
  - x86_64：ELF64 / X86-64；NEEDED 同上；导出 136 个 FUNC，同组符号均在。
- 供给接入：`buildscript/openal-sources-sample.json` 是
  `OpenAlProvisioner(OpenAlSource)` 的样例清单（本地 dist 的 file:// 占位
  + so sha256；发布后由装配层把 URL/sha256 换成真实归档值注入）。

回归：见下文本轮末尾（`:core-audio:compileReleaseKotlin` 复跑）。


---

# core-audio NOTES（M3 音频桥总览）

M3 阶段音频桥（OpenAL 供给 + shim）。只依据 OpenAL Soft 官方文档与 openal-soft
公开仓库发布物信息整理，未参考任何第三方启动器实现。

## 1. OpenAL Soft 安卓预编译产物：公开获取渠道候选

需要的是安卓 ABI（arm64-v8a 优先，x86_64 供模拟器）的 `libopenal.so`
（openal-soft 官方产物名；部分打包叫 soft_oal/libsoft_oal.so，本模块
`LocalOpenAlCatalog.SO_NAME_CANDIDATES` 两个都认）。

候选渠道（写入 `OpenAlSource` 清单前必须逐个下载并记录 sha256）：

| 渠道 | 说明 | 备注 |
|---|---|---|
| openal-soft 官方 GitHub Releases（kcat/openal-soft） | 历史上有 `openal-soft-<ver>-<abi>.zip` 风格的 Android 预编译发布物；若无则取 fallback | 首选：上游正统 |
| openal-soft 官网 openal-soft.org 首页的构建产物链接 | 官方指向的打包 | 与 GitHub Releases 二选一 |
| 自建构建（NDK 交叉编译 openal-soft 源码） | **已做实（2026-11-07，首选）**：NDK r27c + CMake 编 1.23.1 源码，产物在 `buildscript/dist/`，复现命令与 sha256 见上文 0c 节 | 最可控；正式发布时托管归档并记 sha256，其余渠道仅作备选 |

注意：
- 不要引用第三方"启动器仓库"里的 so（来源不明、许可不清）；只用上游
  发布物或自上游源码自建。
- `OpenAlProvisioner` 的清单是**注入式**的：URL/sha256 由 app 装配层传入，
  本模块不含任何硬编码下载地址（供应链由装配层审核）。

## 2. LGPL-2.1 合规要点

openal-soft 是 LGPL-2.1。安卓 APK 分发时的合规做法：

1. **动态链接**（本方案即如此）：游戏通过 dlopen/System.loadLibrary 加载
   `libopenal.so`，APK 内是独立 so 文件，用户可替换——满足 LGPL 对
   "可替换的动态链接库"的要求。**不要静态链接**（那会触发更严的义务）。
2. **提供源码链接**：在 app 的"关于/开源许可"页给出 openal-soft 上游仓库
   地址（https://github.com/kcat/openal-soft）与所用版本号；这是 LGPL-2.1
   第 6 条对"用纯安装方式分发"的满足路径之一（附书面 offer 或源码链接，
   分发未改版时给出上游源码地址即可）。若自建构建且打了补丁，必须同时
   发布补丁源码。
3. **保留版权与许可声明**：APK 内 so 旁保留 LICENSE 复制或在大许可页
   列出 LGPL-2.1 全文链接（https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html）。
4. shim（`openal_shim.c`）是我们自研的独立作品，仅经动态链接边界与
   openal-soft 交互（dlopen + dlsym），不受 LGPL 约束；但其转发目标仍受。

## 3. shim 覆盖面 checklist

当前 `openal_shim.c` 已声明转发/STUB 的入口（转发 = 真库在时 dlsym 直通，
STUB = 无真库时的 no-op + 计数降级）：

- [x] ALC 设备/上下文：alcOpenDevice / alcCloseDevice / alcCreateContext /
      alcMakeContextCurrent / alcDestroyContext / alcProcessContext /
      alcSuspendContext / alcGetError / alcGetString / alcGetIntegerv
- [x] 对象管理：alGenSources / alDeleteSources / alIsSource /
      alGenBuffers / alDeleteBuffers / alIsBuffer
- [x] 数据：alBufferData / alGetBufferi
- [x] 播放控制：alSourcePlay / alSourceStop / alSourcePause / alSourceRewind /
      alSourceQueueBuffers / alSourceUnqueueBuffers
- [x] 源属性：alSourcei / alSourcef / alSource3f / alGetSourcei / alGetSourcef
- [x] 听者：alListenerf / alListener3f / alListenerfv
- [x] 全局/查询：alGetError / alGetString / alIsExtensionPresent /
      alGetProcAddress / alDopplerFactor / alDistanceModel

**TODO(M3 收尾/真机联调)：**
- [ ] alGetSourcei 的 AL_BUFFERS_PROCESSED / AL_SOURCE_STATE 真实状态机
      （STUB 目前恒 0；流式播放（MC 水声/唱片机）依赖它）
- [ ] alcGetString(ALC_EXTENSIONS)、alcIsExtensionPresent、alcGetStringi
      （LWJGL 探活与 ALC_ENUMERATION_EXT 设备枚举）
- [ ] alGetListenerfv / alGetSource3f 等反向 getter
- [ ] 64 对象上限（SHIM_MAX_OBJECTS）仅 STUB 用；转发模式无此限制
- [ ] LWJGL3 是否真命中 shim：日志确认它 prefer 的是 -Dopenal.library.path
      目录下的 libopenal.so（供给产物）而非 shim；shim 为兜底层

## 4. 真机联调项

1. **供给链路**：`OpenAlProvisioner.provision("arm64-v8a")` 在真机上跑通
   下载 → sha256 → 解包 → `findReady` 复用；日志核对 ABI 目录落点。
2. **LWJGL 加载**：`-Dopenal.library.path=<nativeLibDir>`（经
   `AudioInitHook.injectOpenAlArgs` 注入）后，MC 启动日志应出现
   OpenAL Soft 的版本 banner（真库生效判据）；若报
   `Failed to load the OpenAL library` 检查 so 名与目录。
3. **音频输出**：OpenAL Soft 在 Android 的后端（OpenSL ES / AAudio，取决于
   上游构建选项）是否出声；`alcGetString(ALC_DEVICE_SPECIFIER)` 回读确认。
4. **性能**：MC 大量音源（TNT/骷髅群）时 CPU 占用；必要时经
   `-Dopenal.soft.*` 系统属性调 OpenAL Soft 运行参数（resampler 等）。
5. **HRTF**：默认关闭评估（openal.soft.hrtf=false），真机听感后再定。
6. **生命周期**：游戏进程退出后 `AudioBridge.shutdown()`；OpenAL Soft
   设备句柄泄漏排查（`alcCloseDevice` 是否被游戏走到）。
