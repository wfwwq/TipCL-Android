package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBMatrixPalette.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBMatrixPalette.class */
public class ARBMatrixPalette {
    public static final int GL_MATRIX_PALETTE_ARB = 34880;
    public static final int GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 34881;
    public static final int GL_MAX_PALETTE_MATRICES_ARB = 34882;
    public static final int GL_CURRENT_PALETTE_MATRIX_ARB = 34883;
    public static final int GL_MATRIX_INDEX_ARRAY_ARB = 34884;
    public static final int GL_CURRENT_MATRIX_INDEX_ARB = 34885;
    public static final int GL_MATRIX_INDEX_ARRAY_SIZE_ARB = 34886;
    public static final int GL_MATRIX_INDEX_ARRAY_TYPE_ARB = 34887;
    public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 34888;
    public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 34889;

    public static native void glCurrentPaletteMatrixARB(@NativeType("GLint") int i);

    public static native void nglMatrixIndexuivARB(int i, long j);

    public static native void nglMatrixIndexubvARB(int i, long j);

    public static native void nglMatrixIndexusvARB(int i, long j);

    public static native void nglMatrixIndexPointerARB(int i, int i2, int i3, long j);

    static {
        GL.initialize();
    }

    protected ARBMatrixPalette() {
        throw new UnsupportedOperationException();
    }

    public static void glMatrixIndexuivARB(@NativeType("GLuint *") IntBuffer indices) {
        nglMatrixIndexuivARB(indices.remaining(), MemoryUtil.memAddress(indices));
    }

    public static void glMatrixIndexubvARB(@NativeType("GLubyte *") ByteBuffer indices) {
        nglMatrixIndexubvARB(indices.remaining(), MemoryUtil.memAddress(indices));
    }

    public static void glMatrixIndexusvARB(@NativeType("GLushort *") ShortBuffer indices) {
        nglMatrixIndexusvARB(indices.remaining(), MemoryUtil.memAddress(indices));
    }

    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglMatrixIndexPointerARB(size, type, stride, MemoryUtil.memAddress(pointer));
    }

    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglMatrixIndexPointerARB(size, type, stride, pointer);
    }

    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglMatrixIndexPointerARB(size, 5121, stride, MemoryUtil.memAddress(pointer));
    }

    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglMatrixIndexPointerARB(size, 5123, stride, MemoryUtil.memAddress(pointer));
    }

    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglMatrixIndexPointerARB(size, 5125, stride, MemoryUtil.memAddress(pointer));
    }

    public static void glMatrixIndexuivARB(@NativeType("GLuint *") int[] indices) {
        long __functionAddress = GL.getICD().glMatrixIndexuivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(indices.length, indices, __functionAddress);
    }

    public static void glMatrixIndexusvARB(@NativeType("GLushort *") short[] indices) {
        long __functionAddress = GL.getICD().glMatrixIndexusvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(indices.length, indices, __functionAddress);
    }
}
