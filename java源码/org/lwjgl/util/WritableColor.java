package org.lwjgl.util;

import java.nio.ByteBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/WritableColor.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/WritableColor.class */
public interface WritableColor {
    void set(int i, int i2, int i3, int i4);

    void set(byte b, byte b2, byte b3, byte b4);

    void set(int i, int i2, int i3);

    void set(byte b, byte b2, byte b3);

    void setRed(int i);

    void setGreen(int i);

    void setBlue(int i);

    void setAlpha(int i);

    void setRed(byte b);

    void setGreen(byte b);

    void setBlue(byte b);

    void setAlpha(byte b);

    void readRGBA(ByteBuffer byteBuffer);

    void readRGB(ByteBuffer byteBuffer);

    void readARGB(ByteBuffer byteBuffer);

    void readBGRA(ByteBuffer byteBuffer);

    void readBGR(ByteBuffer byteBuffer);

    void readABGR(ByteBuffer byteBuffer);

    void setColor(ReadableColor readableColor);
}
