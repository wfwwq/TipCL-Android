package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBDrawInstanced.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBDrawInstanced.class */
public class ARBDrawInstanced {
    public static native void glDrawArraysInstancedARB(@NativeType("GLenum") int i, @NativeType("GLint") int i2, @NativeType("GLsizei") int i3, @NativeType("GLsizei") int i4);

    public static native void nglDrawElementsInstancedARB(int i, int i2, int i3, long j, int i4);

    static {
        GL.initialize();
    }

    protected ARBDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, count, type, indices, primcount);
    }

    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, MemoryUtil.memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, indices.remaining(), 5121, MemoryUtil.memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, indices.remaining(), 5123, MemoryUtil.memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, indices.remaining(), 5125, MemoryUtil.memAddress(indices), primcount);
    }
}
