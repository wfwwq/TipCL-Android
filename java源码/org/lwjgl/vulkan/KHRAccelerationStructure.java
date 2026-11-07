package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRAccelerationStructure.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRAccelerationStructure.class */
public class KHRAccelerationStructure {
    public static final int VK_KHR_ACCELERATION_STRUCTURE_SPEC_VERSION = 13;
    public static final String VK_KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_KHR_acceleration_structure";
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR = 1000150000;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR = 1000150002;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR = 1000150003;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR = 1000150004;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR = 1000150005;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR = 1000150006;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR = 1000150007;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR = 1000150009;
    public static final int VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR = 1000150010;
    public static final int VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR = 1000150011;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR = 1000150012;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR = 1000150013;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR = 1000150014;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR = 1000150017;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR = 1000150020;
    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 33554432;
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR = 2097152;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 4194304;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR = 1000150000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR = 1000150001;
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;
    public static final int VK_INDEX_TYPE_NONE_KHR = 1000165000;
    public static final int VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 536870912;
    public static final int VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 524288;
    public static final int VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR = 1048576;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR = 0;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR = 1;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR = 2;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR = 3;
    public static final long VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 536870912;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR_EXT = 1000150000;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR = 2;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR = 1;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR = 2;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR = 4;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR = 8;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR = 16;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR = 0;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR = 1;
    public static final int VK_GEOMETRY_TYPE_TRIANGLES_KHR = 0;
    public static final int VK_GEOMETRY_TYPE_AABBS_KHR = 1;
    public static final int VK_GEOMETRY_TYPE_INSTANCES_KHR = 2;
    public static final int VK_GEOMETRY_OPAQUE_BIT_KHR = 1;
    public static final int VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR = 2;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR = 2;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR = 1;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR = 2;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR = 2;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR = 4;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR = 8;
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR = 1;

