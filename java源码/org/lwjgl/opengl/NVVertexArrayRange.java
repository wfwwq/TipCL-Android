package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVVertexArrayRange.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVVertexArrayRange.class */
public class NVVertexArrayRange {
    public static final int GL_VERTEX_ARRAY_RANGE_NV = 34077;
    public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_NV = 34078;
    public static final int GL_VERTEX_ARRAY_RANGE_VALID_NV = 34079;
    public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 34080;
    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 34081;

    public static native void nglVertexArrayRangeNV(int i, long j);

    public static native void glFlushVertexArrayRangeNV();

    static {
        GL.initialize();
    }

    protected NVVertexArrayRange() {
        throw new UnsupportedOperationException();
    }

    public static void glVertexArrayRangeNV(@NativeType("void *") ByteBuffer pointer) {
        nglVertexArrayRangeNV(pointer.remaining(), MemoryUtil.memAddress(pointer));
    }
}
