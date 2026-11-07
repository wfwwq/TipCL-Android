package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTImageDrmFormatModifier.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTImageDrmFormatModifier.class */
public class EXTImageDrmFormatModifier {
    public static final int VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_SPEC_VERSION = 2;
    public static final String VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME = "VK_EXT_image_drm_format_modifier";
    public static final int VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT = -1000158000;
    public static final int VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT = 1000158000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT = 1000158002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT = 1000158003;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT = 1000158004;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT = 1000158005;
    public static final int VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT = 1000158006;
    public static final int VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT = 1000158000;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT = 128;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT = 256;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT = 512;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT = 1024;

    protected EXTImageDrmFormatModifier() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetImageDrmFormatModifierPropertiesEXT(VkDevice device, long image, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetImageDrmFormatModifierPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), image, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetImageDrmFormatModifierPropertiesEXT(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageDrmFormatModifierPropertiesEXT *") VkImageDrmFormatModifierPropertiesEXT pProperties) {
        return nvkGetImageDrmFormatModifierPropertiesEXT(device, image, pProperties.address());
    }
}
