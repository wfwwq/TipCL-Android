package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBindBufferMemoryInfo;
import org.lwjgl.vulkan.VkBindImageMemoryInfo;
import org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties;
import org.lwjgl.vulkan.VkQueueFamilyProperties2;
import org.lwjgl.vulkan.VkSparseImageFormatProperties2;
import org.lwjgl.vulkan.VkSparseImageMemoryRequirements2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK11.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK11.class */
public class VK11 extends VK10 {
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO = 1000053000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES = 1000053001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES = 1000053002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 = 1000059000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 = 1000059001;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2 = 1000059002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 = 1000059003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 = 1000059004;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2 = 1000059005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 = 1000059006;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2 = 1000059007;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 = 1000059008;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO = 1000060000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO = 1000060003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO = 1000060004;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO = 1000060005;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO = 1000060006;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO = 1000060013;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO = 1000060014;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES = 1000063000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES = 1000063000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES = 1000070000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO = 1000070001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO = 1000071000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES = 1000071001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO = 1000071002;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES = 1000071003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES = 1000071004;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO = 1000072000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO = 1000072001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO = 1000072002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO = 1000076000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES = 1000076001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO = 1000077000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES = 1000083000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO = 1000085000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES = 1000094000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO = 1000112000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES = 1000112001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO = 1000113000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES = 1000117000;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO = 1000117001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO = 1000117002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO = 1000117003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES = 1000120000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES = 1000120000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS = 1000127000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO = 1000127001;
    public static final int VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO = 1000145000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES = 1000145001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES = 1000145002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2 = 1000145003;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2 = 1000146000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 = 1000146001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 = 1000146002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2 = 1000146003;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 = 1000146004;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO = 1000156000;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO = 1000156001;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO = 1000156002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO = 1000156003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES = 1000156004;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES = 1000156005;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO = 1000157000;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO = 1000157001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES = 1000168000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT = 1000168001;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT = 32;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT = 64;
    public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT = 128;
    public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT = 256;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT = 512;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT = 1024;
    public static final int VK_IMAGE_CREATE_PROTECTED_BIT = 2048;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT = 2;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT = 4;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = 2;
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY = -1000069000;
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE = -1000072003;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT = 16384;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT = 32768;
    public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT = 131072;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 262144;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 524288;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 1048576;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 2097152;
    public static final int VK_FORMAT_FEATURE_DISJOINT_BIT = 4194304;
    public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT = 8388608;
    public static final int VK_QUEUE_PROTECTED_BIT = 16;
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 1;
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 32;
    public static final int VK_BUFFER_CREATE_PROTECTED_BIT = 8;
    public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = 4;
    public static final int VK_FORMAT_G8B8G8R8_422_UNORM = 1000156000;
    public static final int VK_FORMAT_B8G8R8G8_422_UNORM = 1000156001;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM = 1000156002;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_420_UNORM = 1000156003;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM = 1000156004;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_422_UNORM = 1000156005;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM = 1000156006;
    public static final int VK_FORMAT_R10X6_UNORM_PACK16 = 1000156007;
    public static final int VK_FORMAT_R10X6G10X6_UNORM_2PACK16 = 1000156008;
    public static final int VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 = 1000156009;
    public static final int VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 = 1000156010;
    public static final int VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 = 1000156011;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 = 1000156012;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 = 1000156013;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 = 1000156014;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 = 1000156015;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 = 1000156016;
    public static final int VK_FORMAT_R12X4_UNORM_PACK16 = 1000156017;
    public static final int VK_FORMAT_R12X4G12X4_UNORM_2PACK16 = 1000156018;
    public static final int VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16 = 1000156019;
    public static final int VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 = 1000156020;
    public static final int VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 = 1000156021;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 = 1000156022;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 = 1000156023;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 = 1000156024;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 = 1000156025;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 = 1000156026;
    public static final int VK_FORMAT_G16B16G16R16_422_UNORM = 1000156027;
    public static final int VK_FORMAT_B16G16R16G16_422_UNORM = 1000156028;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM = 1000156029;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_420_UNORM = 1000156030;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM = 1000156031;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_422_UNORM = 1000156032;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM = 1000156033;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT = 16;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT = 32;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT = 64;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 8;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_BIT = 16;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE = 16;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE = 1000085000;
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION = 1000156000;
    public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = 1000117000;
    public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = 1000117001;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT = 1;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT = 2;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT = 4;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT = 8;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = 1;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT = 1;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT = 8;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT = 16;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT = 32;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT = 64;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT = 1;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT = 2;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT = 4;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT = 1;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT = 8;
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = 1;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = 2;
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = 1;
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT = 1;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT = 1;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT = 8;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE_BIT = 8;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT = 16;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT = 1;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT = 2;
    public static final int VK_SUBGROUP_FEATURE_BASIC_BIT = 1;
    public static final int VK_SUBGROUP_FEATURE_VOTE_BIT = 2;
    public static final int VK_SUBGROUP_FEATURE_ARITHMETIC_BIT = 4;
    public static final int VK_SUBGROUP_FEATURE_BALLOT_BIT = 8;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_BIT = 16;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT = 32;
    public static final int VK_SUBGROUP_FEATURE_CLUSTERED_BIT = 64;
    public static final int VK_SUBGROUP_FEATURE_QUAD_BIT = 128;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET = 0;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY = 0;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 = 2;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 = 3;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 = 4;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT = 1;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES = 0;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = 0;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = 1;
    public static final int VK_API_VERSION_1_1 = VK_MAKE_API_VERSION(0, 1, 1, 0);
    public static final int VK_LUID_SIZE = 8;
    public static final int VK_QUEUE_FAMILY_EXTERNAL = -2;
    public static final int VK_MAX_DEVICE_GROUP_SIZE = 32;

