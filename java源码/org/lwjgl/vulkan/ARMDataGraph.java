package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VkBindDataGraphPipelineSessionMemoryInfoARM;
import org.lwjgl.vulkan.VkDataGraphPipelineCreateInfoARM;
import org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM;
import org.lwjgl.vulkan.VkDataGraphPipelineSessionBindPointRequirementARM;
import org.lwjgl.vulkan.VkQueueFamilyDataGraphPropertiesARM;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/ARMDataGraph.class */
public class ARMDataGraph {
    public static final int VK_ARM_DATA_GRAPH_SPEC_VERSION = 1;
    public static final String VK_ARM_DATA_GRAPH_EXTENSION_NAME = "VK_ARM_data_graph";
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM = 1000507000;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM = 1000507001;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM = 1000507002;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM = 1000507003;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM = 1000507004;
    public static final int VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM = 1000507005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM = 1000507006;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM = 1000507007;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM = 1000507008;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM = 1000507009;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM = 1000507010;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM = 1000507011;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM = 1000507012;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM = 1000507013;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM = 1000507014;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM = 1000507015;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM = 1000507016;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM = 1000507017;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM = 1000507018;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM = 1000507019;
    public static final int VK_OBJECT_TYPE_DATA_GRAPH_PIPELINE_SESSION_ARM = 1000507000;
    public static final int VK_PIPELINE_BIND_POINT_DATA_GRAPH_ARM = 1000507000;
    public static final int VK_QUEUE_DATA_GRAPH_BIT_ARM = 1024;
    public static final long VK_PIPELINE_STAGE_2_DATA_GRAPH_BIT_ARM = 4398046511104L;
    public static final long VK_ACCESS_2_DATA_GRAPH_READ_BIT_ARM = 140737488355328L;
    public static final long VK_ACCESS_2_DATA_GRAPH_WRITE_BIT_ARM = 281474976710656L;
    public static final long VK_TENSOR_USAGE_DATA_GRAPH_BIT_ARM = 32;
    public static final long VK_FORMAT_FEATURE_2_TENSOR_DATA_GRAPH_BIT_ARM = 281474976710656L;
    public static final long VK_BUFFER_USAGE_2_DATA_GRAPH_FOREIGN_DESCRIPTOR_BIT_ARM = 536870912;
    public static final int VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM = 128;
    public static final int VK_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TRANSIENT_ARM = 0;
    public static final int VK_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TYPE_MEMORY_ARM = 0;
    public static final long VK_DATA_GRAPH_PIPELINE_SESSION_CREATE_PROTECTED_BIT_ARM = 1;
    public static final int VK_DATA_GRAPH_PIPELINE_PROPERTY_CREATION_LOG_ARM = 0;
    public static final int VK_DATA_GRAPH_PIPELINE_PROPERTY_IDENTIFIER_ARM = 1;
    public static final int VK_PHYSICAL_DEVICE_DATA_GRAPH_PROCESSING_ENGINE_TYPE_DEFAULT_ARM = 0;
    public static final int VK_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_TYPE_SPIRV_EXTENDED_INSTRUCTION_SET_ARM = 0;

