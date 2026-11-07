package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VkBindSparseInfo;
import org.lwjgl.vulkan.VkBufferCopy;
import org.lwjgl.vulkan.VkBufferImageCopy;
import org.lwjgl.vulkan.VkBufferMemoryBarrier;
import org.lwjgl.vulkan.VkClearAttachment;
import org.lwjgl.vulkan.VkClearRect;
import org.lwjgl.vulkan.VkComputePipelineCreateInfo;
import org.lwjgl.vulkan.VkCopyDescriptorSet;
import org.lwjgl.vulkan.VkExtensionProperties;
import org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo;
import org.lwjgl.vulkan.VkImageBlit;
import org.lwjgl.vulkan.VkImageCopy;
import org.lwjgl.vulkan.VkImageMemoryBarrier;
import org.lwjgl.vulkan.VkImageResolve;
import org.lwjgl.vulkan.VkImageSubresourceRange;
import org.lwjgl.vulkan.VkLayerProperties;
import org.lwjgl.vulkan.VkMappedMemoryRange;
import org.lwjgl.vulkan.VkMemoryBarrier;
import org.lwjgl.vulkan.VkQueueFamilyProperties;
import org.lwjgl.vulkan.VkRect2D;
import org.lwjgl.vulkan.VkSparseImageFormatProperties;
import org.lwjgl.vulkan.VkSparseImageMemoryRequirements;
import org.lwjgl.vulkan.VkSubmitInfo;
import org.lwjgl.vulkan.VkViewport;
import org.lwjgl.vulkan.VkWriteDescriptorSet;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK10.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK10.class */
public class VK10 {
    public static final int VK_SUCCESS = 0;
    public static final int VK_NOT_READY = 1;
    public static final int VK_TIMEOUT = 2;
    public static final int VK_EVENT_SET = 3;
    public static final int VK_EVENT_RESET = 4;
    public static final int VK_INCOMPLETE = 5;
    public static final int VK_ERROR_OUT_OF_HOST_MEMORY = -1;
    public static final int VK_ERROR_OUT_OF_DEVICE_MEMORY = -2;
    public static final int VK_ERROR_INITIALIZATION_FAILED = -3;
    public static final int VK_ERROR_DEVICE_LOST = -4;
    public static final int VK_ERROR_MEMORY_MAP_FAILED = -5;
    public static final int VK_ERROR_LAYER_NOT_PRESENT = -6;
    public static final int VK_ERROR_EXTENSION_NOT_PRESENT = -7;
    public static final int VK_ERROR_FEATURE_NOT_PRESENT = -8;
    public static final int VK_ERROR_INCOMPATIBLE_DRIVER = -9;
    public static final int VK_ERROR_TOO_MANY_OBJECTS = -10;
    public static final int VK_ERROR_FORMAT_NOT_SUPPORTED = -11;
    public static final int VK_ERROR_FRAGMENTED_POOL = -12;
    public static final int VK_ERROR_UNKNOWN = -13;
    public static final int VK_ERROR_VALIDATION_FAILED = -1000011001;
    public static final int VK_STRUCTURE_TYPE_APPLICATION_INFO = 0;
    public static final int VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO = 1;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO = 2;
    public static final int VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO = 3;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO = 4;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO = 5;
    public static final int VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE = 6;
    public static final int VK_STRUCTURE_TYPE_BIND_SPARSE_INFO = 7;
    public static final int VK_STRUCTURE_TYPE_FENCE_CREATE_INFO = 8;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO = 9;
    public static final int VK_STRUCTURE_TYPE_EVENT_CREATE_INFO = 10;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO = 11;
    public static final int VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO = 12;
    public static final int VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO = 13;
    public static final int VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO = 14;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO = 15;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO = 16;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO = 17;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO = 18;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO = 19;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = 20;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO = 21;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO = 22;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO = 23;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO = 24;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO = 25;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO = 26;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO = 27;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO = 28;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO = 29;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO = 30;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO = 31;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO = 32;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO = 33;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO = 34;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET = 35;
    public static final int VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET = 36;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO = 37;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO = 38;
    public static final int VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO = 39;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO = 40;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO = 41;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO = 42;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO = 43;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER = 44;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER = 45;
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER = 46;
    public static final int VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO = 47;
    public static final int VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO = 48;
    public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 1;
    public static final int VK_ACCESS_INDEX_READ_BIT = 2;
    public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 4;
    public static final int VK_ACCESS_UNIFORM_READ_BIT = 8;
    public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 16;
    public static final int VK_ACCESS_SHADER_READ_BIT = 32;
    public static final int VK_ACCESS_SHADER_WRITE_BIT = 64;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 128;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 256;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 512;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 1024;
    public static final int VK_ACCESS_TRANSFER_READ_BIT = 2048;
    public static final int VK_ACCESS_TRANSFER_WRITE_BIT = 4096;
    public static final int VK_ACCESS_HOST_READ_BIT = 8192;
    public static final int VK_ACCESS_HOST_WRITE_BIT = 16384;
    public static final int VK_ACCESS_MEMORY_READ_BIT = 32768;
    public static final int VK_ACCESS_MEMORY_WRITE_BIT = 65536;
    public static final int VK_IMAGE_LAYOUT_UNDEFINED = 0;
    public static final int VK_IMAGE_LAYOUT_GENERAL = 1;
    public static final int VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 2;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4;
    public static final int VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 5;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 6;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 7;
    public static final int VK_IMAGE_LAYOUT_PREINITIALIZED = 8;
    public static final int VK_IMAGE_ASPECT_COLOR_BIT = 1;
    public static final int VK_IMAGE_ASPECT_DEPTH_BIT = 2;
    public static final int VK_IMAGE_ASPECT_STENCIL_BIT = 4;
    public static final int VK_IMAGE_ASPECT_METADATA_BIT = 8;
    public static final int VK_OBJECT_TYPE_UNKNOWN = 0;
    public static final int VK_OBJECT_TYPE_INSTANCE = 1;
    public static final int VK_OBJECT_TYPE_PHYSICAL_DEVICE = 2;
    public static final int VK_OBJECT_TYPE_DEVICE = 3;
    public static final int VK_OBJECT_TYPE_QUEUE = 4;
    public static final int VK_OBJECT_TYPE_SEMAPHORE = 5;
    public static final int VK_OBJECT_TYPE_COMMAND_BUFFER = 6;
    public static final int VK_OBJECT_TYPE_FENCE = 7;
    public static final int VK_OBJECT_TYPE_DEVICE_MEMORY = 8;
    public static final int VK_OBJECT_TYPE_BUFFER = 9;
    public static final int VK_OBJECT_TYPE_IMAGE = 10;
    public static final int VK_OBJECT_TYPE_EVENT = 11;
    public static final int VK_OBJECT_TYPE_QUERY_POOL = 12;
    public static final int VK_OBJECT_TYPE_BUFFER_VIEW = 13;
    public static final int VK_OBJECT_TYPE_IMAGE_VIEW = 14;
    public static final int VK_OBJECT_TYPE_SHADER_MODULE = 15;
    public static final int VK_OBJECT_TYPE_PIPELINE_CACHE = 16;
    public static final int VK_OBJECT_TYPE_PIPELINE_LAYOUT = 17;
    public static final int VK_OBJECT_TYPE_RENDER_PASS = 18;
    public static final int VK_OBJECT_TYPE_PIPELINE = 19;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT = 20;
    public static final int VK_OBJECT_TYPE_SAMPLER = 21;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_POOL = 22;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET = 23;
    public static final int VK_OBJECT_TYPE_FRAMEBUFFER = 24;
    public static final int VK_OBJECT_TYPE_COMMAND_POOL = 25;
    public static final int VK_VENDOR_ID_KHRONOS = 65536;
    public static final int VK_VENDOR_ID_VIV = 65537;
    public static final int VK_VENDOR_ID_VSI = 65538;
    public static final int VK_VENDOR_ID_KAZAN = 65539;
    public static final int VK_VENDOR_ID_CODEPLAY = 65540;
    public static final int VK_VENDOR_ID_MESA = 65541;
    public static final int VK_VENDOR_ID_POCL = 65542;
    public static final int VK_VENDOR_ID_MOBILEYE = 65543;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;
    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;
    public static final int VK_FORMAT_UNDEFINED = 0;
    public static final int VK_FORMAT_R4G4_UNORM_PACK8 = 1;
    public static final int VK_FORMAT_R4G4B4A4_UNORM_PACK16 = 2;
    public static final int VK_FORMAT_B4G4R4A4_UNORM_PACK16 = 3;
    public static final int VK_FORMAT_R5G6B5_UNORM_PACK16 = 4;
    public static final int VK_FORMAT_B5G6R5_UNORM_PACK16 = 5;
    public static final int VK_FORMAT_R5G5B5A1_UNORM_PACK16 = 6;
    public static final int VK_FORMAT_B5G5R5A1_UNORM_PACK16 = 7;
    public static final int VK_FORMAT_A1R5G5B5_UNORM_PACK16 = 8;
    public static final int VK_FORMAT_R8_UNORM = 9;
    public static final int VK_FORMAT_R8_SNORM = 10;
    public static final int VK_FORMAT_R8_USCALED = 11;
    public static final int VK_FORMAT_R8_SSCALED = 12;
    public static final int VK_FORMAT_R8_UINT = 13;
    public static final int VK_FORMAT_R8_SINT = 14;
    public static final int VK_FORMAT_R8_SRGB = 15;
    public static final int VK_FORMAT_R8G8_UNORM = 16;
    public static final int VK_FORMAT_R8G8_SNORM = 17;
    public static final int VK_FORMAT_R8G8_USCALED = 18;
    public static final int VK_FORMAT_R8G8_SSCALED = 19;
    public static final int VK_FORMAT_R8G8_UINT = 20;
    public static final int VK_FORMAT_R8G8_SINT = 21;
    public static final int VK_FORMAT_R8G8_SRGB = 22;
    public static final int VK_FORMAT_R8G8B8_UNORM = 23;
    public static final int VK_FORMAT_R8G8B8_SNORM = 24;
    public static final int VK_FORMAT_R8G8B8_USCALED = 25;
    public static final int VK_FORMAT_R8G8B8_SSCALED = 26;
    public static final int VK_FORMAT_R8G8B8_UINT = 27;
    public static final int VK_FORMAT_R8G8B8_SINT = 28;
    public static final int VK_FORMAT_R8G8B8_SRGB = 29;
    public static final int VK_FORMAT_B8G8R8_UNORM = 30;
    public static final int VK_FORMAT_B8G8R8_SNORM = 31;
    public static final int VK_FORMAT_B8G8R8_USCALED = 32;
    public static final int VK_FORMAT_B8G8R8_SSCALED = 33;
    public static final int VK_FORMAT_B8G8R8_UINT = 34;
    public static final int VK_FORMAT_B8G8R8_SINT = 35;
    public static final int VK_FORMAT_B8G8R8_SRGB = 36;
    public static final int VK_FORMAT_R8G8B8A8_UNORM = 37;
    public static final int VK_FORMAT_R8G8B8A8_SNORM = 38;
    public static final int VK_FORMAT_R8G8B8A8_USCALED = 39;
    public static final int VK_FORMAT_R8G8B8A8_SSCALED = 40;
    public static final int VK_FORMAT_R8G8B8A8_UINT = 41;
    public static final int VK_FORMAT_R8G8B8A8_SINT = 42;
    public static final int VK_FORMAT_R8G8B8A8_SRGB = 43;
    public static final int VK_FORMAT_B8G8R8A8_UNORM = 44;
    public static final int VK_FORMAT_B8G8R8A8_SNORM = 45;
    public static final int VK_FORMAT_B8G8R8A8_USCALED = 46;
    public static final int VK_FORMAT_B8G8R8A8_SSCALED = 47;
    public static final int VK_FORMAT_B8G8R8A8_UINT = 48;
    public static final int VK_FORMAT_B8G8R8A8_SINT = 49;
    public static final int VK_FORMAT_B8G8R8A8_SRGB = 50;
    public static final int VK_FORMAT_A8B8G8R8_UNORM_PACK32 = 51;
    public static final int VK_FORMAT_A8B8G8R8_SNORM_PACK32 = 52;
    public static final int VK_FORMAT_A8B8G8R8_USCALED_PACK32 = 53;
    public static final int VK_FORMAT_A8B8G8R8_SSCALED_PACK32 = 54;
    public static final int VK_FORMAT_A8B8G8R8_UINT_PACK32 = 55;
    public static final int VK_FORMAT_A8B8G8R8_SINT_PACK32 = 56;
    public static final int VK_FORMAT_A8B8G8R8_SRGB_PACK32 = 57;
    public static final int VK_FORMAT_A2R10G10B10_UNORM_PACK32 = 58;
    public static final int VK_FORMAT_A2R10G10B10_SNORM_PACK32 = 59;
    public static final int VK_FORMAT_A2R10G10B10_USCALED_PACK32 = 60;
    public static final int VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = 61;
    public static final int VK_FORMAT_A2R10G10B10_UINT_PACK32 = 62;
    public static final int VK_FORMAT_A2R10G10B10_SINT_PACK32 = 63;
    public static final int VK_FORMAT_A2B10G10R10_UNORM_PACK32 = 64;
    public static final int VK_FORMAT_A2B10G10R10_SNORM_PACK32 = 65;
    public static final int VK_FORMAT_A2B10G10R10_USCALED_PACK32 = 66;
    public static final int VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = 67;
    public static final int VK_FORMAT_A2B10G10R10_UINT_PACK32 = 68;
    public static final int VK_FORMAT_A2B10G10R10_SINT_PACK32 = 69;
    public static final int VK_FORMAT_R16_UNORM = 70;
    public static final int VK_FORMAT_R16_SNORM = 71;
    public static final int VK_FORMAT_R16_USCALED = 72;
    public static final int VK_FORMAT_R16_SSCALED = 73;
    public static final int VK_FORMAT_R16_UINT = 74;
    public static final int VK_FORMAT_R16_SINT = 75;
    public static final int VK_FORMAT_R16_SFLOAT = 76;
    public static final int VK_FORMAT_R16G16_UNORM = 77;
    public static final int VK_FORMAT_R16G16_SNORM = 78;
    public static final int VK_FORMAT_R16G16_USCALED = 79;
    public static final int VK_FORMAT_R16G16_SSCALED = 80;
    public static final int VK_FORMAT_R16G16_UINT = 81;
    public static final int VK_FORMAT_R16G16_SINT = 82;
    public static final int VK_FORMAT_R16G16_SFLOAT = 83;
    public static final int VK_FORMAT_R16G16B16_UNORM = 84;
    public static final int VK_FORMAT_R16G16B16_SNORM = 85;
    public static final int VK_FORMAT_R16G16B16_USCALED = 86;
    public static final int VK_FORMAT_R16G16B16_SSCALED = 87;
    public static final int VK_FORMAT_R16G16B16_UINT = 88;
    public static final int VK_FORMAT_R16G16B16_SINT = 89;
    public static final int VK_FORMAT_R16G16B16_SFLOAT = 90;
    public static final int VK_FORMAT_R16G16B16A16_UNORM = 91;
    public static final int VK_FORMAT_R16G16B16A16_SNORM = 92;
    public static final int VK_FORMAT_R16G16B16A16_USCALED = 93;
    public static final int VK_FORMAT_R16G16B16A16_SSCALED = 94;
    public static final int VK_FORMAT_R16G16B16A16_UINT = 95;
    public static final int VK_FORMAT_R16G16B16A16_SINT = 96;
    public static final int VK_FORMAT_R16G16B16A16_SFLOAT = 97;
    public static final int VK_FORMAT_R32_UINT = 98;
    public static final int VK_FORMAT_R32_SINT = 99;
    public static final int VK_FORMAT_R32_SFLOAT = 100;
    public static final int VK_FORMAT_R32G32_UINT = 101;
    public static final int VK_FORMAT_R32G32_SINT = 102;
    public static final int VK_FORMAT_R32G32_SFLOAT = 103;
    public static final int VK_FORMAT_R32G32B32_UINT = 104;
    public static final int VK_FORMAT_R32G32B32_SINT = 105;
    public static final int VK_FORMAT_R32G32B32_SFLOAT = 106;
    public static final int VK_FORMAT_R32G32B32A32_UINT = 107;
    public static final int VK_FORMAT_R32G32B32A32_SINT = 108;
    public static final int VK_FORMAT_R32G32B32A32_SFLOAT = 109;
    public static final int VK_FORMAT_R64_UINT = 110;
    public static final int VK_FORMAT_R64_SINT = 111;
    public static final int VK_FORMAT_R64_SFLOAT = 112;
    public static final int VK_FORMAT_R64G64_UINT = 113;
    public static final int VK_FORMAT_R64G64_SINT = 114;
    public static final int VK_FORMAT_R64G64_SFLOAT = 115;
    public static final int VK_FORMAT_R64G64B64_UINT = 116;
    public static final int VK_FORMAT_R64G64B64_SINT = 117;
    public static final int VK_FORMAT_R64G64B64_SFLOAT = 118;
    public static final int VK_FORMAT_R64G64B64A64_UINT = 119;
    public static final int VK_FORMAT_R64G64B64A64_SINT = 120;
    public static final int VK_FORMAT_R64G64B64A64_SFLOAT = 121;
    public static final int VK_FORMAT_B10G11R11_UFLOAT_PACK32 = 122;
    public static final int VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 = 123;
    public static final int VK_FORMAT_D16_UNORM = 124;
    public static final int VK_FORMAT_X8_D24_UNORM_PACK32 = 125;
    public static final int VK_FORMAT_D32_SFLOAT = 126;
    public static final int VK_FORMAT_S8_UINT = 127;
    public static final int VK_FORMAT_D16_UNORM_S8_UINT = 128;
    public static final int VK_FORMAT_D24_UNORM_S8_UINT = 129;
    public static final int VK_FORMAT_D32_SFLOAT_S8_UINT = 130;
    public static final int VK_FORMAT_BC1_RGB_UNORM_BLOCK = 131;
    public static final int VK_FORMAT_BC1_RGB_SRGB_BLOCK = 132;
    public static final int VK_FORMAT_BC1_RGBA_UNORM_BLOCK = 133;
    public static final int VK_FORMAT_BC1_RGBA_SRGB_BLOCK = 134;
    public static final int VK_FORMAT_BC2_UNORM_BLOCK = 135;
    public static final int VK_FORMAT_BC2_SRGB_BLOCK = 136;
    public static final int VK_FORMAT_BC3_UNORM_BLOCK = 137;
    public static final int VK_FORMAT_BC3_SRGB_BLOCK = 138;
    public static final int VK_FORMAT_BC4_UNORM_BLOCK = 139;
    public static final int VK_FORMAT_BC4_SNORM_BLOCK = 140;
    public static final int VK_FORMAT_BC5_UNORM_BLOCK = 141;
    public static final int VK_FORMAT_BC5_SNORM_BLOCK = 142;
    public static final int VK_FORMAT_BC6H_UFLOAT_BLOCK = 143;
    public static final int VK_FORMAT_BC6H_SFLOAT_BLOCK = 144;
    public static final int VK_FORMAT_BC7_UNORM_BLOCK = 145;
    public static final int VK_FORMAT_BC7_SRGB_BLOCK = 146;
    public static final int VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK = 147;
    public static final int VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK = 148;
    public static final int VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK = 149;
    public static final int VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK = 150;
    public static final int VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK = 151;
    public static final int VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK = 152;
    public static final int VK_FORMAT_EAC_R11_UNORM_BLOCK = 153;
    public static final int VK_FORMAT_EAC_R11_SNORM_BLOCK = 154;
    public static final int VK_FORMAT_EAC_R11G11_UNORM_BLOCK = 155;
    public static final int VK_FORMAT_EAC_R11G11_SNORM_BLOCK = 156;
    public static final int VK_FORMAT_ASTC_4x4_UNORM_BLOCK = 157;
    public static final int VK_FORMAT_ASTC_4x4_SRGB_BLOCK = 158;
    public static final int VK_FORMAT_ASTC_5x4_UNORM_BLOCK = 159;
    public static final int VK_FORMAT_ASTC_5x4_SRGB_BLOCK = 160;
    public static final int VK_FORMAT_ASTC_5x5_UNORM_BLOCK = 161;
    public static final int VK_FORMAT_ASTC_5x5_SRGB_BLOCK = 162;
    public static final int VK_FORMAT_ASTC_6x5_UNORM_BLOCK = 163;
    public static final int VK_FORMAT_ASTC_6x5_SRGB_BLOCK = 164;
    public static final int VK_FORMAT_ASTC_6x6_UNORM_BLOCK = 165;
    public static final int VK_FORMAT_ASTC_6x6_SRGB_BLOCK = 166;
    public static final int VK_FORMAT_ASTC_8x5_UNORM_BLOCK = 167;
    public static final int VK_FORMAT_ASTC_8x5_SRGB_BLOCK = 168;
    public static final int VK_FORMAT_ASTC_8x6_UNORM_BLOCK = 169;
    public static final int VK_FORMAT_ASTC_8x6_SRGB_BLOCK = 170;
    public static final int VK_FORMAT_ASTC_8x8_UNORM_BLOCK = 171;
    public static final int VK_FORMAT_ASTC_8x8_SRGB_BLOCK = 172;
    public static final int VK_FORMAT_ASTC_10x5_UNORM_BLOCK = 173;
    public static final int VK_FORMAT_ASTC_10x5_SRGB_BLOCK = 174;
    public static final int VK_FORMAT_ASTC_10x6_UNORM_BLOCK = 175;
    public static final int VK_FORMAT_ASTC_10x6_SRGB_BLOCK = 176;
    public static final int VK_FORMAT_ASTC_10x8_UNORM_BLOCK = 177;
    public static final int VK_FORMAT_ASTC_10x8_SRGB_BLOCK = 178;
    public static final int VK_FORMAT_ASTC_10x10_UNORM_BLOCK = 179;
    public static final int VK_FORMAT_ASTC_10x10_SRGB_BLOCK = 180;
    public static final int VK_FORMAT_ASTC_12x10_UNORM_BLOCK = 181;
    public static final int VK_FORMAT_ASTC_12x10_SRGB_BLOCK = 182;
    public static final int VK_FORMAT_ASTC_12x12_UNORM_BLOCK = 183;
    public static final int VK_FORMAT_ASTC_12x12_SRGB_BLOCK = 184;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 1;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 2;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 4;
    public static final int VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 8;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 16;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 32;
    public static final int VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 64;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 128;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 256;
    public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 512;
    public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = 1024;
    public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = 2048;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 4096;
    public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 1;
    public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 2;
    public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 4;
    public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 8;
    public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 16;
    public static final int VK_SAMPLE_COUNT_1_BIT = 1;
    public static final int VK_SAMPLE_COUNT_2_BIT = 2;
    public static final int VK_SAMPLE_COUNT_4_BIT = 4;
    public static final int VK_SAMPLE_COUNT_8_BIT = 8;
    public static final int VK_SAMPLE_COUNT_16_BIT = 16;
    public static final int VK_SAMPLE_COUNT_32_BIT = 32;
    public static final int VK_SAMPLE_COUNT_64_BIT = 64;
    public static final int VK_IMAGE_TILING_OPTIMAL = 0;
    public static final int VK_IMAGE_TILING_LINEAR = 1;
    public static final int VK_IMAGE_TYPE_1D = 0;
    public static final int VK_IMAGE_TYPE_2D = 1;
    public static final int VK_IMAGE_TYPE_3D = 2;
    public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 1;
    public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = 2;
    public static final int VK_IMAGE_USAGE_SAMPLED_BIT = 4;
    public static final int VK_IMAGE_USAGE_STORAGE_BIT = 8;
    public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 16;
    public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 32;
    public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 64;
    public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 128;
    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 1;
    public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 1;
    public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 2;
    public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 4;
    public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 8;
    public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 16;
    public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
    public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;
    public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;
    public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;
    public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;
    public static final int VK_QUEUE_GRAPHICS_BIT = 1;
    public static final int VK_QUEUE_COMPUTE_BIT = 2;
    public static final int VK_QUEUE_TRANSFER_BIT = 4;
    public static final int VK_QUEUE_SPARSE_BINDING_BIT = 8;
    public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 1;
    public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 2;
    public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 4;
    public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 8;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 16;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 32;
    public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 64;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 128;
    public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 256;
    public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 512;
    public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 1024;
    public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 2048;
    public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = 4096;
    public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 8192;
    public static final int VK_PIPELINE_STAGE_HOST_BIT = 16384;
    public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 32768;
    public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 65536;
    public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 1;
    public static final int VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 1;
    public static final int VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 2;
    public static final int VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 4;
    public static final int VK_FENCE_CREATE_SIGNALED_BIT = 1;
    public static final int VK_QUERY_TYPE_OCCLUSION = 0;
    public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = 1;
    public static final int VK_QUERY_TYPE_TIMESTAMP = 2;
    public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = 1;
    public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = 2;
    public static final int VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = 4;
    public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = 8;
    public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = 16;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = 32;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = 64;
    public static final int VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = 128;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = 256;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = 512;
    public static final int VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = 1024;
    public static final int VK_QUERY_RESULT_64_BIT = 1;
    public static final int VK_QUERY_RESULT_WAIT_BIT = 2;
    public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 4;
    public static final int VK_QUERY_RESULT_PARTIAL_BIT = 8;
    public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 1;
    public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 2;
    public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 4;
    public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 1;
    public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = 2;
    public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 4;
    public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 8;
    public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 16;
    public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 32;
    public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 64;
    public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 128;
    public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 256;
    public static final int VK_SHARING_MODE_EXCLUSIVE = 0;
    public static final int VK_SHARING_MODE_CONCURRENT = 1;
    public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0;
    public static final int VK_COMPONENT_SWIZZLE_ZERO = 1;
    public static final int VK_COMPONENT_SWIZZLE_ONE = 2;
    public static final int VK_COMPONENT_SWIZZLE_R = 3;
    public static final int VK_COMPONENT_SWIZZLE_G = 4;
    public static final int VK_COMPONENT_SWIZZLE_B = 5;
    public static final int VK_COMPONENT_SWIZZLE_A = 6;
    public static final int VK_IMAGE_VIEW_TYPE_1D = 0;
    public static final int VK_IMAGE_VIEW_TYPE_2D = 1;
    public static final int VK_IMAGE_VIEW_TYPE_3D = 2;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE = 3;
    public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4;
    public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;
    public static final int VK_DEPENDENCY_BY_REGION_BIT = 1;
    public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 1;
    public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 2;
    public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 1;
    public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0;
    public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;
    public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 1;
    public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 2;
    public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 4;
    public static final int VK_QUERY_CONTROL_PRECISE_BIT = 1;
    public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 1;
    public static final int VK_INDEX_TYPE_UINT16 = 0;
    public static final int VK_INDEX_TYPE_UINT32 = 1;
    public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;
    public static final int VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 1;
    public static final int VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 2;
    public static final int VK_PIPELINE_CREATE_DERIVATIVE_BIT = 4;
    public static final int VK_SHADER_STAGE_VERTEX_BIT = 1;
    public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 2;
    public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 4;
    public static final int VK_SHADER_STAGE_GEOMETRY_BIT = 8;
    public static final int VK_SHADER_STAGE_FRAGMENT_BIT = 16;
    public static final int VK_SHADER_STAGE_ALL_GRAPHICS = 31;
    public static final int VK_SHADER_STAGE_COMPUTE_BIT = 32;
    public static final int VK_SHADER_STAGE_ALL = Integer.MAX_VALUE;
    public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0;
    public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 1;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 2;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = 3;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 4;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = 5;
    public static final int VK_FILTER_NEAREST = 0;
    public static final int VK_FILTER_LINEAR = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;
    public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = 0;
    public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = 1;
    public static final int VK_COMPARE_OP_NEVER = 0;
    public static final int VK_COMPARE_OP_LESS = 1;
    public static final int VK_COMPARE_OP_EQUAL = 2;
    public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 3;
    public static final int VK_COMPARE_OP_GREATER = 4;
    public static final int VK_COMPARE_OP_NOT_EQUAL = 5;
    public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 6;
    public static final int VK_COMPARE_OP_ALWAYS = 7;
    public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 1;
    public static final int VK_DESCRIPTOR_TYPE_SAMPLER = 0;
    public static final int VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 1;
    public static final int VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = 2;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = 3;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = 4;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = 5;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = 6;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = 7;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 8;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 9;
    public static final int VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = 10;
    public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = 0;
    public static final int VK_PIPELINE_BIND_POINT_COMPUTE = 1;
    public static final int VK_BLEND_FACTOR_ZERO = 0;
    public static final int VK_BLEND_FACTOR_ONE = 1;
    public static final int VK_BLEND_FACTOR_SRC_COLOR = 2;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 3;
    public static final int VK_BLEND_FACTOR_DST_COLOR = 4;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 5;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA = 6;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 7;
    public static final int VK_BLEND_FACTOR_DST_ALPHA = 8;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 9;
    public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = 10;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11;
    public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = 12;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 14;
    public static final int VK_BLEND_FACTOR_SRC1_COLOR = 15;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 16;
    public static final int VK_BLEND_FACTOR_SRC1_ALPHA = 17;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 18;
    public static final int VK_BLEND_OP_ADD = 0;
    public static final int VK_BLEND_OP_SUBTRACT = 1;
    public static final int VK_BLEND_OP_REVERSE_SUBTRACT = 2;
    public static final int VK_BLEND_OP_MIN = 3;
    public static final int VK_BLEND_OP_MAX = 4;
    public static final int VK_COLOR_COMPONENT_R_BIT = 1;
    public static final int VK_COLOR_COMPONENT_G_BIT = 2;
    public static final int VK_COLOR_COMPONENT_B_BIT = 4;
    public static final int VK_COLOR_COMPONENT_A_BIT = 8;
    public static final int VK_CULL_MODE_NONE = 0;
    public static final int VK_CULL_MODE_FRONT_BIT = 1;
    public static final int VK_CULL_MODE_BACK_BIT = 2;
    public static final int VK_CULL_MODE_FRONT_AND_BACK = 3;
    public static final int VK_DYNAMIC_STATE_VIEWPORT = 0;
    public static final int VK_DYNAMIC_STATE_SCISSOR = 1;
    public static final int VK_DYNAMIC_STATE_LINE_WIDTH = 2;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS = 3;
    public static final int VK_DYNAMIC_STATE_BLEND_CONSTANTS = 4;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS = 5;
    public static final int VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6;
    public static final int VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 7;
    public static final int VK_DYNAMIC_STATE_STENCIL_REFERENCE = 8;
    public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;
    public static final int VK_FRONT_FACE_CLOCKWISE = 1;
    public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;
    public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;
    public static final int VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 1;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 2;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 3;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 4;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 5;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 6;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 7;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 8;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9;
    public static final int VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 10;
    public static final int VK_POLYGON_MODE_FILL = 0;
    public static final int VK_POLYGON_MODE_LINE = 1;
    public static final int VK_POLYGON_MODE_POINT = 2;
    public static final int VK_STENCIL_OP_KEEP = 0;
    public static final int VK_STENCIL_OP_ZERO = 1;
    public static final int VK_STENCIL_OP_REPLACE = 2;
    public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3;
    public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4;
    public static final int VK_STENCIL_OP_INVERT = 5;
    public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = 6;
    public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = 7;
    public static final int VK_LOGIC_OP_CLEAR = 0;
    public static final int VK_LOGIC_OP_AND = 1;
    public static final int VK_LOGIC_OP_AND_REVERSE = 2;
    public static final int VK_LOGIC_OP_COPY = 3;
    public static final int VK_LOGIC_OP_AND_INVERTED = 4;
    public static final int VK_LOGIC_OP_NO_OP = 5;
    public static final int VK_LOGIC_OP_XOR = 6;
    public static final int VK_LOGIC_OP_OR = 7;
    public static final int VK_LOGIC_OP_NOR = 8;
    public static final int VK_LOGIC_OP_EQUIVALENT = 9;
    public static final int VK_LOGIC_OP_INVERT = 10;
    public static final int VK_LOGIC_OP_OR_REVERSE = 11;
    public static final int VK_LOGIC_OP_COPY_INVERTED = 12;
    public static final int VK_LOGIC_OP_OR_INVERTED = 13;
    public static final int VK_LOGIC_OP_NAND = 14;
    public static final int VK_LOGIC_OP_SET = 15;
    public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 1;
    public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;
    public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;
    public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;
    public static final int VK_ATTACHMENT_STORE_OP_STORE = 0;
    public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;
    public static final int VK_STENCIL_FACE_FRONT_BIT = 1;
    public static final int VK_STENCIL_FACE_BACK_BIT = 2;
    public static final int VK_STENCIL_FACE_FRONT_AND_BACK = 3;
    public static final int VK_STENCIL_FRONT_AND_BACK = 3;
    public static final int VK_SUBPASS_CONTENTS_INLINE = 0;
    public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;
    public static final int VK_API_VERSION_1_0 = VK_MAKE_API_VERSION(0, 1, 0, 0);
    public static final int VK_HEADER_VERSION = 342;
    public static final long VK_NULL_HANDLE = 0;
    public static final int VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256;
    public static final int VK_UUID_SIZE = 16;
    public static final int VK_MAX_EXTENSION_NAME_SIZE = 256;
    public static final int VK_MAX_DESCRIPTION_SIZE = 256;
    public static final int VK_MAX_MEMORY_TYPES = 32;
    public static final int VK_MAX_MEMORY_HEAPS = 16;
    public static final int VK_REMAINING_MIP_LEVELS = -1;
    public static final int VK_REMAINING_ARRAY_LAYERS = -1;
    public static final int VK_ATTACHMENT_UNUSED = -1;
    public static final int VK_TRUE = 1;
    public static final int VK_FALSE = 0;
    public static final int VK_QUEUE_FAMILY_IGNORED = -1;
    public static final int VK_SUBPASS_EXTERNAL = -1;
    public static final float VK_LOD_CLAMP_NONE = 1000.0f;
    public static final long VK_WHOLE_SIZE = -1;

