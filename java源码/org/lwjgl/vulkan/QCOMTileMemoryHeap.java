package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/QCOMTileMemoryHeap.class */
public class QCOMTileMemoryHeap {
    public static final int VK_QCOM_TILE_MEMORY_HEAP_SPEC_VERSION = 1;
    public static final String VK_QCOM_TILE_MEMORY_HEAP_EXTENSION_NAME = "VK_QCOM_tile_memory_heap";
    public static final int VK_MEMORY_HEAP_TILE_MEMORY_BIT_QCOM = 8;
    public static final int VK_BUFFER_USAGE_TILE_MEMORY_BIT_QCOM = 134217728;
    public static final long VK_BUFFER_USAGE_2_TILE_MEMORY_BIT_QCOM = 134217728;
    public static final int VK_IMAGE_USAGE_TILE_MEMORY_BIT_QCOM = 134217728;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM = 1000547000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM = 1000547001;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM = 1000547002;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM = 1000547003;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM = 1000547004;

    protected QCOMTileMemoryHeap() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdBindTileMemoryQCOM(VkCommandBuffer commandBuffer, long pTileMemoryBindInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTileMemoryQCOM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pTileMemoryBindInfo, __functionAddress);
    }

    public static void vkCmdBindTileMemoryQCOM(VkCommandBuffer commandBuffer, @NativeType("VkTileMemoryBindInfoQCOM const *") VkTileMemoryBindInfoQCOM pTileMemoryBindInfo) {
        nvkCmdBindTileMemoryQCOM(commandBuffer, MemoryUtil.memAddressSafe(pTileMemoryBindInfo));
    }
}
