package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Free_Func.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Free_Func.class */
public abstract class FT_Free_Func extends Callback implements FT_Free_FuncI {
    public static FT_Free_Func create(long functionPointer) {
        FT_Free_FuncI instance = (FT_Free_FuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Free_Func) {
            return (FT_Free_Func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Free_Func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Free_Func create(FT_Free_FuncI instance) {
        if (instance instanceof FT_Free_Func) {
            return (FT_Free_Func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Free_Func() {
        super(DESCRIPTOR);
    }

    FT_Free_Func(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Free_Func$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Free_Func$Container.class */
    private static final class Container extends FT_Free_Func {
        private final FT_Free_FuncI delegate;

        Container(long functionPointer, FT_Free_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Free_FuncI
        public void invoke(long memory, long block) {
            this.delegate.invoke(memory, block);
        }
    }
}
