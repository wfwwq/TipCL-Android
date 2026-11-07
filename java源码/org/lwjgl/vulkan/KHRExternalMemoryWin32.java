package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalMemoryWin32.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalMemoryWin32.class */
public class KHRExternalMemoryWin32 {
    public static final int VK_KHR_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_KHR_external_memory_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR = 1000073002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR = 1000073003;

    protected KHRExternalMemoryWin32() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetMemoryWin32HandleKHR(VkDevice device, long pGetWin32HandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandleKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pGetWin32HandleInfo, pHandle, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryWin32HandleKHR(VkDevice device, @NativeType("VkMemoryGetWin32HandleInfoKHR const *") VkMemoryGetWin32HandleInfoKHR pGetWin32HandleInfo, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pHandle, 1);
        }
        return nvkGetMemoryWin32HandleKHR(device, pGetWin32HandleInfo.address(), MemoryUtil.memAddress(pHandle));
    }

    public static int nvkGetMemoryWin32HandlePropertiesKHR(VkDevice device, int handleType, long handle, long pMemoryWin32HandleProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandlePropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(handle);
        }
        return JNI.callPPPI(device.address(), handleType, handle, pMemoryWin32HandleProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryWin32HandlePropertiesKHR(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, @NativeType("HANDLE") long handle, @NativeType("VkMemoryWin32HandlePropertiesKHR *") VkMemoryWin32HandlePropertiesKHR pMemoryWin32HandleProperties) {
        return nvkGetMemoryWin32HandlePropertiesKHR(device, handleType, handle, pMemoryWin32HandleProperties.address());
    }
}
