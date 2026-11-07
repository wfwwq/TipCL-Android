package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VkBindAccelerationStructureMemoryInfoNV;
import org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVRayTracing.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVRayTracing.class */
public class NVRayTracing {
    public static final int VK_NV_RAY_TRACING_SPEC_VERSION = 3;
    public static final String VK_NV_RAY_TRACING_EXTENSION_NAME = "VK_NV_ray_tracing";
    public static final int VK_SHADER_UNUSED_NV = -1;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV = 1000165000;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV = 1000165001;
    public static final int VK_STRUCTURE_TYPE_GEOMETRY_NV = 1000165003;
    public static final int VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV = 1000165004;
    public static final int VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV = 1000165005;
    public static final int VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV = 1000165006;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV = 1000165007;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV = 1000165008;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV = 1000165009;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV = 1000165011;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV = 1000165012;
    public static final int VK_SHADER_STAGE_RAYGEN_BIT_NV = 256;
    public static final int VK_SHADER_STAGE_ANY_HIT_BIT_NV = 512;
    public static final int VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV = 1024;
    public static final int VK_SHADER_STAGE_MISS_BIT_NV = 2048;
    public static final int VK_SHADER_STAGE_INTERSECTION_BIT_NV = 4096;
    public static final int VK_SHADER_STAGE_CALLABLE_BIT_NV = 8192;
    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV = 2097152;
    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV = 33554432;
    public static final int VK_BUFFER_USAGE_RAY_TRACING_BIT_NV = 1024;
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_NV = 1000165000;
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV = 2097152;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV = 4194304;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV = 1000165000;
    public static final int VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV = 32;
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int VK_INDEX_TYPE_NONE_NV = 1000165000;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV = 0;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV = 1;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV = 2;
    public static final int VK_GEOMETRY_TYPE_TRIANGLES_NV = 0;
    public static final int VK_GEOMETRY_TYPE_AABBS_NV = 1;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV = 0;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV = 1;
    public static final int VK_GEOMETRY_OPAQUE_BIT_NV = 1;
    public static final int VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV = 2;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV = 1;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV = 2;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV = 4;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV = 8;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV = 1;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV = 2;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV = 4;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV = 8;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV = 16;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV = 0;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT = 1000165000;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV = 0;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV = 1;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV = 2;

