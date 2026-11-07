package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBBindlessTexture.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBBindlessTexture.class */
public class ARBBindlessTexture {
    public static final int GL_UNSIGNED_INT64_ARB = 5135;

    @NativeType("GLuint64")
    public static native long glGetTextureHandleARB(@NativeType("GLuint") int i);

    @NativeType("GLuint64")
    public static native long glGetTextureSamplerHandleARB(@NativeType("GLuint") int i, @NativeType("GLuint") int i2);

    public static native void glMakeTextureHandleResidentARB(@NativeType("GLuint64") long j);

    public static native void glMakeTextureHandleNonResidentARB(@NativeType("GLuint64") long j);

    @NativeType("GLuint64")
    public static native long glGetImageHandleARB(@NativeType("GLuint") int i, @NativeType("GLint") int i2, @NativeType("GLboolean") boolean z, @NativeType("GLint") int i3, @NativeType("GLenum") int i4);

    public static native void glMakeImageHandleResidentARB(@NativeType("GLuint64") long j, @NativeType("GLenum") int i);

    public static native void glMakeImageHandleNonResidentARB(@NativeType("GLuint64") long j);

    public static native void glUniformHandleui64ARB(@NativeType("GLint") int i, @NativeType("GLuint64") long j);

    public static native void nglUniformHandleui64vARB(int i, int i2, long j);

    public static native void glProgramUniformHandleui64ARB(@NativeType("GLuint") int i, @NativeType("GLint") int i2, @NativeType("GLuint64") long j);

    public static native void nglProgramUniformHandleui64vARB(int i, int i2, int i3, long j);

    @NativeType("GLboolean")
    public static native boolean glIsTextureHandleResidentARB(@NativeType("GLuint64") long j);

    @NativeType("GLboolean")
    public static native boolean glIsImageHandleResidentARB(@NativeType("GLuint64") long j);

    public static native void glVertexAttribL1ui64ARB(@NativeType("GLuint") int i, @NativeType("GLuint64") long j);

    public static native void nglVertexAttribL1ui64vARB(int i, long j);

    public static native void nglGetVertexAttribLui64vARB(int i, int i2, long j);

    static {
        GL.initialize();
    }

    protected ARBBindlessTexture() {
        throw new UnsupportedOperationException();
    }

    public static void glUniformHandleui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer values) {
        nglUniformHandleui64vARB(location, values.remaining(), MemoryUtil.memAddress(values));
    }

    public static void glProgramUniformHandleui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer values) {
        nglProgramUniformHandleui64vARB(program, location, values.remaining(), MemoryUtil.memAddress(values));
    }

    public static void glVertexAttribL1ui64vARB(@NativeType("GLuint") int index, @NativeType("GLuint64 const *") LongBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 1);
        }
        nglVertexAttribL1ui64vARB(index, MemoryUtil.memAddress(v));
    }

    public static void glGetVertexAttribLui64vARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetVertexAttribLui64vARB(index, pname, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static long glGetVertexAttribLui64ARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetVertexAttribLui64vARB(index, pname, MemoryUtil.memAddress(params));
            long j = params.get(0);
            stack.setPointer(stackPointer);
            return j;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glUniformHandleui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] values) {
        long __functionAddress = GL.getICD().glUniformHandleui64vARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, values.length, values, __functionAddress);
    }

    public static void glProgramUniformHandleui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] values) {
        long __functionAddress = GL.getICD().glProgramUniformHandleui64vARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(program, location, values.length, values, __functionAddress);
    }

    public static void glVertexAttribL1ui64vARB(@NativeType("GLuint") int index, @NativeType("GLuint64 const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL1ui64vARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 1);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glGetVertexAttribLui64vARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLui64vARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(index, pname, params, __functionAddress);
    }
}
