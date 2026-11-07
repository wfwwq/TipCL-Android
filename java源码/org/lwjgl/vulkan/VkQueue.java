package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueue.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueue.class */
public class VkQueue extends DispatchableHandleDevice {
    private final VkDevice device;

    @Override // org.lwjgl.vulkan.DispatchableHandleDevice
    public /* bridge */ /* synthetic */ VKCapabilitiesDevice getCapabilities() {
        return super.getCapabilities();
    }

    public VkQueue(long handle, VkDevice device) {
        super(handle, device.getCapabilities());
        this.device = device;
    }

    public VkDevice getDevice() {
        return this.device;
    }

    @Override // org.lwjgl.vulkan.DispatchableHandleDevice
    public VKCapabilitiesInstance getCapabilitiesInstance() {
        return getDevice().getCapabilitiesInstance();
    }
}