    protected VK10() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateInstance(long pCreateInfo, long pAllocator, long pInstance) {
        long __functionAddress = VK.getGlobalCommands().vkCreateInstance;
        if (Checks.CHECKS) {
            VkInstanceCreateInfo.validate(pCreateInfo);
        }
        return JNI.callPPPI(pCreateInfo, pAllocator, pInstance, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateInstance(@NativeType("VkInstanceCreateInfo const *") VkInstanceCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkInstance *") PointerBuffer pInstance) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pInstance, 1);
        }
        return nvkCreateInstance(pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pInstance));
    }

    public static void nvkDestroyInstance(VkInstance instance, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroyInstance;
        JNI.callPPV(instance.address(), pAllocator, __functionAddress);
    }

    public static void vkDestroyInstance(VkInstance instance, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyInstance(instance, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkEnumeratePhysicalDevices(VkInstance instance, long pPhysicalDeviceCount, long pPhysicalDevices) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDevices;
        return JNI.callPPPI(instance.address(), pPhysicalDeviceCount, pPhysicalDevices, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDevices(VkInstance instance, @NativeType("uint32_t *") IntBuffer pPhysicalDeviceCount, @NativeType("VkPhysicalDevice *") PointerBuffer pPhysicalDevices) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPhysicalDeviceCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pPhysicalDevices, pPhysicalDeviceCount.get(pPhysicalDeviceCount.position()));
        }
        return nvkEnumeratePhysicalDevices(instance, MemoryUtil.memAddress(pPhysicalDeviceCount), MemoryUtil.memAddressSafe(pPhysicalDevices));
    }

