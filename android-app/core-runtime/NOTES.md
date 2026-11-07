# core-runtime NOTES（M2）

自研 GLFW 兼容桩 + EGL/GL ES 桥 + 游戏进程拉起 + JRE 供给。
行为定义仅参照 GLFW 官方 API 规范（glfw3.h / glfw.org docs），未读、未抄任何安卓启动器实现源码。

## 洁净室声明

- 本模块全部代码为洁净室实现：只依据 GLFW 官方公开的 API 规范（函数名、参数语义、常量数值、返回值约定）编写。
- 未参考 PojavLauncher、FCL、Zalith 或任何其他安卓启动器的实现源码、二进制或注释。
- 常量（GLFW_PRESS、GLFW_CLIENT_API 等）为 GLFW 规范中公开定义的接口契约，非受版权保护的表达。

## M2 关键路径分解

### 路径 A：标题界面（首帧渲染）
1. app 模块拉起 `GameProcessBuilder.launch()`：provision JRE → ProcessBuilder 启动 java，注入 `-Djava.library.path=<jniLibs>` 与 `-Dtipcl.app.data`。
2. 游戏进程 `System.loadLibrary("tipcl_runtime")` → `JNI_OnLoad` → `glfwInit`（桩直接成功）。
3. 游戏 `glfwCreateWindow` → 虚拟句柄（slot+1）；`glfwMakeContextCurrent`（桩，待接 EGL）。
4. app 侧 Surface 生命周期 → `SurfaceBridge.onSurfaceCreated/Changed` → `egl_bridge_attach_surface`（EGLSurface + makeCurrent，GL ES 3.2 → 3.1 回退）。
5. 渲染循环：`glfwWindowShouldClose` → swap（`SurfaceBridge.nativeSwapBuffers` / `glfwSwapBuffers` → eglSwapBuffers）。
- **里程碑判定**：标题界面出现游戏 logo 且不掉帧。

### 路径 B：进存档
1. core-input 归一化触摸/键盘事件 → `InputInjector.postKeyEvent/postCursorPos/postMouseButton` → 环形队列。
2. 游戏 `glfwPollEvents` 消费队列 → 更新键鼠状态 → 触发 Java 回调桥（jni_key_bridge 等）。
3. 验证点：能点选存档、能进入世界（说明鼠标捕获/相对坐标或绝对坐标模式可用）。

### 路径 C：帧率
1. 目标 30+ fps @ 1080p（中端机 arm64）。
2. 手段：swap interval 1、渲染分辨率降采样（`tipcl.game.window` 独立于 Surface 物理尺寸）、避免每帧 JNI 往返（事件批量）。
3. 观测：`glfwGetTime` 差分统计帧时间；logcat 节流输出。

## GLFW 桩覆盖面 checklist（按 glfw3.h API 分组）

图例：[x] 已实现 / [~] 骨架（有 TODO(M2)）/ [ ] 未实现

### 窗口 (window)
- [x] glfwCreateWindow / glfwDestroyWindow / glfwWindowShouldClose / glfwSetWindowShouldClose
- [x] glfwGetFramebufferSize
- [~] glfwWindowHint / glfwDefaultWindowHints（hint 槽位简化）
- [ ] glfwGetWindowSize / glfwSetWindowSize / glfwSetWindowSizeLimits
- [ ] glfwIconifyWindow / glfwRestoreWindow / glfwMaximizeWindow
- [ ] glfwGetWindowAttrib / glfwSetWindowAttrib
- [ ] glfwWindowPosCallback / glfwWindowSizeCallback / glfwWindowCloseCallback 等

### 上下文 (context)
- [x] glfwMakeContextCurrent（经平台钩子接 egl_bridge：无 surface 时落 headless surface）
- [x] glfwSwapInterval / glfwSwapBuffers（平台钩子 → egl_bridge）
- [x] glfwExtensionSupported（恒 FALSE，GL ES 下合理）
- [x] glfwGetProcAddress（M2 关键：eglGetProcAddress 优先 + dlsym(RTLD_DEFAULT) 回退）

### init
- [x] glfwInit / glfwTerminate
- [~] glfwInitHint / glfwGetInitHint

### 输入 (input)
- [x] glfwGetKey / glfwGetMouseButton / glfwGetCursorPos / glfwSetCursorPos
- [x] Set*Callback：key / char / cursorPos / mouseButton / scroll / framebufferSize（全部桥已接，见"回调生命周期策略"）
- [x] glfwSetErrorCallback（全局引用生命周期已统一；Java 侧错误分发 M3 接入）
- [x] glfwSetInputMode（GLFW_CURSOR NORMAL/HIDDEN/DISABLED——进存档鼠标捕获）
- [x] raw mouse motion 标志（GLFW_RAW_MOUSE_MOTION 记录；差分源与普通模式相同，等 core-input 提供原始相对流）
- [ ] glfwGetKeyName、glfwGetKeyScancode
- [ ] 手柄/joystick（v1 不需要）

### 剪贴板 (clipboard)
- [~] glfwGetClipboardString / glfwSetClipboardString（需 JNI 回 Android ClipboardManager）

### 时间 (time)
- [x] glfwGetTime（CLOCK_MONOTONIC）
- [~] glfwSetTime（偏移量未实现）

### 显示器 (monitor)
- [~] glfwGetPrimaryMonitor（虚拟句柄 1）/ glfwGetVideoMode（静态 1920x1080 stub）
- [ ] glfwGetMonitors / glfwGetMonitorPos / glfwSetMonitorCallback / 全屏模式切换
- [ ] glfwGetVideoModes / glfwGetMonitorName / glfwGetMonitorContentScale

### 其他
- [ ] glfwVulkanSupported / glfwGetInstanceProcAddress（v1 不需要，GL ES 路线）
- [ ] native access 系列（v1 不暴露）

**v1 最小集（进标题+进存档所需）**：窗口创建/销毁/shouldClose、pollEvents、key/char/cursorPos/mouseButton/scroll 回调、GetKey/GetMouseButton/GetCursorPos、MakeContextCurrent、SwapBuffers、SwapInterval、GetFramebufferSize、GetTime、SetInputMode(CURSOR)、GetProcAddress——M2 起全部 [x]，缺口已闭合，剩真机联调（见文末风险点）。

## JNI 方法签名对照表

Kotlin 侧类 → native 导出（静态绑定，命名规则 `Java_<class with _>_<method>`）：

