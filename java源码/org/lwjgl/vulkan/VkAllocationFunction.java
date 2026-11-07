package org.lwjgl.vulkan;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAllocationFunction.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAllocationFunction.class */
public abstract class VkAllocationFunction extends Callback implements VkAllocationFunctionI {
    public static VkAllocationFunction create(long functionPointer) {
        VkAllocationFunctionI instance = (VkAllocationFunctionI) Callback.get(functionPointer);
        if (instance instanceof VkAllocationFunction) {
            return (VkAllocationFunction) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VkAllocationFunction createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VkAllocationFunction create(VkAllocationFunctionI instance) {
        if (instance instanceof VkAllocationFunction) {
            return (VkAllocationFunction) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VkAllocationFunction() {
        super(DESCRIPTOR);
    }

    VkAllocationFunction(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAllocationFunction$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAllocationFunction$Container.class */
    private static final class Container extends VkAllocationFunction {
        private final VkAllocationFunctionI delegate;

        Container(long functionPointer, VkAllocationFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.vulkan.VkAllocationFunctionI
        public long invoke(long pUserData, long size, long alignment, int allocationScope) {
            return this.delegate.invoke(pUserData, size, alignment, allocationScope);
        }
    }
}
