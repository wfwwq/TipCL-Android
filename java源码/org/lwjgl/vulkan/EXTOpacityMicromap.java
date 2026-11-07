package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkMicromapBuildInfoEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTOpacityMicromap.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTOpacityMicromap.class */
public class EXTOpacityMicromap {
    public static final int VK_EXT_OPACITY_MICROMAP_SPEC_VERSION = 2;
    public static final String VK_EXT_OPACITY_MICROMAP_EXTENSION_NAME = "VK_EXT_opacity_micromap";
    public static final int VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT = 1000396000;
    public static final int VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT = 1000396001;
    public static final int VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT = 1000396002;
    public static final int VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT = 1000396003;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT = 1000396004;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT = 1000396005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT = 1000396006;
    public static final int VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT = 1000396007;
    public static final int VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT = 1000396008;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT = 1000396009;
    public static final long VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT = 1073741824;
    public static final long VK_ACCESS_2_MICROMAP_READ_BIT_EXT = 17592186044416L;
    public static final long VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT = 35184372088832L;
    public static final int VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT = 1000396000;
    public static final int VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT = 1000396001;
    public static final int VK_OBJECT_TYPE_MICROMAP_EXT = 1000396000;
    public static final int VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 8388608;
    public static final int VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT = 16777216;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 16777216;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_BIT_EXT = 16;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT = 16;
    public static final int VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_BIT_EXT = 32;
    public static final int VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT = 32;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_BIT_EXT = 64;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT = 64;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_BIT_EXT = 128;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT = 128;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_BIT_EXT = 256;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT = 256;
    public static final int VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT = 0;
    public static final int VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT = 1;
    public static final int VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT = 2;
    public static final int VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT = 4;
    public static final int VK_BUILD_MICROMAP_MODE_BUILD_EXT = 0;
    public static final int VK_MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = 1;
    public static final int VK_COPY_MICROMAP_MODE_CLONE_EXT = 0;
    public static final int VK_COPY_MICROMAP_MODE_SERIALIZE_EXT = 1;
    public static final int VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT = 2;
    public static final int VK_COPY_MICROMAP_MODE_COMPACT_EXT = 3;
    public static final int VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT = 1;
    public static final int VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT = 2;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT = -1;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT = -2;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT = -3;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT = -4;

