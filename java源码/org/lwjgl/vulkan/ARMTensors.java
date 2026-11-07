package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBindTensorMemoryInfoARM;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/ARMTensors.class */
public class ARMTensors {
    public static final int VK_ARM_TENSORS_SPEC_VERSION = 1;
    public static final String VK_ARM_TENSORS_EXTENSION_NAME = "VK_ARM_tensors";
    public static final int VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM = 1000460000;
    public static final int VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM = 1000460001;
    public static final int VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM = 1000460002;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM = 1000460003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM = 1000460004;
    public static final int VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM = 1000460005;
    public static final int VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM = 1000460006;
    public static final int VK_STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM = 1000460007;
    public static final int VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM = 1000460008;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM = 1000460009;
    public static final int VK_STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM = 1000460010;
    public static final int VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM = 1000460011;
    public static final int VK_STRUCTURE_TYPE_TENSOR_COPY_ARM = 1000460012;
    public static final int VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM = 1000460013;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM = 1000460014;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM = 1000460015;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM = 1000460016;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM = 1000460017;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM = 1000460018;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM = 1000460019;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM = 1000460020;
    public static final int VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM = 1000460021;
    public static final int VK_STRUCTURE_TYPE_TENSOR_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_ARM = 1000460022;
    public static final int VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM = 1000460023;
    public static final int VK_OBJECT_TYPE_TENSOR_ARM = 1000460000;
    public static final int VK_OBJECT_TYPE_TENSOR_VIEW_ARM = 1000460001;
    public static final int VK_DESCRIPTOR_TYPE_TENSOR_ARM = 1000460000;
    public static final long VK_FORMAT_FEATURE_2_TENSOR_SHADER_BIT_ARM = 549755813888L;
    public static final long VK_FORMAT_FEATURE_2_TENSOR_IMAGE_ALIASING_BIT_ARM = 8796093022208L;
    public static final int VK_IMAGE_USAGE_TENSOR_ALIASING_BIT_ARM = 8388608;
    public static final int VK_IMAGE_LAYOUT_TENSOR_ALIASING_ARM = 1000460000;
    public static final int VK_FORMAT_R8_BOOL_ARM = 1000460000;
    public static final long VK_TENSOR_CREATE_MUTABLE_FORMAT_BIT_ARM = 1;
    public static final long VK_TENSOR_CREATE_PROTECTED_BIT_ARM = 2;
    public static final long VK_TENSOR_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM = 4;
    public static final long VK_TENSOR_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM = 1;
    public static final long VK_TENSOR_USAGE_SHADER_BIT_ARM = 2;
    public static final long VK_TENSOR_USAGE_TRANSFER_SRC_BIT_ARM = 4;
    public static final long VK_TENSOR_USAGE_TRANSFER_DST_BIT_ARM = 8;
    public static final long VK_TENSOR_USAGE_IMAGE_ALIASING_BIT_ARM = 16;
    public static final int VK_TENSOR_TILING_OPTIMAL_ARM = 0;
    public static final int VK_TENSOR_TILING_LINEAR_ARM = 1;

