package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/INTELMapTexture.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/INTELMapTexture.class */
public class INTELMapTexture {
    public static final int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 33791;
    public static final int GL_LAYOUT_DEFAULT_INTEL = 0;
    public static final int GL_LAYOUT_LINEAR_INTEL = 1;
    public static final int GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 2;

    public static native void glSyncTextureINTEL(@NativeType("GLuint") int i);

    public static native void glUnmapTexture2DINTEL(@NativeType("GLuint") int i, @NativeType("GLint") int i2);

    public static native long nglMapTexture2DINTEL(int i, int i2, int i3, long j, long j2);

    static {
        GL.initialize();
    }

    protected INTELMapTexture() {
        throw new UnsupportedOperationException();
    }

    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") IntBuffer stride, @NativeType("GLenum *") IntBuffer layout) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) stride, 1);
            Checks.check((Buffer) layout, 1);
        }
        long __result = nglMapTexture2DINTEL(texture, level, access, MemoryUtil.memAddress(stride), MemoryUtil.memAddress(layout));
        return MemoryUtil.memByteBufferSafe(__result, getStride(stride) * GLChecks.getTexLevelParameteri(texture, 3553, level, 4097));
    }

    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") IntBuffer stride, @NativeType("GLenum *") IntBuffer layout, ByteBuffer old_buffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) stride, 1);
            Checks.check((Buffer) layout, 1);
        }
        long __result = nglMapTexture2DINTEL(texture, level, access, MemoryUtil.memAddress(stride), MemoryUtil.memAddress(layout));
        int length = getStride(stride) * GLChecks.getTexLevelParameteri(texture, 3553, level, 4097);
        return APIUtil.apiGetMappedBuffer(old_buffer, __result, length);
    }

    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") IntBuffer stride, @NativeType("GLenum *") IntBuffer layout, long length, ByteBuffer old_buffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) stride, 1);
            Checks.check((Buffer) layout, 1);
        }
        long __result = nglMapTexture2DINTEL(texture, level, access, MemoryUtil.memAddress(stride), MemoryUtil.memAddress(layout));
        return APIUtil.apiGetMappedBuffer(old_buffer, __result, (int) length);
    }

    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") int[] stride, @NativeType("GLenum *") int[] layout) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(stride, 1);
            Checks.check(layout, 1);
        }
        long __result = JNI.callPPP(texture, level, access, stride, layout, __functionAddress);
        return MemoryUtil.memByteBufferSafe(__result, getStride(stride) * GLChecks.getTexLevelParameteri(texture, 3553, level, 4097));
    }

    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") int[] stride, @NativeType("GLenum *") int[] layout, ByteBuffer old_buffer) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(stride, 1);
            Checks.check(layout, 1);
        }
        long __result = JNI.callPPP(texture, level, access, stride, layout, __functionAddress);
        int length = getStride(stride) * GLChecks.getTexLevelParameteri(texture, 3553, level, 4097);
        return APIUtil.apiGetMappedBuffer(old_buffer, __result, length);
    }

    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") int[] stride, @NativeType("GLenum *") int[] layout, long length, ByteBuffer old_buffer) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(stride, 1);
            Checks.check(layout, 1);
        }
        long __result = JNI.callPPP(texture, level, access, stride, layout, __functionAddress);
        return APIUtil.apiGetMappedBuffer(old_buffer, __result, (int) length);
    }

    private static int getStride(IntBuffer stride) {
        return stride.get(stride.position());
    }

    private static int getStride(int[] stride) {
        return stride[0];
    }
}
