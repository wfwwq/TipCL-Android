package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/glu/GLUtessellatorCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/glu/GLUtessellatorCallback.class */
public interface GLUtessellatorCallback {
    void begin(int i);

    void beginData(int i, Object obj);

    void edgeFlag(boolean z);

    void edgeFlagData(boolean z, Object obj);

    void vertex(Object obj);

    void vertexData(Object obj, Object obj2);

    void end();

    void endData(Object obj);

    void combine(double[] dArr, Object[] objArr, float[] fArr, Object[] objArr2);

    void combineData(double[] dArr, Object[] objArr, float[] fArr, Object[] objArr2, Object obj);

    void error(int i);

    void errorData(int i, Object obj);
}
