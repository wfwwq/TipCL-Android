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
import org.lwjgl.vulkan.VkDependencyInfo;
import org.lwjgl.vulkan.VkPhysicalDeviceToolProperties;
import org.lwjgl.vulkan.VkRect2D;
import org.lwjgl.vulkan.VkSparseImageMemoryRequirements2;
import org.lwjgl.vulkan.VkSubmitInfo2;
import org.lwjgl.vulkan.VkViewport;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK13.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK13.class */
public class VK13 extends VK12 {
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES = 53;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES = 54;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INFO = 1000044000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO = 1000044001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO = 1000044002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES = 1000044003;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO = 1000044004;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES = 1000066000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES = 1000138000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES = 1000138001;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK = 1000138002;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO = 1000138003;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO = 1000192000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES = 1000215000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES = 1000225000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO = 1000225001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES = 1000225002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES = 1000245000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES = 1000276000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES = 1000280000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES = 1000280001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES = 1000281001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES = 1000295000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO = 1000295001;
    public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO = 1000295002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES = 1000297000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER_2 = 1000314000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 = 1000314001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 = 1000314002;
    public static final int VK_STRUCTURE_TYPE_DEPENDENCY_INFO = 1000314003;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO_2 = 1000314004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO = 1000314005;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO = 1000314006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES = 1000314007;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES = 1000325000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES = 1000335000;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 = 1000337000;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2 = 1000337001;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 = 1000337002;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2 = 1000337003;
    public static final int VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2 = 1000337004;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 = 1000337005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COPY_2 = 1000337006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COPY_2 = 1000337007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_BLIT_2 = 1000337008;
    public static final int VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2 = 1000337009;
    public static final int VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 = 1000337010;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 = 1000360000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES = 1000413000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES = 1000413001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS = 1000413002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS = 1000413003;
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT = 1000295000;
    public static final int VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL = 1000314000;
    public static final int VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL = 1000314001;
    public static final int VK_PIPELINE_STAGE_NONE = 0;
    public static final int VK_ACCESS_NONE = 0;
    public static final int VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK = 1000066000;
    public static final int VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK = 1000066001;
    public static final int VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK = 1000066002;
    public static final int VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK = 1000066003;
    public static final int VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK = 1000066004;
    public static final int VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK = 1000066005;
    public static final int VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK = 1000066006;
    public static final int VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK = 1000066007;
    public static final int VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK = 1000066008;
    public static final int VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK = 1000066009;
    public static final int VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK = 1000066010;
    public static final int VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK = 1000066011;
    public static final int VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK = 1000066012;
    public static final int VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK = 1000066013;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_444_UNORM = 1000330000;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 = 1000330001;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 = 1000330002;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_444_UNORM = 1000330003;
    public static final int VK_FORMAT_A4R4G4B4_UNORM_PACK16 = 1000340000;
    public static final int VK_FORMAT_A4B4G4R4_UNORM_PACK16 = 1000340001;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT = 1;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT = 2;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT = 4;
    public static final long VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT = 8;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT = 16;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 32;
    public static final long VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT = 64;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT = 128;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT = 256;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT = 512;
    public static final long VK_FORMAT_FEATURE_2_BLIT_SRC_BIT = 1024;
    public static final long VK_FORMAT_FEATURE_2_BLIT_DST_BIT = 2048;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 4096;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT = 8192;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT = 16384;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT = 32768;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 65536;
    public static final long VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT = 131072;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 262144;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 524288;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 1048576;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 2097152;
    public static final long VK_FORMAT_FEATURE_2_DISJOINT_BIT = 4194304;
    public static final long VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT = 8388608;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT = 2147483648L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT = 4294967296L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT = 8589934592L;
    public static final int VK_IMAGE_ASPECT_NONE = 0;
    public static final int VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 256;
    public static final int VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT = 512;
    public static final int VK_PIPELINE_COMPILE_REQUIRED = 1000297000;
    public static final int VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 1;
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT = 1;
    public static final int VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT = 1;
    public static final int VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT = 2;
    public static final int VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK = 1000138000;
    public static final int VK_ATTACHMENT_STORE_OP_NONE = 1000301000;
    public static final int VK_DYNAMIC_STATE_CULL_MODE = 1000267000;
    public static final int VK_DYNAMIC_STATE_FRONT_FACE = 1000267001;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY = 1000267002;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT = 1000267003;
    public static final int VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT = 1000267004;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE = 1000267005;
    public static final int VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE = 1000267006;
    public static final int VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE = 1000267007;
    public static final int VK_DYNAMIC_STATE_DEPTH_COMPARE_OP = 1000267008;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE = 1000267009;
    public static final int VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE = 1000267010;
    public static final int VK_DYNAMIC_STATE_STENCIL_OP = 1000267011;
    public static final int VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE = 1000377001;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE = 1000377002;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE = 1000377004;
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT = 1;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT = 2;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT = 4;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT = 8;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT = 16;
    public static final long VK_PIPELINE_STAGE_2_NONE = 0;
    public static final long VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT = 1;
    public static final long VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT = 2;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT = 4;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT = 8;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT = 16;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT = 32;
    public static final long VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT = 64;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT = 128;
    public static final long VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT = 256;
    public static final long VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT = 512;
    public static final long VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT = 1024;
    public static final long VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT = 2048;
    public static final long VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT = 4096;
    public static final long VK_PIPELINE_STAGE_2_TRANSFER_BIT = 4096;
    public static final long VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT = 8192;
    public static final long VK_PIPELINE_STAGE_2_HOST_BIT = 16384;
    public static final long VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT = 32768;
    public static final long VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT = 65536;
    public static final long VK_PIPELINE_STAGE_2_COPY_BIT = 4294967296L;
    public static final long VK_PIPELINE_STAGE_2_RESOLVE_BIT = 8589934592L;
    public static final long VK_PIPELINE_STAGE_2_BLIT_BIT = 17179869184L;
    public static final long VK_PIPELINE_STAGE_2_CLEAR_BIT = 34359738368L;
    public static final long VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT = 68719476736L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT = 137438953472L;
    public static final long VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT = 274877906944L;
    public static final long VK_ACCESS_2_NONE = 0;
    public static final long VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT = 1;
    public static final long VK_ACCESS_2_INDEX_READ_BIT = 2;
    public static final long VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT = 4;
    public static final long VK_ACCESS_2_UNIFORM_READ_BIT = 8;
    public static final long VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT = 16;
    public static final long VK_ACCESS_2_SHADER_READ_BIT = 32;
    public static final long VK_ACCESS_2_SHADER_WRITE_BIT = 64;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT = 128;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT = 256;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 512;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 1024;
    public static final long VK_ACCESS_2_TRANSFER_READ_BIT = 2048;
    public static final long VK_ACCESS_2_TRANSFER_WRITE_BIT = 4096;
    public static final long VK_ACCESS_2_HOST_READ_BIT = 8192;
    public static final long VK_ACCESS_2_HOST_WRITE_BIT = 16384;
    public static final long VK_ACCESS_2_MEMORY_READ_BIT = 32768;
    public static final long VK_ACCESS_2_MEMORY_WRITE_BIT = 65536;
    public static final long VK_ACCESS_2_SHADER_SAMPLED_READ_BIT = 4294967296L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_READ_BIT = 8589934592L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT = 17179869184L;
    public static final int VK_SUBMIT_PROTECTED_BIT = 1;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT = 1;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT = 2;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT = 4;
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT = 1;
    public static final int VK_RENDERING_SUSPENDING_BIT = 2;
    public static final int VK_RENDERING_RESUMING_BIT = 4;
    public static final int VK_API_VERSION_1_3 = VK_MAKE_API_VERSION(0, 1, 3, 0);

