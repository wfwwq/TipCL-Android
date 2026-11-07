package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirect.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirect.class */
public class NVBindlessMultiDrawIndirect {
    public static native void nglMultiDrawArraysIndirectBindlessNV(int i, long j, int i2, int i3, int i4);

    public static native void nglMultiDrawElementsIndirectBindlessNV(int i, int i2, long j, int i3, int i4, int i5);

    static {
        GL.initialize();
    }

    protected NVBindlessMultiDrawIndirect() {
        throw new UnsupportedOperationException();
    }

    public static void glMultiDrawArraysIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) indirect, drawCount * (stride == 0 ? 16 + (vertexBufferCount * 24) : stride));
        }
        nglMultiDrawArraysIndirectBindlessNV(mode, MemoryUtil.memAddress(indirect), drawCount, stride, vertexBufferCount);
    }

    public static void glMultiDrawArraysIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawArraysIndirectBindlessNV(mode, indirect, drawCount, stride, vertexBufferCount);
    }

    public static void glMultiDrawElementsIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) indirect, drawCount * (stride == 0 ? (vertexBufferCount + 2) * 24 : stride));
        }
        nglMultiDrawElementsIndirectBindlessNV(mode, type, MemoryUtil.memAddress(indirect), drawCount, stride, vertexBufferCount);
    }

    public static void glMultiDrawElementsIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawElementsIndirectBindlessNV(mode, type, indirect, drawCount, stride, vertexBufferCount);
    }
}
