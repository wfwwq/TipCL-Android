package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRMaintenance6.class */
public class KHRMaintenance6 {
    public static final int VK_KHR_MAINTENANCE_6_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_6_EXTENSION_NAME = "VK_KHR_maintenance6";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR = 1000545000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR = 1000545001;
    public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR = 1000545002;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR = 1000545003;
    public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR = 1000545004;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR = 1000545005;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR = 1000545006;
    public static final int VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT = 1000545007;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT = 1000545008;

    protected KHRMaintenance6() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdBindDescriptorSets2KHR(VkCommandBuffer commandBuffer, long pBindDescriptorSetsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkBindDescriptorSetsInfo.validate(pBindDescriptorSetsInfo);
        }
        JNI.callPPV(commandBuffer.address(), pBindDescriptorSetsInfo, __functionAddress);
    }

    public static void vkCmdBindDescriptorSets2KHR(VkCommandBuffer commandBuffer, @NativeType("VkBindDescriptorSetsInfo const *") VkBindDescriptorSetsInfo pBindDescriptorSetsInfo) {
        nvkCmdBindDescriptorSets2KHR(commandBuffer, pBindDescriptorSetsInfo.address());
    }

    public static void nvkCmdPushConstants2KHR(VkCommandBuffer commandBuffer, long pPushConstantsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPushConstantsInfo.validate(pPushConstantsInfo);
        }
        JNI.callPPV(commandBuffer.address(), pPushConstantsInfo, __functionAddress);
    }

    public static void vkCmdPushConstants2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPushConstantsInfo const *") VkPushConstantsInfo pPushConstantsInfo) {
        nvkCmdPushConstants2KHR(commandBuffer, pPushConstantsInfo.address());
    }

    public static void nvkCmdPushDescriptorSet2KHR(VkCommandBuffer commandBuffer, long pPushDescriptorSetInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSet2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPushDescriptorSetInfo.validate(pPushDescriptorSetInfo);
        }
        JNI.callPPV(commandBuffer.address(), pPushDescriptorSetInfo, __functionAddress);
    }

    public static void vkCmdPushDescriptorSet2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetInfo const *") VkPushDescriptorSetInfo pPushDescriptorSetInfo) {
        nvkCmdPushDescriptorSet2KHR(commandBuffer, pPushDescriptorSetInfo.address());
    }

    public static void nvkCmdPushDescriptorSetWithTemplate2KHR(VkCommandBuffer commandBuffer, long pPushDescriptorSetWithTemplateInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplate2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPushDescriptorSetWithTemplateInfo.validate(pPushDescriptorSetWithTemplateInfo);
        }
        JNI.callPPV(commandBuffer.address(), pPushDescriptorSetWithTemplateInfo, __functionAddress);
    }

    public static void vkCmdPushDescriptorSetWithTemplate2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetWithTemplateInfo const *") VkPushDescriptorSetWithTemplateInfo pPushDescriptorSetWithTemplateInfo) {
        nvkCmdPushDescriptorSetWithTemplate2KHR(commandBuffer, pPushDescriptorSetWithTemplateInfo.address());
    }

    public static void nvkCmdSetDescriptorBufferOffsets2EXT(VkCommandBuffer commandBuffer, long pSetDescriptorBufferOffsetsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDescriptorBufferOffsets2EXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkSetDescriptorBufferOffsetsInfoEXT.validate(pSetDescriptorBufferOffsetsInfo);
        }
        JNI.callPPV(commandBuffer.address(), pSetDescriptorBufferOffsetsInfo, __functionAddress);
    }

    public static void vkCmdSetDescriptorBufferOffsets2EXT(VkCommandBuffer commandBuffer, @NativeType("VkSetDescriptorBufferOffsetsInfoEXT const *") VkSetDescriptorBufferOffsetsInfoEXT pSetDescriptorBufferOffsetsInfo) {
        nvkCmdSetDescriptorBufferOffsets2EXT(commandBuffer, pSetDescriptorBufferOffsetsInfo.address());
    }

    public static void nvkCmdBindDescriptorBufferEmbeddedSamplers2EXT(VkCommandBuffer commandBuffer, long pBindDescriptorBufferEmbeddedSamplersInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pBindDescriptorBufferEmbeddedSamplersInfo, __functionAddress);
    }

    public static void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(VkCommandBuffer commandBuffer, @NativeType("VkBindDescriptorBufferEmbeddedSamplersInfoEXT const *") VkBindDescriptorBufferEmbeddedSamplersInfoEXT pBindDescriptorBufferEmbeddedSamplersInfo) {
        nvkCmdBindDescriptorBufferEmbeddedSamplers2EXT(commandBuffer, pBindDescriptorBufferEmbeddedSamplersInfo.address());
    }
}
