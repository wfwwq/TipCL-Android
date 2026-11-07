package org.lwjgl.vulkan;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalComputeQueueNV.class */
public class VkExternalComputeQueueNV extends DispatchableHandleDevice {
    private final VkDevice device;

    @Override // org.lwjgl.vulkan.DispatchableHandleDevice
    public /* bridge */ /* synthetic */ VKCapabilitiesDevice getCapabilities() {
        return super.getCapabilities();
    }

    public VkExternalComputeQueueNV(long handle, VkDevice device) {
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