    protected NVRayTracing() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateAccelerationStructureNV(VkDevice device, long pCreateInfo, long pAllocator, long pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkAccelerationStructureCreateInfoNV.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pAccelerationStructure, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureNV(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoNV const *") VkAccelerationStructureCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureNV *") LongBuffer pAccelerationStructure) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pAccelerationStructure, 1);
        }
        return nvkCreateAccelerationStructureNV(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pAccelerationStructure));
    }

    public static void nvkDestroyAccelerationStructureNV(VkDevice device, long accelerationStructure, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyAccelerationStructureNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), accelerationStructure, pAllocator, __functionAddress);
    }

    public static void vkDestroyAccelerationStructureNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyAccelerationStructureNV(device, accelerationStructure, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkGetAccelerationStructureMemoryRequirementsNV(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureMemoryRequirementsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetAccelerationStructureMemoryRequirementsNV(VkDevice device, @NativeType("VkAccelerationStructureMemoryRequirementsInfoNV const *") VkAccelerationStructureMemoryRequirementsInfoNV pInfo, @NativeType("VkMemoryRequirements2KHR *") VkMemoryRequirements2KHR pMemoryRequirements) {
        nvkGetAccelerationStructureMemoryRequirementsNV(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static int nvkBindAccelerationStructureMemoryNV(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindAccelerationStructureMemoryNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pBindInfos, bindInfoCount, VkBindAccelerationStructureMemoryInfoNV.SIZEOF, VkBindAccelerationStructureMemoryInfoNV::validate);
        }
        return JNI.callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBindAccelerationStructureMemoryNV(VkDevice device, @NativeType("VkBindAccelerationStructureMemoryInfoNV const *") VkBindAccelerationStructureMemoryInfoNV.Buffer pBindInfos) {
        return nvkBindAccelerationStructureMemoryNV(device, pBindInfos.remaining(), pBindInfos.address());
    }

    public static void nvkCmdBuildAccelerationStructureNV(VkCommandBuffer commandBuffer, long pInfo, long instanceData, long instanceOffset, int update, long dst, long src, long scratch, long scratchOffset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructureNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkAccelerationStructureInfoNV.validate(pInfo);
        }
        JNI.callPPJJJJJJV(commandBuffer.address(), pInfo, instanceData, instanceOffset, update, dst, src, scratch, scratchOffset, __functionAddress);
    }

    public static void vkCmdBuildAccelerationStructureNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureInfoNV const *") VkAccelerationStructureInfoNV pInfo, @NativeType("VkBuffer") long instanceData, @NativeType("VkDeviceSize") long instanceOffset, @NativeType("VkBool32") boolean update, @NativeType("VkAccelerationStructureNV") long dst, @NativeType("VkAccelerationStructureNV") long src, @NativeType("VkBuffer") long scratch, @NativeType("VkDeviceSize") long scratchOffset) {
        nvkCmdBuildAccelerationStructureNV(commandBuffer, pInfo.address(), instanceData, instanceOffset, update ? 1 : 0, dst, src, scratch, scratchOffset);
    }

    public static void vkCmdCopyAccelerationStructureNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNV") long dst, @NativeType("VkAccelerationStructureNV") long src, @NativeType("VkCopyAccelerationStructureModeKHR") int mode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJV(commandBuffer.address(), dst, src, mode, __functionAddress);
    }

    public static void vkCmdTraceRaysNV(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long raygenShaderBindingTableBuffer, @NativeType("VkDeviceSize") long raygenShaderBindingOffset, @NativeType("VkBuffer") long missShaderBindingTableBuffer, @NativeType("VkDeviceSize") long missShaderBindingOffset, @NativeType("VkDeviceSize") long missShaderBindingStride, @NativeType("VkBuffer") long hitShaderBindingTableBuffer, @NativeType("VkDeviceSize") long hitShaderBindingOffset, @NativeType("VkDeviceSize") long hitShaderBindingStride, @NativeType("VkBuffer") long callableShaderBindingTableBuffer, @NativeType("VkDeviceSize") long callableShaderBindingOffset, @NativeType("VkDeviceSize") long callableShaderBindingStride, @NativeType("uint32_t") int width, @NativeType("uint32_t") int height, @NativeType("uint32_t") int depth) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJJJJJJJJJJV(commandBuffer.address(), raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth, __functionAddress);
    }

    public static int nvkCreateRayTracingPipelinesNV(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkRayTracingPipelineCreateInfoNV.SIZEOF, VkRayTracingPipelineCreateInfoNV::validate);
        }
        return JNI.callPJPPPI(device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesNV(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoNV const *") VkRayTracingPipelineCreateInfoNV.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateRayTracingPipelinesNV(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pPipelines));
    }

    public static int nvkGetRayTracingShaderGroupHandlesNV(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingShaderGroupHandlesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), pipeline, firstGroup, groupCount, dataSize, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetRayTracingShaderGroupHandlesNV(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRayTracingShaderGroupHandlesNV(device, pipeline, firstGroup, groupCount, pData.remaining(), MemoryUtil.memAddress(pData));
    }

    public static int nvkGetAccelerationStructureHandleNV(VkDevice device, long accelerationStructure, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureHandleNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), accelerationStructure, dataSize, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("void *") ByteBuffer pData) {
        return nvkGetAccelerationStructureHandleNV(device, accelerationStructure, pData.remaining(), MemoryUtil.memAddress(pData));
    }

    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("void *") LongBuffer pData) {
        return nvkGetAccelerationStructureHandleNV(device, accelerationStructure, Integer.toUnsignedLong(pData.remaining()) << 3, MemoryUtil.memAddress(pData));
    }

    public static void nvkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, int accelerationStructureCount, long pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPJV(commandBuffer.address(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

    public static void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNV const *") LongBuffer pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        nvkCmdWriteAccelerationStructuresPropertiesNV(commandBuffer, pAccelerationStructures.remaining(), MemoryUtil.memAddress(pAccelerationStructures), queryType, queryPool, firstQuery);
    }

    @NativeType("VkResult")
    public static int vkCompileDeferredNV(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int shader) {
        long __functionAddress = device.getCapabilities().vkCompileDeferredNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(device.address(), pipeline, shader, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureNV(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoNV const *") VkAccelerationStructureCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureNV *") long[] pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pAccelerationStructure, 1);
            VkAccelerationStructureCreateInfoNV.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pAccelerationStructure, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesNV(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoNV const *") VkRayTracingPipelineCreateInfoNV.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkRayTracingPipelineCreateInfoNV.SIZEOF, VkRayTracingPipelineCreateInfoNV::validate);
        }
        return JNI.callPJPPPI(device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("void *") long[] pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureHandleNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), accelerationStructure, Integer.toUnsignedLong(pData.length) << 3, pData, __functionAddress);
    }

    public static void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNV const *") long[] pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPJV(commandBuffer.address(), pAccelerationStructures.length, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }
}
