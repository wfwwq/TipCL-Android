cmake_minimum_required(VERSION 3.22.1)
project(tipcl_runtime C)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_STANDARD_REQUIRED ON)

add_library(tipcl_runtime SHARED
    tipcl_runtime.c
    glfw_stub.c
    egl_bridge.c
)

target_include_directories(tipcl_runtime PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})

find_library(log-lib log)
find_library(android-lib android)
find_library(egl-lib EGL)
find_library(gles-lib GLESv2)
find_library(gles3-lib GLESv3)

target_link_libraries(tipcl_runtime PRIVATE
    ${log-lib}
    ${android-lib}
    ${egl-lib}
    ${gles3-lib}
)

# 洁净室实现：不链接任何第三方 GLFW 构建，全部为自研桩
target_compile_definitions(tipcl_runtime PRIVATE TIPCL_GLFW_STUB=1 TIPCL_ANDROID_BUILD=1)

if(ANDROID)
    target_link_options(tipcl_runtime PRIVATE -Wl,--build-id=none)
endif()
