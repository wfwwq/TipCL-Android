package org.lwjgl.vulkan;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFreeFunction.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFreeFunction.class */
public abstract class VkFreeFunction extends Callback implements VkFreeFunctionI {
    public static VkFreeFunction create(long functionPointer) {
        VkFreeFunctionI instance = (VkFreeFunctionI) Callback.get(functionPointer);
        if (instance instanceof VkFreeFunction) {
            return (VkFreeFunction) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VkFreeFunction createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VkFreeFunction create(VkFreeFunctionI instance) {
        if (instance instanceof VkFreeFunction) {
            return (VkFreeFunction) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VkFreeFunction() {
        super(DESCRIPTOR);
    }

    VkFreeFunction(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFreeFunction$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFreeFunction$Container.class */
    private static final class Container extends VkFreeFunction {
        private final VkFreeFunctionI delegate;

        Container(long functionPointer, VkFreeFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.vulkan.VkFreeFunctionI
        public void invoke(long pUserData, long pMemory) {
            this.delegate.invoke(pUserData, pMemory);
        }
    }
}
