package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalSemaphoreFd.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalSemaphoreFd.class */
public class KHRExternalSemaphoreFd {
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = "VK_KHR_external_semaphore_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR = 1000079000;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR = 1000079001;

    protected KHRExternalSemaphoreFd() {
        throw new UnsupportedOperationException();
    }

    public static int nvkImportSemaphoreFdKHR(VkDevice device, long pImportSemaphoreFdInfo) {
        long __functionAddress = device.getCapabilities().vkImportSemaphoreFdKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pImportSemaphoreFdInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkImportSemaphoreFdKHR(VkDevice device, @NativeType("VkImportSemaphoreFdInfoKHR const *") VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo) {
        return nvkImportSemaphoreFdKHR(device, pImportSemaphoreFdInfo.address());
    }

    public static int nvkGetSemaphoreFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreFdKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pGetFdInfo, pFd, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSemaphoreFdKHR(VkDevice device, @NativeType("VkSemaphoreGetFdInfoKHR const *") VkSemaphoreGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFd, 1);
        }
        return nvkGetSemaphoreFdKHR(device, pGetFdInfo.address(), MemoryUtil.memAddress(pFd));
    }

    @NativeType("VkResult")
    public static int vkGetSemaphoreFdKHR(VkDevice device, @NativeType("VkSemaphoreGetFdInfoKHR const *") VkSemaphoreGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreFdKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pFd, 1);
        }
        return JNI.callPPPI(device.address(), pGetFdInfo.address(), pFd, __functionAddress);
    }
}
