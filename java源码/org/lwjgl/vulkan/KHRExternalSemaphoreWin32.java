package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalSemaphoreWin32.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalSemaphoreWin32.class */
public class KHRExternalSemaphoreWin32 {
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME = "VK_KHR_external_semaphore_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078001;
    public static final int VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR = 1000078002;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR = 1000078003;

    protected KHRExternalSemaphoreWin32() {
        throw new UnsupportedOperationException();
    }

    public static int nvkImportSemaphoreWin32HandleKHR(VkDevice device, long pImportSemaphoreWin32HandleInfo) {
        long __functionAddress = device.getCapabilities().vkImportSemaphoreWin32HandleKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkImportSemaphoreWin32HandleInfoKHR.validate(pImportSemaphoreWin32HandleInfo);
        }
        return JNI.callPPI(device.address(), pImportSemaphoreWin32HandleInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkImportSemaphoreWin32HandleKHR(VkDevice device, @NativeType("VkImportSemaphoreWin32HandleInfoKHR const *") VkImportSemaphoreWin32HandleInfoKHR pImportSemaphoreWin32HandleInfo) {
        return nvkImportSemaphoreWin32HandleKHR(device, pImportSemaphoreWin32HandleInfo.address());
    }

    public static int nvkGetSemaphoreWin32HandleKHR(VkDevice device, long pGetWin32HandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreWin32HandleKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pGetWin32HandleInfo, pHandle, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSemaphoreWin32HandleKHR(VkDevice device, @NativeType("VkSemaphoreGetWin32HandleInfoKHR const *") VkSemaphoreGetWin32HandleInfoKHR pGetWin32HandleInfo, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pHandle, 1);
        }
        return nvkGetSemaphoreWin32HandleKHR(device, pGetWin32HandleInfo.address(), MemoryUtil.memAddress(pHandle));
    }
}
