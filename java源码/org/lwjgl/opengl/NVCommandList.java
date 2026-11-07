package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVCommandList.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVCommandList.class */
public class NVCommandList {
    public static final int GL_TERMINATE_SEQUENCE_COMMAND_NV = 0;
    public static final int GL_NOP_COMMAND_NV = 1;
    public static final int GL_DRAW_ELEMENTS_COMMAND_NV = 2;
    public static final int GL_DRAW_ARRAYS_COMMAND_NV = 3;
    public static final int GL_DRAW_ELEMENTS_STRIP_COMMAND_NV = 4;
    public static final int GL_DRAW_ARRAYS_STRIP_COMMAND_NV = 5;
    public static final int GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 6;
    public static final int GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV = 7;
    public static final int GL_ELEMENT_ADDRESS_COMMAND_NV = 8;
    public static final int GL_ATTRIBUTE_ADDRESS_COMMAND_NV = 9;
    public static final int GL_UNIFORM_ADDRESS_COMMAND_NV = 10;
    public static final int GL_BLEND_COLOR_COMMAND_NV = 11;
    public static final int GL_STENCIL_REF_COMMAND_NV = 12;
    public static final int GL_LINE_WIDTH_COMMAND_NV = 13;
    public static final int GL_POLYGON_OFFSET_COMMAND_NV = 14;
    public static final int GL_ALPHA_REF_COMMAND_NV = 15;
    public static final int GL_VIEWPORT_COMMAND_NV = 16;
    public static final int GL_SCISSOR_COMMAND_NV = 17;
    public static final int GL_FRONT_FACE_COMMAND_NV = 18;

    public static native void nglCreateStatesNV(int i, long j);

    public static native void nglDeleteStatesNV(int i, long j);

    @NativeType("GLboolean")
    public static native boolean glIsStateNV(@NativeType("GLuint") int i);

    public static native void glStateCaptureNV(@NativeType("GLuint") int i, @NativeType("GLenum") int i2);

    @NativeType("GLuint")
    public static native int glGetCommandHeaderNV(@NativeType("GLenum") int i, @NativeType("GLuint") int i2);

    @NativeType("GLushort")
    public static native short glGetStageIndexNV(@NativeType("GLenum") int i);

    public static native void nglDrawCommandsNV(int i, int i2, long j, long j2, int i3);

    public static native void nglDrawCommandsAddressNV(int i, long j, long j2, int i2);

    public static native void nglDrawCommandsStatesNV(int i, long j, long j2, long j3, long j4, int i2);

    public static native void nglDrawCommandsStatesAddressNV(long j, long j2, long j3, long j4, int i);

    public static native void nglCreateCommandListsNV(int i, long j);

    public static native void nglDeleteCommandListsNV(int i, long j);

    @NativeType("GLboolean")
    public static native boolean glIsCommandListNV(@NativeType("GLuint") int i);

    public static native void nglListDrawCommandsStatesClientNV(int i, int i2, long j, long j2, long j3, long j4, int i3);

    public static native void glCommandListSegmentsNV(@NativeType("GLuint") int i, @NativeType("GLuint") int i2);

    public static native void glCompileCommandListNV(@NativeType("GLuint") int i);

    public static native void glCallCommandListNV(@NativeType("GLuint") int i);

    static {
        GL.initialize();
    }

    protected NVCommandList() {
        throw new UnsupportedOperationException();
    }

    public static void glCreateStatesNV(@NativeType("GLuint *") IntBuffer states) {
        nglCreateStatesNV(states.remaining(), MemoryUtil.memAddress(states));
    }

    @NativeType("void")
    public static int glCreateStatesNV() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer states = stack.callocInt(1);
            nglCreateStatesNV(1, MemoryUtil.memAddress(states));
            int i = states.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glDeleteStatesNV(@NativeType("GLuint const *") IntBuffer states) {
        nglDeleteStatesNV(states.remaining(), MemoryUtil.memAddress(states));
    }

