package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_MoveToFunc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_MoveToFunc.class */
public abstract class FT_Outline_MoveToFunc extends Callback implements FT_Outline_MoveToFuncI {
    public static FT_Outline_MoveToFunc create(long functionPointer) {
        FT_Outline_MoveToFuncI instance = (FT_Outline_MoveToFuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Outline_MoveToFunc) {
            return (FT_Outline_MoveToFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Outline_MoveToFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Outline_MoveToFunc create(FT_Outline_MoveToFuncI instance) {
        if (instance instanceof FT_Outline_MoveToFunc) {
            return (FT_Outline_MoveToFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Outline_MoveToFunc() {
        super(DESCRIPTOR);
    }

    FT_Outline_MoveToFunc(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_MoveToFunc$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_MoveToFunc$Container.class */
    private static final class Container extends FT_Outline_MoveToFunc {
        private final FT_Outline_MoveToFuncI delegate;

        Container(long functionPointer, FT_Outline_MoveToFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Outline_MoveToFuncI
        public int invoke(long to, long user) {
            return this.delegate.invoke(to, user);
        }
    }
}
