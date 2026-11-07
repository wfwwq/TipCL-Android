package org.lwjgl.vulkan;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInternalFreeNotification.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInternalFreeNotification.class */
public abstract class VkInternalFreeNotification extends Callback implements VkInternalFreeNotificationI {
    public static VkInternalFreeNotification create(long functionPointer) {
        VkInternalFreeNotificationI instance = (VkInternalFreeNotificationI) Callback.get(functionPointer);
        if (instance instanceof VkInternalFreeNotification) {
            return (VkInternalFreeNotification) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VkInternalFreeNotification createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VkInternalFreeNotification create(VkInternalFreeNotificationI instance) {
        if (instance instanceof VkInternalFreeNotification) {
            return (VkInternalFreeNotification) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VkInternalFreeNotification() {
        super(DESCRIPTOR);
    }

    VkInternalFreeNotification(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInternalFreeNotification$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInternalFreeNotification$Container.class */
    private static final class Container extends VkInternalFreeNotification {
        private final VkInternalFreeNotificationI delegate;

        Container(long functionPointer, VkInternalFreeNotificationI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.vulkan.VkInternalFreeNotificationI
        public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
            this.delegate.invoke(pUserData, size, allocationType, allocationScope);
        }
    }
}
