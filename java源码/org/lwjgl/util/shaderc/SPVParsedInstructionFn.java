package org.lwjgl.util.shaderc;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedInstructionFn.class */
public abstract class SPVParsedInstructionFn extends Callback implements SPVParsedInstructionFnI {
    public static SPVParsedInstructionFn create(long functionPointer) {
        SPVParsedInstructionFnI instance = (SPVParsedInstructionFnI) Callback.get(functionPointer);
        if (instance instanceof SPVParsedInstructionFn) {
            return (SPVParsedInstructionFn) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SPVParsedInstructionFn createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SPVParsedInstructionFn create(SPVParsedInstructionFnI instance) {
        if (instance instanceof SPVParsedInstructionFn) {
            return (SPVParsedInstructionFn) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SPVParsedInstructionFn() {
        super(DESCRIPTOR);
    }

    SPVParsedInstructionFn(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedInstructionFn$Container.class */
    private static final class Container extends SPVParsedInstructionFn {
        private final SPVParsedInstructionFnI delegate;

        Container(long functionPointer, SPVParsedInstructionFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.shaderc.SPVParsedInstructionFnI
        public int invoke(long user_data, long parsed_instruction) {
            return this.delegate.invoke(user_data, parsed_instruction);
        }
    }
}
