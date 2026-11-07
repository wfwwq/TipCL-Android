package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSurfaceFormat2KHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRGetSurfaceCapabilities2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRGetSurfaceCapabilities2.class */
public class KHRGetSurfaceCapabilities2 {
    public static final int VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = "VK_KHR_get_surface_capabilities2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR = 1000119000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR = 1000119001;
    public static final int VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR = 1000119002;

    protected KHRGetSurfaceCapabilities2() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pSurfaceCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilities2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pSurfaceInfo, pSurfaceCapabilities, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("VkSurfaceCapabilities2KHR *") VkSurfaceCapabilities2KHR pSurfaceCapabilities) {
        return nvkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice, pSurfaceInfo.address(), pSurfaceCapabilities.address());
    }

    public static int nvkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pSurfaceFormatCount, long pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormats2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(physicalDevice.address(), pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") IntBuffer pSurfaceFormatCount, @NativeType("VkSurfaceFormat2KHR *") VkSurfaceFormat2KHR.Buffer pSurfaceFormats) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSurfaceFormatCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
        }
        return nvkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, pSurfaceInfo.address(), MemoryUtil.memAddress(pSurfaceFormatCount), MemoryUtil.memAddressSafe(pSurfaceFormats));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") int[] pSurfaceFormatCount, @NativeType("VkSurfaceFormat2KHR *") VkSurfaceFormat2KHR.Buffer pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormats2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSurfaceFormatCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSurfaceFormats, pSurfaceFormatCount[0]);
        }
        return JNI.callPPPPI(physicalDevice.address(), pSurfaceInfo.address(), pSurfaceFormatCount, MemoryUtil.memAddressSafe(pSurfaceFormats), __functionAddress);
    }
}
