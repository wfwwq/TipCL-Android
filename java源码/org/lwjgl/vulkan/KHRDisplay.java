package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDisplayModePropertiesKHR;
import org.lwjgl.vulkan.VkDisplayPlanePropertiesKHR;
import org.lwjgl.vulkan.VkDisplayPropertiesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDisplay.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDisplay.class */
public class KHRDisplay {
    public static final int VK_KHR_DISPLAY_SPEC_VERSION = 23;
    public static final String VK_KHR_DISPLAY_EXTENSION_NAME = "VK_KHR_display";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR = 1000002000;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = 1000002001;
    public static final int VK_OBJECT_TYPE_DISPLAY_KHR = 1000002000;
    public static final int VK_OBJECT_TYPE_DISPLAY_MODE_KHR = 1000002001;
    public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 1;
    public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 2;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 4;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 8;

    protected KHRDisplay() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayPropertiesKHR *") VkDisplayPropertiesKHR.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayPlanePropertiesKHR *") VkDisplayPlanePropertiesKHR.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, int planeIndex, long pDisplayCount, long pDisplays) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneSupportedDisplaysKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), planeIndex, pDisplayCount, pDisplays, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int planeIndex, @NativeType("uint32_t *") IntBuffer pDisplayCount, @NativeType("VkDisplayKHR *") LongBuffer pDisplays) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pDisplayCount, 1);
            Checks.checkSafe((Buffer) pDisplays, pDisplayCount.get(pDisplayCount.position()));
        }
        return nvkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice, planeIndex, MemoryUtil.memAddress(pDisplayCount), MemoryUtil.memAddressSafe(pDisplays));
    }

    public static int nvkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, long display, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModePropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(physicalDevice.address(), display, pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayModePropertiesKHR *") VkDisplayModePropertiesKHR.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetDisplayModePropertiesKHR(physicalDevice, display, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, long display, long pCreateInfo, long pAllocator, long pMode) {
        long __functionAddress = physicalDevice.getCapabilities().vkCreateDisplayModeKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPPI(physicalDevice.address(), display, pCreateInfo, pAllocator, pMode, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayModeCreateInfoKHR const *") VkDisplayModeCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDisplayModeKHR *") LongBuffer pMode) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pMode, 1);
        }
        return nvkCreateDisplayModeKHR(physicalDevice, display, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pMode));
    }

    public static int nvkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, long mode, int planeIndex, long pCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneCapabilitiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(physicalDevice.address(), mode, planeIndex, pCapabilities, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayModeKHR") long mode, @NativeType("uint32_t") int planeIndex, @NativeType("VkDisplayPlaneCapabilitiesKHR *") VkDisplayPlaneCapabilitiesKHR pCapabilities) {
        return nvkGetDisplayPlaneCapabilitiesKHR(physicalDevice, mode, planeIndex, pCapabilities.address());
    }

    public static int nvkCreateDisplayPlaneSurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateDisplayPlaneSurfaceKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, @NativeType("VkDisplaySurfaceCreateInfoKHR const *") VkDisplaySurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSurface, 1);
        }
        return nvkCreateDisplayPlaneSurfaceKHR(instance, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSurface));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayPropertiesKHR *") VkDisplayPropertiesKHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayPlanePropertiesKHR *") VkDisplayPlanePropertiesKHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int planeIndex, @NativeType("uint32_t *") int[] pDisplayCount, @NativeType("VkDisplayKHR *") long[] pDisplays) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneSupportedDisplaysKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pDisplayCount, 1);
            Checks.checkSafe(pDisplays, pDisplayCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), planeIndex, pDisplayCount, pDisplays, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayModePropertiesKHR *") VkDisplayModePropertiesKHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModePropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPJPPI(physicalDevice.address(), display, pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayModeCreateInfoKHR const *") VkDisplayModeCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDisplayModeKHR *") long[] pMode) {
        long __functionAddress = physicalDevice.getCapabilities().vkCreateDisplayModeKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pMode, 1);
        }
        return JNI.callPJPPPI(physicalDevice.address(), display, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pMode, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, @NativeType("VkDisplaySurfaceCreateInfoKHR const *") VkDisplaySurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateDisplayPlaneSurfaceKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSurface, 1);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSurface, __functionAddress);
    }
}
