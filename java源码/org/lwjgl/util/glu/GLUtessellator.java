package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/glu/GLUtessellator.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/glu/GLUtessellator.class */
public interface GLUtessellator {
    void gluDeleteTess();

    void gluTessProperty(int i, double d);

    void gluGetTessProperty(int i, double[] dArr, int i2);

    void gluTessNormal(double d, double d2, double d3);

    void gluTessCallback(int i, GLUtessellatorCallback gLUtessellatorCallback);

    void gluTessVertex(double[] dArr, int i, Object obj);

    void gluTessBeginPolygon(Object obj);

    void gluTessBeginContour();

    void gluTessEndContour();

    void gluTessEndPolygon();

    void gluBeginPolygon();

    void gluNextContour(int i);

    void gluEndPolygon();
}
