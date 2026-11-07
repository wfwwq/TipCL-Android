package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRCooperativeMatrix.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRCooperativeMatrix.class */
public class KHRCooperativeMatrix {
    public static final int VK_KHR_COOPERATIVE_MATRIX_SPEC_VERSION = 2;
    public static final String VK_KHR_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_KHR_cooperative_matrix";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR = 1000506000;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR = 1000506001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_KHR = 1000506002;
    public static final int VK_COMPONENT_TYPE_FLOAT16_KHR = 0;
    public static final int VK_COMPONENT_TYPE_FLOAT32_KHR = 1;
    public static final int VK_COMPONENT_TYPE_FLOAT64_KHR = 2;
    public static final int VK_COMPONENT_TYPE_SINT8_KHR = 3;
    public static final int VK_COMPONENT_TYPE_SINT16_KHR = 4;
    public static final int VK_COMPONENT_TYPE_SINT32_KHR = 5;
    public static final int VK_COMPONENT_TYPE_SINT64_KHR = 6;
    public static final int VK_COMPONENT_TYPE_UINT8_KHR = 7;
    public static final int VK_COMPONENT_TYPE_UINT16_KHR = 8;
    public static final int VK_COMPONENT_TYPE_UINT32_KHR = 9;
    public static final int VK_COMPONENT_TYPE_UINT64_KHR = 10;
    public static final int VK_SCOPE_DEVICE_KHR = 1;
    public static final int VK_SCOPE_WORKGROUP_KHR = 2;
    public static final int VK_SCOPE_SUBGROUP_KHR = 3;
    public static final int VK_SCOPE_QUEUE_FAMILY_KHR = 5;

    protected KHRCooperativeMatrix() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkCooperativeMatrixPropertiesKHR *") VkCooperativeMatrixPropertiesKHR.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(physicalDevice, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkCooperativeMatrixPropertiesKHR *") VkCooperativeMatrixPropertiesKHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }
}