    protected KHRAccelerationStructure() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateAccelerationStructureKHR(VkDevice device, long pCreateInfo, long pAllocator, long pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pAccelerationStructure, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureKHR(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoKHR const *") VkAccelerationStructureCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureKHR *") LongBuffer pAccelerationStructure) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pAccelerationStructure, 1);
        }
        return nvkCreateAccelerationStructureKHR(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pAccelerationStructure));
    }

    public static void nvkDestroyAccelerationStructureKHR(VkDevice device, long accelerationStructure, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyAccelerationStructureKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), accelerationStructure, pAllocator, __functionAddress);
    }

    public static void vkDestroyAccelerationStructureKHR(VkDevice device, @NativeType("VkAccelerationStructureKHR") long accelerationStructure, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyAccelerationStructureKHR(device, accelerationStructure, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, int infoCount, long pInfos, long ppBuildRangeInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructuresKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(commandBuffer.address(), infoCount, pInfos, ppBuildRangeInfos, __functionAddress);
    }

    public static void vkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkAccelerationStructureBuildRangeInfoKHR const * const *") PointerBuffer ppBuildRangeInfos) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ppBuildRangeInfos, pInfos.remaining());
        }
        nvkCmdBuildAccelerationStructuresKHR(commandBuffer, pInfos.remaining(), pInfos.address(), MemoryUtil.memAddress(ppBuildRangeInfos));
    }

    public static void nvkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, int infoCount, long pInfos, long pIndirectDeviceAddresses, long pIndirectStrides, long ppMaxPrimitiveCounts) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructuresIndirectKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPPPV(commandBuffer.address(), infoCount, pInfos, pIndirectDeviceAddresses, pIndirectStrides, ppMaxPrimitiveCounts, __functionAddress);
    }

    public static void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkDeviceAddress const *") LongBuffer pIndirectDeviceAddresses, @NativeType("uint32_t const *") IntBuffer pIndirectStrides, @NativeType("uint32_t const * const *") PointerBuffer ppMaxPrimitiveCounts) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pIndirectDeviceAddresses, pInfos.remaining());
            Checks.check((Buffer) pIndirectStrides, pInfos.remaining());
            Checks.check((CustomBuffer<?>) ppMaxPrimitiveCounts, pInfos.remaining());
        }
        nvkCmdBuildAccelerationStructuresIndirectKHR(commandBuffer, pInfos.remaining(), pInfos.address(), MemoryUtil.memAddress(pIndirectDeviceAddresses), MemoryUtil.memAddress(pIndirectStrides), MemoryUtil.memAddress(ppMaxPrimitiveCounts));
    }

    public static int nvkBuildAccelerationStructuresKHR(VkDevice device, long deferredOperation, int infoCount, long pInfos, long ppBuildRangeInfos) {
        long __functionAddress = device.getCapabilities().vkBuildAccelerationStructuresKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), deferredOperation, infoCount, pInfos, ppBuildRangeInfos, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBuildAccelerationStructuresKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkAccelerationStructureBuildRangeInfoKHR const * const *") PointerBuffer ppBuildRangeInfos) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ppBuildRangeInfos, pInfos.remaining());
        }
        return nvkBuildAccelerationStructuresKHR(device, deferredOperation, pInfos.remaining(), pInfos.address(), MemoryUtil.memAddress(ppBuildRangeInfos));
    }

    public static int nvkCopyAccelerationStructureKHR(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyAccelerationStructureKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyAccelerationStructureKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyAccelerationStructureInfoKHR const *") VkCopyAccelerationStructureInfoKHR pInfo) {
        return nvkCopyAccelerationStructureKHR(device, deferredOperation, pInfo.address());
    }

    public static int nvkCopyAccelerationStructureToMemoryKHR(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyAccelerationStructureToMemoryKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyAccelerationStructureToMemoryKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyAccelerationStructureToMemoryInfoKHR const *") VkCopyAccelerationStructureToMemoryInfoKHR pInfo) {
        return nvkCopyAccelerationStructureToMemoryKHR(device, deferredOperation, pInfo.address());
    }

    public static int nvkCopyMemoryToAccelerationStructureKHR(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToAccelerationStructureKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyMemoryToAccelerationStructureKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMemoryToAccelerationStructureInfoKHR const *") VkCopyMemoryToAccelerationStructureInfoKHR pInfo) {
        return nvkCopyMemoryToAccelerationStructureKHR(device, deferredOperation, pInfo.address());
    }

    public static int nvkWriteAccelerationStructuresPropertiesKHR(VkDevice device, int accelerationStructureCount, long pAccelerationStructures, int queryType, long dataSize, long pData, long stride) {
        long __functionAddress = device.getCapabilities().vkWriteAccelerationStructuresPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPPI(device.address(), accelerationStructureCount, pAccelerationStructures, queryType, dataSize, pData, stride, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, @NativeType("VkAccelerationStructureKHR const *") LongBuffer pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        return nvkWriteAccelerationStructuresPropertiesKHR(device, pAccelerationStructures.remaining(), MemoryUtil.memAddress(pAccelerationStructures), queryType, pData.remaining(), MemoryUtil.memAddress(pData), stride);
    }

    public static void nvkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    public static void vkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyAccelerationStructureInfoKHR const *") VkCopyAccelerationStructureInfoKHR pInfo) {
        nvkCmdCopyAccelerationStructureKHR(commandBuffer, pInfo.address());
    }

    public static void nvkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureToMemoryKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    public static void vkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyAccelerationStructureToMemoryInfoKHR const *") VkCopyAccelerationStructureToMemoryInfoKHR pInfo) {
        nvkCmdCopyAccelerationStructureToMemoryKHR(commandBuffer, pInfo.address());
    }

    public static void nvkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToAccelerationStructureKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    public static void vkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryToAccelerationStructureInfoKHR const *") VkCopyMemoryToAccelerationStructureInfoKHR pInfo) {
        nvkCmdCopyMemoryToAccelerationStructureKHR(commandBuffer, pInfo.address());
    }

    public static long nvkGetAccelerationStructureDeviceAddressKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureDeviceAddressKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPJ(device.address(), pInfo, __functionAddress);
    }

    @NativeType("VkDeviceAddress")
    public static long vkGetAccelerationStructureDeviceAddressKHR(VkDevice device, @NativeType("VkAccelerationStructureDeviceAddressInfoKHR const *") VkAccelerationStructureDeviceAddressInfoKHR pInfo) {
        return nvkGetAccelerationStructureDeviceAddressKHR(device, pInfo.address());
    }

    public static void nvkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, int accelerationStructureCount, long pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPJV(commandBuffer.address(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureKHR const *") LongBuffer pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        nvkCmdWriteAccelerationStructuresPropertiesKHR(commandBuffer, pAccelerationStructures.remaining(), MemoryUtil.memAddress(pAccelerationStructures), queryType, queryPool, firstQuery);
    }

    public static void nvkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, long pVersionInfo, long pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceAccelerationStructureCompatibilityKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkAccelerationStructureVersionInfoKHR.validate(pVersionInfo);
        }
        JNI.callPPPV(device.address(), pVersionInfo, pCompatibility, __functionAddress);
    }

    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, @NativeType("VkAccelerationStructureVersionInfoKHR const *") VkAccelerationStructureVersionInfoKHR pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") IntBuffer pCompatibility) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCompatibility, 1);
        }
        nvkGetDeviceAccelerationStructureCompatibilityKHR(device, pVersionInfo.address(), MemoryUtil.memAddress(pCompatibility));
    }

    public static void nvkGetAccelerationStructureBuildSizesKHR(VkDevice device, int buildType, long pBuildInfo, long pMaxPrimitiveCounts, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureBuildSizesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPPV(device.address(), buildType, pBuildInfo, pMaxPrimitiveCounts, pSizeInfo, __functionAddress);
    }

    public static void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, @NativeType("VkAccelerationStructureBuildTypeKHR") int buildType, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo, @NativeType("uint32_t const *") IntBuffer pMaxPrimitiveCounts, @NativeType("VkAccelerationStructureBuildSizesInfoKHR *") VkAccelerationStructureBuildSizesInfoKHR pSizeInfo) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) pMaxPrimitiveCounts, pBuildInfo.geometryCount());
        }
        nvkGetAccelerationStructureBuildSizesKHR(device, buildType, pBuildInfo.address(), MemoryUtil.memAddressSafe(pMaxPrimitiveCounts), pSizeInfo.address());
    }

    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureKHR(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoKHR const *") VkAccelerationStructureCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureKHR *") long[] pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pAccelerationStructure, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pAccelerationStructure, __functionAddress);
    }

    public static void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkDeviceAddress const *") long[] pIndirectDeviceAddresses, @NativeType("uint32_t const *") int[] pIndirectStrides, @NativeType("uint32_t const * const *") PointerBuffer ppMaxPrimitiveCounts) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructuresIndirectKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pIndirectDeviceAddresses, pInfos.remaining());
            Checks.check(pIndirectStrides, pInfos.remaining());
            Checks.check((CustomBuffer<?>) ppMaxPrimitiveCounts, pInfos.remaining());
        }
        JNI.callPPPPPV(commandBuffer.address(), pInfos.remaining(), pInfos.address(), pIndirectDeviceAddresses, pIndirectStrides, MemoryUtil.memAddress(ppMaxPrimitiveCounts), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, @NativeType("VkAccelerationStructureKHR const *") long[] pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        long __functionAddress = device.getCapabilities().vkWriteAccelerationStructuresPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPPI(device.address(), pAccelerationStructures.length, pAccelerationStructures, queryType, pData.remaining(), MemoryUtil.memAddress(pData), stride, __functionAddress);
    }

    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureKHR const *") long[] pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPJV(commandBuffer.address(), pAccelerationStructures.length, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, @NativeType("VkAccelerationStructureVersionInfoKHR const *") VkAccelerationStructureVersionInfoKHR pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") int[] pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceAccelerationStructureCompatibilityKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pCompatibility, 1);
            VkAccelerationStructureVersionInfoKHR.validate(pVersionInfo.address());
        }
        JNI.callPPPV(device.address(), pVersionInfo.address(), pCompatibility, __functionAddress);
    }

    public static void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, @NativeType("VkAccelerationStructureBuildTypeKHR") int buildType, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo, @NativeType("uint32_t const *") int[] pMaxPrimitiveCounts, @NativeType("VkAccelerationStructureBuildSizesInfoKHR *") VkAccelerationStructureBuildSizesInfoKHR pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureBuildSizesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(pMaxPrimitiveCounts, pBuildInfo.geometryCount());
        }
        JNI.callPPPPV(device.address(), buildType, pBuildInfo.address(), pMaxPrimitiveCounts, pSizeInfo.address(), __functionAddress);
    }
}