    protected EXTOpacityMicromap() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateMicromapEXT(VkDevice device, long pCreateInfo, long pAllocator, long pMicromap) {
        long __functionAddress = device.getCapabilities().vkCreateMicromapEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pMicromap, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateMicromapEXT(VkDevice device, @NativeType("VkMicromapCreateInfoEXT const *") VkMicromapCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkMicromapEXT *") LongBuffer pMicromap) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pMicromap, 1);
        }
        return nvkCreateMicromapEXT(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pMicromap));
    }

    public static void nvkDestroyMicromapEXT(VkDevice device, long micromap, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyMicromapEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), micromap, pAllocator, __functionAddress);
    }

    public static void vkDestroyMicromapEXT(VkDevice device, @NativeType("VkMicromapEXT") long micromap, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyMicromapEXT(device, micromap, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkCmdBuildMicromapsEXT(VkCommandBuffer commandBuffer, int infoCount, long pInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildMicromapsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), infoCount, pInfos, __functionAddress);
    }

    public static void vkCmdBuildMicromapsEXT(VkCommandBuffer commandBuffer, @NativeType("VkMicromapBuildInfoEXT const *") VkMicromapBuildInfoEXT.Buffer pInfos) {
        nvkCmdBuildMicromapsEXT(commandBuffer, pInfos.remaining(), pInfos.address());
    }

    public static int nvkBuildMicromapsEXT(VkDevice device, long deferredOperation, int infoCount, long pInfos) {
        long __functionAddress = device.getCapabilities().vkBuildMicromapsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), deferredOperation, infoCount, pInfos, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBuildMicromapsEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkMicromapBuildInfoEXT const *") VkMicromapBuildInfoEXT.Buffer pInfos) {
        return nvkBuildMicromapsEXT(device, deferredOperation, pInfos.remaining(), pInfos.address());
    }

    public static int nvkCopyMicromapEXT(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMicromapEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyMicromapEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMicromapInfoEXT const *") VkCopyMicromapInfoEXT pInfo) {
        return nvkCopyMicromapEXT(device, deferredOperation, pInfo.address());
    }

    public static int nvkCopyMicromapToMemoryEXT(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMicromapToMemoryEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyMicromapToMemoryEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMicromapToMemoryInfoEXT const *") VkCopyMicromapToMemoryInfoEXT pInfo) {
        return nvkCopyMicromapToMemoryEXT(device, deferredOperation, pInfo.address());
    }

    public static int nvkCopyMemoryToMicromapEXT(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToMicromapEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCopyMemoryToMicromapEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMemoryToMicromapInfoEXT const *") VkCopyMemoryToMicromapInfoEXT pInfo) {
        return nvkCopyMemoryToMicromapEXT(device, deferredOperation, pInfo.address());
    }

    public static int nvkWriteMicromapsPropertiesEXT(VkDevice device, int micromapCount, long pMicromaps, int queryType, long dataSize, long pData, long stride) {
        long __functionAddress = device.getCapabilities().vkWriteMicromapsPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPPI(device.address(), micromapCount, pMicromaps, queryType, dataSize, pData, stride, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWriteMicromapsPropertiesEXT(VkDevice device, @NativeType("VkMicromapEXT const *") LongBuffer pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        return nvkWriteMicromapsPropertiesEXT(device, pMicromaps.remaining(), MemoryUtil.memAddress(pMicromaps), queryType, pData.remaining(), MemoryUtil.memAddress(pData), stride);
    }

    public static void nvkCmdCopyMicromapEXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMicromapEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    public static void vkCmdCopyMicromapEXT(VkCommandBuffer commandBuffer, @NativeType("VkCopyMicromapInfoEXT const *") VkCopyMicromapInfoEXT pInfo) {
        nvkCmdCopyMicromapEXT(commandBuffer, pInfo.address());
    }

    public static void nvkCmdCopyMicromapToMemoryEXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMicromapToMemoryEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    public static void vkCmdCopyMicromapToMemoryEXT(VkCommandBuffer commandBuffer, @NativeType("VkCopyMicromapToMemoryInfoEXT const *") VkCopyMicromapToMemoryInfoEXT pInfo) {
        nvkCmdCopyMicromapToMemoryEXT(commandBuffer, pInfo.address());
    }

    public static void nvkCmdCopyMemoryToMicromapEXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToMicromapEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    public static void vkCmdCopyMemoryToMicromapEXT(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryToMicromapInfoEXT const *") VkCopyMemoryToMicromapInfoEXT pInfo) {
        nvkCmdCopyMemoryToMicromapEXT(commandBuffer, pInfo.address());
    }

    public static void nvkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, int micromapCount, long pMicromaps, int queryType, long queryPool, int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteMicromapsPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPJV(commandBuffer.address(), micromapCount, pMicromaps, queryType, queryPool, firstQuery, __functionAddress);
    }

    public static void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, @NativeType("VkMicromapEXT const *") LongBuffer pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        nvkCmdWriteMicromapsPropertiesEXT(commandBuffer, pMicromaps.remaining(), MemoryUtil.memAddress(pMicromaps), queryType, queryPool, firstQuery);
    }

    public static void nvkGetDeviceMicromapCompatibilityEXT(VkDevice device, long pVersionInfo, long pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMicromapCompatibilityEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkMicromapVersionInfoEXT.validate(pVersionInfo);
        }
        JNI.callPPPV(device.address(), pVersionInfo, pCompatibility, __functionAddress);
    }

    public static void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, @NativeType("VkMicromapVersionInfoEXT const *") VkMicromapVersionInfoEXT pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") IntBuffer pCompatibility) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCompatibility, 1);
        }
        nvkGetDeviceMicromapCompatibilityEXT(device, pVersionInfo.address(), MemoryUtil.memAddress(pCompatibility));
    }

    public static void nvkGetMicromapBuildSizesEXT(VkDevice device, int buildType, long pBuildInfo, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetMicromapBuildSizesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), buildType, pBuildInfo, pSizeInfo, __functionAddress);
    }

    public static void vkGetMicromapBuildSizesEXT(VkDevice device, @NativeType("VkAccelerationStructureBuildTypeKHR") int buildType, @NativeType("VkMicromapBuildInfoEXT const *") VkMicromapBuildInfoEXT pBuildInfo, @NativeType("VkMicromapBuildSizesInfoEXT *") VkMicromapBuildSizesInfoEXT pSizeInfo) {
        nvkGetMicromapBuildSizesEXT(device, buildType, pBuildInfo.address(), pSizeInfo.address());
    }

    @NativeType("VkResult")
    public static int vkCreateMicromapEXT(VkDevice device, @NativeType("VkMicromapCreateInfoEXT const *") VkMicromapCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkMicromapEXT *") long[] pMicromap) {
        long __functionAddress = device.getCapabilities().vkCreateMicromapEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pMicromap, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pMicromap, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWriteMicromapsPropertiesEXT(VkDevice device, @NativeType("VkMicromapEXT const *") long[] pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        long __functionAddress = device.getCapabilities().vkWriteMicromapsPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPPI(device.address(), pMicromaps.length, pMicromaps, queryType, pData.remaining(), MemoryUtil.memAddress(pData), stride, __functionAddress);
    }

    public static void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, @NativeType("VkMicromapEXT const *") long[] pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteMicromapsPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPJV(commandBuffer.address(), pMicromaps.length, pMicromaps, queryType, queryPool, firstQuery, __functionAddress);
    }

    public static void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, @NativeType("VkMicromapVersionInfoEXT const *") VkMicromapVersionInfoEXT pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") int[] pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMicromapCompatibilityEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pCompatibility, 1);
            VkMicromapVersionInfoEXT.validate(pVersionInfo.address());
        }
        JNI.callPPPV(device.address(), pVersionInfo.address(), pCompatibility, __functionAddress);
    }
}
