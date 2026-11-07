package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkOpticalFlowImageFormatPropertiesNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVOpticalFlow.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVOpticalFlow.class */
public class NVOpticalFlow {
    public static final int VK_NV_OPTICAL_FLOW_SPEC_VERSION = 1;
    public static final String VK_NV_OPTICAL_FLOW_EXTENSION_NAME = "VK_NV_optical_flow";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV = 1000464000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV = 1000464001;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV = 1000464002;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV = 1000464003;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV = 1000464004;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV = 1000464005;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV = 1000464010;
    public static final int VK_FORMAT_R16G16_SFIXED5_NV = 1000464000;
    public static final int VK_FORMAT_R16G16_S10_5_NV = 1000464000;
    public static final int VK_OBJECT_TYPE_OPTICAL_FLOW_SESSION_NV = 1000464000;
    public static final int VK_QUEUE_OPTICAL_FLOW_BIT_NV = 256;
    public static final long VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV = 536870912;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV = 4398046511104L;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV = 8796093022208L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV = 1099511627776L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV = 2199023255552L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV = 4398046511104L;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV = 1;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV = 2;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV = 4;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV = 8;
    public static final int VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV = 1;
    public static final int VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV = 2;
    public static final int VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV = 4;
    public static final int VK_OPTICAL_FLOW_USAGE_COST_BIT_NV = 8;
    public static final int VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV = 16;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV = 1;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV = 2;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV = 3;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV = 1;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV = 2;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV = 3;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV = 4;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV = 5;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV = 6;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV = 7;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV = 8;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV = 1;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV = 2;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV = 4;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV = 8;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV = 16;
    public static final int VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV = 1;

    protected NVOpticalFlow() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, long pOpticalFlowImageFormatInfo, long pFormatCount, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(physicalDevice.address(), pOpticalFlowImageFormatInfo, pFormatCount, pImageFormatProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, @NativeType("VkOpticalFlowImageFormatInfoNV const *") VkOpticalFlowImageFormatInfoNV pOpticalFlowImageFormatInfo, @NativeType("uint32_t *") IntBuffer pFormatCount, @NativeType("VkOpticalFlowImageFormatPropertiesNV *") VkOpticalFlowImageFormatPropertiesNV.Buffer pImageFormatProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFormatCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pImageFormatProperties, pFormatCount.get(pFormatCount.position()));
        }
        return nvkGetPhysicalDeviceOpticalFlowImageFormatsNV(physicalDevice, pOpticalFlowImageFormatInfo.address(), MemoryUtil.memAddress(pFormatCount), MemoryUtil.memAddressSafe(pImageFormatProperties));
    }

    public static int nvkCreateOpticalFlowSessionNV(VkDevice device, long pCreateInfo, long pAllocator, long pSession) {
        long __functionAddress = device.getCapabilities().vkCreateOpticalFlowSessionNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pSession, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateOpticalFlowSessionNV(VkDevice device, @NativeType("VkOpticalFlowSessionCreateInfoNV const *") VkOpticalFlowSessionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkOpticalFlowSessionNV *") LongBuffer pSession) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSession, 1);
        }
        return nvkCreateOpticalFlowSessionNV(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSession));
    }

    public static void nvkDestroyOpticalFlowSessionNV(VkDevice device, long session, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyOpticalFlowSessionNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), session, pAllocator, __functionAddress);
    }

    public static void vkDestroyOpticalFlowSessionNV(VkDevice device, @NativeType("VkOpticalFlowSessionNV") long session, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyOpticalFlowSessionNV(device, session, MemoryUtil.memAddressSafe(pAllocator));
    }

    @NativeType("VkResult")
    public static int vkBindOpticalFlowSessionImageNV(VkDevice device, @NativeType("VkOpticalFlowSessionNV") long session, @NativeType("VkOpticalFlowSessionBindingPointNV") int bindingPoint, @NativeType("VkImageView") long view, @NativeType("VkImageLayout") int layout) {
        long __functionAddress = device.getCapabilities().vkBindOpticalFlowSessionImageNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJJI(device.address(), session, bindingPoint, view, layout, __functionAddress);
    }

    public static void nvkCmdOpticalFlowExecuteNV(VkCommandBuffer commandBuffer, long session, long pExecuteInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdOpticalFlowExecuteNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkOpticalFlowExecuteInfoNV.validate(pExecuteInfo);
        }
        JNI.callPJPV(commandBuffer.address(), session, pExecuteInfo, __functionAddress);
    }

    public static void vkCmdOpticalFlowExecuteNV(VkCommandBuffer commandBuffer, @NativeType("VkOpticalFlowSessionNV") long session, @NativeType("VkOpticalFlowExecuteInfoNV const *") VkOpticalFlowExecuteInfoNV pExecuteInfo) {
        nvkCmdOpticalFlowExecuteNV(commandBuffer, session, pExecuteInfo.address());
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, @NativeType("VkOpticalFlowImageFormatInfoNV const *") VkOpticalFlowImageFormatInfoNV pOpticalFlowImageFormatInfo, @NativeType("uint32_t *") int[] pFormatCount, @NativeType("VkOpticalFlowImageFormatPropertiesNV *") VkOpticalFlowImageFormatPropertiesNV.Buffer pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pFormatCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pImageFormatProperties, pFormatCount[0]);
        }
        return JNI.callPPPPI(physicalDevice.address(), pOpticalFlowImageFormatInfo.address(), pFormatCount, MemoryUtil.memAddressSafe(pImageFormatProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateOpticalFlowSessionNV(VkDevice device, @NativeType("VkOpticalFlowSessionCreateInfoNV const *") VkOpticalFlowSessionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkOpticalFlowSessionNV *") long[] pSession) {
        long __functionAddress = device.getCapabilities().vkCreateOpticalFlowSessionNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSession, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSession, __functionAddress);
    }
}
