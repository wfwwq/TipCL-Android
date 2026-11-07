package org.lwjgl.util.spvc;

import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcErrorCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcErrorCallback.class */
public abstract class SpvcErrorCallback extends Callback implements SpvcErrorCallbackI {
    public static SpvcErrorCallback create(long functionPointer) {
        SpvcErrorCallbackI instance = (SpvcErrorCallbackI) Callback.get(functionPointer);
        if (instance instanceof SpvcErrorCallback) {
            return (SpvcErrorCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SpvcErrorCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SpvcErrorCallback create(SpvcErrorCallbackI instance) {
        if (instance instanceof SpvcErrorCallback) {
            return (SpvcErrorCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SpvcErrorCallback() {
        super(DESCRIPTOR);
    }

    SpvcErrorCallback(long functionPointer) {
        super(functionPointer);
    }

    public static String getError(long error) {
        return MemoryUtil.memUTF8(error);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcErrorCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcErrorCallback$Container.class */
    private static final class Container extends SpvcErrorCallback {
        private final SpvcErrorCallbackI delegate;

        Container(long functionPointer, SpvcErrorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.spvc.SpvcErrorCallbackI
        public void invoke(long userdata, long error) {
            this.delegate.invoke(userdata, error);
        }
    }
}
