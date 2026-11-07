package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRSwapchain.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRSwapchain.class */
public class KHRSwapchain {
    public static final int VK_KHR_SWAPCHAIN_SPEC_VERSION = 70;
    public static final String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = 1000001000;
    public static final int VK_STRUCTURE_TYPE_PRESENT_INFO_KHR = 1000001001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000060007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = 1000060008;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = 1000060009;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = 1000060010;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = 1000060011;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;
    public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002;
    public static final int VK_SUBOPTIMAL_KHR = 1000001003;
    public static final int VK_ERROR_OUT_OF_DATE_KHR = -1000001004;
    public static final int VK_OBJECT_TYPE_SWAPCHAIN_KHR = 1000001000;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 1;
    public static final int VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR = 2;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = 1;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = 2;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = 4;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 8;

    protected KHRSwapchain() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateSwapchainKHR(VkDevice device, long pCreateInfo, long pAllocator, long pSwapchain) {
        long __functionAddress = device.getCapabilities().vkCreateSwapchainKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pSwapchain, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateSwapchainKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") LongBuffer pSwapchain) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSwapchain, 1);
        }
        return nvkCreateSwapchainKHR(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSwapchain));
    }

    public static void nvkDestroySwapchainKHR(VkDevice device, long swapchain, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySwapchainKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), swapchain, pAllocator, __functionAddress);
    }

    public static void vkDestroySwapchainKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroySwapchainKHR(device, swapchain, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkGetSwapchainImagesKHR(VkDevice device, long swapchain, long pSwapchainImageCount, long pSwapchainImages) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainImagesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), swapchain, pSwapchainImageCount, pSwapchainImages, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSwapchainImagesKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") IntBuffer pSwapchainImageCount, @NativeType("VkImage *") LongBuffer pSwapchainImages) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSwapchainImageCount, 1);
            Checks.checkSafe((Buffer) pSwapchainImages, pSwapchainImageCount.get(pSwapchainImageCount.position()));
        }
        return nvkGetSwapchainImagesKHR(device, swapchain, MemoryUtil.memAddress(pSwapchainImageCount), MemoryUtil.memAddressSafe(pSwapchainImages));
    }

    public static int nvkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImageKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJJJJPI(device.address(), swapchain, timeout, semaphore, fence, pImageIndex, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAcquireNextImageKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint64_t") long timeout, @NativeType("VkSemaphore") long semaphore, @NativeType("VkFence") long fence, @NativeType("uint32_t *") IntBuffer pImageIndex) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pImageIndex, 1);
        }
        return nvkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, MemoryUtil.memAddress(pImageIndex));
    }

    public static int nvkQueuePresentKHR(VkQueue queue, long pPresentInfo) {
        long __functionAddress = queue.getCapabilities().vkQueuePresentKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPresentInfoKHR.validate(pPresentInfo);
        }
        VK.updateFps();
        return JNI.callPPI(queue.address(), pPresentInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkQueuePresentKHR(VkQueue queue, @NativeType("VkPresentInfoKHR const *") VkPresentInfoKHR pPresentInfo) {
        return nvkQueuePresentKHR(queue, pPresentInfo.address());
    }

    public static int nvkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, long pDeviceGroupPresentCapabilities) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPresentCapabilitiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pDeviceGroupPresentCapabilities, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, @NativeType("VkDeviceGroupPresentCapabilitiesKHR *") VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities) {
        return nvkGetDeviceGroupPresentCapabilitiesKHR(device, pDeviceGroupPresentCapabilities.address());
    }

    public static int nvkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, long surface, long pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), surface, pModes, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") IntBuffer pModes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pModes, 1);
        }
        return nvkGetDeviceGroupSurfacePresentModesKHR(device, surface, MemoryUtil.memAddress(pModes));
    }

    public static int nvkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, long surface, long pRectCount, long pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(physicalDevice.address(), surface, pRectCount, pRects, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") IntBuffer pRectCount, @NativeType("VkRect2D *") VkRect2D.Buffer pRects) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pRectCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pRects, pRectCount.get(pRectCount.position()));
        }
        return nvkGetPhysicalDevicePresentRectanglesKHR(physicalDevice, surface, MemoryUtil.memAddress(pRectCount), MemoryUtil.memAddressSafe(pRects));
    }

    public static int nvkAcquireNextImage2KHR(VkDevice device, long pAcquireInfo, long pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pAcquireInfo, pImageIndex, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(VkDevice device, @NativeType("VkAcquireNextImageInfoKHR const *") VkAcquireNextImageInfoKHR pAcquireInfo, @NativeType("uint32_t *") IntBuffer pImageIndex) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pImageIndex, 1);
        }
        return nvkAcquireNextImage2KHR(device, pAcquireInfo.address(), MemoryUtil.memAddress(pImageIndex));
    }

    @NativeType("VkResult")
    public static int vkCreateSwapchainKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") long[] pSwapchain) {
        long __functionAddress = device.getCapabilities().vkCreateSwapchainKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSwapchain, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSwapchain, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSwapchainImagesKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") int[] pSwapchainImageCount, @NativeType("VkImage *") long[] pSwapchainImages) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainImagesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSwapchainImageCount, 1);
            Checks.checkSafe(pSwapchainImages, pSwapchainImageCount[0]);
        }
        return JNI.callPJPPI(device.address(), swapchain, pSwapchainImageCount, pSwapchainImages, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAcquireNextImageKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint64_t") long timeout, @NativeType("VkSemaphore") long semaphore, @NativeType("VkFence") long fence, @NativeType("uint32_t *") int[] pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImageKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pImageIndex, 1);
        }
        return JNI.callPJJJJPI(device.address(), swapchain, timeout, semaphore, fence, pImageIndex, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") int[] pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pModes, 1);
        }
        return JNI.callPJPI(device.address(), surface, pModes, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") int[] pRectCount, @NativeType("VkRect2D *") VkRect2D.Buffer pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pRectCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pRects, pRectCount[0]);
        }
        return JNI.callPJPPI(physicalDevice.address(), surface, pRectCount, MemoryUtil.memAddressSafe(pRects), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(VkDevice device, @NativeType("VkAcquireNextImageInfoKHR const *") VkAcquireNextImageInfoKHR pAcquireInfo, @NativeType("uint32_t *") int[] pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pImageIndex, 1);
        }
        return JNI.callPPPI(device.address(), pAcquireInfo.address(), pImageIndex, __functionAddress);
    }
}
