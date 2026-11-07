package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVExternalMemoryCapabilities.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVExternalMemoryCapabilities.class */
public class NVExternalMemoryCapabilities {
    public static final int VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_NV_external_memory_capabilities";
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV = 1;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV = 2;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV = 4;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV = 8;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV = 1;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV = 2;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV = 4;

    protected NVExternalMemoryCapabilities() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, int externalHandleType, long pExternalImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalImageFormatPropertiesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(physicalDevice.address(), format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkImageType") int type, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usage, @NativeType("VkImageCreateFlags") int flags, @NativeType("VkExternalMemoryHandleTypeFlagsNV") int externalHandleType, @NativeType("VkExternalImageFormatPropertiesNV *") VkExternalImageFormatPropertiesNV pExternalImageFormatProperties) {
        return nvkGetPhysicalDeviceExternalImageFormatPropertiesNV(physicalDevice, format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties.address());
    }
}
