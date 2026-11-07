package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream_CloseFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream_CloseFunc.class */
public abstract class FT_Stream_CloseFunc extends Callback implements FT_Stream_CloseFuncI {
    public static FT_Stream_CloseFunc create(long functionPointer) {
        FT_Stream_CloseFuncI instance = (FT_Stream_CloseFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Stream_CloseFunc) {
            return (FT_Stream_CloseFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Stream_CloseFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Stream_CloseFunc create(FT_Stream_CloseFuncI instance) {
        if (instance instanceof FT_Stream_CloseFunc) {
            return (FT_Stream_CloseFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Stream_CloseFunc() {
        super(DESCRIPTOR);
    }

    FT_Stream_CloseFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream_CloseFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream_CloseFunc$Container.class */
    private static final class Container extends FT_Stream_CloseFunc {
        private final FT_Stream_CloseFuncI delegate;

        Container(long functionPointer, FT_Stream_CloseFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Stream_CloseFuncI
        public void invoke(long stream) {
            this.delegate.invoke(stream);
        }
    }
}
