package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRPresentWait2.class */
public class KHRPresentWait2 {
    public static final int VK_KHR_PRESENT_WAIT_2_SPEC_VERSION = 1;
    public static final String VK_KHR_PRESENT_WAIT_2_EXTENSION_NAME = "VK_KHR_present_wait2";
    public static final int VK_SWAPCHAIN_CREATE_PRESENT_WAIT_2_BIT_KHR = 128;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR = 1000480000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_2_FEATURES_KHR = 1000480001;
    public static final int VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR = 1000480002;

    protected KHRPresentWait2() {
        throw new UnsupportedOperationException();
    }

    public static int nvkWaitForPresent2KHR(VkDevice device, long swapchain, long pPresentWait2Info) {
        long __functionAddress = device.getCapabilities().vkWaitForPresent2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), swapchain, pPresentWait2Info, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWaitForPresent2KHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkPresentWait2InfoKHR const *") VkPresentWait2InfoKHR pPresentWait2Info) {
        return nvkWaitForPresent2KHR(device, swapchain, pPresentWait2Info.address());
    }
}
