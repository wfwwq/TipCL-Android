package org.lwjgl.vulkan;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInternalAllocationNotification.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInternalAllocationNotification.class */
public abstract class VkInternalAllocationNotification extends Callback implements VkInternalAllocationNotificationI {
    public static VkInternalAllocationNotification create(long functionPointer) {
        VkInternalAllocationNotificationI instance = (VkInternalAllocationNotificationI) Callback.get(functionPointer);
        if (instance instanceof VkInternalAllocationNotification) {
            return (VkInternalAllocationNotification) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VkInternalAllocationNotification createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VkInternalAllocationNotification create(VkInternalAllocationNotificationI instance) {
        if (instance instanceof VkInternalAllocationNotification) {
            return (VkInternalAllocationNotification) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VkInternalAllocationNotification() {
        super(DESCRIPTOR);
    }

    VkInternalAllocationNotification(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInternalAllocationNotification$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInternalAllocationNotification$Container.class */
    private static final class Container extends VkInternalAllocationNotification {
        private final VkInternalAllocationNotificationI delegate;

        Container(long functionPointer, VkInternalAllocationNotificationI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.vulkan.VkInternalAllocationNotificationI
        public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
            this.delegate.invoke(pUserData, size, allocationType, allocationScope);
        }
    }
}
