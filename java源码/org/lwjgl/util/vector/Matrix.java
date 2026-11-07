package org.lwjgl.util.vector;

import java.io.Serializable;
import java.nio.FloatBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/vector/Matrix.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/vector/Matrix.class */
public abstract class Matrix implements Serializable {
    public abstract Matrix setIdentity();

    public abstract Matrix invert();

    public abstract Matrix load(FloatBuffer floatBuffer);

    public abstract Matrix loadTranspose(FloatBuffer floatBuffer);

    public abstract Matrix negate();

    public abstract Matrix store(FloatBuffer floatBuffer);

    public abstract Matrix storeTranspose(FloatBuffer floatBuffer);

    public abstract Matrix transpose();

    public abstract Matrix setZero();

    public abstract float determinant();

    protected Matrix() {
    }
}
