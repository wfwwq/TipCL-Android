package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc.class */
public abstract class FT_Outline_LineToFunc extends Callback implements FT_Outline_LineToFuncI {
    public static FT_Outline_LineToFunc create(long functionPointer) {
        FT_Outline_LineToFuncI instance = (FT_Outline_LineToFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Outline_LineToFunc) {
            return (FT_Outline_LineToFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Outline_LineToFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Outline_LineToFunc create(FT_Outline_LineToFuncI instance) {
        if (instance instanceof FT_Outline_LineToFunc) {
            return (FT_Outline_LineToFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Outline_LineToFunc() {
        super(DESCRIPTOR);
    }

    FT_Outline_LineToFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc$Container.class */
    private static final class Container extends FT_Outline_LineToFunc {
        private final FT_Outline_LineToFuncI delegate;

        Container(long functionPointer, FT_Outline_LineToFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Outline_LineToFuncI
        public int invoke(long to, long user) {
            return this.delegate.invoke(to, user);
        }
    }
}
