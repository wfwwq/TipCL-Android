package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTSampleLocations.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTSampleLocations.class */
public class EXTSampleLocations {
    public static final int VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION = 1;
    public static final String VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME = "VK_EXT_sample_locations";
    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = 4096;
    public static final int VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT = 1000143000;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT = 1000143001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT = 1000143002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT = 1000143003;
    public static final int VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT = 1000143004;
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT = 1000143000;

    protected EXTSampleLocations() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, long pSampleLocationsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleLocationsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkSampleLocationsInfoEXT.validate(pSampleLocationsInfo);
        }
        JNI.callPPV(commandBuffer.address(), pSampleLocationsInfo, __functionAddress);
    }

    public static void vkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleLocationsInfoEXT const *") VkSampleLocationsInfoEXT pSampleLocationsInfo) {
        nvkCmdSetSampleLocationsEXT(commandBuffer, pSampleLocationsInfo.address());
    }

    public static void nvkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, int samples, long pMultisampleProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMultisamplePropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(physicalDevice.address(), samples, pMultisampleProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkMultisamplePropertiesEXT *") VkMultisamplePropertiesEXT pMultisampleProperties) {
        nvkGetPhysicalDeviceMultisamplePropertiesEXT(physicalDevice, samples, pMultisampleProperties.address());
    }
}
