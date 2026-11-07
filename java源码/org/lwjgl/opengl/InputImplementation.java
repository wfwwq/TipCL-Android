package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.LWJGLException;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/InputImplementation.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/InputImplementation.class */
public interface InputImplementation {
    boolean hasWheel();

    int getButtonCount();

    void createMouse() throws LWJGLException;

    void destroyMouse();

    void pollMouse(IntBuffer intBuffer, ByteBuffer byteBuffer);

    void readMouse(ByteBuffer byteBuffer);

    void grabMouse(boolean z);

    int getNativeCursorCapabilities();

    void setCursorPosition(int i, int i2);

    void setNativeCursor(Object obj) throws LWJGLException;

    int getMinCursorSize();

    int getMaxCursorSize();

    void createKeyboard() throws LWJGLException;

    void destroyKeyboard();

    void pollKeyboard(ByteBuffer byteBuffer);

    void readKeyboard(ByteBuffer byteBuffer);

    Object createCursor(int i, int i2, int i3, int i4, int i5, IntBuffer intBuffer, IntBuffer intBuffer2) throws LWJGLException;

    void destroyCursor(Object obj);

    int getWidth();

    int getHeight();

    boolean isInsideWindow();
}
