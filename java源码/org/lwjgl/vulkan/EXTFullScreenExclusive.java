package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTFullScreenExclusive.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTFullScreenExclusive.class */
public class EXTFullScreenExclusive {
    public static final int VK_EXT_FULL_SCREEN_EXCLUSIVE_SPEC_VERSION = 4;
    public static final String VK_EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME = "VK_EXT_full_screen_exclusive";
    public static final int VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT = 1000255000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT = 1000255001;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT = 1000255002;
    public static final int VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT = -1000255000;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT = 0;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT = 1;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT = 2;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT = 3;

    protected EXTFullScreenExclusive() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pPresentModeCount, long pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModes2EXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(physicalDevice.address(), pSurfaceInfo, pPresentModeCount, pPresentModes, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") IntBuffer pPresentModeCount, @NativeType("VkPresentModeKHR *") IntBuffer pPresentModes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPresentModeCount, 1);
            Checks.checkSafe((Buffer) pPresentModes, pPresentModeCount.get(pPresentModeCount.position()));
        }
        return nvkGetPhysicalDeviceSurfacePresentModes2EXT(physicalDevice, pSurfaceInfo.address(), MemoryUtil.memAddress(pPresentModeCount), MemoryUtil.memAddressSafe(pPresentModes));
    }

    @NativeType("VkResult")
    public static int vkAcquireFullScreenExclusiveModeEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain) {
        long __functionAddress = device.getCapabilities().vkAcquireFullScreenExclusiveModeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(device.address(), swapchain, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkReleaseFullScreenExclusiveModeEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain) {
        long __functionAddress = device.getCapabilities().vkReleaseFullScreenExclusiveModeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(device.address(), swapchain, __functionAddress);
    }

    public static int nvkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, long pSurfaceInfo, long pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModes2EXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pSurfaceInfo, pModes, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") IntBuffer pModes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pModes, 1);
        }
        return nvkGetDeviceGroupSurfacePresentModes2EXT(device, pSurfaceInfo.address(), MemoryUtil.memAddress(pModes));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") int[] pPresentModeCount, @NativeType("VkPresentModeKHR *") int[] pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModes2EXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPresentModeCount, 1);
            Checks.checkSafe(pPresentModes, pPresentModeCount[0]);
        }
        return JNI.callPPPPI(physicalDevice.address(), pSurfaceInfo.address(), pPresentModeCount, pPresentModes, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") int[] pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModes2EXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pModes, 1);
        }
        return JNI.callPPPI(device.address(), pSurfaceInfo.address(), pModes, __functionAddress);
    }
}
