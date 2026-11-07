# TipCL 0.9.3 触控改动说明

日期：2026-11-07（当日更新：修复雷电模拟器闪退问题）
针对反馈：聊天记录中提出的"点屏幕任意处（包括快捷栏）都放方块"、"搓屏幕和按键冲突"、"像 Windows 平板模式照搬到手机"等问题。

## 成品与备份

| 文件 | 说明 |
| --- | --- |
| `TipCL-0.9.3-触控优化版.apk` | 修改后成品（已 zipalign + v2/v3 签名，可直接安装，已在雷电模拟器 Android 14 上验证启动正常） |
| `backup/TipCL-0.9.3-debug-v2-原始备份.apk` | 原始 APK 备份（SHA256 与源文件一致，勿删） |
| `apktool_out/` | 反编译工作目录（含修改后的 smali，补丁源文件在这） |
| `tools/` | apktool、uber-apk-signer、自写的 SurgicalAssemble.java（重建用） |
| `pymcl_启动截图.png` | 修复版在雷电模拟器上运行截图 |

## 多指触控修复（2026-11-07 第二轮，针对"视角指重按抢摇杆"）

用户实测反馈的具体场景：两指同时按（摇杆+视角）正常；但**视角指抬起后再按回屏幕
（摇杆指仍按住）时，新按下的手指不转视角，反而"抢走"摇杆（人物跟着它走）**。

根因（代码层定位）：

1. `ControlOverlay`（虚拟按键层，普通 ViewGroup）里已有子控件（摇杆）在消费触摸时，
   Android 会把落在背景上的新指针"并入" overlay 的触摸目标，而 overlay 自身不处理
   背景指针 → 这根手指的事件被整层丢弃（所以不转视角），且事件流可能串入摇杆；
2. `DirectionView`（摇杆）读取坐标用的是 `e.getX()`，**不区分指针**——任何串进来的
   其他手指坐标都会直接改变摇杆方向（这就是"抢夺摇杆"）；
3. `GameActivity.onBackgroundTouch` 的游戏分支没有处理 `POINTER_DOWN/POINTER_UP`，
   "第二根/重新按下的视角手指"在原设计里就是残废的。

修复（三处，classes4/8.dex）：

1. **ControlOverlay 新增 `dispatchTouchEvent` 覆写**：DOWN/POINTER_DOWN 落点不在
   任何子控件范围内时，overlay 直接返回 false，让该指针落到 gameView 的背景手势
   处理（LookGesture）——视角指随时按、随时生效，不再被吞；
2. **DirectionView 改为按 pointerId 跟踪**：摇杆只认自己按下的那根手指
   （`getPointerId` + `findPointerIndexById`），其他手指的坐标不再影响方向；
3. **onBackgroundTouch 补齐 POINTER_DOWN / POINTER_UP 处理**：重按的视角指正确
   开始手势、抬起时正确结束（长按破坏状态不会再卡住）。

修复后的预期行为：

- 两指同时按（摇杆+视角）：边走边转 ✅（不变）
- 视角指抬起 → 再按回 → 滑动：**转视角**，摇杆不受影响 ✅（修复）
- 任意顺序、任意先后的多指组合（含两指都在摇杆上）均按 pointerId 隔离 ✅

> 本轮按用户要求未做模拟器实测，仅通过构建期校验（smali 汇编零错误 + v2/v3 签名
> 验证 + Compose dex 与原包逐字节一致）。如手感有偏差可再迭代。

## 游戏内实测（2026-11-07，雷电模拟器 Android 14）

在模拟器里下载并启动 Minecraft 1.21.11（离线账号 Steve），实测结果：

| 验证项 | 结果 |
| --- | --- |
| 启动器 UI（Compose） | ✅ 正常渲染、无崩溃 |
| `:game` 游戏进程 | ✅ 全程存活（PID 2540 未变），crash 缓冲区为空 |
| 标题画面 / 创建世界 / 进入世界 | ✅ 完整渲染（Minecraft 1.21.11） |
| 虚拟按键层（含改过的 ButtonView） | ✅ 正常显示与工作 |
| **快捷栏点按选择** | ✅ 点击快捷栏第 5 格 → 选中框切到第 5 格；点击第 8 格 → 切到第 8 格，均准确命中且不放方块 |
| 滑动转视角 | ✅ 正常（未受补丁影响） |

证据截图：`pymcl_启动截图.png`、`pymcl_游戏内验证截图.png`、
`快捷栏验证_点击第5格后.png`、`快捷栏验证_点击第8格后.png`。

注意：MC 26.3 需要 Java 25（在线下载），在模拟器网络下曾超时（`下载 universal.tar.xz
失败: timeout`，重试即可，与本次改动无关）；1.21.11 用内置 JRE 21 可直接运行。

## 雷电模拟器闪退排查（2026-11-07 更新）

**现象**：修复版能安装，但启动即闪退（反复崩溃）。

**排查过程**（通过雷电自带的 adb 抓取崩溃日志 + 三组对照实验）：

1. 崩溃日志：`java.lang.IncompatibleClassChangeError: Found interface
   androidx.compose.ui.graphics.drawscope.DrawScope, but class was expected`，
   发生在 Compose 界面绘制路径（`BackgroundNode.drawRect`）——即启动器主界面的
   Compose 框架代码，与触控补丁（游戏进程的类）无关。
