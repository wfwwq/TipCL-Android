package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDeferredHostOperations.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDeferredHostOperations.class */
public class KHRDeferredHostOperations {
    public static final int VK_KHR_DEFERRED_HOST_OPERATIONS_SPEC_VERSION = 4;
    public static final String VK_KHR_DEFERRED_HOST_OPERATIONS_EXTENSION_NAME = "VK_KHR_deferred_host_operations";
    public static final int VK_OBJECT_TYPE_DEFERRED_OPERATION_KHR = 1000268000;
    public static final int VK_THREAD_IDLE_KHR = 1000268000;
    public static final int VK_THREAD_DONE_KHR = 1000268001;
    public static final int VK_OPERATION_DEFERRED_KHR = 1000268002;
    public static final int VK_OPERATION_NOT_DEFERRED_KHR = 1000268003;

    protected KHRDeferredHostOperations() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateDeferredOperationKHR(VkDevice device, long pAllocator, long pDeferredOperation) {
        long __functionAddress = device.getCapabilities().vkCreateDeferredOperationKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pAllocator, pDeferredOperation, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDeferredOperationKHR(VkDevice device, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDeferredOperationKHR *") LongBuffer pDeferredOperation) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pDeferredOperation, 1);
        }
        return nvkCreateDeferredOperationKHR(device, MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pDeferredOperation));
    }

    public static void nvkDestroyDeferredOperationKHR(VkDevice device, long operation, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDeferredOperationKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), operation, pAllocator, __functionAddress);
    }

    public static void vkDestroyDeferredOperationKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long operation, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDeferredOperationKHR(device, operation, MemoryUtil.memAddressSafe(pAllocator));
    }

    @NativeType("uint32_t")
    public static int vkGetDeferredOperationMaxConcurrencyKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long operation) {
        long __functionAddress = device.getCapabilities().vkGetDeferredOperationMaxConcurrencyKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(device.address(), operation, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDeferredOperationResultKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long operation) {
        long __functionAddress = device.getCapabilities().vkGetDeferredOperationResultKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(device.address(), operation, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkDeferredOperationJoinKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long operation) {
        long __functionAddress = device.getCapabilities().vkDeferredOperationJoinKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(device.address(), operation, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDeferredOperationKHR(VkDevice device, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDeferredOperationKHR *") long[] pDeferredOperation) {
        long __functionAddress = device.getCapabilities().vkCreateDeferredOperationKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pDeferredOperation, 1);
        }
        return JNI.callPPPI(device.address(), MemoryUtil.memAddressSafe(pAllocator), pDeferredOperation, __functionAddress);
    }
}
