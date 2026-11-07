package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTSwapchainMaintenance1.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTSwapchainMaintenance1.class */
public class EXTSwapchainMaintenance1 {
    public static final int VK_EXT_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION = 1;
    public static final String VK_EXT_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME = "VK_EXT_swapchain_maintenance1";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT = 1000275000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT = 1000275001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT = 1000275002;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT = 1000275003;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT = 1000275004;
    public static final int VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT = 1000275005;
    public static final int VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_EXT = 8;

    protected EXTSwapchainMaintenance1() {
        throw new UnsupportedOperationException();
    }

    public static int nvkReleaseSwapchainImagesEXT(VkDevice device, long pReleaseInfo) {
        long __functionAddress = device.getCapabilities().vkReleaseSwapchainImagesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkReleaseSwapchainImagesInfoKHR.validate(pReleaseInfo);
        }
        return JNI.callPPI(device.address(), pReleaseInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkReleaseSwapchainImagesEXT(VkDevice device, @NativeType("VkReleaseSwapchainImagesInfoKHR const *") VkReleaseSwapchainImagesInfoKHR pReleaseInfo) {
        return nvkReleaseSwapchainImagesEXT(device, pReleaseInfo.address());
    }
}
