package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.sdl.SDL_GPUBufferBinding;
import org.lwjgl.sdl.SDL_GPUColorTargetInfo;
import org.lwjgl.sdl.SDL_GPUStorageBufferReadWriteBinding;
import org.lwjgl.sdl.SDL_GPUStorageTextureReadWriteBinding;
import org.lwjgl.sdl.SDL_GPUTextureSamplerBinding;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLGPU.class */
public class SDLGPU {
    public static final int SDL_GPU_PRIMITIVETYPE_TRIANGLELIST = 0;
    public static final int SDL_GPU_PRIMITIVETYPE_TRIANGLESTRIP = 1;
    public static final int SDL_GPU_PRIMITIVETYPE_LINELIST = 2;
    public static final int SDL_GPU_PRIMITIVETYPE_LINESTRIP = 3;
    public static final int SDL_GPU_PRIMITIVETYPE_POINTLIST = 4;
    public static final int SDL_GPU_LOADOP_LOAD = 0;
    public static final int SDL_GPU_LOADOP_CLEAR = 1;
    public static final int SDL_GPU_LOADOP_DONT_CARE = 2;
    public static final int SDL_GPU_STOREOP_STORE = 0;
    public static final int SDL_GPU_STOREOP_DONT_CARE = 1;
    public static final int SDL_GPU_STOREOP_RESOLVE = 2;
    public static final int SDL_GPU_STOREOP_RESOLVE_AND_STORE = 3;
    public static final int SDL_GPU_INDEXELEMENTSIZE_16BIT = 0;
    public static final int SDL_GPU_INDEXELEMENTSIZE_32BIT = 1;
    public static final int SDL_GPU_TEXTUREFORMAT_INVALID = 0;
    public static final int SDL_GPU_TEXTUREFORMAT_A8_UNORM = 1;
    public static final int SDL_GPU_TEXTUREFORMAT_R8_UNORM = 2;
    public static final int SDL_GPU_TEXTUREFORMAT_R8G8_UNORM = 3;
    public static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM = 4;
    public static final int SDL_GPU_TEXTUREFORMAT_R16_UNORM = 5;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16_UNORM = 6;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UNORM = 7;
    public static final int SDL_GPU_TEXTUREFORMAT_R10G10B10A2_UNORM = 8;
    public static final int SDL_GPU_TEXTUREFORMAT_B5G6R5_UNORM = 9;
    public static final int SDL_GPU_TEXTUREFORMAT_B5G5R5A1_UNORM = 10;
    public static final int SDL_GPU_TEXTUREFORMAT_B4G4R4A4_UNORM = 11;
    public static final int SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM = 12;
    public static final int SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM = 13;
    public static final int SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM = 14;
    public static final int SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM = 15;
    public static final int SDL_GPU_TEXTUREFORMAT_BC4_R_UNORM = 16;
    public static final int SDL_GPU_TEXTUREFORMAT_BC5_RG_UNORM = 17;
    public static final int SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM = 18;
    public static final int SDL_GPU_TEXTUREFORMAT_BC6H_RGB_FLOAT = 19;
    public static final int SDL_GPU_TEXTUREFORMAT_BC6H_RGB_UFLOAT = 20;
    public static final int SDL_GPU_TEXTUREFORMAT_R8_SNORM = 21;
    public static final int SDL_GPU_TEXTUREFORMAT_R8G8_SNORM = 22;
    public static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_SNORM = 23;
    public static final int SDL_GPU_TEXTUREFORMAT_R16_SNORM = 24;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16_SNORM = 25;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_SNORM = 26;
    public static final int SDL_GPU_TEXTUREFORMAT_R16_FLOAT = 27;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16_FLOAT = 28;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_FLOAT = 29;
    public static final int SDL_GPU_TEXTUREFORMAT_R32_FLOAT = 30;
    public static final int SDL_GPU_TEXTUREFORMAT_R32G32_FLOAT = 31;
    public static final int SDL_GPU_TEXTUREFORMAT_R32G32B32A32_FLOAT = 32;
    public static final int SDL_GPU_TEXTUREFORMAT_R11G11B10_UFLOAT = 33;
    public static final int SDL_GPU_TEXTUREFORMAT_R8_UINT = 34;
    public static final int SDL_GPU_TEXTUREFORMAT_R8G8_UINT = 35;
    public static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UINT = 36;
    public static final int SDL_GPU_TEXTUREFORMAT_R16_UINT = 37;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16_UINT = 38;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UINT = 39;
    public static final int SDL_GPU_TEXTUREFORMAT_R32_UINT = 40;
    public static final int SDL_GPU_TEXTUREFORMAT_R32G32_UINT = 41;
    public static final int SDL_GPU_TEXTUREFORMAT_R32G32B32A32_UINT = 42;
    public static final int SDL_GPU_TEXTUREFORMAT_R8_INT = 43;
    public static final int SDL_GPU_TEXTUREFORMAT_R8G8_INT = 44;
    public static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_INT = 45;
    public static final int SDL_GPU_TEXTUREFORMAT_R16_INT = 46;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16_INT = 47;
    public static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_INT = 48;
    public static final int SDL_GPU_TEXTUREFORMAT_R32_INT = 49;
    public static final int SDL_GPU_TEXTUREFORMAT_R32G32_INT = 50;
    public static final int SDL_GPU_TEXTUREFORMAT_R32G32B32A32_INT = 51;
    public static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM_SRGB = 52;
    public static final int SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM_SRGB = 53;
    public static final int SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM_SRGB = 54;
    public static final int SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM_SRGB = 55;
    public static final int SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM_SRGB = 56;
    public static final int SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM_SRGB = 57;
    public static final int SDL_GPU_TEXTUREFORMAT_D16_UNORM = 58;
    public static final int SDL_GPU_TEXTUREFORMAT_D24_UNORM = 59;
    public static final int SDL_GPU_TEXTUREFORMAT_D32_FLOAT = 60;
    public static final int SDL_GPU_TEXTUREFORMAT_D24_UNORM_S8_UINT = 61;
    public static final int SDL_GPU_TEXTUREFORMAT_D32_FLOAT_S8_UINT = 62;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM = 63;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM = 64;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM = 65;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM = 66;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM = 67;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM = 68;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM = 69;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM = 70;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM = 71;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM = 72;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM = 73;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM = 74;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM = 75;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM = 76;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM_SRGB = 77;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM_SRGB = 78;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM_SRGB = 79;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM_SRGB = 80;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM_SRGB = 81;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM_SRGB = 82;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM_SRGB = 83;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM_SRGB = 84;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM_SRGB = 85;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM_SRGB = 86;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM_SRGB = 87;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM_SRGB = 88;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM_SRGB = 89;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM_SRGB = 90;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_4x4_FLOAT = 91;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x4_FLOAT = 92;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x5_FLOAT = 93;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x5_FLOAT = 94;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x6_FLOAT = 95;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x5_FLOAT = 96;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x6_FLOAT = 97;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x8_FLOAT = 98;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x5_FLOAT = 99;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x6_FLOAT = 100;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x8_FLOAT = 101;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x10_FLOAT = 102;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x10_FLOAT = 103;
    public static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x12_FLOAT = 104;
    public static final int SDL_GPU_TEXTUREUSAGE_SAMPLER = 1;
    public static final int SDL_GPU_TEXTUREUSAGE_COLOR_TARGET = 2;
    public static final int SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET = 4;
    public static final int SDL_GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ = 8;
    public static final int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ = 16;
    public static final int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE = 32;
    public static final int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE = 64;
    public static final int SDL_GPU_TEXTURETYPE_2D = 0;
    public static final int SDL_GPU_TEXTURETYPE_2D_ARRAY = 1;
    public static final int SDL_GPU_TEXTURETYPE_3D = 2;
    public static final int SDL_GPU_TEXTURETYPE_CUBE = 3;
    public static final int SDL_GPU_TEXTURETYPE_CUBE_ARRAY = 4;
    public static final int SDL_GPU_SAMPLECOUNT_1 = 0;
    public static final int SDL_GPU_SAMPLECOUNT_2 = 1;
    public static final int SDL_GPU_SAMPLECOUNT_4 = 2;
    public static final int SDL_GPU_SAMPLECOUNT_8 = 3;
    public static final int SDL_GPU_CUBEMAPFACE_POSITIVEX = 0;
    public static final int SDL_GPU_CUBEMAPFACE_NEGATIVEX = 1;
    public static final int SDL_GPU_CUBEMAPFACE_POSITIVEY = 2;
    public static final int SDL_GPU_CUBEMAPFACE_NEGATIVEY = 3;
    public static final int SDL_GPU_CUBEMAPFACE_POSITIVEZ = 4;
    public static final int SDL_GPU_CUBEMAPFACE_NEGATIVEZ = 5;
    public static final int SDL_GPU_BUFFERUSAGE_VERTEX = 1;
    public static final int SDL_GPU_BUFFERUSAGE_INDEX = 2;
    public static final int SDL_GPU_BUFFERUSAGE_INDIRECT = 4;
    public static final int SDL_GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ = 8;
    public static final int SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ = 16;
    public static final int SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE = 32;
    public static final int SDL_GPU_TRANSFERBUFFERUSAGE_UPLOAD = 0;
    public static final int SDL_GPU_TRANSFERBUFFERUSAGE_DOWNLOAD = 1;
    public static final int SDL_GPU_SHADERSTAGE_VERTEX = 0;
    public static final int SDL_GPU_SHADERSTAGE_FRAGMENT = 1;
    public static final int SDL_GPU_SHADERFORMAT_INVALID = 0;
    public static final int SDL_GPU_SHADERFORMAT_PRIVATE = 1;
    public static final int SDL_GPU_SHADERFORMAT_SPIRV = 2;
    public static final int SDL_GPU_SHADERFORMAT_DXBC = 4;
    public static final int SDL_GPU_SHADERFORMAT_DXIL = 8;
    public static final int SDL_GPU_SHADERFORMAT_MSL = 16;
    public static final int SDL_GPU_SHADERFORMAT_METALLIB = 32;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_INVALID = 0;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_INT = 1;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_INT2 = 2;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_INT3 = 3;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_INT4 = 4;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_UINT = 5;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_UINT2 = 6;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_UINT3 = 7;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_UINT4 = 8;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT = 9;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT2 = 10;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT3 = 11;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT4 = 12;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_BYTE2 = 13;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_BYTE4 = 14;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2 = 15;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4 = 16;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_BYTE2_NORM = 17;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_BYTE4_NORM = 18;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2_NORM = 19;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4_NORM = 20;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_SHORT2 = 21;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_SHORT4 = 22;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_USHORT2 = 23;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_USHORT4 = 24;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_SHORT2_NORM = 25;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_SHORT4_NORM = 26;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_USHORT2_NORM = 27;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_USHORT4_NORM = 28;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_HALF2 = 29;
    public static final int SDL_GPU_VERTEXELEMENTFORMAT_HALF4 = 30;
    public static final int SDL_GPU_VERTEXINPUTRATE_VERTEX = 0;
    public static final int SDL_GPU_VERTEXINPUTRATE_INSTANCE = 1;
    public static final int SDL_GPU_FILLMODE_FILL = 0;
    public static final int SDL_GPU_FILLMODE_LINE = 1;
    public static final int SDL_GPU_CULLMODE_NONE = 0;
    public static final int SDL_GPU_CULLMODE_FRONT = 1;
    public static final int SDL_GPU_CULLMODE_BACK = 2;
    public static final int SDL_GPU_FRONTFACE_COUNTER_CLOCKWISE = 0;
    public static final int SDL_GPU_FRONTFACE_CLOCKWISE = 1;
    public static final int SDL_GPU_COMPAREOP_INVALID = 0;
    public static final int SDL_GPU_COMPAREOP_NEVER = 1;
    public static final int SDL_GPU_COMPAREOP_LESS = 2;
    public static final int SDL_GPU_COMPAREOP_EQUAL = 3;
    public static final int SDL_GPU_COMPAREOP_LESS_OR_EQUAL = 4;
    public static final int SDL_GPU_COMPAREOP_GREATER = 5;
    public static final int SDL_GPU_COMPAREOP_NOT_EQUAL = 6;
    public static final int SDL_GPU_COMPAREOP_GREATER_OR_EQUAL = 7;
    public static final int SDL_GPU_COMPAREOP_ALWAYS = 8;
    public static final int SDL_GPU_STENCILOP_INVALID = 0;
    public static final int SDL_GPU_STENCILOP_KEEP = 1;
    public static final int SDL_GPU_STENCILOP_ZERO = 2;
    public static final int SDL_GPU_STENCILOP_REPLACE = 3;
    public static final int SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP = 4;
    public static final int SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP = 5;
    public static final int SDL_GPU_STENCILOP_INVERT = 6;
    public static final int SDL_GPU_STENCILOP_INCREMENT_AND_WRAP = 7;
    public static final int SDL_GPU_STENCILOP_DECREMENT_AND_WRAP = 8;
    public static final int SDL_GPU_BLENDOP_INVALID = 0;
    public static final int SDL_GPU_BLENDOP_ADD = 1;
    public static final int SDL_GPU_BLENDOP_SUBTRACT = 2;
    public static final int SDL_GPU_BLENDOP_REVERSE_SUBTRACT = 3;
    public static final int SDL_GPU_BLENDOP_MIN = 4;
    public static final int SDL_GPU_BLENDOP_MAX = 5;
    public static final int SDL_GPU_BLENDFACTOR_INVALID = 0;
    public static final int SDL_GPU_BLENDFACTOR_ZERO = 1;
    public static final int SDL_GPU_BLENDFACTOR_ONE = 2;
    public static final int SDL_GPU_BLENDFACTOR_SRC_COLOR = 3;
    public static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_COLOR = 4;
    public static final int SDL_GPU_BLENDFACTOR_DST_COLOR = 5;
    public static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_COLOR = 6;
    public static final int SDL_GPU_BLENDFACTOR_SRC_ALPHA = 7;
    public static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA = 8;
    public static final int SDL_GPU_BLENDFACTOR_DST_ALPHA = 9;
    public static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_ALPHA = 10;
    public static final int SDL_GPU_BLENDFACTOR_CONSTANT_COLOR = 11;
    public static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_CONSTANT_COLOR = 12;
    public static final int SDL_GPU_BLENDFACTOR_SRC_ALPHA_SATURATE = 13;
    public static final int SDL_GPU_COLORCOMPONENT_R = 1;
    public static final int SDL_GPU_COLORCOMPONENT_G = 2;
    public static final int SDL_GPU_COLORCOMPONENT_B = 4;
    public static final int SDL_GPU_COLORCOMPONENT_A = 8;
    public static final int SDL_GPU_FILTER_NEAREST = 0;
    public static final int SDL_GPU_FILTER_LINEAR = 1;
    public static final int SDL_GPU_SAMPLERMIPMAPMODE_NEAREST = 0;
    public static final int SDL_GPU_SAMPLERMIPMAPMODE_LINEAR = 1;
    public static final int SDL_GPU_SAMPLERADDRESSMODE_REPEAT = 0;
    public static final int SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT = 1;
    public static final int SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE = 2;
    public static final int SDL_GPU_PRESENTMODE_VSYNC = 0;
    public static final int SDL_GPU_PRESENTMODE_IMMEDIATE = 1;
    public static final int SDL_GPU_PRESENTMODE_MAILBOX = 2;
    public static final int SDL_GPU_SWAPCHAINCOMPOSITION_SDR = 0;
    public static final int SDL_GPU_SWAPCHAINCOMPOSITION_SDR_LINEAR = 1;
    public static final int SDL_GPU_SWAPCHAINCOMPOSITION_HDR_EXTENDED_LINEAR = 2;
    public static final int SDL_GPU_SWAPCHAINCOMPOSITION_HDR10_ST2084 = 3;
    public static final String SDL_PROP_GPU_DEVICE_CREATE_DEBUGMODE_BOOLEAN = "SDL.gpu.device.create.debugmode";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_PREFERLOWPOWER_BOOLEAN = "SDL.gpu.device.create.preferlowpower";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_VERBOSE_BOOLEAN = "SDL.gpu.device.create.verbose";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_NAME_STRING = "SDL.gpu.device.create.name";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_FEATURE_CLIP_DISTANCE_BOOLEAN = "SDL.gpu.device.create.feature.clip_distance";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_FEATURE_DEPTH_CLAMPING_BOOLEAN = "SDL.gpu.device.create.feature.depth_clamping";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_FEATURE_INDIRECT_DRAW_FIRST_INSTANCE_BOOLEAN = "SDL.gpu.device.create.feature.indirect_draw_first_instance";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_FEATURE_ANISOTROPY_BOOLEAN = "SDL.gpu.device.create.feature.anisotropy";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_SHADERS_PRIVATE_BOOLEAN = "SDL.gpu.device.create.shaders.private";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_SHADERS_SPIRV_BOOLEAN = "SDL.gpu.device.create.shaders.spirv";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXBC_BOOLEAN = "SDL.gpu.device.create.shaders.dxbc";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXIL_BOOLEAN = "SDL.gpu.device.create.shaders.dxil";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_SHADERS_MSL_BOOLEAN = "SDL.gpu.device.create.shaders.msl";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_SHADERS_METALLIB_BOOLEAN = "SDL.gpu.device.create.shaders.metallib";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_D3D12_ALLOW_FEWER_RESOURCE_SLOTS_BOOLEAN = "SDL.gpu.device.create.d3d12.allowtier1resourcebinding";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_D3D12_SEMANTIC_NAME_STRING = "SDL.gpu.device.create.d3d12.semantic";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_VERSION_NUMBER = "SDL.gpu.device.create.d3d12.agility_sdk_version";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_PATH_STRING = "SDL.gpu.device.create.d3d12.agility_sdk_path";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_VULKAN_REQUIRE_HARDWARE_ACCELERATION_BOOLEAN = "SDL.gpu.device.create.vulkan.requirehardwareacceleration";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_VULKAN_OPTIONS_POINTER = "SDL.gpu.device.create.vulkan.options";
    public static final String SDL_PROP_GPU_DEVICE_CREATE_METAL_ALLOW_MACFAMILY1_BOOLEAN = "SDL.gpu.device.create.metal.allowmacfamily1";
    public static final String SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_R_FLOAT = "SDL.gpu.texture.create.d3d12.clear.r";
    public static final String SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_G_FLOAT = "SDL.gpu.texture.create.d3d12.clear.g";
    public static final String SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_B_FLOAT = "SDL.gpu.texture.create.d3d12.clear.b";
    public static final String SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_A_FLOAT = "SDL.gpu.texture.create.d3d12.clear.a";
    public static final String SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_DEPTH_FLOAT = "SDL.gpu.texture.create.d3d12.clear.depth";
    public static final String SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_STENCIL_NUMBER = "SDL.gpu.texture.create.d3d12.clear.stencil";
    public static final String SDL_PROP_GPU_DEVICE_NAME_STRING = "SDL.gpu.device.name";
    public static final String SDL_PROP_GPU_DEVICE_DRIVER_NAME_STRING = "SDL.gpu.device.driver_name";
    public static final String SDL_PROP_GPU_DEVICE_DRIVER_VERSION_STRING = "SDL.gpu.device.driver_version";
    public static final String SDL_PROP_GPU_DEVICE_DRIVER_INFO_STRING = "SDL.gpu.device.driver_info";
    public static final String SDL_PROP_GPU_COMPUTEPIPELINE_CREATE_NAME_STRING = "SDL.gpu.computepipeline.create.name";
    public static final String SDL_PROP_GPU_GRAPHICSPIPELINE_CREATE_NAME_STRING = "SDL.gpu.graphicspipeline.create.name";
    public static final String SDL_PROP_GPU_SAMPLER_CREATE_NAME_STRING = "SDL.gpu.sampler.create.name";
    public static final String SDL_PROP_GPU_SHADER_CREATE_NAME_STRING = "SDL.gpu.shader.create.name";
    public static final String SDL_PROP_GPU_TEXTURE_CREATE_NAME_STRING = "SDL.gpu.texture.create.name";
    public static final String SDL_PROP_GPU_BUFFER_CREATE_NAME_STRING = "SDL.gpu.buffer.create.name";
    public static final String SDL_PROP_GPU_TRANSFERBUFFER_CREATE_NAME_STRING = "SDL.gpu.transferbuffer.create.name";
    private static final FFICIF SDL_SetGPUBlendConstantsCIF = APIUtil.apiCreateCIF(LibFFI.ffi_type_void, LibFFI.ffi_type_pointer, APIUtil.apiCreateStruct(LibFFI.ffi_type_float, LibFFI.ffi_type_float, LibFFI.ffi_type_float, LibFFI.ffi_type_float));

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLGPU$Functions.class */
    public static final class Functions {
        public static final long GPUSupportsShaderFormats = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUSupportsShaderFormats");
        public static final long GPUSupportsProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUSupportsProperties");
        public static final long CreateGPUDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUDevice");
        public static final long CreateGPUDeviceWithProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUDeviceWithProperties");
        public static final long DestroyGPUDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyGPUDevice");
        public static final long GetNumGPUDrivers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumGPUDrivers");
        public static final long GetGPUDriver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUDriver");
        public static final long GetGPUDeviceDriver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUDeviceDriver");
        public static final long GetGPUShaderFormats = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUShaderFormats");
        public static final long GetGPUDeviceProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUDeviceProperties");
        public static final long CreateGPUComputePipeline = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUComputePipeline");
        public static final long CreateGPUGraphicsPipeline = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUGraphicsPipeline");
        public static final long CreateGPUSampler = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUSampler");
        public static final long CreateGPUShader = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUShader");
        public static final long CreateGPUTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUTexture");
        public static final long CreateGPUBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUBuffer");
        public static final long CreateGPUTransferBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUTransferBuffer");
        public static final long SetGPUBufferName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUBufferName");
        public static final long SetGPUTextureName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUTextureName");
        public static final long InsertGPUDebugLabel = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_InsertGPUDebugLabel");
        public static final long PushGPUDebugGroup = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PushGPUDebugGroup");
        public static final long PopGPUDebugGroup = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PopGPUDebugGroup");
        public static final long ReleaseGPUTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUTexture");
        public static final long ReleaseGPUSampler = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUSampler");
        public static final long ReleaseGPUBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUBuffer");
        public static final long ReleaseGPUTransferBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUTransferBuffer");
        public static final long ReleaseGPUComputePipeline = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUComputePipeline");
        public static final long ReleaseGPUShader = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUShader");
        public static final long ReleaseGPUGraphicsPipeline = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUGraphicsPipeline");
        public static final long AcquireGPUCommandBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AcquireGPUCommandBuffer");
        public static final long PushGPUVertexUniformData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PushGPUVertexUniformData");
        public static final long PushGPUFragmentUniformData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PushGPUFragmentUniformData");
        public static final long PushGPUComputeUniformData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PushGPUComputeUniformData");
        public static final long BeginGPURenderPass = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BeginGPURenderPass");
        public static final long BindGPUGraphicsPipeline = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUGraphicsPipeline");
        public static final long SetGPUViewport = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUViewport");
        public static final long SetGPUScissor = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUScissor");
        public static final long SetGPUBlendConstants = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUBlendConstants");
        public static final long SetGPUStencilReference = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUStencilReference");
        public static final long BindGPUVertexBuffers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUVertexBuffers");
        public static final long BindGPUIndexBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUIndexBuffer");
        public static final long BindGPUVertexSamplers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUVertexSamplers");
        public static final long BindGPUVertexStorageTextures = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUVertexStorageTextures");
        public static final long BindGPUVertexStorageBuffers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUVertexStorageBuffers");
        public static final long BindGPUFragmentSamplers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUFragmentSamplers");
        public static final long BindGPUFragmentStorageTextures = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUFragmentStorageTextures");
        public static final long BindGPUFragmentStorageBuffers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUFragmentStorageBuffers");
        public static final long DrawGPUIndexedPrimitives = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DrawGPUIndexedPrimitives");
        public static final long DrawGPUPrimitives = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DrawGPUPrimitives");
        public static final long DrawGPUPrimitivesIndirect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DrawGPUPrimitivesIndirect");
        public static final long DrawGPUIndexedPrimitivesIndirect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DrawGPUIndexedPrimitivesIndirect");
        public static final long EndGPURenderPass = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EndGPURenderPass");
        public static final long BeginGPUComputePass = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BeginGPUComputePass");
        public static final long BindGPUComputePipeline = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUComputePipeline");
        public static final long BindGPUComputeSamplers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUComputeSamplers");
        public static final long BindGPUComputeStorageTextures = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUComputeStorageTextures");
        public static final long BindGPUComputeStorageBuffers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUComputeStorageBuffers");
        public static final long DispatchGPUCompute = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DispatchGPUCompute");
        public static final long DispatchGPUComputeIndirect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DispatchGPUComputeIndirect");
        public static final long EndGPUComputePass = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EndGPUComputePass");
        public static final long MapGPUTransferBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapGPUTransferBuffer");
        public static final long UnmapGPUTransferBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnmapGPUTransferBuffer");
        public static final long BeginGPUCopyPass = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BeginGPUCopyPass");
        public static final long UploadToGPUTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UploadToGPUTexture");
        public static final long UploadToGPUBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UploadToGPUBuffer");
        public static final long CopyGPUTextureToTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyGPUTextureToTexture");
        public static final long CopyGPUBufferToBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyGPUBufferToBuffer");
        public static final long DownloadFromGPUTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DownloadFromGPUTexture");
        public static final long DownloadFromGPUBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DownloadFromGPUBuffer");
        public static final long EndGPUCopyPass = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EndGPUCopyPass");
        public static final long GenerateMipmapsForGPUTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GenerateMipmapsForGPUTexture");
        public static final long BlitGPUTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitGPUTexture");
        public static final long WindowSupportsGPUSwapchainComposition = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WindowSupportsGPUSwapchainComposition");
        public static final long WindowSupportsGPUPresentMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WindowSupportsGPUPresentMode");
        public static final long ClaimWindowForGPUDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClaimWindowForGPUDevice");
        public static final long ReleaseWindowFromGPUDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseWindowFromGPUDevice");
        public static final long SetGPUSwapchainParameters = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUSwapchainParameters");
        public static final long SetGPUAllowedFramesInFlight = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUAllowedFramesInFlight");
        public static final long GetGPUSwapchainTextureFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUSwapchainTextureFormat");
        public static final long AcquireGPUSwapchainTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AcquireGPUSwapchainTexture");
        public static final long WaitForGPUSwapchain = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitForGPUSwapchain");
        public static final long WaitAndAcquireGPUSwapchainTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitAndAcquireGPUSwapchainTexture");
        public static final long SubmitGPUCommandBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SubmitGPUCommandBuffer");
        public static final long SubmitGPUCommandBufferAndAcquireFence = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SubmitGPUCommandBufferAndAcquireFence");
        public static final long CancelGPUCommandBuffer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CancelGPUCommandBuffer");
        public static final long WaitForGPUIdle = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitForGPUIdle");
        public static final long WaitForGPUFences = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitForGPUFences");
        public static final long QueryGPUFence = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_QueryGPUFence");
        public static final long ReleaseGPUFence = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUFence");
        public static final long GPUTextureFormatTexelBlockSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUTextureFormatTexelBlockSize");
        public static final long GPUTextureSupportsFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUTextureSupportsFormat");
        public static final long GPUTextureSupportsSampleCount = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUTextureSupportsSampleCount");
        public static final long CalculateGPUTextureFormatSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CalculateGPUTextureFormatSize");
        public static final long GetPixelFormatFromGPUTextureFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPixelFormatFromGPUTextureFormat");
        public static final long GetGPUTextureFormatFromPixelFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUTextureFormatFromPixelFormat");

