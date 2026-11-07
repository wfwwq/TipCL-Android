package org.lwjgl.opengl;

import org.lwjgl.system.Checks;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTMemoryObjectWin32.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTMemoryObjectWin32.class */
public class EXTMemoryObjectWin32 {
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 38279;
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 38280;
    public static final int GL_DEVICE_LUID_EXT = 38297;
    public static final int GL_DEVICE_NODE_MASK_EXT = 38298;
    public static final int GL_LUID_SIZE_EXT = 8;
    public static final int GL_HANDLE_TYPE_D3D12_TILEPOOL_EXT = 38281;
    public static final int GL_HANDLE_TYPE_D3D12_RESOURCE_EXT = 38282;
    public static final int GL_HANDLE_TYPE_D3D11_IMAGE_EXT = 38283;
    public static final int GL_HANDLE_TYPE_D3D11_IMAGE_KMT_EXT = 38284;

    public static native void nglImportMemoryWin32HandleEXT(int i, long j, int i2, long j2);

    public static native void nglImportMemoryWin32NameEXT(int i, long j, int i2, long j2);

    static {
        GL.initialize();
    }

    protected EXTMemoryObjectWin32() {
        throw new UnsupportedOperationException();
    }

    public static void glImportMemoryWin32HandleEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("void *") long handle) {
        if (Checks.CHECKS) {
            Checks.check(handle);
        }
        nglImportMemoryWin32HandleEXT(memory, size, handleType, handle);
    }

    public static void glImportMemoryWin32NameEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("void const *") long name) {
        if (Checks.CHECKS) {
            Checks.check(name);
        }
        nglImportMemoryWin32NameEXT(memory, size, handleType, name);
    }
}
