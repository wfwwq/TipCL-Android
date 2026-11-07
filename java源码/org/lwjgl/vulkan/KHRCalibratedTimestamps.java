package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRCalibratedTimestamps.class */
public class KHRCalibratedTimestamps {
    public static final int VK_KHR_CALIBRATED_TIMESTAMPS_SPEC_VERSION = 1;
    public static final String VK_KHR_CALIBRATED_TIMESTAMPS_EXTENSION_NAME = "VK_KHR_calibrated_timestamps";
    public static final int VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR = 1000184000;

    protected KHRCalibratedTimestamps() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceCalibrateableTimeDomainsKHR(VkPhysicalDevice physicalDevice, long pTimeDomainCount, long pTimeDomains) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCalibrateableTimeDomainsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pTimeDomainCount, pTimeDomains, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pTimeDomainCount, @NativeType("VkTimeDomainKHR *") IntBuffer pTimeDomains) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pTimeDomainCount, 1);
            Checks.checkSafe((Buffer) pTimeDomains, pTimeDomainCount.get(pTimeDomainCount.position()));
        }
        return nvkGetPhysicalDeviceCalibrateableTimeDomainsKHR(physicalDevice, MemoryUtil.memAddress(pTimeDomainCount), MemoryUtil.memAddressSafe(pTimeDomains));
    }

    public static int nvkGetCalibratedTimestampsKHR(VkDevice device, int timestampCount, long pTimestampInfos, long pTimestamps, long pMaxDeviation) {
        long __functionAddress = device.getCapabilities().vkGetCalibratedTimestampsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetCalibratedTimestampsKHR(VkDevice device, @NativeType("VkCalibratedTimestampInfoKHR const *") VkCalibratedTimestampInfoKHR.Buffer pTimestampInfos, @NativeType("uint64_t *") LongBuffer pTimestamps, @NativeType("uint64_t *") LongBuffer pMaxDeviation) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pTimestamps, pTimestampInfos.remaining());
            Checks.check((Buffer) pMaxDeviation, 1);
        }
        return nvkGetCalibratedTimestampsKHR(device, pTimestampInfos.remaining(), pTimestampInfos.address(), MemoryUtil.memAddress(pTimestamps), MemoryUtil.memAddress(pMaxDeviation));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pTimeDomainCount, @NativeType("VkTimeDomainKHR *") int[] pTimeDomains) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCalibrateableTimeDomainsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pTimeDomainCount, 1);
            Checks.checkSafe(pTimeDomains, pTimeDomainCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pTimeDomainCount, pTimeDomains, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetCalibratedTimestampsKHR(VkDevice device, @NativeType("VkCalibratedTimestampInfoKHR const *") VkCalibratedTimestampInfoKHR.Buffer pTimestampInfos, @NativeType("uint64_t *") long[] pTimestamps, @NativeType("uint64_t *") long[] pMaxDeviation) {
        long __functionAddress = device.getCapabilities().vkGetCalibratedTimestampsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pTimestamps, pTimestampInfos.remaining());
            Checks.check(pMaxDeviation, 1);
        }
        return JNI.callPPPPI(device.address(), pTimestampInfos.remaining(), pTimestampInfos.address(), pTimestamps, pMaxDeviation, __functionAddress);
    }
}
