package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_RenderFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_RenderFunc.class */
public abstract class FT_Raster_RenderFunc extends Callback implements FT_Raster_RenderFuncI {
    public static FT_Raster_RenderFunc create(long functionPointer) {
        FT_Raster_RenderFuncI instance = (FT_Raster_RenderFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Raster_RenderFunc) {
            return (FT_Raster_RenderFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Raster_RenderFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Raster_RenderFunc create(FT_Raster_RenderFuncI instance) {
        if (instance instanceof FT_Raster_RenderFunc) {
            return (FT_Raster_RenderFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Raster_RenderFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_RenderFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_RenderFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_RenderFunc$Container.class */
    private static final class Container extends FT_Raster_RenderFunc {
        private final FT_Raster_RenderFuncI delegate;

        Container(long functionPointer, FT_Raster_RenderFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Raster_RenderFuncI
        public int invoke(long raster, long params) {
            return this.delegate.invoke(raster, params);
        }
    }
}
