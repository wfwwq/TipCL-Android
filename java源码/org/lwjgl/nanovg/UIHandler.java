package org.lwjgl.nanovg;

import javax.annotation.Nullable;
import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/UIHandler.class */
public abstract class UIHandler extends Callback implements UIHandlerI {
    public static UIHandler create(long functionPointer) {
        UIHandlerI instance = (UIHandlerI) Callback.get(functionPointer);
        if (instance instanceof UIHandler) {
            return (UIHandler) instance;
        }
        return new Container(functionPointer, instance);
    }

    @Nullable
    public static UIHandler createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static UIHandler create(UIHandlerI instance) {
        if (instance instanceof UIHandler) {
            return (UIHandler) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected UIHandler() {
        super(CIF);
    }

    UIHandler(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/UIHandler$Container.class */
    private static final class Container extends UIHandler {
        private final UIHandlerI delegate;

        Container(long functionPointer, UIHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.nanovg.UIHandlerI
        public void invoke(int item, int event) {
            this.delegate.invoke(item, event);
        }
    }
}