    protected VK13() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, long pToolCount, long pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolProperties;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pToolCount, pToolProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pToolCount, @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.Buffer pToolProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pToolCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pToolProperties, pToolCount.get(pToolCount.position()));
        }
        return nvkGetPhysicalDeviceToolProperties(physicalDevice, MemoryUtil.memAddress(pToolCount), MemoryUtil.memAddressSafe(pToolProperties));
    }

    public static int nvkCreatePrivateDataSlot(VkDevice device, long pCreateInfo, long pAllocator, long pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlot;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pPrivateDataSlot, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlot(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") LongBuffer pPrivateDataSlot) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPrivateDataSlot, 1);
        }
        return nvkCreatePrivateDataSlot(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pPrivateDataSlot));
    }

    public static void nvkDestroyPrivateDataSlot(VkDevice device, long privateDataSlot, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPrivateDataSlot;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), privateDataSlot, pAllocator, __functionAddress);
    }

    public static void vkDestroyPrivateDataSlot(VkDevice device, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyPrivateDataSlot(device, privateDataSlot, MemoryUtil.memAddressSafe(pAllocator));
    }

    @NativeType("VkResult")
    public static int vkSetPrivateData(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t") long data) {
        long __functionAddress = device.getCapabilities().vkSetPrivateData;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJJJI(device.address(), objectType, objectHandle, privateDataSlot, data, __functionAddress);
    }

    public static void nvkGetPrivateData(VkDevice device, int objectType, long objectHandle, long privateDataSlot, long pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateData;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

    public static void vkGetPrivateData(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") LongBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pData, 1);
        }
        nvkGetPrivateData(device, objectType, objectHandle, privateDataSlot, MemoryUtil.memAddress(pData));
    }

    public static void nvkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        JNI.callPPV(commandBuffer.address(), pDependencyInfo, __functionAddress);
    }

    public static void vkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdPipelineBarrier2(commandBuffer, pDependencyInfo.address());
    }

    public static void vkCmdWriteTimestamp2(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags2") long stage, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJV(commandBuffer.address(), stage, queryPool, query, __functionAddress);
    }

    public static int nvkQueueSubmit2(VkQueue queue, int submitCount, long pSubmits, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueSubmit2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            if (pSubmits != 0) {
                Struct.validate(pSubmits, submitCount, VkSubmitInfo2.SIZEOF, VkSubmitInfo2::validate);
            }
        }
        return JNI.callPPJI(queue.address(), submitCount, pSubmits, fence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkQueueSubmit2(VkQueue queue, @NativeType("VkSubmitInfo2 const *") VkSubmitInfo2.Buffer pSubmits, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit2(queue, Checks.remainingSafe(pSubmits), MemoryUtil.memAddressSafe(pSubmits), fence);
    }

    public static void nvkCmdCopyBuffer2(VkCommandBuffer commandBuffer, long pCopyBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyBufferInfo2.validate(pCopyBufferInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyBufferInfo, __functionAddress);
    }

    public static void vkCmdCopyBuffer2(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferInfo2 const *") VkCopyBufferInfo2 pCopyBufferInfo) {
        nvkCmdCopyBuffer2(commandBuffer, pCopyBufferInfo.address());
    }

    public static void nvkCmdCopyImage2(VkCommandBuffer commandBuffer, long pCopyImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyImageInfo2.validate(pCopyImageInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyImageInfo, __functionAddress);
    }

    public static void vkCmdCopyImage2(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageInfo2 const *") VkCopyImageInfo2 pCopyImageInfo) {
        nvkCmdCopyImage2(commandBuffer, pCopyImageInfo.address());
    }

    public static void nvkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, long pCopyBufferToImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyBufferToImageInfo2.validate(pCopyBufferToImageInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyBufferToImageInfo, __functionAddress);
    }

    public static void vkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferToImageInfo2 const *") VkCopyBufferToImageInfo2 pCopyBufferToImageInfo) {
        nvkCmdCopyBufferToImage2(commandBuffer, pCopyBufferToImageInfo.address());
    }

    public static void nvkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, long pCopyImageToBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyImageToBufferInfo2.validate(pCopyImageToBufferInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyImageToBufferInfo, __functionAddress);
    }

    public static void vkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageToBufferInfo2 const *") VkCopyImageToBufferInfo2 pCopyImageToBufferInfo) {
        nvkCmdCopyImageToBuffer2(commandBuffer, pCopyImageToBufferInfo.address());
    }

    public static void nvkGetDeviceBufferMemoryRequirements(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceBufferMemoryRequirements;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDeviceBufferMemoryRequirements.validate(pInfo);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetDeviceBufferMemoryRequirements(VkDevice device, @NativeType("VkDeviceBufferMemoryRequirements const *") VkDeviceBufferMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceBufferMemoryRequirements(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static void nvkGetDeviceImageMemoryRequirements(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageMemoryRequirements;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetDeviceImageMemoryRequirements(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceImageMemoryRequirements(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static void nvkGetDeviceImageSparseMemoryRequirements(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirements;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        JNI.callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    public static void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSparseMemoryRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetDeviceImageSparseMemoryRequirements(device, pInfo.address(), MemoryUtil.memAddress(pSparseMemoryRequirementCount), MemoryUtil.memAddressSafe(pSparseMemoryRequirements));
    }

    public static void nvkCmdSetEvent2(VkCommandBuffer commandBuffer, long event, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        JNI.callPJPV(commandBuffer.address(), event, pDependencyInfo, __functionAddress);
    }

    public static void vkCmdSetEvent2(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdSetEvent2(commandBuffer, event, pDependencyInfo.address());
    }

    public static void vkCmdResetEvent2(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags2") long stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    public static void nvkCmdWaitEvents2(VkCommandBuffer commandBuffer, int eventCount, long pEvents, long pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pDependencyInfos, eventCount, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        JNI.callPPPV(commandBuffer.address(), eventCount, pEvents, pDependencyInfos, __functionAddress);
    }

    public static void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") LongBuffer pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pDependencyInfos, pEvents.remaining());
        }
        nvkCmdWaitEvents2(commandBuffer, pEvents.remaining(), MemoryUtil.memAddress(pEvents), pDependencyInfos.address());
    }

    public static void nvkCmdBlitImage2(VkCommandBuffer commandBuffer, long pBlitImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkBlitImageInfo2.validate(pBlitImageInfo);
        }
        JNI.callPPV(commandBuffer.address(), pBlitImageInfo, __functionAddress);
    }

    public static void vkCmdBlitImage2(VkCommandBuffer commandBuffer, @NativeType("VkBlitImageInfo2 const *") VkBlitImageInfo2 pBlitImageInfo) {
        nvkCmdBlitImage2(commandBuffer, pBlitImageInfo.address());
    }

    public static void nvkCmdResolveImage2(VkCommandBuffer commandBuffer, long pResolveImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkResolveImageInfo2.validate(pResolveImageInfo);
        }
        JNI.callPPV(commandBuffer.address(), pResolveImageInfo, __functionAddress);
    }

    public static void vkCmdResolveImage2(VkCommandBuffer commandBuffer, @NativeType("VkResolveImageInfo2 const *") VkResolveImageInfo2 pResolveImageInfo) {
        nvkCmdResolveImage2(commandBuffer, pResolveImageInfo.address());
    }

    public static void nvkCmdBeginRendering(VkCommandBuffer commandBuffer, long pRenderingInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRendering;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkRenderingInfo.validate(pRenderingInfo);
        }
        JNI.callPPV(commandBuffer.address(), pRenderingInfo, __functionAddress);
    }

    public static void vkCmdBeginRendering(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInfo const *") VkRenderingInfo pRenderingInfo) {
        nvkCmdBeginRendering(commandBuffer, pRenderingInfo.address());
    }

    public static void vkCmdEndRendering(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRendering;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), __functionAddress);
    }

    public static void vkCmdSetCullMode(VkCommandBuffer commandBuffer, @NativeType("VkCullModeFlags") int cullMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCullMode;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), cullMode, __functionAddress);
    }

    public static void vkCmdSetFrontFace(VkCommandBuffer commandBuffer, @NativeType("VkFrontFace") int frontFace) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFrontFace;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), frontFace, __functionAddress);
    }

    public static void vkCmdSetPrimitiveTopology(VkCommandBuffer commandBuffer, @NativeType("VkPrimitiveTopology") int primitiveTopology) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveTopology;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), primitiveTopology, __functionAddress);
    }

    public static void nvkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, int viewportCount, long pViewports) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWithCount;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), viewportCount, pViewports, __functionAddress);
    }

    public static void vkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, @NativeType("VkViewport const *") VkViewport.Buffer pViewports) {
        nvkCmdSetViewportWithCount(commandBuffer, pViewports.remaining(), pViewports.address());
    }

    public static void nvkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, int scissorCount, long pScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissorWithCount;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), scissorCount, pScissors, __functionAddress);
    }

    public static void vkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, @NativeType("VkRect2D const *") VkRect2D.Buffer pScissors) {
        nvkCmdSetScissorWithCount(commandBuffer, pScissors.remaining(), pScissors.address());
    }

    public static void nvkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes, long pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    public static void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @NativeType("VkDeviceSize const *") LongBuffer pSizes, @NativeType("VkDeviceSize const *") LongBuffer pStrides) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pOffsets, pBuffers.remaining());
            Checks.checkSafe((Buffer) pSizes, pBuffers.remaining());
            Checks.checkSafe((Buffer) pStrides, pBuffers.remaining());
        }
        nvkCmdBindVertexBuffers2(commandBuffer, firstBinding, pBuffers.remaining(), MemoryUtil.memAddress(pBuffers), MemoryUtil.memAddress(pOffsets), MemoryUtil.memAddressSafe(pSizes), MemoryUtil.memAddressSafe(pStrides));
    }

    public static void vkCmdSetDepthTestEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthTestEnable;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), depthTestEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetDepthWriteEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthWriteEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthWriteEnable;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), depthWriteEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetDepthCompareOp(VkCommandBuffer commandBuffer, @NativeType("VkCompareOp") int depthCompareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthCompareOp;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), depthCompareOp, __functionAddress);
    }

    public static void vkCmdSetDepthBoundsTestEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBoundsTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBoundsTestEnable;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), depthBoundsTestEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetStencilTestEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stencilTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilTestEnable;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), stencilTestEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetStencilOp(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("VkStencilOp") int failOp, @NativeType("VkStencilOp") int passOp, @NativeType("VkStencilOp") int depthFailOp, @NativeType("VkCompareOp") int compareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilOp;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), faceMask, failOp, passOp, depthFailOp, compareOp, __functionAddress);
    }

    public static void vkCmdSetRasterizerDiscardEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean rasterizerDiscardEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizerDiscardEnable;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), rasterizerDiscardEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetDepthBiasEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBiasEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBiasEnable;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), depthBiasEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetPrimitiveRestartEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean primitiveRestartEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveRestartEnable;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), primitiveRestartEnable ? 1 : 0, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pToolCount, @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.Buffer pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolProperties;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pToolCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pToolProperties, pToolCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pToolCount, MemoryUtil.memAddressSafe(pToolProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlot(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") long[] pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlot;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPrivateDataSlot, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pPrivateDataSlot, __functionAddress);
    }

    public static void vkGetPrivateData(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") long[] pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateData;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pData, 1);
        }
        JNI.callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

    public static void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirements;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSparseMemoryRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
            VkDeviceImageMemoryRequirements.validate(pInfo.address());
        }
        JNI.callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, MemoryUtil.memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

    public static void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") long[] pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check((CustomBuffer<?>) pDependencyInfos, pEvents.length);
            Struct.validate(pDependencyInfos.address(), pEvents.length, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        JNI.callPPPV(commandBuffer.address(), pEvents.length, pEvents, pDependencyInfos.address(), __functionAddress);
    }

    public static void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @NativeType("VkDeviceSize const *") long[] pSizes, @NativeType("VkDeviceSize const *") long[] pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pOffsets, pBuffers.length);
            Checks.checkSafe(pSizes, pBuffers.length);
            Checks.checkSafe(pStrides, pBuffers.length);
        }
        JNI.callPPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }
}
