package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVFragmentShadingRateEnums.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVFragmentShadingRateEnums.class */
public class NVFragmentShadingRateEnums {
    public static final int VK_NV_FRAGMENT_SHADING_RATE_ENUMS_SPEC_VERSION = 1;
    public static final String VK_NV_FRAGMENT_SHADING_RATE_ENUMS_EXTENSION_NAME = "VK_NV_fragment_shading_rate_enums";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV = 1000326000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV = 1000326001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV = 1000326002;
    public static final int VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV = 1;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV = 1;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV = 4;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV = 5;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV = 6;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV = 9;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV = 10;
    public static final int VK_FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV = 11;
    public static final int VK_FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV = 12;
    public static final int VK_FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV = 13;
    public static final int VK_FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV = 14;
    public static final int VK_FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV = 15;

    protected NVFragmentShadingRateEnums() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, int shadingRate, long combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateEnumNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), shadingRate, combinerOps, __functionAddress);
    }

    public static void vkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, @NativeType("VkFragmentShadingRateNV") int shadingRate, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") IntBuffer combinerOps) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) combinerOps, 2);
        }
        nvkCmdSetFragmentShadingRateEnumNV(commandBuffer, shadingRate, MemoryUtil.memAddress(combinerOps));
    }

    public static void vkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, @NativeType("VkFragmentShadingRateNV") int shadingRate, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") int[] combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateEnumNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(combinerOps, 2);
        }
        JNI.callPPV(commandBuffer.address(), shadingRate, combinerOps, __functionAddress);
    }
}
