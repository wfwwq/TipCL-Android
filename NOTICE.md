# NOTICE

## 本作品

TipCL 安卓端（本仓库整体，含 `android-app/` 各模块及自研工具）以
**GNU General Public License v3.0（GPL-3.0）** 分发。完整许可文本见仓库根目录的
[LICENSE](LICENSE)；全文亦见 <https://www.gnu.org/licenses/gpl-3.0.html>。

```
TipCL-Android — 基于 GPL-3.0 分发，不附带任何担保。
Copyright (C) 2026 TipCL 作者
```

## 随作品分发的第三方二进制组件

以下外部二进制可能随本作品的分发包一起提供（或由应用在首次运行时下载到
应用私有目录）。各自的许可与上游来源如下：

### OpenJDK 运行时构建（JRE，用于启动 Minecraft Java 版）

- 许可：**GPL-2.0-only WITH Classpath-exception-2.0**（GPLv2+CE）
- 构建来源候选：Eclipse Temurin（<https://adoptium.net/>，Adoptium 项目，
  GPLv2+CE）；或同等 GPLv2+CE 的 OpenJDK 构建
- 上游源码：<https://github.com/openjdk/jdk>
- 合规要点：GPLv2+CE 允许作为独立程序随 GPL-3.0 作品一并分发；分发包中
  必须随附（或提供获取途径）对应 OpenJDK 构建的 GPLv2+CE 许可文本与源码
  获取链接。该组件不因本作品而改为 GPL-3.0。

### OpenAL Soft（`libopenal.so`，音频输出）

- 许可：**LGPL-2.1-or-later**
- 上游：<https://github.com/kcat/openal-soft>（官网 <https://openal-soft.org/>）
- 合规要点（LGPL 动态链接）：
  1. 以**独立 .so 文件**形式提供，不静态链入本作品，保持可替换——
     用户可用自行构建的同名 `libopenal.so` 替换分发包中的副本；
  2. 应用侧通过 JNI/dlopen 动态调用，不修改上游库；
  3. 分发包中随附（或提供获取途径）LGPL-2.1 文本及对应版本源码链接
     （上游 release 归档：<https://github.com/kcat/openal-soft/releases>）。
- 构建来源：优先取上游官方预编译产物；若无则按上游文档以 NDK 交叉编译，
  构建配置与 sha256 记录见 `android-app/core-audio/NOTES.md`。

## 不属于分发物的外部服务

以下镜像/服务仅作为可选的**下载加速渠道**在运行时由用户配置或使用，
其响应内容不随本作品分发，不构成本作品的组成部分：

- **BMCLAPI**（<https://bmclapi2.bangbang93.com/>）：Minecraft 版本清单、
  库与资源文件的第三方镜像；
- **GTNH 等社区镜像**：第三方整合包/库镜像渠道；
- Mojang 官方源（piston-meta / piston-data）与 Fabric meta
  （<https://meta.fabricmc.net/>）：上游原始下载源。

经由这些渠道下载的文件（Minecraft 资源、第三方库等）遵循各自原始许可，
与本项目及其 GPL-3.0 许可互不影响。

## 洁净室声明

本工程的自研代码（含对 Minecraft 启动/音频桥的接口适配）均为独立编写，
不包含、不引用任何未经许可的专有源码或反编译产物；对上游行为的适配仅
依据公开文档与公开可获取的接口说明进行。

## Gradle 依赖

`android-app/` 各模块的第三方 Maven 依赖（okhttp、kotlinx-serialization、
Compose、Material 等）的完整清单及许可，见自动生成的
[THIRD-PARTY-NOTICES.md](THIRD-PARTY-NOTICES.md)（由
`tools/notices/generate_notices.py` 维护，`--check` 校验）。
