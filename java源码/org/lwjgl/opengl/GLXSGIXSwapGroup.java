package org.lwjgl.opengl;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLXSGIXSwapGroup.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLXSGIXSwapGroup.class */
public class GLXSGIXSwapGroup {
    protected GLXSGIXSwapGroup() {
        throw new UnsupportedOperationException();
    }

    public static void glXJoinSwapGroupSGIX(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLXDrawable") long member) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXJoinSwapGroupSGIX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(display);
            Checks.check(drawable);
        }
        JNI.callPPPV(display, drawable, member, __functionAddress);
    }
}
