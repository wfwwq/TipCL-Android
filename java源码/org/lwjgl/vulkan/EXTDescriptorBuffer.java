package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDescriptorBufferBindingInfoEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDescriptorBuffer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDescriptorBuffer.class */
public class EXTDescriptorBuffer {
    public static final int VK_EXT_DESCRIPTOR_BUFFER_SPEC_VERSION = 1;
    public static final String VK_EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME = "VK_EXT_descriptor_buffer";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT = 1000316000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT = 1000316001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT = 1000316002;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT = 1000316003;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT = 1000316004;
    public static final int VK_STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316005;
    public static final int VK_STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316007;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316008;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316009;
    public static final int VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT = 1000316010;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT = 1000316011;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT = 1000316012;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT = 16;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT = 32;
    public static final int VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT = 2097152;
    public static final int VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT = 4194304;
    public static final int VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 67108864;
    public static final int VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 32;
    public static final int VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 65536;
    public static final int VK_IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 4;
    public static final int VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 8;
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 8;
    public static final long VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT = 2199023255552L;
    public static final int VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT = 536870912;

    protected EXTDescriptorBuffer() {
        throw new UnsupportedOperationException();
    }

    public static void nvkGetDescriptorSetLayoutSizeEXT(VkDevice device, long layout, long pLayoutSizeInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSizeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), layout, pLayoutSizeInBytes, __functionAddress);
    }

    public static void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("VkDeviceSize *") LongBuffer pLayoutSizeInBytes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pLayoutSizeInBytes, 1);
        }
        nvkGetDescriptorSetLayoutSizeEXT(device, layout, MemoryUtil.memAddress(pLayoutSizeInBytes));
    }

    public static void nvkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, long layout, int binding, long pOffset) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutBindingOffsetEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), layout, binding, pOffset, __functionAddress);
    }

    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("uint32_t") int binding, @NativeType("VkDeviceSize *") LongBuffer pOffset) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pOffset, 1);
        }
        nvkGetDescriptorSetLayoutBindingOffsetEXT(device, layout, binding, MemoryUtil.memAddress(pOffset));
    }

    public static void nvkGetDescriptorEXT(VkDevice device, long pDescriptorInfo, long dataSize, long pDescriptor) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPPV(device.address(), pDescriptorInfo, dataSize, pDescriptor, __functionAddress);
    }

    public static void vkGetDescriptorEXT(VkDevice device, @NativeType("VkDescriptorGetInfoEXT const *") VkDescriptorGetInfoEXT pDescriptorInfo, @NativeType("void *") ByteBuffer pDescriptor) {
        nvkGetDescriptorEXT(device, pDescriptorInfo.address(), pDescriptor.remaining(), MemoryUtil.memAddress(pDescriptor));
    }

    public static void nvkCmdBindDescriptorBuffersEXT(VkCommandBuffer commandBuffer, int bufferCount, long pBindingInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorBuffersEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), bufferCount, pBindingInfos, __functionAddress);
    }

    public static void vkCmdBindDescriptorBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("VkDescriptorBufferBindingInfoEXT const *") VkDescriptorBufferBindingInfoEXT.Buffer pBindingInfos) {
        nvkCmdBindDescriptorBuffersEXT(commandBuffer, pBindingInfos.remaining(), pBindingInfos.address());
    }

    public static void nvkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int setCount, long pBufferIndices, long pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDescriptorBufferOffsetsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, setCount, pBufferIndices, pOffsets, __functionAddress);
    }

    public static void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("uint32_t const *") IntBuffer pBufferIndices, @NativeType("VkDeviceSize const *") LongBuffer pOffsets) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pOffsets, pBufferIndices.remaining());
        }
        nvkCmdSetDescriptorBufferOffsetsEXT(commandBuffer, pipelineBindPoint, layout, firstSet, pBufferIndices.remaining(), MemoryUtil.memAddress(pBufferIndices), MemoryUtil.memAddress(pOffsets));
    }

    public static void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJV(commandBuffer.address(), pipelineBindPoint, layout, set, __functionAddress);
    }

    public static int nvkGetBufferOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetBufferOpaqueCaptureDescriptorDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetBufferOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkBufferCaptureDescriptorDataInfoEXT const *") VkBufferCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pData, 1);
        }
        return nvkGetBufferOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), MemoryUtil.memAddress(pData));
    }

    public static int nvkGetImageOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetImageOpaqueCaptureDescriptorDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetImageOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkImageCaptureDescriptorDataInfoEXT const *") VkImageCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pData, 1);
        }
        return nvkGetImageOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), MemoryUtil.memAddress(pData));
    }

    public static int nvkGetImageViewOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetImageViewOpaqueCaptureDescriptorDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetImageViewOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkImageViewCaptureDescriptorDataInfoEXT const *") VkImageViewCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pData, 1);
        }
        return nvkGetImageViewOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), MemoryUtil.memAddress(pData));
    }

    public static int nvkGetSamplerOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetSamplerOpaqueCaptureDescriptorDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSamplerOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkSamplerCaptureDescriptorDataInfoEXT const *") VkSamplerCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pData, 1);
        }
        return nvkGetSamplerOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), MemoryUtil.memAddress(pData));
    }

    public static int nvkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkAccelerationStructureCaptureDescriptorDataInfoEXT const *") VkAccelerationStructureCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pData, 1);
        }
        return nvkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), MemoryUtil.memAddress(pData));
    }

    public static void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("VkDeviceSize *") long[] pLayoutSizeInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSizeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pLayoutSizeInBytes, 1);
        }
        JNI.callPJPV(device.address(), layout, pLayoutSizeInBytes, __functionAddress);
    }

    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("uint32_t") int binding, @NativeType("VkDeviceSize *") long[] pOffset) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutBindingOffsetEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pOffset, 1);
        }
        JNI.callPJPV(device.address(), layout, binding, pOffset, __functionAddress);
    }

    public static void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("uint32_t const *") int[] pBufferIndices, @NativeType("VkDeviceSize const *") long[] pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDescriptorBufferOffsetsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pOffsets, pBufferIndices.length);
        }
        JNI.callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, pBufferIndices.length, pBufferIndices, pOffsets, __functionAddress);
    }
}
