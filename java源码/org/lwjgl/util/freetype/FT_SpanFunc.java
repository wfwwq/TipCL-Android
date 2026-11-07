package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SpanFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SpanFunc.class */
public abstract class FT_SpanFunc extends Callback implements FT_SpanFuncI {
    public static FT_SpanFunc create(long functionPointer) {
        FT_SpanFuncI instance = (FT_SpanFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_SpanFunc) {
            return (FT_SpanFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_SpanFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_SpanFunc create(FT_SpanFuncI instance) {
        if (instance instanceof FT_SpanFunc) {
            return (FT_SpanFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_SpanFunc() {
        super(DESCRIPTOR);
    }

    FT_SpanFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SpanFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SpanFunc$Container.class */
    private static final class Container extends FT_SpanFunc {
        private final FT_SpanFuncI delegate;

        Container(long functionPointer, FT_SpanFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_SpanFuncI
        public void invoke(int y, int count, long spans, long user) {
            this.delegate.invoke(y, count, spans, user);
        }
    }
}
