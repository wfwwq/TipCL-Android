package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VkExecutionGraphPipelineCreateInfoAMDX;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/AMDXShaderEnqueue.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/AMDXShaderEnqueue.class */
public class AMDXShaderEnqueue {
    public static final int VK_AMDX_SHADER_ENQUEUE_SPEC_VERSION = 2;
    public static final String VK_AMDX_SHADER_ENQUEUE_EXTENSION_NAME = "VK_AMDX_shader_enqueue";
    public static final int VK_SHADER_INDEX_UNUSED_AMDX = -1;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX = 1000134000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX = 1000134001;
    public static final int VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX = 1000134002;
    public static final int VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX = 1000134003;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX = 1000134004;
    public static final int VK_BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 33554432;
    public static final int VK_PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX = 1000134000;
    public static final long VK_BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 33554432;
    public static final long VK_PIPELINE_CREATE_2_EXECUTION_GRAPH_BIT_AMDX = 4294967296L;

    protected AMDXShaderEnqueue() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateExecutionGraphPipelinesAMDX(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateExecutionGraphPipelinesAMDX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkExecutionGraphPipelineCreateInfoAMDX.SIZEOF, VkExecutionGraphPipelineCreateInfoAMDX::validate);
        }
        return JNI.callPJPPPI(device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateExecutionGraphPipelinesAMDX(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkExecutionGraphPipelineCreateInfoAMDX const *") VkExecutionGraphPipelineCreateInfoAMDX.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateExecutionGraphPipelinesAMDX(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pPipelines));
    }

    public static int nvkGetExecutionGraphPipelineScratchSizeAMDX(VkDevice device, long executionGraph, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetExecutionGraphPipelineScratchSizeAMDX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), executionGraph, pSizeInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetExecutionGraphPipelineScratchSizeAMDX(VkDevice device, @NativeType("VkPipeline") long executionGraph, @NativeType("VkExecutionGraphPipelineScratchSizeAMDX *") VkExecutionGraphPipelineScratchSizeAMDX pSizeInfo) {
        return nvkGetExecutionGraphPipelineScratchSizeAMDX(device, executionGraph, pSizeInfo.address());
    }

    public static int nvkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, long executionGraph, long pNodeInfo, long pNodeIndex) {
        long __functionAddress = device.getCapabilities().vkGetExecutionGraphPipelineNodeIndexAMDX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), executionGraph, pNodeInfo, pNodeIndex, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, @NativeType("VkPipeline") long executionGraph, @NativeType("VkPipelineShaderStageNodeCreateInfoAMDX const *") VkPipelineShaderStageNodeCreateInfoAMDX pNodeInfo, @NativeType("uint32_t *") IntBuffer pNodeIndex) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pNodeIndex, 1);
        }
        return nvkGetExecutionGraphPipelineNodeIndexAMDX(device, executionGraph, pNodeInfo.address(), MemoryUtil.memAddress(pNodeIndex));
    }

    public static void vkCmdInitializeGraphScratchMemoryAMDX(VkCommandBuffer commandBuffer, @NativeType("VkPipeline") long executionGraph, @NativeType("VkDeviceAddress") long scratch, @NativeType("VkDeviceSize") long scratchSize) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdInitializeGraphScratchMemoryAMDX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJJV(commandBuffer.address(), executionGraph, scratch, scratchSize, __functionAddress);
    }

    public static void nvkCmdDispatchGraphAMDX(VkCommandBuffer commandBuffer, long scratch, long scratchSize, long pCountInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchGraphAMDX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJPV(commandBuffer.address(), scratch, scratchSize, pCountInfo, __functionAddress);
    }

    public static void vkCmdDispatchGraphAMDX(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long scratch, @NativeType("VkDeviceSize") long scratchSize, @NativeType("VkDispatchGraphCountInfoAMDX const *") VkDispatchGraphCountInfoAMDX pCountInfo) {
        nvkCmdDispatchGraphAMDX(commandBuffer, scratch, scratchSize, pCountInfo.address());
    }

    public static void nvkCmdDispatchGraphIndirectAMDX(VkCommandBuffer commandBuffer, long scratch, long scratchSize, long pCountInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchGraphIndirectAMDX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJPV(commandBuffer.address(), scratch, scratchSize, pCountInfo, __functionAddress);
    }

    public static void vkCmdDispatchGraphIndirectAMDX(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long scratch, @NativeType("VkDeviceSize") long scratchSize, @NativeType("VkDispatchGraphCountInfoAMDX const *") VkDispatchGraphCountInfoAMDX pCountInfo) {
        nvkCmdDispatchGraphIndirectAMDX(commandBuffer, scratch, scratchSize, pCountInfo.address());
    }

    public static void vkCmdDispatchGraphIndirectCountAMDX(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long scratch, @NativeType("VkDeviceSize") long scratchSize, @NativeType("VkDeviceAddress") long countInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchGraphIndirectCountAMDX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJJV(commandBuffer.address(), scratch, scratchSize, countInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateExecutionGraphPipelinesAMDX(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkExecutionGraphPipelineCreateInfoAMDX const *") VkExecutionGraphPipelineCreateInfoAMDX.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateExecutionGraphPipelinesAMDX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkExecutionGraphPipelineCreateInfoAMDX.SIZEOF, VkExecutionGraphPipelineCreateInfoAMDX::validate);
        }
        return JNI.callPJPPPI(device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, @NativeType("VkPipeline") long executionGraph, @NativeType("VkPipelineShaderStageNodeCreateInfoAMDX const *") VkPipelineShaderStageNodeCreateInfoAMDX pNodeInfo, @NativeType("uint32_t *") int[] pNodeIndex) {
        long __functionAddress = device.getCapabilities().vkGetExecutionGraphPipelineNodeIndexAMDX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pNodeIndex, 1);
        }
        return JNI.callPJPPI(device.address(), executionGraph, pNodeInfo.address(), pNodeIndex, __functionAddress);
    }
}
