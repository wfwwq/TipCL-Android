package org.lwjgl.vulkan;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReallocationFunction.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReallocationFunction.class */
public abstract class VkReallocationFunction extends Callback implements VkReallocationFunctionI {
    public static VkReallocationFunction create(long functionPointer) {
        VkReallocationFunctionI instance = (VkReallocationFunctionI) Callback.get(functionPointer);
        if (instance instanceof VkReallocationFunction) {
            return (VkReallocationFunction) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VkReallocationFunction createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VkReallocationFunction create(VkReallocationFunctionI instance) {
        if (instance instanceof VkReallocationFunction) {
            return (VkReallocationFunction) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VkReallocationFunction() {
        super(DESCRIPTOR);
    }

    VkReallocationFunction(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReallocationFunction$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReallocationFunction$Container.class */
    private static final class Container extends VkReallocationFunction {
        private final VkReallocationFunctionI delegate;

        Container(long functionPointer, VkReallocationFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.vulkan.VkReallocationFunctionI
        public long invoke(long pUserData, long pOriginal, long size, long alignment, int allocationScope) {
            return this.delegate.invoke(pUserData, pOriginal, size, alignment, allocationScope);
        }
    }
}
