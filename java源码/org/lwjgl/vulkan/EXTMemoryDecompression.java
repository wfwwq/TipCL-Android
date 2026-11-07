package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTMemoryDecompression.class */
public class EXTMemoryDecompression {
    public static final int VK_EXT_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;
    public static final String VK_EXT_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_EXT_memory_decompression";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT = 1000427000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT = 1000427001;
    public static final int VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT = 1000550002;
    public static final long VK_PIPELINE_STAGE_2_MEMORY_DECOMPRESSION_BIT_EXT = 35184372088832L;
    public static final long VK_ACCESS_2_MEMORY_DECOMPRESSION_READ_BIT_EXT = 36028797018963968L;
    public static final long VK_ACCESS_2_MEMORY_DECOMPRESSION_WRITE_BIT_EXT = 72057594037927936L;
    public static final long VK_BUFFER_USAGE_2_MEMORY_DECOMPRESSION_BIT_EXT = 4294967296L;
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_EXT = 1;
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV = 1;

    protected EXTMemoryDecompression() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdDecompressMemoryEXT(VkCommandBuffer commandBuffer, long pDecompressMemoryInfoEXT) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecompressMemoryEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDecompressMemoryInfoEXT.validate(pDecompressMemoryInfoEXT);
        }
        JNI.callPPV(commandBuffer.address(), pDecompressMemoryInfoEXT, __functionAddress);
    }

    public static void vkCmdDecompressMemoryEXT(VkCommandBuffer commandBuffer, @NativeType("VkDecompressMemoryInfoEXT const *") VkDecompressMemoryInfoEXT pDecompressMemoryInfoEXT) {
        nvkCmdDecompressMemoryEXT(commandBuffer, pDecompressMemoryInfoEXT.address());
    }

    public static void vkCmdDecompressMemoryIndirectCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkMemoryDecompressionMethodFlagsEXT") long decompressionMethod, @NativeType("VkDeviceAddress") long indirectCommandsAddress, @NativeType("VkDeviceAddress") long indirectCommandsCountAddress, @NativeType("uint32_t") int maxDecompressionCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecompressMemoryIndirectCountEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJJV(commandBuffer.address(), decompressionMethod, indirectCommandsAddress, indirectCommandsCountAddress, maxDecompressionCount, stride, __functionAddress);
    }
}
