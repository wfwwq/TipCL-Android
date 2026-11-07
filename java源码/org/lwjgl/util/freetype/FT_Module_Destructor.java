package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Destructor.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Destructor.class */
public abstract class FT_Module_Destructor extends Callback implements FT_Module_DestructorI {
    public static FT_Module_Destructor create(long functionPointer) {
        FT_Module_DestructorI instance = (FT_Module_DestructorI) Callback.get(functionPointer);
        if (instance instanceof FT_Module_Destructor) {
            return (FT_Module_Destructor) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Module_Destructor createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Module_Destructor create(FT_Module_DestructorI instance) {
        if (instance instanceof FT_Module_Destructor) {
            return (FT_Module_Destructor) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Module_Destructor() {
        super(DESCRIPTOR);
    }

    FT_Module_Destructor(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Destructor$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Destructor$Container.class */
    private static final class Container extends FT_Module_Destructor {
        private final FT_Module_DestructorI delegate;

        Container(long functionPointer, FT_Module_DestructorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Module_DestructorI
        public void invoke(long module) {
            this.delegate.invoke(module);
        }
    }
}
