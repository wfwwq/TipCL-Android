package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVXBinaryImport.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVXBinaryImport.class */
public class NVXBinaryImport {
    public static final int VK_NVX_BINARY_IMPORT_SPEC_VERSION = 2;
    public static final String VK_NVX_BINARY_IMPORT_EXTENSION_NAME = "VK_NVX_binary_import";
    public static final int VK_STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX = 1000029000;
    public static final int VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX = 1000029001;
    public static final int VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX = 1000029002;
    public static final int VK_STRUCTURE_TYPE_CU_MODULE_TEXTURING_MODE_CREATE_INFO_NVX = 1000029004;
    public static final int VK_OBJECT_TYPE_CU_MODULE_NVX = 1000029000;
    public static final int VK_OBJECT_TYPE_CU_FUNCTION_NVX = 1000029001;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT = 1000029000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT = 1000029001;

    protected NVXBinaryImport() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateCuModuleNVX(VkDevice device, long pCreateInfo, long pAllocator, long pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCuModuleNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCuModuleCreateInfoNVX.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pModule, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCuModuleNVX(VkDevice device, @NativeType("VkCuModuleCreateInfoNVX const *") VkCuModuleCreateInfoNVX pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuModuleNVX *") LongBuffer pModule) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pModule, 1);
        }
        return nvkCreateCuModuleNVX(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pModule));
    }

    public static int nvkCreateCuFunctionNVX(VkDevice device, long pCreateInfo, long pAllocator, long pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCuFunctionNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCuFunctionCreateInfoNVX.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pFunction, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionCreateInfoNVX const *") VkCuFunctionCreateInfoNVX pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuFunctionNVX *") LongBuffer pFunction) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFunction, 1);
        }
        return nvkCreateCuFunctionNVX(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pFunction));
    }

    public static void nvkDestroyCuModuleNVX(VkDevice device, long module, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCuModuleNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), module, pAllocator, __functionAddress);
    }

    public static void vkDestroyCuModuleNVX(VkDevice device, @NativeType("VkCuModuleNVX") long module, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyCuModuleNVX(device, module, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkDestroyCuFunctionNVX(VkDevice device, long function, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCuFunctionNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), function, pAllocator, __functionAddress);
    }

    public static void vkDestroyCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionNVX") long function, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyCuFunctionNVX(device, function, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, long pLaunchInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCuLaunchKernelNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCuLaunchInfoNVX.validate(pLaunchInfo);
        }
        JNI.callPPV(commandBuffer.address(), pLaunchInfo, __functionAddress);
    }

    public static void vkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, @NativeType("VkCuLaunchInfoNVX const *") VkCuLaunchInfoNVX pLaunchInfo) {
        nvkCmdCuLaunchKernelNVX(commandBuffer, pLaunchInfo.address());
    }

    @NativeType("VkResult")
    public static int vkCreateCuModuleNVX(VkDevice device, @NativeType("VkCuModuleCreateInfoNVX const *") VkCuModuleCreateInfoNVX pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuModuleNVX *") long[] pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCuModuleNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pModule, 1);
            VkCuModuleCreateInfoNVX.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pModule, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionCreateInfoNVX const *") VkCuFunctionCreateInfoNVX pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuFunctionNVX *") long[] pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCuFunctionNVX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pFunction, 1);
            VkCuFunctionCreateInfoNVX.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pFunction, __functionAddress);
    }
}
