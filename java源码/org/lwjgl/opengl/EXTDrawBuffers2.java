package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTDrawBuffers2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTDrawBuffers2.class */
public class EXTDrawBuffers2 {
    public static native void glColorMaskIndexedEXT(@NativeType("GLuint") int i, @NativeType("GLboolean") boolean z, @NativeType("GLboolean") boolean z2, @NativeType("GLboolean") boolean z3, @NativeType("GLboolean") boolean z4);

    public static native void nglGetBooleanIndexedvEXT(int i, int i2, long j);

    public static native void nglGetIntegerIndexedvEXT(int i, int i2, long j);

    public static native void glEnableIndexedEXT(@NativeType("GLenum") int i, @NativeType("GLuint") int i2);

    public static native void glDisableIndexedEXT(@NativeType("GLenum") int i, @NativeType("GLuint") int i2);

    @NativeType("GLboolean")
    public static native boolean glIsEnabledIndexedEXT(@NativeType("GLenum") int i, @NativeType("GLuint") int i2);

    static {
        GL.initialize();
    }

    protected EXTDrawBuffers2() {
        throw new UnsupportedOperationException();
    }

    public static void glGetBooleanIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, 1);
        }
        nglGetBooleanIndexedvEXT(target, index, MemoryUtil.memAddress(data));
    }

    @NativeType("void")
    public static boolean glGetBooleanIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            ByteBuffer data = stack.calloc(1);
            nglGetBooleanIndexedvEXT(target, index, MemoryUtil.memAddress(data));
            return data.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, 1);
        }
        nglGetIntegerIndexedvEXT(target, index, MemoryUtil.memAddress(data));
    }

    @NativeType("void")
    public static int glGetIntegerIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetIntegerIndexedvEXT(target, index, MemoryUtil.memAddress(data));
            int i = data.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetIntegerIndexedvEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(data, 1);
        }
        JNI.callPV(target, index, data, __functionAddress);
    }
}
