package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalMemoryFd.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRExternalMemoryFd.class */
public class KHRExternalMemoryFd {
    public static final int VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME = "VK_KHR_external_memory_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR = 1000074000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR = 1000074001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR = 1000074002;

    protected KHRExternalMemoryFd() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetMemoryFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pGetFdInfo, pFd, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryFdKHR(VkDevice device, @NativeType("VkMemoryGetFdInfoKHR const *") VkMemoryGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFd, 1);
        }
        return nvkGetMemoryFdKHR(device, pGetFdInfo.address(), MemoryUtil.memAddress(pFd));
    }

    public static int nvkGetMemoryFdPropertiesKHR(VkDevice device, int handleType, int fd, long pMemoryFdProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), handleType, fd, pMemoryFdProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryFdPropertiesKHR(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, int fd, @NativeType("VkMemoryFdPropertiesKHR *") VkMemoryFdPropertiesKHR pMemoryFdProperties) {
        return nvkGetMemoryFdPropertiesKHR(device, handleType, fd, pMemoryFdProperties.address());
    }

    @NativeType("VkResult")
    public static int vkGetMemoryFdKHR(VkDevice device, @NativeType("VkMemoryGetFdInfoKHR const *") VkMemoryGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pFd, 1);
        }
        return JNI.callPPPI(device.address(), pGetFdInfo.address(), pFd, __functionAddress);
    }
}
