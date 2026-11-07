package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo;
import org.lwjgl.vulkan.VkWriteDescriptorSet;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK14.class */
public class VK14 extends VK13 {
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES = 55;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES = 56;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO = 1000068000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES = 1000068001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES = 1000068002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES = 1000080000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO = 1000174000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO = 1000190001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES = 1000190002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES = 1000232000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO = 1000232001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO = 1000232002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES = 1000259000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO = 1000259001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES = 1000259002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES = 1000265000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES = 1000270000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES = 1000270001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY = 1000270002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY = 1000270003;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO = 1000270004;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO = 1000270005;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO = 1000270006;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO = 1000270007;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE = 1000270008;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY = 1000270009;
    public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO = 1000271000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO = 1000271001;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 = 1000338003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES = 1000388000;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES = 1000388001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES = 1000416000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES = 1000466000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES = 1000470000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES = 1000470001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_AREA_INFO = 1000470003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO = 1000470004;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO = 1000470005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO = 1000470006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES = 1000525000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES = 1000528000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES = 1000544000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES = 1000545000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES = 1000545001;
    public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS = 1000545002;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO = 1000545003;
    public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO = 1000545004;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO = 1000545005;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO = 1000545006;
    public static final int VK_ERROR_NOT_PERMITTED = -1000174001;
    public static final int VK_INDEX_TYPE_UINT8 = 1000265000;
    public static final int VK_FORMAT_A1B5G5R5_UNORM_PACK16 = 1000470000;
    public static final int VK_FORMAT_A8_UNORM = 1000470001;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT = 1;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT = 2;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT = 4;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT = 8;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT = 16;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT = 32;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT = 64;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT = 128;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT = 256;
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT = 131072;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT = 4194304;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT = 70368744177664L;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_BIT = 512;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT = 1024;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT = 1;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS = 1;
    public static final int VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT = 134217728;
    public static final int VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT = 1073741824;
    public static final int VK_ATTACHMENT_LOAD_OP_NONE = 1000400000;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE = 1000259000;
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ = 1000232000;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2 = 3;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2 = 3;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME = 1024;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_BIT = 1;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY = 1;
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT = 1;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT = 2;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT = 4;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 8;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT = 16;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 256;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT = 512;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT = 134217728;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT = 1073741824;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH = 3;
    public static final int VK_API_VERSION_1_4 = VK_MAKE_API_VERSION(0, 1, 4, 0);
    public static final int VK_MAX_GLOBAL_PRIORITY_SIZE = 16;

    protected VK14() {
        throw new UnsupportedOperationException();
    }

