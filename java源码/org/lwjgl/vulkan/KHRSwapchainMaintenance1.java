package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRSwapchainMaintenance1.class */
public class KHRSwapchainMaintenance1 {
    public static final int VK_KHR_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION = 1;
    public static final String VK_KHR_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_swapchain_maintenance1";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR = 1000275000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR = 1000275001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_KHR = 1000275002;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR = 1000275003;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR = 1000275004;
    public static final int VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR = 1000275005;
    public static final int VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_KHR = 8;

    protected KHRSwapchainMaintenance1() {
        throw new UnsupportedOperationException();
    }

    public static int nvkReleaseSwapchainImagesKHR(VkDevice device, long pReleaseInfo) {
        long __functionAddress = device.getCapabilities().vkReleaseSwapchainImagesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkReleaseSwapchainImagesInfoKHR.validate(pReleaseInfo);
        }
        return JNI.callPPI(device.address(), pReleaseInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkReleaseSwapchainImagesKHR(VkDevice device, @NativeType("VkReleaseSwapchainImagesInfoKHR const *") VkReleaseSwapchainImagesInfoKHR pReleaseInfo) {
        return nvkReleaseSwapchainImagesKHR(device, pReleaseInfo.address());
    }
}
