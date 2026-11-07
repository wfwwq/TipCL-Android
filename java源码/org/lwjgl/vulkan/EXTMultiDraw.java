package org.lwjgl.vulkan;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT;
import org.lwjgl.vulkan.VkMultiDrawInfoEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTMultiDraw.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTMultiDraw.class */
public class EXTMultiDraw {
    public static final int VK_EXT_MULTI_DRAW_SPEC_VERSION = 1;
    public static final String VK_EXT_MULTI_DRAW_EXTENSION_NAME = "VK_EXT_multi_draw";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT = 1000392000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT = 1000392001;

    protected EXTMultiDraw() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdDrawMultiEXT(VkCommandBuffer commandBuffer, int drawCount, long pVertexInfo, int instanceCount, int firstInstance, int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMultiEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), drawCount, pVertexInfo, instanceCount, firstInstance, stride, __functionAddress);
    }

    public static void vkCmdDrawMultiEXT(VkCommandBuffer commandBuffer, @NativeType("VkMultiDrawInfoEXT const *") VkMultiDrawInfoEXT.Buffer pVertexInfo, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("uint32_t") int stride) {
        nvkCmdDrawMultiEXT(commandBuffer, Checks.remainingSafe(pVertexInfo), MemoryUtil.memAddressSafe(pVertexInfo), instanceCount, firstInstance, stride);
    }

    public static void nvkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, int drawCount, long pIndexInfo, int instanceCount, int firstInstance, int stride, long pVertexOffset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMultiIndexedEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(commandBuffer.address(), drawCount, pIndexInfo, instanceCount, firstInstance, stride, pVertexOffset, __functionAddress);
    }

    public static void vkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkMultiDrawIndexedInfoEXT const *") VkMultiDrawIndexedInfoEXT.Buffer pIndexInfo, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("uint32_t") int stride, @NativeType("int32_t const *") IntBuffer pVertexOffset) {
        nvkCmdDrawMultiIndexedEXT(commandBuffer, Checks.remainingSafe(pIndexInfo), MemoryUtil.memAddressSafe(pIndexInfo), instanceCount, firstInstance, stride, MemoryUtil.memAddressSafe(pVertexOffset));
    }

    public static void vkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkMultiDrawIndexedInfoEXT const *") VkMultiDrawIndexedInfoEXT.Buffer pIndexInfo, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("uint32_t") int stride, @NativeType("int32_t const *") int[] pVertexOffset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMultiIndexedEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(commandBuffer.address(), Checks.remainingSafe(pIndexInfo), MemoryUtil.memAddressSafe(pIndexInfo), instanceCount, firstInstance, stride, pVertexOffset, __functionAddress);
    }
}