    public static int nvkMapMemory2(VkDevice device, long pMemoryMapInfo, long ppData) {
        long __functionAddress = device.getCapabilities().vkMapMemory2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pMemoryMapInfo, ppData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkMapMemory2(VkDevice device, @NativeType("VkMemoryMapInfo const *") VkMemoryMapInfo pMemoryMapInfo, @NativeType("void **") PointerBuffer ppData) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ppData, 1);
        }
        return nvkMapMemory2(device, pMemoryMapInfo.address(), MemoryUtil.memAddress(ppData));
    }

    public static int nvkUnmapMemory2(VkDevice device, long pMemoryUnmapInfo) {
        long __functionAddress = device.getCapabilities().vkUnmapMemory2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pMemoryUnmapInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkUnmapMemory2(VkDevice device, @NativeType("VkMemoryUnmapInfo const *") VkMemoryUnmapInfo pMemoryUnmapInfo) {
        return nvkUnmapMemory2(device, pMemoryUnmapInfo.address());
    }

    public static void nvkGetDeviceImageSubresourceLayout(VkDevice device, long pInfo, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSubresourceLayout;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDeviceImageSubresourceInfo.validate(pInfo);
        }
        JNI.callPPPV(device.address(), pInfo, pLayout, __functionAddress);
    }

    public static void vkGetDeviceImageSubresourceLayout(VkDevice device, @NativeType("VkDeviceImageSubresourceInfo const *") VkDeviceImageSubresourceInfo pInfo, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetDeviceImageSubresourceLayout(device, pInfo.address(), pLayout.address());
    }

    public static void nvkGetImageSubresourceLayout2(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    public static void vkGetImageSubresourceLayout2(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2 const *") VkImageSubresource2 pSubresource, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetImageSubresourceLayout2(device, image, pSubresource.address(), pLayout.address());
    }

    public static int nvkCopyMemoryToImage(VkDevice device, long pCopyMemoryToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToImage;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyMemoryToImageInfo.validate(pCopyMemoryToImageInfo);
        }
        return JNI.callPPI(device.address(), pCopyMemoryToImageInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyMemoryToImage(VkDevice device, @NativeType("VkCopyMemoryToImageInfo const *") VkCopyMemoryToImageInfo pCopyMemoryToImageInfo) {
        return nvkCopyMemoryToImage(device, pCopyMemoryToImageInfo.address());
    }

    public static int nvkCopyImageToMemory(VkDevice device, long pCopyImageToMemoryInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToMemory;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyImageToMemoryInfo.validate(pCopyImageToMemoryInfo);
        }
        return JNI.callPPI(device.address(), pCopyImageToMemoryInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyImageToMemory(VkDevice device, @NativeType("VkCopyImageToMemoryInfo const *") VkCopyImageToMemoryInfo pCopyImageToMemoryInfo) {
        return nvkCopyImageToMemory(device, pCopyImageToMemoryInfo.address());
    }

    public static int nvkCopyImageToImage(VkDevice device, long pCopyImageToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToImage;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyImageToImageInfo.validate(pCopyImageToImageInfo);
        }
        return JNI.callPPI(device.address(), pCopyImageToImageInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyImageToImage(VkDevice device, @NativeType("VkCopyImageToImageInfo const *") VkCopyImageToImageInfo pCopyImageToImageInfo) {
        return nvkCopyImageToImage(device, pCopyImageToImageInfo.address());
    }

    public static int nvkTransitionImageLayout(VkDevice device, int transitionCount, long pTransitions) {
        long __functionAddress = device.getCapabilities().vkTransitionImageLayout;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), transitionCount, pTransitions, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkTransitionImageLayout(VkDevice device, @NativeType("VkHostImageLayoutTransitionInfo const *") VkHostImageLayoutTransitionInfo.Buffer pTransitions) {
        return nvkTransitionImageLayout(device, pTransitions.remaining(), pTransitions.address());
    }

    public static void nvkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int set, int descriptorWriteCount, long pDescriptorWrites) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSet;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(commandBuffer.address(), pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites, __functionAddress);
    }

    public static void vkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set, @NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer pDescriptorWrites) {
        nvkCmdPushDescriptorSet(commandBuffer, pipelineBindPoint, layout, set, pDescriptorWrites.remaining(), pDescriptorWrites.address());
    }

    public static void vkCmdPushDescriptorSetWithTemplate(VkCommandBuffer commandBuffer, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set, @NativeType("void const *") long pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplate;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJPV(commandBuffer.address(), descriptorUpdateTemplate, layout, set, pData, __functionAddress);
    }

    public static void nvkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, long pBindDescriptorSetsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkBindDescriptorSetsInfo.validate(pBindDescriptorSetsInfo);
        }
        JNI.callPPV(commandBuffer.address(), pBindDescriptorSetsInfo, __functionAddress);
    }

    public static void vkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, @NativeType("VkBindDescriptorSetsInfo const *") VkBindDescriptorSetsInfo pBindDescriptorSetsInfo) {
        nvkCmdBindDescriptorSets2(commandBuffer, pBindDescriptorSetsInfo.address());
    }

    public static void nvkCmdPushConstants2(VkCommandBuffer commandBuffer, long pPushConstantsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPushConstantsInfo.validate(pPushConstantsInfo);
        }
        JNI.callPPV(commandBuffer.address(), pPushConstantsInfo, __functionAddress);
    }

    public static void vkCmdPushConstants2(VkCommandBuffer commandBuffer, @NativeType("VkPushConstantsInfo const *") VkPushConstantsInfo pPushConstantsInfo) {
        nvkCmdPushConstants2(commandBuffer, pPushConstantsInfo.address());
    }

    public static void nvkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, long pPushDescriptorSetInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSet2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPushDescriptorSetInfo.validate(pPushDescriptorSetInfo);
        }
        JNI.callPPV(commandBuffer.address(), pPushDescriptorSetInfo, __functionAddress);
    }

    public static void vkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetInfo const *") VkPushDescriptorSetInfo pPushDescriptorSetInfo) {
        nvkCmdPushDescriptorSet2(commandBuffer, pPushDescriptorSetInfo.address());
    }

    public static void nvkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, long pPushDescriptorSetWithTemplateInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplate2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPushDescriptorSetWithTemplateInfo.validate(pPushDescriptorSetWithTemplateInfo);
        }
        JNI.callPPV(commandBuffer.address(), pPushDescriptorSetWithTemplateInfo, __functionAddress);
    }

    public static void vkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetWithTemplateInfo const *") VkPushDescriptorSetWithTemplateInfo pPushDescriptorSetWithTemplateInfo) {
        nvkCmdPushDescriptorSetWithTemplate2(commandBuffer, pPushDescriptorSetWithTemplateInfo.address());
    }

    public static void vkCmdSetLineStipple(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int lineStippleFactor, @NativeType("uint16_t") short lineStipplePattern) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStipple;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPCV(commandBuffer.address(), lineStippleFactor, lineStipplePattern, __functionAddress);
    }

    public static void vkCmdBindIndexBuffer2(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size, @NativeType("VkIndexType") int indexType) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJJV(commandBuffer.address(), buffer, offset, size, indexType, __functionAddress);
    }

    public static void nvkGetRenderingAreaGranularity(VkDevice device, long pRenderingAreaInfo, long pGranularity) {
        long __functionAddress = device.getCapabilities().vkGetRenderingAreaGranularity;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pRenderingAreaInfo, pGranularity, __functionAddress);
    }

    public static void vkGetRenderingAreaGranularity(VkDevice device, @NativeType("VkRenderingAreaInfo const *") VkRenderingAreaInfo pRenderingAreaInfo, @NativeType("VkExtent2D *") VkExtent2D pGranularity) {
        nvkGetRenderingAreaGranularity(device, pRenderingAreaInfo.address(), pGranularity.address());
    }

    public static void nvkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, long pLocationInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingAttachmentLocations;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pLocationInfo, __functionAddress);
    }

    public static void vkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, @NativeType("VkRenderingAttachmentLocationInfo const *") VkRenderingAttachmentLocationInfo pLocationInfo) {
        nvkCmdSetRenderingAttachmentLocations(commandBuffer, pLocationInfo.address());
    }

    public static void nvkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, long pInputAttachmentIndexInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingInputAttachmentIndices;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pInputAttachmentIndexInfo, __functionAddress);
    }

    public static void vkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInputAttachmentIndexInfo const *") VkRenderingInputAttachmentIndexInfo pInputAttachmentIndexInfo) {
        nvkCmdSetRenderingInputAttachmentIndices(commandBuffer, pInputAttachmentIndexInfo.address());
    }
}
