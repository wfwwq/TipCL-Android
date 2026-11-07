package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLXARBGetProcAddress.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLXARBGetProcAddress.class */
public class GLXARBGetProcAddress {
    protected GLXARBGetProcAddress() {
        throw new UnsupportedOperationException();
    }

    public static long nglXGetProcAddressARB(long procName) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetProcAddressARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPP(procName, __functionAddress);
    }

    @NativeType("void *")
    public static long glXGetProcAddressARB(@NativeType("GLchar const *") ByteBuffer procName) {
        if (Checks.CHECKS) {
            Checks.checkNT1(procName);
        }
        return nglXGetProcAddressARB(MemoryUtil.memAddress(procName));
    }

    @NativeType("void *")
    public static long glXGetProcAddressARB(@NativeType("GLchar const *") CharSequence procName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(procName, true);
            long procNameEncoded = stack.getPointerAddress();
            long jNglXGetProcAddressARB = nglXGetProcAddressARB(procNameEncoded);
            stack.setPointer(stackPointer);
            return jNglXGetProcAddressARB;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
