package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVCooperativeMatrix.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVCooperativeMatrix.class */
public class NVCooperativeMatrix {
    public static final int VK_NV_COOPERATIVE_MATRIX_SPEC_VERSION = 1;
    public static final String VK_NV_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_NV_cooperative_matrix";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV = 1000249000;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV = 1000249001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV = 1000249002;
    public static final int VK_SCOPE_DEVICE_NV = 1;
    public static final int VK_SCOPE_WORKGROUP_NV = 2;
    public static final int VK_SCOPE_SUBGROUP_NV = 3;
    public static final int VK_SCOPE_QUEUE_FAMILY_NV = 5;
    public static final int VK_COMPONENT_TYPE_FLOAT16_NV = 0;
    public static final int VK_COMPONENT_TYPE_FLOAT32_NV = 1;
    public static final int VK_COMPONENT_TYPE_FLOAT64_NV = 2;
    public static final int VK_COMPONENT_TYPE_SINT8_NV = 3;
    public static final int VK_COMPONENT_TYPE_SINT16_NV = 4;
    public static final int VK_COMPONENT_TYPE_SINT32_NV = 5;
    public static final int VK_COMPONENT_TYPE_SINT64_NV = 6;
    public static final int VK_COMPONENT_TYPE_UINT8_NV = 7;
    public static final int VK_COMPONENT_TYPE_UINT16_NV = 8;
    public static final int VK_COMPONENT_TYPE_UINT32_NV = 9;
    public static final int VK_COMPONENT_TYPE_UINT64_NV = 10;

    protected NVCooperativeMatrix() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkCooperativeMatrixPropertiesNV *") VkCooperativeMatrixPropertiesNV.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeMatrixPropertiesNV(physicalDevice, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkCooperativeMatrixPropertiesNV *") VkCooperativeMatrixPropertiesNV.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }
}