    protected ARMTensors() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateTensorARM(VkDevice device, long pCreateInfo, long pAllocator, long pTensor) {
        long __functionAddress = device.getCapabilities().vkCreateTensorARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkTensorCreateInfoARM.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pTensor, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateTensorARM(VkDevice device, @NativeType("VkTensorCreateInfoARM const *") VkTensorCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkTensorARM *") LongBuffer pTensor) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pTensor, 1);
        }
        return nvkCreateTensorARM(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pTensor));
    }

    public static void nvkDestroyTensorARM(VkDevice device, long tensor, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyTensorARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), tensor, pAllocator, __functionAddress);
    }

    public static void vkDestroyTensorARM(VkDevice device, @NativeType("VkTensorARM") long tensor, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyTensorARM(device, tensor, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateTensorViewARM(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
        long __functionAddress = device.getCapabilities().vkCreateTensorViewARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pView, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateTensorViewARM(VkDevice device, @NativeType("VkTensorViewCreateInfoARM const *") VkTensorViewCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkTensorViewARM *") LongBuffer pView) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pView, 1);
        }
        return nvkCreateTensorViewARM(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pView));
    }

    public static void nvkDestroyTensorViewARM(VkDevice device, long tensorView, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyTensorViewARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), tensorView, pAllocator, __functionAddress);
    }

    public static void vkDestroyTensorViewARM(VkDevice device, @NativeType("VkTensorViewARM") long tensorView, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyTensorViewARM(device, tensorView, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkGetTensorMemoryRequirementsARM(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetTensorMemoryRequirementsARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetTensorMemoryRequirementsARM(VkDevice device, @NativeType("VkTensorMemoryRequirementsInfoARM const *") VkTensorMemoryRequirementsInfoARM pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetTensorMemoryRequirementsARM(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static int nvkBindTensorMemoryARM(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindTensorMemoryARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBindTensorMemoryARM(VkDevice device, @NativeType("VkBindTensorMemoryInfoARM const *") VkBindTensorMemoryInfoARM.Buffer pBindInfos) {
        return nvkBindTensorMemoryARM(device, pBindInfos.remaining(), pBindInfos.address());
    }

    public static void nvkGetDeviceTensorMemoryRequirementsARM(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceTensorMemoryRequirementsARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDeviceTensorMemoryRequirementsARM.validate(pInfo);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetDeviceTensorMemoryRequirementsARM(VkDevice device, @NativeType("VkDeviceTensorMemoryRequirementsARM const *") VkDeviceTensorMemoryRequirementsARM pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceTensorMemoryRequirementsARM(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static void nvkCmdCopyTensorARM(VkCommandBuffer commandBuffer, long pCopyTensorInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyTensorARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyTensorInfoARM.validate(pCopyTensorInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyTensorInfo, __functionAddress);
    }

    public static void vkCmdCopyTensorARM(VkCommandBuffer commandBuffer, @NativeType("VkCopyTensorInfoARM const *") VkCopyTensorInfoARM pCopyTensorInfo) {
        nvkCmdCopyTensorARM(commandBuffer, pCopyTensorInfo.address());
    }

    public static void nvkGetPhysicalDeviceExternalTensorPropertiesARM(VkPhysicalDevice physicalDevice, long pExternalTensorInfo, long pExternalTensorProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalTensorPropertiesARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPhysicalDeviceExternalTensorInfoARM.validate(pExternalTensorInfo);
        }
        JNI.callPPPV(physicalDevice.address(), pExternalTensorInfo, pExternalTensorProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceExternalTensorPropertiesARM(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalTensorInfoARM const *") VkPhysicalDeviceExternalTensorInfoARM pExternalTensorInfo, @NativeType("VkExternalTensorPropertiesARM *") VkExternalTensorPropertiesARM pExternalTensorProperties) {
        nvkGetPhysicalDeviceExternalTensorPropertiesARM(physicalDevice, pExternalTensorInfo.address(), pExternalTensorProperties.address());
    }

    public static int nvkGetTensorOpaqueCaptureDescriptorDataARM(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetTensorOpaqueCaptureDescriptorDataARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetTensorOpaqueCaptureDescriptorDataARM(VkDevice device, @NativeType("VkTensorCaptureDescriptorDataInfoARM const *") VkTensorCaptureDescriptorDataInfoARM pInfo, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pData, 1);
        }
        return nvkGetTensorOpaqueCaptureDescriptorDataARM(device, pInfo.address(), MemoryUtil.memAddress(pData));
    }

    public static int nvkGetTensorViewOpaqueCaptureDescriptorDataARM(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetTensorViewOpaqueCaptureDescriptorDataARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetTensorViewOpaqueCaptureDescriptorDataARM(VkDevice device, @NativeType("VkTensorViewCaptureDescriptorDataInfoARM const *") VkTensorViewCaptureDescriptorDataInfoARM pInfo, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pData, 1);
        }
        return nvkGetTensorViewOpaqueCaptureDescriptorDataARM(device, pInfo.address(), MemoryUtil.memAddress(pData));
    }

    @NativeType("VkResult")
    public static int vkCreateTensorARM(VkDevice device, @NativeType("VkTensorCreateInfoARM const *") VkTensorCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkTensorARM *") long[] pTensor) {
        long __functionAddress = device.getCapabilities().vkCreateTensorARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pTensor, 1);
            VkTensorCreateInfoARM.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pTensor, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateTensorViewARM(VkDevice device, @NativeType("VkTensorViewCreateInfoARM const *") VkTensorViewCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkTensorViewARM *") long[] pView) {
        long __functionAddress = device.getCapabilities().vkCreateTensorViewARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pView, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pView, __functionAddress);
    }
}
