package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVQueryResource.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVQueryResource.class */
public class NVQueryResource {
    public static final int GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV = 38208;
    public static final int GL_QUERY_RESOURCE_MEMTYPE_VIDMEM_NV = 38210;
    public static final int GL_QUERY_RESOURCE_SYS_RESERVED_NV = 38212;
    public static final int GL_QUERY_RESOURCE_TEXTURE_NV = 38213;
    public static final int GL_QUERY_RESOURCE_RENDERBUFFER_NV = 38214;
    public static final int GL_QUERY_RESOURCE_BUFFEROBJECT_NV = 38215;

    public static native int nglQueryResourceNV(int i, int i2, int i3, long j);

    static {
        GL.initialize();
    }

    protected NVQueryResource() {
        throw new UnsupportedOperationException();
    }

    @NativeType("GLint")
    public static int glQueryResourceNV(@NativeType("GLenum") int queryType, @NativeType("GLint") int pname, @NativeType("GLint *") IntBuffer buffer) {
        return nglQueryResourceNV(queryType, pname, buffer.remaining(), MemoryUtil.memAddress(buffer));
    }

    @NativeType("GLint")
    public static int glQueryResourceNV(@NativeType("GLenum") int queryType, @NativeType("GLint") int pname, @NativeType("GLint *") int[] buffer) {
        long __functionAddress = GL.getICD().glQueryResourceNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPI(queryType, pname, buffer.length, buffer, __functionAddress);
    }
}
