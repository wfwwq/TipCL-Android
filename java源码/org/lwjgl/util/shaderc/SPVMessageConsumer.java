package org.lwjgl.util.shaderc;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVMessageConsumer.class */
public abstract class SPVMessageConsumer extends Callback implements SPVMessageConsumerI {
    public static SPVMessageConsumer create(long functionPointer) {
        SPVMessageConsumerI instance = (SPVMessageConsumerI) Callback.get(functionPointer);
        if (instance instanceof SPVMessageConsumer) {
            return (SPVMessageConsumer) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SPVMessageConsumer createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SPVMessageConsumer create(SPVMessageConsumerI instance) {
        if (instance instanceof SPVMessageConsumer) {
            return (SPVMessageConsumer) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SPVMessageConsumer() {
        super(DESCRIPTOR);
    }

    SPVMessageConsumer(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVMessageConsumer$Container.class */
    private static final class Container extends SPVMessageConsumer {
        private final SPVMessageConsumerI delegate;

        Container(long functionPointer, SPVMessageConsumerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.shaderc.SPVMessageConsumerI
        public void invoke(int level, long source, long position, long message) {
            this.delegate.invoke(level, source, position, message);
        }
    }
}
