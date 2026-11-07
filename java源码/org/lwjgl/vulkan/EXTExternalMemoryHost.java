package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTExternalMemoryHost.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTExternalMemoryHost.class */
public class EXTExternalMemoryHost {
    public static final int VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME = "VK_EXT_external_memory_host";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT = 1000178000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT = 1000178001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT = 1000178002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT = 128;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT = 256;

    protected EXTExternalMemoryHost() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetMemoryHostPointerPropertiesEXT(VkDevice device, int handleType, long pHostPointer, long pMemoryHostPointerProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryHostPointerPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pHostPointer);
        }
        return JNI.callPPPI(device.address(), handleType, pHostPointer, pMemoryHostPointerProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryHostPointerPropertiesEXT(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, @NativeType("void const *") long pHostPointer, @NativeType("VkMemoryHostPointerPropertiesEXT *") VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties) {
        return nvkGetMemoryHostPointerPropertiesEXT(device, handleType, pHostPointer, pMemoryHostPointerProperties.address());
    }
}
