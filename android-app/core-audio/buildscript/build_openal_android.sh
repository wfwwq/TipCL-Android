#!/usr/bin/env bash
# openal-soft 1.23.1 Android cross-build (NDK r27c), reproducible.
# Run from Git Bash. All tool paths are the project's pinned local tools.
#
# Inputs:
#   tools/openal-cache/src/openal-soft-1.23.1.tar.gz   (upstream source, see provenance below)
#   tools/ndk/android-ndk-r27c                         (NDK)
#   tools/android-sdk/cmake/3.22.1                     (cmake + ninja)
# Outputs:
#   android-app/core-audio/buildscript/dist/<abi>/libopenal.so
set -euo pipefail

ROOT=/c/Users/Administrator/tipcl_work/tools
SRC=$ROOT/openal-cache/extracted/openal-soft-1.23.1-src
OUT=$(dirname "$(readlink -f "$0")")
CMAKE=$ROOT/android-sdk/cmake/3.22.1/bin/cmake.exe
NINJA=$ROOT/android-sdk/cmake/3.22.1/bin/ninja.exe
TOOLCHAIN=$ROOT/ndk/android-ndk-r27c/build/cmake/android.toolchain.cmake

# 1.23.1 has only the OpenSL backend on Android (AAudio arrived in 1.24),
# so the so links libOpenSLES.so. HRTF datasets are embedded (default).
CMAKE_ARGS=(
  -G Ninja
  -DCMAKE_TOOLCHAIN_FILE=$TOOLCHAIN
  -DCMAKE_BUILD_TYPE=Release
  -DCMAKE_C_FLAGS=-Os -DCMAKE_CXX_FLAGS=-Os
  -DLIBTYPE=SHARED
  -DALSOFT_EXAMPLES=OFF -DALSOFT_UTILS=OFF
  -DCMAKE_MAKE_PROGRAM=$NINJA
)

for ABI in arm64-v8a x86_64; do
  BLD=$OUT/build/$ABI
  "$CMAKE" "${CMAKE_ARGS[@]}" -DANDROID_ABI=$ABI -DANDROID_PLATFORM=android-24 \
    -S "$SRC" -B "$BLD"
  "$CMAKE" --build "$BLD"
  mkdir -p "$OUT/dist/$ABI"
  cp "$BLD/libopenal.so" "$OUT/dist/$ABI/libopenal.so"
  $ROOT/ndk/android-ndk-r27c/toolchains/llvm/prebuilt/windows-x86_64/bin/llvm-strip.exe \
    --strip-unneeded "$OUT/dist/$ABI/libopenal.so"
done
echo "done; sha256:"
sha256sum "$OUT"/dist/*/libopenal.so
