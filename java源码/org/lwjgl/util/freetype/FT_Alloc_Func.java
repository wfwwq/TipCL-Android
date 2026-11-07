package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Alloc_Func.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Alloc_Func.class */
public abstract class FT_Alloc_Func extends Callback implements FT_Alloc_FuncI {
    public static FT_Alloc_Func create(long functionPointer) {
        FT_Alloc_FuncI instance = (FT_Alloc_FuncI) Callback.get(functionPointer);
        if (instance instanceof FT_Alloc_Func) {
            return (FT_Alloc_Func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Alloc_Func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Alloc_Func create(FT_Alloc_FuncI instance) {
        if (instance instanceof FT_Alloc_Func) {
            return (FT_Alloc_Func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Alloc_Func() {
        super(DESCRIPTOR);
    }

    FT_Alloc_Func(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Alloc_Func$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Alloc_Func$Container.class */
    private static final class Container extends FT_Alloc_Func {
        private final FT_Alloc_FuncI delegate;

        Container(long functionPointer, FT_Alloc_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Alloc_FuncI
        public long invoke(long memory, long size) {
            return this.delegate.invoke(memory, size);
        }
    }
}
