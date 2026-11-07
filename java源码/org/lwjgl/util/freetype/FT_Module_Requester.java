package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Requester.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Requester.class */
public abstract class FT_Module_Requester extends Callback implements FT_Module_RequesterI {
    public static FT_Module_Requester create(long functionPointer) {
        FT_Module_RequesterI instance = (FT_Module_RequesterI) Callback.get(functionPointer);
        if (instance instanceof FT_Module_Requester) {
            return (FT_Module_Requester) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FT_Module_Requester createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FT_Module_Requester create(FT_Module_RequesterI instance) {
        if (instance instanceof FT_Module_Requester) {
            return (FT_Module_Requester) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FT_Module_Requester() {
        super(DESCRIPTOR);
    }

    FT_Module_Requester(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Requester$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Requester$Container.class */
    private static final class Container extends FT_Module_Requester {
        private final FT_Module_RequesterI delegate;

        Container(long functionPointer, FT_Module_RequesterI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FT_Module_RequesterI
        public long invoke(long module, long name) {
            return this.delegate.invoke(module, name);
        }
    }
}
