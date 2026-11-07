package org.lwjgl.openal;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/EXTThreadLocalContext.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/EXTThreadLocalContext.class */
public class EXTThreadLocalContext {
    protected EXTThreadLocalContext() {
        throw new UnsupportedOperationException();
    }

    @NativeType("ALCboolean")
    public static boolean alcSetThreadContext(@NativeType("ALCcontext *") long context) {
        long __functionAddress = ALC.getICD().alcSetThreadContext;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokePZ(context, __functionAddress);
    }

    @NativeType("ALCcontext *")
    public static long alcGetThreadContext() {
        long __functionAddress = ALC.getICD().alcGetThreadContext;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeP(__functionAddress);
    }
}