    public static void glDeleteStatesNV(@NativeType("GLuint const *") int state) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer states = stack.ints(state);
            nglDeleteStatesNV(1, MemoryUtil.memAddress(states));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glDrawCommandsNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) sizes, indirects.remaining());
        }
        nglDrawCommandsNV(primitiveMode, buffer, MemoryUtil.memAddress(indirects), MemoryUtil.memAddress(sizes), indirects.remaining());
    }

    public static void glDrawCommandsAddressNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint64 const *") LongBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) sizes, indirects.remaining());
        }
        nglDrawCommandsAddressNV(primitiveMode, MemoryUtil.memAddress(indirects), MemoryUtil.memAddress(sizes), indirects.remaining());
    }

    public static void glDrawCommandsStatesNV(@NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes, @NativeType("GLuint const *") IntBuffer states, @NativeType("GLuint const *") IntBuffer fbos) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) sizes, indirects.remaining());
            Checks.check((Buffer) states, indirects.remaining());
            Checks.check((Buffer) fbos, indirects.remaining());
        }
        nglDrawCommandsStatesNV(buffer, MemoryUtil.memAddress(indirects), MemoryUtil.memAddress(sizes), MemoryUtil.memAddress(states), MemoryUtil.memAddress(fbos), indirects.remaining());
    }

    public static void glDrawCommandsStatesAddressNV(@NativeType("GLuint64 const *") LongBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes, @NativeType("GLuint const *") IntBuffer states, @NativeType("GLuint const *") IntBuffer fbos) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) sizes, indirects.remaining());
            Checks.check((Buffer) states, indirects.remaining());
            Checks.check((Buffer) fbos, indirects.remaining());
        }
        nglDrawCommandsStatesAddressNV(MemoryUtil.memAddress(indirects), MemoryUtil.memAddress(sizes), MemoryUtil.memAddress(states), MemoryUtil.memAddress(fbos), indirects.remaining());
    }

    public static void glCreateCommandListsNV(@NativeType("GLuint *") IntBuffer lists) {
        nglCreateCommandListsNV(lists.remaining(), MemoryUtil.memAddress(lists));
    }

    @NativeType("void")
    public static int glCreateCommandListsNV() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer lists = stack.callocInt(1);
            nglCreateCommandListsNV(1, MemoryUtil.memAddress(lists));
            int i = lists.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glDeleteCommandListsNV(@NativeType("GLuint const *") IntBuffer lists) {
        nglDeleteCommandListsNV(lists.remaining(), MemoryUtil.memAddress(lists));
    }

    public static void glDeleteCommandListsNV(@NativeType("GLuint const *") int list) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer lists = stack.ints(list);
            nglDeleteCommandListsNV(1, MemoryUtil.memAddress(lists));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glListDrawCommandsStatesClientNV(@NativeType("GLuint") int list, @NativeType("GLuint") int segment, @NativeType("void const **") PointerBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes, @NativeType("GLuint const *") IntBuffer states, @NativeType("GLuint const *") IntBuffer fbos) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) sizes, indirects.remaining());
            Checks.check((Buffer) states, indirects.remaining());
            Checks.check((Buffer) fbos, indirects.remaining());
        }
        nglListDrawCommandsStatesClientNV(list, segment, MemoryUtil.memAddress(indirects), MemoryUtil.memAddress(sizes), MemoryUtil.memAddress(states), MemoryUtil.memAddress(fbos), indirects.remaining());
    }

    public static void glCreateStatesNV(@NativeType("GLuint *") int[] states) {
        long __functionAddress = GL.getICD().glCreateStatesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(states.length, states, __functionAddress);
    }

    public static void glDeleteStatesNV(@NativeType("GLuint const *") int[] states) {
        long __functionAddress = GL.getICD().glDeleteStatesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(states.length, states, __functionAddress);
    }

    public static void glDrawCommandsNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") int[] sizes) {
        long __functionAddress = GL.getICD().glDrawCommandsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(sizes, indirects.remaining());
        }
        JNI.callPPV(primitiveMode, buffer, MemoryUtil.memAddress(indirects), sizes, indirects.remaining(), __functionAddress);
    }

    public static void glDrawCommandsAddressNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint64 const *") long[] indirects, @NativeType("GLsizei const *") int[] sizes) {
        long __functionAddress = GL.getICD().glDrawCommandsAddressNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(sizes, indirects.length);
        }
        JNI.callPPV(primitiveMode, indirects, sizes, indirects.length, __functionAddress);
    }

    public static void glDrawCommandsStatesNV(@NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") int[] sizes, @NativeType("GLuint const *") int[] states, @NativeType("GLuint const *") int[] fbos) {
        long __functionAddress = GL.getICD().glDrawCommandsStatesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(sizes, indirects.remaining());
            Checks.check(states, indirects.remaining());
            Checks.check(fbos, indirects.remaining());
        }
        JNI.callPPPPV(buffer, MemoryUtil.memAddress(indirects), sizes, states, fbos, indirects.remaining(), __functionAddress);
    }

    public static void glDrawCommandsStatesAddressNV(@NativeType("GLuint64 const *") long[] indirects, @NativeType("GLsizei const *") int[] sizes, @NativeType("GLuint const *") int[] states, @NativeType("GLuint const *") int[] fbos) {
        long __functionAddress = GL.getICD().glDrawCommandsStatesAddressNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(sizes, indirects.length);
            Checks.check(states, indirects.length);
            Checks.check(fbos, indirects.length);
        }
        JNI.callPPPPV(indirects, sizes, states, fbos, indirects.length, __functionAddress);
    }

    public static void glCreateCommandListsNV(@NativeType("GLuint *") int[] lists) {
        long __functionAddress = GL.getICD().glCreateCommandListsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(lists.length, lists, __functionAddress);
    }

    public static void glDeleteCommandListsNV(@NativeType("GLuint const *") int[] lists) {
        long __functionAddress = GL.getICD().glDeleteCommandListsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(lists.length, lists, __functionAddress);
    }

    public static void glListDrawCommandsStatesClientNV(@NativeType("GLuint") int list, @NativeType("GLuint") int segment, @NativeType("void const **") PointerBuffer indirects, @NativeType("GLsizei const *") int[] sizes, @NativeType("GLuint const *") int[] states, @NativeType("GLuint const *") int[] fbos) {
        long __functionAddress = GL.getICD().glListDrawCommandsStatesClientNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(sizes, indirects.remaining());
            Checks.check(states, indirects.remaining());
            Checks.check(fbos, indirects.remaining());
        }
        JNI.callPPPPV(list, segment, MemoryUtil.memAddress(indirects), sizes, states, fbos, indirects.remaining(), __functionAddress);
    }
}
