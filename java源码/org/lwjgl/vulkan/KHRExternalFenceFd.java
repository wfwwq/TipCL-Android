package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalFenceFd.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalFenceFd.class */
public class KHRExternalFenceFd {
    public static final int VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = "VK_KHR_external_fence_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR = 1000115000;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR = 1000115001;

    protected KHRExternalFenceFd() {
        throw new UnsupportedOperationException();
    }

    public static int nvkImportFenceFdKHR(VkDevice device, long pImportFenceFdInfo) {
        long __functionAddress = device.getCapabilities().vkImportFenceFdKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pImportFenceFdInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkImportFenceFdKHR(VkDevice device, @NativeType("VkImportFenceFdInfoKHR const *") VkImportFenceFdInfoKHR pImportFenceFdInfo) {
        return nvkImportFenceFdKHR(device, pImportFenceFdInfo.address());
    }

    public static int nvkGetFenceFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetFenceFdKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pGetFdInfo, pFd, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetFenceFdKHR(VkDevice device, @NativeType("VkFenceGetFdInfoKHR const *") VkFenceGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFd, 1);
        }
        return nvkGetFenceFdKHR(device, pGetFdInfo.address(), MemoryUtil.memAddress(pFd));
    }

    @NativeType("VkResult")
    public static int vkGetFenceFdKHR(VkDevice device, @NativeType("VkFenceGetFdInfoKHR const *") VkFenceGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetFenceFdKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pFd, 1);
        }
        return JNI.callPPPI(device.address(), pGetFdInfo.address(), pFd, __functionAddress);
    }
}
