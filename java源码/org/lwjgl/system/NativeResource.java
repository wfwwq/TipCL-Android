package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/NativeResource.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/NativeResource.class */
public interface NativeResource extends AutoCloseable {
    void free();

    @Override // java.lang.AutoCloseable
    default void close() {
        free();
    }
}
