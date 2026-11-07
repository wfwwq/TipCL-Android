package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/HUAWEIInvocationMask.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/HUAWEIInvocationMask.class */
public class HUAWEIInvocationMask {
    public static final int VK_HUAWEI_INVOCATION_MASK_SPEC_VERSION = 1;
    public static final String VK_HUAWEI_INVOCATION_MASK_EXTENSION_NAME = "VK_HUAWEI_invocation_mask";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI = 1000370000;
    public static final long VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI = 549755813888L;
    public static final int VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI = 262144;
    public static final long VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI = 1099511627776L;

    protected HUAWEIInvocationMask() {
        throw new UnsupportedOperationException();
    }

    public static void vkCmdBindInvocationMaskHUAWEI(VkCommandBuffer commandBuffer, @NativeType("VkImageView") long imageView, @NativeType("VkImageLayout") int imageLayout) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindInvocationMaskHUAWEI;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJV(commandBuffer.address(), imageView, imageLayout, __functionAddress);
    }
}