    public static void nvkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, long pFeatures) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures;
        JNI.callPPV(physicalDevice.address(), pFeatures, __functionAddress);
    }

    public static void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceFeatures *") VkPhysicalDeviceFeatures pFeatures) {
        nvkGetPhysicalDeviceFeatures(physicalDevice, pFeatures.address());
    }

    public static void nvkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties;
        JNI.callPPV(physicalDevice.address(), format, pFormatProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkFormatProperties *") VkFormatProperties pFormatProperties) {
        nvkGetPhysicalDeviceFormatProperties(physicalDevice, format, pFormatProperties.address());
    }

    public static int nvkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties;
        return JNI.callPPI(physicalDevice.address(), format, type, tiling, usage, flags, pImageFormatProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkImageType") int type, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usage, @NativeType("VkImageCreateFlags") int flags, @NativeType("VkImageFormatProperties *") VkImageFormatProperties pImageFormatProperties) {
        return nvkGetPhysicalDeviceImageFormatProperties(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties.address());
    }

    public static void nvkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties;
        JNI.callPPV(physicalDevice.address(), pProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceProperties *") VkPhysicalDeviceProperties pProperties) {
        nvkGetPhysicalDeviceProperties(physicalDevice, pProperties.address());
    }

    public static void nvkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties;
        JNI.callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties *") VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pQueueFamilyPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
        }
        nvkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, MemoryUtil.memAddress(pQueueFamilyPropertyCount), MemoryUtil.memAddressSafe(pQueueFamilyProperties));
    }

    public static void nvkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties;
        JNI.callPPV(physicalDevice.address(), pMemoryProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceMemoryProperties *") VkPhysicalDeviceMemoryProperties pMemoryProperties) {
        nvkGetPhysicalDeviceMemoryProperties(physicalDevice, pMemoryProperties.address());
    }

    public static long nvkGetInstanceProcAddr(long instance, long pName) {
        long __functionAddress = VK.getGlobalCommands().vkGetInstanceProcAddr;
        return JNI.callPPP(instance, pName, __functionAddress);
    }

    @NativeType("PFN_vkVoidFunction")
    public static long vkGetInstanceProcAddr(@NativeType("VkInstance") VkInstance instance, @NativeType("char const *") ByteBuffer pName) {
        if (Checks.CHECKS) {
            Checks.checkNT1(pName);
        }
        return nvkGetInstanceProcAddr(MemoryUtil.memAddressSafe(instance), MemoryUtil.memAddress(pName));
    }

    @NativeType("PFN_vkVoidFunction")
    public static long vkGetInstanceProcAddr(@NativeType("VkInstance") VkInstance instance, @NativeType("char const *") CharSequence pName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pName, true);
            long pNameEncoded = stack.getPointerAddress();
            long jNvkGetInstanceProcAddr = nvkGetInstanceProcAddr(MemoryUtil.memAddressSafe(instance), pNameEncoded);
            stack.setPointer(stackPointer);
            return jNvkGetInstanceProcAddr;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nvkGetDeviceProcAddr(VkDevice device, long pName) {
        long __functionAddress = device.getCapabilities().vkGetDeviceProcAddr;
        return JNI.callPPP(device.address(), pName, __functionAddress);
    }

    @NativeType("PFN_vkVoidFunction")
    public static long vkGetDeviceProcAddr(VkDevice device, @NativeType("char const *") ByteBuffer pName) {
        if (Checks.CHECKS) {
            Checks.checkNT1(pName);
        }
        return nvkGetDeviceProcAddr(device, MemoryUtil.memAddress(pName));
    }

    @NativeType("PFN_vkVoidFunction")
    public static long vkGetDeviceProcAddr(VkDevice device, @NativeType("char const *") CharSequence pName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pName, true);
            long pNameEncoded = stack.getPointerAddress();
            long jNvkGetDeviceProcAddr = nvkGetDeviceProcAddr(device, pNameEncoded);
            stack.setPointer(stackPointer);
            return jNvkGetDeviceProcAddr;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvkCreateDevice(VkPhysicalDevice physicalDevice, long pCreateInfo, long pAllocator, long pDevice) {
        long __functionAddress = physicalDevice.getCapabilities().vkCreateDevice;
        if (Checks.CHECKS) {
            VkDeviceCreateInfo.validate(pCreateInfo);
        }
        return JNI.callPPPPI(physicalDevice.address(), pCreateInfo, pAllocator, pDevice, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDevice(VkPhysicalDevice physicalDevice, @NativeType("VkDeviceCreateInfo const *") VkDeviceCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDevice *") PointerBuffer pDevice) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pDevice, 1);
        }
        return nvkCreateDevice(physicalDevice, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pDevice));
    }

    public static void nvkDestroyDevice(VkDevice device, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDevice;
        JNI.callPPV(device.address(), pAllocator, __functionAddress);
    }

    public static void vkDestroyDevice(VkDevice device, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDevice(device, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkEnumerateInstanceExtensionProperties(long pLayerName, long pPropertyCount, long pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
        return JNI.callPPPI(pLayerName, pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@NativeType("char const *") ByteBuffer pLayerName, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(pLayerName);
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkEnumerateInstanceExtensionProperties(MemoryUtil.memAddressSafe(pLayerName), MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    @NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@NativeType("char const *") CharSequence pLayerName, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pLayerName, true);
            long pLayerNameEncoded = pLayerName == null ? 0L : stack.getPointerAddress();
            int iNvkEnumerateInstanceExtensionProperties = nvkEnumerateInstanceExtensionProperties(pLayerNameEncoded, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
            stack.setPointer(stackPointer);
            return iNvkEnumerateInstanceExtensionProperties;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, long pLayerName, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
        return JNI.callPPPPI(physicalDevice.address(), pLayerName, pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, @NativeType("char const *") ByteBuffer pLayerName, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(pLayerName);
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkEnumerateDeviceExtensionProperties(physicalDevice, MemoryUtil.memAddressSafe(pLayerName), MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    @NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, @NativeType("char const *") CharSequence pLayerName, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pLayerName, true);
            long pLayerNameEncoded = pLayerName == null ? 0L : stack.getPointerAddress();
            int iNvkEnumerateDeviceExtensionProperties = nvkEnumerateDeviceExtensionProperties(physicalDevice, pLayerNameEncoded, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
            stack.setPointer(stackPointer);
            return iNvkEnumerateDeviceExtensionProperties;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvkEnumerateInstanceLayerProperties(long pPropertyCount, long pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceLayerProperties;
        return JNI.callPPI(pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumerateInstanceLayerProperties(@NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkLayerProperties *") VkLayerProperties.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkEnumerateInstanceLayerProperties(MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceLayerProperties;
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkLayerProperties *") VkLayerProperties.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkEnumerateDeviceLayerProperties(physicalDevice, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static void nvkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, long pQueue) {
        long __functionAddress = device.getCapabilities().vkGetDeviceQueue;
        JNI.callPPV(device.address(), queueFamilyIndex, queueIndex, pQueue, __functionAddress);
    }

    public static void vkGetDeviceQueue(VkDevice device, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t") int queueIndex, @NativeType("VkQueue *") PointerBuffer pQueue) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pQueue, 1);
        }
        nvkGetDeviceQueue(device, queueFamilyIndex, queueIndex, MemoryUtil.memAddress(pQueue));
    }

    public static int nvkQueueSubmit(VkQueue queue, int submitCount, long pSubmits, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueSubmit;
        if (Checks.CHECKS && pSubmits != 0) {
            Struct.validate(pSubmits, submitCount, VkSubmitInfo.SIZEOF, VkSubmitInfo::validate);
        }
        return JNI.callPPJI(queue.address(), submitCount, pSubmits, fence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkQueueSubmit(VkQueue queue, @NativeType("VkSubmitInfo const *") VkSubmitInfo.Buffer pSubmits, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit(queue, Checks.remainingSafe(pSubmits), MemoryUtil.memAddressSafe(pSubmits), fence);
    }

    @NativeType("VkResult")
    public static int vkQueueSubmit(VkQueue queue, @NativeType("VkSubmitInfo const *") VkSubmitInfo pSubmit, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit(queue, 1, pSubmit.address(), fence);
    }

    @NativeType("VkResult")
    public static int vkQueueWaitIdle(VkQueue queue) {
        long __functionAddress = queue.getCapabilities().vkQueueWaitIdle;
        return JNI.callPI(queue.address(), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkDeviceWaitIdle(VkDevice device) {
        long __functionAddress = device.getCapabilities().vkDeviceWaitIdle;
        return JNI.callPI(device.address(), __functionAddress);
    }

    public static int nvkAllocateMemory(VkDevice device, long pAllocateInfo, long pAllocator, long pMemory) {
        long __functionAddress = device.getCapabilities().vkAllocateMemory;
        return JNI.callPPPPI(device.address(), pAllocateInfo, pAllocator, pMemory, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAllocateMemory(VkDevice device, @NativeType("VkMemoryAllocateInfo const *") VkMemoryAllocateInfo pAllocateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDeviceMemory *") LongBuffer pMemory) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pMemory, 1);
        }
        return nvkAllocateMemory(device, pAllocateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pMemory));
    }

    public static void nvkFreeMemory(VkDevice device, long memory, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkFreeMemory;
        JNI.callPJPV(device.address(), memory, pAllocator, __functionAddress);
    }

    public static void vkFreeMemory(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkFreeMemory(device, memory, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkMapMemory(VkDevice device, long memory, long offset, long size, int flags, long ppData) {
        long __functionAddress = device.getCapabilities().vkMapMemory;
        return JNI.callPJJJPI(device.address(), memory, offset, size, flags, ppData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkMapMemory(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size, @NativeType("VkMemoryMapFlags") int flags, @NativeType("void **") PointerBuffer ppData) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ppData, 1);
        }
        return nvkMapMemory(device, memory, offset, size, flags, MemoryUtil.memAddress(ppData));
    }

    public static void vkUnmapMemory(VkDevice device, @NativeType("VkDeviceMemory") long memory) {
        long __functionAddress = device.getCapabilities().vkUnmapMemory;
        JNI.callPJV(device.address(), memory, __functionAddress);
    }

    public static int nvkFlushMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
        long __functionAddress = device.getCapabilities().vkFlushMappedMemoryRanges;
        return JNI.callPPI(device.address(), memoryRangeCount, pMemoryRanges, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkFlushMappedMemoryRanges(VkDevice device, @NativeType("VkMappedMemoryRange const *") VkMappedMemoryRange.Buffer pMemoryRanges) {
        return nvkFlushMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
    }

    @NativeType("VkResult")
    public static int vkFlushMappedMemoryRanges(VkDevice device, @NativeType("VkMappedMemoryRange const *") VkMappedMemoryRange pMemoryRange) {
        return nvkFlushMappedMemoryRanges(device, 1, pMemoryRange.address());
    }

    public static int nvkInvalidateMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
        long __functionAddress = device.getCapabilities().vkInvalidateMappedMemoryRanges;
        return JNI.callPPI(device.address(), memoryRangeCount, pMemoryRanges, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkInvalidateMappedMemoryRanges(VkDevice device, @NativeType("VkMappedMemoryRange const *") VkMappedMemoryRange.Buffer pMemoryRanges) {
        return nvkInvalidateMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
    }

    @NativeType("VkResult")
    public static int vkInvalidateMappedMemoryRanges(VkDevice device, @NativeType("VkMappedMemoryRange const *") VkMappedMemoryRange pMemoryRange) {
        return nvkInvalidateMappedMemoryRanges(device, 1, pMemoryRange.address());
    }

    public static void nvkGetDeviceMemoryCommitment(VkDevice device, long memory, long pCommittedMemoryInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMemoryCommitment;
        JNI.callPJPV(device.address(), memory, pCommittedMemoryInBytes, __functionAddress);
    }

    public static void vkGetDeviceMemoryCommitment(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize *") LongBuffer pCommittedMemoryInBytes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCommittedMemoryInBytes, 1);
        }
        nvkGetDeviceMemoryCommitment(device, memory, MemoryUtil.memAddress(pCommittedMemoryInBytes));
    }

    @NativeType("VkResult")
    public static int vkBindBufferMemory(VkDevice device, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize") long memoryOffset) {
        long __functionAddress = device.getCapabilities().vkBindBufferMemory;
        return JNI.callPJJJI(device.address(), buffer, memory, memoryOffset, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBindImageMemory(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize") long memoryOffset) {
        long __functionAddress = device.getCapabilities().vkBindImageMemory;
        return JNI.callPJJJI(device.address(), image, memory, memoryOffset, __functionAddress);
    }

    public static void nvkGetBufferMemoryRequirements(VkDevice device, long buffer, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements;
        JNI.callPJPV(device.address(), buffer, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetBufferMemoryRequirements(VkDevice device, @NativeType("VkBuffer") long buffer, @NativeType("VkMemoryRequirements *") VkMemoryRequirements pMemoryRequirements) {
        nvkGetBufferMemoryRequirements(device, buffer, pMemoryRequirements.address());
    }

    public static void nvkGetImageMemoryRequirements(VkDevice device, long image, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements;
        JNI.callPJPV(device.address(), image, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetImageMemoryRequirements(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkMemoryRequirements *") VkMemoryRequirements pMemoryRequirements) {
        nvkGetImageMemoryRequirements(device, image, pMemoryRequirements.address());
    }

    public static void nvkGetImageSparseMemoryRequirements(VkDevice device, long image, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements;
        JNI.callPJPPV(device.address(), image, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    public static void vkGetImageSparseMemoryRequirements(VkDevice device, @NativeType("VkImage") long image, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements *") VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSparseMemoryRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetImageSparseMemoryRequirements(device, image, MemoryUtil.memAddress(pSparseMemoryRequirementCount), MemoryUtil.memAddressSafe(pSparseMemoryRequirements));
    }

    public static void nvkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties;
        JNI.callPPPV(physicalDevice.address(), format, type, samples, usage, tiling, pPropertyCount, pProperties, __functionAddress);
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkImageType") int type, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkImageUsageFlags") int usage, @NativeType("VkImageTiling") int tiling, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkSparseImageFormatProperties *") VkSparseImageFormatProperties.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        nvkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkQueueBindSparse(VkQueue queue, int bindInfoCount, long pBindInfo, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueBindSparse;
        if (Checks.CHECKS && pBindInfo != 0) {
            Struct.validate(pBindInfo, bindInfoCount, VkBindSparseInfo.SIZEOF, VkBindSparseInfo::validate);
        }
        return JNI.callPPJI(queue.address(), bindInfoCount, pBindInfo, fence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkQueueBindSparse(VkQueue queue, @NativeType("VkBindSparseInfo const *") VkBindSparseInfo.Buffer pBindInfo, @NativeType("VkFence") long fence) {
        return nvkQueueBindSparse(queue, Checks.remainingSafe(pBindInfo), MemoryUtil.memAddressSafe(pBindInfo), fence);
    }

    @NativeType("VkResult")
    public static int vkQueueBindSparse(VkQueue queue, @NativeType("VkBindSparseInfo const *") VkBindSparseInfo pBindInfo, @NativeType("VkFence") long fence) {
        return nvkQueueBindSparse(queue, 1, pBindInfo.address(), fence);
    }

    public static int nvkCreateFence(VkDevice device, long pCreateInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkCreateFence;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pFence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateFence(VkDevice device, @NativeType("VkFenceCreateInfo const *") VkFenceCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFence, 1);
        }
        return nvkCreateFence(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pFence));
    }

    public static void nvkDestroyFence(VkDevice device, long fence, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyFence;
        JNI.callPJPV(device.address(), fence, pAllocator, __functionAddress);
    }

    public static void vkDestroyFence(VkDevice device, @NativeType("VkFence") long fence, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyFence(device, fence, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkResetFences(VkDevice device, int fenceCount, long pFences) {
        long __functionAddress = device.getCapabilities().vkResetFences;
        return JNI.callPPI(device.address(), fenceCount, pFences, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkResetFences(VkDevice device, @NativeType("VkFence const *") LongBuffer pFences) {
        return nvkResetFences(device, pFences.remaining(), MemoryUtil.memAddress(pFences));
    }

    @NativeType("VkResult")
    public static int vkResetFences(VkDevice device, @NativeType("VkFence const *") long pFence) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            LongBuffer pFences = stack.longs(pFence);
            int iNvkResetFences = nvkResetFences(device, 1, MemoryUtil.memAddress(pFences));
            stack.setPointer(stackPointer);
            return iNvkResetFences;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("VkResult")
    public static int vkGetFenceStatus(VkDevice device, @NativeType("VkFence") long fence) {
        long __functionAddress = device.getCapabilities().vkGetFenceStatus;
        return JNI.callPJI(device.address(), fence, __functionAddress);
    }

    public static int nvkWaitForFences(VkDevice device, int fenceCount, long pFences, int waitAll, long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitForFences;
        return JNI.callPPJI(device.address(), fenceCount, pFences, waitAll, timeout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWaitForFences(VkDevice device, @NativeType("VkFence const *") LongBuffer pFences, @NativeType("VkBool32") boolean waitAll, @NativeType("uint64_t") long timeout) {
        return nvkWaitForFences(device, pFences.remaining(), MemoryUtil.memAddress(pFences), waitAll ? 1 : 0, timeout);
    }

    @NativeType("VkResult")
    public static int vkWaitForFences(VkDevice device, @NativeType("VkFence const *") long pFence, @NativeType("VkBool32") boolean waitAll, @NativeType("uint64_t") long timeout) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            LongBuffer pFences = stack.longs(pFence);
            int iNvkWaitForFences = nvkWaitForFences(device, 1, MemoryUtil.memAddress(pFences), waitAll ? 1 : 0, timeout);
            stack.setPointer(stackPointer);
            return iNvkWaitForFences;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvkCreateSemaphore(VkDevice device, long pCreateInfo, long pAllocator, long pSemaphore) {
        long __functionAddress = device.getCapabilities().vkCreateSemaphore;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pSemaphore, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateSemaphore(VkDevice device, @NativeType("VkSemaphoreCreateInfo const *") VkSemaphoreCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSemaphore *") LongBuffer pSemaphore) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSemaphore, 1);
        }
        return nvkCreateSemaphore(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSemaphore));
    }

    public static void nvkDestroySemaphore(VkDevice device, long semaphore, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySemaphore;
        JNI.callPJPV(device.address(), semaphore, pAllocator, __functionAddress);
    }

    public static void vkDestroySemaphore(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroySemaphore(device, semaphore, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateQueryPool(VkDevice device, long pCreateInfo, long pAllocator, long pQueryPool) {
        long __functionAddress = device.getCapabilities().vkCreateQueryPool;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pQueryPool, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateQueryPool(VkDevice device, @NativeType("VkQueryPoolCreateInfo const *") VkQueryPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkQueryPool *") LongBuffer pQueryPool) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pQueryPool, 1);
        }
        return nvkCreateQueryPool(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pQueryPool));
    }

    public static void nvkDestroyQueryPool(VkDevice device, long queryPool, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyQueryPool;
        JNI.callPJPV(device.address(), queryPool, pAllocator, __functionAddress);
    }

    public static void vkDestroyQueryPool(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyQueryPool(device, queryPool, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, long dataSize, long pData, long stride, int flags) {
        long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
        return JNI.callPJPPJI(device.address(), queryPool, firstQuery, queryCount, dataSize, pData, stride, flags, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") ByteBuffer pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, pData.remaining(), MemoryUtil.memAddress(pData), stride, flags);
    }

    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") IntBuffer pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, Integer.toUnsignedLong(pData.remaining()) << 2, MemoryUtil.memAddress(pData), stride, flags);
    }

    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") LongBuffer pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, Integer.toUnsignedLong(pData.remaining()) << 3, MemoryUtil.memAddress(pData), stride, flags);
    }

    public static int nvkCreateBuffer(VkDevice device, long pCreateInfo, long pAllocator, long pBuffer) {
        long __functionAddress = device.getCapabilities().vkCreateBuffer;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pBuffer, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateBuffer(VkDevice device, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkBuffer *") LongBuffer pBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pBuffer, 1);
        }
        return nvkCreateBuffer(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pBuffer));
    }

    public static void nvkDestroyBuffer(VkDevice device, long buffer, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyBuffer;
        JNI.callPJPV(device.address(), buffer, pAllocator, __functionAddress);
    }

    public static void vkDestroyBuffer(VkDevice device, @NativeType("VkBuffer") long buffer, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyBuffer(device, buffer, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateImage(VkDevice device, long pCreateInfo, long pAllocator, long pImage) {
        long __functionAddress = device.getCapabilities().vkCreateImage;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pImage, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateImage(VkDevice device, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkImage *") LongBuffer pImage) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pImage, 1);
        }
        return nvkCreateImage(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pImage));
    }

    public static void nvkDestroyImage(VkDevice device, long image, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyImage;
        JNI.callPJPV(device.address(), image, pAllocator, __functionAddress);
    }

    public static void vkDestroyImage(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyImage(device, image, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkGetImageSubresourceLayout(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout;
        JNI.callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    public static void vkGetImageSubresourceLayout(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource const *") VkImageSubresource pSubresource, @NativeType("VkSubresourceLayout *") VkSubresourceLayout pLayout) {
        nvkGetImageSubresourceLayout(device, image, pSubresource.address(), pLayout.address());
    }

    public static int nvkCreateImageView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
        long __functionAddress = device.getCapabilities().vkCreateImageView;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pView, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateImageView(VkDevice device, @NativeType("VkImageViewCreateInfo const *") VkImageViewCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkImageView *") LongBuffer pView) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pView, 1);
        }
        return nvkCreateImageView(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pView));
    }

    public static void nvkDestroyImageView(VkDevice device, long imageView, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyImageView;
        JNI.callPJPV(device.address(), imageView, pAllocator, __functionAddress);
    }

    public static void vkDestroyImageView(VkDevice device, @NativeType("VkImageView") long imageView, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyImageView(device, imageView, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateCommandPool(VkDevice device, long pCreateInfo, long pAllocator, long pCommandPool) {
        long __functionAddress = device.getCapabilities().vkCreateCommandPool;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pCommandPool, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCommandPool(VkDevice device, @NativeType("VkCommandPoolCreateInfo const *") VkCommandPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCommandPool *") LongBuffer pCommandPool) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCommandPool, 1);
        }
        return nvkCreateCommandPool(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pCommandPool));
    }

    public static void nvkDestroyCommandPool(VkDevice device, long commandPool, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCommandPool;
        JNI.callPJPV(device.address(), commandPool, pAllocator, __functionAddress);
    }

    public static void vkDestroyCommandPool(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyCommandPool(device, commandPool, MemoryUtil.memAddressSafe(pAllocator));
    }

    @NativeType("VkResult")
    public static int vkResetCommandPool(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandPoolResetFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkResetCommandPool;
        return JNI.callPJI(device.address(), commandPool, flags, __functionAddress);
    }

    public static int nvkAllocateCommandBuffers(VkDevice device, long pAllocateInfo, long pCommandBuffers) {
        long __functionAddress = device.getCapabilities().vkAllocateCommandBuffers;
        return JNI.callPPPI(device.address(), pAllocateInfo, pCommandBuffers, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAllocateCommandBuffers(VkDevice device, @NativeType("VkCommandBufferAllocateInfo const *") VkCommandBufferAllocateInfo pAllocateInfo, @NativeType("VkCommandBuffer *") PointerBuffer pCommandBuffers) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pCommandBuffers, pAllocateInfo.commandBufferCount());
        }
        return nvkAllocateCommandBuffers(device, pAllocateInfo.address(), MemoryUtil.memAddress(pCommandBuffers));
    }

    public static void nvkFreeCommandBuffers(VkDevice device, long commandPool, int commandBufferCount, long pCommandBuffers) {
        long __functionAddress = device.getCapabilities().vkFreeCommandBuffers;
        JNI.callPJPV(device.address(), commandPool, commandBufferCount, pCommandBuffers, __functionAddress);
    }

    public static void vkFreeCommandBuffers(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandBuffer const *") PointerBuffer pCommandBuffers) {
        nvkFreeCommandBuffers(device, commandPool, Checks.remainingSafe(pCommandBuffers), MemoryUtil.memAddressSafe(pCommandBuffers));
    }

    public static void vkFreeCommandBuffers(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandBuffer const *") VkCommandBuffer pCommandBuffer) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            PointerBuffer pCommandBuffers = stack.pointers(pCommandBuffer);
            nvkFreeCommandBuffers(device, commandPool, 1, MemoryUtil.memAddress(pCommandBuffers));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvkBeginCommandBuffer(VkCommandBuffer commandBuffer, long pBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkBeginCommandBuffer;
        return JNI.callPPI(commandBuffer.address(), pBeginInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBeginCommandBuffer(VkCommandBuffer commandBuffer, @NativeType("VkCommandBufferBeginInfo const *") VkCommandBufferBeginInfo pBeginInfo) {
        return nvkBeginCommandBuffer(commandBuffer, pBeginInfo.address());
    }

    @NativeType("VkResult")
    public static int vkEndCommandBuffer(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkEndCommandBuffer;
        return JNI.callPI(commandBuffer.address(), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkResetCommandBuffer(VkCommandBuffer commandBuffer, @NativeType("VkCommandBufferResetFlags") int flags) {
        long __functionAddress = commandBuffer.getCapabilities().vkResetCommandBuffer;
        return JNI.callPI(commandBuffer.address(), flags, __functionAddress);
    }

    public static void nvkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer;
        JNI.callPJJPV(commandBuffer.address(), srcBuffer, dstBuffer, regionCount, pRegions, __functionAddress);
    }

    public static void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long srcBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkBufferCopy const *") VkBufferCopy.Buffer pRegions) {
        nvkCmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, pRegions.remaining(), pRegions.address());
    }

    public static void nvkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage;
        JNI.callPJJPV(commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, __functionAddress);
    }

    public static void vkCmdCopyImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageCopy const *") VkImageCopy.Buffer pRegions) {
        nvkCmdCopyImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
    }

    public static void nvkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage;
        JNI.callPJJPV(commandBuffer.address(), srcBuffer, dstImage, dstImageLayout, regionCount, pRegions, __functionAddress);
    }

    public static void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long srcBuffer, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkBufferImageCopy const *") VkBufferImageCopy.Buffer pRegions) {
        nvkCmdCopyBufferToImage(commandBuffer, srcBuffer, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
    }

    public static void nvkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer;
        JNI.callPJJPV(commandBuffer.address(), srcImage, srcImageLayout, dstBuffer, regionCount, pRegions, __functionAddress);
    }

    public static void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkBufferImageCopy const *") VkBufferImageCopy.Buffer pRegions) {
        nvkCmdCopyImageToBuffer(commandBuffer, srcImage, srcImageLayout, dstBuffer, pRegions.remaining(), pRegions.address());
    }

    public static void nvkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        JNI.callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, dataSize, pData, __functionAddress);
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") ByteBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, pData.remaining(), MemoryUtil.memAddress(pData));
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") ShortBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 1, MemoryUtil.memAddress(pData));
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") IntBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 2, MemoryUtil.memAddress(pData));
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") LongBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 3, MemoryUtil.memAddress(pData));
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") FloatBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 2, MemoryUtil.memAddress(pData));
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") DoubleBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 3, MemoryUtil.memAddress(pData));
    }

    public static void vkCmdFillBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("VkDeviceSize") long size, @NativeType("uint32_t") int data) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdFillBuffer;
        JNI.callPJJJV(commandBuffer.address(), dstBuffer, dstOffset, size, data, __functionAddress);
    }

    public static void nvkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier;
        JNI.callPPPPV(commandBuffer.address(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers, __functionAddress);
    }

    public static void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags") int srcStageMask, @NativeType("VkPipelineStageFlags") int dstStageMask, @NativeType("VkDependencyFlags") int dependencyFlags, @NativeType("VkMemoryBarrier const *") VkMemoryBarrier.Buffer pMemoryBarriers, @NativeType("VkBufferMemoryBarrier const *") VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, @NativeType("VkImageMemoryBarrier const *") VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
        nvkCmdPipelineBarrier(commandBuffer, srcStageMask, dstStageMask, dependencyFlags, Checks.remainingSafe(pMemoryBarriers), MemoryUtil.memAddressSafe(pMemoryBarriers), Checks.remainingSafe(pBufferMemoryBarriers), MemoryUtil.memAddressSafe(pBufferMemoryBarriers), Checks.remainingSafe(pImageMemoryBarriers), MemoryUtil.memAddressSafe(pImageMemoryBarriers));
    }

    public static void vkCmdBeginQuery(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("VkQueryControlFlags") int flags) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginQuery;
        JNI.callPJV(commandBuffer.address(), queryPool, query, flags, __functionAddress);
    }

    public static void vkCmdEndQuery(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndQuery;
        JNI.callPJV(commandBuffer.address(), queryPool, query, __functionAddress);
    }

    public static void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetQueryPool;
        JNI.callPJV(commandBuffer.address(), queryPool, firstQuery, queryCount, __functionAddress);
    }

    public static void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlagBits") int pipelineStage, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp;
        JNI.callPJV(commandBuffer.address(), pipelineStage, queryPool, query, __functionAddress);
    }

    public static void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyQueryPoolResults;
        JNI.callPJJJJV(commandBuffer.address(), queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags, __functionAddress);
    }

    public static void nvkCmdExecuteCommands(VkCommandBuffer commandBuffer, int commandBufferCount, long pCommandBuffers) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteCommands;
        JNI.callPPV(commandBuffer.address(), commandBufferCount, pCommandBuffers, __functionAddress);
    }

    public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, @NativeType("VkCommandBuffer const *") PointerBuffer pCommandBuffers) {
        nvkCmdExecuteCommands(commandBuffer, pCommandBuffers.remaining(), MemoryUtil.memAddress(pCommandBuffers));
    }

    public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, @NativeType("VkCommandBuffer const *") VkCommandBuffer pCommandBuffer) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            PointerBuffer pCommandBuffers = stack.pointers(pCommandBuffer);
            nvkCmdExecuteCommands(commandBuffer, 1, MemoryUtil.memAddress(pCommandBuffers));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvkCreateEvent(VkDevice device, long pCreateInfo, long pAllocator, long pEvent) {
        long __functionAddress = device.getCapabilities().vkCreateEvent;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pEvent, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateEvent(VkDevice device, @NativeType("VkEventCreateInfo const *") VkEventCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkEvent *") LongBuffer pEvent) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pEvent, 1);
        }
        return nvkCreateEvent(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pEvent));
    }

    public static void nvkDestroyEvent(VkDevice device, long event, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyEvent;
        JNI.callPJPV(device.address(), event, pAllocator, __functionAddress);
    }

    public static void vkDestroyEvent(VkDevice device, @NativeType("VkEvent") long event, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyEvent(device, event, MemoryUtil.memAddressSafe(pAllocator));
    }

    @NativeType("VkResult")
    public static int vkGetEventStatus(VkDevice device, @NativeType("VkEvent") long event) {
        long __functionAddress = device.getCapabilities().vkGetEventStatus;
        return JNI.callPJI(device.address(), event, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkSetEvent(VkDevice device, @NativeType("VkEvent") long event) {
        long __functionAddress = device.getCapabilities().vkSetEvent;
        return JNI.callPJI(device.address(), event, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkResetEvent(VkDevice device, @NativeType("VkEvent") long event) {
        long __functionAddress = device.getCapabilities().vkResetEvent;
        return JNI.callPJI(device.address(), event, __functionAddress);
    }

    public static int nvkCreateBufferView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
        long __functionAddress = device.getCapabilities().vkCreateBufferView;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pView, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateBufferView(VkDevice device, @NativeType("VkBufferViewCreateInfo const *") VkBufferViewCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkBufferView *") LongBuffer pView) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pView, 1);
        }
        return nvkCreateBufferView(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pView));
    }

    public static void nvkDestroyBufferView(VkDevice device, long bufferView, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyBufferView;
        JNI.callPJPV(device.address(), bufferView, pAllocator, __functionAddress);
    }

    public static void vkDestroyBufferView(VkDevice device, @NativeType("VkBufferView") long bufferView, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyBufferView(device, bufferView, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateShaderModule(VkDevice device, long pCreateInfo, long pAllocator, long pShaderModule) {
        long __functionAddress = device.getCapabilities().vkCreateShaderModule;
        if (Checks.CHECKS) {
            VkShaderModuleCreateInfo.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pShaderModule, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateShaderModule(VkDevice device, @NativeType("VkShaderModuleCreateInfo const *") VkShaderModuleCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkShaderModule *") LongBuffer pShaderModule) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pShaderModule, 1);
        }
        return nvkCreateShaderModule(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pShaderModule));
    }

    public static void nvkDestroyShaderModule(VkDevice device, long shaderModule, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyShaderModule;
        JNI.callPJPV(device.address(), shaderModule, pAllocator, __functionAddress);
    }

    public static void vkDestroyShaderModule(VkDevice device, @NativeType("VkShaderModule") long shaderModule, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyShaderModule(device, shaderModule, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreatePipelineCache(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineCache) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineCache;
        if (Checks.CHECKS) {
            VkPipelineCacheCreateInfo.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pPipelineCache, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreatePipelineCache(VkDevice device, @NativeType("VkPipelineCacheCreateInfo const *") VkPipelineCacheCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipelineCache *") LongBuffer pPipelineCache) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPipelineCache, 1);
        }
        return nvkCreatePipelineCache(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pPipelineCache));
    }

    public static void nvkDestroyPipelineCache(VkDevice device, long pipelineCache, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPipelineCache;
        JNI.callPJPV(device.address(), pipelineCache, pAllocator, __functionAddress);
    }

    public static void vkDestroyPipelineCache(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyPipelineCache(device, pipelineCache, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkGetPipelineCacheData(VkDevice device, long pipelineCache, long pDataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetPipelineCacheData;
        return JNI.callPJPPI(device.address(), pipelineCache, pDataSize, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPipelineCacheData(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("size_t *") PointerBuffer pDataSize, @NativeType("void *") ByteBuffer pData) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pDataSize, 1);
            Checks.checkSafe(pData, pDataSize.get(pDataSize.position()));
        }
        return nvkGetPipelineCacheData(device, pipelineCache, MemoryUtil.memAddress(pDataSize), MemoryUtil.memAddressSafe(pData));
    }

    public static int nvkMergePipelineCaches(VkDevice device, long dstCache, int srcCacheCount, long pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergePipelineCaches;
        return JNI.callPJPI(device.address(), dstCache, srcCacheCount, pSrcCaches, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkMergePipelineCaches(VkDevice device, @NativeType("VkPipelineCache") long dstCache, @NativeType("VkPipelineCache const *") LongBuffer pSrcCaches) {
        return nvkMergePipelineCaches(device, dstCache, pSrcCaches.remaining(), MemoryUtil.memAddress(pSrcCaches));
    }

    public static int nvkCreateComputePipelines(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateComputePipelines;
        if (Checks.CHECKS) {
            Struct.validate(pCreateInfos, createInfoCount, VkComputePipelineCreateInfo.SIZEOF, VkComputePipelineCreateInfo::validate);
        }
        return JNI.callPJPPPI(device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateComputePipelines(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkComputePipelineCreateInfo const *") VkComputePipelineCreateInfo.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateComputePipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pPipelines));
    }

    public static void nvkDestroyPipeline(VkDevice device, long pipeline, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPipeline;
        JNI.callPJPV(device.address(), pipeline, pAllocator, __functionAddress);
    }

    public static void vkDestroyPipeline(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyPipeline(device, pipeline, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreatePipelineLayout(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineLayout) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineLayout;
        if (Checks.CHECKS) {
            VkPipelineLayoutCreateInfo.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pPipelineLayout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreatePipelineLayout(VkDevice device, @NativeType("VkPipelineLayoutCreateInfo const *") VkPipelineLayoutCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipelineLayout *") LongBuffer pPipelineLayout) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPipelineLayout, 1);
        }
        return nvkCreatePipelineLayout(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pPipelineLayout));
    }

    public static void nvkDestroyPipelineLayout(VkDevice device, long pipelineLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPipelineLayout;
        JNI.callPJPV(device.address(), pipelineLayout, pAllocator, __functionAddress);
    }

    public static void vkDestroyPipelineLayout(VkDevice device, @NativeType("VkPipelineLayout") long pipelineLayout, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyPipelineLayout(device, pipelineLayout, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateSampler(VkDevice device, long pCreateInfo, long pAllocator, long pSampler) {
        long __functionAddress = device.getCapabilities().vkCreateSampler;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pSampler, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateSampler(VkDevice device, @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSampler *") LongBuffer pSampler) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSampler, 1);
        }
        return nvkCreateSampler(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSampler));
    }

    public static void nvkDestroySampler(VkDevice device, long sampler, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySampler;
        JNI.callPJPV(device.address(), sampler, pAllocator, __functionAddress);
    }

    public static void vkDestroySampler(VkDevice device, @NativeType("VkSampler") long sampler, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroySampler(device, sampler, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateDescriptorSetLayout(VkDevice device, long pCreateInfo, long pAllocator, long pSetLayout) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorSetLayout;
        if (Checks.CHECKS) {
            VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pSetLayout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDescriptorSetLayout(VkDevice device, @NativeType("VkDescriptorSetLayoutCreateInfo const *") VkDescriptorSetLayoutCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorSetLayout *") LongBuffer pSetLayout) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSetLayout, 1);
        }
        return nvkCreateDescriptorSetLayout(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pSetLayout));
    }

    public static void nvkDestroyDescriptorSetLayout(VkDevice device, long descriptorSetLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDescriptorSetLayout;
        JNI.callPJPV(device.address(), descriptorSetLayout, pAllocator, __functionAddress);
    }

    public static void vkDestroyDescriptorSetLayout(VkDevice device, @NativeType("VkDescriptorSetLayout") long descriptorSetLayout, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDescriptorSetLayout(device, descriptorSetLayout, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateDescriptorPool(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorPool) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorPool;
        if (Checks.CHECKS) {
            VkDescriptorPoolCreateInfo.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pDescriptorPool, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDescriptorPool(VkDevice device, @NativeType("VkDescriptorPoolCreateInfo const *") VkDescriptorPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorPool *") LongBuffer pDescriptorPool) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pDescriptorPool, 1);
        }
        return nvkCreateDescriptorPool(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pDescriptorPool));
    }

    public static void nvkDestroyDescriptorPool(VkDevice device, long descriptorPool, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDescriptorPool;
        JNI.callPJPV(device.address(), descriptorPool, pAllocator, __functionAddress);
    }

    public static void vkDestroyDescriptorPool(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDescriptorPool(device, descriptorPool, MemoryUtil.memAddressSafe(pAllocator));
    }

    @NativeType("VkResult")
    public static int vkResetDescriptorPool(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkDescriptorPoolResetFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkResetDescriptorPool;
        return JNI.callPJI(device.address(), descriptorPool, flags, __functionAddress);
    }

    public static int nvkAllocateDescriptorSets(VkDevice device, long pAllocateInfo, long pDescriptorSets) {
        long __functionAddress = device.getCapabilities().vkAllocateDescriptorSets;
        if (Checks.CHECKS) {
            VkDescriptorSetAllocateInfo.validate(pAllocateInfo);
        }
        return JNI.callPPPI(device.address(), pAllocateInfo, pDescriptorSets, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAllocateDescriptorSets(VkDevice device, @NativeType("VkDescriptorSetAllocateInfo const *") VkDescriptorSetAllocateInfo pAllocateInfo, @NativeType("VkDescriptorSet *") LongBuffer pDescriptorSets) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pDescriptorSets, pAllocateInfo.descriptorSetCount());
        }
        return nvkAllocateDescriptorSets(device, pAllocateInfo.address(), MemoryUtil.memAddress(pDescriptorSets));
    }

    public static int nvkFreeDescriptorSets(VkDevice device, long descriptorPool, int descriptorSetCount, long pDescriptorSets) {
        long __functionAddress = device.getCapabilities().vkFreeDescriptorSets;
        return JNI.callPJPI(device.address(), descriptorPool, descriptorSetCount, pDescriptorSets, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkFreeDescriptorSets(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkDescriptorSet const *") LongBuffer pDescriptorSets) {
        return nvkFreeDescriptorSets(device, descriptorPool, Checks.remainingSafe(pDescriptorSets), MemoryUtil.memAddressSafe(pDescriptorSets));
    }

    @NativeType("VkResult")
    public static int vkFreeDescriptorSets(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkDescriptorSet const *") long pDescriptorSet) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            LongBuffer pDescriptorSets = stack.longs(pDescriptorSet);
            int iNvkFreeDescriptorSets = nvkFreeDescriptorSets(device, descriptorPool, 1, MemoryUtil.memAddress(pDescriptorSets));
            stack.setPointer(stackPointer);
            return iNvkFreeDescriptorSets;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nvkUpdateDescriptorSets(VkDevice device, int descriptorWriteCount, long pDescriptorWrites, int descriptorCopyCount, long pDescriptorCopies) {
        long __functionAddress = device.getCapabilities().vkUpdateDescriptorSets;
        JNI.callPPPV(device.address(), descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies, __functionAddress);
    }

    public static void vkUpdateDescriptorSets(VkDevice device, @NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer pDescriptorWrites, @NativeType("VkCopyDescriptorSet const *") VkCopyDescriptorSet.Buffer pDescriptorCopies) {
        nvkUpdateDescriptorSets(device, Checks.remainingSafe(pDescriptorWrites), MemoryUtil.memAddressSafe(pDescriptorWrites), Checks.remainingSafe(pDescriptorCopies), MemoryUtil.memAddressSafe(pDescriptorCopies));
    }

    public static void vkCmdBindPipeline(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipeline") long pipeline) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindPipeline;
        JNI.callPJV(commandBuffer.address(), pipelineBindPoint, pipeline, __functionAddress);
    }

    public static void nvkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, long pDescriptorSets, int dynamicOffsetCount, long pDynamicOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets;
        JNI.callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets, __functionAddress);
    }

    public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("VkDescriptorSet const *") LongBuffer pDescriptorSets, @NativeType("uint32_t const *") IntBuffer pDynamicOffsets) {
        nvkCmdBindDescriptorSets(commandBuffer, pipelineBindPoint, layout, firstSet, pDescriptorSets.remaining(), MemoryUtil.memAddress(pDescriptorSets), Checks.remainingSafe(pDynamicOffsets), MemoryUtil.memAddressSafe(pDynamicOffsets));
    }

    public static void nvkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pColor, int rangeCount, long pRanges) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdClearColorImage;
        JNI.callPJPPV(commandBuffer.address(), image, imageLayout, pColor, rangeCount, pRanges, __functionAddress);
    }

    public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long image, @NativeType("VkImageLayout") int imageLayout, @NativeType("VkClearColorValue const *") VkClearColorValue pColor, @NativeType("VkImageSubresourceRange const *") VkImageSubresourceRange.Buffer pRanges) {
        nvkCmdClearColorImage(commandBuffer, image, imageLayout, MemoryUtil.memAddressSafe(pColor), pRanges.remaining(), pRanges.address());
    }

    public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long image, @NativeType("VkImageLayout") int imageLayout, @NativeType("VkClearColorValue const *") VkClearColorValue pColor, @NativeType("VkImageSubresourceRange const *") VkImageSubresourceRange pRange) {
        nvkCmdClearColorImage(commandBuffer, image, imageLayout, MemoryUtil.memAddressSafe(pColor), 1, pRange.address());
    }

    public static void vkCmdDispatch(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatch;
        JNI.callPV(commandBuffer.address(), groupCountX, groupCountY, groupCountZ, __functionAddress);
    }

    public static void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchIndirect;
        JNI.callPJJV(commandBuffer.address(), buffer, offset, __functionAddress);
    }

    public static void vkCmdSetEvent(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags") int stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent;
        JNI.callPJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    public static void vkCmdResetEvent(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags") int stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent;
        JNI.callPJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    public static void nvkCmdWaitEvents(VkCommandBuffer commandBuffer, int eventCount, long pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents;
        JNI.callPPPPPV(commandBuffer.address(), eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers, __functionAddress);
    }

    public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") LongBuffer pEvents, @NativeType("VkPipelineStageFlags") int srcStageMask, @NativeType("VkPipelineStageFlags") int dstStageMask, @NativeType("VkMemoryBarrier const *") VkMemoryBarrier.Buffer pMemoryBarriers, @NativeType("VkBufferMemoryBarrier const *") VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, @NativeType("VkImageMemoryBarrier const *") VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
        nvkCmdWaitEvents(commandBuffer, pEvents.remaining(), MemoryUtil.memAddress(pEvents), srcStageMask, dstStageMask, Checks.remainingSafe(pMemoryBarriers), MemoryUtil.memAddressSafe(pMemoryBarriers), Checks.remainingSafe(pBufferMemoryBarriers), MemoryUtil.memAddressSafe(pBufferMemoryBarriers), Checks.remainingSafe(pImageMemoryBarriers), MemoryUtil.memAddressSafe(pImageMemoryBarriers));
    }

    public static void nvkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int size, long pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        JNI.callPJPV(commandBuffer.address(), layout, stageFlags, offset, size, pValues, __functionAddress);
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") ByteBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining(), MemoryUtil.memAddress(pValues));
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") ShortBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 1, MemoryUtil.memAddress(pValues));
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") IntBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 2, MemoryUtil.memAddress(pValues));
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") LongBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 3, MemoryUtil.memAddress(pValues));
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") FloatBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 2, MemoryUtil.memAddress(pValues));
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") DoubleBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 3, MemoryUtil.memAddress(pValues));
    }

    public static int nvkCreateGraphicsPipelines(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateGraphicsPipelines;
        if (Checks.CHECKS) {
            Struct.validate(pCreateInfos, createInfoCount, VkGraphicsPipelineCreateInfo.SIZEOF, VkGraphicsPipelineCreateInfo::validate);
        }
        return JNI.callPJPPPI(device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateGraphicsPipelines(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkGraphicsPipelineCreateInfo const *") VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateGraphicsPipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pPipelines));
    }

    public static int nvkCreateFramebuffer(VkDevice device, long pCreateInfo, long pAllocator, long pFramebuffer) {
        long __functionAddress = device.getCapabilities().vkCreateFramebuffer;
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pFramebuffer, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateFramebuffer(VkDevice device, @NativeType("VkFramebufferCreateInfo const *") VkFramebufferCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFramebuffer *") LongBuffer pFramebuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFramebuffer, 1);
        }
        return nvkCreateFramebuffer(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pFramebuffer));
    }

    public static void nvkDestroyFramebuffer(VkDevice device, long framebuffer, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyFramebuffer;
        JNI.callPJPV(device.address(), framebuffer, pAllocator, __functionAddress);
    }

    public static void vkDestroyFramebuffer(VkDevice device, @NativeType("VkFramebuffer") long framebuffer, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyFramebuffer(device, framebuffer, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkCreateRenderPass(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass;
        if (Checks.CHECKS) {
            VkRenderPassCreateInfo.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pRenderPass, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateRenderPass(VkDevice device, @NativeType("VkRenderPassCreateInfo const *") VkRenderPassCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") LongBuffer pRenderPass) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pRenderPass, 1);
        }
        return nvkCreateRenderPass(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pRenderPass));
    }

    public static void nvkDestroyRenderPass(VkDevice device, long renderPass, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyRenderPass;
        JNI.callPJPV(device.address(), renderPass, pAllocator, __functionAddress);
    }

    public static void vkDestroyRenderPass(VkDevice device, @NativeType("VkRenderPass") long renderPass, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyRenderPass(device, renderPass, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkGetRenderAreaGranularity(VkDevice device, long renderPass, long pGranularity) {
        long __functionAddress = device.getCapabilities().vkGetRenderAreaGranularity;
        JNI.callPJPV(device.address(), renderPass, pGranularity, __functionAddress);
    }

    public static void vkGetRenderAreaGranularity(VkDevice device, @NativeType("VkRenderPass") long renderPass, @NativeType("VkExtent2D *") VkExtent2D pGranularity) {
        nvkGetRenderAreaGranularity(device, renderPass, pGranularity.address());
    }

    public static void nvkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewports) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewport;
        JNI.callPPV(commandBuffer.address(), firstViewport, viewportCount, pViewports, __functionAddress);
    }

    public static void vkCmdSetViewport(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkViewport const *") VkViewport.Buffer pViewports) {
        nvkCmdSetViewport(commandBuffer, firstViewport, pViewports.remaining(), pViewports.address());
    }

    public static void nvkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, long pScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissor;
        JNI.callPPV(commandBuffer.address(), firstScissor, scissorCount, pScissors, __functionAddress);
    }

    public static void vkCmdSetScissor(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstScissor, @NativeType("VkRect2D const *") VkRect2D.Buffer pScissors) {
        nvkCmdSetScissor(commandBuffer, firstScissor, pScissors.remaining(), pScissors.address());
    }

    public static void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, float lineWidth) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineWidth;
        JNI.callPV(commandBuffer.address(), lineWidth, __functionAddress);
    }

    public static void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBias;
        JNI.callPV(commandBuffer.address(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor, __functionAddress);
    }

    public static void nvkCmdSetBlendConstants(VkCommandBuffer commandBuffer, long blendConstants) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetBlendConstants;
        JNI.callPPV(commandBuffer.address(), blendConstants, __functionAddress);
    }

    public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, @NativeType("float const *") FloatBuffer blendConstants) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) blendConstants, 4);
        }
        nvkCmdSetBlendConstants(commandBuffer, MemoryUtil.memAddress(blendConstants));
    }

    public static void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBounds;
        JNI.callPV(commandBuffer.address(), minDepthBounds, maxDepthBounds, __functionAddress);
    }

    public static void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("uint32_t") int compareMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilCompareMask;
        JNI.callPV(commandBuffer.address(), faceMask, compareMask, __functionAddress);
    }

    public static void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("uint32_t") int writeMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilWriteMask;
        JNI.callPV(commandBuffer.address(), faceMask, writeMask, __functionAddress);
    }

    public static void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("uint32_t") int reference) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilReference;
        JNI.callPV(commandBuffer.address(), faceMask, reference, __functionAddress);
    }

    public static void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkIndexType") int indexType) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer;
        JNI.callPJJV(commandBuffer.address(), buffer, offset, indexType, __functionAddress);
    }

    public static void nvkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers;
        JNI.callPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, __functionAddress);
    }

    public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pOffsets, pBuffers.remaining());
        }
        nvkCmdBindVertexBuffers(commandBuffer, firstBinding, pBuffers.remaining(), MemoryUtil.memAddress(pBuffers), MemoryUtil.memAddress(pOffsets));
    }

    public static void vkCmdDraw(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int vertexCount, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstVertex, @NativeType("uint32_t") int firstInstance) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDraw;
        JNI.callPV(commandBuffer.address(), vertexCount, instanceCount, firstVertex, firstInstance, __functionAddress);
    }

    public static void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int indexCount, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstIndex, @NativeType("int32_t") int vertexOffset, @NativeType("uint32_t") int firstInstance) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexed;
        JNI.callPV(commandBuffer.address(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance, __functionAddress);
    }

    public static void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("uint32_t") int drawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirect;
        JNI.callPJJV(commandBuffer.address(), buffer, offset, drawCount, stride, __functionAddress);
    }

    public static void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("uint32_t") int drawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexedIndirect;
        JNI.callPJJV(commandBuffer.address(), buffer, offset, drawCount, stride, __functionAddress);
    }

    public static void nvkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions, int filter) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage;
        JNI.callPJJPV(commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter, __functionAddress);
    }

    public static void vkCmdBlitImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageBlit const *") VkImageBlit.Buffer pRegions, @NativeType("VkFilter") int filter) {
        nvkCmdBlitImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address(), filter);
    }

    public static void nvkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pDepthStencil, int rangeCount, long pRanges) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdClearDepthStencilImage;
        JNI.callPJPPV(commandBuffer.address(), image, imageLayout, pDepthStencil, rangeCount, pRanges, __functionAddress);
    }

    public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long image, @NativeType("VkImageLayout") int imageLayout, @NativeType("VkClearDepthStencilValue const *") VkClearDepthStencilValue pDepthStencil, @NativeType("VkImageSubresourceRange const *") VkImageSubresourceRange.Buffer pRanges) {
        nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), pRanges.remaining(), pRanges.address());
    }

    public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long image, @NativeType("VkImageLayout") int imageLayout, @NativeType("VkClearDepthStencilValue const *") VkClearDepthStencilValue pDepthStencil, @NativeType("VkImageSubresourceRange const *") VkImageSubresourceRange pRange) {
        nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), 1, pRange.address());
    }

    public static void nvkCmdClearAttachments(VkCommandBuffer commandBuffer, int attachmentCount, long pAttachments, int rectCount, long pRects) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdClearAttachments;
        JNI.callPPPV(commandBuffer.address(), attachmentCount, pAttachments, rectCount, pRects, __functionAddress);
    }

    public static void vkCmdClearAttachments(VkCommandBuffer commandBuffer, @NativeType("VkClearAttachment const *") VkClearAttachment.Buffer pAttachments, @NativeType("VkClearRect const *") VkClearRect.Buffer pRects) {
        nvkCmdClearAttachments(commandBuffer, pAttachments.remaining(), pAttachments.address(), pRects.remaining(), pRects.address());
    }

    public static void nvkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage;
        JNI.callPJJPV(commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, __functionAddress);
    }

    public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageResolve const *") VkImageResolve.Buffer pRegions) {
        nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
    }

    public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageResolve const *") VkImageResolve pRegion) {
        nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, 1, pRegion.address());
    }

    public static void nvkCmdBeginRenderPass(VkCommandBuffer commandBuffer, long pRenderPassBegin, int contents) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderPass;
        JNI.callPPV(commandBuffer.address(), pRenderPassBegin, contents, __functionAddress);
    }

    public static void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, @NativeType("VkRenderPassBeginInfo const *") VkRenderPassBeginInfo pRenderPassBegin, @NativeType("VkSubpassContents") int contents) {
        nvkCmdBeginRenderPass(commandBuffer, pRenderPassBegin.address(), contents);
    }

    public static void vkCmdNextSubpass(VkCommandBuffer commandBuffer, @NativeType("VkSubpassContents") int contents) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdNextSubpass;
        JNI.callPV(commandBuffer.address(), contents, __functionAddress);
    }

    public static void vkCmdEndRenderPass(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderPass;
        JNI.callPV(commandBuffer.address(), __functionAddress);
    }

    @NativeType("uint32_t")
    public static int VK_MAKE_API_VERSION(@NativeType("uint32_t") int variant, @NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return (variant << 29) | (major << 22) | (minor << 12) | patch;
    }

    @NativeType("uint32_t")
    public static int VK_API_VERSION_VARIANT(@NativeType("uint32_t") int version) {
        return version >>> 29;
    }

    @NativeType("uint32_t")
    public static int VK_API_VERSION_MAJOR(@NativeType("uint32_t") int version) {
        return (version >>> 22) & 127;
    }

    @NativeType("uint32_t")
    public static int VK_API_VERSION_MINOR(@NativeType("uint32_t") int version) {
        return (version >>> 12) & 1023;
    }

    @NativeType("uint32_t")
    public static int VK_API_VERSION_PATCH(@NativeType("uint32_t") int version) {
        return version & UnixStat.PERM_MASK;
    }

    @NativeType("uint32_t")
    public static int VK_MAKE_VERSION(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return (major << 22) | (minor << 12) | patch;
    }

    @NativeType("uint32_t")
    public static int VK_VERSION_MAJOR(@NativeType("uint32_t") int version) {
        return version >>> 22;
    }

    @NativeType("uint32_t")
    public static int VK_VERSION_MINOR(@NativeType("uint32_t") int version) {
        return (version >>> 12) & 1023;
    }

    @NativeType("uint32_t")
    public static int VK_VERSION_PATCH(@NativeType("uint32_t") int version) {
        return version & UnixStat.PERM_MASK;
    }

    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDevices(VkInstance instance, @NativeType("uint32_t *") int[] pPhysicalDeviceCount, @NativeType("VkPhysicalDevice *") PointerBuffer pPhysicalDevices) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDevices;
        if (Checks.CHECKS) {
            Checks.check(pPhysicalDeviceCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pPhysicalDevices, pPhysicalDeviceCount[0]);
        }
        return JNI.callPPPI(instance.address(), pPhysicalDeviceCount, MemoryUtil.memAddressSafe(pPhysicalDevices), __functionAddress);
    }

    public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties *") VkQueueFamilyProperties.Buffer pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties;
        if (Checks.CHECKS) {
            Checks.check(pQueueFamilyPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
        }
        JNI.callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, MemoryUtil.memAddressSafe(pQueueFamilyProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@NativeType("char const *") ByteBuffer pLayerName, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.Buffer pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(pLayerName);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(MemoryUtil.memAddressSafe(pLayerName), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@NativeType("char const *") CharSequence pLayerName, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.Buffer pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
        if (Checks.CHECKS) {
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pLayerName, true);
            long pLayerNameEncoded = pLayerName == null ? 0L : stack.getPointerAddress();
            int iCallPPPI = JNI.callPPPI(pLayerNameEncoded, pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
            stack.setPointer(stackPointer);
            return iCallPPPI;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, @NativeType("char const *") ByteBuffer pLayerName, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(pLayerName);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPPI(physicalDevice.address(), MemoryUtil.memAddressSafe(pLayerName), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, @NativeType("char const *") CharSequence pLayerName, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
        if (Checks.CHECKS) {
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pLayerName, true);
            long pLayerNameEncoded = pLayerName == null ? 0L : stack.getPointerAddress();
            int iCallPPPPI = JNI.callPPPPI(physicalDevice.address(), pLayerNameEncoded, pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
            stack.setPointer(stackPointer);
            return iCallPPPPI;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("VkResult")
    public static int vkEnumerateInstanceLayerProperties(@NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkLayerProperties *") VkLayerProperties.Buffer pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceLayerProperties;
        if (Checks.CHECKS) {
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPI(pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkLayerProperties *") VkLayerProperties.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceLayerProperties;
        if (Checks.CHECKS) {
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAllocateMemory(VkDevice device, @NativeType("VkMemoryAllocateInfo const *") VkMemoryAllocateInfo pAllocateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDeviceMemory *") long[] pMemory) {
        long __functionAddress = device.getCapabilities().vkAllocateMemory;
        if (Checks.CHECKS) {
            Checks.check(pMemory, 1);
        }
        return JNI.callPPPPI(device.address(), pAllocateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pMemory, __functionAddress);
    }

    public static void vkGetDeviceMemoryCommitment(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize *") long[] pCommittedMemoryInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMemoryCommitment;
        if (Checks.CHECKS) {
            Checks.check(pCommittedMemoryInBytes, 1);
        }
        JNI.callPJPV(device.address(), memory, pCommittedMemoryInBytes, __functionAddress);
    }

    public static void vkGetImageSparseMemoryRequirements(VkDevice device, @NativeType("VkImage") long image, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements *") VkSparseImageMemoryRequirements.Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements;
        if (Checks.CHECKS) {
            Checks.check(pSparseMemoryRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
        }
        JNI.callPJPPV(device.address(), image, pSparseMemoryRequirementCount, MemoryUtil.memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkImageType") int type, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkImageUsageFlags") int usage, @NativeType("VkImageTiling") int tiling, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkSparseImageFormatProperties *") VkSparseImageFormatProperties.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties;
        if (Checks.CHECKS) {
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        JNI.callPPPV(physicalDevice.address(), format, type, samples, usage, tiling, pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateFence(VkDevice device, @NativeType("VkFenceCreateInfo const *") VkFenceCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkCreateFence;
        if (Checks.CHECKS) {
            Checks.check(pFence, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pFence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkResetFences(VkDevice device, @NativeType("VkFence const *") long[] pFences) {
        long __functionAddress = device.getCapabilities().vkResetFences;
        return JNI.callPPI(device.address(), pFences.length, pFences, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkWaitForFences(VkDevice device, @NativeType("VkFence const *") long[] pFences, @NativeType("VkBool32") boolean waitAll, @NativeType("uint64_t") long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitForFences;
        return JNI.callPPJI(device.address(), pFences.length, pFences, waitAll ? 1 : 0, timeout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateSemaphore(VkDevice device, @NativeType("VkSemaphoreCreateInfo const *") VkSemaphoreCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSemaphore *") long[] pSemaphore) {
        long __functionAddress = device.getCapabilities().vkCreateSemaphore;
        if (Checks.CHECKS) {
            Checks.check(pSemaphore, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSemaphore, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateQueryPool(VkDevice device, @NativeType("VkQueryPoolCreateInfo const *") VkQueryPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkQueryPool *") long[] pQueryPool) {
        long __functionAddress = device.getCapabilities().vkCreateQueryPool;
        if (Checks.CHECKS) {
            Checks.check(pQueryPool, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pQueryPool, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") int[] pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
        return JNI.callPJPPJI(device.address(), queryPool, firstQuery, queryCount, Integer.toUnsignedLong(pData.length) << 2, pData, stride, flags, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") long[] pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
        return JNI.callPJPPJI(device.address(), queryPool, firstQuery, queryCount, Integer.toUnsignedLong(pData.length) << 3, pData, stride, flags, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateBuffer(VkDevice device, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkBuffer *") long[] pBuffer) {
        long __functionAddress = device.getCapabilities().vkCreateBuffer;
        if (Checks.CHECKS) {
            Checks.check(pBuffer, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pBuffer, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateImage(VkDevice device, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkImage *") long[] pImage) {
        long __functionAddress = device.getCapabilities().vkCreateImage;
        if (Checks.CHECKS) {
            Checks.check(pImage, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pImage, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateImageView(VkDevice device, @NativeType("VkImageViewCreateInfo const *") VkImageViewCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkImageView *") long[] pView) {
        long __functionAddress = device.getCapabilities().vkCreateImageView;
        if (Checks.CHECKS) {
            Checks.check(pView, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pView, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCommandPool(VkDevice device, @NativeType("VkCommandPoolCreateInfo const *") VkCommandPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCommandPool *") long[] pCommandPool) {
        long __functionAddress = device.getCapabilities().vkCreateCommandPool;
        if (Checks.CHECKS) {
            Checks.check(pCommandPool, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pCommandPool, __functionAddress);
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") short[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        JNI.callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 1, pData, __functionAddress);
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") int[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        JNI.callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 2, pData, __functionAddress);
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") long[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        JNI.callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 3, pData, __functionAddress);
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") float[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        JNI.callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 2, pData, __functionAddress);
    }

    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") double[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        JNI.callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 3, pData, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateEvent(VkDevice device, @NativeType("VkEventCreateInfo const *") VkEventCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkEvent *") long[] pEvent) {
        long __functionAddress = device.getCapabilities().vkCreateEvent;
        if (Checks.CHECKS) {
            Checks.check(pEvent, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pEvent, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateBufferView(VkDevice device, @NativeType("VkBufferViewCreateInfo const *") VkBufferViewCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkBufferView *") long[] pView) {
        long __functionAddress = device.getCapabilities().vkCreateBufferView;
        if (Checks.CHECKS) {
            Checks.check(pView, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pView, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateShaderModule(VkDevice device, @NativeType("VkShaderModuleCreateInfo const *") VkShaderModuleCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkShaderModule *") long[] pShaderModule) {
        long __functionAddress = device.getCapabilities().vkCreateShaderModule;
        if (Checks.CHECKS) {
            Checks.check(pShaderModule, 1);
            VkShaderModuleCreateInfo.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pShaderModule, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreatePipelineCache(VkDevice device, @NativeType("VkPipelineCacheCreateInfo const *") VkPipelineCacheCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipelineCache *") long[] pPipelineCache) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineCache;
        if (Checks.CHECKS) {
            Checks.check(pPipelineCache, 1);
            VkPipelineCacheCreateInfo.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pPipelineCache, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkMergePipelineCaches(VkDevice device, @NativeType("VkPipelineCache") long dstCache, @NativeType("VkPipelineCache const *") long[] pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergePipelineCaches;
        return JNI.callPJPI(device.address(), dstCache, pSrcCaches.length, pSrcCaches, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateComputePipelines(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkComputePipelineCreateInfo const *") VkComputePipelineCreateInfo.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateComputePipelines;
        if (Checks.CHECKS) {
            Checks.check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkComputePipelineCreateInfo.SIZEOF, VkComputePipelineCreateInfo::validate);
        }
        return JNI.callPJPPPI(device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreatePipelineLayout(VkDevice device, @NativeType("VkPipelineLayoutCreateInfo const *") VkPipelineLayoutCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipelineLayout *") long[] pPipelineLayout) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineLayout;
        if (Checks.CHECKS) {
            Checks.check(pPipelineLayout, 1);
            VkPipelineLayoutCreateInfo.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pPipelineLayout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateSampler(VkDevice device, @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSampler *") long[] pSampler) {
        long __functionAddress = device.getCapabilities().vkCreateSampler;
        if (Checks.CHECKS) {
            Checks.check(pSampler, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSampler, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDescriptorSetLayout(VkDevice device, @NativeType("VkDescriptorSetLayoutCreateInfo const *") VkDescriptorSetLayoutCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorSetLayout *") long[] pSetLayout) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorSetLayout;
        if (Checks.CHECKS) {
            Checks.check(pSetLayout, 1);
            VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pSetLayout, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDescriptorPool(VkDevice device, @NativeType("VkDescriptorPoolCreateInfo const *") VkDescriptorPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorPool *") long[] pDescriptorPool) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorPool;
        if (Checks.CHECKS) {
            Checks.check(pDescriptorPool, 1);
            VkDescriptorPoolCreateInfo.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pDescriptorPool, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAllocateDescriptorSets(VkDevice device, @NativeType("VkDescriptorSetAllocateInfo const *") VkDescriptorSetAllocateInfo pAllocateInfo, @NativeType("VkDescriptorSet *") long[] pDescriptorSets) {
        long __functionAddress = device.getCapabilities().vkAllocateDescriptorSets;
        if (Checks.CHECKS) {
            Checks.check(pDescriptorSets, pAllocateInfo.descriptorSetCount());
            VkDescriptorSetAllocateInfo.validate(pAllocateInfo.address());
        }
        return JNI.callPPPI(device.address(), pAllocateInfo.address(), pDescriptorSets, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkFreeDescriptorSets(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkDescriptorSet const *") long[] pDescriptorSets) {
        long __functionAddress = device.getCapabilities().vkFreeDescriptorSets;
        return JNI.callPJPI(device.address(), descriptorPool, Checks.lengthSafe(pDescriptorSets), pDescriptorSets, __functionAddress);
    }

    public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("VkDescriptorSet const *") long[] pDescriptorSets, @NativeType("uint32_t const *") int[] pDynamicOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets;
        JNI.callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, pDescriptorSets.length, pDescriptorSets, Checks.lengthSafe(pDynamicOffsets), pDynamicOffsets, __functionAddress);
    }

    public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") long[] pEvents, @NativeType("VkPipelineStageFlags") int srcStageMask, @NativeType("VkPipelineStageFlags") int dstStageMask, @NativeType("VkMemoryBarrier const *") VkMemoryBarrier.Buffer pMemoryBarriers, @NativeType("VkBufferMemoryBarrier const *") VkBufferMemoryBarrier.Buffer pBufferMemoryBarriers, @NativeType("VkImageMemoryBarrier const *") VkImageMemoryBarrier.Buffer pImageMemoryBarriers) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents;
        JNI.callPPPPPV(commandBuffer.address(), pEvents.length, pEvents, srcStageMask, dstStageMask, Checks.remainingSafe(pMemoryBarriers), MemoryUtil.memAddressSafe(pMemoryBarriers), Checks.remainingSafe(pBufferMemoryBarriers), MemoryUtil.memAddressSafe(pBufferMemoryBarriers), Checks.remainingSafe(pImageMemoryBarriers), MemoryUtil.memAddressSafe(pImageMemoryBarriers), __functionAddress);
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") short[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        JNI.callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 1, pValues, __functionAddress);
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") int[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        JNI.callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 2, pValues, __functionAddress);
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") long[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        JNI.callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 3, pValues, __functionAddress);
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") float[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        JNI.callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 2, pValues, __functionAddress);
    }

    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") double[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        JNI.callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 3, pValues, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateGraphicsPipelines(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkGraphicsPipelineCreateInfo const *") VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateGraphicsPipelines;
        if (Checks.CHECKS) {
            Checks.check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkGraphicsPipelineCreateInfo.SIZEOF, VkGraphicsPipelineCreateInfo::validate);
        }
        return JNI.callPJPPPI(device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), MemoryUtil.memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateFramebuffer(VkDevice device, @NativeType("VkFramebufferCreateInfo const *") VkFramebufferCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFramebuffer *") long[] pFramebuffer) {
        long __functionAddress = device.getCapabilities().vkCreateFramebuffer;
        if (Checks.CHECKS) {
            Checks.check(pFramebuffer, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pFramebuffer, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateRenderPass(VkDevice device, @NativeType("VkRenderPassCreateInfo const *") VkRenderPassCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") long[] pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass;
        if (Checks.CHECKS) {
            Checks.check(pRenderPass, 1);
            VkRenderPassCreateInfo.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pRenderPass, __functionAddress);
    }

    public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, @NativeType("float const *") float[] blendConstants) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetBlendConstants;
        if (Checks.CHECKS) {
            Checks.check(blendConstants, 4);
        }
        JNI.callPPV(commandBuffer.address(), blendConstants, __functionAddress);
    }

    public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers;
        if (Checks.CHECKS) {
            Checks.check(pOffsets, pBuffers.length);
        }
        JNI.callPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, __functionAddress);
    }
}
