package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTConditionalRendering.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTConditionalRendering.class */
public class EXTConditionalRendering {
    public static final int VK_EXT_CONDITIONAL_RENDERING_SPEC_VERSION = 2;
    public static final String VK_EXT_CONDITIONAL_RENDERING_EXTENSION_NAME = "VK_EXT_conditional_rendering";
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT = 1000081000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT = 1000081001;
    public static final int VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT = 1000081002;
    public static final int VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT = 1048576;
    public static final int VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT = 512;
    public static final int VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT = 262144;
    public static final int VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT = 1;

    protected EXTConditionalRendering() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdBeginConditionalRenderingEXT(VkCommandBuffer commandBuffer, long pConditionalRenderingBegin) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginConditionalRenderingEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pConditionalRenderingBegin, __functionAddress);
    }

    public static void vkCmdBeginConditionalRenderingEXT(VkCommandBuffer commandBuffer, @NativeType("VkConditionalRenderingBeginInfoEXT const *") VkConditionalRenderingBeginInfoEXT pConditionalRenderingBegin) {
        nvkCmdBeginConditionalRenderingEXT(commandBuffer, pConditionalRenderingBegin.address());
    }

    public static void vkCmdEndConditionalRenderingEXT(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndConditionalRenderingEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), __functionAddress);
    }
}
