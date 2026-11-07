package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VALVEDescriptorSetHostMapping.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VALVEDescriptorSetHostMapping.class */
public class VALVEDescriptorSetHostMapping {
    public static final int VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_SPEC_VERSION = 1;
    public static final String VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_EXTENSION_NAME = "VK_VALVE_descriptor_set_host_mapping";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE = 1000420000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE = 1000420001;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE = 1000420002;

    protected VALVEDescriptorSetHostMapping() {
        throw new UnsupportedOperationException();
    }

    public static void nvkGetDescriptorSetLayoutHostMappingInfoVALVE(VkDevice device, long pBindingReference, long pHostMapping) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutHostMappingInfoVALVE;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pBindingReference, pHostMapping, __functionAddress);
    }

    public static void vkGetDescriptorSetLayoutHostMappingInfoVALVE(VkDevice device, @NativeType("VkDescriptorSetBindingReferenceVALVE const *") VkDescriptorSetBindingReferenceVALVE pBindingReference, @NativeType("VkDescriptorSetLayoutHostMappingInfoVALVE *") VkDescriptorSetLayoutHostMappingInfoVALVE pHostMapping) {
        nvkGetDescriptorSetLayoutHostMappingInfoVALVE(device, pBindingReference.address(), pHostMapping.address());
    }

    public static void nvkGetDescriptorSetHostMappingVALVE(VkDevice device, long descriptorSet, long ppData) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetHostMappingVALVE;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), descriptorSet, ppData, __functionAddress);
    }

    public static void vkGetDescriptorSetHostMappingVALVE(VkDevice device, @NativeType("VkDescriptorSet") long descriptorSet, @NativeType("void **") PointerBuffer ppData) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ppData, 1);
        }
        nvkGetDescriptorSetHostMappingVALVE(device, descriptorSet, MemoryUtil.memAddress(ppData));
    }
}
