package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirectCount.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirectCount.class */
public class NVBindlessMultiDrawIndirectCount {
    public static native void nglMultiDrawArraysIndirectBindlessCountNV(int i, long j, long j2, int i2, int i3, int i4);

    public static native void nglMultiDrawElementsIndirectBindlessCountNV(int i, int i2, long j, long j2, int i3, int i4, int i5);

    static {
        GL.initialize();
    }

    protected NVBindlessMultiDrawIndirectCount() {
        throw new UnsupportedOperationException();
    }

    public static void glMultiDrawArraysIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) indirect, maxDrawCount * (stride == 0 ? 16 + (vertexBufferCount * 24) : stride));
        }
        nglMultiDrawArraysIndirectBindlessCountNV(mode, MemoryUtil.memAddress(indirect), drawCount, maxDrawCount, stride, vertexBufferCount);
    }

    public static void glMultiDrawArraysIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawArraysIndirectBindlessCountNV(mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
    }

    public static void glMultiDrawElementsIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) indirect, maxDrawCount * (stride == 0 ? (vertexBufferCount + 2) * 24 : stride));
        }
        nglMultiDrawElementsIndirectBindlessCountNV(mode, type, MemoryUtil.memAddress(indirect), drawCount, maxDrawCount, stride, vertexBufferCount);
    }

    public static void glMultiDrawElementsIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawElementsIndirectBindlessCountNV(mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
    }
}
