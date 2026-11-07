package org.lwjgl.vulkan;

import org.lwjgl.system.Pointer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/DispatchableHandleInstance.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/DispatchableHandleInstance.class */
abstract class DispatchableHandleInstance extends Pointer.Default {
    private final VKCapabilitiesInstance capabilities;

    DispatchableHandleInstance(long handle, VKCapabilitiesInstance capabilities) {
        super(handle);
        this.capabilities = capabilities;
    }

    public VKCapabilitiesInstance getCapabilities() {
        return this.capabilities;
    }
}
