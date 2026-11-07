package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/WritableDimension.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/WritableDimension.class */
public interface WritableDimension {
    void setSize(int i, int i2);

    void setSize(ReadableDimension readableDimension);

    void setHeight(int i);

    void setWidth(int i);
}
