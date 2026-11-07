package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVQueryResourceTag.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVQueryResourceTag.class */
public class NVQueryResourceTag {
    public static native void nglGenQueryResourceTagNV(int i, long j);

    public static native void nglDeleteQueryResourceTagNV(int i, long j);

    public static native void nglQueryResourceTagNV(int i, long j);

    static {
        GL.initialize();
    }

    protected NVQueryResourceTag() {
        throw new UnsupportedOperationException();
    }

    public static void glGenQueryResourceTagNV(@NativeType("GLuint *") IntBuffer tagIds) {
        nglGenQueryResourceTagNV(tagIds.remaining(), MemoryUtil.memAddress(tagIds));
    }

    @NativeType("void")
    public static int glGenQueryResourceTagNV() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer tagIds = stack.callocInt(1);
            nglGenQueryResourceTagNV(1, MemoryUtil.memAddress(tagIds));
            int i = tagIds.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glDeleteQueryResourceTagNV(@NativeType("GLuint const *") IntBuffer tagIds) {
        nglDeleteQueryResourceTagNV(tagIds.remaining(), MemoryUtil.memAddress(tagIds));
    }

    public static void glDeleteQueryResourceTagNV(@NativeType("GLuint const *") int tagId) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer tagIds = stack.ints(tagId);
            nglDeleteQueryResourceTagNV(1, MemoryUtil.memAddress(tagIds));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glQueryResourceTagNV(@NativeType("GLuint") int tagId, @NativeType("GLchar const *") ByteBuffer tagString) {
        if (Checks.CHECKS) {
            Checks.checkNT1(tagString);
        }
        nglQueryResourceTagNV(tagId, MemoryUtil.memAddress(tagString));
    }

    public static void glQueryResourceTagNV(@NativeType("GLuint") int tagId, @NativeType("GLchar const *") CharSequence tagString) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(tagString, true);
            long tagStringEncoded = stack.getPointerAddress();
            nglQueryResourceTagNV(tagId, tagStringEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGenQueryResourceTagNV(@NativeType("GLuint *") int[] tagIds) {
        long __functionAddress = GL.getICD().glGenQueryResourceTagNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(tagIds.length, tagIds, __functionAddress);
    }

    public static void glDeleteQueryResourceTagNV(@NativeType("GLuint const *") int[] tagIds) {
        long __functionAddress = GL.getICD().glDeleteQueryResourceTagNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(tagIds.length, tagIds, __functionAddress);
    }
}
