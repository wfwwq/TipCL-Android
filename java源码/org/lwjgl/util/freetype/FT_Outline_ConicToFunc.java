package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_ConicToFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_ConicToFunc.class */
public abstract class FT_Outline_ConicToFunc extends Callback implements FT_Outline_ConicToFuncI {
    public static FT_Outline_ConicToFunc create(long functionPointer) {
        FT_Outline_ConicToFuncI instance = (FT_Outline_ConicToFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Outline_ConicToFunc) {
            return (FT_Outline_ConicToFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Outline_ConicToFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Outline_ConicToFunc create(FT_Outline_ConicToFuncI instance) {
        if (instance instanceof FT_Outline_ConicToFunc) {
            return (FT_Outline_ConicToFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Outline_ConicToFunc() {
        super(DESCRIPTOR);
    }

    FT_Outline_ConicToFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_ConicToFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_ConicToFunc$Container.class */
    private static final class Container extends FT_Outline_ConicToFunc {
        private final FT_Outline_ConicToFuncI delegate;

        Container(long functionPointer, FT_Outline_ConicToFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Outline_ConicToFuncI
        public int invoke(long control, long to, long user) {
            return this.delegate.invoke(control, to, user);
        }
    }
}
