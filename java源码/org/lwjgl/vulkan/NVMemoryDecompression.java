package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDecompressMemoryRegionNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVMemoryDecompression.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVMemoryDecompression.class */
public class NVMemoryDecompression {
    public static final int VK_NV_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;
    public static final String VK_NV_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_NV_memory_decompression";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV = 1000427000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV = 1000427001;

    protected NVMemoryDecompression() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdDecompressMemoryNV(VkCommandBuffer commandBuffer, int decompressRegionCount, long pDecompressMemoryRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecompressMemoryNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), decompressRegionCount, pDecompressMemoryRegions, __functionAddress);
    }

    public static void vkCmdDecompressMemoryNV(VkCommandBuffer commandBuffer, @NativeType("VkDecompressMemoryRegionNV const *") VkDecompressMemoryRegionNV.Buffer pDecompressMemoryRegions) {
        nvkCmdDecompressMemoryNV(commandBuffer, pDecompressMemoryRegions.remaining(), pDecompressMemoryRegions.address());
    }

    public static void vkCmdDecompressMemoryIndirectCountNV(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long indirectCommandsAddress, @NativeType("VkDeviceAddress") long indirectCommandsCountAddress, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecompressMemoryIndirectCountNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJV(commandBuffer.address(), indirectCommandsAddress, indirectCommandsCountAddress, stride, __functionAddress);
    }
}
