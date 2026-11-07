package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_SetModeFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_SetModeFunc.class */
public abstract class FT_Raster_SetModeFunc extends Callback implements FT_Raster_SetModeFuncI {
    public static FT_Raster_SetModeFunc create(long functionPointer) {
        FT_Raster_SetModeFuncI instance = (FT_Raster_SetModeFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Raster_SetModeFunc) {
            return (FT_Raster_SetModeFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Raster_SetModeFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Raster_SetModeFunc create(FT_Raster_SetModeFuncI instance) {
        if (instance instanceof FT_Raster_SetModeFunc) {
            return (FT_Raster_SetModeFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Raster_SetModeFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_SetModeFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_SetModeFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_SetModeFunc$Container.class */
    private static final class Container extends FT_Raster_SetModeFunc {
        private final FT_Raster_SetModeFuncI delegate;

        Container(long functionPointer, FT_Raster_SetModeFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Raster_SetModeFuncI
        public int invoke(long raster, long mode, long args) {
            return this.delegate.invoke(raster, mode, args);
        }
    }
}
