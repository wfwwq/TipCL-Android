package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Constructor.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Constructor.class */
public abstract class FT_Module_Constructor extends Callback implements FT_Module_ConstructorI {
    public static FT_Module_Constructor create(long functionPointer) {
        FT_Module_ConstructorI instance = (FT_Module_ConstructorI) Callback.get(functionPointer);
        if (instance instanceof FT_Module_Constructor) {
            return (FT_Module_Constructor) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Module_Constructor createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Module_Constructor create(FT_Module_ConstructorI instance) {
        if (instance instanceof FT_Module_Constructor) {
            return (FT_Module_Constructor) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Module_Constructor() {
        super(DESCRIPTOR);
    }

    FT_Module_Constructor(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Constructor$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Constructor$Container.class */
    private static final class Container extends FT_Module_Constructor {
        private final FT_Module_ConstructorI delegate;

        Container(long functionPointer, FT_Module_ConstructorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Module_ConstructorI
        public int invoke(long module) {
            return this.delegate.invoke(module);
        }
    }
}
