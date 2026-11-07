<div align="center">

<img src="docs/icon.png" width="140" alt="TipCL" />

# TipCL for Android

**TipCL 安卓端 —— Minecraft Java 版启动器**

触控优先的移动端 MC:JE 启动体验：精心调校的手势与虚拟按键，装好即玩

<br/>

<img src="https://img.shields.io/badge/Android-8.0%2B-3DDC84?style=flat-square" alt="Android" />
<img src="https://img.shields.io/badge/Minecraft-1.16%20~%201.21-62B47A?style=flat-square" alt="Minecraft" />
<img src="https://img.shields.io/badge/许可证-GPL--3.0-blue?style=flat-square" alt="License" />

</div>

---

## ✨ 特性

- **触控调校**：点按放置 / 长按破坏 / 拖动转视角，斜率阈值调优降低滑动误触
- **多指不抢**：摇杆按触点 ID 跟踪，多指同时操作互不干扰；手指滑出按键自动松键
- **快捷栏直达**：快捷栏点按直接选物品，游戏内操作一气呵成
- **一体成型**：应用内完成 Java 运行时与游戏组件下载，开箱即用
- **桌面同源**：与 TipCL 桌面端同一品牌、同一套设计语言

## 📦 安装

前往 [Releases](../../releases) 下载最新的 `TipCL-x.x.x.apk` 安装即可。

## 🛠️ 从源码构建

本仓库包含完整可重建的安卓工程（`app/Android/`），Windows 上一条命令出发行版：

```bat
scripts\build_release.bat
```

脚本会自动准备 apktool 与 Android build-tools（zipalign / apksigner），产物输出到
`dist\TipCL-<版本>.apk`（v1 + v2 签名）。签名密钥位于 `scripts/keystore/`。

`java源码/` 与 `补丁smali/` 目录为工程对应的可读代码与补丁参考，
`重建工具/` 提供单 dex 增量重编辅助（详见《触控改动说明》）。

## 📄 许可

本项目以 GPL-3.0 许可分发。分发的第三方组件（OpenJDK 构建等）各自遵循其原始许可。
