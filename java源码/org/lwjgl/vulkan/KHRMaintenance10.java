package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRMaintenance10.class */
public class KHRMaintenance10 {
    public static final int VK_KHR_MAINTENANCE_10_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_10_EXTENSION_NAME = "VK_KHR_maintenance10";
    public static final int VK_STRUCTURE_TYPE_RENDERING_END_INFO_KHR = 1000619003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR = 1000630000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_PROPERTIES_KHR = 1000630001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR = 1000630002;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR = 1000630004;
    public static final int VK_ATTACHMENT_DESCRIPTION_RESOLVE_SKIP_TRANSFER_FUNCTION_BIT_KHR = 2;
    public static final int VK_ATTACHMENT_DESCRIPTION_RESOLVE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 4;
    public static final int VK_RENDERING_LOCAL_READ_CONCURRENT_ACCESS_CONTROL_BIT_KHR = 256;
    public static final int VK_RENDERING_ATTACHMENT_INPUT_ATTACHMENT_FEEDBACK_BIT_KHR = 1;
    public static final int VK_RENDERING_ATTACHMENT_RESOLVE_SKIP_TRANSFER_FUNCTION_BIT_KHR = 2;
    public static final int VK_RENDERING_ATTACHMENT_RESOLVE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 4;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_COPY_ON_COMPUTE_QUEUE_BIT_KHR = 4503599627370496L;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_COPY_ON_TRANSFER_QUEUE_BIT_KHR = 9007199254740992L;
    public static final long VK_FORMAT_FEATURE_2_STENCIL_COPY_ON_COMPUTE_QUEUE_BIT_KHR = 18014398509481984L;
    public static final long VK_FORMAT_FEATURE_2_STENCIL_COPY_ON_TRANSFER_QUEUE_BIT_KHR = 36028797018963968L;
    public static final int VK_RESOLVE_IMAGE_SKIP_TRANSFER_FUNCTION_BIT_KHR = 1;
    public static final int VK_RESOLVE_IMAGE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 2;

    protected KHRMaintenance10() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdEndRendering2KHR(VkCommandBuffer commandBuffer, long pRenderingEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRendering2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pRenderingEndInfo, __functionAddress);
    }

    public static void vkCmdEndRendering2KHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingEndInfoKHR const *") VkRenderingEndInfoKHR pRenderingEndInfo) {
        nvkCmdEndRendering2KHR(commandBuffer, MemoryUtil.memAddressSafe(pRenderingEndInfo));
    }
}
