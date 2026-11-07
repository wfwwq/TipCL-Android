package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/ANDROIDExternalMemoryAndroidHardwareBuffer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/ANDROIDExternalMemoryAndroidHardwareBuffer.class */
public class ANDROIDExternalMemoryAndroidHardwareBuffer {
    public static final int VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_SPEC_VERSION = 5;
    public static final String VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME = "VK_ANDROID_external_memory_android_hardware_buffer";
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID = 1024;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID = 1000129000;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID = 1000129001;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID = 1000129002;
    public static final int VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID = 1000129003;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID = 1000129004;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID = 1000129005;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID = 1000129006;

    protected ANDROIDExternalMemoryAndroidHardwareBuffer() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetAndroidHardwareBufferPropertiesANDROID(VkDevice device, long buffer, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetAndroidHardwareBufferPropertiesANDROID;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(buffer);
        }
        return JNI.callPPPI(device.address(), buffer, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetAndroidHardwareBufferPropertiesANDROID(VkDevice device, @NativeType("AHardwareBuffer const *") long buffer, @NativeType("VkAndroidHardwareBufferPropertiesANDROID *") VkAndroidHardwareBufferPropertiesANDROID pProperties) {
        return nvkGetAndroidHardwareBufferPropertiesANDROID(device, buffer, pProperties.address());
    }

    public static int nvkGetMemoryAndroidHardwareBufferANDROID(VkDevice device, long pInfo, long pBuffer) {
        long __functionAddress = device.getCapabilities().vkGetMemoryAndroidHardwareBufferANDROID;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pInfo, pBuffer, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryAndroidHardwareBufferANDROID(VkDevice device, @NativeType("VkMemoryGetAndroidHardwareBufferInfoANDROID const *") VkMemoryGetAndroidHardwareBufferInfoANDROID pInfo, @NativeType("AHardwareBuffer **") PointerBuffer pBuffer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pBuffer, 1);
        }
        return nvkGetMemoryAndroidHardwareBufferANDROID(device, pInfo.address(), MemoryUtil.memAddress(pBuffer));
    }
}