| Kotlin 声明 | Native 导出 |
|---|---|
| SurfaceBridge.nativeOnSurfaceCreated(Surface) | `Java_com_tipcl_android_core_runtime_SurfaceBridge_nativeOnSurfaceCreated(JNIEnv*, jobject, jobject)` |
| SurfaceBridge.nativeOnSurfaceChanged(Surface, I, I) | `..._SurfaceBridge_nativeOnSurfaceChanged(JNIEnv*, jobject, jobject, jint, jint)` |
| SurfaceBridge.nativeOnSurfaceDestroyed() | `..._SurfaceBridge_nativeOnSurfaceDestroyed(JNIEnv*, jobject)` |
| SurfaceBridge.nativeSwapBuffers()Z | `..._SurfaceBridge_nativeSwapBuffers(JNIEnv*, jobject)` |
| GlfwFacade.glfwInit()I | `..._GlfwFacade_glfwInit(JNIEnv*, jclass)` |
| GlfwFacade.glfwTerminate()V | `..._GlfwFacade_glfwTerminate(JNIEnv*, jclass)` |
| GlfwFacade.glfwInitHint(II)V | `..._GlfwFacade_glfwInitHint(JNIEnv*, jclass, jint, jint)` |
| GlfwFacade.glfwDefaultWindowHints()V | `..._GlfwFacade_glfwDefaultWindowHints(JNIEnv*, jclass)` |
| GlfwFacade.glfwWindowHint(II)V | `..._GlfwFacade_glfwWindowHint(JNIEnv*, jclass, jint, jint)` |
| GlfwFacade.glfwCreateWindow(IILjava/lang/String;JJ)J | `..._GlfwFacade_glfwCreateWindow(JNIEnv*, jclass, jint, jint, jstring, jlong, jlong)` |
| GlfwFacade.glfwDestroyWindow(J)V | `..._GlfwFacade_glfwDestroyWindow(JNIEnv*, jclass, jlong)` |
| GlfwFacade.glfwWindowShouldClose(J)I | `..._GlfwFacade_glfwWindowShouldClose(JNIEnv*, jclass, jlong)` |
| GlfwFacade.glfwSetWindowShouldClose(JI)V | `..._GlfwFacade_glfwSetWindowShouldClose(JNIEnv*, jclass, jlong, jint)` |
| GlfwFacade.glfwGetFramebufferSize(J)[I | `..._GlfwFacade_glfwGetFramebufferSize(JNIEnv*, jclass, jlong)` |
| GlfwFacade.glfwMakeContextCurrent(J)V | `..._GlfwFacade_glfwMakeContextCurrent(JNIEnv*, jclass, jlong)` |
| GlfwFacade.glfwSwapInterval(I)V | `..._GlfwFacade_glfwSwapInterval(JNIEnv*, jclass, jint)` |
| GlfwFacade.glfwSwapBuffers(J)V | `..._GlfwFacade_glfwSwapBuffers(JNIEnv*, jclass, jlong)` |
| GlfwFacade.glfwExtensionSupported(Ljava/lang/String;)I | `..._GlfwFacade_glfwExtensionSupported(JNIEnv*, jclass, jstring)` |
| GlfwFacade.glfwGetProcAddress(Ljava/lang/String;)J | `..._GlfwFacade_glfwGetProcAddress(JNIEnv*, jclass, jstring)` |
| GlfwFacade.glfwSetInputMode(JII)V | `..._GlfwFacade_glfwSetInputMode(JNIEnv*, jclass, jlong, jint, jint)` |
| GlfwFacade.glfwGetInputMode(JI)I | `..._GlfwFacade_glfwGetInputMode(JNIEnv*, jclass, jlong, jint)` |
| GlfwFacade.glfwPollEvents()V | `..._GlfwFacade_glfwPollEvents(JNIEnv*, jclass)` |
| GlfwFacade.glfwWaitEvents()V | `..._GlfwFacade_glfwWaitEvents(JNIEnv*, jclass)` |
| GlfwFacade.glfwGetKey(JI)I | `..._GlfwFacade_glfwGetKey(JNIEnv*, jclass, jlong, jint)` |
| GlfwFacade.glfwGetMouseButton(JI)I | `..._GlfwFacade_glfwGetMouseButton(JNIEnv*, jclass, jlong, jint)` |
| GlfwFacade.glfwGetCursorPos(J)[D | `..._GlfwFacade_glfwGetCursorPos(JNIEnv*, jclass, jlong)` |
| GlfwFacade.glfwSetCursorPos(JDD)V | `..._GlfwFacade_glfwSetCursorPos(JNIEnv*, jclass, jlong, jdouble, jdouble)` |
| GlfwFacade.glfwSetKeyCallback(JLGLFWkeyfun;)LGLFWkeyfun; | `..._GlfwFacade_glfwSetKeyCallback(JNIEnv*, jclass, jlong, jobject)` |
| GlfwFacade.glfwSetCharCallback(JLGLFWcharfun;)LGLFWcharfun; | `..._GlfwFacade_glfwSetCharCallback(JNIEnv*, jclass, jlong, jobject)` |
| GlfwFacade.glfwSetCursorPosCallback(JLGLFWcursorposfun;)LGLFWcursorposfun; | `..._GlfwFacade_glfwSetCursorPosCallback(JNIEnv*, jclass, jlong, jobject)` |
| GlfwFacade.glfwSetMouseButtonCallback(JLGLFWmousebuttonfun;)LGLFWmousebuttonfun; | `..._GlfwFacade_glfwSetMouseButtonCallback(JNIEnv*, jclass, jlong, jobject)` |
| GlfwFacade.glfwSetScrollCallback(JLGLFWscrollfun;)LGLFWscrollfun; | `..._GlfwFacade_glfwSetScrollCallback(JNIEnv*, jclass, jlong, jobject)` |
| GlfwFacade.glfwSetFramebufferSizeCallback(JLGLFWframebuffersizefun;)LGLFWframebuffersizefun; | `..._GlfwFacade_glfwSetFramebufferSizeCallback(JNIEnv*, jclass, jlong, jobject)` |
| GlfwFacade.glfwSetErrorCallback(LGLFWerrorfun;)LGLFWerrorfun; | `..._GlfwFacade_glfwSetErrorCallback(JNIEnv*, jclass, jobject)` |
| GlfwFacade.glfwGetClipboardString(J)Ljava/lang/String; | `..._GlfwFacade_glfwGetClipboardString(JNIEnv*, jclass, jlong)` |
| GlfwFacade.glfwSetClipboardString(JLjava/lang/String;)V | `..._GlfwFacade_glfwSetClipboardString(JNIEnv*, jclass, jlong, jstring)` |
| GlfwFacade.glfwGetTime()D | `..._GlfwFacade_glfwGetTime(JNIEnv*, jclass)` |
| GlfwFacade.glfwSetTime(D)V | `..._GlfwFacade_glfwSetTime(JNIEnv*, jclass, jdouble)` |
| GlfwFacade.glfwGetPrimaryMonitor()J | `..._GlfwFacade_glfwGetPrimaryMonitor(JNIEnv*, jclass)` |
| GlfwFacade.glfwGetVideoMode(J)[I | `..._GlfwFacade_glfwGetVideoMode(JNIEnv*, jclass, jlong)` |
| InputInjector.nativePostKeyEvent(IIII)V | `..._InputInjector_nativePostKeyEvent(JNIEnv*, jobject, jint, jint, jint, jint)` |
| InputInjector.nativePostCharEvent(I)V | `..._InputInjector_nativePostCharEvent(JNIEnv*, jobject, jint)` |
| InputInjector.nativePostCursorPos(DD)V | `..._InputInjector_nativePostCursorPos(JNIEnv*, jobject, jdouble, jdouble)` |
| InputInjector.nativePostMouseButton(III)V | `..._InputInjector_nativePostMouseButton(JNIEnv*, jobject, jint, jint, jint)` |
| InputInjector.nativePostScroll(DD)V | `..._InputInjector_nativePostScroll(JNIEnv*, jobject, jdouble, jdouble)` |
| InputInjector.nativePostFramebufferSize(II)V | `..._InputInjector_nativePostFramebufferSize(JNIEnv*, jobject, jint, jint)` |

说明：
- Kotlin 数组返回值 `[I`/`[D` 在 native 侧用 NewIntArray/SetIntArrayRegion 构造，避免多 out 参数的 JNI 负担。
- **回调全局引用生命周期（M2 已实现）**：native 侧每个回调槽持一个全局引用；`Set*Callback` 返回旧回调时先对旧全局引用 `NewLocalRef` 再 `DeleteGlobalRef`，返回的局部引用在 JNI 返回边界被 JVM 提升为普通 Java 引用。旧/新引用绝不重复释放，Kotlin 侧拿到旧值后只能当普通对象用或丢弃，不能也不需要手动 delete。
- 回调 Java 桥签名（Kotlin 侧函数式接口必须一致）：
  | 接口 | invoke 签名 |
  |---|---|
  | GLFWkeyfun | `(JIIII)V`（window, key, scancode, action, mods） |
  | GLFWcharfun | `(JI)V` |
  | GLFWcursorposfun | `(JDD)V` |
  | GLFWmousebuttonfun | `(JIII)V` |
  | GLFWscrollfun | `(JDD)V` |
  | GLFWframebuffersizefun | `(JII)V` |
  | GLFWerrorfun | `(ILjava/lang/String;)V` |
- **回调线程策略（M2 已实现）**：`glfwPollEvents` 在游戏主线程消费队列并同步调 Java 回调。JNIEnv 获取规范：先 `GetEnv`；命中则直接用（线程本就 attached）；返回 `JNI_EDETACHED` 则 `AttachCurrentThread` 并把线程登记到 `pthread_key`，其析构器在线程退出时 `DetachCurrentThread`——只 detach 自己 attach 的线程，不碰游戏线程；重复进出回调不重复 attach。JavaVM 在 `JNI_OnLoad` 缓存。
- `GlfwFacade.glfwGetProcAddress(String):Long`（返回函数指针，Kotlin 门面已声明；空参/NULL 名安全返回 0）。

### GLFW 常量表三方核对（Kotlin GlfwFacade ↔ glfw_stub.h ↔ 官方规范，2026-11-07）
- 输入模式常量 Kotlin 侧已补齐，数值与 glfw_stub.h 完全一致：GLFW_CURSOR=0x00033001、GLFW_STICKY_KEYS=0x00033002、GLFW_STICKY_MOUSE_BUTTONS=0x00033003、GLFW_LOCK_KEY_MODS=0x00033004、GLFW_RAW_MOUSE_MOTION=0x00033005、GLFW_CURSOR_NORMAL/HIDDEN/DISABLED=0x00034001/2/3。
- 客户端 API 常量一致：GLFW_CLIENT_API=0x22001、CONTEXT_VERSION_MAJOR/MINOR=0x22002/3、OPENGL_ES_API=0x22004。
- 差异记录（非冲突）：glfw_stub.h 只定义 native 逻辑实际消费的常量，**不含** GLFW_KEY_*（32/256~265/340~342）与 GLFW_MOUSE_BUTTON_1/2 —— 键值由 Java 侧直传 jint，native 不判名字只透传，故 Kotlin 侧这些常量无 stub 对应项，数值按官方规范保持不变。

## M2 已完成项（本轮）

1. **glfwGetProcAddress**：`egl_bridge_get_proc_address` —— `eglGetProcAddress` 优先，NULL 时 `dlsym(RTLD_DEFAULT)` 回退（部分驱动对 GL ES 核心函数返回 NULL）。经 `glfw_stub_platform_hooks.get_proc_address` 注入桩；host 上无钩子安全返回 NULL。
2. **GLFW_CURSOR 状态机**：NORMAL/HIDDEN/DISABLED。进入 DISABLED 后第一个光标事件为校准帧（不上报跳变），此后 `virt = virt + (raw - last_raw)` 差分累积上报；`glfwGetCursorPos` 在捕获态返回虚拟坐标；退出捕获对齐回绝对坐标；`glfwSetCursorPos` 重置差分基准避免假跳变。GLFW_RAW_MOUSE_MOTION 标志可设可读（差分源暂与普通模式相同）。
3. **回调生命周期**：见上"回调全局引用生命周期 / 回调线程策略"。全部 6 类输入回调 + 错误回调统一走 `swap_callback` + `dispatch_cb`。
4. **事件队列**：光标事件入队时与队尾连续光标事件原位合并（只留最新，move 与 click/key 保序）；队列满丢最旧事件、错误回调进程级只报一次。
5. **窗口槽位回收**：固定 4 槽 `in_use` 标记，`glfwDestroyWindow` 清槽供复用；失效旧句柄访问安全（返回 FALSE/NULL）；创建时回调结构带 `handle` 字段（M3 透传给 Java 回调用）。
6. **egl_bridge**：`ANativeWindow_fromSurface`/`release` 与 EGLSurface 严格配对（attach 任一步失败都释放）；`ANativeWindow_setBuffersGeometry` 复核渲染分辨率（支持降采样）；`EGL_KHR_no_config_context`（`EGL_NO_CONFIG_KHR` 建上下文）与 `EGL_KHR_surfaceless_context`（无 surface makeCurrent）+ 1x1 pbuffer 三级回退；上下文属性用 `EGL_CONTEXT_MAJOR_VERSION_KHR` 兼容旧 NDK 头。
7. **host 自检**：见下节。

## host 自检（hostcheck）

`core-runtime/src/main/cpp/hostcheck/build_host.bat`：glfw_stub.c 是唯一参与 host 编译的产品源（纯 C，无 EGL/JNI/Android 头）；egl_bridge.c 与 tipcl_runtime.c 隔离在 Android 构建里。host 测试 main 覆盖：光标合并语义、溢出丢旧、槽位回收复用、DISABLED 状态机（校准帧/差分累积/退出对齐）、C 层回调旧值返回、GetProcAddress 无钩子安全默认。

工具链：便携版 w64devkit 2.4.0（GitHub release 自解压包 w64devkit-x64-2.4.0.7z.exe，`-o<dir> -y` 静默解压）→ 已解压到 `C:\Users\Administrator\tipcl_work\tools\w64devkit`，`build_host.bat` 优先用它并把它 bin 目录前置进 PATH（gcc 找 as/ld 需要），其次 PATH 里的 gcc/clang。bat 注释须全 ASCII（cmd 在 GBK 代码页下解析 UTF-8 中文注释会乱码破坏语法）。

2026-11-07 实测输出（w64devkit gcc，-std=c11 -Wall -Wextra -Werror，零警告，28/28 PASS）：

```
TipCL core-runtime hostcheck (glfw_stub pure logic)
===================================================
[test] cursor event coalescing
  PASS: queue collapsed to 4 events
  PASS: first move merged to latest (3,3)
  PASS: click keeps order after preceding move
  PASS: trailing move merged to (5,5)
  PASS: key event intact after moves
  PASS: 3 consecutive moves coalesce to last only
[test] queue overflow drops oldest
  PASS: overflow keeps newest 511 events (ring capacity)
[test] window slot recycling
  PASS: 4 windows created
  PASS: window count == 4
  PASS: 5th window rejected (limit)
  PASS: count drops after destroy
  PASS: slot reused after destroy
  PASS: reused handle equals freed slot handle
  PASS: stale handle reads safely
  PASS: reused window state is independent
[test] GLFW_CURSOR_DISABLED state machine
  PASS: NORMAL mode reports absolute coords
  PASS: mode set to DISABLED
  PASS: first event after capture is calibration (no callback)
  PASS: disabled mode accumulates deltas (50+5+5, 60-5-5)
  PASS: cursor callback reports accumulated pos
  PASS: raw motion flag set
  PASS: NORMAL mode re-aligns to absolute coords
  PASS: mode back to NORMAL
[test] C-level callback old-value return
  PASS: first set returns NULL
  PASS: second set returns previous callback
  PASS: clearing returns NULL
[test] glfwGetProcAddress platform hook
  PASS: no hook -> NULL, no crash
  PASS: NULL name -> NULL
===================================================
RESULT: ALL TESTS PASSED
[build_host] hostcheck PASSED
```

## M2 剩余风险点（真机联调项）

1. **NDK 首次编译**：C 代码仅 host 自检 + 静态自查，真机 Gradle 构建可能暴露少量编译错误（预期风险：`EGL_OPENGL_ES3_BIT` 在旧 NDK 头的可用性、`WINDOW_FORMAT_RGBA_8888` 需 `android/native_window.h`）。
2. **Kotlin 门面缺口（已闭合，2026-11-07）**：`glfwGetProcAddress(String?):Long`、`glfwSetInputMode(JII)V`、`glfwGetInputMode(JI)I` 已补进 `GlfwFacade.kt`；input mode 常量（GLFW_CURSOR 系列、GLFW_RAW_MOUSE_MOTION、GLFW_CURSOR_NORMAL/HIDDEN/DISABLED）按 glfw_stub.h 数值补齐。
3. **DISABLED 模式手感**：差分累积的灵敏度/灵敏度缩放（游戏内鼠标灵敏度）需真机调；core-input 若能提供原始相对流（不经绝对坐标换算）应接 `GLFW_RAW_MOUSE_MOTION` 分支。
4. **游戏进程渲染与 Surface 的跨进程/线程边界**：当前设计假设游戏 java 进程直接持有 Surface（同进程传递），若 app 进程与游戏进程分离则 SurfaceBridge 需走 Binder/共享 ANativeWindow，架构待定。
5. **JRE 下载/解包已实现（M2 子代理 B）**：见「JRE 供给与进程管理」章节；真机联调项剩 chmod 实测与 API 29+ exec 限制（见 JRE 章节"可执行位"）。
6. **GL ES 兼容性**：GL ES 3.2/3.1 与桌面 GL 的差异由游戏侧（LWJGL GL 分发）承担；桩不做函数翻译，风险在游戏着色器版本（Minecraft 1.17+ 走 GL ES 3.x 可行，更老版本需 ANGLE 评估）。
7. **真机 EGL 回退路径验证**：no_config/surfaceless 回退分支（主流新设备都走正常 config 路径，回退分支只能在旧/特殊驱动上验证）。
8. **dlsym 回退覆盖面**：`dlsym(RTLD_DEFAULT)` 能否解析 libGLESv3 符号取决于加载顺序（游戏进程需先 System.loadLibrary("GLESv3") 或等价注入）；真机验证 eglGetProcAddress 命中率后再定是否需要显式 dlopen libGLESv3.so。


## 构建验证（2026-11-07，M2 Kotlin 侧接线）

### 环境（全部便携、进程级，未改系统配置）
- JDK 17：`tipcl_work/tools/jdk`（JAVA_HOME 进程级注入）
- Gradle 8.7：`tipcl_work/tools/gradle-8.7-dl/gradle-8.7`（腾讯镜像，wrapper properties 中 distributionUrl 同源）
- Android SDK：`tipcl_work/tools/android-sdk`（cmdline-tools 安装 platforms;android-35 / build-tools;34.0.0 / platform-tools）
- GRADLE_USER_HOME 指向 `tipcl_work/tools/gradle-home`；构建产物均在 `android-app/.gradle`、各模块 `build/`，已由 android-app/.gitignore 覆盖（.gradle/ build/ *.iml gradle-wrapper.jar .idea/ local.properties .cxx/）

### 测试结果（真实输出摘要）
```
:core-launch:test                 20 tests, 0 failed
:core-input:testDebugUnitTest     32 tests, 0 failed
:core-input:testReleaseUnitTest   32 tests, 0 failed
BUILD SUCCESSFUL in 9s
```
另验证 `:app:compileDebugKotlin` BUILD SUCCESSFUL（仅 onBackPressed deprecation 警告）。NDK/CMake 未安装，native 编译未执行（见风险点 10）。

### JNI 签名对齐核对（Kotlin 门面 ↔ tipcl_runtime.c）
- `GlfwFacade` 36 个 external + `InputInjector` 6 个 + `SurfaceBridge` 4 个 = 46 个 Kotlin external 声明，与 tipcl_runtime.c 的 46 个 `Java_com_tipcl_android_core_runtime_*` 导出**一一对应，无缺失、无多余、签名一致**（含数组返回值 [I/[D 约定与回调 jobject 传参）。2026-11-07 三方核对通过。
- `glfwGetProcAddress`：native 已实现（eglGetProcAddress 优先 + dlsym 回退），Kotlin 门面 `glfwGetProcAddress(procName: String?): Long` 已补。

### 本次修复的编译/测试问题（均保持行为语义）
- 构建配置：core-launch 的 `kotlin("jvm") 2.0.21` 内联版本与 root classpath 冲突 → 收敛到 version catalog（kotlin-jvm / kotlin-serialization，2.0.20）；移除 core-launch 的 project repositories（与 FAIL_ON_PROJECT_REPOS 冲突）；core-input compileSdk 34→35（全模块统一 35）。
- core-launch：`kotlinx-serialization` 编译器插件缺失（VersionSpec serializer/descriptor 全线 Unresolved）；`ArgumentDeserializer` 声明为 DeserializationStrategy 却 override serialize → 改为 KSerializer；`parseCoords` 返回 `Array<String?>` 导致下游可空性错误 → 收紧为 `Array<String>`；`VersionManifest.fetch` 缓存命中时返回了原始 String → 先 decode 再返回；`AssetInstaller` Int/Long 比较；`LaunchArgsBuilder` 补 `resolution_width/resolution_height` 占位符（仅在 options 设置时替换）。
- core-input：`TouchRouter.lookChannel` 类型引用了不存在的 `LookChannel` → `LookGesture`；`DirectionStick` 死区边界改为 ≤ 24px（与测试契约一致）；方向切换时先发 RELEASE 再发 PRESS（事件顺序契约）。
- app：LauncherActivity Composable 内 `packageManager/packageName` Unresolved → 改走 LocalContext。
- 测试侧：TouchRouterTest 热键断言未清理共享 sink 的历史事件 → 断言前 clear；VersionSpecTest「parse string and object arguments」对纯字符串参数的索引期望与扁平 token 模型（merge-with-parent 测试所依赖）不符 → 修正索引。

## JRE 供给与进程管理（M2 子代理 B，2026-11-07）

### 文件与职责
| 文件 | 内容 |
|---|---|
| `runtime/TarExtractor.kt` | 纯 Kotlin tar 解析/解包：512B 头、checksum 校验、ustar prefix 拼接、GNU 'L' 长名（`././@LongLink`）、'K' 长链接（丢弃）、PAX 'x' `path=` 记录覆盖、base-256 大文件 size、512 对齐 padding 跳过、可执行位（低 9 位 x 位）识别 |
| `runtime/Sha256.kt` | 流式 sha256（64k 分块，不整文件进内存）+ `verify`（不一致抛 `ChecksumMismatchException(expected, actual)`） |
| `runtime/RemoteRuntimeProvider.kt` | `RuntimeSource(url, sha256, majorVersion, arch, format)` 清单注入；`RuntimeSourceSelector` 按 (major, arch) 取列表首个匹配；下载（`.part` 临时档 + `Range: bytes=n-` 断点续传，416/网络错误最多重试 3 次）→ sha256 硬校验（坏包即删，绝不落地解包）→ 按扩展名解包（zip→java.util.zip，tar.gz→TarExtractor，剔除公共顶层目录）→ `.staging` 校验后原子 move 到 `<jreRoot>/<major>/` |
| `runtime/JavaRuntimeProvider.kt` | `LocalRuntimeCatalog` 补完：`list()` 扫描、`provisioned()`、`register()`（外部 java home 探测版本后复制入库）、`probe()`（`java -version` stderr 解析 major，兼容 `1.8.0_x`→8）、`cleanupCorrupt()`（清数字目录名但缺 bin/java 的、`.part`、`.staging` 残骸） |
| `runtime/GameProcessBuilder.kt` | 环境注入 HOME/TMPDIR/PATH/LD_LIBRARY_PATH；工作目录=instanceDir；stdout/stderr 双守护线程异步泵（行级回调 + stderr 尾部环形缓冲）；`awaitExit` 超时 destroy→5s→destroyForcibly 三级兜底；`GameExit(exitCode, stderrTail, clean)` 结构化回传；`stop()` 用户主动退出同三级策略 |

### 可执行位（Android 上的对策）
- tar 包内 mode 位由 TarExtractor 解析记录，但 java.nio 的 POSIX view 在 Android 抛 UnsupportedOperationException，无法用 NIO 置位。
- 对策：解包后统一走注入的 `ExecPostProcessor`，默认实现 `CHMOD` 用 toybox `chmod -R 755 <home>/bin`（zip 包不携带 mode，同样统一 post-process）。
- **硬约束（公开文档事实，真机联调必验）**：targetSdk≥29 的非系统应用不允许 exec 应用数据目录（`/data/app` 私有存储）内的文件（W^X / untrusted_app exec 限制）。若真机命中，后备方案：把 java 及 .so 重命名为 `lib*.so` 放入 `nativeLibraryDir`（该目录允许 dlopen/exec），或使用 `ProcessBuilder` 经 `/system/bin/linker64` 调用的可行性评估。

### 单测（纯 JVM，不依赖 android）
- `src/test/kotlin/.../TarExtractorTest.kt`：手工拼 512B 字节流验证——短名、GNU 长名（>100B，`././@LongLink`）、ustar prefix 拼接、PAX path 覆盖、mode x 位识别、坏 checksum 拒收、stripLeadingDir、gzip 流 round-trip。
- `Sha256Test.kt`：空输入已知摘要、文件/流一致性（跨 64k 块）、verify 通过/失败路径（expected/actual 断言）、`RuntimeSourceSelector` 按 major/arch 匹配（顺序优先、大小写不敏感、无匹配 null）。
- `LocalRuntimeCatalogTest.kt`：list 排序与只认有效目录、cleanupCorrupt 清损坏留有效、`java -version` 输出 major 解析（17/21/1.8→8）。
- **执行命令**（便携 JDK，进程级环境变量，未改系统配置）：
  ```
  cd android-app
  JAVA_HOME=C:\Users\Administrator\tipcl_work\tools\jdk \
  GRADLE_USER_HOME=C:\Users\Administrator\tipcl_work\tools\gradle-home \
  C:\Users\Administrator\tipcl_work\tools\gradle-8.7-dl\gradle-8.7\bin\gradle.bat :core-runtime:testDebugUnitTest
  ```
- 实际执行：因 :core-launch 插件解析冲突（见下"构建验证"已记录的问题在当前工作副本仍复现：`Error resolving plugin [id: 'org.jetbrains.kotlin.jvm', version: '2.0.20'] … already on the classpath with an unknown version`，属仓库级既有问题，与本子任务无关），单测在独立临时 Kotlin JVM 工程（%TEMP% 下，仅复制上述纯 JVM 源/测试文件，未改仓库）中用同一 Gradle 8.7 + 便携 JDK17 执行：**18 tests, 0 failed**（用例数以最终源码为准），随后临时工程已删除。

## NDK 预检（2026-11-07，M2 收尾）

首次用 Android NDK 真实编译 core-runtime native 代码（此前仅 host 编译过 glfw_stub 纯逻辑）。

### 环境（全部便携、进程级 env，未改系统配置）
- NDK r27c：`tipcl_work/tools/ndk/android-ndk-r27c`（官方 zip `android-ndk-r27c-windows.zip`，781 MB，dl.google.com 直连；clang 18.0.3）
- 注：AGP 8.5.2 对 `ndkVersion = "27.2.12479018"` 的解析是**自动下载并安装进 SDK**（落 `tools/android-sdk/ndk/27.2.12479018`），实际编译走 SDK 内副本，`ANDROID_NDK_HOME` 指向 tools/ndk 的便携副本未被采用（两者内容相同）。
- 命令（cd android-app 后）：
  ```
  JAVA_HOME=C:\Users\Administrator\tipcl_work\tools\jdk \
  GRADLE_USER_HOME=C:\Users\Administrator\tipcl_work\tools\gradle-home \
  ANDROID_HOME=C:\Users\Administrator\tipcl_work\tools\android-sdk \
  ANDROID_NDK_HOME=C:\Users\Administrator\tipcl_work\tools\ndk\android-ndk-r27c \
  gradle.bat :core-runtime:externalNativeBuildDebug
  ```
- `core-runtime/build.gradle.kts` 加了 `ndkVersion = "27.2.12479018"`（AGP 默认 NDK 是 26.1.10909125，指定后锁定 r27c；对 CI 建议：预置 SDK 内 NDK 27.2.12479018 或保持此行让 AGP 自动装）。

### 编译错误清单与修复
原代理预测的隐患全部命中，共 4 个编译错误、1 处修改（`tipcl_runtime.c`，JNI 导出签名零变化）：
- 预测的 `EGL_OPENGL_ES3_BIT` / `WINDOW_FORMAT_RGBA_8888` 旧头兼容：**未发生**（r27c 的 egl.h/android/native_window.h 两者都有；`EGL_CONTEXT_MAJOR_VERSION_KHR` 兜底宏也未触发）。
- 实际错误全部是 JavaVM 函数表的 **C/C++ 签名差异**：文件是 C，`(*g_jvm)->GetEnv(...)` 等按 C++ 习惯漏传了显式的 `vm` 第一参数（JNIInvokeInterface 的 C 结构成员带 `JavaVM* vm` 首参）：
  1. L41 `GetEnv` → `(*g_jvm)->GetEnv(g_jvm, (void**)&env, JNI_VERSION_1_6)`
  2. L42 `DetachCurrentThread` → `(*g_jvm)->DetachCurrentThread(g_jvm)`
  3. L58 `GetEnv` → 同 1
  4. L61 `AttachCurrentThread(&env, NULL)` → `(*g_jvm)->AttachCurrentThread(g_jvm, &env, NULL)`（C 签名 `jint (*)(JavaVM*, JNIEnv**, void*)`）
- `egl_bridge.c`、`glfw_stub.c` 零错误零警告一次通过。
- hostcheck 之所以漏掉此错：host 编译只覆盖 glfw_stub.c（无 JNI），tipcl_runtime.c 从未参与过任何编译。

### 产物与导出核对（llvm-readelf，NDK 自带）
`build/intermediates/cxx/Debug/<hash>/obj/{arm64-v8a,x86_64}/libtipcl_runtime.so`：
```
=== arm64-v8a === Type: DYN, Machine: AArch64    Java_com_tipcl_android_core_runtime_* 导出: 46
=== x86_64  === Type: DYN, Machine: X86-64       Java_com_tipcl_android_core_runtime_* 导出: 46
arm64/x86_64 导出集合逐名 diff：完全一致
```
- 46 个导出与 Kotlin 侧 46 个 `external fun`（GlfwFacade 36 + InputInjector 6 + SurfaceBridge 4）逐名核对，无一缺失。
- 另有 `JNI_OnLoad` 及内部函数（glfw_*/egl_bridge_*）默认可见性导出——功能无害；后续若想收紧可加 `-fvisibility=hidden`（JNIEXPORT 已显式 default visibility，不受影响），CI 不作要求。

### 回归
- `:core-runtime:testDebugUnitTest --rerun-tasks`：**37 tests / 0 failures / 2 skipped**（skipped 为 Assume 门控的网络用例），全绿。

### 对 core-audio 的预测（未改其文件）
`core-audio/src/main/cpp/openal_shim.c` **预计不会命中同类问题**：无 JNI/JavaVM 调用（无 GetEnv/AttachCurrentThread）、不包含 EGL/android/native_window 头，仅 stdio/stdlib/string/dlfcn + 自研 openal_shim.h；其 CMake 的 host/Android 分支均自带。风险更低的是它**没设 ndkVersion**，会用 AGP 默认 NDK（26.1.10909125，SDK 内已在位），版本锁定策略与 core-runtime 不一致，建议后续统一。

## JRE 供应链（候选来源调研，仅记录事实与 URL）


以下均为公开分发安卓（bionic/aarch64）版 OpenJDK 构建的项目。OpenJDK 本体许可以 **GPLv2 + Classpath Exception** 为主（二进制再分发合规：随分发提供许可证与来源声明即可；我们只做"按其许可再分发 + 记录来源 + sha256 固定"，不修改其构建）。

| 候选 | 产物 | 许可 | URL 模式 | 备注 |
|---|---|---|---|---|
| PojavLauncherTeam / android-openjdk-build-multiarch | OpenJDK 8/11/17/21，aarch64 + x86_64（Android bionic） | GPLv2+CE（OpenJDK 上游许可） | `https://github.com/PojavLauncherTeam/android-openjdk-build-multiarch/releases`（release 资产为各版本 tar.xz/jar 包；集成时固定具体 release tag + 资产 sha256） | 安卓启动器生态事实标准来源；构建脚本公开（基于 openjdk 构建仓）。我们只取其**发布产物**，不参考任何启动器代码 |
| Termux main repo | openjdk-17 / openjdk-21（aarch64、x86_64，deb 包内 tar） | GPLv2+CE | `https://packages.termux.dev/apt/termux-main/pool/main/o/openjdk-17/`（版本化 .deb；`openjdk-17-tools`、`openjdk-17-source` 同池） | 包管理器仓库持续更新；deb 需自解包 data.tar；依赖 termux 路径约定（prefix /data/data/com.termux）需 post-process 或评估 |
| mobile-dev/openjdk 或其他下游镜像 | 同上转打包 | 同上游 | 各自 GitHub releases | 仅在前两者不可达时的镜像候选；sha256 必须与上游一致才可信 |

选型结论（M2 事实记录）：**首选 PojavLauncherTeam/android-openjdk-build-multiarch 的 aarch64 tar 包**——bionic 原生构建、无 prefix 依赖、tar.gz/tar.xz 可直接进我们的解包管线；清单中每条 `RuntimeSource` 必须填入当次集成的具体 release 资产 URL 与其 sha256（来源声明随应用"关于"页分发，含上游许可全文链接）。Termux 作为备选记录其 URL 模式（其路径前缀约定与 appData 布局不匹配，若采用需评估 release 文件与 jli 修正）。

## JRE 供给实测（M3 收尾，2026-11-07）

RemoteRuntimeProvider（下载/断点续传/sha256/自研 tar 解包）+ LocalRuntimeCatalog
（扫描/登记/cleanupCorrupt）首次对真实网络与真实发布产物做端到端实测。

### 源选择与核对

- 首选 PojavLauncherTeam/android-openjdk-build-multiarch（GitHub API 直连正常），
  但其全部 release 资产均为 **tar.xz**（jre8/jre17 各 arch），本模块解包器
  无第三方依赖、只支持 tar.gz/zip → 按预案改选 tar.gz 源。
- **实际源**：Adoptium Temurin `jdk-17.0.13+11` 的 aarch64 linux JRE：
  `https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.13%2B11/OpenJDK17U-jre_aarch64_linux_hotspot_17.0.13_11.tar.gz`
  - 大小 45,432,834 B（HEAD+302 跳转后 Content-Length，与实测一致）
  - sha256 `97c4fb748eaa1292fb2f28fec90a3eba23e35974ef67f8b3aa304ad4db2ba162`
    （官方 .sha256.txt 核对一致，下载后本地复算一致）
  - 顶层目录 `jdk-17.0.13+11-jre/`，318 个 entry，含 `release` 文件
    （JAVA_VERSION="17.0.13"）与 60+ 个 legal/ symlink。
  - 注意：是 glibc 构建而非 bionic，供管线实测与复现；真机用 bionic JRE
    待 Pojav xz 支持或另行转包后替换 RuntimeSource 清单即可（接口不变）。
- 镜像（ghfast.top/ghproxy 系）未启用：GitHub 直连可用（慢，约 245 KB/s）。
- 固定版本 + sha256 已写死进 `JreProvisionE2ETest`（companion 常量），复现性强。

### 实测结果（TIPCL_NETTEST=1 门控，默认跳过不污染回归）

| 项 | 结果 |
|---|---|
| 全量下载 + sha256 + 解包 + 登记全链（run-1） | 通过，194 s（45 MB @ ~245 KB/s + 解包） |
| 第二次 provision 命中缓存 | 通过，~1 s，零下载（归档 mtime 不变断言） |
| 断点续传（.part 预置前 44,432,834 B，真网拉最后 1 MB） | 通过，206 + Content-Range 正确，拼接后整档 sha256 一致，~1 s |
| 文件树完整性（跨架构免执行校验） | bin/java、lib/modules 在位；release 解析 major=17；解包 136 MB |
| 可执行位跟踪 | bin/java 记为可执行（chmod 后处理依据） |
| cleanupCorrupt | 清掉伪造损坏目录 `9/` 与历史 .staging/.part 残留，不误伤有效供给 |
| 解包产物留存 | `tipcl_work/tools/jre-cache/jre/17/`（供真机推送），归档缓存 `jre-cache/jre/archives/17.tar.gz` |

测试可重复跑：缓存目录经 `-Ptipcl.jre.cache.dir=...` 注入（默认 build/tmp）。

### 实测发现并就地修复的 bug（3 个）

1. **TarExtractor 把 symlink 写成伪文件**（真实包必踩）：typeflag '2' 的
   entry 的"数据"是链接目标文本，原实现按普通文件写出 → Temurin 包内
   `legal/*/LICENSE` 全变成内容为 `../java.base/LICENSE` 的伪文件。
   修复：'1'/'2' 记录进 TarEntry（新增 `isLink`）但不落盘。
   另补离线回归单测 `symlink entry is skipped not written as pseudo file`。
2. **entry.name 与落盘布局不一致**：stripLeadingDir 只影响写盘路径，
   entry.name 保留顶层目录 → `executableRelPaths()`（Android chmod 后处理的
   数据源）给出错误相对路径。修复：entry.name 统一应用 strip（与 KDoc
   声明的契约一致），同步修正 `stripLeadingDir removes common top folder` 单测。
3. **弱网下续传重试过于激进**：GitHub 直连常见连接超时（实测单次连接
   15 s 超时、3 次瞬时重试在坏窗口内全灭，run-1 的续传用例即因此失败）。
   修复：connectTimeout 15→30 s，重试间加 attempt*3 s 退避，失败信息带上
   底层异常。修后同窗口内续传用例通过。

另：`LocalRuntimeCatalog` 新增免执行校验 `releaseFileMajor(home)`（解析
`release` 的 JAVA_VERSION），供宿主架构与 JRE 二进制不一致时的文件树验证。

### 回归

- 离线全套 `:core-runtime:testDebugUnitTest`：**37 tests / 0 fail / 2 skipped**
  （2 skipped 为 Assume 门控的网络用例；既有 34 例全绿 + 新增 3 例）。
- 网络实测日志：`tipcl_work/tools/netest-run-{1,2,3}.log`、回归 `netest-regression*.log`。

### 遗留

- Pojav bionic tar.xz 支持（xz 解码需引入第三方库或自行实现，暂缓）；
  RuntimeSource 清单换源即可无缝切换。
- junit 4.13.2 缓存 jar 异常缺 `org.junit.Tag`，网络用例隔离靠 Assume 门控
  而非 @Tag（不影响功能，记为环境问题）。

## LWJGL 实测（M3 收尾）

NativeLibraryExtractor 首次用真实发布产物验证：LWJGL 3.3.3 的 5 个
`natives-linux-arm64` 分类器 jar（lwjgl / lwjgl-glfw / lwjgl-openal /
lwjgl-opengl / lwjgl-stb），Maven Central 直下，缓存于
`<root>/tools/lwjgl-cache/`（gradle 系统属性 `tipcl.lwjgl.cache.dir`）。

### 产物清单（URL = repo1.maven.org/maven2/org/lwjgl/<name>/3.3.3/<name>-3.3.3-natives-linux-arm64.jar）

| 构件 | sha256 | 解出 .so | 大小 |
|---|---|---|---|
| lwjgl | 397a79a5…f8558 | liblwjgl.so | 404,152 |
| lwjgl-glfw | cc6139c8…4179b | libglfw.so | 403,480 |
| lwjgl-openal | abf39248…205a1 | libopenal.so | 1,151,424 |
| lwjgl-opengl | 0b2b7532…4a4f9c | liblwjgl_opengl.so | 280,272 |
| lwjgl-stb | 17f0cf1b…05e1db | liblwjgl_stb.so | 384,184 |

（完整 sha256 写死在 `LwjglNativesE2ETest` 常量里，下载后逐一核对。）

### 发现的真实包差异与修复

- LWJGL natives jar 内 .so 布局为 `linux/arm64/org/lwjgl/<pkg>/lib*.so`：
  上游架构段名（`arm64`），不是 Android ABI 目录（`arm64-v8a`）。原
  `matchesAbi` 只认 KNOWN_ABIS，这些 entry 会被当"无 ABI 段全局放行"——
  arm64 设备碰巧正确，但 x86_64 设备会把 arm64 .so 误提取。
  修复：新增 `ABI_ALIASES` 别名映射（arm64/aarch64/armv8→arm64-v8a、
  amd64/x64→x86_64、armv7/armhf→armeabi-v7a 等），别名段与目标 ABI 不符
  即跳过。新增离线单测 `upstreamArchAliasSegmentsFilterByAbi`。

### 实测结论（`LwjglNativesE2ETest`，TIPCL_NETTEST=1 门控）

- 5 jar 全部 ensureExtracted：各解出 1 个 .so、共 5 个，名字与各包内容
  一致，平铺到目标目录（linux/ 段不落盘）。
- manifest：abi=arm64-v8a，`jars` 记录 5 个 sha256，`entry.N` 保留上游
  `linux/arm64/org/lwjgl/...` 路径。
- 二次调用缓存命中（cached=true，零解压）。
- 篡改 jar（追加字节、zip 仍可读）→ sha 变化 → 重新解压；还原后先重解压
  一次（清单记的是篡改版 sha）再命中缓存。
- x86_64 目标 ABI 下同批 jar 零提取（别名过滤生效）。

### 符号抽查（NDK r27c llvm-readelf，证明产物完整非截断）

- 解压产物均 ELF64 / AArch64，大小与 jar 内 entry 一致。
- libglfw.so 动态导出含 glfwInit / glfwCreateWindow / glfwSwapBuffers
  （FUNC GLOBAL DEFAULT）。
- libopenal.so 动态导出含 alcCreateContext / alcMakeContextCurrent /
  alcOpenDevice（FUNC GLOBAL PROTECTED——openal 全表 PROTECTED 可见性，
  照样满足 JNI 查找）。

## M3：JRE 源目录（JreSourceCatalog + CatalogService）

### 设计

- `JreSourceCatalog.ALL`：纯 Kotlin 数据清单，majors 8/17/21 × aarch64/x86_64，
  三级来源优先级，同一档位取第一个可用项（`toRuntimeSource()` 只放行
  sha256 已钉 且 解包器支持的条目）：
  1. **Adoptium Temurin**（glibc linux，tar.gz，解包器直接支持）——6 档全收录，
     sha256 全部取自各 release 官方 `*.tar.gz.sha256.txt`（2026-11-07 抓取）。
     17/aarch64 一条即 M2 已全链实测的源（URL/sha256/字节数三重与
     `JreProvisionE2ETest` 常量比对，有单测防漂移）。
  2. **PojavLauncherTeam android-openjdk-build-multiarch**（bionic，更贴合
     Android，但发布格式 tar.xz，解包器暂不支持）——收录 8/arm64、17×2 档
     作备用；资产命名按其实际 release 规则
     `jre{major}-{arch}-{date}-release.tar.xz`（tag `jre{major}-{commit}`），
     sha256 一律 `TODO(真机实测后钉)`。jre21 无 release（查证于 2026-11-07）。
  3. **Termux main 仓库**（bionic，deb）——当前 stable 索引只有 openjdk-21/25
     （17/8 已被移出主仓库），收录 21×2 档，sha256 取自 apt Packages 索引。
     注意该包是 JDK 非纯 JRE（106MB，含 javac）。
- `CatalogService`：`sourceFor(major, arch)`（arch 接受 `aarch64`/`x86_64`/
  `arm64-v8a`/`x64` 等别名，大小写不敏感）+ `requireSource()` 抛
  `JreSourceUnavailableException`，message 直接可给 UI：
  「该版本 JRE 暂缺：Java N @ ABI…目录已收录档位：…」。
- 升版/复核脚本：`core-runtime/scripts/gen-jre-source-catalog.py`
  （Adoptium 资产+sha256 复核走 api.github.com 官方通道；Termux 走 apt
  Packages 索引；`--check` 可作 CI 校验）。

### 实测记录（2026-11-07，TIPCL_NETTEST=1）

- **17/aarch64 全链**：`JreProvisionE2ETest` 下载 45,432,834B + sha256 校验 +
  解包 + 文件树完整性 + 断点续传（Range 续最后 1MB 后整档 sha256 一致）全过。
  GitHub 直链路由在本机时通时断（curl 与 JDK 各出现过 connect timeout，
  重试即过），已由 provider 的 3 次退避重试覆盖。
- **Termux 两档 HEAD**：21/aarch64、21/x86_64 均 HTTP 200，Content-Length 与
  目录钉的字节数完全一致（106,094,164 / 107,431,260）。
- **Adoptium 六档 HEAD**：本机直连 github.com release CDN 超时（环境限制，
  非 4xx/5xx）；改走 api.github.com 官方资产 API 逐条核验资产存在性、
  字节数与官方 sha256，全部一致。NetTest 设计上把「连接层不可达」与
  「HTTP 层异常/大小漂移」区分：前者记录不失败，后者硬断言——即目录一旦
  与远端漂移，任何可达环境下都会红。
- **Pojav 备用源 HEAD**：17/x86_64 命中 HTTP 200（39,230,848B，与 release
  资产 size 一致）；17/arm64、8/arm64 亦超时（同上环境原因，API 通道已核名）。

### 测试

- `JreSourceCatalogTest`（10 例，离线）：Tier1 覆盖矩阵完整性（8/17/21×2 arch、
  sha256 64hex、字节数、tar.gz）、URL 无占位符残留、17 与 E2E 常量一致性、
  备用层收录与缺口如实记录、选择逻辑（优先级/别名/大小写）、
  `toRuntimeSource` 只放行合规条目、缺失档位可读错误、未知 arch 安全响应。
- `JreSourceCatalogNetTest`（4 例，TIPCL_NETTEST=1 门控）：上述实测的固化。
- 回归：`:core-runtime:test` 由 43 例增至 **57 例**（debug/release 双变体），
  常规 0 失败（网络例 Assume 跳过），TIPCL_NETTEST=1 下双变体全绿。
