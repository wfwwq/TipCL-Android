package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTImageCompressionControl.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTImageCompressionControl.class */
public class EXTImageCompressionControl {
    public static final int VK_EXT_IMAGE_COMPRESSION_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME = "VK_EXT_image_compression_control";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT = 1000338000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT = 1000338001;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT = 1000338003;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT = 1000338004;
    public static final int VK_ERROR_COMPRESSION_EXHAUSTED_EXT = -1000338000;
    public static final int VK_IMAGE_COMPRESSION_DEFAULT_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT = 1;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT = 2;
    public static final int VK_IMAGE_COMPRESSION_DISABLED_EXT = 4;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT = 1;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT = 2;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT = 4;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT = 8;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT = 16;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT = 32;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT = 64;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT = 128;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT = 256;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT = 512;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT = 1024;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT = 2048;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT = 4096;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT = 8192;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT = 16384;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT = 32768;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT = 65536;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT = 131072;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT = 262144;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT = 524288;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT = 1048576;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT = 2097152;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT = 4194304;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT = 8388608;

    protected EXTImageCompressionControl() {
        throw new UnsupportedOperationException();
    }

    public static void nvkGetImageSubresourceLayout2EXT(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout2EXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    public static void vkGetImageSubresourceLayout2EXT(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2 const *") VkImageSubresource2 pSubresource, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetImageSubresourceLayout2EXT(device, image, pSubresource.address(), pLayout.address());
    }
}
