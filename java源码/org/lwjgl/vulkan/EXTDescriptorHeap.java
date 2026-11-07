package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VkHostAddressRangeEXT;
import org.lwjgl.vulkan.VkResourceDescriptorInfoEXT;
import org.lwjgl.vulkan.VkSamplerCreateInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDescriptorHeap.class */
public class EXTDescriptorHeap {
    public static final int VK_EXT_DESCRIPTOR_HEAP_SPEC_VERSION = 1;
    public static final String VK_EXT_DESCRIPTOR_HEAP_EXTENSION_NAME = "VK_EXT_descriptor_heap";
    public static final int VK_BUFFER_USAGE_DESCRIPTOR_HEAP_BIT_EXT = 268435456;
    public static final long VK_BUFFER_USAGE_2_DESCRIPTOR_HEAP_BIT_EXT = 268435456;
    public static final long VK_PIPELINE_CREATE_2_DESCRIPTOR_HEAP_BIT_EXT = 68719476736L;
    public static final int VK_IMAGE_CREATE_DESCRIPTOR_HEAP_CAPTURE_REPLAY_BIT_EXT = 65536;
    public static final int VK_STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT = 1000135000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT = 1000135001;
    public static final int VK_STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT = 1000135002;
    public static final int VK_STRUCTURE_TYPE_BIND_HEAP_INFO_EXT = 1000135003;
    public static final int VK_STRUCTURE_TYPE_PUSH_DATA_INFO_EXT = 1000135004;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT = 1000135005;
    public static final int VK_STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT = 1000135006;
    public static final int VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT = 1000135007;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT = 1000135008;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT = 1000135009;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT = 1000135010;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT = 1000135011;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV = 1000135012;
    public static final int VK_STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT = 1000135013;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM = 1000135014;
    public static final long VK_ACCESS_2_SAMPLER_HEAP_READ_BIT_EXT = 144115188075855872L;
    public static final long VK_ACCESS_2_RESOURCE_HEAP_READ_BIT_EXT = 288230376151711744L;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_EXT = 1000135000;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_SEQUENCE_INDEX_EXT = 1000135001;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_NV = 1000135000;
    public static final int VK_SHADER_CREATE_DESCRIPTOR_HEAP_BIT_EXT = 1024;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_CONSTANT_OFFSET_EXT = 0;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_PUSH_INDEX_EXT = 1;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_INDIRECT_INDEX_EXT = 2;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_INDIRECT_INDEX_ARRAY_EXT = 3;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_RESOURCE_HEAP_DATA_EXT = 4;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_PUSH_DATA_EXT = 5;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_PUSH_ADDRESS_EXT = 6;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_INDIRECT_ADDRESS_EXT = 7;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_SHADER_RECORD_INDEX_EXT = 8;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_SHADER_RECORD_DATA_EXT = 9;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_SHADER_RECORD_ADDRESS_EXT = 10;
    public static final int VK_SPIRV_RESOURCE_TYPE_SAMPLER_BIT_EXT = 1;
    public static final int VK_SPIRV_RESOURCE_TYPE_SAMPLED_IMAGE_BIT_EXT = 2;
    public static final int VK_SPIRV_RESOURCE_TYPE_READ_ONLY_IMAGE_BIT_EXT = 4;
    public static final int VK_SPIRV_RESOURCE_TYPE_READ_WRITE_IMAGE_BIT_EXT = 8;
    public static final int VK_SPIRV_RESOURCE_TYPE_COMBINED_SAMPLED_IMAGE_BIT_EXT = 16;
    public static final int VK_SPIRV_RESOURCE_TYPE_UNIFORM_BUFFER_BIT_EXT = 32;
    public static final int VK_SPIRV_RESOURCE_TYPE_READ_ONLY_STORAGE_BUFFER_BIT_EXT = 64;
    public static final int VK_SPIRV_RESOURCE_TYPE_READ_WRITE_STORAGE_BUFFER_BIT_EXT = 128;
    public static final int VK_SPIRV_RESOURCE_TYPE_ACCELERATION_STRUCTURE_BIT_EXT = 256;
    public static final int VK_SPIRV_RESOURCE_TYPE_TENSOR_BIT_ARM = 512;
    public static final int VK_SPIRV_RESOURCE_TYPE_ALL_EXT = Integer.MAX_VALUE;
    public static final long VK_TENSOR_CREATE_DESCRIPTOR_HEAP_CAPTURE_REPLAY_BIT_ARM = 8;

