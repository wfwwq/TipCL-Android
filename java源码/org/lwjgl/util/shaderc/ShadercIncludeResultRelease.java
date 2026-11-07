package org.lwjgl.util.shaderc;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResultRelease.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResultRelease.class */
public abstract class ShadercIncludeResultRelease extends Callback implements ShadercIncludeResultReleaseI {
    public static ShadercIncludeResultRelease create(long functionPointer) {
        ShadercIncludeResultReleaseI instance = (ShadercIncludeResultReleaseI) Callback.get(functionPointer);
        if (instance instanceof ShadercIncludeResultRelease) {
            return (ShadercIncludeResultRelease) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static ShadercIncludeResultRelease createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static ShadercIncludeResultRelease create(ShadercIncludeResultReleaseI instance) {
        if (instance instanceof ShadercIncludeResultRelease) {
            return (ShadercIncludeResultRelease) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected ShadercIncludeResultRelease() {
        super(DESCRIPTOR);
    }

    ShadercIncludeResultRelease(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResultRelease$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResultRelease$Container.class */
    private static final class Container extends ShadercIncludeResultRelease {
        private final ShadercIncludeResultReleaseI delegate;

        Container(long functionPointer, ShadercIncludeResultReleaseI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.shaderc.ShadercIncludeResultReleaseI
        public void invoke(long user_data, long include_result) {
            this.delegate.invoke(user_data, include_result);
        }
    }
}
