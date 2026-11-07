package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDepthClampControl.class */
public class EXTDepthClampControl {
    public static final int VK_EXT_DEPTH_CLAMP_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_DEPTH_CLAMP_CONTROL_EXTENSION_NAME = "VK_EXT_depth_clamp_control";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT = 1000582000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT = 1000582001;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT = 1000582000;

    protected EXTDepthClampControl() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, int depthClampMode, long pDepthClampRange) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClampRangeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), depthClampMode, pDepthClampRange, __functionAddress);
    }

    public static void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, @NativeType("VkDepthClampModeEXT") int depthClampMode, @NativeType("VkDepthClampRangeEXT const *") VkDepthClampRangeEXT pDepthClampRange) {
        nvkCmdSetDepthClampRangeEXT(commandBuffer, depthClampMode, MemoryUtil.memAddressSafe(pDepthClampRange));
    }
}
