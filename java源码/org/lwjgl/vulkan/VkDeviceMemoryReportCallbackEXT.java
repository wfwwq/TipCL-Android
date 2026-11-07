package org.lwjgl.vulkan;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryReportCallbackEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryReportCallbackEXT.class */
public abstract class VkDeviceMemoryReportCallbackEXT extends Callback implements VkDeviceMemoryReportCallbackEXTI {
    public static VkDeviceMemoryReportCallbackEXT create(long functionPointer) {
        VkDeviceMemoryReportCallbackEXTI instance = (VkDeviceMemoryReportCallbackEXTI) Callback.get(functionPointer);
        if (instance instanceof VkDeviceMemoryReportCallbackEXT) {
            return (VkDeviceMemoryReportCallbackEXT) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VkDeviceMemoryReportCallbackEXT createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VkDeviceMemoryReportCallbackEXT create(VkDeviceMemoryReportCallbackEXTI instance) {
        if (instance instanceof VkDeviceMemoryReportCallbackEXT) {
            return (VkDeviceMemoryReportCallbackEXT) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VkDeviceMemoryReportCallbackEXT() {
        super(DESCRIPTOR);
    }

    VkDeviceMemoryReportCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryReportCallbackEXT$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryReportCallbackEXT$Container.class */
    private static final class Container extends VkDeviceMemoryReportCallbackEXT {
        private final VkDeviceMemoryReportCallbackEXTI delegate;

        Container(long functionPointer, VkDeviceMemoryReportCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.vulkan.VkDeviceMemoryReportCallbackEXTI
        public void invoke(long pCallbackData, long pUserData) {
            this.delegate.invoke(pCallbackData, pUserData);
        }
    }
}
