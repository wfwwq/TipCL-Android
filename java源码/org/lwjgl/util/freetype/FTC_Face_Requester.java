package org.lwjgl.util.freetype;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_Face_Requester.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_Face_Requester.class */
public abstract class FTC_Face_Requester extends Callback implements FTC_Face_RequesterI {
    public static FTC_Face_Requester create(long functionPointer) {
        FTC_Face_RequesterI instance = (FTC_Face_RequesterI) Callback.get(functionPointer);
        if (instance instanceof FTC_Face_Requester) {
            return (FTC_Face_Requester) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static FTC_Face_Requester createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static FTC_Face_Requester create(FTC_Face_RequesterI instance) {
        if (instance instanceof FTC_Face_Requester) {
            return (FTC_Face_Requester) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected FTC_Face_Requester() {
        super(DESCRIPTOR);
    }

    FTC_Face_Requester(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_Face_Requester$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_Face_Requester$Container.class */
    private static final class Container extends FTC_Face_Requester {
        private final FTC_Face_RequesterI delegate;

        Container(long functionPointer, FTC_Face_RequesterI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.freetype.FTC_Face_RequesterI
        public int invoke(long face_id, long library, long req_data, long aface) {
            return this.delegate.invoke(face_id, library, req_data, aface);
        }
    }
}
