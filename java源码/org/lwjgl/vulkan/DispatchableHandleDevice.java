package org.lwjgl.vulkan;

import org.lwjgl.system.Pointer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/DispatchableHandleDevice.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/DispatchableHandleDevice.class */
abstract class DispatchableHandleDevice extends Pointer.Default {
    private final VKCapabilitiesDevice capabilities;

    public abstract VKCapabilitiesInstance getCapabilitiesInstance();

    DispatchableHandleDevice(long handle, VKCapabilitiesDevice capabilities) {
        super(handle);
        this.capabilities = capabilities;
    }

    public VKCapabilitiesDevice getCapabilities() {
        return this.capabilities;
    }
}
