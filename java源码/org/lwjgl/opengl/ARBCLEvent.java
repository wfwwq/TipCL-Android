package org.lwjgl.opengl;

import org.lwjgl.system.Checks;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBCLEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBCLEvent.class */
public class ARBCLEvent {
    public static final int GL_SYNC_CL_EVENT_ARB = 33344;
    public static final int GL_SYNC_CL_EVENT_COMPLETE_ARB = 33345;

    public static native long nglCreateSyncFromCLeventARB(long j, long j2, int i);

    static {
        GL.initialize();
    }

    protected ARBCLEvent() {
        throw new UnsupportedOperationException();
    }

    @NativeType("GLsync")
    public static long glCreateSyncFromCLeventARB(@NativeType("cl_context") long context, @NativeType("cl_event") long event, @NativeType("GLbitfield") int flags) {
        if (Checks.CHECKS) {
            Checks.check(context);
            Checks.check(event);
        }
        return nglCreateSyncFromCLeventARB(context, event, flags);
    }
}
