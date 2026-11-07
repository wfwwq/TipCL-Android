package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTValidationCache.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTValidationCache.class */
public class EXTValidationCache {
    public static final int VK_EXT_VALIDATION_CACHE_SPEC_VERSION = 1;
    public static final String VK_EXT_VALIDATION_CACHE_EXTENSION_NAME = "VK_EXT_validation_cache";
    public static final int VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160000;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160001;
    public static final int VK_OBJECT_TYPE_VALIDATION_CACHE_EXT = 1000160000;
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;

    protected EXTValidationCache() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateValidationCacheEXT(VkDevice device, long pCreateInfo, long pAllocator, long pValidationCache) {
        long __functionAddress = device.getCapabilities().vkCreateValidationCacheEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkValidationCacheCreateInfoEXT.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pValidationCache, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateValidationCacheEXT(VkDevice device, @NativeType("VkValidationCacheCreateInfoEXT const *") VkValidationCacheCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkValidationCacheEXT *") LongBuffer pValidationCache) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pValidationCache, 1);
        }
        return nvkCreateValidationCacheEXT(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pValidationCache));
    }

    public static void nvkDestroyValidationCacheEXT(VkDevice device, long validationCache, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyValidationCacheEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), validationCache, pAllocator, __functionAddress);
    }

    public static void vkDestroyValidationCacheEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long validationCache, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyValidationCacheEXT(device, validationCache, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkMergeValidationCachesEXT(VkDevice device, long dstCache, int srcCacheCount, long pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergeValidationCachesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), dstCache, srcCacheCount, pSrcCaches, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkMergeValidationCachesEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long dstCache, @NativeType("VkValidationCacheEXT const *") LongBuffer pSrcCaches) {
        return nvkMergeValidationCachesEXT(device, dstCache, pSrcCaches.remaining(), MemoryUtil.memAddress(pSrcCaches));
    }

    public static int nvkGetValidationCacheDataEXT(VkDevice device, long validationCache, long pDataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetValidationCacheDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), validationCache, pDataSize, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetValidationCacheDataEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long validationCache, @NativeType("size_t *") PointerBuffer pDataSize, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pDataSize, 1);
            Checks.checkSafe(pData, pDataSize.get(pDataSize.position()));
        }
        return nvkGetValidationCacheDataEXT(device, validationCache, MemoryUtil.memAddress(pDataSize), MemoryUtil.memAddressSafe(pData));
    }

    @NativeType("VkResult")
    public static int vkCreateValidationCacheEXT(VkDevice device, @NativeType("VkValidationCacheCreateInfoEXT const *") VkValidationCacheCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkValidationCacheEXT *") long[] pValidationCache) {
        long __functionAddress = device.getCapabilities().vkCreateValidationCacheEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pValidationCache, 1);
            VkValidationCacheCreateInfoEXT.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pValidationCache, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkMergeValidationCachesEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long dstCache, @NativeType("VkValidationCacheEXT const *") long[] pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergeValidationCachesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), dstCache, pSrcCaches.length, pSrcCaches, __functionAddress);
    }
}
