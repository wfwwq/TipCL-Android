package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPerformanceCounterARM;
import org.lwjgl.vulkan.VkPerformanceCounterDescriptionARM;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/ARMPerformanceCountersByRegion.class */
public class ARMPerformanceCountersByRegion {
    public static final int VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_SPEC_VERSION = 1;
    public static final String VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_EXTENSION_NAME = "VK_ARM_performance_counters_by_region";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM = 1000605000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM = 1000605001;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM = 1000605002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM = 1000605003;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM = 1000605004;

    protected ARMPerformanceCountersByRegion() {
        throw new UnsupportedOperationException();
    }

    public static int nvkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long pCounterCount, long pCounters, long pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, pCounters, pCounterDescriptions, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") IntBuffer pCounterCount, @NativeType("VkPerformanceCounterARM *") VkPerformanceCounterARM.Buffer pCounters, @NativeType("VkPerformanceCounterDescriptionARM *") VkPerformanceCounterDescriptionARM.Buffer pCounterDescriptions) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCounterCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCounters, pCounterCount.get(pCounterCount.position()));
            Checks.checkSafe((CustomBuffer<?>) pCounterDescriptions, pCounterCount.get(pCounterCount.position()));
        }
        return nvkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(physicalDevice, queueFamilyIndex, MemoryUtil.memAddress(pCounterCount), MemoryUtil.memAddressSafe(pCounters), MemoryUtil.memAddressSafe(pCounterDescriptions));
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") int[] pCounterCount, @NativeType("VkPerformanceCounterARM *") VkPerformanceCounterARM.Buffer pCounters, @NativeType("VkPerformanceCounterDescriptionARM *") VkPerformanceCounterDescriptionARM.Buffer pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pCounterCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCounters, pCounterCount[0]);
            Checks.checkSafe((CustomBuffer<?>) pCounterDescriptions, pCounterCount[0]);
        }
        return JNI.callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, MemoryUtil.memAddressSafe(pCounters), MemoryUtil.memAddressSafe(pCounterDescriptions), __functionAddress);
    }
}
