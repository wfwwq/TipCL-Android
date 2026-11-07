package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_DebugHook_Func.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_DebugHook_Func.class */
public abstract class FT_DebugHook_Func extends Callback implements FT_DebugHook_FuncI {
    public static FT_DebugHook_Func create(long functionPointer) {
        FT_DebugHook_FuncI instance = (FT_DebugHook_FuncI) Callback.get(functionPointer);
        if (instance instanceof FT_DebugHook_Func) {
            return (FT_DebugHook_Func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_DebugHook_Func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_DebugHook_Func create(FT_DebugHook_FuncI instance) {
        if (instance instanceof FT_DebugHook_Func) {
            return (FT_DebugHook_Func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_DebugHook_Func() {
        super(DESCRIPTOR);
    }

    FT_DebugHook_Func(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_DebugHook_Func$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_DebugHook_Func$Container.class */
    private static final class Container extends FT_DebugHook_Func {
        private final FT_DebugHook_FuncI delegate;

        Container(long functionPointer, FT_DebugHook_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_DebugHook_FuncI
        public int invoke(long arg) {
            return this.delegate.invoke(arg);
        }
    }
}
