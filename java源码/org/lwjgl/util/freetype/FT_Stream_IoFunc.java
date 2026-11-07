package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream_IoFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream_IoFunc.class */
public abstract class FT_Stream_IoFunc extends Callback implements FT_Stream_IoFuncI {
    public static FT_Stream_IoFunc create(long functionPointer) {
        FT_Stream_IoFuncI instance = (FT_Stream_IoFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Stream_IoFunc) {
            return (FT_Stream_IoFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Stream_IoFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Stream_IoFunc create(FT_Stream_IoFuncI instance) {
        if (instance instanceof FT_Stream_IoFunc) {
            return (FT_Stream_IoFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Stream_IoFunc() {
        super(DESCRIPTOR);
    }

    FT_Stream_IoFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream_IoFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream_IoFunc$Container.class */
    private static final class Container extends FT_Stream_IoFunc {
        private final FT_Stream_IoFuncI delegate;

        Container(long functionPointer, FT_Stream_IoFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Stream_IoFuncI
        public long invoke(long stream, long offset, long buffer, long count) {
            return this.delegate.invoke(stream, offset, buffer, count);
        }
    }
}
