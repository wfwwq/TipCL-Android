package org.lwjgl.system.windows;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/WindowProc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/WindowProc.class */
public abstract class WindowProc extends Callback implements WindowProcI {
    public static WindowProc create(long functionPointer) {
        WindowProcI instance = (WindowProcI) Callback.get(functionPointer);
        if (instance instanceof WindowProc) {
            return (WindowProc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static WindowProc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static WindowProc create(WindowProcI instance) {
        if (instance instanceof WindowProc) {
            return (WindowProc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected WindowProc() {
        super(DESCRIPTOR);
    }

    WindowProc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/WindowProc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/WindowProc$Container.class */
    private static final class Container extends WindowProc {
        private final WindowProcI delegate;

        Container(long functionPointer, WindowProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.system.windows.WindowProcI
        public long invoke(long hwnd, int uMsg, long wParam, long lParam) {
            return this.delegate.invoke(hwnd, uMsg, wParam, lParam);
        }
    }
}
