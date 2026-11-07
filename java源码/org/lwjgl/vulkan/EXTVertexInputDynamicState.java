package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkVertexInputAttributeDescription2EXT;
import org.lwjgl.vulkan.VkVertexInputBindingDescription2EXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTVertexInputDynamicState.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTVertexInputDynamicState.class */
public class EXTVertexInputDynamicState {
    public static final int VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_SPEC_VERSION = 2;
    public static final String VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_vertex_input_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT = 1000352000;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT = 1000352001;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT = 1000352002;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_EXT = 1000352000;

    protected EXTVertexInputDynamicState() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, int vertexBindingDescriptionCount, long pVertexBindingDescriptions, int vertexAttributeDescriptionCount, long pVertexAttributeDescriptions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetVertexInputEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(commandBuffer.address(), vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions, __functionAddress);
    }

    public static void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, @NativeType("VkVertexInputBindingDescription2EXT const *") VkVertexInputBindingDescription2EXT.Buffer pVertexBindingDescriptions, @NativeType("VkVertexInputAttributeDescription2EXT const *") VkVertexInputAttributeDescription2EXT.Buffer pVertexAttributeDescriptions) {
        nvkCmdSetVertexInputEXT(commandBuffer, Checks.remainingSafe(pVertexBindingDescriptions), MemoryUtil.memAddressSafe(pVertexBindingDescriptions), Checks.remainingSafe(pVertexAttributeDescriptions), MemoryUtil.memAddressSafe(pVertexAttributeDescriptions));
    }
}
