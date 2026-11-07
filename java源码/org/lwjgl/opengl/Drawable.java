package org.lwjgl.opengl;

import org.lwjgl.LWJGLException;
import org.lwjgl.PointerBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/Drawable.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/Drawable.class */
public interface Drawable {
    boolean isCurrent() throws LWJGLException;

    void makeCurrent() throws LWJGLException;

    void releaseContext() throws LWJGLException;

    void destroy();

    void setCLSharingProperties(PointerBuffer pointerBuffer) throws LWJGLException;
}
