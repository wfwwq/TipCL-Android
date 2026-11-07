package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPastPresentationTimingGOOGLE;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/GOOGLEDisplayTiming.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/GOOGLEDisplayTiming.class */
public class GOOGLEDisplayTiming {
    public static final int VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION = 1;
    public static final String VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME = "VK_GOOGLE_display_timing";
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE = 1000092000;

    protected GOOGLEDisplayTiming() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetRefreshCycleDurationGOOGLE(VkDevice device, long swapchain, long pDisplayTimingProperties) {
        long __functionAddress = device.getCapabilities().vkGetRefreshCycleDurationGOOGLE;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), swapchain, pDisplayTimingProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetRefreshCycleDurationGOOGLE(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkRefreshCycleDurationGOOGLE *") VkRefreshCycleDurationGOOGLE pDisplayTimingProperties) {
        return nvkGetRefreshCycleDurationGOOGLE(device, swapchain, pDisplayTimingProperties.address());
    }

    public static int nvkGetPastPresentationTimingGOOGLE(VkDevice device, long swapchain, long pPresentationTimingCount, long pPresentationTimings) {
        long __functionAddress = device.getCapabilities().vkGetPastPresentationTimingGOOGLE;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), swapchain, pPresentationTimingCount, pPresentationTimings, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPastPresentationTimingGOOGLE(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") IntBuffer pPresentationTimingCount, @NativeType("VkPastPresentationTimingGOOGLE *") VkPastPresentationTimingGOOGLE.Buffer pPresentationTimings) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPresentationTimingCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pPresentationTimings, pPresentationTimingCount.get(pPresentationTimingCount.position()));
        }
        return nvkGetPastPresentationTimingGOOGLE(device, swapchain, MemoryUtil.memAddress(pPresentationTimingCount), MemoryUtil.memAddressSafe(pPresentationTimings));
    }

    @NativeType("VkResult")
    public static int vkGetPastPresentationTimingGOOGLE(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") int[] pPresentationTimingCount, @NativeType("VkPastPresentationTimingGOOGLE *") VkPastPresentationTimingGOOGLE.Buffer pPresentationTimings) {
        long __functionAddress = device.getCapabilities().vkGetPastPresentationTimingGOOGLE;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPresentationTimingCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pPresentationTimings, pPresentationTimingCount[0]);
        }
        return JNI.callPJPPI(device.address(), swapchain, pPresentationTimingCount, MemoryUtil.memAddressSafe(pPresentationTimings), __functionAddress);
    }
}
