cmake_minimum_required(VERSION 3.22.1)
project(tipcl_core_audio C)

# openal_shim：对游戏暴露 openal 风格导出，转发到真 OpenAL Soft（运行时 dlopen）。
# Android 上命中的是供给器落到 nativeLibDir 的 libopenal.so（见 OpenAlProvisioner）。
add_library(openal_shim SHARED openal_shim.c)

target_compile_options(openal_shim PRIVATE -Wall -Wextra)

if(ANDROID)
    target_compile_definitions(openal_shim PRIVATE TIPCL_AUDIO_ANDROID)
    target_link_libraries(openal_shim PRIVATE log dl)
else()
    # host 自检路径（w64devkit/MinGW）：Windows API 隔离在 shim 内部，无需额外库。
    target_compile_definitions(openal_shim PRIVATE TIPCL_AUDIO_HOSTCHECK)
endif()
