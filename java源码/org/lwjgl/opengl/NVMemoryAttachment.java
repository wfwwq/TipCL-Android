package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVMemoryAttachment.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVMemoryAttachment.class */
public class NVMemoryAttachment {
    public static final int GL_ATTACHED_MEMORY_OBJECT_NV = 38308;
    public static final int GL_ATTACHED_MEMORY_OFFSET_NV = 38309;
    public static final int GL_MEMORY_ATTACHABLE_ALIGNMENT_NV = 38310;
    public static final int GL_MEMORY_ATTACHABLE_SIZE_NV = 38311;
    public static final int GL_MEMORY_ATTACHABLE_NV = 38312;
    public static final int GL_DETACHED_MEMORY_INCARNATION_NV = 38313;
    public static final int GL_DETACHED_TEXTURES_NV = 38314;
    public static final int GL_DETACHED_BUFFERS_NV = 38315;
    public static final int GL_MAX_DETACHED_TEXTURES_NV = 38316;
    public static final int GL_MAX_DETACHED_BUFFERS_NV = 38317;

    public static native void nglGetMemoryObjectDetachedResourcesuivNV(int i, int i2, int i3, int i4, long j);

    public static native void glResetMemoryObjectParameterNV(@NativeType("GLuint") int i, @NativeType("GLenum") int i2);

    public static native void glTexAttachMemoryNV(@NativeType("GLenum") int i, @NativeType("GLuint") int i2, @NativeType("GLuint64") long j);

    public static native void glBufferAttachMemoryNV(@NativeType("GLenum") int i, @NativeType("GLuint") int i2, @NativeType("GLuint64") long j);

    public static native void glTextureAttachMemoryNV(@NativeType("GLuint") int i, @NativeType("GLuint") int i2, @NativeType("GLuint64") long j);

    public static native void glNamedBufferAttachMemoryNV(@NativeType("GLuint") int i, @NativeType("GLuint") int i2, @NativeType("GLuint64") long j);

    static {
        GL.initialize();
    }

    protected NVMemoryAttachment() {
        throw new UnsupportedOperationException();
    }

    public static void glGetMemoryObjectDetachedResourcesuivNV(@NativeType("GLuint") int memory, @NativeType("GLenum") int pname, @NativeType("GLint") int first, @NativeType("GLuint *") IntBuffer params) {
        nglGetMemoryObjectDetachedResourcesuivNV(memory, pname, first, params.remaining(), MemoryUtil.memAddress(params));
    }

    public static void glGetMemoryObjectDetachedResourcesuivNV(@NativeType("GLuint") int memory, @NativeType("GLenum") int pname, @NativeType("GLint") int first, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMemoryObjectDetachedResourcesuivNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(memory, pname, first, params.length, params, __functionAddress);
    }
}
