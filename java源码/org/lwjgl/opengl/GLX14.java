package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLX14.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLX14.class */
public class GLX14 extends GLX13 {
    public static final int GLX_SAMPLE_BUFFERS = 100000;
    public static final int GLX_SAMPLES = 100001;

    protected GLX14() {
        throw new UnsupportedOperationException();
    }

    public static long nglXGetProcAddress(long procName) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetProcAddress;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPP(procName, __functionAddress);
    }

    @NativeType("void *")
    public static long glXGetProcAddress(@NativeType("GLchar const *") ByteBuffer procName) {
        if (Checks.CHECKS) {
            Checks.checkNT1(procName);
        }
        return nglXGetProcAddress(MemoryUtil.memAddress(procName));
    }

    @NativeType("void *")
    public static long glXGetProcAddress(@NativeType("GLchar const *") CharSequence procName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(procName, true);
            long procNameEncoded = stack.getPointerAddress();
            long jNglXGetProcAddress = nglXGetProcAddress(procNameEncoded);
            stack.setPointer(stackPointer);
            return jNglXGetProcAddress;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