        private Functions() {
        }
    }

    protected SDLGPU() {
        throw new UnsupportedOperationException();
    }

    public static boolean nSDL_GPUSupportsShaderFormats(int format_flags, long name) {
        long __functionAddress = Functions.GPUSupportsShaderFormats;
        return JNI.invokePZ(format_flags, name, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GPUSupportsShaderFormats(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(name);
        }
        return nSDL_GPUSupportsShaderFormats(format_flags, MemoryUtil.memAddressSafe(name));
    }

    @NativeType("bool")
    public static boolean SDL_GPUSupportsShaderFormats(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? 0L : stack.getPointerAddress();
            boolean zNSDL_GPUSupportsShaderFormats = nSDL_GPUSupportsShaderFormats(format_flags, nameEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_GPUSupportsShaderFormats;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("bool")
    public static boolean SDL_GPUSupportsProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.GPUSupportsProperties;
        return JNI.invokeZ(props, __functionAddress);
    }

    public static long nSDL_CreateGPUDevice(int format_flags, boolean debug_mode, long name) {
        long __functionAddress = Functions.CreateGPUDevice;
        return JNI.invokePP(format_flags, debug_mode, name, __functionAddress);
    }

    @NativeType("SDL_GPUDevice *")
    public static long SDL_CreateGPUDevice(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("bool") boolean debug_mode, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(name);
        }
        return nSDL_CreateGPUDevice(format_flags, debug_mode, MemoryUtil.memAddressSafe(name));
    }

    @NativeType("SDL_GPUDevice *")
    public static long SDL_CreateGPUDevice(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("bool") boolean debug_mode, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? 0L : stack.getPointerAddress();
            long jNSDL_CreateGPUDevice = nSDL_CreateGPUDevice(format_flags, debug_mode, nameEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_CreateGPUDevice;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("SDL_GPUDevice *")
    public static long SDL_CreateGPUDeviceWithProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.CreateGPUDeviceWithProperties;
        return JNI.invokeP(props, __functionAddress);
    }

    public static void SDL_DestroyGPUDevice(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.DestroyGPUDevice;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        JNI.invokePV(device, __functionAddress);
    }

    public static int SDL_GetNumGPUDrivers() {
        long __functionAddress = Functions.GetNumGPUDrivers;
        return JNI.invokeI(__functionAddress);
    }

    public static long nSDL_GetGPUDriver(int index) {
        long __functionAddress = Functions.GetGPUDriver;
        return JNI.invokeP(index, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGPUDriver(int index) {
        long __result = nSDL_GetGPUDriver(index);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nSDL_GetGPUDeviceDriver(long device) {
        long __functionAddress = Functions.GetGPUDeviceDriver;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePP(device, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGPUDeviceDriver(@NativeType("SDL_GPUDevice *") long device) {
        long __result = nSDL_GetGPUDeviceDriver(device);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("SDL_GPUShaderFormat")
    public static int SDL_GetGPUShaderFormats(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.GetGPUShaderFormats;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePI(device, __functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetGPUDeviceProperties(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.GetGPUDeviceProperties;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePI(device, __functionAddress);
    }

    public static long nSDL_CreateGPUComputePipeline(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUComputePipeline;
        if (Checks.CHECKS) {
            Checks.check(device);
            SDL_GPUComputePipelineCreateInfo.validate(createinfo);
        }
        return JNI.invokePPP(device, createinfo, __functionAddress);
    }

    @NativeType("SDL_GPUComputePipeline *")
    public static long SDL_CreateGPUComputePipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUComputePipelineCreateInfo const *") SDL_GPUComputePipelineCreateInfo createinfo) {
        return nSDL_CreateGPUComputePipeline(device, createinfo.address());
    }

    public static long nSDL_CreateGPUGraphicsPipeline(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUGraphicsPipeline;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePPP(device, createinfo, __functionAddress);
    }

    @NativeType("SDL_GPUGraphicsPipeline *")
    public static long SDL_CreateGPUGraphicsPipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUGraphicsPipelineCreateInfo const *") SDL_GPUGraphicsPipelineCreateInfo createinfo) {
        return nSDL_CreateGPUGraphicsPipeline(device, createinfo.address());
    }

    public static long nSDL_CreateGPUSampler(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUSampler;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePPP(device, createinfo, __functionAddress);
    }

    @NativeType("SDL_GPUSampler *")
    public static long SDL_CreateGPUSampler(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUSamplerCreateInfo const *") SDL_GPUSamplerCreateInfo createinfo) {
        return nSDL_CreateGPUSampler(device, createinfo.address());
    }

    public static long nSDL_CreateGPUShader(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUShader;
        if (Checks.CHECKS) {
            Checks.check(device);
            SDL_GPUShaderCreateInfo.validate(createinfo);
        }
        return JNI.invokePPP(device, createinfo, __functionAddress);
    }

    @NativeType("SDL_GPUShader *")
    public static long SDL_CreateGPUShader(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUShaderCreateInfo const *") SDL_GPUShaderCreateInfo createinfo) {
        return nSDL_CreateGPUShader(device, createinfo.address());
    }

    public static long nSDL_CreateGPUTexture(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUTexture;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePPP(device, createinfo, __functionAddress);
    }

    @NativeType("SDL_GPUTexture *")
    public static long SDL_CreateGPUTexture(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTextureCreateInfo const *") SDL_GPUTextureCreateInfo createinfo) {
        return nSDL_CreateGPUTexture(device, createinfo.address());
    }

    public static long nSDL_CreateGPUBuffer(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUBuffer;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePPP(device, createinfo, __functionAddress);
    }

    @NativeType("SDL_GPUBuffer *")
    public static long SDL_CreateGPUBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBufferCreateInfo const *") SDL_GPUBufferCreateInfo createinfo) {
        return nSDL_CreateGPUBuffer(device, createinfo.address());
    }

    public static long nSDL_CreateGPUTransferBuffer(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUTransferBuffer;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePPP(device, createinfo, __functionAddress);
    }

    @NativeType("SDL_GPUTransferBuffer *")
    public static long SDL_CreateGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBufferCreateInfo const *") SDL_GPUTransferBufferCreateInfo createinfo) {
        return nSDL_CreateGPUTransferBuffer(device, createinfo.address());
    }

    public static void nSDL_SetGPUBufferName(long device, long buffer, long text) {
        long __functionAddress = Functions.SetGPUBufferName;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(buffer);
        }
        JNI.invokePPPV(device, buffer, text, __functionAddress);
    }

    public static void SDL_SetGPUBufferName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("char const *") ByteBuffer text) {
        if (Checks.CHECKS) {
            Checks.checkNT1(text);
        }
        nSDL_SetGPUBufferName(device, buffer, MemoryUtil.memAddress(text));
    }

    public static void SDL_SetGPUBufferName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nSDL_SetGPUBufferName(device, buffer, textEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_SetGPUTextureName(long device, long texture, long text) {
        long __functionAddress = Functions.SetGPUTextureName;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(texture);
        }
        JNI.invokePPPV(device, texture, text, __functionAddress);
    }

    public static void SDL_SetGPUTextureName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTexture *") long texture, @NativeType("char const *") ByteBuffer text) {
        if (Checks.CHECKS) {
            Checks.checkNT1(text);
        }
        nSDL_SetGPUTextureName(device, texture, MemoryUtil.memAddress(text));
    }

    public static void SDL_SetGPUTextureName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTexture *") long texture, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nSDL_SetGPUTextureName(device, texture, textEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_InsertGPUDebugLabel(long command_buffer, long text) {
        long __functionAddress = Functions.InsertGPUDebugLabel;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        JNI.invokePPV(command_buffer, text, __functionAddress);
    }

    public static void SDL_InsertGPUDebugLabel(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") ByteBuffer text) {
        if (Checks.CHECKS) {
            Checks.checkNT1(text);
        }
        nSDL_InsertGPUDebugLabel(command_buffer, MemoryUtil.memAddress(text));
    }

    public static void SDL_InsertGPUDebugLabel(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nSDL_InsertGPUDebugLabel(command_buffer, textEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_PushGPUDebugGroup(long command_buffer, long name) {
        long __functionAddress = Functions.PushGPUDebugGroup;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        JNI.invokePPV(command_buffer, name, __functionAddress);
    }

    public static void SDL_PushGPUDebugGroup(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        nSDL_PushGPUDebugGroup(command_buffer, MemoryUtil.memAddress(name));
    }

    public static void SDL_PushGPUDebugGroup(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nSDL_PushGPUDebugGroup(command_buffer, nameEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_PopGPUDebugGroup(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.PopGPUDebugGroup;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        JNI.invokePV(command_buffer, __functionAddress);
    }

    public static void SDL_ReleaseGPUTexture(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTexture *") long texture) {
        long __functionAddress = Functions.ReleaseGPUTexture;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(texture);
        }
        JNI.invokePPV(device, texture, __functionAddress);
    }

    public static void SDL_ReleaseGPUSampler(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUSampler *") long sampler) {
        long __functionAddress = Functions.ReleaseGPUSampler;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(sampler);
        }
        JNI.invokePPV(device, sampler, __functionAddress);
    }

    public static void SDL_ReleaseGPUBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBuffer *") long buffer) {
        long __functionAddress = Functions.ReleaseGPUBuffer;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(buffer);
        }
        JNI.invokePPV(device, buffer, __functionAddress);
    }

    public static void SDL_ReleaseGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBuffer *") long transfer_buffer) {
        long __functionAddress = Functions.ReleaseGPUTransferBuffer;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(transfer_buffer);
        }
        JNI.invokePPV(device, transfer_buffer, __functionAddress);
    }