    protected VK11() {
        throw new UnsupportedOperationException();
    }

    public static int nvkEnumerateInstanceVersion(long pApiVersion) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceVersion;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPI(pApiVersion, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumerateInstanceVersion(@NativeType("uint32_t *") IntBuffer pApiVersion) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pApiVersion, 1);
        }
        return nvkEnumerateInstanceVersion(MemoryUtil.memAddress(pApiVersion));
    }

    public static int nvkBindBufferMemory2(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindBufferMemory2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBindBufferMemory2(VkDevice device, @NativeType("VkBindBufferMemoryInfo const *") VkBindBufferMemoryInfo.Buffer pBindInfos) {
        return nvkBindBufferMemory2(device, pBindInfos.remaining(), pBindInfos.address());
    }

    public static int nvkBindImageMemory2(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindImageMemory2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBindImageMemory2(VkDevice device, @NativeType("VkBindImageMemoryInfo const *") VkBindImageMemoryInfo.Buffer pBindInfos) {
        return nvkBindImageMemory2(device, pBindInfos.remaining(), pBindInfos.address());
    }

    public static void nvkGetDeviceGroupPeerMemoryFeatures(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, long pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeatures;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures, __functionAddress);
    }

    public static void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") IntBuffer pPeerMemoryFeatures) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPeerMemoryFeatures, 1);
        }
        nvkGetDeviceGroupPeerMemoryFeatures(device, heapIndex, localDeviceIndex, remoteDeviceIndex, MemoryUtil.memAddress(pPeerMemoryFeatures));
    }

    public static void vkCmdSetDeviceMask(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int deviceMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDeviceMask;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), deviceMask, __functionAddress);
    }

    public static int nvkEnumeratePhysicalDeviceGroups(VkInstance instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroups;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(instance.address(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroups(VkInstance instance, @NativeType("uint32_t *") IntBuffer pPhysicalDeviceGroupCount, @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.Buffer pPhysicalDeviceGroupProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPhysicalDeviceGroupCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount.get(pPhysicalDeviceGroupCount.position()));
        }
        return nvkEnumeratePhysicalDeviceGroups(instance, MemoryUtil.memAddress(pPhysicalDeviceGroupCount), MemoryUtil.memAddressSafe(pPhysicalDeviceGroupProperties));
    }

    public static void nvkGetImageMemoryRequirements2(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetImageMemoryRequirements2(VkDevice device, @NativeType("VkImageMemoryRequirementsInfo2 const *") VkImageMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetImageMemoryRequirements2(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static void nvkGetBufferMemoryRequirements2(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetBufferMemoryRequirements2(VkDevice device, @NativeType("VkBufferMemoryRequirementsInfo2 const *") VkBufferMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetBufferMemoryRequirements2(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static void nvkGetImageSparseMemoryRequirements2(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    public static void vkGetImageSparseMemoryRequirements2(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSparseMemoryRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetImageSparseMemoryRequirements2(device, pInfo.address(), MemoryUtil.memAddress(pSparseMemoryRequirementCount), MemoryUtil.memAddressSafe(pSparseMemoryRequirements));
    }

    public static void nvkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, long pFeatures) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(physicalDevice.address(), pFeatures, __functionAddress);
    }

    public static void vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceFeatures2 *") VkPhysicalDeviceFeatures2 pFeatures) {
        nvkGetPhysicalDeviceFeatures2(physicalDevice, pFeatures.address());
    }

    public static void nvkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(physicalDevice.address(), pProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceProperties2 *") VkPhysicalDeviceProperties2 pProperties) {
        nvkGetPhysicalDeviceProperties2(physicalDevice, pProperties.address());
    }

    public static void nvkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(physicalDevice.address(), format, pFormatProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkFormatProperties2 *") VkFormatProperties2 pFormatProperties) {
        nvkGetPhysicalDeviceFormatProperties2(physicalDevice, format, pFormatProperties.address());
    }

    public static int nvkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, long pImageFormatInfo, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pImageFormatInfo, pImageFormatProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceImageFormatInfo2 const *") VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, @NativeType("VkImageFormatProperties2 *") VkImageFormatProperties2 pImageFormatProperties) {
        return nvkGetPhysicalDeviceImageFormatProperties2(physicalDevice, pImageFormatInfo.address(), pImageFormatProperties.address());
    }

    public static void nvkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.Buffer pQueueFamilyProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pQueueFamilyPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
        }
        nvkGetPhysicalDeviceQueueFamilyProperties2(physicalDevice, MemoryUtil.memAddress(pQueueFamilyPropertyCount), MemoryUtil.memAddressSafe(pQueueFamilyProperties));
    }

    public static void nvkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(physicalDevice.address(), pMemoryProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceMemoryProperties2 *") VkPhysicalDeviceMemoryProperties2 pMemoryProperties) {
        nvkGetPhysicalDeviceMemoryProperties2(physicalDevice, pMemoryProperties.address());
    }

    public static void nvkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPPV(physicalDevice.address(), pFormatInfo, pPropertyCount, pProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        nvkGetPhysicalDeviceSparseImageFormatProperties2(physicalDevice, pFormatInfo.address(), MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static void vkTrimCommandPool(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandPoolTrimFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkTrimCommandPool;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJV(device.address(), commandPool, flags, __functionAddress);
    }

    public static void nvkGetDeviceQueue2(VkDevice device, long pQueueInfo, long pQueue) {
        long __functionAddress = device.getCapabilities().vkGetDeviceQueue2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), pQueueInfo, pQueue, __functionAddress);
    }

    public static void vkGetDeviceQueue2(VkDevice device, @NativeType("VkDeviceQueueInfo2 const *") VkDeviceQueueInfo2 pQueueInfo, @NativeType("VkQueue *") PointerBuffer pQueue) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pQueue, 1);
        }
        nvkGetDeviceQueue2(device, pQueueInfo.address(), MemoryUtil.memAddress(pQueue));
    }

    public static void nvkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalBufferProperties;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(physicalDevice.address(), pExternalBufferInfo, pExternalBufferProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalBufferInfo const *") VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, @NativeType("VkExternalBufferProperties *") VkExternalBufferProperties pExternalBufferProperties) {
        nvkGetPhysicalDeviceExternalBufferProperties(physicalDevice, pExternalBufferInfo.address(), pExternalBufferProperties.address());
    }

    public static void nvkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalFenceProperties;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(physicalDevice.address(), pExternalFenceInfo, pExternalFenceProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalFenceInfo const *") VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, @NativeType("VkExternalFenceProperties *") VkExternalFenceProperties pExternalFenceProperties) {
        nvkGetPhysicalDeviceExternalFenceProperties(physicalDevice, pExternalFenceInfo.address(), pExternalFenceProperties.address());
    }

    public static void nvkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalSemaphoreProperties;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(physicalDevice.address(), pExternalSemaphoreInfo, pExternalSemaphoreProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalSemaphoreInfo const *") VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, @NativeType("VkExternalSemaphoreProperties *") VkExternalSemaphoreProperties pExternalSemaphoreProperties) {
        nvkGetPhysicalDeviceExternalSemaphoreProperties(physicalDevice, pExternalSemaphoreInfo.address(), pExternalSemaphoreProperties.address());
    }

    public static void vkCmdDispatchBase(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int baseGroupX, @NativeType("uint32_t") int baseGroupY, @NativeType("uint32_t") int baseGroupZ, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchBase;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ, __functionAddress);
    }

    public static int nvkCreateDescriptorUpdateTemplate(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplate;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDescriptorUpdateTemplateCreateInfo.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pDescriptorUpdateTemplate, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplate(VkDevice device, @NativeType("VkDescriptorUpdateTemplateCreateInfo const *") VkDescriptorUpdateTemplateCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplate *") LongBuffer pDescriptorUpdateTemplate) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pDescriptorUpdateTemplate, 1);
        }
        return nvkCreateDescriptorUpdateTemplate(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pDescriptorUpdateTemplate));
    }

    public static void nvkDestroyDescriptorUpdateTemplate(VkDevice device, long descriptorUpdateTemplate, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDescriptorUpdateTemplate;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), descriptorUpdateTemplate, pAllocator, __functionAddress);
    }

    public static void vkDestroyDescriptorUpdateTemplate(VkDevice device, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDescriptorUpdateTemplate(device, descriptorUpdateTemplate, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void vkUpdateDescriptorSetWithTemplate(VkDevice device, @NativeType("VkDescriptorSet") long descriptorSet, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("void const *") long pData) {
        long __functionAddress = device.getCapabilities().vkUpdateDescriptorSetWithTemplate;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJPV(device.address(), descriptorSet, descriptorUpdateTemplate, pData, __functionAddress);
    }

    public static void nvkGetDescriptorSetLayoutSupport(VkDevice device, long pCreateInfo, long pSupport) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSupport;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
        }
        JNI.callPPPV(device.address(), pCreateInfo, pSupport, __functionAddress);
    }

    public static void vkGetDescriptorSetLayoutSupport(VkDevice device, @NativeType("VkDescriptorSetLayoutCreateInfo const *") VkDescriptorSetLayoutCreateInfo pCreateInfo, @NativeType("VkDescriptorSetLayoutSupport *") VkDescriptorSetLayoutSupport pSupport) {
        nvkGetDescriptorSetLayoutSupport(device, pCreateInfo.address(), pSupport.address());
    }

    public static int nvkCreateSamplerYcbcrConversion(VkDevice device, long pCreateInfo, long pAllocator, long pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversion;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pYcbcrConversion, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversion(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") LongBuffer pYcbcrConversion) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pYcbcrConversion, 1);
        }
        return nvkCreateSamplerYcbcrConversion(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pYcbcrConversion));
    }

    public static void nvkDestroySamplerYcbcrConversion(VkDevice device, long ycbcrConversion, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySamplerYcbcrConversion;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), ycbcrConversion, pAllocator, __functionAddress);
    }

    public static void vkDestroySamplerYcbcrConversion(VkDevice device, @NativeType("VkSamplerYcbcrConversion") long ycbcrConversion, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroySamplerYcbcrConversion(device, ycbcrConversion, MemoryUtil.memAddressSafe(pAllocator));
    }

    @NativeType("VkResult")
    public static int vkEnumerateInstanceVersion(@NativeType("uint32_t *") int[] pApiVersion) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceVersion;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pApiVersion, 1);
        }
        return JNI.callPI(pApiVersion, __functionAddress);
    }

    public static void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") int[] pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeatures;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPeerMemoryFeatures, 1);
        }
        JNI.callPPV(device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroups(VkInstance instance, @NativeType("uint32_t *") int[] pPhysicalDeviceGroupCount, @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.Buffer pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroups;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPhysicalDeviceGroupCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount[0]);
        }
        return JNI.callPPPI(instance.address(), pPhysicalDeviceGroupCount, MemoryUtil.memAddressSafe(pPhysicalDeviceGroupProperties), __functionAddress);
    }

    public static void vkGetImageSparseMemoryRequirements2(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSparseMemoryRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
        }
        JNI.callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, MemoryUtil.memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

    public static void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.Buffer pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pQueueFamilyPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
        }
        JNI.callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, MemoryUtil.memAddressSafe(pQueueFamilyProperties), __functionAddress);
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        JNI.callPPPPV(physicalDevice.address(), pFormatInfo.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplate(VkDevice device, @NativeType("VkDescriptorUpdateTemplateCreateInfo const *") VkDescriptorUpdateTemplateCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplate *") long[] pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplate;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pDescriptorUpdateTemplate, 1);
            VkDescriptorUpdateTemplateCreateInfo.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pDescriptorUpdateTemplate, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversion(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") long[] pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversion;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pYcbcrConversion, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pYcbcrConversion, __functionAddress);
    }
}
