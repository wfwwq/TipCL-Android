package org.lwjgl.opengl;

import org.lwjgl.LWJGLException;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/DrawableLWJGL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/DrawableLWJGL.class */
interface DrawableLWJGL extends Drawable {
    void setPixelFormat(PixelFormatLWJGL pixelFormatLWJGL) throws LWJGLException;

    void setPixelFormat(PixelFormatLWJGL pixelFormatLWJGL, ContextAttribs contextAttribs) throws LWJGLException;

    PixelFormatLWJGL getPixelFormat();

    Context getContext();

    Context createSharedContext() throws LWJGLException;

    void checkGLError();

    void setSwapInterval(int i);

    void swapBuffers() throws LWJGLException;

    void initContext(float f, float f2, float f3);
}
