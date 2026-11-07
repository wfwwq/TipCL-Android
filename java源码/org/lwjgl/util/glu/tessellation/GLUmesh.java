package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/glu/tessellation/GLUmesh.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/glu/tessellation/GLUmesh.class */
class GLUmesh {
    GLUvertex vHead = new GLUvertex();
    GLUface fHead = new GLUface();
    GLUhalfEdge eHead = new GLUhalfEdge(true);
    GLUhalfEdge eHeadSym = new GLUhalfEdge(false);

    GLUmesh() {
    }
}
