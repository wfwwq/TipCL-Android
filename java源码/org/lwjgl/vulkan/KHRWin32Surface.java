package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRWin32Surface.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRWin32Surface.class */
public class KHRWin32Surface {
    public static final int VK_KHR_WIN32_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_WIN32_SURFACE_EXTENSION_NAME = "VK_KHR_win32_surface";
    public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000;

    protected KHRWin32Surface() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateWin32SurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateWin32SurfaceKHR(VkInstance instance, @NativeType("VkWin32SurfaceCreateInfoKHR const *") VkWin32SurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSurface, 1);
        }
        return nvkCreateWin32SurfaceKHR(instance, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSurface));
    }

    @NativeType("VkBool32")
    public static boolean vkGetPhysicalDeviceWin32PresentationSupportKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceWin32PresentationSupportKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPI(physicalDevice.address(), queueFamilyIndex, __functionAddress) != 0;
    }

    @NativeType("VkResult")
    public static int vkCreateWin32SurfaceKHR(VkInstance instance, @NativeType("VkWin32SurfaceCreateInfoKHR const *") VkWin32SurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSurface, 1);
            VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSurface, __functionAddress);
    }
}