    protected EXTDescriptorHeap() {
        throw new UnsupportedOperationException();
    }

    public static int nvkWriteSamplerDescriptorsEXT(VkDevice device, int samplerCount, long pSamplers, long pDescriptors) {
        long __functionAddress = device.getCapabilities().vkWriteSamplerDescriptorsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pDescriptors, samplerCount, VkHostAddressRangeEXT.SIZEOF, VkHostAddressRangeEXT::validate);
        }
        return JNI.callPPPI(device.address(), samplerCount, pSamplers, pDescriptors, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWriteSamplerDescriptorsEXT(VkDevice device, @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo.Buffer pSamplers, @NativeType("VkHostAddressRangeEXT const *") VkHostAddressRangeEXT.Buffer pDescriptors) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pDescriptors, pSamplers.remaining());
        }
        return nvkWriteSamplerDescriptorsEXT(device, pSamplers.remaining(), pSamplers.address(), pDescriptors.address());
    }

    public static int nvkWriteResourceDescriptorsEXT(VkDevice device, int resourceCount, long pResources, long pDescriptors) {
        long __functionAddress = device.getCapabilities().vkWriteResourceDescriptorsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pDescriptors, resourceCount, VkHostAddressRangeEXT.SIZEOF, VkHostAddressRangeEXT::validate);
        }
        return JNI.callPPPI(device.address(), resourceCount, pResources, pDescriptors, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWriteResourceDescriptorsEXT(VkDevice device, @NativeType("VkResourceDescriptorInfoEXT const *") VkResourceDescriptorInfoEXT.Buffer pResources, @NativeType("VkHostAddressRangeEXT const *") VkHostAddressRangeEXT.Buffer pDescriptors) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pDescriptors, pResources.remaining());
        }
        return nvkWriteResourceDescriptorsEXT(device, pResources.remaining(), pResources.address(), pDescriptors.address());
    }

    public static void nvkCmdBindSamplerHeapEXT(VkCommandBuffer commandBuffer, long pBindInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindSamplerHeapEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pBindInfo, __functionAddress);
    }

    public static void vkCmdBindSamplerHeapEXT(VkCommandBuffer commandBuffer, @NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT pBindInfo) {
        nvkCmdBindSamplerHeapEXT(commandBuffer, pBindInfo.address());
    }

    public static void nvkCmdBindResourceHeapEXT(VkCommandBuffer commandBuffer, long pBindInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindResourceHeapEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pBindInfo, __functionAddress);
    }

    public static void vkCmdBindResourceHeapEXT(VkCommandBuffer commandBuffer, @NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT pBindInfo) {
        nvkCmdBindResourceHeapEXT(commandBuffer, pBindInfo.address());
    }

    public static void nvkCmdPushDataEXT(VkCommandBuffer commandBuffer, long pPushDataInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkPushDataInfoEXT.validate(pPushDataInfo);
        }
        JNI.callPPV(commandBuffer.address(), pPushDataInfo, __functionAddress);
    }

    public static void vkCmdPushDataEXT(VkCommandBuffer commandBuffer, @NativeType("VkPushDataInfoEXT const *") VkPushDataInfoEXT pPushDataInfo) {
        nvkCmdPushDataEXT(commandBuffer, pPushDataInfo.address());
    }

    public static int nvkGetImageOpaqueCaptureDataEXT(VkDevice device, int imageCount, long pImages, long pDatas) {
        long __functionAddress = device.getCapabilities().vkGetImageOpaqueCaptureDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), imageCount, pImages, pDatas, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetImageOpaqueCaptureDataEXT(VkDevice device, @NativeType("VkImage const *") LongBuffer pImages, @NativeType("VkHostAddressRangeEXT *") VkHostAddressRangeEXT.Buffer pDatas) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pDatas, pImages.remaining());
        }
        return nvkGetImageOpaqueCaptureDataEXT(device, pImages.remaining(), MemoryUtil.memAddress(pImages), pDatas.address());
    }

    @NativeType("VkDeviceSize")
    public static long vkGetPhysicalDeviceDescriptorSizeEXT(VkPhysicalDevice physicalDevice, @NativeType("VkDescriptorType") int descriptorType) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDescriptorSizeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJ(physicalDevice.address(), descriptorType, __functionAddress);
    }

    public static int nvkRegisterCustomBorderColorEXT(VkDevice device, long pBorderColor, int requestIndex, long pIndex) {
        long __functionAddress = device.getCapabilities().vkRegisterCustomBorderColorEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pBorderColor, requestIndex, pIndex, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkRegisterCustomBorderColorEXT(VkDevice device, @NativeType("VkSamplerCustomBorderColorCreateInfoEXT const *") VkSamplerCustomBorderColorCreateInfoEXT pBorderColor, @NativeType("VkBool32") boolean requestIndex, @NativeType("uint32_t *") IntBuffer pIndex) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pIndex, 1);
        }
        return nvkRegisterCustomBorderColorEXT(device, pBorderColor.address(), requestIndex ? 1 : 0, MemoryUtil.memAddress(pIndex));
    }

    public static void vkUnregisterCustomBorderColorEXT(VkDevice device, @NativeType("uint32_t") int index) {
        long __functionAddress = device.getCapabilities().vkUnregisterCustomBorderColorEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(device.address(), index, __functionAddress);
    }

    public static int nvkGetTensorOpaqueCaptureDataARM(VkDevice device, int tensorCount, long pTensors, long pDatas) {
        long __functionAddress = device.getCapabilities().vkGetTensorOpaqueCaptureDataARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), tensorCount, pTensors, pDatas, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetTensorOpaqueCaptureDataARM(VkDevice device, @NativeType("VkTensorARM const *") LongBuffer pTensors, @NativeType("VkHostAddressRangeEXT *") VkHostAddressRangeEXT.Buffer pDatas) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pDatas, pTensors.remaining());
        }
        return nvkGetTensorOpaqueCaptureDataARM(device, pTensors.remaining(), MemoryUtil.memAddress(pTensors), pDatas.address());
    }

    @NativeType("VkResult")
    public static int vkGetImageOpaqueCaptureDataEXT(VkDevice device, @NativeType("VkImage const *") long[] pImages, @NativeType("VkHostAddressRangeEXT *") VkHostAddressRangeEXT.Buffer pDatas) {
        long __functionAddress = device.getCapabilities().vkGetImageOpaqueCaptureDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check((CustomBuffer<?>) pDatas, pImages.length);
        }
        return JNI.callPPPI(device.address(), pImages.length, pImages, pDatas.address(), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkRegisterCustomBorderColorEXT(VkDevice device, @NativeType("VkSamplerCustomBorderColorCreateInfoEXT const *") VkSamplerCustomBorderColorCreateInfoEXT pBorderColor, @NativeType("VkBool32") boolean requestIndex, @NativeType("uint32_t *") int[] pIndex) {
        long __functionAddress = device.getCapabilities().vkRegisterCustomBorderColorEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pIndex, 1);
        }
        return JNI.callPPPI(device.address(), pBorderColor.address(), requestIndex ? 1 : 0, pIndex, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetTensorOpaqueCaptureDataARM(VkDevice device, @NativeType("VkTensorARM const *") long[] pTensors, @NativeType("VkHostAddressRangeEXT *") VkHostAddressRangeEXT.Buffer pDatas) {
        long __functionAddress = device.getCapabilities().vkGetTensorOpaqueCaptureDataARM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check((CustomBuffer<?>) pDatas, pTensors.length);
        }
        return JNI.callPPPI(device.address(), pTensors.length, pTensors, pDatas.address(), __functionAddress);
    }
}
