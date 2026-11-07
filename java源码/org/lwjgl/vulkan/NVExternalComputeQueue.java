package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVExternalComputeQueue.class */
public class NVExternalComputeQueue {
    public static final int VK_NV_EXTERNAL_COMPUTE_QUEUE_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_COMPUTE_QUEUE_EXTENSION_NAME = "VK_NV_external_compute_queue";
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV = 1000556000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV = 1000556001;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DATA_PARAMS_NV = 1000556002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV = 1000556003;
    public static final int VK_OBJECT_TYPE_EXTERNAL_COMPUTE_QUEUE_NV = 1000556000;

    protected NVExternalComputeQueue() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateExternalComputeQueueNV(VkDevice device, long pCreateInfo, long pAllocator, long pExternalQueue) {
        long __functionAddress = device.getCapabilities().vkCreateExternalComputeQueueNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkExternalComputeQueueCreateInfoNV.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pExternalQueue, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateExternalComputeQueueNV(VkDevice device, @NativeType("VkExternalComputeQueueCreateInfoNV const *") VkExternalComputeQueueCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkExternalComputeQueueNV *") PointerBuffer pExternalQueue) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pExternalQueue, 1);
        }
        return nvkCreateExternalComputeQueueNV(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pExternalQueue));
    }

    public static void nvkDestroyExternalComputeQueueNV(VkDevice device, VkExternalComputeQueueNV externalQueue, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyExternalComputeQueueNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), externalQueue.address(), pAllocator, __functionAddress);
    }

    public static void vkDestroyExternalComputeQueueNV(VkDevice device, VkExternalComputeQueueNV externalQueue, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyExternalComputeQueueNV(device, externalQueue, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkGetExternalComputeQueueDataNV(VkExternalComputeQueueNV externalQueue, long params, long pData) {
        long __functionAddress = externalQueue.getCapabilities().vkGetExternalComputeQueueDataNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(externalQueue.address(), params, pData, __functionAddress);
    }

    public static void vkGetExternalComputeQueueDataNV(VkExternalComputeQueueNV externalQueue, @NativeType("VkExternalComputeQueueDataParamsNV *") VkExternalComputeQueueDataParamsNV params, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pData, 1);
        }
        nvkGetExternalComputeQueueDataNV(externalQueue, params.address(), MemoryUtil.memAddress(pData));
    }
}
