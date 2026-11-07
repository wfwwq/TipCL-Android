package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_ResetFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_ResetFunc.class */
public abstract class FT_Raster_ResetFunc extends Callback implements FT_Raster_ResetFuncI {
    public static FT_Raster_ResetFunc create(long functionPointer) {
        FT_Raster_ResetFuncI instance = (FT_Raster_ResetFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Raster_ResetFunc) {
            return (FT_Raster_ResetFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Raster_ResetFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Raster_ResetFunc create(FT_Raster_ResetFuncI instance) {
        if (instance instanceof FT_Raster_ResetFunc) {
            return (FT_Raster_ResetFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Raster_ResetFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_ResetFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_ResetFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_ResetFunc$Container.class */
    private static final class Container extends FT_Raster_ResetFunc {
        private final FT_Raster_ResetFuncI delegate;

        Container(long functionPointer, FT_Raster_ResetFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Raster_ResetFuncI
        public void invoke(long raster, long pool_base, long pool_size) {
            this.delegate.invoke(raster, pool_base, pool_size);
        }
    }
}
