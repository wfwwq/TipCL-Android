package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceToolProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTToolingInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTToolingInfo.class */
public class EXTToolingInfo {
    public static final int VK_EXT_TOOLING_INFO_SPEC_VERSION = 1;
    public static final String VK_EXT_TOOLING_INFO_EXTENSION_NAME = "VK_EXT_tooling_info";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT = 1000245000;
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT_EXT = 1;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT_EXT = 2;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT_EXT = 4;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT = 8;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT = 16;
    public static final int VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT = 32;
    public static final int VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT = 64;

    protected EXTToolingInfo() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, long pToolCount, long pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pToolCount, pToolProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pToolCount, @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.Buffer pToolProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pToolCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pToolProperties, pToolCount.get(pToolCount.position()));
        }
        return nvkGetPhysicalDeviceToolPropertiesEXT(physicalDevice, MemoryUtil.memAddress(pToolCount), MemoryUtil.memAddressSafe(pToolProperties));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pToolCount, @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.Buffer pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pToolCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pToolProperties, pToolCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pToolCount, MemoryUtil.memAddressSafe(pToolProperties), __functionAddress);
    }
}
