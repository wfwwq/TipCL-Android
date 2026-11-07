package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/HUAWEIClusterCullingShader.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/HUAWEIClusterCullingShader.class */
public class HUAWEIClusterCullingShader {
    public static final int VK_HUAWEI_CLUSTER_CULLING_SHADER_SPEC_VERSION = 3;
    public static final String VK_HUAWEI_CLUSTER_CULLING_SHADER_EXTENSION_NAME = "VK_HUAWEI_cluster_culling_shader";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI = 1000404000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI = 1000404001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI = 1000404002;
    public static final long VK_PIPELINE_STAGE_2_CLUSTER_CULLING_SHADER_BIT_HUAWEI = 2199023255552L;
    public static final int VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI = 524288;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLUSTER_CULLING_SHADER_INVOCATIONS_BIT_HUAWEI = 8192;

    protected HUAWEIClusterCullingShader() {
        throw new UnsupportedOperationException();
    }

    public static void vkCmdDrawClusterHUAWEI(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawClusterHUAWEI;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), groupCountX, groupCountY, groupCountZ, __functionAddress);
    }

    public static void vkCmdDrawClusterIndirectHUAWEI(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawClusterIndirectHUAWEI;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJV(commandBuffer.address(), buffer, offset, __functionAddress);
    }
}
