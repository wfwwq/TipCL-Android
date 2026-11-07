package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRTimelineSemaphore.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRTimelineSemaphore.class */
public class KHRTimelineSemaphore {
    public static final int VK_KHR_TIMELINE_SEMAPHORE_SPEC_VERSION = 2;
    public static final String VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME = "VK_KHR_timeline_semaphore";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR = 1000207000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR = 1000207001;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR = 1000207002;
    public static final int VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR = 1000207003;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR = 1000207004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR = 1000207005;
    public static final int VK_SEMAPHORE_TYPE_BINARY_KHR = 0;
    public static final int VK_SEMAPHORE_TYPE_TIMELINE_KHR = 1;
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT_KHR = 1;

    protected KHRTimelineSemaphore() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetSemaphoreCounterValueKHR(VkDevice device, long semaphore, long pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValueKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValueKHR(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") LongBuffer pValue) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pValue, 1);
        }
        return nvkGetSemaphoreCounterValueKHR(device, semaphore, MemoryUtil.memAddress(pValue));
    }

    public static int nvkWaitSemaphoresKHR(VkDevice device, long pWaitInfo, long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitSemaphoresKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkSemaphoreWaitInfo.validate(pWaitInfo);
        }
        return JNI.callPPJI(device.address(), pWaitInfo, timeout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWaitSemaphoresKHR(VkDevice device, @NativeType("VkSemaphoreWaitInfo const *") VkSemaphoreWaitInfo pWaitInfo, @NativeType("uint64_t") long timeout) {
        return nvkWaitSemaphoresKHR(device, pWaitInfo.address(), timeout);
    }

    public static int nvkSignalSemaphoreKHR(VkDevice device, long pSignalInfo) {
        long __functionAddress = device.getCapabilities().vkSignalSemaphoreKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pSignalInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkSignalSemaphoreKHR(VkDevice device, @NativeType("VkSemaphoreSignalInfo const *") VkSemaphoreSignalInfo pSignalInfo) {
        return nvkSignalSemaphoreKHR(device, pSignalInfo.address());
    }

    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValueKHR(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") long[] pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValueKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pValue, 1);
        }
        return JNI.callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }
}
