package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRAndroidSurface.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRAndroidSurface.class */
public class KHRAndroidSurface {
    public static final int VK_KHR_ANDROID_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_ANDROID_SURFACE_EXTENSION_NAME = "VK_KHR_android_surface";
    public static final int VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR = 1000008000;

    protected KHRAndroidSurface() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateAndroidSurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateAndroidSurfaceKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateAndroidSurfaceKHR(VkInstance instance, @NativeType("VkAndroidSurfaceCreateInfoKHR const *") VkAndroidSurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSurface, 1);
        }
        return nvkCreateAndroidSurfaceKHR(instance, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSurface));
    }

    @NativeType("VkResult")
    public static int vkCreateAndroidSurfaceKHR(VkInstance instance, @NativeType("VkAndroidSurfaceCreateInfoKHR const *") VkAndroidSurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateAndroidSurfaceKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSurface, 1);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSurface, __functionAddress);
    }
}
