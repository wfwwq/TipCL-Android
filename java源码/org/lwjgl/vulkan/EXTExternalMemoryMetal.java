package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTExternalMemoryMetal.class */
public class EXTExternalMemoryMetal {
    public static final int VK_EXT_EXTERNAL_MEMORY_METAL_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTERNAL_MEMORY_METAL_EXTENSION_NAME = "VK_EXT_external_memory_metal";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT = 1000602000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT = 1000602001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT = 1000602002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLBUFFER_BIT_EXT = 65536;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLTEXTURE_BIT_EXT = 131072;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLHEAP_BIT_EXT = 262144;

    protected EXTExternalMemoryMetal() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetMemoryMetalHandleEXT(VkDevice device, long pGetMetalHandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetMemoryMetalHandleEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pGetMetalHandleInfo, pHandle, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryMetalHandleEXT(VkDevice device, @NativeType("VkMemoryGetMetalHandleInfoEXT const *") VkMemoryGetMetalHandleInfoEXT pGetMetalHandleInfo, @NativeType("void **") PointerBuffer pHandle) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pHandle, 1);
        }
        return nvkGetMemoryMetalHandleEXT(device, pGetMetalHandleInfo.address(), MemoryUtil.memAddress(pHandle));
    }

    public static int nvkGetMemoryMetalHandlePropertiesEXT(VkDevice device, int handleType, long pHandle, long pMemoryMetalHandleProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryMetalHandlePropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pHandle);
        }
        return JNI.callPPPI(device.address(), handleType, pHandle, pMemoryMetalHandleProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryMetalHandlePropertiesEXT(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, @NativeType("void const *") long pHandle, @NativeType("VkMemoryMetalHandlePropertiesEXT *") VkMemoryMetalHandlePropertiesEXT pMemoryMetalHandleProperties) {
        return nvkGetMemoryMetalHandlePropertiesEXT(device, handleType, pHandle, pMemoryMetalHandleProperties.address());
    }
}
