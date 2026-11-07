package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBRobustness.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBRobustness.class */
public class ARBRobustness {
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 33363;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 33364;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 33365;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 33366;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 33362;
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 33377;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 4;

    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatusARB();

    public static native void nglGetnMapdvARB(int i, int i2, int i3, long j);

    public static native void nglGetnMapfvARB(int i, int i2, int i3, long j);

    public static native void nglGetnMapivARB(int i, int i2, int i3, long j);

    public static native void nglGetnPixelMapfvARB(int i, int i2, long j);

    public static native void nglGetnPixelMapuivARB(int i, int i2, long j);

    public static native void nglGetnPixelMapusvARB(int i, int i2, long j);

    public static native void nglGetnPolygonStippleARB(int i, long j);

    public static native void nglGetnTexImageARB(int i, int i2, int i3, int i4, int i5, long j);

    public static native void nglReadnPixelsARB(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j);

    public static native void nglGetnColorTableARB(int i, int i2, int i3, int i4, long j);

    public static native void nglGetnConvolutionFilterARB(int i, int i2, int i3, int i4, long j);

    public static native void nglGetnSeparableFilterARB(int i, int i2, int i3, int i4, long j, int i5, long j2, long j3);

    public static native void nglGetnHistogramARB(int i, boolean z, int i2, int i3, int i4, long j);

    public static native void nglGetnMinmaxARB(int i, boolean z, int i2, int i3, int i4, long j);

    public static native void nglGetnCompressedTexImageARB(int i, int i2, int i3, long j);

    public static native void nglGetnUniformfvARB(int i, int i2, int i3, long j);

    public static native void nglGetnUniformivARB(int i, int i2, int i3, long j);

    public static native void nglGetnUniformuivARB(int i, int i2, int i3, long j);

    public static native void nglGetnUniformdvARB(int i, int i2, int i3, long j);

    static {
        GL.initialize();
    }

    protected ARBRobustness() {
        throw new UnsupportedOperationException();
    }

