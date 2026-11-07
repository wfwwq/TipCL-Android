package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSwapchainCreateInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDisplaySwapchain.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDisplaySwapchain.class */
public class KHRDisplaySwapchain {
    public static final int VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 10;
    public static final String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = 1000003000;
    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;

    protected KHRDisplaySwapchain() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateSharedSwapchainsKHR(VkDevice device, int swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains) {
        long __functionAddress = device.getCapabilities().vkCreateSharedSwapchainsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), swapchainCount, pCreateInfos, pAllocator, pSwapchains, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateSharedSwapchainsKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") LongBuffer pSwapchains) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSwapchains, pCreateInfos.remaining());
        }
        return nvkCreateSharedSwapchainsKHR(device, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSwapchains));
    }

    @NativeType("VkResult")
    public static int vkCreateSharedSwapchainsKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") long[] pSwapchains) {
        long __functionAddress = device.getCapabilities().vkCreateSharedSwapchainsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSwapchains, pCreateInfos.remaining());
        }
        return JNI.callPPPPI(device.address(), pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), pSwapchains, __functionAddress);
    }
}
