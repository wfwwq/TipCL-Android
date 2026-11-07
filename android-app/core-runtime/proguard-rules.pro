# core-runtime proguard rules

# JNI 入口由 native 侧按符号名查找，禁止重命名/移除
-keepclasseswithmembernames class com.tipcl.android.core.runtime.** {
    native <methods>;
}

# SurfaceBridge 的生命周期回调由外部（app 模块的 GLSurfaceView/SurfaceView）反射或直接调用
-keep class com.tipcl.android.core.runtime.SurfaceBridge { *; }
-keep class com.tipcl.android.core.runtime.GlfwFacade { *; }
-keep class com.tipcl.android.core.runtime.InputInjector { *; }

# 保留提供给游戏进程的回调桥类名（native -> Java 回调走 RegisterNatives，类名/签名需稳定）
-keep class com.tipcl.android.core.runtime.GlfwFacade$* { *; }
