package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRXcbSurface.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRXcbSurface.class */
public class KHRXcbSurface {
    public static final int VK_KHR_XCB_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_XCB_SURFACE_EXTENSION_NAME = "VK_KHR_xcb_surface";
    public static final int VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR = 1000005000;

    protected KHRXcbSurface() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateXcbSurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateXcbSurfaceKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateXcbSurfaceKHR(VkInstance instance, @NativeType("VkXcbSurfaceCreateInfoKHR const *") VkXcbSurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSurface, 1);
        }
        return nvkCreateXcbSurfaceKHR(instance, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSurface));
    }

    @NativeType("VkBool32")
    public static boolean vkGetPhysicalDeviceXcbPresentationSupportKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("xcb_connection_t *") long connection, @NativeType("xcb_visualid_t") int visual_id) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceXcbPresentationSupportKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(connection);
        }
        return JNI.callPPI(physicalDevice.address(), queueFamilyIndex, connection, visual_id, __functionAddress) != 0;
    }

    @NativeType("VkResult")
    public static int vkCreateXcbSurfaceKHR(VkInstance instance, @NativeType("VkXcbSurfaceCreateInfoKHR const *") VkXcbSurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateXcbSurfaceKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSurface, 1);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSurface, __functionAddress);
    }
}
