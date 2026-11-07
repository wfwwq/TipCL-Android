package org.lwjgl.system.macosx;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/CGEventTapCallBack.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/CGEventTapCallBack.class */
public abstract class CGEventTapCallBack extends Callback implements CGEventTapCallBackI {
    public static CGEventTapCallBack create(long functionPointer) {
        CGEventTapCallBackI instance = (CGEventTapCallBackI) Callback.get(functionPointer);
        if (instance instanceof CGEventTapCallBack) {
            return (CGEventTapCallBack) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static CGEventTapCallBack createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static CGEventTapCallBack create(CGEventTapCallBackI instance) {
        if (instance instanceof CGEventTapCallBack) {
            return (CGEventTapCallBack) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected CGEventTapCallBack() {
        super(DESCRIPTOR);
    }

    CGEventTapCallBack(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/CGEventTapCallBack$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/CGEventTapCallBack$Container.class */
    private static final class Container extends CGEventTapCallBack {
        private final CGEventTapCallBackI delegate;

        Container(long functionPointer, CGEventTapCallBackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.system.macosx.CGEventTapCallBackI
        public long invoke(long proxy, int type, long event, long userInfo) {
            return this.delegate.invoke(proxy, type, event, userInfo);
        }
    }
}
