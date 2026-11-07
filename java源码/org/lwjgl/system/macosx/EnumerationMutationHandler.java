package org.lwjgl.system.macosx;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/EnumerationMutationHandler.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/EnumerationMutationHandler.class */
public abstract class EnumerationMutationHandler extends Callback implements EnumerationMutationHandlerI {
    public static EnumerationMutationHandler create(long functionPointer) {
        EnumerationMutationHandlerI instance = (EnumerationMutationHandlerI) Callback.get(functionPointer);
        if (instance instanceof EnumerationMutationHandler) {
            return (EnumerationMutationHandler) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static EnumerationMutationHandler createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static EnumerationMutationHandler create(EnumerationMutationHandlerI instance) {
        if (instance instanceof EnumerationMutationHandler) {
            return (EnumerationMutationHandler) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected EnumerationMutationHandler() {
        super(DESCRIPTOR);
    }

    EnumerationMutationHandler(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/EnumerationMutationHandler$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/EnumerationMutationHandler$Container.class */
    private static final class Container extends EnumerationMutationHandler {
        private final EnumerationMutationHandlerI delegate;

        Container(long functionPointer, EnumerationMutationHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.system.macosx.EnumerationMutationHandlerI
        public void invoke(long id) {
            this.delegate.invoke(id);
        }
    }
}
