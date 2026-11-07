package org.lwjgl.openal;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTCallbackBufferType.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTCallbackBufferType.class */
public abstract class SOFTCallbackBufferType extends Callback implements SOFTCallbackBufferTypeI {
    public static SOFTCallbackBufferType create(long functionPointer) {
        SOFTCallbackBufferTypeI instance = (SOFTCallbackBufferTypeI) Callback.get(functionPointer);
        if (instance instanceof SOFTCallbackBufferType) {
            return (SOFTCallbackBufferType) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SOFTCallbackBufferType createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SOFTCallbackBufferType create(SOFTCallbackBufferTypeI instance) {
        if (instance instanceof SOFTCallbackBufferType) {
            return (SOFTCallbackBufferType) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SOFTCallbackBufferType() {
        super(DESCRIPTOR);
    }

    SOFTCallbackBufferType(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTCallbackBufferType$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTCallbackBufferType$Container.class */
    private static final class Container extends SOFTCallbackBufferType {
        private final SOFTCallbackBufferTypeI delegate;

        Container(long functionPointer, SOFTCallbackBufferTypeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.openal.SOFTCallbackBufferTypeI
        public int invoke(long userptr, long sampledata, int numbytes) {
            return this.delegate.invoke(userptr, sampledata, numbytes);
        }
    }
}