    protected ARMDataGraph() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateDataGraphPipelinesARM(VkDevice device, long deferredOperation, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateDataGraphPipelinesARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkDataGraphPipelineCreateInfoARM.SIZEOF, VkDataGraphPipelineCreateInfoARM::validate);
        }
        return JNI.callPJJPPPI(device.address(), deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDataGraphPipelinesARM(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkDataGraphPipelineCreateInfoARM const *") VkDataGraphPipelineCreateInfoARM.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateDataGraphPipelinesARM(device, deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pPipelines));
    }

    public static int nvkCreateDataGraphPipelineSessionARM(VkDevice device, long pCreateInfo, long pAllocator, long pSession) {
        long __functionAddress = device.getCapabilities().vkCreateDataGraphPipelineSessionARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pSession, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDataGraphPipelineSessionARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionCreateInfoARM const *") VkDataGraphPipelineSessionCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDataGraphPipelineSessionARM *") LongBuffer pSession) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSession, 1);
        }
        return nvkCreateDataGraphPipelineSessionARM(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSession));
    }

    public static int nvkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, long pInfo, long pBindPointRequirementCount, long pBindPointRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineSessionBindPointRequirementsARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pInfo, pBindPointRequirementCount, pBindPointRequirements, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionBindPointRequirementsInfoARM const *") VkDataGraphPipelineSessionBindPointRequirementsInfoARM pInfo, @NativeType("uint32_t *") IntBuffer pBindPointRequirementCount, @NativeType("VkDataGraphPipelineSessionBindPointRequirementARM *") VkDataGraphPipelineSessionBindPointRequirementARM.Buffer pBindPointRequirements) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pBindPointRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pBindPointRequirements, pBindPointRequirementCount.get(pBindPointRequirementCount.position()));
        }
        return nvkGetDataGraphPipelineSessionBindPointRequirementsARM(device, pInfo.address(), MemoryUtil.memAddress(pBindPointRequirementCount), MemoryUtil.memAddressSafe(pBindPointRequirements));
    }

    public static void nvkGetDataGraphPipelineSessionMemoryRequirementsARM(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineSessionMemoryRequirementsARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetDataGraphPipelineSessionMemoryRequirementsARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionMemoryRequirementsInfoARM const *") VkDataGraphPipelineSessionMemoryRequirementsInfoARM pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDataGraphPipelineSessionMemoryRequirementsARM(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static int nvkBindDataGraphPipelineSessionMemoryARM(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindDataGraphPipelineSessionMemoryARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBindDataGraphPipelineSessionMemoryARM(VkDevice device, @NativeType("VkBindDataGraphPipelineSessionMemoryInfoARM const *") VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer pBindInfos) {
        return nvkBindDataGraphPipelineSessionMemoryARM(device, pBindInfos.remaining(), pBindInfos.address());
    }

    public static void nvkDestroyDataGraphPipelineSessionARM(VkDevice device, long session, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDataGraphPipelineSessionARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), session, pAllocator, __functionAddress);
    }

    public static void vkDestroyDataGraphPipelineSessionARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionARM") long session, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDataGraphPipelineSessionARM(device, session, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkCmdDispatchDataGraphARM(VkCommandBuffer commandBuffer, long session, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchDataGraphARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(commandBuffer.address(), session, pInfo, __functionAddress);
    }

    public static void vkCmdDispatchDataGraphARM(VkCommandBuffer commandBuffer, @NativeType("VkDataGraphPipelineSessionARM") long session, @NativeType("VkDataGraphPipelineDispatchInfoARM const *") VkDataGraphPipelineDispatchInfoARM pInfo) {
        nvkCmdDispatchDataGraphARM(commandBuffer, session, MemoryUtil.memAddressSafe(pInfo));
    }

    public static int nvkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, long pPipelineInfo, long pPropertiesCount, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineAvailablePropertiesARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pPipelineInfo, pPropertiesCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, @NativeType("VkDataGraphPipelineInfoARM const *") VkDataGraphPipelineInfoARM pPipelineInfo, @NativeType("uint32_t *") IntBuffer pPropertiesCount, @NativeType("VkDataGraphPipelinePropertyARM *") IntBuffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertiesCount, 1);
            Checks.checkSafe((Buffer) pProperties, pPropertiesCount.get(pPropertiesCount.position()));
        }
        return nvkGetDataGraphPipelineAvailablePropertiesARM(device, pPipelineInfo.address(), MemoryUtil.memAddress(pPropertiesCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkGetDataGraphPipelinePropertiesARM(VkDevice device, long pPipelineInfo, int propertiesCount, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelinePropertiesARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pPipelineInfo, propertiesCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDataGraphPipelinePropertiesARM(VkDevice device, @NativeType("VkDataGraphPipelineInfoARM const *") VkDataGraphPipelineInfoARM pPipelineInfo, @NativeType("VkDataGraphPipelinePropertyQueryResultARM *") VkDataGraphPipelinePropertyQueryResultARM.Buffer pProperties) {
        return nvkGetDataGraphPipelinePropertiesARM(device, pPipelineInfo.address(), pProperties.remaining(), pProperties.address());
    }

    public static int nvkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long pQueueFamilyDataGraphPropertyCount, long pQueueFamilyDataGraphProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), queueFamilyIndex, pQueueFamilyDataGraphPropertyCount, pQueueFamilyDataGraphProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") IntBuffer pQueueFamilyDataGraphPropertyCount, @NativeType("VkQueueFamilyDataGraphPropertiesARM *") VkQueueFamilyDataGraphPropertiesARM.Buffer pQueueFamilyDataGraphProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pQueueFamilyDataGraphPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pQueueFamilyDataGraphProperties, pQueueFamilyDataGraphPropertyCount.get(pQueueFamilyDataGraphPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(physicalDevice, queueFamilyIndex, MemoryUtil.memAddress(pQueueFamilyDataGraphPropertyCount), MemoryUtil.memAddressSafe(pQueueFamilyDataGraphProperties));
    }

    public static void nvkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(VkPhysicalDevice physicalDevice, long pQueueFamilyDataGraphProcessingEngineInfo, long pQueueFamilyDataGraphProcessingEngineProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(physicalDevice.address(), pQueueFamilyDataGraphProcessingEngineInfo, pQueueFamilyDataGraphProcessingEngineProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM const *") VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pQueueFamilyDataGraphProcessingEngineInfo, @NativeType("VkQueueFamilyDataGraphProcessingEnginePropertiesARM *") VkQueueFamilyDataGraphProcessingEnginePropertiesARM pQueueFamilyDataGraphProcessingEngineProperties) {
        nvkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(physicalDevice, pQueueFamilyDataGraphProcessingEngineInfo.address(), pQueueFamilyDataGraphProcessingEngineProperties.address());
    }

    @NativeType("VkResult")
    public static int vkCreateDataGraphPipelinesARM(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkDataGraphPipelineCreateInfoARM const *") VkDataGraphPipelineCreateInfoARM.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateDataGraphPipelinesARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkDataGraphPipelineCreateInfoARM.SIZEOF, VkDataGraphPipelineCreateInfoARM::validate);
        }
        return JNI.callPJJPPPI(device.address(), deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDataGraphPipelineSessionARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionCreateInfoARM const *") VkDataGraphPipelineSessionCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDataGraphPipelineSessionARM *") long[] pSession) {
        long __functionAddress = device.getCapabilities().vkCreateDataGraphPipelineSessionARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSession, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSession, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionBindPointRequirementsInfoARM const *") VkDataGraphPipelineSessionBindPointRequirementsInfoARM pInfo, @NativeType("uint32_t *") int[] pBindPointRequirementCount, @NativeType("VkDataGraphPipelineSessionBindPointRequirementARM *") VkDataGraphPipelineSessionBindPointRequirementARM.Buffer pBindPointRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineSessionBindPointRequirementsARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pBindPointRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pBindPointRequirements, pBindPointRequirementCount[0]);
        }
        return JNI.callPPPPI(device.address(), pInfo.address(), pBindPointRequirementCount, MemoryUtil.memAddressSafe(pBindPointRequirements), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, @NativeType("VkDataGraphPipelineInfoARM const *") VkDataGraphPipelineInfoARM pPipelineInfo, @NativeType("uint32_t *") int[] pPropertiesCount, @NativeType("VkDataGraphPipelinePropertyARM *") int[] pProperties) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineAvailablePropertiesARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertiesCount, 1);
            Checks.checkSafe(pProperties, pPropertiesCount[0]);
        }
        return JNI.callPPPPI(device.address(), pPipelineInfo.address(), pPropertiesCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") int[] pQueueFamilyDataGraphPropertyCount, @NativeType("VkQueueFamilyDataGraphPropertiesARM *") VkQueueFamilyDataGraphPropertiesARM.Buffer pQueueFamilyDataGraphProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pQueueFamilyDataGraphPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pQueueFamilyDataGraphProperties, pQueueFamilyDataGraphPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), queueFamilyIndex, pQueueFamilyDataGraphPropertyCount, MemoryUtil.memAddressSafe(pQueueFamilyDataGraphProperties), __functionAddress);
    }
}
