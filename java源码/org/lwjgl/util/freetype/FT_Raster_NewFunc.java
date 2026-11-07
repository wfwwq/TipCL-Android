package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_NewFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_NewFunc.class */
public abstract class FT_Raster_NewFunc extends Callback implements FT_Raster_NewFuncI {
    public static FT_Raster_NewFunc create(long functionPointer) {
        FT_Raster_NewFuncI instance = (FT_Raster_NewFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Raster_NewFunc) {
            return (FT_Raster_NewFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Raster_NewFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Raster_NewFunc create(FT_Raster_NewFuncI instance) {
        if (instance instanceof FT_Raster_NewFunc) {
            return (FT_Raster_NewFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Raster_NewFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_NewFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_NewFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_NewFunc$Container.class */
    private static final class Container extends FT_Raster_NewFunc {
        private final FT_Raster_NewFuncI delegate;

        Container(long functionPointer, FT_Raster_NewFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Raster_NewFuncI
        public int invoke(long memory, long raster) {
            return this.delegate.invoke(memory, raster);
        }
    }
}
