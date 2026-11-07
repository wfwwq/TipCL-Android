package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_CubicToFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_CubicToFunc.class */
public abstract class FT_Outline_CubicToFunc extends Callback implements FT_Outline_CubicToFuncI {
    public static FT_Outline_CubicToFunc create(long functionPointer) {
        FT_Outline_CubicToFuncI instance = (FT_Outline_CubicToFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Outline_CubicToFunc) {
            return (FT_Outline_CubicToFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Outline_CubicToFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Outline_CubicToFunc create(FT_Outline_CubicToFuncI instance) {
        if (instance instanceof FT_Outline_CubicToFunc) {
            return (FT_Outline_CubicToFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Outline_CubicToFunc() {
        super(DESCRIPTOR);
    }

    FT_Outline_CubicToFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_CubicToFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_CubicToFunc$Container.class */
    private static final class Container extends FT_Outline_CubicToFunc {
        private final FT_Outline_CubicToFuncI delegate;

        Container(long functionPointer, FT_Outline_CubicToFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Outline_CubicToFuncI
        public int invoke(long control1, long control2, long to, long user) {
            return this.delegate.invoke(control1, control2, to, user);
        }
    }
}
