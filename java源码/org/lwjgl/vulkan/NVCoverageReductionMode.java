package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkFramebufferMixedSamplesCombinationNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVCoverageReductionMode.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVCoverageReductionMode.class */
public class NVCoverageReductionMode {
    public static final int VK_NV_COVERAGE_REDUCTION_MODE_SPEC_VERSION = 1;
    public static final String VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME = "VK_NV_coverage_reduction_mode";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV = 1000250000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV = 1000250001;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV = 1000250002;
    public static final int VK_COVERAGE_REDUCTION_MODE_MERGE_NV = 0;
    public static final int VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV = 1;

    protected NVCoverageReductionMode() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, long pCombinationCount, long pCombinations) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pCombinationCount, pCombinations, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pCombinationCount, @NativeType("VkFramebufferMixedSamplesCombinationNV *") VkFramebufferMixedSamplesCombinationNV.Buffer pCombinations) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCombinationCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCombinations, pCombinationCount.get(pCombinationCount.position()));
        }
        return nvkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(physicalDevice, MemoryUtil.memAddress(pCombinationCount), MemoryUtil.memAddressSafe(pCombinations));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pCombinationCount, @NativeType("VkFramebufferMixedSamplesCombinationNV *") VkFramebufferMixedSamplesCombinationNV.Buffer pCombinations) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pCombinationCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCombinations, pCombinationCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pCombinationCount, MemoryUtil.memAddressSafe(pCombinations), __functionAddress);
    }
}
