package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageSubresourceLayers;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVCopyMemoryIndirect.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVCopyMemoryIndirect.class */
public class NVCopyMemoryIndirect {
    public static final int VK_NV_COPY_MEMORY_INDIRECT_SPEC_VERSION = 1;
    public static final String VK_NV_COPY_MEMORY_INDIRECT_EXTENSION_NAME = "VK_NV_copy_memory_indirect";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV = 1000426000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV = 1000426001;

    protected NVCopyMemoryIndirect() {
        throw new UnsupportedOperationException();
    }

    public static void vkCmdCopyMemoryIndirectNV(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long copyBufferAddress, @NativeType("uint32_t") int copyCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryIndirectNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJV(commandBuffer.address(), copyBufferAddress, copyCount, stride, __functionAddress);
    }

    public static void nvkCmdCopyMemoryToImageIndirectNV(VkCommandBuffer commandBuffer, long copyBufferAddress, int copyCount, int stride, long dstImage, int dstImageLayout, long pImageSubresources) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToImageIndirectNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJPV(commandBuffer.address(), copyBufferAddress, copyCount, stride, dstImage, dstImageLayout, pImageSubresources, __functionAddress);
    }

    public static void vkCmdCopyMemoryToImageIndirectNV(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long copyBufferAddress, @NativeType("uint32_t") int stride, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageSubresourceLayers const *") VkImageSubresourceLayers.Buffer pImageSubresources) {
        nvkCmdCopyMemoryToImageIndirectNV(commandBuffer, copyBufferAddress, pImageSubresources.remaining(), stride, dstImage, dstImageLayout, pImageSubresources.address());
    }
}
