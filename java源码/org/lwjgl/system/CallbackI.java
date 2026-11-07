package org.lwjgl.system;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/CallbackI.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/CallbackI.class */
public interface CallbackI extends Pointer {
    Callback.Descriptor getDescriptor();

    void callback(long j, long j2);

    @Override // org.lwjgl.system.Pointer
    default long address() {
        return Upcalls.upcallCreate(getDescriptor(), this);
    }
}
