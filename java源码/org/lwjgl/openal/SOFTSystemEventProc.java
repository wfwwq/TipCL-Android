package org.lwjgl.openal;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTSystemEventProc.class */
public abstract class SOFTSystemEventProc extends Callback implements SOFTSystemEventProcI {
    public static SOFTSystemEventProc create(long functionPointer) {
        SOFTSystemEventProcI instance = (SOFTSystemEventProcI) Callback.get(functionPointer);
        if (instance instanceof SOFTSystemEventProc) {
            return (SOFTSystemEventProc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SOFTSystemEventProc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SOFTSystemEventProc create(SOFTSystemEventProcI instance) {
        if (instance instanceof SOFTSystemEventProc) {
            return (SOFTSystemEventProc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SOFTSystemEventProc() {
        super(DESCRIPTOR);
    }

    SOFTSystemEventProc(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTSystemEventProc$Container.class */
    private static final class Container extends SOFTSystemEventProc {
        private final SOFTSystemEventProcI delegate;

        Container(long functionPointer, SOFTSystemEventProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.openal.SOFTSystemEventProcI
        public void invoke(int eventType, int deviceType, long device, int length, long message, long userParam) {
            this.delegate.invoke(eventType, deviceType, device, length, message, userParam);
        }
    }
}
