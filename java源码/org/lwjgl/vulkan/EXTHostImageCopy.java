package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTHostImageCopy.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTHostImageCopy.class */
public class EXTHostImageCopy {
    public static final int VK_EXT_HOST_IMAGE_COPY_SPEC_VERSION = 1;
    public static final String VK_EXT_HOST_IMAGE_COPY_EXTENSION_NAME = "VK_EXT_host_image_copy";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT = 1000270000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT = 1000270001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT = 1000270002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT = 1000270003;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT = 1000270004;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT = 1000270005;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT = 1000270006;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT = 1000270007;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT = 1000270008;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT = 1000270009;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT = 4194304;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT = 70368744177664L;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_BIT_EXT = 1;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_EXT = 1;

    protected EXTHostImageCopy() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCopyMemoryToImageEXT(VkDevice device, long pCopyMemoryToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToImageEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyMemoryToImageInfo.validate(pCopyMemoryToImageInfo);
        }
        return JNI.callPPI(device.address(), pCopyMemoryToImageInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyMemoryToImageEXT(VkDevice device, @NativeType("VkCopyMemoryToImageInfo const *") VkCopyMemoryToImageInfo pCopyMemoryToImageInfo) {
        return nvkCopyMemoryToImageEXT(device, pCopyMemoryToImageInfo.address());
    }

    public static int nvkCopyImageToMemoryEXT(VkDevice device, long pCopyImageToMemoryInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToMemoryEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyImageToMemoryInfo.validate(pCopyImageToMemoryInfo);
        }
        return JNI.callPPI(device.address(), pCopyImageToMemoryInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyImageToMemoryEXT(VkDevice device, @NativeType("VkCopyImageToMemoryInfo const *") VkCopyImageToMemoryInfo pCopyImageToMemoryInfo) {
        return nvkCopyImageToMemoryEXT(device, pCopyImageToMemoryInfo.address());
    }

    public static int nvkCopyImageToImageEXT(VkDevice device, long pCopyImageToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToImageEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyImageToImageInfo.validate(pCopyImageToImageInfo);
        }
        return JNI.callPPI(device.address(), pCopyImageToImageInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyImageToImageEXT(VkDevice device, @NativeType("VkCopyImageToImageInfo const *") VkCopyImageToImageInfo pCopyImageToImageInfo) {
        return nvkCopyImageToImageEXT(device, pCopyImageToImageInfo.address());
    }

    public static int nvkTransitionImageLayoutEXT(VkDevice device, int transitionCount, long pTransitions) {
        long __functionAddress = device.getCapabilities().vkTransitionImageLayoutEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), transitionCount, pTransitions, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkTransitionImageLayoutEXT(VkDevice device, @NativeType("VkHostImageLayoutTransitionInfo const *") VkHostImageLayoutTransitionInfo.Buffer pTransitions) {
        return nvkTransitionImageLayoutEXT(device, pTransitions.remaining(), pTransitions.address());
    }

    public static void nvkGetImageSubresourceLayout2EXT(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout2EXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    public static void vkGetImageSubresourceLayout2EXT(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2 const *") VkImageSubresource2 pSubresource, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetImageSubresourceLayout2EXT(device, image, pSubresource.address(), pLayout.address());
    }
}
