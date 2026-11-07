package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkWriteIndirectExecutionSetPipelineEXT;
import org.lwjgl.vulkan.VkWriteIndirectExecutionSetShaderEXT;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDeviceGeneratedCommands.class */
public class EXTDeviceGeneratedCommands {
    public static final int VK_EXT_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 1;
    public static final String VK_EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_EXT_device_generated_commands";
    public static final int VK_SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT = 128;
    public static final long VK_BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT = 2147483648L;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT = 1000572000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT = 1000572001;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT = 1000572002;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT = 1000572003;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT = 1000572004;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT = 1000572006;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT = 1000572007;
    public static final int VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT = 1000572008;
    public static final int VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT = 1000572009;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT = 1000572010;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT = 1000572011;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT = 1000572012;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT = 1000572013;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT = 1000572014;
    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT = 1000572000;
    public static final int VK_OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT = 1000572001;
    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT = 274877906944L;
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_EXT = 131072;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT = 131072;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT = 262144;
    public static final int VK_INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT = 2;
    public static final int VK_INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT = 0;
    public static final int VK_INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT = 2;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT = 0;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT = 2;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT = 3;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT = 4;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT = 5;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT = 6;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT = 7;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT = 8;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT = 9;

    protected EXTDeviceGeneratedCommands() {
        throw new UnsupportedOperationException();
    }

    public static void nvkGetGeneratedCommandsMemoryRequirementsEXT(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetGeneratedCommandsMemoryRequirementsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetGeneratedCommandsMemoryRequirementsEXT(VkDevice device, @NativeType("VkGeneratedCommandsMemoryRequirementsInfoEXT const *") VkGeneratedCommandsMemoryRequirementsInfoEXT pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetGeneratedCommandsMemoryRequirementsEXT(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static void nvkCmdPreprocessGeneratedCommandsEXT(VkCommandBuffer commandBuffer, long pGeneratedCommandsInfo, VkCommandBuffer stateCommandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPreprocessGeneratedCommandsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(commandBuffer.address(), pGeneratedCommandsInfo, stateCommandBuffer.address(), __functionAddress);
    }

    public static void vkCmdPreprocessGeneratedCommandsEXT(VkCommandBuffer commandBuffer, @NativeType("VkGeneratedCommandsInfoEXT const *") VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo, VkCommandBuffer stateCommandBuffer) {
        nvkCmdPreprocessGeneratedCommandsEXT(commandBuffer, pGeneratedCommandsInfo.address(), stateCommandBuffer);
    }

    public static void nvkCmdExecuteGeneratedCommandsEXT(VkCommandBuffer commandBuffer, int isPreprocessed, long pGeneratedCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteGeneratedCommandsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), isPreprocessed, pGeneratedCommandsInfo, __functionAddress);
    }

    public static void vkCmdExecuteGeneratedCommandsEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean isPreprocessed, @NativeType("VkGeneratedCommandsInfoEXT const *") VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo) {
        nvkCmdExecuteGeneratedCommandsEXT(commandBuffer, isPreprocessed ? 1 : 0, pGeneratedCommandsInfo.address());
    }

    public static int nvkCreateIndirectCommandsLayoutEXT(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkIndirectCommandsLayoutCreateInfoEXT.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pIndirectCommandsLayout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutEXT(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoEXT const *") VkIndirectCommandsLayoutCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutEXT *") LongBuffer pIndirectCommandsLayout) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pIndirectCommandsLayout, 1);
        }
        return nvkCreateIndirectCommandsLayoutEXT(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pIndirectCommandsLayout));
    }

    public static void nvkDestroyIndirectCommandsLayoutEXT(VkDevice device, long indirectCommandsLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectCommandsLayoutEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), indirectCommandsLayout, pAllocator, __functionAddress);
    }

    public static void vkDestroyIndirectCommandsLayoutEXT(VkDevice device, @NativeType("VkIndirectCommandsLayoutEXT") long indirectCommandsLayout, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectCommandsLayoutEXT(device, indirectCommandsLayout, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateIndirectExecutionSetEXT(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectExecutionSet) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectExecutionSetEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pIndirectExecutionSet, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateIndirectExecutionSetEXT(VkDevice device, @NativeType("VkIndirectExecutionSetCreateInfoEXT const *") VkIndirectExecutionSetCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectExecutionSetEXT *") LongBuffer pIndirectExecutionSet) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pIndirectExecutionSet, 1);
        }
        return nvkCreateIndirectExecutionSetEXT(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pIndirectExecutionSet));
    }

    public static void nvkDestroyIndirectExecutionSetEXT(VkDevice device, long indirectExecutionSet, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectExecutionSetEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), indirectExecutionSet, pAllocator, __functionAddress);
    }

    public static void vkDestroyIndirectExecutionSetEXT(VkDevice device, @NativeType("VkIndirectExecutionSetEXT") long indirectExecutionSet, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectExecutionSetEXT(device, indirectExecutionSet, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkUpdateIndirectExecutionSetPipelineEXT(VkDevice device, long indirectExecutionSet, int executionSetWriteCount, long pExecutionSetWrites) {
        long __functionAddress = device.getCapabilities().vkUpdateIndirectExecutionSetPipelineEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites, __functionAddress);
    }

    public static void vkUpdateIndirectExecutionSetPipelineEXT(VkDevice device, @NativeType("VkIndirectExecutionSetEXT") long indirectExecutionSet, @NativeType("VkWriteIndirectExecutionSetPipelineEXT const *") VkWriteIndirectExecutionSetPipelineEXT.Buffer pExecutionSetWrites) {
        nvkUpdateIndirectExecutionSetPipelineEXT(device, indirectExecutionSet, pExecutionSetWrites.remaining(), pExecutionSetWrites.address());
    }

    public static void nvkUpdateIndirectExecutionSetShaderEXT(VkDevice device, long indirectExecutionSet, int executionSetWriteCount, long pExecutionSetWrites) {
        long __functionAddress = device.getCapabilities().vkUpdateIndirectExecutionSetShaderEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites, __functionAddress);
    }

    public static void vkUpdateIndirectExecutionSetShaderEXT(VkDevice device, @NativeType("VkIndirectExecutionSetEXT") long indirectExecutionSet, @NativeType("VkWriteIndirectExecutionSetShaderEXT const *") VkWriteIndirectExecutionSetShaderEXT.Buffer pExecutionSetWrites) {
        nvkUpdateIndirectExecutionSetShaderEXT(device, indirectExecutionSet, pExecutionSetWrites.remaining(), pExecutionSetWrites.address());
    }

    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutEXT(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoEXT const *") VkIndirectCommandsLayoutCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutEXT *") long[] pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pIndirectCommandsLayout, 1);
            VkIndirectCommandsLayoutCreateInfoEXT.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pIndirectCommandsLayout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateIndirectExecutionSetEXT(VkDevice device, @NativeType("VkIndirectExecutionSetCreateInfoEXT const *") VkIndirectExecutionSetCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectExecutionSetEXT *") long[] pIndirectExecutionSet) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectExecutionSetEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pIndirectExecutionSet, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pIndirectExecutionSet, __functionAddress);
    }
}
