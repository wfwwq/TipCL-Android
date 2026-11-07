package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/ReadablePoint.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/ReadablePoint.class */
public interface ReadablePoint {
    int getX();

    int getY();

    void getLocation(WritablePoint writablePoint);
}
