package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVAcquireWinrtDisplay.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVAcquireWinrtDisplay.class */
public class NVAcquireWinrtDisplay {
    public static final int VK_NV_ACQUIRE_WINRT_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME = "VK_NV_acquire_winrt_display";

    protected NVAcquireWinrtDisplay() {
        throw new UnsupportedOperationException();
    }

    @NativeType("VkResult")
    public static int vkAcquireWinrtDisplayNV(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkAcquireWinrtDisplayNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(physicalDevice.address(), display, __functionAddress);
    }

    public static int nvkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, int deviceRelativeId, long pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetWinrtDisplayNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(physicalDevice.address(), deviceRelativeId, pDisplay, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int deviceRelativeId, @NativeType("VkDisplayKHR *") LongBuffer pDisplay) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pDisplay, 1);
        }
        return nvkGetWinrtDisplayNV(physicalDevice, deviceRelativeId, MemoryUtil.memAddress(pDisplay));
    }

    @NativeType("VkResult")
    public static int vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int deviceRelativeId, @NativeType("VkDisplayKHR *") long[] pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetWinrtDisplayNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pDisplay, 1);
        }
        return JNI.callPPI(physicalDevice.address(), deviceRelativeId, pDisplay, __functionAddress);
    }
}
