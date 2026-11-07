package org.lwjgl.util.shaderc;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResolve.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResolve.class */
public abstract class ShadercIncludeResolve extends Callback implements ShadercIncludeResolveI {
    public static ShadercIncludeResolve create(long functionPointer) {
        ShadercIncludeResolveI instance = (ShadercIncludeResolveI) Callback.get(functionPointer);
        if (instance instanceof ShadercIncludeResolve) {
            return (ShadercIncludeResolve) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static ShadercIncludeResolve createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static ShadercIncludeResolve create(ShadercIncludeResolveI instance) {
        if (instance instanceof ShadercIncludeResolve) {
            return (ShadercIncludeResolve) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected ShadercIncludeResolve() {
        super(DESCRIPTOR);
    }

    ShadercIncludeResolve(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResolve$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResolve$Container.class */
    private static final class Container extends ShadercIncludeResolve {
        private final ShadercIncludeResolveI delegate;

        Container(long functionPointer, ShadercIncludeResolveI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.shaderc.ShadercIncludeResolveI
        public long invoke(long user_data, long requested_source, int type, long requesting_source, long include_depth) {
            return this.delegate.invoke(user_data, requested_source, type, requesting_source, include_depth);
        }
    }
}
