package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSurfaceFormatKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRSurface.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRSurface.class */
public class KHRSurface {
    public static final int VK_KHR_SURFACE_SPEC_VERSION = 25;
    public static final String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";
    public static final int VK_ERROR_SURFACE_LOST_KHR = -1000000000;
    public static final int VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;
    public static final int VK_OBJECT_TYPE_SURFACE_KHR = 1000000000;
    public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 1;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 2;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 4;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 8;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 16;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 32;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 64;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 128;
    public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 256;
    public static final int VK_PRESENT_MODE_IMMEDIATE_KHR = 0;
    public static final int VK_PRESENT_MODE_MAILBOX_KHR = 1;
    public static final int VK_PRESENT_MODE_FIFO_KHR = 2;
    public static final int VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;
    public static final int VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0;
    public static final int VK_COLORSPACE_SRGB_NONLINEAR_KHR = 0;
    public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 1;
    public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 2;
    public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 4;
    public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 8;

    protected KHRSurface() {
        throw new UnsupportedOperationException();
    }

    public static void nvkDestroySurfaceKHR(VkInstance instance, long surface, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroySurfaceKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(instance.address(), surface, pAllocator, __functionAddress);
    }

    public static void vkDestroySurfaceKHR(VkInstance instance, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroySurfaceKHR(instance, surface, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, long pSupported) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceSupportKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(physicalDevice.address(), queueFamilyIndex, surface, pSupported, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkBool32 *") IntBuffer pSupported) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSupported, 1);
        }
        return nvkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, MemoryUtil.memAddress(pSupported));
    }

    public static int nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilitiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(physicalDevice.address(), surface, pSurfaceCapabilities, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkSurfaceCapabilitiesKHR *") VkSurfaceCapabilitiesKHR pSurfaceCapabilities) {
        return nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, pSurfaceCapabilities.address());
    }

    public static int nvkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceFormatCount, long pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormatsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(physicalDevice.address(), surface, pSurfaceFormatCount, pSurfaceFormats, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") IntBuffer pSurfaceFormatCount, @NativeType("VkSurfaceFormatKHR *") VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSurfaceFormatCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
        }
        return nvkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, MemoryUtil.memAddress(pSurfaceFormatCount), MemoryUtil.memAddressSafe(pSurfaceFormats));
    }

    public static int nvkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, long pPresentModeCount, long pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(physicalDevice.address(), surface, pPresentModeCount, pPresentModes, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") IntBuffer pPresentModeCount, @NativeType("VkPresentModeKHR *") IntBuffer pPresentModes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPresentModeCount, 1);
            Checks.checkSafe((Buffer) pPresentModes, pPresentModeCount.get(pPresentModeCount.position()));
        }
        return nvkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, MemoryUtil.memAddress(pPresentModeCount), MemoryUtil.memAddressSafe(pPresentModes));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkBool32 *") int[] pSupported) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceSupportKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSupported, 1);
        }
        return JNI.callPJPI(physicalDevice.address(), queueFamilyIndex, surface, pSupported, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") int[] pSurfaceFormatCount, @NativeType("VkSurfaceFormatKHR *") VkSurfaceFormatKHR.Buffer pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormatsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSurfaceFormatCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSurfaceFormats, pSurfaceFormatCount[0]);
        }
        return JNI.callPJPPI(physicalDevice.address(), surface, pSurfaceFormatCount, MemoryUtil.memAddressSafe(pSurfaceFormats), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") int[] pPresentModeCount, @NativeType("VkPresentModeKHR *") int[] pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPresentModeCount, 1);
            Checks.checkSafe(pPresentModes, pPresentModeCount[0]);
        }
        return JNI.callPJPPI(physicalDevice.address(), surface, pPresentModeCount, pPresentModes, __functionAddress);
    }
}
