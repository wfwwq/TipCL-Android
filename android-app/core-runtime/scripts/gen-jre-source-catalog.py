#!/usr/bin/env python3
"""JreSourceCatalog 生成/复核脚本（开发辅助，非构建依赖）。

用途：
  1. 复核 Tier 1（Adoptium）全部条目的 sha256 是否与官方 .sha256.txt 一致；
  2. 打印 Termux openjdk 包当前索引的 Filename/Size/SHA256（Tier 3 数据来源）;
  3. 新版本升版时打印可直接粘贴进 JreSourceCatalog.kt 的条目骨架。

用法：
  python gen-jre-source-catalog.py            # 全部动作
  python gen-jre-source-catalog.py --check    # 只复核 Tier1 sha256（CI 可用）

数据源（均为官方渠道）：
  - Adoptium: https://api.github.com/repos/adoptium/temurin{M}-binaries/releases/tags/{tag}
  - Termux:   https://packages.termux.dev/apt/termux-main/dists/stable/main/binary-{arch}/Packages

2026-11-07 抓取基准：17=jdk-17.0.13+11, 21=jdk-21.0.5+11, 8=jdk8u412-b08,
termux openjdk-21=21.0.13-1。升版时同步更新 JreSourceCatalog.kt 的 URL/sha256/bytes。
"""
import argparse
import json
import sys
import urllib.request

TIER1 = [
    (8, "aarch64", "temurin8-binaries", "jdk8u412-b08",
     "OpenJDK8U-jre_aarch64_linux_hotspot_8u412b08.tar.gz"),
    (8, "x86_64", "temurin8-binaries", "jdk8u412-b08",
     "OpenJDK8U-jre_x64_linux_hotspot_8u412b08.tar.gz"),
    (17, "aarch64", "temurin17-binaries", "jdk-17.0.13%2B11",
     "OpenJDK17U-jre_aarch64_linux_hotspot_17.0.13_11.tar.gz"),
    (17, "x86_64", "temurin17-binaries", "jdk-17.0.13%2B11",
     "OpenJDK17U-jre_x64_linux_hotspot_17.0.13_11.tar.gz"),
    (21, "aarch64", "temurin21-binaries", "jdk-21.0.5%2B11",
     "OpenJDK21U-jre_aarch64_linux_hotspot_21.0.5_11.tar.gz"),
    (21, "x86_64", "temurin21-binaries", "jdk-21.0.5%2B11",
     "OpenJDK21U-jre_x64_linux_hotspot_21.0.5_11.tar.gz"),
]

TERMUX_ARCHES = ["aarch64", "x86_64"]


def fetch(url, accept=None):
    req = urllib.request.Request(url, headers={
        "User-Agent": "tipcl-jre-catalog-script",
        **({"Accept": accept} if accept else {}),
    })
    with urllib.request.urlopen(req, timeout=60) as r:
        return r.read()


def check_adoptium():
    ok = True
    for major, arch, repo, tag, asset in TIER1:
        api = f"https://api.github.com/repos/adoptium/{repo}/releases/tags/{tag}"
        rel = json.loads(fetch(api).decode())
        info = next((a for a in rel["assets"] if a["name"] == asset), None)
        if info is None:
            print(f"MISSING {major}/{arch}: {asset} 不在 release 资产中")
            ok = False
            continue
        # sha256.txt 是小资产，走 assets API 的 octet-stream（直链 download 端点
        # 在部分网络下被墙/超时，API 通道更稳）
        sha_asset = next(a for a in rel["assets"] if a["name"] == asset + ".sha256.txt")
        body = fetch(sha_asset["url"], accept="application/octet-stream").decode().strip()
        official = body.split()[0]
        print(f"{major}/{arch} {asset}")
        print(f"  size    {info['size']}")
        print(f"  sha256  {official}")
    return ok


def check_termux():
    for arch in TERMUX_ARCHES:
        idx = fetch(
            "https://packages.termux.dev/apt/termux-main/dists/stable/main/"
            f"binary-{arch}/Packages"
        ).decode(errors="replace")
        for pkg in ("openjdk-21", "openjdk-17", "openjdk-8"):
            block = None
            for chunk in idx.split("\n\n"):
                if chunk.startswith(f"Package: {pkg}\n"):
                    block = chunk
                    break
            if block is None:
                print(f"termux/{arch}: {pkg} 不在当前 stable 索引")
                continue
            fields = {}
            for line in block.splitlines():
                if ": " in line:
                    k, v = line.split(": ", 1)
                    fields[k] = v
            print(f"termux/{arch} {pkg} {fields.get('Version')}")
            print(f"  filename {fields.get('Filename')}")
            print(f"  size     {fields.get('Size')}")
            print(f"  sha256   {fields.get('SHA256')}")


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--check", action="store_true", help="只复核 Tier1 sha256")
    args = ap.parse_args()
    rc = 0 if check_adoptium() else 1
    if not args.check:
        print("\n---- termux ----")
        check_termux()
    sys.exit(rc)


if __name__ == "__main__":
    main()
