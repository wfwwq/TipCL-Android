package org.lwjgl.vulkan;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVScissorExclusive.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVScissorExclusive.class */
public class NVScissorExclusive {
    public static final int VK_NV_SCISSOR_EXCLUSIVE_SPEC_VERSION = 2;
    public static final String VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME = "VK_NV_scissor_exclusive";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV = 1000205000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV = 1000205002;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV = 1000205000;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV = 1000205001;

    protected NVScissorExclusive() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, long pExclusiveScissorEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorEnableNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissorEnables, __functionAddress);
    }

    public static void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkBool32 const *") IntBuffer pExclusiveScissorEnables) {
        nvkCmdSetExclusiveScissorEnableNV(commandBuffer, firstExclusiveScissor, pExclusiveScissorEnables.remaining(), MemoryUtil.memAddress(pExclusiveScissorEnables));
    }

    public static void nvkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, long pExclusiveScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors, __functionAddress);
    }

    public static void vkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkRect2D const *") VkRect2D.Buffer pExclusiveScissors) {
        nvkCmdSetExclusiveScissorNV(commandBuffer, firstExclusiveScissor, pExclusiveScissors.remaining(), pExclusiveScissors.address());
    }

    public static void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkBool32 const *") int[] pExclusiveScissorEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorEnableNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstExclusiveScissor, pExclusiveScissorEnables.length, pExclusiveScissorEnables, __functionAddress);
    }
}
