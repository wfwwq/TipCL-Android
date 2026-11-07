package org.lwjgl.openal;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTEventProc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTEventProc.class */
public abstract class SOFTEventProc extends Callback implements SOFTEventProcI {
    public static SOFTEventProc create(long functionPointer) {
        SOFTEventProcI instance = (SOFTEventProcI) Callback.get(functionPointer);
        if (instance instanceof SOFTEventProc) {
            return (SOFTEventProc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SOFTEventProc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SOFTEventProc create(SOFTEventProcI instance) {
        if (instance instanceof SOFTEventProc) {
            return (SOFTEventProc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SOFTEventProc() {
        super(DESCRIPTOR);
    }

    SOFTEventProc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTEventProc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTEventProc$Container.class */
    private static final class Container extends SOFTEventProc {
        private final SOFTEventProcI delegate;

        Container(long functionPointer, SOFTEventProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.openal.SOFTEventProcI
        public void invoke(int eventType, int object, int param, int length, long message, long userParam) {
            this.delegate.invoke(eventType, object, param, length, message, userParam);
        }
    }
}
