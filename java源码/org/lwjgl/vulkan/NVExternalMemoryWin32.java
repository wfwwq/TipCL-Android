package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVExternalMemoryWin32.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVExternalMemoryWin32.class */
public class NVExternalMemoryWin32 {
    public static final int VK_NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_NV_external_memory_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057001;

    protected NVExternalMemoryWin32() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetMemoryWin32HandleNV(VkDevice device, long memory, int handleType, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandleNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), memory, handleType, pHandle, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryWin32HandleNV(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkExternalMemoryHandleTypeFlagsNV") int handleType, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pHandle, 1);
        }
        return nvkGetMemoryWin32HandleNV(device, memory, handleType, MemoryUtil.memAddress(pHandle));
    }
}
