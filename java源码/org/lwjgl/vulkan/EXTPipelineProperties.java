package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTPipelineProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTPipelineProperties.class */
public class EXTPipelineProperties {
    public static final int VK_EXT_PIPELINE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_EXT_PIPELINE_PROPERTIES_EXTENSION_NAME = "VK_EXT_pipeline_properties";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT = 1000372000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT = 1000372001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INFO_EXT = 1000372001;

    protected EXTPipelineProperties() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPipelinePropertiesEXT(VkDevice device, long pPipelineInfo, long pPipelineProperties) {
        long __functionAddress = device.getCapabilities().vkGetPipelinePropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pPipelineInfo, pPipelineProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPipelinePropertiesEXT(VkDevice device, @NativeType("VkPipelineInfoEXT const *") VkPipelineInfoEXT pPipelineInfo, @NativeType("VkBaseOutStructure *") VkBaseOutStructure pPipelineProperties) {
        return nvkGetPipelinePropertiesEXT(device, pPipelineInfo.address(), MemoryUtil.memAddressSafe(pPipelineProperties));
    }
}