    public static void glGetnMapdvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") DoubleBuffer data) {
        nglGetnMapdvARB(target, query, data.remaining(), MemoryUtil.memAddress(data));
    }

    @NativeType("void")
    public static double glGetnMapdARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            DoubleBuffer data = stack.callocDouble(1);
            nglGetnMapdvARB(target, query, 1, MemoryUtil.memAddress(data));
            double d = data.get(0);
            stack.setPointer(stackPointer);
            return d;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetnMapfvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") FloatBuffer data) {
        nglGetnMapfvARB(target, query, data.remaining(), MemoryUtil.memAddress(data));
    }

    @NativeType("void")
    public static float glGetnMapfARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetnMapfvARB(target, query, 1, MemoryUtil.memAddress(data));
            float f = data.get(0);
            stack.setPointer(stackPointer);
            return f;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetnMapivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") IntBuffer data) {
        nglGetnMapivARB(target, query, data.remaining(), MemoryUtil.memAddress(data));
    }

    @NativeType("void")
    public static int glGetnMapiARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetnMapivARB(target, query, 1, MemoryUtil.memAddress(data));
            int i = data.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetnPixelMapfvARB(@NativeType("GLenum") int map, @NativeType("GLfloat *") FloatBuffer data) {
        nglGetnPixelMapfvARB(map, data.remaining(), MemoryUtil.memAddress(data));
    }

    public static void glGetnPixelMapuivARB(@NativeType("GLenum") int map, @NativeType("GLuint *") IntBuffer data) {
        nglGetnPixelMapuivARB(map, data.remaining(), MemoryUtil.memAddress(data));
    }

    public static void glGetnPixelMapusvARB(@NativeType("GLenum") int map, @NativeType("GLushort *") ShortBuffer data) {
        nglGetnPixelMapusvARB(map, data.remaining(), MemoryUtil.memAddress(data));
    }

    public static void glGetnPolygonStippleARB(@NativeType("GLsizei") int bufSize, @NativeType("GLubyte *") long pattern) {
        nglGetnPolygonStippleARB(bufSize, pattern);
    }

    public static void glGetnPolygonStippleARB(@NativeType("GLubyte *") ByteBuffer pattern) {
        nglGetnPolygonStippleARB(pattern.remaining(), MemoryUtil.memAddress(pattern));
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnTexImageARB(tex, level, format, type, bufSize, img);
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining(), MemoryUtil.memAddress(img));
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 1, MemoryUtil.memAddress(img));
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 2, MemoryUtil.memAddress(img));
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 2, MemoryUtil.memAddress(img));
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 3, MemoryUtil.memAddress(img));
    }

    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long data) {
        nglReadnPixelsARB(x, y, width, height, format, type, bufSize, data);
    }

    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining(), MemoryUtil.memAddress(data));
    }

    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 1, MemoryUtil.memAddress(data));
    }

    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 2, MemoryUtil.memAddress(data));
    }

    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 2, MemoryUtil.memAddress(data));
    }

    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long table) {
        nglGetnColorTableARB(target, format, type, bufSize, table);
    }

    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining(), MemoryUtil.memAddress(table));
    }

    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining() << 1, MemoryUtil.memAddress(table));
    }

    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining() << 2, MemoryUtil.memAddress(table));
    }

    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining() << 2, MemoryUtil.memAddress(table));
    }

    public static void glGetnConvolutionFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long image) {
        nglGetnConvolutionFilterARB(target, format, type, bufSize, image);
    }

    public static void glGetnConvolutionFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer image) {
        nglGetnConvolutionFilterARB(target, format, type, image.remaining(), MemoryUtil.memAddress(image));
    }

    public static void glGetnSeparableFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int rowBufSize, @NativeType("void *") long row, @NativeType("GLsizei") int columnBufSize, @NativeType("void *") long column, @NativeType("void *") ByteBuffer span) {
        nglGetnSeparableFilterARB(target, format, type, rowBufSize, row, columnBufSize, column, MemoryUtil.memAddressSafe(span));
    }

    public static void glGetnSeparableFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer row, @NativeType("void *") ByteBuffer column, @NativeType("void *") ByteBuffer span) {
        nglGetnSeparableFilterARB(target, format, type, row.remaining(), MemoryUtil.memAddress(row), column.remaining(), MemoryUtil.memAddress(column), MemoryUtil.memAddressSafe(span));
    }

    public static void glGetnHistogramARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long values) {
        nglGetnHistogramARB(target, reset, format, type, bufSize, values);
    }

    public static void glGetnHistogramARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetnHistogramARB(target, reset, format, type, values.remaining(), MemoryUtil.memAddress(values));
    }

    public static void glGetnMinmaxARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long values) {
        nglGetnMinmaxARB(target, reset, format, type, bufSize, values);
    }

    public static void glGetnMinmaxARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetnMinmaxARB(target, reset, format, type, values.remaining(), MemoryUtil.memAddress(values));
    }

    public static void glGetnCompressedTexImageARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnCompressedTexImageARB(target, level, bufSize, img);
    }

    public static void glGetnCompressedTexImageARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        if (Checks.CHECKS && Checks.DEBUG) {
            Checks.check((Buffer) img, GL11.glGetTexLevelParameteri(target, level, 34464));
        }
        nglGetnCompressedTexImageARB(target, level, img.remaining(), MemoryUtil.memAddress(img));
    }

    public static void glGetnUniformfvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfvARB(program, location, params.remaining(), MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static float glGetnUniformfARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfvARB(program, location, 1, MemoryUtil.memAddress(params));
            float f = params.get(0);
            stack.setPointer(stackPointer);
            return f;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetnUniformivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        nglGetnUniformivARB(program, location, params.remaining(), MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetnUniformiARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformivARB(program, location, 1, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetnUniformuivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        nglGetnUniformuivARB(program, location, params.remaining(), MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetnUniformuiARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformuivARB(program, location, 1, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetnUniformdvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        nglGetnUniformdvARB(program, location, params.remaining(), MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static double glGetnUniformdARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetnUniformdvARB(program, location, 1, MemoryUtil.memAddress(params));
            double d = params.get(0);
            stack.setPointer(stackPointer);
            return d;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetnMapdvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") double[] data) {
        long __functionAddress = GL.getICD().glGetnMapdvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(target, query, data.length, data, __functionAddress);
    }

    public static void glGetnMapfvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetnMapfvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(target, query, data.length, data, __functionAddress);
    }

    public static void glGetnMapivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetnMapivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(target, query, data.length, data, __functionAddress);
    }

    public static void glGetnPixelMapfvARB(@NativeType("GLenum") int map, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetnPixelMapfvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(map, data.length, data, __functionAddress);
    }

    public static void glGetnPixelMapuivARB(@NativeType("GLenum") int map, @NativeType("GLuint *") int[] data) {
        long __functionAddress = GL.getICD().glGetnPixelMapuivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(map, data.length, data, __functionAddress);
    }

    public static void glGetnPixelMapusvARB(@NativeType("GLenum") int map, @NativeType("GLushort *") short[] data) {
        long __functionAddress = GL.getICD().glGetnPixelMapusvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(map, data.length, data, __functionAddress);
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(tex, level, format, type, img.length << 1, img, __functionAddress);
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(tex, level, format, type, img.length << 3, img, __functionAddress);
    }

    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(x, y, width, height, format, type, data.length << 1, data, __functionAddress);
    }

    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(target, format, type, table.length << 1, table, __functionAddress);
    }

    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(target, format, type, table.length << 2, table, __functionAddress);
    }

    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(target, format, type, table.length << 2, table, __functionAddress);
    }

    public static void glGetnUniformfvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetnUniformfvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(program, location, params.length, params, __functionAddress);
    }

    public static void glGetnUniformivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(program, location, params.length, params, __functionAddress);
    }

    public static void glGetnUniformuivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformuivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(program, location, params.length, params, __functionAddress);
    }

    public static void glGetnUniformdvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetnUniformdvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(program, location, params.length, params, __functionAddress);
    }
}
