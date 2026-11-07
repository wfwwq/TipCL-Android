package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVFence.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVFence.class */
public class NVFence {
    public static final int GL_ALL_COMPLETED_NV = 34034;
    public static final int GL_FENCE_STATUS_NV = 34035;
    public static final int GL_FENCE_CONDITION_NV = 34036;

    public static native void nglDeleteFencesNV(int i, long j);

    public static native void nglGenFencesNV(int i, long j);

    @NativeType("GLboolean")
    public static native boolean glIsFenceNV(@NativeType("GLuint") int i);

    @NativeType("GLboolean")
    public static native boolean glTestFenceNV(@NativeType("GLuint") int i);

    public static native void nglGetFenceivNV(int i, int i2, long j);

    public static native void glFinishFenceNV(@NativeType("GLuint") int i);

    public static native void glSetFenceNV(@NativeType("GLuint") int i, @NativeType("GLenum") int i2);

    static {
        GL.initialize();
    }

    protected NVFence() {
        throw new UnsupportedOperationException();
    }

    public static void glDeleteFencesNV(@NativeType("GLuint const *") IntBuffer fences) {
        nglDeleteFencesNV(fences.remaining(), MemoryUtil.memAddress(fences));
    }

    public static void glDeleteFencesNV(@NativeType("GLuint const *") int fence) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer fences = stack.ints(fence);
            nglDeleteFencesNV(1, MemoryUtil.memAddress(fences));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGenFencesNV(@NativeType("GLuint *") IntBuffer fences) {
        nglGenFencesNV(fences.remaining(), MemoryUtil.memAddress(fences));
    }

    @NativeType("void")
    public static int glGenFencesNV() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer fences = stack.callocInt(1);
            nglGenFencesNV(1, MemoryUtil.memAddress(fences));
            int i = fences.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetFenceivNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetFenceivNV(fence, pname, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetFenceiNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int pname) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetFenceivNV(fence, pname, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glDeleteFencesNV(@NativeType("GLuint const *") int[] fences) {
        long __functionAddress = GL.getICD().glDeleteFencesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(fences.length, fences, __functionAddress);
    }

    public static void glGenFencesNV(@NativeType("GLuint *") int[] fences) {
        long __functionAddress = GL.getICD().glGenFencesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(fences.length, fences, __functionAddress);
    }

    public static void glGetFenceivNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFenceivNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(fence, pname, params, __functionAddress);
    }
}
