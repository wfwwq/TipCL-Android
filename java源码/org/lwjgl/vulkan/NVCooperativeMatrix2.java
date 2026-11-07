package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCooperativeMatrixFlexibleDimensionsPropertiesNV;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVCooperativeMatrix2.class */
public class NVCooperativeMatrix2 {
    public static final int VK_NV_COOPERATIVE_MATRIX_2_SPEC_VERSION = 1;
    public static final String VK_NV_COOPERATIVE_MATRIX_2_EXTENSION_NAME = "VK_NV_cooperative_matrix2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV = 1000593000;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV = 1000593001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV = 1000593002;

    protected NVCooperativeMatrix2() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkCooperativeMatrixFlexibleDimensionsPropertiesNV *") VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(physicalDevice, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkCooperativeMatrixFlexibleDimensionsPropertiesNV *") VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }
}
