package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_FreeGlyphDataFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_FreeGlyphDataFunc.class */
public abstract class FT_Incremental_FreeGlyphDataFunc extends Callback implements FT_Incremental_FreeGlyphDataFuncI {
    public static FT_Incremental_FreeGlyphDataFunc create(long functionPointer) {
        FT_Incremental_FreeGlyphDataFuncI instance = (FT_Incremental_FreeGlyphDataFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Incremental_FreeGlyphDataFunc) {
            return (FT_Incremental_FreeGlyphDataFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Incremental_FreeGlyphDataFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Incremental_FreeGlyphDataFunc create(FT_Incremental_FreeGlyphDataFuncI instance) {
        if (instance instanceof FT_Incremental_FreeGlyphDataFunc) {
            return (FT_Incremental_FreeGlyphDataFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Incremental_FreeGlyphDataFunc() {
        super(DESCRIPTOR);
    }

    FT_Incremental_FreeGlyphDataFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_FreeGlyphDataFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_FreeGlyphDataFunc$Container.class */
    private static final class Container extends FT_Incremental_FreeGlyphDataFunc {
        private final FT_Incremental_FreeGlyphDataFuncI delegate;

        Container(long functionPointer, FT_Incremental_FreeGlyphDataFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Incremental_FreeGlyphDataFuncI
        public void invoke(long incremental, long data) {
            this.delegate.invoke(incremental, data);
        }
    }
}
