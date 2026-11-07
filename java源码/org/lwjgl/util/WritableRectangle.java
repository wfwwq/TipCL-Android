package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/WritableRectangle.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/WritableRectangle.class */
public interface WritableRectangle extends WritablePoint, WritableDimension {
    void setBounds(int i, int i2, int i3, int i4);

    void setBounds(ReadablePoint readablePoint, ReadableDimension readableDimension);

    void setBounds(ReadableRectangle readableRectangle);
}