2. 对照实验 A：**原包只做 zipalign+重签名、完全不碰 dex** → 在雷电上正常运行。
3. 对照实验 B：**原包 apktool 全量解包→原样回编译（零改动）** → 同样闪退。

**结论**：闪退不是触控补丁造成的，而是 apktool 把全部 24 个 dex 经 dexlib2
重编时损坏了 Compose 相关类（位于 classes.dex / classes17.dex / classes24.dex）。
副作用发现：原始 APK 的 `resources.arsc` 未按 Android 11+（R+）规则对齐存储，
在 Android 14 模拟器上**原包本身就装不上**；zipalign+签名后即可安装。

**修复方式**：改用"外科手术式"打包——只把补丁所在的 classes3/4/8.dex
（共 398 个类，不含任何 Compose 类）单独重编，其余 21 个 dex 保持原包字节不变，
替换回原 zip 后再对齐签名。已验证：

- classes.dex / classes17.dex / classes24.dex / resources.arsc / AndroidManifest.xml
  与原包**逐字节一致**；
- 雷电模拟器（Android 14，x86_64）上启动正常、进程稳定、界面渲染完整（见截图）。

重建命令（如需再次修改）：

```
:: 1. 用 apktool 解包（或直接改 apktool_out 里已有的 smali）
:: 2. 只重编目标 dex（tools\SurgicalAssemble.java 调用 apktool 内置 smali API）
javac -cp tools\apktool.jar tools\SurgicalAssemble.java
java -cp tools\apktool.jar;tools SurgicalAssemble apktool_out\smali_classes3 surgical\classes3.dex 26
java -cp tools\apktool.jar;tools SurgicalAssemble apktool_out\smali_classes4 surgical\classes4.dex 26
java -cp tools\apktool.jar;tools SurgicalAssemble apktool_out\smali_classes8 surgical\classes8.dex 26
:: 3. 替换进原包并签名
copy backup\TipCL-0.9.3-debug-v2-原始备份.apk mod.apk
cd surgical && "C:\Program Files\Java\jdk-25.0.5.0.2\bin\jar.exe" uf mod.apk classes3.dex classes4.dex classes8.dex
cd .. && java -jar tools\uber-apk-signer.jar -a mod.apk --allowResign --overwrite
```

## 问题定位

触控链路（游戏锁定状态下，未安装 TouchController mod 时）：

- `LookGesture`（`com.pymcl.runtime.input`）：拖动=转视角、**点按=右键（放方块）**、
  **长按=左键（破坏）**——与反馈描述完全吻合。
- `GameActivity.onBackgroundTouch`：把背景触控分发给 LookGesture。
- `ButtonView.onGameTouch`：虚拟按键在 ACTION_DOWN 立即发送按键，滑动经过时无法松开。

## 三项改动（均在 smali 层完成）

### 1. 点按快捷栏 → 选择物品栏（核心修复）

`GameActivity`（classes4.dex）：

- 新增 `hbZone(x,y)`：命中区 = 屏幕底部 15%、水平中部 [34%, 66%]（对准 GUI 缩放 3 的快捷栏宽度）。
- 新增 `hbSlot(x)`：把命中区九等分，映射到 0–8 号物品栏格。
- `onBackgroundTouch`：锁定状态下，
  - ACTION_DOWN 落在快捷栏区 → 记录触点，**不**启动长按破坏计时；
  - ACTION_UP 时若"位移 < 24px 且时长 ≤ 220ms"→ 发送对应数字键（FCL 键码 2..10，即键盘 1–9），
    由游戏侧切换到该格物品，**不再放方块**；
  - 从快捷栏区起手的拖动仍正常转视角；长按快捷栏无任何动作。

### 2. 降低滑动误触（"搓屏幕起冲突"）

`LookGesture`（classes3.dex）：触摸判定斜率默认值 12px → **24px**。
轻微搓动（<24px）不再被判成"点按放方块"，需要明显滑动才开始转视角。

### 3. 滑出按键自动松键

`ButtonView`（classes8.dex）：`onGameTouch` 增加滑动检测——手指从按键滑出超过 40px
（对非切换型按键）自动发送松键；ACTION_POINTER_UP 也补发了松键。
从按键上起手的滑动不再把按键"粘住"。

## 已知限制

- 快捷栏命中区的宽度按 GUI 缩放 3 校准；若游戏内缩放设为 2 或 4（含"自动"），
  最边缘 1–2 格可能选偏一格，中间格不受影响。
- 若安装了 TouchController mod（游戏目录 mods 内），触控由 mod 接管，本次改动不生效
  （原始备份行为不变）。
- 品名/包名未变；签名换成了本机生成的 debug 签名，**与原签名不同，需先卸载旧版再安装**
  （启动器数据多在外部存储，一般不受影响，但请自行确认存档位置）。

## 重建方法

```
java -jar tools\apktool.jar b apktool_out -o out-unsigned.apk
java -jar tools\uber-apk-signer.jar -a out-unsigned.apk --allowResign --overwrite
```
