package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBClearBufferObject.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBClearBufferObject.class */
public class ARBClearBufferObject {
    public static native void nglClearNamedBufferDataEXT(int i, int i2, int i3, int i4, long j);

    public static native void nglClearNamedBufferSubDataEXT(int i, int i2, long j, long j2, int i3, int i4, long j3);

    static {
        GL.initialize();
    }

    protected ARBClearBufferObject() {
        throw new UnsupportedOperationException();
    }

    public static void nglClearBufferData(int target, int internalformat, int format, int type, long data) {
        GL43C.nglClearBufferData(target, internalformat, format, type, data);
    }

    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    public static void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
        GL43C.nglClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        nglClearNamedBufferDataEXT(buffer, internalformat, format, type, MemoryUtil.memAddressSafe(data));
    }

    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer data) {
        nglClearNamedBufferDataEXT(buffer, internalformat, format, type, MemoryUtil.memAddressSafe(data));
    }

    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer data) {
        nglClearNamedBufferDataEXT(buffer, internalformat, format, type, MemoryUtil.memAddressSafe(data));
    }

    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer data) {
        nglClearNamedBufferDataEXT(buffer, internalformat, format, type, MemoryUtil.memAddressSafe(data));
    }

    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, MemoryUtil.memAddressSafe(data));
    }

    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer data) {
        nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, MemoryUtil.memAddressSafe(data));
    }

    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer data) {
        nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, MemoryUtil.memAddressSafe(data));
    }

    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer data) {
        nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, MemoryUtil.memAddressSafe(data));
    }

    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }
}
