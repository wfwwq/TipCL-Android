# core-input CHANGELOG

## M3 接口清债（2026-11-07）

本次关闭三笔此前各代理记录的接口债。全部改动向后兼容，既有调用方无需立即迁移。

### ① LookGesture.sensitivity：构造期 val → @Volatile var

- 文件：`src/main/java/com/tipcl/android/core/input/LookGesture.kt`
- `sensitivity` 现为 `@Volatile var`，运行期直接赋值即对后续手势生效，
  无需再通过重建 LookGesture + TouchRouter 来更新灵敏度。
- 线程安全：`@Volatile` 保证 UI 线程（设置滑条）写入对触摸事件线程可见；
  单次 Float 写不存在撕裂读。
- 迁移提示：core-ui 的 `OverlayInputPipeline.updateSensitivity` 目前仍走
  重建路由路径，行为不变、继续可用；后续可简化为 `lookGesture.sensitivity = value`
  并去掉重建（属 core-ui 改动，本次未动，由 core-ui 侧自行排期）。

### ② InputSink 新增 postCodepoint(Int) 通道

- 文件：`src/main/java/com/tipcl/android/core/input/InputSink.kt`
- `postCharEvent(Char)` 是 UTF-16 语义，BMP 之外的字符（emoji 等）在调用方
  侧会被拆成代理项，native 按 codepoint 消费时收到两个非法码点。
- 新增接口默认方法 `postCodepoint(codepoint: Int)`：
  - 实现方覆写后收到完整 UTF-32 码点（推荐，app 层 InputInjector 适配器
    应跟进覆写，实现真正的 codepoint 注入——本次不动 app，仅提示）；
  - 未覆写时降级转发 `postCharEvent`：BMP 单 Char 原样转发，非 BMP 拆
    高/低代理项转发（与旧行为一致），非法码点（负数 / 代理区 / > U+10FFFF）
    直接忽略。
- 迁移提示：core-ui 的 `OverlayInputPipeline.sink` 目前只转发 `postCharEvent`；
  若 app 层适配器覆写了 `GameInputTarget.postCodepoint`，建议该 sink 一并
  覆写 `postCodepoint` 直通，文字输入路径即可支持 emoji（core-ui 改动，本次未动）。

### ③ core-ui GameInputTarget.postKey 新增 mods/repeat 四参重载

- 文件：`core-ui/src/main/java/com/tipcl/android/core/ui/GameInputTarget.kt`
- 新增 `postKey(code, press, mods = 0, repeat = false)` 重载，默认实现降级
  调用两参 `postKey(code, press)`（忽略 mods/repeat）。
- 刻意做成独立重载而非给原方法加默认参数：若原两参方法直接加默认值，
  Kotlin 要求所有 `override` 必须改为四参签名，会破坏 app 层既有适配器。
- 迁移提示：app 层 `GameHostActivity` 的两参覆写无需跟随修改、编译与行为
  均不变；需要精确修饰键（Shift/Ctrl 等）语义时再覆写四参版本即可。

### 测试

- `LookGestureTest`：新增灵敏度热更新两例（同实例改 var 后增量与新手势均生效）。
- `InputSinkCodepointTest`（新增）：默认实现对 BMP / 边界 / 非 BMP 代理项拆分 /
  非法码点忽略的行为，以及覆写实现收到完整 codepoint。
- `core-ui/src/test/.../GameInputTargetTest.kt`（新增，纯 JVM）：两参覆写兼容、
  四参默认降级、覆写四参收到 mods/repeat、两参调用点解析到两参重载。

验证：`gradle :core-input:test :core-ui:testDebugUnitTest --no-daemon` 全绿，
`:core-ui:compileDebugKotlin` 通过。
