package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRCopyMemoryIndirect.class */
public class KHRCopyMemoryIndirect {
    public static final int VK_KHR_COPY_MEMORY_INDIRECT_SPEC_VERSION = 1;
    public static final String VK_KHR_COPY_MEMORY_INDIRECT_EXTENSION_NAME = "VK_KHR_copy_memory_indirect";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR = 1000426001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR = 1000549000;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR = 1000549002;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR = 1000549003;
    public static final long VK_PIPELINE_STAGE_2_COPY_INDIRECT_BIT_KHR = 70368744177664L;
    public static final long VK_FORMAT_FEATURE_2_COPY_IMAGE_INDIRECT_DST_BIT_KHR = 576460752303423488L;
    public static final int VK_ADDRESS_COPY_DEVICE_LOCAL_BIT_KHR = 1;
    public static final int VK_ADDRESS_COPY_SPARSE_BIT_KHR = 2;
    public static final int VK_ADDRESS_COPY_PROTECTED_BIT_KHR = 4;

    protected KHRCopyMemoryIndirect() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdCopyMemoryIndirectKHR(VkCommandBuffer commandBuffer, long pCopyMemoryIndirectInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryIndirectKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pCopyMemoryIndirectInfo, __functionAddress);
    }

    public static void vkCmdCopyMemoryIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryIndirectInfoKHR const *") VkCopyMemoryIndirectInfoKHR pCopyMemoryIndirectInfo) {
        nvkCmdCopyMemoryIndirectKHR(commandBuffer, pCopyMemoryIndirectInfo.address());
    }

    public static void nvkCmdCopyMemoryToImageIndirectKHR(VkCommandBuffer commandBuffer, long pCopyMemoryToImageIndirectInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToImageIndirectKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyMemoryToImageIndirectInfoKHR.validate(pCopyMemoryToImageIndirectInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyMemoryToImageIndirectInfo, __functionAddress);
    }

    public static void vkCmdCopyMemoryToImageIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryToImageIndirectInfoKHR const *") VkCopyMemoryToImageIndirectInfoKHR pCopyMemoryToImageIndirectInfo) {
        nvkCmdCopyMemoryToImageIndirectKHR(commandBuffer, pCopyMemoryToImageIndirectInfo.address());
    }
}
