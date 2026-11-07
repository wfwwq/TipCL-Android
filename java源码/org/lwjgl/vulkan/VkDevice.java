package org.lwjgl.vulkan;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevice.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevice.class */
public class VkDevice extends DispatchableHandleDevice {
    private final VkPhysicalDevice physicalDevice;

    @Override // org.lwjgl.vulkan.DispatchableHandleDevice
    public /* bridge */ /* synthetic */ VKCapabilitiesDevice getCapabilities() {
        return super.getCapabilities();
    }

    public VkDevice(long handle, VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci) {
        this(handle, physicalDevice, ci, 0);
    }

    public VkDevice(long handle, VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci, int apiVersion) {
        super(handle, getDeviceCapabilities(handle, physicalDevice, ci, apiVersion));
        this.physicalDevice = physicalDevice;
    }

    public VkPhysicalDevice getPhysicalDevice() {
        return this.physicalDevice;
    }

    private static VKCapabilitiesDevice getDeviceCapabilities(long handle, VkPhysicalDevice physicalDevice, VkDeviceCreateInfo ci, int apiVersion) {
        MemoryStack stack = MemoryStack.stackPush();
        if (apiVersion == 0) {
            try {
                VkPhysicalDeviceProperties props = VkPhysicalDeviceProperties.calloc(stack);
                VK10.vkGetPhysicalDeviceProperties(physicalDevice, props);
                apiVersion = Math.min(props.apiVersion(), physicalDevice.getInstance().getCapabilities().apiVersion) & (-4096);
            } catch (Throwable th) {
                if (stack != null) {
                    try {
                        stack.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        long GetDeviceProcAddr = VK10.vkGetInstanceProcAddr(physicalDevice.getInstance(), "vkGetDeviceProcAddr");
        if (stack != null) {
            stack.close();
        }
        return new VKCapabilitiesDevice(functionName -> {
            long address = JNI.callPPP(handle, MemoryUtil.memAddress(functionName), GetDeviceProcAddr);
            if (address == 0 && Checks.DEBUG_FUNCTIONS) {
                APIUtil.apiLogMissing("VK device", functionName);
            }
            return address;
        }, physicalDevice.getCapabilities(), apiVersion, VK.getEnabledExtensionSet(apiVersion, ci.ppEnabledExtensionNames()));
    }

    @Override // org.lwjgl.vulkan.DispatchableHandleDevice
    public VKCapabilitiesInstance getCapabilitiesInstance() {
        return getPhysicalDevice().getCapabilities();
    }
}
