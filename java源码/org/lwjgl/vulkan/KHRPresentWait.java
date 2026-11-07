package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRPresentWait.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRPresentWait.class */
public class KHRPresentWait {
    public static final int VK_KHR_PRESENT_WAIT_SPEC_VERSION = 1;
    public static final String VK_KHR_PRESENT_WAIT_EXTENSION_NAME = "VK_KHR_present_wait";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR = 1000248000;

    protected KHRPresentWait() {
        throw new UnsupportedOperationException();
    }

    @NativeType("VkResult")
    public static int vkWaitForPresentKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint64_t") long presentId, @NativeType("uint64_t") long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitForPresentKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJJJI(device.address(), swapchain, presentId, timeout, __functionAddress);
    }
}
