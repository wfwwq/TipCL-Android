package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommands.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommands.class */
public class NVDeviceGeneratedCommands {
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 3;
    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NV_device_generated_commands";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV = 1000277000;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV = 1000277001;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV = 1000277002;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV = 1000277003;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV = 1000277004;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV = 1000277005;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV = 1000277006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV = 1000277007;
    public static final int VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV = 262144;
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV = 131072;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV = 131072;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV = 262144;
    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NV = 1000277000;
    public static final int VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV = 1;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV = 0;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV = 1;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV = 2;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV = 3;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV = 4;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV = 5;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV = 6;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV = 7;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV = 1;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV = 2;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV = 4;

    protected NVDeviceGeneratedCommands() {
        throw new UnsupportedOperationException();
    }

    public static void nvkGetGeneratedCommandsMemoryRequirementsNV(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetGeneratedCommandsMemoryRequirementsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetGeneratedCommandsMemoryRequirementsNV(VkDevice device, @NativeType("VkGeneratedCommandsMemoryRequirementsInfoNV const *") VkGeneratedCommandsMemoryRequirementsInfoNV pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetGeneratedCommandsMemoryRequirementsNV(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static void nvkCmdPreprocessGeneratedCommandsNV(VkCommandBuffer commandBuffer, long pGeneratedCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPreprocessGeneratedCommandsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkGeneratedCommandsInfoNV.validate(pGeneratedCommandsInfo);
        }
        JNI.callPPV(commandBuffer.address(), pGeneratedCommandsInfo, __functionAddress);
    }

    public static void vkCmdPreprocessGeneratedCommandsNV(VkCommandBuffer commandBuffer, @NativeType("VkGeneratedCommandsInfoNV const *") VkGeneratedCommandsInfoNV pGeneratedCommandsInfo) {
        nvkCmdPreprocessGeneratedCommandsNV(commandBuffer, pGeneratedCommandsInfo.address());
    }

    public static void nvkCmdExecuteGeneratedCommandsNV(VkCommandBuffer commandBuffer, int isPreprocessed, long pGeneratedCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteGeneratedCommandsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkGeneratedCommandsInfoNV.validate(pGeneratedCommandsInfo);
        }
        JNI.callPPV(commandBuffer.address(), isPreprocessed, pGeneratedCommandsInfo, __functionAddress);
    }

    public static void vkCmdExecuteGeneratedCommandsNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean isPreprocessed, @NativeType("VkGeneratedCommandsInfoNV const *") VkGeneratedCommandsInfoNV pGeneratedCommandsInfo) {
        nvkCmdExecuteGeneratedCommandsNV(commandBuffer, isPreprocessed ? 1 : 0, pGeneratedCommandsInfo.address());
    }

    public static void vkCmdBindPipelineShaderGroupNV(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int groupIndex) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindPipelineShaderGroupNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJV(commandBuffer.address(), pipelineBindPoint, pipeline, groupIndex, __functionAddress);
    }

    public static int nvkCreateIndirectCommandsLayoutNV(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkIndirectCommandsLayoutCreateInfoNV.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pIndirectCommandsLayout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutNV(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoNV const *") VkIndirectCommandsLayoutCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutNV *") LongBuffer pIndirectCommandsLayout) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pIndirectCommandsLayout, 1);
        }
        return nvkCreateIndirectCommandsLayoutNV(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pIndirectCommandsLayout));
    }

    public static void nvkDestroyIndirectCommandsLayoutNV(VkDevice device, long indirectCommandsLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectCommandsLayoutNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), indirectCommandsLayout, pAllocator, __functionAddress);
    }

    public static void vkDestroyIndirectCommandsLayoutNV(VkDevice device, @NativeType("VkIndirectCommandsLayoutNV") long indirectCommandsLayout, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectCommandsLayoutNV(device, indirectCommandsLayout, MemoryUtil.memAddressSafe(pAllocator));
    }

    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutNV(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoNV const *") VkIndirectCommandsLayoutCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutNV *") long[] pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pIndirectCommandsLayout, 1);
            VkIndirectCommandsLayoutCreateInfoNV.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pIndirectCommandsLayout, __functionAddress);
    }
}
