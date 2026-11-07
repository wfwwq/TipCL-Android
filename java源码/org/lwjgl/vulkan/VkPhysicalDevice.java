package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice.class */
public class VkPhysicalDevice extends DispatchableHandleInstance {
    private final VkInstance instance;

    @Override // org.lwjgl.vulkan.DispatchableHandleInstance
    public /* bridge */ /* synthetic */ VKCapabilitiesInstance getCapabilities() {
        return super.getCapabilities();
    }

    public VkPhysicalDevice(long handle, VkInstance instance) {
        super(handle, instance.getCapabilities());
        this.instance = instance;
    }

    public VkInstance getInstance() {
        return this.instance;
    }
}
