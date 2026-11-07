package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommandsCompute.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommandsCompute.class */
public class NVDeviceGeneratedCommandsCompute {
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_SPEC_VERSION = 2;
    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME = "VK_NV_device_generated_commands_compute";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV = 1000428000;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV = 1000428001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV = 1000428002;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV = 1000428003;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV = 1000428004;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV = 128;

    protected NVDeviceGeneratedCommandsCompute() {
        throw new UnsupportedOperationException();
    }

    public static void nvkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, long pCreateInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetPipelineIndirectMemoryRequirementsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkComputePipelineCreateInfo.validate(pCreateInfo);
        }
        JNI.callPPPV(device.address(), pCreateInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, @NativeType("VkComputePipelineCreateInfo const *") VkComputePipelineCreateInfo pCreateInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetPipelineIndirectMemoryRequirementsNV(device, pCreateInfo.address(), pMemoryRequirements.address());
    }

    public static void vkCmdUpdatePipelineIndirectBufferNV(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipeline") long pipeline) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdatePipelineIndirectBufferNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJV(commandBuffer.address(), pipelineBindPoint, pipeline, __functionAddress);
    }

    public static long nvkGetPipelineIndirectDeviceAddressNV(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetPipelineIndirectDeviceAddressNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPJ(device.address(), pInfo, __functionAddress);
    }

    @NativeType("VkDeviceAddress")
    public static long vkGetPipelineIndirectDeviceAddressNV(VkDevice device, @NativeType("VkPipelineIndirectDeviceAddressInfoNV const *") VkPipelineIndirectDeviceAddressInfoNV pInfo) {
        return nvkGetPipelineIndirectDeviceAddressNV(device, pInfo.address());
    }
}
