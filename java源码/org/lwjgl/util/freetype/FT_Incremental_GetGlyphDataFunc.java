package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphDataFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphDataFunc.class */
public abstract class FT_Incremental_GetGlyphDataFunc extends Callback implements FT_Incremental_GetGlyphDataFuncI {
    public static FT_Incremental_GetGlyphDataFunc create(long functionPointer) {
        FT_Incremental_GetGlyphDataFuncI instance = (FT_Incremental_GetGlyphDataFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Incremental_GetGlyphDataFunc) {
            return (FT_Incremental_GetGlyphDataFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Incremental_GetGlyphDataFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Incremental_GetGlyphDataFunc create(FT_Incremental_GetGlyphDataFuncI instance) {
        if (instance instanceof FT_Incremental_GetGlyphDataFunc) {
            return (FT_Incremental_GetGlyphDataFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Incremental_GetGlyphDataFunc() {
        super(DESCRIPTOR);
    }

    FT_Incremental_GetGlyphDataFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphDataFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphDataFunc$Container.class */
    private static final class Container extends FT_Incremental_GetGlyphDataFunc {
        private final FT_Incremental_GetGlyphDataFuncI delegate;

        Container(long functionPointer, FT_Incremental_GetGlyphDataFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Incremental_GetGlyphDataFuncI
        public int invoke(long incremental, int glyph_index, long adata) {
            return this.delegate.invoke(incremental, glyph_index, adata);
        }
    }
}