    public static void SDL_ReleaseGPUComputePipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUComputePipeline *") long compute_pipeline) {
        long __functionAddress = Functions.ReleaseGPUComputePipeline;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(compute_pipeline);
        }
        JNI.invokePPV(device, compute_pipeline, __functionAddress);
    }

    public static void SDL_ReleaseGPUShader(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUShader *") long shader) {
        long __functionAddress = Functions.ReleaseGPUShader;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(shader);
        }
        JNI.invokePPV(device, shader, __functionAddress);
    }

    public static void SDL_ReleaseGPUGraphicsPipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUGraphicsPipeline *") long graphics_pipeline) {
        long __functionAddress = Functions.ReleaseGPUGraphicsPipeline;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(graphics_pipeline);
        }
        JNI.invokePPV(device, graphics_pipeline, __functionAddress);
    }

    @NativeType("SDL_GPUCommandBuffer *")
    public static long SDL_AcquireGPUCommandBuffer(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.AcquireGPUCommandBuffer;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePP(device, __functionAddress);
    }

    public static void nSDL_PushGPUVertexUniformData(long command_buffer, int slot_index, long data, int length) {
        long __functionAddress = Functions.PushGPUVertexUniformData;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        JNI.invokePPV(command_buffer, slot_index, data, length, __functionAddress);
    }

    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining());
    }

    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ShortBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 1);
    }

    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") IntBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 2);
    }

    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") LongBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 3);
    }

    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") FloatBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 2);
    }

    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") DoubleBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 3);
    }

    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") PointerBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << MemoryStack.POINTER_SHIFT);
    }

    public static void nSDL_PushGPUFragmentUniformData(long command_buffer, int slot_index, long data, int length) {
        long __functionAddress = Functions.PushGPUFragmentUniformData;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        JNI.invokePPV(command_buffer, slot_index, data, length, __functionAddress);
    }

    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining());
    }

    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ShortBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 1);
    }

    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") IntBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 2);
    }

    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") LongBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 3);
    }

    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") FloatBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 2);
    }

    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") DoubleBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 3);
    }

    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") PointerBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << MemoryStack.POINTER_SHIFT);
    }

    public static void nSDL_PushGPUComputeUniformData(long command_buffer, int slot_index, long data, int length) {
        long __functionAddress = Functions.PushGPUComputeUniformData;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        JNI.invokePPV(command_buffer, slot_index, data, length, __functionAddress);
    }

    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining());
    }

    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ShortBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 1);
    }

    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") IntBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 2);
    }

    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") LongBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 3);
    }

    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") FloatBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 2);
    }

    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") DoubleBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << 3);
    }

    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") PointerBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, MemoryUtil.memAddress(data), data.remaining() << MemoryStack.POINTER_SHIFT);
    }

    public static long nSDL_BeginGPURenderPass(long command_buffer, long color_target_infos, int num_color_targets, long depth_stencil_target_info) {
        long __functionAddress = Functions.BeginGPURenderPass;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
            if (color_target_infos != 0) {
                Struct.validate(color_target_infos, num_color_targets, SDL_GPUColorTargetInfo.SIZEOF, SDL_GPUColorTargetInfo::validate);
            }
            if (depth_stencil_target_info != 0) {
                SDL_GPUDepthStencilTargetInfo.validate(depth_stencil_target_info);
            }
        }
        return JNI.invokePPPP(command_buffer, color_target_infos, num_color_targets, depth_stencil_target_info, __functionAddress);
    }

    @NativeType("SDL_GPURenderPass *")
    public static long SDL_BeginGPURenderPass(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUColorTargetInfo const *") SDL_GPUColorTargetInfo.Buffer color_target_infos, @NativeType("SDL_GPUDepthStencilTargetInfo const *") SDL_GPUDepthStencilTargetInfo depth_stencil_target_info) {
        return nSDL_BeginGPURenderPass(command_buffer, MemoryUtil.memAddressSafe(color_target_infos), Checks.remainingSafe(color_target_infos), MemoryUtil.memAddressSafe(depth_stencil_target_info));
    }

    public static void SDL_BindGPUGraphicsPipeline(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUGraphicsPipeline *") long graphics_pipeline) {
        long __functionAddress = Functions.BindGPUGraphicsPipeline;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
            Checks.check(graphics_pipeline);
        }
        JNI.invokePPV(render_pass, graphics_pipeline, __functionAddress);
    }

    public static void nSDL_SetGPUViewport(long render_pass, long viewport) {
        long __functionAddress = Functions.SetGPUViewport;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePPV(render_pass, viewport, __functionAddress);
    }

    public static void SDL_SetGPUViewport(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUViewport const *") SDL_GPUViewport viewport) {
        nSDL_SetGPUViewport(render_pass, viewport.address());
    }

    public static void nSDL_SetGPUScissor(long render_pass, long scissor) {
        long __functionAddress = Functions.SetGPUScissor;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePPV(render_pass, scissor, __functionAddress);
    }

    public static void SDL_SetGPUScissor(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_Rect const *") SDL_Rect scissor) {
        nSDL_SetGPUScissor(render_pass, scissor.address());
    }

    public static void nSDL_SetGPUBlendConstants(long render_pass, long blend_constants) {
        long __functionAddress = Functions.SetGPUBlendConstants;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(MemoryStack.POINTER_SIZE, MemoryStack.POINTER_SIZE * 2);
            MemoryUtil.memPutAddress(arguments, stack.npointer(render_pass));
            MemoryUtil.memPutAddress(arguments + MemoryStack.POINTER_SIZE, blend_constants);
            LibFFI.nffi_call(SDL_SetGPUBlendConstantsCIF.address(), __functionAddress, 0L, arguments);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_SetGPUBlendConstants(@NativeType("SDL_GPURenderPass *") long render_pass, SDL_FColor blend_constants) {
        nSDL_SetGPUBlendConstants(render_pass, blend_constants.address());
    }

    public static void SDL_SetGPUStencilReference(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint8") byte reference) {
        long __functionAddress = Functions.SetGPUStencilReference;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePUV(render_pass, reference, __functionAddress);
    }

    public static void nSDL_BindGPUVertexBuffers(long render_pass, int first_slot, long bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexBuffers;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
            if (bindings != 0) {
                Struct.validate(bindings, num_bindings, SDL_GPUBufferBinding.SIZEOF, SDL_GPUBufferBinding::validate);
            }
        }
        JNI.invokePPV(render_pass, first_slot, bindings, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUVertexBuffers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBufferBinding const *") SDL_GPUBufferBinding.Buffer bindings) {
        nSDL_BindGPUVertexBuffers(render_pass, first_slot, MemoryUtil.memAddressSafe(bindings), Checks.remainingSafe(bindings));
    }

    public static void nSDL_BindGPUIndexBuffer(long render_pass, long binding, int index_element_size) {
        long __functionAddress = Functions.BindGPUIndexBuffer;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
            SDL_GPUBufferBinding.validate(binding);
        }
        JNI.invokePPV(render_pass, binding, index_element_size, __functionAddress);
    }

    public static void SDL_BindGPUIndexBuffer(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUBufferBinding const *") SDL_GPUBufferBinding binding, @NativeType("SDL_GPUIndexElementSize") int index_element_size) {
        nSDL_BindGPUIndexBuffer(render_pass, binding.address(), index_element_size);
    }

    public static void nSDL_BindGPUVertexSamplers(long render_pass, int first_slot, long texture_sampler_bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexSamplers;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
            if (texture_sampler_bindings != 0) {
                Struct.validate(texture_sampler_bindings, num_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate);
            }
        }
        JNI.invokePPV(render_pass, first_slot, texture_sampler_bindings, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUVertexSamplers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.Buffer texture_sampler_bindings) {
        nSDL_BindGPUVertexSamplers(render_pass, first_slot, MemoryUtil.memAddressSafe(texture_sampler_bindings), Checks.remainingSafe(texture_sampler_bindings));
    }

    public static void nSDL_BindGPUVertexStorageTextures(long render_pass, int first_slot, long storage_textures, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexStorageTextures;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePPV(render_pass, first_slot, storage_textures, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUVertexStorageTextures(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTexture * const *") PointerBuffer storage_textures) {
        nSDL_BindGPUVertexStorageTextures(render_pass, first_slot, MemoryUtil.memAddressSafe(storage_textures), Checks.remainingSafe(storage_textures));
    }

    public static void nSDL_BindGPUVertexStorageBuffers(long render_pass, int first_slot, long storage_buffers, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexStorageBuffers;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePPV(render_pass, first_slot, storage_buffers, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUVertexStorageBuffers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBuffer * const *") PointerBuffer storage_buffers) {
        nSDL_BindGPUVertexStorageBuffers(render_pass, first_slot, MemoryUtil.memAddressSafe(storage_buffers), Checks.remainingSafe(storage_buffers));
    }

    public static void nSDL_BindGPUFragmentSamplers(long render_pass, int first_slot, long texture_sampler_bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUFragmentSamplers;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
            if (texture_sampler_bindings != 0) {
                Struct.validate(texture_sampler_bindings, num_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate);
            }
        }
        JNI.invokePPV(render_pass, first_slot, texture_sampler_bindings, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUFragmentSamplers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.Buffer texture_sampler_bindings) {
        nSDL_BindGPUFragmentSamplers(render_pass, first_slot, MemoryUtil.memAddressSafe(texture_sampler_bindings), Checks.remainingSafe(texture_sampler_bindings));
    }

    public static void nSDL_BindGPUFragmentStorageTextures(long render_pass, int first_slot, long storage_textures, int num_bindings) {
        long __functionAddress = Functions.BindGPUFragmentStorageTextures;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePPV(render_pass, first_slot, storage_textures, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUFragmentStorageTextures(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTexture * const *") PointerBuffer storage_textures) {
        nSDL_BindGPUFragmentStorageTextures(render_pass, first_slot, MemoryUtil.memAddressSafe(storage_textures), Checks.remainingSafe(storage_textures));
    }

    public static void nSDL_BindGPUFragmentStorageBuffers(long render_pass, int first_slot, long storage_buffers, int num_bindings) {
        long __functionAddress = Functions.BindGPUFragmentStorageBuffers;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePPV(render_pass, first_slot, storage_buffers, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUFragmentStorageBuffers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBuffer * const *") PointerBuffer storage_buffers) {
        nSDL_BindGPUFragmentStorageBuffers(render_pass, first_slot, MemoryUtil.memAddressSafe(storage_buffers), Checks.remainingSafe(storage_buffers));
    }

    public static void SDL_DrawGPUIndexedPrimitives(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int num_indices, @NativeType("Uint32") int num_instances, @NativeType("Uint32") int first_index, @NativeType("Sint32") int vertex_offset, @NativeType("Uint32") int first_instance) {
        long __functionAddress = Functions.DrawGPUIndexedPrimitives;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePV(render_pass, num_indices, num_instances, first_index, vertex_offset, first_instance, __functionAddress);
    }

    public static void SDL_DrawGPUPrimitives(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int num_vertices, @NativeType("Uint32") int num_instances, @NativeType("Uint32") int first_vertex, @NativeType("Uint32") int first_instance) {
        long __functionAddress = Functions.DrawGPUPrimitives;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePV(render_pass, num_vertices, num_instances, first_vertex, first_instance, __functionAddress);
    }

    public static void SDL_DrawGPUPrimitivesIndirect(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("Uint32") int offset, @NativeType("Uint32") int draw_count) {
        long __functionAddress = Functions.DrawGPUPrimitivesIndirect;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
            Checks.check(buffer);
        }
        JNI.invokePPV(render_pass, buffer, offset, draw_count, __functionAddress);
    }

    public static void SDL_DrawGPUIndexedPrimitivesIndirect(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("Uint32") int offset, @NativeType("Uint32") int draw_count) {
        long __functionAddress = Functions.DrawGPUIndexedPrimitivesIndirect;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
            Checks.check(buffer);
        }
        JNI.invokePPV(render_pass, buffer, offset, draw_count, __functionAddress);
    }

    public static void SDL_EndGPURenderPass(@NativeType("SDL_GPURenderPass *") long render_pass) {
        long __functionAddress = Functions.EndGPURenderPass;
        if (Checks.CHECKS) {
            Checks.check(render_pass);
        }
        JNI.invokePV(render_pass, __functionAddress);
    }

    public static long nSDL_BeginGPUComputePass(long command_buffer, long storage_texture_bindings, int num_storage_texture_bindings, long storage_buffer_bindings, int num_storage_buffer_bindings) {
        long __functionAddress = Functions.BeginGPUComputePass;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
            if (storage_texture_bindings != 0) {
                Struct.validate(storage_texture_bindings, num_storage_texture_bindings, SDL_GPUStorageTextureReadWriteBinding.SIZEOF, SDL_GPUStorageTextureReadWriteBinding::validate);
            }
            if (storage_buffer_bindings != 0) {
                Struct.validate(storage_buffer_bindings, num_storage_buffer_bindings, SDL_GPUStorageBufferReadWriteBinding.SIZEOF, SDL_GPUStorageBufferReadWriteBinding::validate);
            }
        }
        return JNI.invokePPPP(command_buffer, storage_texture_bindings, num_storage_texture_bindings, storage_buffer_bindings, num_storage_buffer_bindings, __functionAddress);
    }

    @NativeType("SDL_GPUComputePass *")
    public static long SDL_BeginGPUComputePass(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUStorageTextureReadWriteBinding const *") SDL_GPUStorageTextureReadWriteBinding.Buffer storage_texture_bindings, @NativeType("SDL_GPUStorageBufferReadWriteBinding const *") SDL_GPUStorageBufferReadWriteBinding.Buffer storage_buffer_bindings) {
        return nSDL_BeginGPUComputePass(command_buffer, MemoryUtil.memAddressSafe(storage_texture_bindings), Checks.remainingSafe(storage_texture_bindings), MemoryUtil.memAddressSafe(storage_buffer_bindings), Checks.remainingSafe(storage_buffer_bindings));
    }

    public static void SDL_BindGPUComputePipeline(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("SDL_GPUComputePipeline *") long compute_pipeline) {
        long __functionAddress = Functions.BindGPUComputePipeline;
        if (Checks.CHECKS) {
            Checks.check(compute_pass);
            Checks.check(compute_pipeline);
        }
        JNI.invokePPV(compute_pass, compute_pipeline, __functionAddress);
    }

    public static void nSDL_BindGPUComputeSamplers(long compute_pass, int first_slot, long texture_sampler_bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUComputeSamplers;
        if (Checks.CHECKS) {
            Checks.check(compute_pass);
            if (texture_sampler_bindings != 0) {
                Struct.validate(texture_sampler_bindings, num_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate);
            }
        }
        JNI.invokePPV(compute_pass, first_slot, texture_sampler_bindings, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUComputeSamplers(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.Buffer texture_sampler_bindings) {
        nSDL_BindGPUComputeSamplers(compute_pass, first_slot, MemoryUtil.memAddressSafe(texture_sampler_bindings), Checks.remainingSafe(texture_sampler_bindings));
    }

    public static void nSDL_BindGPUComputeStorageTextures(long compute_pass, int first_slot, long storage_textures, int num_bindings) {
        long __functionAddress = Functions.BindGPUComputeStorageTextures;
        if (Checks.CHECKS) {
            Checks.check(compute_pass);
        }
        JNI.invokePPV(compute_pass, first_slot, storage_textures, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUComputeStorageTextures(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTexture * const *") PointerBuffer storage_textures) {
        nSDL_BindGPUComputeStorageTextures(compute_pass, first_slot, MemoryUtil.memAddressSafe(storage_textures), Checks.remainingSafe(storage_textures));
    }

    public static void nSDL_BindGPUComputeStorageBuffers(long compute_pass, int first_slot, long storage_buffers, int num_bindings) {
        long __functionAddress = Functions.BindGPUComputeStorageBuffers;
        if (Checks.CHECKS) {
            Checks.check(compute_pass);
        }
        JNI.invokePPV(compute_pass, first_slot, storage_buffers, num_bindings, __functionAddress);
    }

    public static void SDL_BindGPUComputeStorageBuffers(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBuffer * const *") PointerBuffer storage_buffers) {
        nSDL_BindGPUComputeStorageBuffers(compute_pass, first_slot, MemoryUtil.memAddressSafe(storage_buffers), Checks.remainingSafe(storage_buffers));
    }

    public static void SDL_DispatchGPUCompute(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int groupcount_x, @NativeType("Uint32") int groupcount_y, @NativeType("Uint32") int groupcount_z) {
        long __functionAddress = Functions.DispatchGPUCompute;
        if (Checks.CHECKS) {
            Checks.check(compute_pass);
        }
        JNI.invokePV(compute_pass, groupcount_x, groupcount_y, groupcount_z, __functionAddress);
    }

    public static void SDL_DispatchGPUComputeIndirect(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("Uint32") int offset) {
        long __functionAddress = Functions.DispatchGPUComputeIndirect;
        if (Checks.CHECKS) {
            Checks.check(compute_pass);
            Checks.check(buffer);
        }
        JNI.invokePPV(compute_pass, buffer, offset, __functionAddress);
    }

    public static void SDL_EndGPUComputePass(@NativeType("SDL_GPUComputePass *") long compute_pass) {
        long __functionAddress = Functions.EndGPUComputePass;
        if (Checks.CHECKS) {
            Checks.check(compute_pass);
        }
        JNI.invokePV(compute_pass, __functionAddress);
    }

    public static long nSDL_MapGPUTransferBuffer(long device, long transfer_buffer, boolean cycle) {
        long __functionAddress = Functions.MapGPUTransferBuffer;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(transfer_buffer);
        }
        return JNI.invokePPP(device, transfer_buffer, cycle, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_MapGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBuffer *") long transfer_buffer, @NativeType("bool") boolean cycle, @NativeType("size_t") long buffer_size) {
        long __result = nSDL_MapGPUTransferBuffer(device, transfer_buffer, cycle);
        return MemoryUtil.memByteBufferSafe(__result, (int) buffer_size);
    }

    public static void SDL_UnmapGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBuffer *") long transfer_buffer) {
        long __functionAddress = Functions.UnmapGPUTransferBuffer;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(transfer_buffer);
        }
        JNI.invokePPV(device, transfer_buffer, __functionAddress);
    }

    @NativeType("SDL_GPUCopyPass *")
    public static long SDL_BeginGPUCopyPass(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.BeginGPUCopyPass;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        return JNI.invokePP(command_buffer, __functionAddress);
    }

    public static void nSDL_UploadToGPUTexture(long copy_pass, long source, long destination, boolean cycle) {
        long __functionAddress = Functions.UploadToGPUTexture;
        if (Checks.CHECKS) {
            Checks.check(copy_pass);
            SDL_GPUTextureTransferInfo.validate(source);
            SDL_GPUTextureRegion.validate(destination);
        }
        JNI.invokePPPV(copy_pass, source, destination, cycle, __functionAddress);
    }

    public static void SDL_UploadToGPUTexture(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTextureTransferInfo const *") SDL_GPUTextureTransferInfo source, @NativeType("SDL_GPUTextureRegion const *") SDL_GPUTextureRegion destination, @NativeType("bool") boolean cycle) {
        nSDL_UploadToGPUTexture(copy_pass, source.address(), destination.address(), cycle);
    }

    public static void nSDL_UploadToGPUBuffer(long copy_pass, long source, long destination, boolean cycle) {
        long __functionAddress = Functions.UploadToGPUBuffer;
        if (Checks.CHECKS) {
            Checks.check(copy_pass);
            SDL_GPUTransferBufferLocation.validate(source);
            SDL_GPUBufferRegion.validate(destination);
        }
        JNI.invokePPPV(copy_pass, source, destination, cycle, __functionAddress);
    }

    public static void SDL_UploadToGPUBuffer(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTransferBufferLocation const *") SDL_GPUTransferBufferLocation source, @NativeType("SDL_GPUBufferRegion const *") SDL_GPUBufferRegion destination, @NativeType("bool") boolean cycle) {
        nSDL_UploadToGPUBuffer(copy_pass, source.address(), destination.address(), cycle);
    }

    public static void nSDL_CopyGPUTextureToTexture(long copy_pass, long source, long destination, int w, int h, int d, boolean cycle) {
        long __functionAddress = Functions.CopyGPUTextureToTexture;
        if (Checks.CHECKS) {
            Checks.check(copy_pass);
            SDL_GPUTextureLocation.validate(source);
            SDL_GPUTextureLocation.validate(destination);
        }
        JNI.invokePPPV(copy_pass, source, destination, w, h, d, cycle, __functionAddress);
    }

    public static void SDL_CopyGPUTextureToTexture(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTextureLocation const *") SDL_GPUTextureLocation source, @NativeType("SDL_GPUTextureLocation const *") SDL_GPUTextureLocation destination, @NativeType("Uint32") int w, @NativeType("Uint32") int h, @NativeType("Uint32") int d, @NativeType("bool") boolean cycle) {
        nSDL_CopyGPUTextureToTexture(copy_pass, source.address(), destination.address(), w, h, d, cycle);
    }

    public static void nSDL_CopyGPUBufferToBuffer(long copy_pass, long source, long destination, int size, boolean cycle) {
        long __functionAddress = Functions.CopyGPUBufferToBuffer;
        if (Checks.CHECKS) {
            Checks.check(copy_pass);
            SDL_GPUBufferLocation.validate(source);
            SDL_GPUBufferLocation.validate(destination);
        }
        JNI.invokePPPV(copy_pass, source, destination, size, cycle, __functionAddress);
    }

    public static void SDL_CopyGPUBufferToBuffer(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUBufferLocation const *") SDL_GPUBufferLocation source, @NativeType("SDL_GPUBufferLocation const *") SDL_GPUBufferLocation destination, @NativeType("Uint32") int size, @NativeType("bool") boolean cycle) {
        nSDL_CopyGPUBufferToBuffer(copy_pass, source.address(), destination.address(), size, cycle);
    }

    public static void nSDL_DownloadFromGPUTexture(long copy_pass, long source, long destination) {
        long __functionAddress = Functions.DownloadFromGPUTexture;
        if (Checks.CHECKS) {
            Checks.check(copy_pass);
            SDL_GPUTextureRegion.validate(source);
            SDL_GPUTextureTransferInfo.validate(destination);
        }
        JNI.invokePPPV(copy_pass, source, destination, __functionAddress);
    }

    public static void SDL_DownloadFromGPUTexture(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTextureRegion const *") SDL_GPUTextureRegion source, @NativeType("SDL_GPUTextureTransferInfo const *") SDL_GPUTextureTransferInfo destination) {
        nSDL_DownloadFromGPUTexture(copy_pass, source.address(), destination.address());
    }

    public static void nSDL_DownloadFromGPUBuffer(long copy_pass, long source, long destination) {
        long __functionAddress = Functions.DownloadFromGPUBuffer;
        if (Checks.CHECKS) {
            Checks.check(copy_pass);
            SDL_GPUBufferRegion.validate(source);
            SDL_GPUTransferBufferLocation.validate(destination);
        }
        JNI.invokePPPV(copy_pass, source, destination, __functionAddress);
    }

    public static void SDL_DownloadFromGPUBuffer(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUBufferRegion const *") SDL_GPUBufferRegion source, @NativeType("SDL_GPUTransferBufferLocation const *") SDL_GPUTransferBufferLocation destination) {
        nSDL_DownloadFromGPUBuffer(copy_pass, source.address(), destination.address());
    }

    public static void SDL_EndGPUCopyPass(@NativeType("SDL_GPUCopyPass *") long copy_pass) {
        long __functionAddress = Functions.EndGPUCopyPass;
        if (Checks.CHECKS) {
            Checks.check(copy_pass);
        }
        JNI.invokePV(copy_pass, __functionAddress);
    }

    public static void SDL_GenerateMipmapsForGPUTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUTexture *") long texture) {
        long __functionAddress = Functions.GenerateMipmapsForGPUTexture;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
            Checks.check(texture);
        }
        JNI.invokePPV(command_buffer, texture, __functionAddress);
    }

    public static void nSDL_BlitGPUTexture(long command_buffer, long info) {
        long __functionAddress = Functions.BlitGPUTexture;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
            SDL_GPUBlitInfo.validate(info);
        }
        JNI.invokePPV(command_buffer, info, __functionAddress);
    }

    public static void SDL_BlitGPUTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUBlitInfo const *") SDL_GPUBlitInfo info) {
        nSDL_BlitGPUTexture(command_buffer, info.address());
    }

    @NativeType("bool")
    public static boolean SDL_WindowSupportsGPUSwapchainComposition(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUSwapchainComposition") int swapchain_composition) {
        long __functionAddress = Functions.WindowSupportsGPUSwapchainComposition;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(window);
        }
        return JNI.invokePPZ(device, window, swapchain_composition, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WindowSupportsGPUPresentMode(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUPresentMode") int present_mode) {
        long __functionAddress = Functions.WindowSupportsGPUPresentMode;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(window);
        }
        return JNI.invokePPZ(device, window, present_mode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ClaimWindowForGPUDevice(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ClaimWindowForGPUDevice;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(window);
        }
        return JNI.invokePPZ(device, window, __functionAddress);
    }

    public static void SDL_ReleaseWindowFromGPUDevice(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ReleaseWindowFromGPUDevice;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(window);
        }
        JNI.invokePPV(device, window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetGPUSwapchainParameters(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUSwapchainComposition") int swapchain_composition, @NativeType("SDL_GPUPresentMode") int present_mode) {
        long __functionAddress = Functions.SetGPUSwapchainParameters;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(window);
        }
        return JNI.invokePPZ(device, window, swapchain_composition, present_mode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetGPUAllowedFramesInFlight(@NativeType("SDL_GPUDevice *") long device, @NativeType("Uint32") int allowed_frames_in_flight) {
        long __functionAddress = Functions.SetGPUAllowedFramesInFlight;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePZ(device, allowed_frames_in_flight, __functionAddress);
    }

    @NativeType("SDL_GPUTextureFormat")
    public static int SDL_GetGPUSwapchainTextureFormat(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetGPUSwapchainTextureFormat;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(window);
        }
        return JNI.invokePPI(device, window, __functionAddress);
    }

    public static boolean nSDL_AcquireGPUSwapchainTexture(long command_buffer, long window, long swapchain_texture, long swapchain_texture_width, long swapchain_texture_height) {
        long __functionAddress = Functions.AcquireGPUSwapchainTexture;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
            Checks.check(window);
        }
        return JNI.invokePPPPPZ(command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_AcquireGPUSwapchainTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUTexture **") PointerBuffer swapchain_texture, @NativeType("Uint32 *") IntBuffer swapchain_texture_width, @NativeType("Uint32 *") IntBuffer swapchain_texture_height) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) swapchain_texture, 1);
            Checks.checkSafe((Buffer) swapchain_texture_width, 1);
            Checks.checkSafe((Buffer) swapchain_texture_height, 1);
        }
        return nSDL_AcquireGPUSwapchainTexture(command_buffer, window, MemoryUtil.memAddress(swapchain_texture), MemoryUtil.memAddressSafe(swapchain_texture_width), MemoryUtil.memAddressSafe(swapchain_texture_height));
    }

    @NativeType("bool")
    public static boolean SDL_WaitForGPUSwapchain(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.WaitForGPUSwapchain;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(window);
        }
        return JNI.invokePPZ(device, window, __functionAddress);
    }

    public static boolean nSDL_WaitAndAcquireGPUSwapchainTexture(long command_buffer, long window, long swapchain_texture, long swapchain_texture_width, long swapchain_texture_height) {
        long __functionAddress = Functions.WaitAndAcquireGPUSwapchainTexture;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
            Checks.check(window);
        }
        return JNI.invokePPPPPZ(command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WaitAndAcquireGPUSwapchainTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUTexture **") PointerBuffer swapchain_texture, @NativeType("Uint32 *") IntBuffer swapchain_texture_width, @NativeType("Uint32 *") IntBuffer swapchain_texture_height) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) swapchain_texture, 1);
            Checks.checkSafe((Buffer) swapchain_texture_width, 1);
            Checks.checkSafe((Buffer) swapchain_texture_height, 1);
        }
        return nSDL_WaitAndAcquireGPUSwapchainTexture(command_buffer, window, MemoryUtil.memAddress(swapchain_texture), MemoryUtil.memAddressSafe(swapchain_texture_width), MemoryUtil.memAddressSafe(swapchain_texture_height));
    }

    @NativeType("bool")
    public static boolean SDL_SubmitGPUCommandBuffer(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.SubmitGPUCommandBuffer;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        return JNI.invokePZ(command_buffer, __functionAddress);
    }

    @NativeType("SDL_GPUFence *")
    public static long SDL_SubmitGPUCommandBufferAndAcquireFence(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.SubmitGPUCommandBufferAndAcquireFence;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        return JNI.invokePP(command_buffer, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_CancelGPUCommandBuffer(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.CancelGPUCommandBuffer;
        if (Checks.CHECKS) {
            Checks.check(command_buffer);
        }
        return JNI.invokePZ(command_buffer, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WaitForGPUIdle(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.WaitForGPUIdle;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePZ(device, __functionAddress);
    }

    public static boolean nSDL_WaitForGPUFences(long device, boolean wait_all, long fences, int num_fences) {
        long __functionAddress = Functions.WaitForGPUFences;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePPZ(device, wait_all, fences, num_fences, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WaitForGPUFences(@NativeType("SDL_GPUDevice *") long device, @NativeType("bool") boolean wait_all, @NativeType("SDL_GPUFence * const *") PointerBuffer fences) {
        return nSDL_WaitForGPUFences(device, wait_all, MemoryUtil.memAddressSafe(fences), Checks.remainingSafe(fences));
    }

    @NativeType("bool")
    public static boolean SDL_QueryGPUFence(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUFence *") long fence) {
        long __functionAddress = Functions.QueryGPUFence;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(fence);
        }
        return JNI.invokePPZ(device, fence, __functionAddress);
    }

    public static void SDL_ReleaseGPUFence(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUFence *") long fence) {
        long __functionAddress = Functions.ReleaseGPUFence;
        if (Checks.CHECKS) {
            Checks.check(device);
            Checks.check(fence);
        }
        JNI.invokePPV(device, fence, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_GPUTextureFormatTexelBlockSize(@NativeType("SDL_GPUTextureFormat") int format) {
        long __functionAddress = Functions.GPUTextureFormatTexelBlockSize;
        return JNI.invokeI(format, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GPUTextureSupportsFormat(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTextureFormat") int format, @NativeType("SDL_GPUTextureType") int type, @NativeType("SDL_GPUTextureUsageFlags") int usage) {
        long __functionAddress = Functions.GPUTextureSupportsFormat;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePZ(device, format, type, usage, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GPUTextureSupportsSampleCount(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTextureFormat") int format, @NativeType("SDL_GPUSampleCount") int sample_count) {
        long __functionAddress = Functions.GPUTextureSupportsSampleCount;
        if (Checks.CHECKS) {
            Checks.check(device);
        }
        return JNI.invokePZ(device, format, sample_count, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_CalculateGPUTextureFormatSize(@NativeType("SDL_GPUTextureFormat") int format, @NativeType("Uint32") int width, @NativeType("Uint32") int height, @NativeType("Uint32") int depth_or_layer_count) {
        long __functionAddress = Functions.CalculateGPUTextureFormatSize;
        return JNI.invokeI(format, width, height, depth_or_layer_count, __functionAddress);
    }

    @NativeType("SDL_PixelFormat")
    public static int SDL_GetPixelFormatFromGPUTextureFormat(@NativeType("SDL_GPUTextureFormat") int format) {
        long __functionAddress = Functions.GetPixelFormatFromGPUTextureFormat;
        return JNI.invokeI(format, __functionAddress);
    }

    @NativeType("SDL_GPUTextureFormat")
    public static int SDL_GetGPUTextureFormatFromPixelFormat(@NativeType("SDL_PixelFormat") int format) {
        long __functionAddress = Functions.GetGPUTextureFormatFromPixelFormat;
        return JNI.invokeI(format, __functionAddress);
    }
}
