package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_List_Iterator.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_List_Iterator.class */
public abstract class FT_List_Iterator extends Callback implements FT_List_IteratorI {
    public static FT_List_Iterator create(long functionPointer) {
        FT_List_IteratorI instance = (FT_List_IteratorI) Callback.get(functionPointer);
        if (instance instanceof FT_List_Iterator) {
            return (FT_List_Iterator) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_List_Iterator createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_List_Iterator create(FT_List_IteratorI instance) {
        if (instance instanceof FT_List_Iterator) {
            return (FT_List_Iterator) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_List_Iterator() {
        super(DESCRIPTOR);
    }

    FT_List_Iterator(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_List_Iterator$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_List_Iterator$Container.class */
    private static final class Container extends FT_List_Iterator {
        private final FT_List_IteratorI delegate;

        Container(long functionPointer, FT_List_IteratorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_List_IteratorI
        public int invoke(long node, long user) {
            return this.delegate.invoke(node, user);
        }
    }
}
