package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRPipelineBinary.class */
public class KHRPipelineBinary {
    public static final int VK_KHR_PIPELINE_BINARY_SPEC_VERSION = 1;
    public static final String VK_KHR_PIPELINE_BINARY_EXTENSION_NAME = "VK_KHR_pipeline_binary";
    public static final int VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR = 32;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR = 1000483000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR = 1000483001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR = 1000483002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR = 1000483003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR = 1000483004;
    public static final int VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR = 1000483005;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR = 1000483006;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR = 1000483007;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR = 1000483008;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR = 1000483009;
    public static final int VK_OBJECT_TYPE_PIPELINE_BINARY_KHR = 1000483000;
    public static final int VK_PIPELINE_BINARY_MISSING_KHR = 1000483000;
    public static final int VK_ERROR_NOT_ENOUGH_SPACE_KHR = -1000483000;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR = 2147483648L;

    protected KHRPipelineBinary() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreatePipelineBinariesKHR(VkDevice device, long pCreateInfo, long pAllocator, long pBinaries) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineBinariesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPipelineBinaryCreateInfoKHR.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pBinaries, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreatePipelineBinariesKHR(VkDevice device, @NativeType("VkPipelineBinaryCreateInfoKHR const *") VkPipelineBinaryCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipelineBinaryHandlesInfoKHR *") VkPipelineBinaryHandlesInfoKHR pBinaries) {
        return nvkCreatePipelineBinariesKHR(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pBinaries.address());
    }

    public static void nvkDestroyPipelineBinaryKHR(VkDevice device, long pipelineBinary, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPipelineBinaryKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), pipelineBinary, pAllocator, __functionAddress);
    }

    public static void vkDestroyPipelineBinaryKHR(VkDevice device, @NativeType("VkPipelineBinaryKHR") long pipelineBinary, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyPipelineBinaryKHR(device, pipelineBinary, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkGetPipelineKeyKHR(VkDevice device, long pPipelineCreateInfo, long pPipelineKey) {
        long __functionAddress = device.getCapabilities().vkGetPipelineKeyKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pPipelineCreateInfo, pPipelineKey, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPipelineKeyKHR(VkDevice device, @NativeType("VkPipelineCreateInfoKHR const *") VkPipelineCreateInfoKHR pPipelineCreateInfo, @NativeType("VkPipelineBinaryKeyKHR *") VkPipelineBinaryKeyKHR pPipelineKey) {
        return nvkGetPipelineKeyKHR(device, MemoryUtil.memAddressSafe(pPipelineCreateInfo), pPipelineKey.address());
    }

    public static int nvkGetPipelineBinaryDataKHR(VkDevice device, long pInfo, long pPipelineBinaryKey, long pPipelineBinaryDataSize, long pPipelineBinaryData) {
        long __functionAddress = device.getCapabilities().vkGetPipelineBinaryDataKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPPI(device.address(), pInfo, pPipelineBinaryKey, pPipelineBinaryDataSize, pPipelineBinaryData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPipelineBinaryDataKHR(VkDevice device, @NativeType("VkPipelineBinaryDataInfoKHR const *") VkPipelineBinaryDataInfoKHR pInfo, @NativeType("VkPipelineBinaryKeyKHR *") VkPipelineBinaryKeyKHR pPipelineBinaryKey, @NativeType("size_t *") PointerBuffer pPipelineBinaryDataSize, @NativeType("void *") ByteBuffer pPipelineBinaryData) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pPipelineBinaryDataSize, 1);
            Checks.checkSafe(pPipelineBinaryData, pPipelineBinaryDataSize.get(pPipelineBinaryDataSize.position()));
        }
        return nvkGetPipelineBinaryDataKHR(device, pInfo.address(), pPipelineBinaryKey.address(), MemoryUtil.memAddress(pPipelineBinaryDataSize), MemoryUtil.memAddressSafe(pPipelineBinaryData));
    }

    public static int nvkReleaseCapturedPipelineDataKHR(VkDevice device, long pInfo, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkReleaseCapturedPipelineDataKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pInfo, pAllocator, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkReleaseCapturedPipelineDataKHR(VkDevice device, @NativeType("VkReleaseCapturedPipelineDataInfoKHR const *") VkReleaseCapturedPipelineDataInfoKHR pInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        return nvkReleaseCapturedPipelineDataKHR(device, pInfo.address(), MemoryUtil.memAddressSafe(pAllocator));
    }
}
