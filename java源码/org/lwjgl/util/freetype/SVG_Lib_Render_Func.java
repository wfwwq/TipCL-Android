package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/SVG_Lib_Render_Func.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/SVG_Lib_Render_Func.class */
public abstract class SVG_Lib_Render_Func extends Callback implements SVG_Lib_Render_FuncI {
    public static SVG_Lib_Render_Func create(long functionPointer) {
        SVG_Lib_Render_FuncI instance = (SVG_Lib_Render_FuncI) Callback.get(functionPointer);
        if (instance instanceof SVG_Lib_Render_Func) {
            return (SVG_Lib_Render_Func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SVG_Lib_Render_Func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SVG_Lib_Render_Func create(SVG_Lib_Render_FuncI instance) {
        if (instance instanceof SVG_Lib_Render_Func) {
            return (SVG_Lib_Render_Func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SVG_Lib_Render_Func() {
        super(DESCRIPTOR);
    }

    SVG_Lib_Render_Func(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/SVG_Lib_Render_Func$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/SVG_Lib_Render_Func$Container.class */
    private static final class Container extends SVG_Lib_Render_Func {
        private final SVG_Lib_Render_FuncI delegate;

        Container(long functionPointer, SVG_Lib_Render_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.SVG_Lib_Render_FuncI
        public int invoke(long slot, long data_pointer) {
            return this.delegate.invoke(slot, data_pointer);
        }
    }
}
