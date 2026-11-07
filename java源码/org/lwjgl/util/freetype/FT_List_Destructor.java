package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_List_Destructor.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_List_Destructor.class */
public abstract class FT_List_Destructor extends Callback implements FT_List_DestructorI {
    public static FT_List_Destructor create(long functionPointer) {
        FT_List_DestructorI instance = (FT_List_DestructorI) Callback.get(functionPointer);
        if (instance instanceof FT_List_Destructor) {
            return (FT_List_Destructor) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_List_Destructor createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_List_Destructor create(FT_List_DestructorI instance) {
        if (instance instanceof FT_List_Destructor) {
            return (FT_List_Destructor) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_List_Destructor() {
        super(DESCRIPTOR);
    }

    FT_List_Destructor(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_List_Destructor$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_List_Destructor$Container.class */
    private static final class Container extends FT_List_Destructor {
        private final FT_List_DestructorI delegate;

        Container(long functionPointer, FT_List_DestructorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_List_DestructorI
        public void invoke(long memory, long data, long user) {
            this.delegate.invoke(memory, data, user);
        }
    }
}
