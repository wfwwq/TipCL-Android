package org.lwjgl.util.vector;

import java.nio.FloatBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/vector/ReadableVector.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/vector/ReadableVector.class */
public interface ReadableVector {
    float length();

    float lengthSquared();

    Vector store(FloatBuffer floatBuffer);
}
