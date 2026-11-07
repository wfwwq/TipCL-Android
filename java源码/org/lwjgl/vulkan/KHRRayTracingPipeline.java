package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRRayTracingPipeline.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRRayTracingPipeline.class */
public class KHRRayTracingPipeline {
    public static final int VK_KHR_RAY_TRACING_PIPELINE_SPEC_VERSION = 1;
    public static final String VK_KHR_RAY_TRACING_PIPELINE_EXTENSION_NAME = "VK_KHR_ray_tracing_pipeline";
    public static final int VK_SHADER_UNUSED_KHR = -1;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR = 1000150015;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR = 1000150016;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR = 1000150018;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR = 1000347000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR = 1000347001;
    public static final int VK_SHADER_STAGE_RAYGEN_BIT_KHR = 256;
    public static final int VK_SHADER_STAGE_ANY_HIT_BIT_KHR = 512;
    public static final int VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR = 1024;
    public static final int VK_SHADER_STAGE_MISS_BIT_KHR = 2048;
    public static final int VK_SHADER_STAGE_INTERSECTION_BIT_KHR = 4096;
    public static final int VK_SHADER_STAGE_CALLABLE_BIT_KHR = 8192;
    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR = 2097152;
    public static final int VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR = 1024;
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR = 1000165000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR = 4096;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR = 8192;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR = 16384;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR = 32768;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR = 65536;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR = 131072;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 524288;
    public static final int VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR = 1000347000;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_BUILT_IN_PRIMITIVES_BIT_KHR = 4096;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR = 0;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR = 1;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR = 2;
    public static final int VK_SHADER_GROUP_SHADER_GENERAL_KHR = 0;
    public static final int VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR = 1;
    public static final int VK_SHADER_GROUP_SHADER_ANY_HIT_KHR = 2;
    public static final int VK_SHADER_GROUP_SHADER_INTERSECTION_KHR = 3;

    protected KHRRayTracingPipeline() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdTraceRaysKHR(VkCommandBuffer commandBuffer, long pRaygenShaderBindingTable, long pMissShaderBindingTable, long pHitShaderBindingTable, long pCallableShaderBindingTable, int width, int height, int depth) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPPPV(commandBuffer.address(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, width, height, depth, __functionAddress);
    }

    public static void vkCmdTraceRaysKHR(VkCommandBuffer commandBuffer, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pMissShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pHitShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable, @NativeType("uint32_t") int width, @NativeType("uint32_t") int height, @NativeType("uint32_t") int depth) {
        nvkCmdTraceRaysKHR(commandBuffer, pRaygenShaderBindingTable.address(), pMissShaderBindingTable.address(), pHitShaderBindingTable.address(), pCallableShaderBindingTable.address(), width, height, depth);
    }

    public static int nvkCreateRayTracingPipelinesKHR(VkDevice device, long deferredOperation, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkRayTracingPipelineCreateInfoKHR.SIZEOF, VkRayTracingPipelineCreateInfoKHR::validate);
        }
        return JNI.callPJJPPPI(device.address(), deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoKHR const *") VkRayTracingPipelineCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateRayTracingPipelinesKHR(device, deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pPipelines));
    }

    public static int nvkGetRayTracingShaderGroupHandlesKHR(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingShaderGroupHandlesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), pipeline, firstGroup, groupCount, dataSize, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetRayTracingShaderGroupHandlesKHR(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRayTracingShaderGroupHandlesKHR(device, pipeline, firstGroup, groupCount, pData.remaining(), MemoryUtil.memAddress(pData));
    }

    public static int nvkGetRayTracingCaptureReplayShaderGroupHandlesKHR(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), pipeline, firstGroup, groupCount, dataSize, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRayTracingCaptureReplayShaderGroupHandlesKHR(device, pipeline, firstGroup, groupCount, pData.remaining(), MemoryUtil.memAddress(pData));
    }

    public static void nvkCmdTraceRaysIndirectKHR(VkCommandBuffer commandBuffer, long pRaygenShaderBindingTable, long pMissShaderBindingTable, long pHitShaderBindingTable, long pCallableShaderBindingTable, long indirectDeviceAddress) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysIndirectKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPPPJV(commandBuffer.address(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, indirectDeviceAddress, __functionAddress);
    }

    public static void vkCmdTraceRaysIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pMissShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pHitShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable, @NativeType("VkDeviceAddress") long indirectDeviceAddress) {
        nvkCmdTraceRaysIndirectKHR(commandBuffer, pRaygenShaderBindingTable.address(), pMissShaderBindingTable.address(), pHitShaderBindingTable.address(), pCallableShaderBindingTable.address(), indirectDeviceAddress);
    }

    @NativeType("VkDeviceSize")
    public static long vkGetRayTracingShaderGroupStackSizeKHR(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int group, @NativeType("VkShaderGroupShaderKHR") int groupShader) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingShaderGroupStackSizeKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJJ(device.address(), pipeline, group, groupShader, __functionAddress);
    }

    public static void vkCmdSetRayTracingPipelineStackSizeKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int pipelineStackSize) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRayTracingPipelineStackSizeKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), pipelineStackSize, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoKHR const *") VkRayTracingPipelineCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkRayTracingPipelineCreateInfoKHR.SIZEOF, VkRayTracingPipelineCreateInfoKHR::validate);
        }
        return JNI.callPJJPPPI(device.address(), deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }
}
