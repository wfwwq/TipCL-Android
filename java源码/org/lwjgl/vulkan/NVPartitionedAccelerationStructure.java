package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVPartitionedAccelerationStructure.class */
public class NVPartitionedAccelerationStructure {
    public static final int VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_SPEC_VERSION = 1;
    public static final String VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_NV_partitioned_acceleration_structure";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV = 1000570000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV = 1000570001;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV = 1000570002;
    public static final int VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV = 1000570003;
    public static final int VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV = 1000570004;
    public static final int VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV = 1000570005;
    public static final int VK_DESCRIPTOR_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_NV = 1000570000;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_PARTITION_INDEX_GLOBAL_NV = -1;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_INSTANCE_NV = 0;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_UPDATE_INSTANCE_NV = 1;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_PARTITION_TRANSLATION_NV = 2;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FACING_CULL_DISABLE_BIT_NV = 1;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FLIP_FACING_BIT_NV = 2;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_OPAQUE_BIT_NV = 4;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_NO_OPAQUE_BIT_NV = 8;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_ENABLE_EXPLICIT_BOUNDING_BOX_NV = 16;

    protected NVPartitionedAccelerationStructure() {
        throw new UnsupportedOperationException();
    }

    public static void nvkGetPartitionedAccelerationStructuresBuildSizesNV(VkDevice device, long pInfo, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetPartitionedAccelerationStructuresBuildSizesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pInfo, pSizeInfo, __functionAddress);
    }

    public static void vkGetPartitionedAccelerationStructuresBuildSizesNV(VkDevice device, @NativeType("VkPartitionedAccelerationStructureInstancesInputNV const *") VkPartitionedAccelerationStructureInstancesInputNV pInfo, @NativeType("VkAccelerationStructureBuildSizesInfoKHR *") VkAccelerationStructureBuildSizesInfoKHR pSizeInfo) {
        nvkGetPartitionedAccelerationStructuresBuildSizesNV(device, pInfo.address(), pSizeInfo.address());
    }

    public static void nvkCmdBuildPartitionedAccelerationStructuresNV(VkCommandBuffer commandBuffer, long pBuildInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildPartitionedAccelerationStructuresNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pBuildInfo, __functionAddress);
    }

    public static void vkCmdBuildPartitionedAccelerationStructuresNV(VkCommandBuffer commandBuffer, @NativeType("VkBuildPartitionedAccelerationStructureInfoNV const *") VkBuildPartitionedAccelerationStructureInfoNV pBuildInfo) {
        nvkCmdBuildPartitionedAccelerationStructuresNV(commandBuffer, pBuildInfo.address());
    }
}
