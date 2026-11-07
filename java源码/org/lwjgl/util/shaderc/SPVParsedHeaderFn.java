package org.lwjgl.util.shaderc;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedHeaderFn.class */
public abstract class SPVParsedHeaderFn extends Callback implements SPVParsedHeaderFnI {
    public static SPVParsedHeaderFn create(long functionPointer) {
        SPVParsedHeaderFnI instance = (SPVParsedHeaderFnI) Callback.get(functionPointer);
        if (instance instanceof SPVParsedHeaderFn) {
            return (SPVParsedHeaderFn) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SPVParsedHeaderFn createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SPVParsedHeaderFn create(SPVParsedHeaderFnI instance) {
        if (instance instanceof SPVParsedHeaderFn) {
            return (SPVParsedHeaderFn) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SPVParsedHeaderFn() {
        super(DESCRIPTOR);
    }

    SPVParsedHeaderFn(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedHeaderFn$Container.class */
    private static final class Container extends SPVParsedHeaderFn {
        private final SPVParsedHeaderFnI delegate;

        Container(long functionPointer, SPVParsedHeaderFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.shaderc.SPVParsedHeaderFnI
        public int invoke(long user_data, int endian, int magic, int version, int generator, int id_bound, int reserved) {
            return this.delegate.invoke(user_data, endian, magic, version, generator, id_bound, reserved);
        }
    }
}
