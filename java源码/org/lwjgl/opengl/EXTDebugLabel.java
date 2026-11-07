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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTDebugLabel.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTDebugLabel.class */
public class EXTDebugLabel {
    public static final int GL_BUFFER_OBJECT_EXT = 37201;
    public static final int GL_SHADER_OBJECT_EXT = 35656;
    public static final int GL_PROGRAM_OBJECT_EXT = 35648;
    public static final int GL_VERTEX_ARRAY_OBJECT_EXT = 37204;
    public static final int GL_QUERY_OBJECT_EXT = 37203;
    public static final int GL_PROGRAM_PIPELINE_OBJECT_EXT = 35407;

    public static native void nglLabelObjectEXT(int i, int i2, int i3, long j);

    public static native void nglGetObjectLabelEXT(int i, int i2, int i3, long j, long j2);

    static {
        GL.initialize();
    }

    protected EXTDebugLabel() {
        throw new UnsupportedOperationException();
    }

    public static void glLabelObjectEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLchar const *") ByteBuffer label) {
        nglLabelObjectEXT(type, object, label.remaining(), MemoryUtil.memAddress(label));
    }

    public static void glLabelObjectEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLchar const *") CharSequence label) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nglLabelObjectEXT(type, object, labelEncodedLength, labelEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetObjectLabelEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) length, 1);
        }
        nglGetObjectLabelEXT(type, object, label.remaining(), MemoryUtil.memAddress(length), MemoryUtil.memAddress(label));
    }

    @NativeType("void")
    public static String glGetObjectLabelEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer label = stack.malloc(bufSize);
            nglGetObjectLabelEXT(type, object, bufSize, MemoryUtil.memAddress(length), MemoryUtil.memAddress(label));
            String strMemUTF8 = MemoryUtil.memUTF8(label, length.get(0));
            stack.setPointer(stackPointer);
            return strMemUTF8;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetObjectLabelEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer label) {
        long __functionAddress = GL.getICD().glGetObjectLabelEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(length, 1);
        }
        JNI.callPPV(type, object, label.remaining(), length, MemoryUtil.memAddress(label), __functionAddress);
    }
}
