package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVXImageViewHandle.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVXImageViewHandle.class */
public class NVXImageViewHandle {
    public static final int VK_NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION = 4;
    public static final String VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME = "VK_NVX_image_view_handle";
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX = 1000030000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX = 1000030001;

    protected NVXImageViewHandle() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetImageViewHandleNVX(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetImageViewHandleNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pInfo, __functionAddress);
    }

    @NativeType("uint32_t")
    public static int vkGetImageViewHandleNVX(VkDevice device, @NativeType("VkImageViewHandleInfoNVX const *") VkImageViewHandleInfoNVX pInfo) {
        return nvkGetImageViewHandleNVX(device, pInfo.address());
    }

    public static long nvkGetImageViewHandle64NVX(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetImageViewHandle64NVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPJ(device.address(), pInfo, __functionAddress);
    }

    @NativeType("uint64_t")
    public static long vkGetImageViewHandle64NVX(VkDevice device, @NativeType("VkImageViewHandleInfoNVX const *") VkImageViewHandleInfoNVX pInfo) {
        return nvkGetImageViewHandle64NVX(device, pInfo.address());
    }

    public static int nvkGetImageViewAddressNVX(VkDevice device, long imageView, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetImageViewAddressNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), imageView, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetImageViewAddressNVX(VkDevice device, @NativeType("VkImageView") long imageView, @NativeType("VkImageViewAddressPropertiesNVX *") VkImageViewAddressPropertiesNVX pProperties) {
        return nvkGetImageViewAddressNVX(device, imageView, pProperties.address());
    }

    @NativeType("uint64_t")
    public static long vkGetDeviceCombinedImageSamplerIndexNVX(VkDevice device, @NativeType("uint64_t") long imageViewIndex, @NativeType("uint64_t") long samplerIndex) {
        long __functionAddress = device.getCapabilities().vkGetDeviceCombinedImageSamplerIndexNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJJJ(device.address(), imageViewIndex, samplerIndex, __functionAddress);
    }
}
