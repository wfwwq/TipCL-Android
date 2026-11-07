package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkViewportWScalingNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVClipSpaceWScaling.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVClipSpaceWScaling.class */
public class NVClipSpaceWScaling {
    public static final int VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION = 1;
    public static final String VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME = "VK_NV_clip_space_w_scaling";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV = 1000087000;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV = 1000087000;

    protected NVClipSpaceWScaling() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewportWScalings) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWScalingNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstViewport, viewportCount, pViewportWScalings, __functionAddress);
    }

    public static void vkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkViewportWScalingNV const *") VkViewportWScalingNV.Buffer pViewportWScalings) {
        nvkCmdSetViewportWScalingNV(commandBuffer, firstViewport, pViewportWScalings.remaining(), pViewportWScalings.address());
    }
}
