package org.lwjgl.openal;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/EXTDebugProc.class */
public abstract class EXTDebugProc extends Callback implements EXTDebugProcI {
    public static EXTDebugProc create(long functionPointer) {
        EXTDebugProcI instance = (EXTDebugProcI) Callback.get(functionPointer);
        if (instance instanceof EXTDebugProc) {
            return (EXTDebugProc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static EXTDebugProc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static EXTDebugProc create(EXTDebugProcI instance) {
        if (instance instanceof EXTDebugProc) {
            return (EXTDebugProc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected EXTDebugProc() {
        super(DESCRIPTOR);
    }

    EXTDebugProc(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/EXTDebugProc$Container.class */
    private static final class Container extends EXTDebugProc {
        private final EXTDebugProcI delegate;

        Container(long functionPointer, EXTDebugProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.openal.EXTDebugProcI
        public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
            this.delegate.invoke(source, type, id, severity, length, message, userParam);
        }
    }
}
