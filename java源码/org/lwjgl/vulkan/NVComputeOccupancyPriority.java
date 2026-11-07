package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVComputeOccupancyPriority.class */
public class NVComputeOccupancyPriority {
    public static final int VK_NV_COMPUTE_OCCUPANCY_PRIORITY_SPEC_VERSION = 1;
    public static final String VK_NV_COMPUTE_OCCUPANCY_PRIORITY_EXTENSION_NAME = "VK_NV_compute_occupancy_priority";
    public static final float VK_COMPUTE_OCCUPANCY_PRIORITY_LOW_NV = 0.25f;
    public static final float VK_COMPUTE_OCCUPANCY_PRIORITY_NORMAL_NV = 0.5f;
    public static final float VK_COMPUTE_OCCUPANCY_PRIORITY_HIGH_NV = 0.75f;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV = 1000645000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV = 1000645001;

    protected NVComputeOccupancyPriority() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetComputeOccupancyPriorityNV(VkCommandBuffer commandBuffer, long pParameters) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetComputeOccupancyPriorityNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pParameters, __functionAddress);
    }

    public static void vkCmdSetComputeOccupancyPriorityNV(VkCommandBuffer commandBuffer, @NativeType("VkComputeOccupancyPriorityParametersNV const *") VkComputeOccupancyPriorityParametersNV pParameters) {
        nvkCmdSetComputeOccupancyPriorityNV(commandBuffer, pParameters.address());
    }
}
