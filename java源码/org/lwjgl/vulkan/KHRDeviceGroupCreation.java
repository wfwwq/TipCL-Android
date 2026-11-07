package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDeviceGroupCreation.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRDeviceGroupCreation.class */
public class KHRDeviceGroupCreation {
    public static final int VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION = 1;
    public static final String VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHR_device_group_creation";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR = 1000070000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR = 1000070001;
    public static final int VK_MAX_DEVICE_GROUP_SIZE_KHR = 32;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR = 2;

    protected KHRDeviceGroupCreation() {
        throw new UnsupportedOperationException();
    }

    public static int nvkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroupsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(instance.address(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, @NativeType("uint32_t *") IntBuffer pPhysicalDeviceGroupCount, @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.Buffer pPhysicalDeviceGroupProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPhysicalDeviceGroupCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount.get(pPhysicalDeviceGroupCount.position()));
        }
        return nvkEnumeratePhysicalDeviceGroupsKHR(instance, MemoryUtil.memAddress(pPhysicalDeviceGroupCount), MemoryUtil.memAddressSafe(pPhysicalDeviceGroupProperties));
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, @NativeType("uint32_t *") int[] pPhysicalDeviceGroupCount, @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.Buffer pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroupsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPhysicalDeviceGroupCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount[0]);
        }
        return JNI.callPPPI(instance.address(), pPhysicalDeviceGroupCount, MemoryUtil.memAddressSafe(pPhysicalDeviceGroupProperties), __functionAddress);
    }
}
