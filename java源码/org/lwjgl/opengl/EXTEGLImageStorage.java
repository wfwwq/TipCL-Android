package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTEGLImageStorage.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTEGLImageStorage.class */
public class EXTEGLImageStorage {
    public static native void nglEGLImageTargetTexStorageEXT(int i, long j, long j2);

    public static native void nglEGLImageTargetTextureStorageEXT(int i, long j, long j2);

    static {
        GL.initialize();
    }

    protected EXTEGLImageStorage() {
        throw new UnsupportedOperationException();
    }

    public static void glEGLImageTargetTexStorageEXT(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image, @NativeType("int const *") IntBuffer attrib_list) {
        if (Checks.CHECKS) {
            Checks.check(image);
            Checks.checkNTSafe(attrib_list);
        }
        nglEGLImageTargetTexStorageEXT(target, image, MemoryUtil.memAddressSafe(attrib_list));
    }

    public static void glEGLImageTargetTextureStorageEXT(@NativeType("GLuint") int texture, @NativeType("GLeglImageOES") long image, @NativeType("int const *") IntBuffer attrib_list) {
        if (Checks.CHECKS) {
            Checks.check(image);
            Checks.checkNTSafe(attrib_list);
        }
        nglEGLImageTargetTextureStorageEXT(texture, image, MemoryUtil.memAddressSafe(attrib_list));
    }

    public static void glEGLImageTargetTexStorageEXT(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image, @NativeType("int const *") int[] attrib_list) {
        long __functionAddress = GL.getICD().glEGLImageTargetTexStorageEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(image);
            Checks.checkNTSafe(attrib_list);
        }
        JNI.callPPV(target, image, attrib_list, __functionAddress);
    }

    public static void glEGLImageTargetTextureStorageEXT(@NativeType("GLuint") int texture, @NativeType("GLeglImageOES") long image, @NativeType("int const *") int[] attrib_list) {
        long __functionAddress = GL.getICD().glEGLImageTargetTextureStorageEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(image);
            Checks.checkNTSafe(attrib_list);
        }
        JNI.callPPV(texture, image, attrib_list, __functionAddress);
    }
}
