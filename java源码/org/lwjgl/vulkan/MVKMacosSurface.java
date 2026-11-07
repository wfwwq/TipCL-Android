package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/MVKMacosSurface.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/MVKMacosSurface.class */
public class MVKMacosSurface {
    public static final int VK_MVK_MACOS_SURFACE_SPEC_VERSION = 3;
    public static final String VK_MVK_MACOS_SURFACE_EXTENSION_NAME = "VK_MVK_macos_surface";
    public static final int VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK = 1000123000;

    protected MVKMacosSurface() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateMacOSSurfaceMVK(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateMacOSSurfaceMVK;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateMacOSSurfaceMVK(VkInstance instance, @NativeType("VkMacOSSurfaceCreateInfoMVK const *") VkMacOSSurfaceCreateInfoMVK pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSurface, 1);
        }
        return nvkCreateMacOSSurfaceMVK(instance, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSurface));
    }

    @NativeType("VkResult")
    public static int vkCreateMacOSSurfaceMVK(VkInstance instance, @NativeType("VkMacOSSurfaceCreateInfoMVK const *") VkMacOSSurfaceCreateInfoMVK pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateMacOSSurfaceMVK;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSurface, 1);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSurface, __functionAddress);
    }
}
