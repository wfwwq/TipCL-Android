package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_DoneFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_DoneFunc.class */
public abstract class FT_Raster_DoneFunc extends Callback implements FT_Raster_DoneFuncI {
    public static FT_Raster_DoneFunc create(long functionPointer) {
        FT_Raster_DoneFuncI instance = (FT_Raster_DoneFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Raster_DoneFunc) {
            return (FT_Raster_DoneFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Raster_DoneFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Raster_DoneFunc create(FT_Raster_DoneFuncI instance) {
        if (instance instanceof FT_Raster_DoneFunc) {
            return (FT_Raster_DoneFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Raster_DoneFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_DoneFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_DoneFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_DoneFunc$Container.class */
    private static final class Container extends FT_Raster_DoneFunc {
        private final FT_Raster_DoneFuncI delegate;

        Container(long functionPointer, FT_Raster_DoneFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Raster_DoneFuncI
        public void invoke(long raster) {
            this.delegate.invoke(raster);
        }
    }
}
