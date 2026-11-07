package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalFenceWin32.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalFenceWin32.class */
public class KHRExternalFenceWin32 {
    public static final int VK_KHR_EXTERNAL_FENCE_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME = "VK_KHR_external_fence_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114001;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR = 1000114002;

    protected KHRExternalFenceWin32() {
        throw new UnsupportedOperationException();
    }

    public static int nvkImportFenceWin32HandleKHR(VkDevice device, long pImportFenceWin32HandleInfo) {
        long __functionAddress = device.getCapabilities().vkImportFenceWin32HandleKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkImportFenceWin32HandleInfoKHR.validate(pImportFenceWin32HandleInfo);
        }
        return JNI.callPPI(device.address(), pImportFenceWin32HandleInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkImportFenceWin32HandleKHR(VkDevice device, @NativeType("VkImportFenceWin32HandleInfoKHR const *") VkImportFenceWin32HandleInfoKHR pImportFenceWin32HandleInfo) {
        return nvkImportFenceWin32HandleKHR(device, pImportFenceWin32HandleInfo.address());
    }

    public static int nvkGetFenceWin32HandleKHR(VkDevice device, long pGetWin32HandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetFenceWin32HandleKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pGetWin32HandleInfo, pHandle, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetFenceWin32HandleKHR(VkDevice device, @NativeType("VkFenceGetWin32HandleInfoKHR const *") VkFenceGetWin32HandleInfoKHR pGetWin32HandleInfo, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pHandle, 1);
        }
        return nvkGetFenceWin32HandleKHR(device, pGetWin32HandleInfo.address(), MemoryUtil.memAddress(pHandle));
    }
}
