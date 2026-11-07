package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRMapMemory2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRMapMemory2.class */
public class KHRMapMemory2 {
    public static final int VK_KHR_MAP_MEMORY_2_SPEC_VERSION = 1;
    public static final String VK_KHR_MAP_MEMORY_2_EXTENSION_NAME = "VK_KHR_map_memory2";
    public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR = 1000271000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR = 1000271001;

    protected KHRMapMemory2() {
        throw new UnsupportedOperationException();
    }

    public static int nvkMapMemory2KHR(VkDevice device, long pMemoryMapInfo, long ppData) {
        long __functionAddress = device.getCapabilities().vkMapMemory2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pMemoryMapInfo, ppData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkMapMemory2KHR(VkDevice device, @NativeType("VkMemoryMapInfo const *") VkMemoryMapInfo pMemoryMapInfo, @NativeType("void **") PointerBuffer ppData) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ppData, 1);
        }
        return nvkMapMemory2KHR(device, pMemoryMapInfo.address(), MemoryUtil.memAddress(ppData));
    }

    public static int nvkUnmapMemory2KHR(VkDevice device, long pMemoryUnmapInfo) {
        long __functionAddress = device.getCapabilities().vkUnmapMemory2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pMemoryUnmapInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkUnmapMemory2KHR(VkDevice device, @NativeType("VkMemoryUnmapInfo const *") VkMemoryUnmapInfo pMemoryUnmapInfo) {
        return nvkUnmapMemory2KHR(device, pMemoryUnmapInfo.address());
    }
}
