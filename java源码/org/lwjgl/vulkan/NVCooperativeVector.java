package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV;
import org.lwjgl.vulkan.VkCooperativeVectorPropertiesNV;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVCooperativeVector.class */
public class NVCooperativeVector {
    public static final int VK_NV_COOPERATIVE_VECTOR_SPEC_VERSION = 4;
    public static final String VK_NV_COOPERATIVE_VECTOR_EXTENSION_NAME = "VK_NV_cooperative_vector";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV = 1000491000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV = 1000491001;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV = 1000491002;
    public static final int VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV = 1000491004;
    public static final int VK_COMPONENT_TYPE_SINT8_PACKED_NV = 1000491000;
    public static final int VK_COMPONENT_TYPE_UINT8_PACKED_NV = 1000491001;
    public static final int VK_COMPONENT_TYPE_FLOAT_E4M3_NV = 1000491002;
    public static final int VK_COMPONENT_TYPE_FLOAT_E5M2_NV = 1000491003;
    public static final long VK_PIPELINE_STAGE_2_CONVERT_COOPERATIVE_VECTOR_MATRIX_BIT_NV = 17592186044416L;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_ROW_MAJOR_NV = 0;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_COLUMN_MAJOR_NV = 1;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_INFERENCING_OPTIMAL_NV = 2;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_TRAINING_OPTIMAL_NV = 3;

    protected NVCooperativeVector() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeVectorPropertiesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkCooperativeVectorPropertiesNV *") VkCooperativeVectorPropertiesNV.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeVectorPropertiesNV(physicalDevice, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkConvertCooperativeVectorMatrixNV(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkConvertCooperativeVectorMatrixNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkConvertCooperativeVectorMatrixNV(VkDevice device, @NativeType("VkConvertCooperativeVectorMatrixInfoNV const *") VkConvertCooperativeVectorMatrixInfoNV pInfo) {
        return nvkConvertCooperativeVectorMatrixNV(device, pInfo.address());
    }

    public static void nvkCmdConvertCooperativeVectorMatrixNV(VkCommandBuffer commandBuffer, int infoCount, long pInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdConvertCooperativeVectorMatrixNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), infoCount, pInfos, __functionAddress);
    }

    public static void vkCmdConvertCooperativeVectorMatrixNV(VkCommandBuffer commandBuffer, @NativeType("VkConvertCooperativeVectorMatrixInfoNV const *") VkConvertCooperativeVectorMatrixInfoNV.Buffer pInfos) {
        nvkCmdConvertCooperativeVectorMatrixNV(commandBuffer, pInfos.remaining(), pInfos.address());
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkCooperativeVectorPropertiesNV *") VkCooperativeVectorPropertiesNV.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeVectorPropertiesNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }
}
