package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRFragmentShadingRate.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRFragmentShadingRate.class */
public class KHRFragmentShadingRate {
    public static final int VK_KHR_FRAGMENT_SHADING_RATE_SPEC_VERSION = 2;
    public static final String VK_KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME = "VK_KHR_fragment_shading_rate";
    public static final int VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR = 1000164003;
    public static final int VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR = 1000226000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR = 1000044006;
    public static final int VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR = 1000226000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR = 1000226001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR = 1000226002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR = 1000226003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR = 1000226004;
    public static final int VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 8388608;
    public static final int VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 256;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 4194304;
    public static final int VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 1073741824;
    public static final long VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 1073741824;
    public static final int VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 2097152;
    public static final int VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 2097152;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR = 1;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR = 2;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR = 3;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR = 4;

    protected KHRFragmentShadingRate() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, long pFragmentShadingRateCount, long pFragmentShadingRates) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFragmentShadingRatesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pFragmentShadingRateCount, pFragmentShadingRates, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pFragmentShadingRateCount, @NativeType("VkPhysicalDeviceFragmentShadingRateKHR *") VkPhysicalDeviceFragmentShadingRateKHR.Buffer pFragmentShadingRates) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFragmentShadingRateCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pFragmentShadingRates, pFragmentShadingRateCount.get(pFragmentShadingRateCount.position()));
        }
        return nvkGetPhysicalDeviceFragmentShadingRatesKHR(physicalDevice, MemoryUtil.memAddress(pFragmentShadingRateCount), MemoryUtil.memAddressSafe(pFragmentShadingRates));
    }

    public static void nvkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, long pFragmentSize, long combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(commandBuffer.address(), pFragmentSize, combinerOps, __functionAddress);
    }

    public static void vkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, @NativeType("VkExtent2D const *") VkExtent2D pFragmentSize, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") IntBuffer combinerOps) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) combinerOps, 2);
        }
        nvkCmdSetFragmentShadingRateKHR(commandBuffer, pFragmentSize.address(), MemoryUtil.memAddress(combinerOps));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pFragmentShadingRateCount, @NativeType("VkPhysicalDeviceFragmentShadingRateKHR *") VkPhysicalDeviceFragmentShadingRateKHR.Buffer pFragmentShadingRates) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFragmentShadingRatesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pFragmentShadingRateCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pFragmentShadingRates, pFragmentShadingRateCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pFragmentShadingRateCount, MemoryUtil.memAddressSafe(pFragmentShadingRates), __functionAddress);
    }

    public static void vkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, @NativeType("VkExtent2D const *") VkExtent2D pFragmentSize, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") int[] combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(combinerOps, 2);
        }
        JNI.callPPPV(commandBuffer.address(), pFragmentSize.address(), combinerOps, __functionAddress);
    }
}
