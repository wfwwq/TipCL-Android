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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVCudaKernelLaunch.class */
public class NVCudaKernelLaunch {
    public static final int VK_NV_CUDA_KERNEL_LAUNCH_SPEC_VERSION = 2;
    public static final String VK_NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME = "VK_NV_cuda_kernel_launch";
    public static final int VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV = 1000307000;
    public static final int VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV = 1000307001;
    public static final int VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV = 1000307002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV = 1000307003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV = 1000307004;
    public static final int VK_OBJECT_TYPE_CUDA_MODULE_NV = 1000307000;
    public static final int VK_OBJECT_TYPE_CUDA_FUNCTION_NV = 1000307001;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT = 1000307000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT = 1000307001;

    protected NVCudaKernelLaunch() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateCudaModuleNV(VkDevice device, long pCreateInfo, long pAllocator, long pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCudaModuleNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCudaModuleCreateInfoNV.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pModule, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCudaModuleNV(VkDevice device, @NativeType("VkCudaModuleCreateInfoNV const *") VkCudaModuleCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCudaModuleNV *") LongBuffer pModule) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pModule, 1);
        }
        return nvkCreateCudaModuleNV(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pModule));
    }

    public static int nvkGetCudaModuleCacheNV(VkDevice device, long module, long pCacheSize, long pCacheData) {
        long __functionAddress = device.getCapabilities().vkGetCudaModuleCacheNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), module, pCacheSize, pCacheData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetCudaModuleCacheNV(VkDevice device, @NativeType("VkCudaModuleNV") long module, @NativeType("size_t *") PointerBuffer pCacheSize, @NativeType("void *") ByteBuffer pCacheData) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pCacheSize, 1);
            Checks.checkSafe(pCacheData, pCacheSize.get(pCacheSize.position()));
        }
        return nvkGetCudaModuleCacheNV(device, module, MemoryUtil.memAddress(pCacheSize), MemoryUtil.memAddressSafe(pCacheData));
    }

    public static int nvkCreateCudaFunctionNV(VkDevice device, long pCreateInfo, long pAllocator, long pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCudaFunctionNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCudaFunctionCreateInfoNV.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pFunction, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCudaFunctionNV(VkDevice device, @NativeType("VkCudaFunctionCreateInfoNV const *") VkCudaFunctionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCudaFunctionNV *") LongBuffer pFunction) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFunction, 1);
        }
        return nvkCreateCudaFunctionNV(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pFunction));
    }

    public static void nvkDestroyCudaModuleNV(VkDevice device, long module, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCudaModuleNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), module, pAllocator, __functionAddress);
    }

    public static void vkDestroyCudaModuleNV(VkDevice device, @NativeType("VkCudaModuleNV") long module, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyCudaModuleNV(device, module, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkDestroyCudaFunctionNV(VkDevice device, long function, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCudaFunctionNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), function, pAllocator, __functionAddress);
    }

    public static void vkDestroyCudaFunctionNV(VkDevice device, @NativeType("VkCudaFunctionNV") long function, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyCudaFunctionNV(device, function, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, long pLaunchInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCudaLaunchKernelNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pLaunchInfo, __functionAddress);
    }

    public static void vkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, @NativeType("VkCudaLaunchInfoNV const *") VkCudaLaunchInfoNV pLaunchInfo) {
        nvkCmdCudaLaunchKernelNV(commandBuffer, pLaunchInfo.address());
    }

    @NativeType("VkResult")
    public static int vkCreateCudaModuleNV(VkDevice device, @NativeType("VkCudaModuleCreateInfoNV const *") VkCudaModuleCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCudaModuleNV *") long[] pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCudaModuleNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pModule, 1);
            VkCudaModuleCreateInfoNV.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pModule, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCudaFunctionNV(VkDevice device, @NativeType("VkCudaFunctionCreateInfoNV const *") VkCudaFunctionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCudaFunctionNV *") long[] pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCudaFunctionNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pFunction, 1);
            VkCudaFunctionCreateInfoNV.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pFunction, __functionAddress);
    }
}
