package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDynamicRendering.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDynamicRendering.class */
public class KHRDynamicRendering {
    public static final int VK_KHR_DYNAMIC_RENDERING_SPEC_VERSION = 1;
    public static final String VK_KHR_DYNAMIC_RENDERING_EXTENSION_NAME = "VK_KHR_dynamic_rendering";
    public static final int VK_STRUCTURE_TYPE_RENDERING_INFO_KHR = 1000044000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR = 1000044001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR = 1000044002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR = 1000044003;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR = 1000044004;
    public static final int VK_ATTACHMENT_STORE_OP_NONE_KHR = 1000301000;
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR = 1;
    public static final int VK_RENDERING_SUSPENDING_BIT_KHR = 2;
    public static final int VK_RENDERING_RESUMING_BIT_KHR = 4;

    protected KHRDynamicRendering() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdBeginRenderingKHR(VkCommandBuffer commandBuffer, long pRenderingInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderingKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkRenderingInfo.validate(pRenderingInfo);
        }
        JNI.callPPV(commandBuffer.address(), pRenderingInfo, __functionAddress);
    }

    public static void vkCmdBeginRenderingKHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInfo const *") VkRenderingInfo pRenderingInfo) {
        nvkCmdBeginRenderingKHR(commandBuffer, pRenderingInfo.address());
    }

    public static void vkCmdEndRenderingKHR(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderingKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), __functionAddress);
    }
}
