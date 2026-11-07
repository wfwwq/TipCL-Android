package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Realloc_Func.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Realloc_Func.class */
public abstract class FT_Realloc_Func extends Callback implements FT_Realloc_FuncI {
    public static FT_Realloc_Func create(long functionPointer) {
        FT_Realloc_FuncI instance = (FT_Realloc_FuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Realloc_Func) {
            return (FT_Realloc_Func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Realloc_Func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Realloc_Func create(FT_Realloc_FuncI instance) {
        if (instance instanceof FT_Realloc_Func) {
            return (FT_Realloc_Func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Realloc_Func() {
        super(DESCRIPTOR);
    }

    FT_Realloc_Func(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Realloc_Func$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Realloc_Func$Container.class */
    private static final class Container extends FT_Realloc_Func {
        private final FT_Realloc_FuncI delegate;

        Container(long functionPointer, FT_Realloc_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Realloc_FuncI
        public long invoke(long memory, long cur_size, long new_size, long block) {
            return this.delegate.invoke(memory, cur_size, new_size, block);
        }
    }
}
