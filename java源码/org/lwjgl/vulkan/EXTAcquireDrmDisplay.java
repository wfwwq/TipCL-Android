package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTAcquireDrmDisplay.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTAcquireDrmDisplay.class */
public class EXTAcquireDrmDisplay {
    public static final int VK_EXT_ACQUIRE_DRM_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_ACQUIRE_DRM_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_drm_display";

    protected EXTAcquireDrmDisplay() {
        throw new UnsupportedOperationException();
    }

    @NativeType("VkResult")
    public static int vkAcquireDrmDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("int32_t") int drmFd, @NativeType("VkDisplayKHR") long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkAcquireDrmDisplayEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(physicalDevice.address(), drmFd, display, __functionAddress);
    }

    public static int nvkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, int drmFd, int connectorId, long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDrmDisplayEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(physicalDevice.address(), drmFd, connectorId, display, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("int32_t") int drmFd, @NativeType("uint32_t") int connectorId, @NativeType("VkDisplayKHR *") LongBuffer display) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) display, 1);
        }
        return nvkGetDrmDisplayEXT(physicalDevice, drmFd, connectorId, MemoryUtil.memAddress(display));
    }

    @NativeType("VkResult")
    public static int vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("int32_t") int drmFd, @NativeType("uint32_t") int connectorId, @NativeType("VkDisplayKHR *") long[] display) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDrmDisplayEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(display, 1);
        }
        return JNI.callPPI(physicalDevice.address(), drmFd, connectorId, display, __functionAddress);
    }
}
