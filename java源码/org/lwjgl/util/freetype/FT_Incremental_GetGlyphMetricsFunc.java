package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphMetricsFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphMetricsFunc.class */
public abstract class FT_Incremental_GetGlyphMetricsFunc extends Callback implements FT_Incremental_GetGlyphMetricsFuncI {
    public static FT_Incremental_GetGlyphMetricsFunc create(long functionPointer) {
        FT_Incremental_GetGlyphMetricsFuncI instance = (FT_Incremental_GetGlyphMetricsFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Incremental_GetGlyphMetricsFunc) {
            return (FT_Incremental_GetGlyphMetricsFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Incremental_GetGlyphMetricsFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Incremental_GetGlyphMetricsFunc create(FT_Incremental_GetGlyphMetricsFuncI instance) {
        if (instance instanceof FT_Incremental_GetGlyphMetricsFunc) {
            return (FT_Incremental_GetGlyphMetricsFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Incremental_GetGlyphMetricsFunc() {
        super(DESCRIPTOR);
    }

    FT_Incremental_GetGlyphMetricsFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphMetricsFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphMetricsFunc$Container.class */
    private static final class Container extends FT_Incremental_GetGlyphMetricsFunc {
        private final FT_Incremental_GetGlyphMetricsFuncI delegate;

        Container(long functionPointer, FT_Incremental_GetGlyphMetricsFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Incremental_GetGlyphMetricsFuncI
        public int invoke(long incremental, int glyph_index, boolean vertical, long ametrics) {
            return this.delegate.invoke(incremental, glyph_index, vertical, ametrics);
        }
    }
}
