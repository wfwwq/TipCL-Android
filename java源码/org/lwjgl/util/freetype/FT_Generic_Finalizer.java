package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Generic_Finalizer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Generic_Finalizer.class */
public abstract class FT_Generic_Finalizer extends Callback implements FT_Generic_FinalizerI {
    public static FT_Generic_Finalizer create(long functionPointer) {
        FT_Generic_FinalizerI instance = (FT_Generic_FinalizerI) Callback.get(functionPointer);
        if (instance instanceof FT_Generic_Finalizer) {
            return (FT_Generic_Finalizer) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Generic_Finalizer createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Generic_Finalizer create(FT_Generic_FinalizerI instance) {
        if (instance instanceof FT_Generic_Finalizer) {
            return (FT_Generic_Finalizer) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Generic_Finalizer() {
        super(DESCRIPTOR);
    }

    FT_Generic_Finalizer(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Generic_Finalizer$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Generic_Finalizer$Container.class */
    private static final class Container extends FT_Generic_Finalizer {
        private final FT_Generic_FinalizerI delegate;

        Container(long functionPointer, FT_Generic_FinalizerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Generic_FinalizerI
        public void invoke(long object) {
            this.delegate.invoke(object);
        }
    }
}
