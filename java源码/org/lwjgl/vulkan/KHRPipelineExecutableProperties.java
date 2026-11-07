package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineExecutableInternalRepresentationKHR;
import org.lwjgl.vulkan.VkPipelineExecutablePropertiesKHR;
import org.lwjgl.vulkan.VkPipelineExecutableStatisticKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRPipelineExecutableProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRPipelineExecutableProperties.class */
public class KHRPipelineExecutableProperties {
    public static final int VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_EXTENSION_NAME = "VK_KHR_pipeline_executable_properties";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR = 1000269000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR = 1000269001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR = 1000269002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR = 1000269003;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR = 1000269004;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR = 1000269005;
    public static final int VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR = 64;
    public static final int VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 128;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR = 0;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR = 1;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR = 2;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR = 3;

    protected KHRPipelineExecutableProperties() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPipelineExecutablePropertiesKHR(VkDevice device, long pPipelineInfo, long pExecutableCount, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutablePropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pPipelineInfo, pExecutableCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPipelineExecutablePropertiesKHR(VkDevice device, @NativeType("VkPipelineInfoKHR const *") VkPipelineInfoKHR pPipelineInfo, @NativeType("uint32_t *") IntBuffer pExecutableCount, @NativeType("VkPipelineExecutablePropertiesKHR *") VkPipelineExecutablePropertiesKHR.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pExecutableCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pExecutableCount.get(pExecutableCount.position()));
        }
        return nvkGetPipelineExecutablePropertiesKHR(device, pPipelineInfo.address(), MemoryUtil.memAddress(pExecutableCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkGetPipelineExecutableStatisticsKHR(VkDevice device, long pExecutableInfo, long pStatisticCount, long pStatistics) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableStatisticsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pExecutableInfo, pStatisticCount, pStatistics, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPipelineExecutableStatisticsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") IntBuffer pStatisticCount, @NativeType("VkPipelineExecutableStatisticKHR *") VkPipelineExecutableStatisticKHR.Buffer pStatistics) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pStatisticCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pStatistics, pStatisticCount.get(pStatisticCount.position()));
        }
        return nvkGetPipelineExecutableStatisticsKHR(device, pExecutableInfo.address(), MemoryUtil.memAddress(pStatisticCount), MemoryUtil.memAddressSafe(pStatistics));
    }

    public static int nvkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, long pExecutableInfo, long pInternalRepresentationCount, long pInternalRepresentations) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableInternalRepresentationsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pExecutableInfo, pInternalRepresentationCount, pInternalRepresentations, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") IntBuffer pInternalRepresentationCount, @NativeType("VkPipelineExecutableInternalRepresentationKHR *") VkPipelineExecutableInternalRepresentationKHR.Buffer pInternalRepresentations) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pInternalRepresentationCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pInternalRepresentations, pInternalRepresentationCount.get(pInternalRepresentationCount.position()));
        }
        return nvkGetPipelineExecutableInternalRepresentationsKHR(device, pExecutableInfo.address(), MemoryUtil.memAddress(pInternalRepresentationCount), MemoryUtil.memAddressSafe(pInternalRepresentations));
    }

    @NativeType("VkResult")
    public static int vkGetPipelineExecutablePropertiesKHR(VkDevice device, @NativeType("VkPipelineInfoKHR const *") VkPipelineInfoKHR pPipelineInfo, @NativeType("uint32_t *") int[] pExecutableCount, @NativeType("VkPipelineExecutablePropertiesKHR *") VkPipelineExecutablePropertiesKHR.Buffer pProperties) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutablePropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pExecutableCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pExecutableCount[0]);
        }
        return JNI.callPPPPI(device.address(), pPipelineInfo.address(), pExecutableCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPipelineExecutableStatisticsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") int[] pStatisticCount, @NativeType("VkPipelineExecutableStatisticKHR *") VkPipelineExecutableStatisticKHR.Buffer pStatistics) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableStatisticsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pStatisticCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pStatistics, pStatisticCount[0]);
        }
        return JNI.callPPPPI(device.address(), pExecutableInfo.address(), pStatisticCount, MemoryUtil.memAddressSafe(pStatistics), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") int[] pInternalRepresentationCount, @NativeType("VkPipelineExecutableInternalRepresentationKHR *") VkPipelineExecutableInternalRepresentationKHR.Buffer pInternalRepresentations) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableInternalRepresentationsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pInternalRepresentationCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pInternalRepresentations, pInternalRepresentationCount[0]);
        }
        return JNI.callPPPPI(device.address(), pExecutableInfo.address(), pInternalRepresentationCount, MemoryUtil.memAddressSafe(pInternalRepresentations), __functionAddress);
    }
}
