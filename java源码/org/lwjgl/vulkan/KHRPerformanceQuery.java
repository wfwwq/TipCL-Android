package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPerformanceCounterDescriptionKHR;
import org.lwjgl.vulkan.VkPerformanceCounterKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRPerformanceQuery.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRPerformanceQuery.class */
public class KHRPerformanceQuery {
    public static final int VK_KHR_PERFORMANCE_QUERY_SPEC_VERSION = 1;
    public static final String VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_KHR_performance_query";
    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR = 1000116000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR = 1000116000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR = 1000116001;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR = 1000116002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR = 1000116003;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR = 1000116004;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR = 1000116005;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR = 1000116006;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_GENERIC_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_BYTES_KHR = 3;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR = 4;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_KELVIN_KHR = 5;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_WATTS_KHR = 6;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_VOLTS_KHR = 7;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_AMPS_KHR = 8;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_HERTZ_KHR = 9;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_CYCLES_KHR = 10;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR = 0;
    public static final int VK_QUERY_SCOPE_COMMAND_BUFFER_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR = 1;
    public static final int VK_QUERY_SCOPE_RENDER_PASS_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR = 2;
    public static final int VK_QUERY_SCOPE_COMMAND_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR = 3;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR = 4;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR = 5;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_KHR = 2;

    protected KHRPerformanceQuery() {
        throw new UnsupportedOperationException();
    }

    public static int nvkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long pCounterCount, long pCounters, long pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, pCounters, pCounterDescriptions, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") IntBuffer pCounterCount, @NativeType("VkPerformanceCounterKHR *") VkPerformanceCounterKHR.Buffer pCounters, @NativeType("VkPerformanceCounterDescriptionKHR *") VkPerformanceCounterDescriptionKHR.Buffer pCounterDescriptions) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCounterCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCounters, pCounterCount.get(pCounterCount.position()));
            Checks.checkSafe((CustomBuffer<?>) pCounterDescriptions, pCounterCount.get(pCounterCount.position()));
        }
        return nvkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(physicalDevice, queueFamilyIndex, MemoryUtil.memAddress(pCounterCount), MemoryUtil.memAddressSafe(pCounters), MemoryUtil.memAddressSafe(pCounterDescriptions));
    }

    public static void nvkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, long pPerformanceQueryCreateInfo, long pNumPasses) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkQueryPoolPerformanceCreateInfoKHR.validate(pPerformanceQueryCreateInfo);
        }
        JNI.callPPPV(physicalDevice.address(), pPerformanceQueryCreateInfo, pNumPasses, __functionAddress);
    }

    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkQueryPoolPerformanceCreateInfoKHR const *") VkQueryPoolPerformanceCreateInfoKHR pPerformanceQueryCreateInfo, @NativeType("uint32_t *") IntBuffer pNumPasses) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pNumPasses, 1);
        }
        nvkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(physicalDevice, pPerformanceQueryCreateInfo.address(), MemoryUtil.memAddress(pNumPasses));
    }

    public static int nvkAcquireProfilingLockKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkAcquireProfilingLockKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAcquireProfilingLockKHR(VkDevice device, @NativeType("VkAcquireProfilingLockInfoKHR const *") VkAcquireProfilingLockInfoKHR pInfo) {
        return nvkAcquireProfilingLockKHR(device, pInfo.address());
    }

    public static void vkReleaseProfilingLockKHR(VkDevice device) {
        long __functionAddress = device.getCapabilities().vkReleaseProfilingLockKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(device.address(), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") int[] pCounterCount, @NativeType("VkPerformanceCounterKHR *") VkPerformanceCounterKHR.Buffer pCounters, @NativeType("VkPerformanceCounterDescriptionKHR *") VkPerformanceCounterDescriptionKHR.Buffer pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pCounterCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCounters, pCounterCount[0]);
            Checks.checkSafe((CustomBuffer<?>) pCounterDescriptions, pCounterCount[0]);
        }
        return JNI.callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, MemoryUtil.memAddressSafe(pCounters), MemoryUtil.memAddressSafe(pCounterDescriptions), __functionAddress);
    }

    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkQueryPoolPerformanceCreateInfoKHR const *") VkQueryPoolPerformanceCreateInfoKHR pPerformanceQueryCreateInfo, @NativeType("uint32_t *") int[] pNumPasses) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pNumPasses, 1);
            VkQueryPoolPerformanceCreateInfoKHR.validate(pPerformanceQueryCreateInfo.address());
        }
        JNI.callPPPV(physicalDevice.address(), pPerformanceQueryCreateInfo.address(), pNumPasses, __functionAddress);
    }
}
