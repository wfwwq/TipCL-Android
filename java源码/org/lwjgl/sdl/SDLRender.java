package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.sdl.SDL_FColor;
import org.lwjgl.sdl.SDL_FPoint;
import org.lwjgl.sdl.SDL_FRect;
import org.lwjgl.sdl.SDL_Vertex;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLRender.class */
public class SDLRender {
    public static final String SDL_SOFTWARE_RENDERER = "software";
    public static final String SDL_GPU_RENDERER = "gpu";
    public static final int SDL_TEXTUREACCESS_STATIC = 0;
    public static final int SDL_TEXTUREACCESS_STREAMING = 1;
    public static final int SDL_TEXTUREACCESS_TARGET = 2;
    public static final int SDL_TEXTURE_ADDRESS_INVALID = -1;
    public static final int SDL_TEXTURE_ADDRESS_AUTO = 0;
    public static final int SDL_TEXTURE_ADDRESS_CLAMP = 1;
    public static final int SDL_TEXTURE_ADDRESS_WRAP = 2;
    public static final int SDL_LOGICAL_PRESENTATION_DISABLED = 0;
    public static final int SDL_LOGICAL_PRESENTATION_STRETCH = 1;
    public static final int SDL_LOGICAL_PRESENTATION_LETTERBOX = 2;
    public static final int SDL_LOGICAL_PRESENTATION_OVERSCAN = 3;
    public static final int SDL_LOGICAL_PRESENTATION_INTEGER_SCALE = 4;
    public static final String SDL_PROP_RENDERER_CREATE_NAME_STRING = "SDL.renderer.create.name";
    public static final String SDL_PROP_RENDERER_CREATE_WINDOW_POINTER = "SDL.renderer.create.window";
    public static final String SDL_PROP_RENDERER_CREATE_SURFACE_POINTER = "SDL.renderer.create.surface";
    public static final String SDL_PROP_RENDERER_CREATE_OUTPUT_COLORSPACE_NUMBER = "SDL.renderer.create.output_colorspace";
    public static final String SDL_PROP_RENDERER_CREATE_PRESENT_VSYNC_NUMBER = "SDL.renderer.create.present_vsync";
    public static final String SDL_PROP_RENDERER_CREATE_GPU_DEVICE_POINTER = "SDL.renderer.create.gpu.device";
    public static final String SDL_PROP_RENDERER_CREATE_GPU_SHADERS_SPIRV_BOOLEAN = "SDL.renderer.create.gpu.shaders_spirv";
    public static final String SDL_PROP_RENDERER_CREATE_GPU_SHADERS_DXIL_BOOLEAN = "SDL.renderer.create.gpu.shaders_dxil";
    public static final String SDL_PROP_RENDERER_CREATE_GPU_SHADERS_MSL_BOOLEAN = "SDL.renderer.create.gpu.shaders_msl";
    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_INSTANCE_POINTER = "SDL.renderer.create.vulkan.instance";
    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_SURFACE_NUMBER = "SDL.renderer.create.vulkan.surface";
    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_PHYSICAL_DEVICE_POINTER = "SDL.renderer.create.vulkan.physical_device";
    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_DEVICE_POINTER = "SDL.renderer.create.vulkan.device";
    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.create.vulkan.graphics_queue_family_index";
    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.create.vulkan.present_queue_family_index";
    public static final String SDL_PROP_RENDERER_NAME_STRING = "SDL.renderer.name";
    public static final String SDL_PROP_RENDERER_WINDOW_POINTER = "SDL.renderer.window";
    public static final String SDL_PROP_RENDERER_SURFACE_POINTER = "SDL.renderer.surface";
    public static final String SDL_PROP_RENDERER_VSYNC_NUMBER = "SDL.renderer.vsync";
    public static final String SDL_PROP_RENDERER_MAX_TEXTURE_SIZE_NUMBER = "SDL.renderer.max_texture_size";
    public static final String SDL_PROP_RENDERER_TEXTURE_FORMATS_POINTER = "SDL.renderer.texture_formats";
    public static final String SDL_PROP_RENDERER_TEXTURE_WRAPPING_BOOLEAN = "SDL.renderer.texture_wrapping";
    public static final String SDL_PROP_RENDERER_OUTPUT_COLORSPACE_NUMBER = "SDL.renderer.output_colorspace";
    public static final String SDL_PROP_RENDERER_HDR_ENABLED_BOOLEAN = "SDL.renderer.HDR_enabled";
    public static final String SDL_PROP_RENDERER_SDR_WHITE_POINT_FLOAT = "SDL.renderer.SDR_white_point";
    public static final String SDL_PROP_RENDERER_HDR_HEADROOM_FLOAT = "SDL.renderer.HDR_headroom";
    public static final String SDL_PROP_RENDERER_D3D9_DEVICE_POINTER = "SDL.renderer.d3d9.device";
    public static final String SDL_PROP_RENDERER_D3D11_DEVICE_POINTER = "SDL.renderer.d3d11.device";
    public static final String SDL_PROP_RENDERER_D3D11_SWAPCHAIN_POINTER = "SDL.renderer.d3d11.swap_chain";
    public static final String SDL_PROP_RENDERER_D3D12_DEVICE_POINTER = "SDL.renderer.d3d12.device";
    public static final String SDL_PROP_RENDERER_D3D12_SWAPCHAIN_POINTER = "SDL.renderer.d3d12.swap_chain";
    public static final String SDL_PROP_RENDERER_D3D12_COMMAND_QUEUE_POINTER = "SDL.renderer.d3d12.command_queue";
    public static final String SDL_PROP_RENDERER_VULKAN_INSTANCE_POINTER = "SDL.renderer.vulkan.instance";
    public static final String SDL_PROP_RENDERER_VULKAN_SURFACE_NUMBER = "SDL.renderer.vulkan.surface";
    public static final String SDL_PROP_RENDERER_VULKAN_PHYSICAL_DEVICE_POINTER = "SDL.renderer.vulkan.physical_device";
    public static final String SDL_PROP_RENDERER_VULKAN_DEVICE_POINTER = "SDL.renderer.vulkan.device";
    public static final String SDL_PROP_RENDERER_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.vulkan.graphics_queue_family_index";
    public static final String SDL_PROP_RENDERER_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.vulkan.present_queue_family_index";
    public static final String SDL_PROP_RENDERER_VULKAN_SWAPCHAIN_IMAGE_COUNT_NUMBER = "SDL.renderer.vulkan.swapchain_image_count";
    public static final String SDL_PROP_RENDERER_GPU_DEVICE_POINTER = "SDL.renderer.gpu.device";
    public static final String SDL_PROP_TEXTURE_CREATE_COLORSPACE_NUMBER = "SDL.texture.create.colorspace";
    public static final String SDL_PROP_TEXTURE_CREATE_FORMAT_NUMBER = "SDL.texture.create.format";
    public static final String SDL_PROP_TEXTURE_CREATE_ACCESS_NUMBER = "SDL.texture.create.access";
    public static final String SDL_PROP_TEXTURE_CREATE_WIDTH_NUMBER = "SDL.texture.create.width";
    public static final String SDL_PROP_TEXTURE_CREATE_HEIGHT_NUMBER = "SDL.texture.create.height";
    public static final String SDL_PROP_TEXTURE_CREATE_PALETTE_POINTER = "SDL.texture.create.palette";
    public static final String SDL_PROP_TEXTURE_CREATE_SDR_WHITE_POINT_FLOAT = "SDL.texture.create.SDR_white_point";
    public static final String SDL_PROP_TEXTURE_CREATE_HDR_HEADROOM_FLOAT = "SDL.texture.create.HDR_headroom";
    public static final String SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_POINTER = "SDL.texture.create.d3d11.texture";
    public static final String SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_U_POINTER = "SDL.texture.create.d3d11.texture_u";
    public static final String SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_V_POINTER = "SDL.texture.create.d3d11.texture_v";
    public static final String SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_POINTER = "SDL.texture.create.d3d12.texture";
    public static final String SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_U_POINTER = "SDL.texture.create.d3d12.texture_u";
    public static final String SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_V_POINTER = "SDL.texture.create.d3d12.texture_v";
    public static final String SDL_PROP_TEXTURE_CREATE_METAL_PIXELBUFFER_POINTER = "SDL.texture.create.metal.pixelbuffer";
    public static final String SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_NUMBER = "SDL.texture.create.opengl.texture";
    public static final String SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_UV_NUMBER = "SDL.texture.create.opengl.texture_uv";
    public static final String SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_U_NUMBER = "SDL.texture.create.opengl.texture_u";
    public static final String SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_V_NUMBER = "SDL.texture.create.opengl.texture_v";
    public static final String SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_NUMBER = "SDL.texture.create.opengles2.texture";
    public static final String SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_UV_NUMBER = "SDL.texture.create.opengles2.texture_uv";
    public static final String SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_U_NUMBER = "SDL.texture.create.opengles2.texture_u";
    public static final String SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_V_NUMBER = "SDL.texture.create.opengles2.texture_v";
    public static final String SDL_PROP_TEXTURE_CREATE_VULKAN_TEXTURE_NUMBER = "SDL.texture.create.vulkan.texture";
    public static final String SDL_PROP_TEXTURE_CREATE_VULKAN_LAYOUT_NUMBER = "SDL.texture.create.vulkan.layout";
    public static final String SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_POINTER = "SDL.texture.create.gpu.texture";
    public static final String SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_UV_POINTER = "SDL.texture.create.gpu.texture_uv";
    public static final String SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_U_POINTER = "SDL.texture.create.gpu.texture_u";
    public static final String SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_V_POINTER = "SDL.texture.create.gpu.texture_v";
    public static final String SDL_PROP_TEXTURE_COLORSPACE_NUMBER = "SDL.texture.colorspace";
    public static final String SDL_PROP_TEXTURE_FORMAT_NUMBER = "SDL.texture.format";
    public static final String SDL_PROP_TEXTURE_ACCESS_NUMBER = "SDL.texture.access";
    public static final String SDL_PROP_TEXTURE_WIDTH_NUMBER = "SDL.texture.width";
    public static final String SDL_PROP_TEXTURE_HEIGHT_NUMBER = "SDL.texture.height";
    public static final String SDL_PROP_TEXTURE_SDR_WHITE_POINT_FLOAT = "SDL.texture.SDR_white_point";
    public static final String SDL_PROP_TEXTURE_HDR_HEADROOM_FLOAT = "SDL.texture.HDR_headroom";
    public static final String SDL_PROP_TEXTURE_D3D11_TEXTURE_POINTER = "SDL.texture.d3d11.texture";
    public static final String SDL_PROP_TEXTURE_D3D11_TEXTURE_U_POINTER = "SDL.texture.d3d11.texture_u";
    public static final String SDL_PROP_TEXTURE_D3D11_TEXTURE_V_POINTER = "SDL.texture.d3d11.texture_v";
    public static final String SDL_PROP_TEXTURE_D3D12_TEXTURE_POINTER = "SDL.texture.d3d12.texture";
    public static final String SDL_PROP_TEXTURE_D3D12_TEXTURE_U_POINTER = "SDL.texture.d3d12.texture_u";
    public static final String SDL_PROP_TEXTURE_D3D12_TEXTURE_V_POINTER = "SDL.texture.d3d12.texture_v";
    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_NUMBER = "SDL.texture.opengl.texture";
    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_UV_NUMBER = "SDL.texture.opengl.texture_uv";
    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_U_NUMBER = "SDL.texture.opengl.texture_u";
    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_V_NUMBER = "SDL.texture.opengl.texture_v";
    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_TARGET_NUMBER = "SDL.texture.opengl.target";
    public static final String SDL_PROP_TEXTURE_OPENGL_TEX_W_FLOAT = "SDL.texture.opengl.tex_w";
    public static final String SDL_PROP_TEXTURE_OPENGL_TEX_H_FLOAT = "SDL.texture.opengl.tex_h";
    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_NUMBER = "SDL.texture.opengles2.texture";
    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_UV_NUMBER = "SDL.texture.opengles2.texture_uv";
    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_U_NUMBER = "SDL.texture.opengles2.texture_u";
    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_V_NUMBER = "SDL.texture.opengles2.texture_v";
    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_TARGET_NUMBER = "SDL.texture.opengles2.target";
    public static final String SDL_PROP_TEXTURE_VULKAN_TEXTURE_NUMBER = "SDL.texture.vulkan.texture";
    public static final String SDL_PROP_TEXTURE_GPU_TEXTURE_POINTER = "SDL.texture.gpu.texture";
    public static final String SDL_PROP_TEXTURE_GPU_TEXTURE_UV_POINTER = "SDL.texture.gpu.texture_uv";
    public static final String SDL_PROP_TEXTURE_GPU_TEXTURE_U_POINTER = "SDL.texture.gpu.texture_u";
    public static final String SDL_PROP_TEXTURE_GPU_TEXTURE_V_POINTER = "SDL.texture.gpu.texture_v";
    public static final int SDL_RENDERER_VSYNC_DISABLED = 0;
    public static final int SDL_RENDERER_VSYNC_ADAPTIVE = -1;
    public static final int SDL_DEBUG_TEXT_FONT_CHARACTER_SIZE = 8;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLRender$Functions.class */
    public static final class Functions {
        public static final long GetNumRenderDrivers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumRenderDrivers");
        public static final long GetRenderDriver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderDriver");
        public static final long CreateWindowAndRenderer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateWindowAndRenderer");
        public static final long CreateRenderer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateRenderer");
        public static final long CreateRendererWithProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateRendererWithProperties");
        public static final long CreateGPURenderer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPURenderer");
        public static final long GetGPURendererDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPURendererDevice");
        public static final long CreateSoftwareRenderer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateSoftwareRenderer");
        public static final long GetRenderer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderer");
        public static final long GetRenderWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderWindow");
        public static final long GetRendererName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRendererName");
        public static final long GetRendererProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRendererProperties");
        public static final long GetRenderOutputSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderOutputSize");
        public static final long GetCurrentRenderOutputSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentRenderOutputSize");
        public static final long CreateTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTexture");
        public static final long CreateTextureFromSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTextureFromSurface");
        public static final long CreateTextureWithProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTextureWithProperties");
        public static final long GetTextureProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureProperties");
        public static final long GetRendererFromTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRendererFromTexture");
        public static final long GetTextureSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureSize");
        public static final long SetTexturePalette = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTexturePalette");
        public static final long GetTexturePalette = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTexturePalette");
        public static final long SetTextureColorMod = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureColorMod");
        public static final long SetTextureColorModFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureColorModFloat");
        public static final long GetTextureColorMod = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureColorMod");
        public static final long GetTextureColorModFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureColorModFloat");
        public static final long SetTextureAlphaMod = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureAlphaMod");
        public static final long SetTextureAlphaModFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureAlphaModFloat");
        public static final long GetTextureAlphaMod = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureAlphaMod");
        public static final long GetTextureAlphaModFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureAlphaModFloat");
        public static final long SetTextureBlendMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureBlendMode");
        public static final long GetTextureBlendMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureBlendMode");
        public static final long SetTextureScaleMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureScaleMode");
        public static final long GetTextureScaleMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureScaleMode");
        public static final long UpdateTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateTexture");
        public static final long UpdateYUVTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateYUVTexture");
        public static final long UpdateNVTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateNVTexture");
        public static final long LockTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockTexture");
        public static final long LockTextureToSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockTextureToSurface");
        public static final long UnlockTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockTexture");
        public static final long SetRenderTarget = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderTarget");
        public static final long GetRenderTarget = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderTarget");
        public static final long SetRenderLogicalPresentation = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderLogicalPresentation");
        public static final long GetRenderLogicalPresentation = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderLogicalPresentation");
        public static final long GetRenderLogicalPresentationRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderLogicalPresentationRect");
        public static final long RenderCoordinatesFromWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderCoordinatesFromWindow");
        public static final long RenderCoordinatesToWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderCoordinatesToWindow");
        public static final long ConvertEventToRenderCoordinates = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertEventToRenderCoordinates");
        public static final long SetRenderViewport = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderViewport");
        public static final long GetRenderViewport = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderViewport");
        public static final long RenderViewportSet = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderViewportSet");
        public static final long GetRenderSafeArea = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderSafeArea");
        public static final long SetRenderClipRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderClipRect");
        public static final long GetRenderClipRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderClipRect");
        public static final long RenderClipEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderClipEnabled");
        public static final long SetRenderScale = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderScale");
        public static final long GetRenderScale = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderScale");
        public static final long SetRenderDrawColor = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderDrawColor");
        public static final long SetRenderDrawColorFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderDrawColorFloat");
        public static final long GetRenderDrawColor = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderDrawColor");
        public static final long GetRenderDrawColorFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderDrawColorFloat");
        public static final long SetRenderColorScale = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderColorScale");
        public static final long GetRenderColorScale = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderColorScale");
        public static final long SetRenderDrawBlendMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderDrawBlendMode");
        public static final long GetRenderDrawBlendMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderDrawBlendMode");
        public static final long RenderClear = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderClear");
        public static final long RenderPoint = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderPoint");
        public static final long RenderPoints = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderPoints");
        public static final long RenderLine = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderLine");
        public static final long RenderLines = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderLines");
        public static final long RenderRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderRect");
        public static final long RenderRects = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderRects");
        public static final long RenderFillRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderFillRect");
        public static final long RenderFillRects = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderFillRects");
        public static final long RenderTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTexture");
        public static final long RenderTextureRotated = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTextureRotated");
        public static final long RenderTextureAffine = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTextureAffine");
        public static final long RenderTextureTiled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTextureTiled");
        public static final long RenderTexture9Grid = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTexture9Grid");
        public static final long RenderTexture9GridTiled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTexture9GridTiled");
        public static final long RenderGeometry = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderGeometry");
        public static final long RenderGeometryRaw = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderGeometryRaw");
        public static final long SetRenderTextureAddressMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderTextureAddressMode");
        public static final long GetRenderTextureAddressMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderTextureAddressMode");
        public static final long RenderReadPixels = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderReadPixels");
        public static final long RenderPresent = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderPresent");
        public static final long DestroyTexture = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyTexture");
        public static final long DestroyRenderer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyRenderer");
        public static final long FlushRenderer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlushRenderer");
        public static final long GetRenderMetalLayer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderMetalLayer");
        public static final long GetRenderMetalCommandEncoder = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderMetalCommandEncoder");
        public static final long AddVulkanRenderSemaphores = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddVulkanRenderSemaphores");
        public static final long SetRenderVSync = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderVSync");
        public static final long GetRenderVSync = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderVSync");
        public static final long RenderDebugText = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderDebugText");
        public static final long RenderDebugTextFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderDebugTextFormat");
        public static final long SetDefaultTextureScaleMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetDefaultTextureScaleMode");
        public static final long GetDefaultTextureScaleMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDefaultTextureScaleMode");
        public static final long CreateGPURenderState = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPURenderState");
        public static final long SetGPURenderStateFragmentUniforms = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPURenderStateFragmentUniforms");
        public static final long SetGPURenderState = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPURenderState");
        public static final long DestroyGPURenderState = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyGPURenderState");

        private Functions() {
        }
    }

    protected SDLRender() {
        throw new UnsupportedOperationException();
    }

    public static int SDL_GetNumRenderDrivers() {
        long __functionAddress = Functions.GetNumRenderDrivers;
        return JNI.invokeI(__functionAddress);
    }

    public static long nSDL_GetRenderDriver(int index) {
        long __functionAddress = Functions.GetRenderDriver;
        return JNI.invokeP(index, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetRenderDriver(int index) {
        long __result = nSDL_GetRenderDriver(index);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static boolean nSDL_CreateWindowAndRenderer(long title, int width, int height, long window_flags, long window, long renderer) {
        long __functionAddress = Functions.CreateWindowAndRenderer;
        return JNI.invokePJPPZ(title, width, height, window_flags, window, renderer, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_CreateWindowAndRenderer(@NativeType("char const *") ByteBuffer title, int width, int height, @NativeType("SDL_WindowFlags") long window_flags, @NativeType("SDL_Window **") PointerBuffer window, @NativeType("SDL_Renderer **") PointerBuffer renderer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(title);
            Checks.check((CustomBuffer<?>) window, 1);
            Checks.check((CustomBuffer<?>) renderer, 1);
        }
        return nSDL_CreateWindowAndRenderer(MemoryUtil.memAddress(title), width, height, window_flags, MemoryUtil.memAddress(window), MemoryUtil.memAddress(renderer));
    }

    @NativeType("bool")
    public static boolean SDL_CreateWindowAndRenderer(@NativeType("char const *") CharSequence title, int width, int height, @NativeType("SDL_WindowFlags") long window_flags, @NativeType("SDL_Window **") PointerBuffer window, @NativeType("SDL_Renderer **") PointerBuffer renderer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) window, 1);
            Checks.check((CustomBuffer<?>) renderer, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            boolean zNSDL_CreateWindowAndRenderer = nSDL_CreateWindowAndRenderer(titleEncoded, width, height, window_flags, MemoryUtil.memAddress(window), MemoryUtil.memAddress(renderer));
            stack.setPointer(stackPointer);
            return zNSDL_CreateWindowAndRenderer;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_CreateRenderer(long window, long name) {
        long __functionAddress = Functions.CreateRenderer;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPP(window, name, __functionAddress);
    }

    @NativeType("SDL_Renderer *")
    public static long SDL_CreateRenderer(@NativeType("SDL_Window *") long window, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_CreateRenderer(window, MemoryUtil.memAddress(name));
    }

    @NativeType("SDL_Renderer *")
    public static long SDL_CreateRenderer(@NativeType("SDL_Window *") long window, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNSDL_CreateRenderer = nSDL_CreateRenderer(window, nameEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_CreateRenderer;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("SDL_Renderer *")
    public static long SDL_CreateRendererWithProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.CreateRendererWithProperties;
        return JNI.invokeP(props, __functionAddress);
    }

    @NativeType("SDL_Renderer *")
    public static long SDL_CreateGPURenderer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.CreateGPURenderer;
        return JNI.invokePPP(device, window, __functionAddress);
    }

    @NativeType("SDL_GPUDevice *")
    public static long SDL_GetGPURendererDevice(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetGPURendererDevice;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePP(renderer, __functionAddress);
    }

    public static long nSDL_CreateSoftwareRenderer(long surface) {
        long __functionAddress = Functions.CreateSoftwareRenderer;
        return JNI.invokePP(surface, __functionAddress);
    }

    @NativeType("SDL_Renderer *")
    public static long SDL_CreateSoftwareRenderer(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_CreateSoftwareRenderer(surface.address());
    }

    @NativeType("SDL_Renderer *")
    public static long SDL_GetRenderer(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetRenderer;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePP(window, __functionAddress);
    }

    @NativeType("SDL_Window *")
    public static long SDL_GetRenderWindow(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRenderWindow;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePP(renderer, __functionAddress);
    }

    public static long nSDL_GetRendererName(long renderer) {
        long __functionAddress = Functions.GetRendererName;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePP(renderer, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetRendererName(@NativeType("SDL_Renderer *") long renderer) {
        long __result = nSDL_GetRendererName(renderer);
        return MemoryUtil.memASCIISafe(__result);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetRendererProperties(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRendererProperties;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePI(renderer, __functionAddress);
    }

    public static boolean nSDL_GetRenderOutputSize(long renderer, long w, long h) {
        long __functionAddress = Functions.GetRenderOutputSize;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPZ(renderer, w, h, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderOutputSize(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) w, 1);
            Checks.checkSafe((Buffer) h, 1);
        }
        return nSDL_GetRenderOutputSize(renderer, MemoryUtil.memAddressSafe(w), MemoryUtil.memAddressSafe(h));
    }

    public static boolean nSDL_GetCurrentRenderOutputSize(long renderer, long w, long h) {
        long __functionAddress = Functions.GetCurrentRenderOutputSize;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPZ(renderer, w, h, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetCurrentRenderOutputSize(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) w, 1);
            Checks.checkSafe((Buffer) h, 1);
        }
        return nSDL_GetCurrentRenderOutputSize(renderer, MemoryUtil.memAddressSafe(w), MemoryUtil.memAddressSafe(h));
    }

    public static long nSDL_CreateTexture(long renderer, int format, int access, int w, int h) {
        long __functionAddress = Functions.CreateTexture;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePP(renderer, format, access, w, h, __functionAddress);
    }

    @NativeType("SDL_Texture *")
    public static SDL_Texture SDL_CreateTexture(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_PixelFormat") int format, @NativeType("SDL_TextureAccess") int access, int w, int h) {
        long __result = nSDL_CreateTexture(renderer, format, access, w, h);
        return SDL_Texture.createSafe(__result);
    }

    public static long nSDL_CreateTextureFromSurface(long renderer, long surface) {
        long __functionAddress = Functions.CreateTextureFromSurface;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPP(renderer, surface, __functionAddress);
    }

    @NativeType("SDL_Texture *")
    public static SDL_Texture SDL_CreateTextureFromSurface(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Surface *") SDL_Surface surface) {
        long __result = nSDL_CreateTextureFromSurface(renderer, surface.address());
        return SDL_Texture.createSafe(__result);
    }

    public static long nSDL_CreateTextureWithProperties(long renderer, int props) {
        long __functionAddress = Functions.CreateTextureWithProperties;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePP(renderer, props, __functionAddress);
    }

    @NativeType("SDL_Texture *")
    public static SDL_Texture SDL_CreateTextureWithProperties(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_PropertiesID") int props) {
        long __result = nSDL_CreateTextureWithProperties(renderer, props);
        return SDL_Texture.createSafe(__result);
    }

    public static int nSDL_GetTextureProperties(long texture) {
        long __functionAddress = Functions.GetTextureProperties;
        return JNI.invokePI(texture, __functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetTextureProperties(@NativeType("SDL_Texture *") SDL_Texture texture) {
        return nSDL_GetTextureProperties(texture.address());
    }

    public static long nSDL_GetRendererFromTexture(long texture) {
        long __functionAddress = Functions.GetRendererFromTexture;
        return JNI.invokePP(texture, __functionAddress);
    }

    @NativeType("SDL_Renderer *")
    public static long SDL_GetRendererFromTexture(@NativeType("SDL_Texture *") SDL_Texture texture) {
        return nSDL_GetRendererFromTexture(texture.address());
    }

    public static boolean nSDL_GetTextureSize(long texture, long w, long h) {
        long __functionAddress = Functions.GetTextureSize;
        return JNI.invokePPPZ(texture, w, h, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetTextureSize(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float *") FloatBuffer w, @NativeType("float *") FloatBuffer h) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) w, 1);
            Checks.checkSafe((Buffer) h, 1);
        }
        return nSDL_GetTextureSize(texture.address(), MemoryUtil.memAddressSafe(w), MemoryUtil.memAddressSafe(h));
    }

    public static boolean nSDL_SetTexturePalette(long texture, long palette) {
        long __functionAddress = Functions.SetTexturePalette;
        return JNI.invokePPZ(texture, palette, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetTexturePalette(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Palette *") SDL_Palette palette) {
        return nSDL_SetTexturePalette(texture.address(), palette.address());
    }

    public static long nSDL_GetTexturePalette(long texture) {
        long __functionAddress = Functions.GetTexturePalette;
        return JNI.invokePP(texture, __functionAddress);
    }

    @NativeType("SDL_Palette *")
    public static SDL_Palette SDL_GetTexturePalette(@NativeType("SDL_Texture *") SDL_Texture texture) {
        long __result = nSDL_GetTexturePalette(texture.address());
        return SDL_Palette.createSafe(__result);
    }

    public static boolean nSDL_SetTextureColorMod(long texture, byte r, byte g, byte b) {
        long __functionAddress = Functions.SetTextureColorMod;
        return JNI.invokePUUUZ(texture, r, g, b, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetTextureColorMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        return nSDL_SetTextureColorMod(texture.address(), r, g, b);
    }

    public static boolean nSDL_SetTextureColorModFloat(long texture, float r, float g, float b) {
        long __functionAddress = Functions.SetTextureColorModFloat;
        return JNI.invokePZ(texture, r, g, b, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetTextureColorModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, float r, float g, float b) {
        return nSDL_SetTextureColorModFloat(texture.address(), r, g, b);
    }

    public static boolean nSDL_GetTextureColorMod(long texture, long r, long g, long b) {
        long __functionAddress = Functions.GetTextureColorMod;
        return JNI.invokePPPPZ(texture, r, g, b, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetTextureColorMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8 *") ByteBuffer r, @NativeType("Uint8 *") ByteBuffer g, @NativeType("Uint8 *") ByteBuffer b) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) r, 1);
            Checks.checkSafe((Buffer) g, 1);
            Checks.checkSafe((Buffer) b, 1);
        }
        return nSDL_GetTextureColorMod(texture.address(), MemoryUtil.memAddressSafe(r), MemoryUtil.memAddressSafe(g), MemoryUtil.memAddressSafe(b));
    }

    public static boolean nSDL_GetTextureColorModFloat(long texture, long r, long g, long b) {
        long __functionAddress = Functions.GetTextureColorModFloat;
        return JNI.invokePPPPZ(texture, r, g, b, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetTextureColorModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float *") FloatBuffer r, @NativeType("float *") FloatBuffer g, @NativeType("float *") FloatBuffer b) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) r, 1);
            Checks.checkSafe((Buffer) g, 1);
            Checks.checkSafe((Buffer) b, 1);
        }
        return nSDL_GetTextureColorModFloat(texture.address(), MemoryUtil.memAddressSafe(r), MemoryUtil.memAddressSafe(g), MemoryUtil.memAddressSafe(b));
    }

    public static boolean nSDL_SetTextureAlphaMod(long texture, byte alpha) {
        long __functionAddress = Functions.SetTextureAlphaMod;
        return JNI.invokePUZ(texture, alpha, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetTextureAlphaMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8") byte alpha) {
        return nSDL_SetTextureAlphaMod(texture.address(), alpha);
    }

    public static boolean nSDL_SetTextureAlphaModFloat(long texture, float alpha) {
        long __functionAddress = Functions.SetTextureAlphaModFloat;
        return JNI.invokePZ(texture, alpha, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetTextureAlphaModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, float alpha) {
        return nSDL_SetTextureAlphaModFloat(texture.address(), alpha);
    }

    public static boolean nSDL_GetTextureAlphaMod(long texture, long alpha) {
        long __functionAddress = Functions.GetTextureAlphaMod;
        return JNI.invokePPZ(texture, alpha, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetTextureAlphaMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8 *") ByteBuffer alpha) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) alpha, 1);
        }
        return nSDL_GetTextureAlphaMod(texture.address(), MemoryUtil.memAddress(alpha));
    }

    public static boolean nSDL_GetTextureAlphaModFloat(long texture, long alpha) {
        long __functionAddress = Functions.GetTextureAlphaModFloat;
        return JNI.invokePPZ(texture, alpha, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetTextureAlphaModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float *") FloatBuffer alpha) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) alpha, 1);
        }
        return nSDL_GetTextureAlphaModFloat(texture.address(), MemoryUtil.memAddress(alpha));
    }

    public static boolean nSDL_SetTextureBlendMode(long texture, int blendMode) {
        long __functionAddress = Functions.SetTextureBlendMode;
        return JNI.invokePZ(texture, blendMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetTextureBlendMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_BlendMode") int blendMode) {
        return nSDL_SetTextureBlendMode(texture.address(), blendMode);
    }

    public static boolean nSDL_GetTextureBlendMode(long texture, long blendMode) {
        long __functionAddress = Functions.GetTextureBlendMode;
        return JNI.invokePPZ(texture, blendMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetTextureBlendMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_BlendMode *") IntBuffer blendMode) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) blendMode, 1);
        }
        return nSDL_GetTextureBlendMode(texture.address(), MemoryUtil.memAddress(blendMode));
    }

    public static boolean nSDL_SetTextureScaleMode(long texture, int scaleMode) {
        long __functionAddress = Functions.SetTextureScaleMode;
        return JNI.invokePZ(texture, scaleMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetTextureScaleMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_ScaleMode") int scaleMode) {
        return nSDL_SetTextureScaleMode(texture.address(), scaleMode);
    }

    public static boolean nSDL_GetTextureScaleMode(long texture, long scaleMode) {
        long __functionAddress = Functions.GetTextureScaleMode;
        return JNI.invokePPZ(texture, scaleMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetTextureScaleMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_ScaleMode *") IntBuffer scaleMode) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) scaleMode, 1);
        }
        return nSDL_GetTextureScaleMode(texture.address(), MemoryUtil.memAddress(scaleMode));
    }

    public static boolean nSDL_UpdateTexture(long texture, long rect, long pixels, int pitch) {
        long __functionAddress = Functions.UpdateTexture;
        return JNI.invokePPPZ(texture, rect, pixels, pitch, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_UpdateTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect rect, @NativeType("void const *") ByteBuffer pixels, int pitch) {
        return nSDL_UpdateTexture(texture.address(), MemoryUtil.memAddressSafe(rect), MemoryUtil.memAddress(pixels), pitch);
    }

    public static boolean nSDL_UpdateYUVTexture(long texture, long rect, long Yplane, int Ypitch, long Uplane, int Upitch, long Vplane, int Vpitch) {
        long __functionAddress = Functions.UpdateYUVTexture;
        return JNI.invokePPPPPZ(texture, rect, Yplane, Ypitch, Uplane, Upitch, Vplane, Vpitch, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_UpdateYUVTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect rect, @NativeType("Uint8 const *") ByteBuffer Yplane, int Ypitch, @NativeType("Uint8 const *") ByteBuffer Uplane, int Upitch, @NativeType("Uint8 const *") ByteBuffer Vplane, int Vpitch) {
        return nSDL_UpdateYUVTexture(texture.address(), MemoryUtil.memAddressSafe(rect), MemoryUtil.memAddress(Yplane), Ypitch, MemoryUtil.memAddress(Uplane), Upitch, MemoryUtil.memAddress(Vplane), Vpitch);
    }

    public static boolean nSDL_UpdateNVTexture(long texture, long rect, long Yplane, int Ypitch, long UVplane, int UVpitch) {
        long __functionAddress = Functions.UpdateNVTexture;
        return JNI.invokePPPPZ(texture, rect, Yplane, Ypitch, UVplane, UVpitch, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_UpdateNVTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect rect, @NativeType("Uint8 const *") ByteBuffer Yplane, int Ypitch, @NativeType("Uint8 const *") ByteBuffer UVplane, int UVpitch) {
        return nSDL_UpdateNVTexture(texture.address(), MemoryUtil.memAddressSafe(rect), MemoryUtil.memAddress(Yplane), Ypitch, MemoryUtil.memAddress(UVplane), UVpitch);
    }

    public static boolean nSDL_LockTexture(long texture, long rect, long pixels, long pitch) {
        long __functionAddress = Functions.LockTexture;
        return JNI.invokePPPPZ(texture, rect, pixels, pitch, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_LockTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect rect, @NativeType("void **") PointerBuffer pixels, @NativeType("int *") IntBuffer pitch) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pixels, 1);
            Checks.check((Buffer) pitch, 1);
        }
        return nSDL_LockTexture(texture.address(), MemoryUtil.memAddressSafe(rect), MemoryUtil.memAddress(pixels), MemoryUtil.memAddress(pitch));
    }

    public static boolean nSDL_LockTextureToSurface(long texture, long rect, long surface) {
        long __functionAddress = Functions.LockTextureToSurface;
        return JNI.invokePPPZ(texture, rect, surface, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_LockTextureToSurface(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect rect, @NativeType("SDL_Surface **") PointerBuffer surface) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) surface, 1);
        }
        return nSDL_LockTextureToSurface(texture.address(), MemoryUtil.memAddressSafe(rect), MemoryUtil.memAddress(surface));
    }

    public static void nSDL_UnlockTexture(long texture) {
        long __functionAddress = Functions.UnlockTexture;
        JNI.invokePV(texture, __functionAddress);
    }

    public static void SDL_UnlockTexture(@NativeType("SDL_Texture *") SDL_Texture texture) {
        nSDL_UnlockTexture(texture.address());
    }

    public static boolean nSDL_SetRenderTarget(long renderer, long texture) {
        long __functionAddress = Functions.SetRenderTarget;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, texture, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderTarget(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture) {
        return nSDL_SetRenderTarget(renderer, MemoryUtil.memAddressSafe(texture));
    }

    public static long nSDL_GetRenderTarget(long renderer) {
        long __functionAddress = Functions.GetRenderTarget;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePP(renderer, __functionAddress);
    }

    @NativeType("SDL_Texture *")
    public static SDL_Texture SDL_GetRenderTarget(@NativeType("SDL_Renderer *") long renderer) {
        long __result = nSDL_GetRenderTarget(renderer);
        return SDL_Texture.createSafe(__result);
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderLogicalPresentation(@NativeType("SDL_Renderer *") long renderer, int w, int h, @NativeType("SDL_RendererLogicalPresentation") int mode) {
        long __functionAddress = Functions.SetRenderLogicalPresentation;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, w, h, mode, __functionAddress);
    }

    public static boolean nSDL_GetRenderLogicalPresentation(long renderer, long w, long h, long mode) {
        long __functionAddress = Functions.GetRenderLogicalPresentation;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPZ(renderer, w, h, mode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderLogicalPresentation(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h, @NativeType("SDL_RendererLogicalPresentation *") IntBuffer mode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) w, 1);
            Checks.checkSafe((Buffer) h, 1);
            Checks.checkSafe((Buffer) mode, 1);
        }
        return nSDL_GetRenderLogicalPresentation(renderer, MemoryUtil.memAddressSafe(w), MemoryUtil.memAddressSafe(h), MemoryUtil.memAddressSafe(mode));
    }

    public static boolean nSDL_GetRenderLogicalPresentationRect(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderLogicalPresentationRect;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderLogicalPresentationRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect *") SDL_FRect rect) {
        return nSDL_GetRenderLogicalPresentationRect(renderer, rect.address());
    }

    public static boolean nSDL_RenderCoordinatesFromWindow(long renderer, float window_x, float window_y, long x, long y) {
        long __functionAddress = Functions.RenderCoordinatesFromWindow;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPZ(renderer, window_x, window_y, x, y, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderCoordinatesFromWindow(@NativeType("SDL_Renderer *") long renderer, float window_x, float window_y, @NativeType("float *") FloatBuffer x, @NativeType("float *") FloatBuffer y) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) x, 1);
            Checks.checkSafe((Buffer) y, 1);
        }
        return nSDL_RenderCoordinatesFromWindow(renderer, window_x, window_y, MemoryUtil.memAddressSafe(x), MemoryUtil.memAddressSafe(y));
    }

    public static boolean nSDL_RenderCoordinatesToWindow(long renderer, float x, float y, long window_x, long window_y) {
        long __functionAddress = Functions.RenderCoordinatesToWindow;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPZ(renderer, x, y, window_x, window_y, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderCoordinatesToWindow(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("float *") FloatBuffer window_x, @NativeType("float *") FloatBuffer window_y) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) window_x, 1);
            Checks.checkSafe((Buffer) window_y, 1);
        }
        return nSDL_RenderCoordinatesToWindow(renderer, x, y, MemoryUtil.memAddressSafe(window_x), MemoryUtil.memAddressSafe(window_y));
    }

    public static boolean nSDL_ConvertEventToRenderCoordinates(long renderer, long event) {
        long __functionAddress = Functions.ConvertEventToRenderCoordinates;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, event, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ConvertEventToRenderCoordinates(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Event *") SDL_Event event) {
        return nSDL_ConvertEventToRenderCoordinates(renderer, event.address());
    }

    public static boolean nSDL_SetRenderViewport(long renderer, long rect) {
        long __functionAddress = Functions.SetRenderViewport;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderViewport(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect const *") SDL_Rect rect) {
        return nSDL_SetRenderViewport(renderer, MemoryUtil.memAddressSafe(rect));
    }

    public static boolean nSDL_GetRenderViewport(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderViewport;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderViewport(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetRenderViewport(renderer, rect.address());
    }

    @NativeType("bool")
    public static boolean SDL_RenderViewportSet(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderViewportSet;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, __functionAddress);
    }

    public static boolean nSDL_GetRenderSafeArea(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderSafeArea;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderSafeArea(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetRenderSafeArea(renderer, rect.address());
    }

    public static boolean nSDL_SetRenderClipRect(long renderer, long rect) {
        long __functionAddress = Functions.SetRenderClipRect;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderClipRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect const *") SDL_Rect rect) {
        return nSDL_SetRenderClipRect(renderer, MemoryUtil.memAddressSafe(rect));
    }

    public static boolean nSDL_GetRenderClipRect(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderClipRect;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderClipRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetRenderClipRect(renderer, rect.address());
    }

    @NativeType("bool")
    public static boolean SDL_RenderClipEnabled(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderClipEnabled;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderScale(@NativeType("SDL_Renderer *") long renderer, float scaleX, float scaleY) {
        long __functionAddress = Functions.SetRenderScale;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, scaleX, scaleY, __functionAddress);
    }

    public static boolean nSDL_GetRenderScale(long renderer, long scaleX, long scaleY) {
        long __functionAddress = Functions.GetRenderScale;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPZ(renderer, scaleX, scaleY, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderScale(@NativeType("SDL_Renderer *") long renderer, @NativeType("float *") FloatBuffer scaleX, @NativeType("float *") FloatBuffer scaleY) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) scaleX, 1);
            Checks.checkSafe((Buffer) scaleY, 1);
        }
        return nSDL_GetRenderScale(renderer, MemoryUtil.memAddressSafe(scaleX), MemoryUtil.memAddressSafe(scaleY));
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderDrawColor(@NativeType("SDL_Renderer *") long renderer, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        long __functionAddress = Functions.SetRenderDrawColor;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePUUUUZ(renderer, r, g, b, a, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderDrawColorFloat(@NativeType("SDL_Renderer *") long renderer, float r, float g, float b, float a) {
        long __functionAddress = Functions.SetRenderDrawColorFloat;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, r, g, b, a, __functionAddress);
    }

    public static boolean nSDL_GetRenderDrawColor(long renderer, long r, long g, long b, long a) {
        long __functionAddress = Functions.GetRenderDrawColor;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPPZ(renderer, r, g, b, a, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderDrawColor(@NativeType("SDL_Renderer *") long renderer, @NativeType("Uint8 *") ByteBuffer r, @NativeType("Uint8 *") ByteBuffer g, @NativeType("Uint8 *") ByteBuffer b, @NativeType("Uint8 *") ByteBuffer a) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) r, 1);
            Checks.checkSafe((Buffer) g, 1);
            Checks.checkSafe((Buffer) b, 1);
            Checks.checkSafe((Buffer) a, 1);
        }
        return nSDL_GetRenderDrawColor(renderer, MemoryUtil.memAddressSafe(r), MemoryUtil.memAddressSafe(g), MemoryUtil.memAddressSafe(b), MemoryUtil.memAddressSafe(a));
    }

    public static boolean nSDL_GetRenderDrawColorFloat(long renderer, long r, long g, long b, long a) {
        long __functionAddress = Functions.GetRenderDrawColorFloat;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPPZ(renderer, r, g, b, a, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderDrawColorFloat(@NativeType("SDL_Renderer *") long renderer, @NativeType("float *") FloatBuffer r, @NativeType("float *") FloatBuffer g, @NativeType("float *") FloatBuffer b, @NativeType("float *") FloatBuffer a) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) r, 1);
            Checks.checkSafe((Buffer) g, 1);
            Checks.checkSafe((Buffer) b, 1);
            Checks.checkSafe((Buffer) a, 1);
        }
        return nSDL_GetRenderDrawColorFloat(renderer, MemoryUtil.memAddressSafe(r), MemoryUtil.memAddressSafe(g), MemoryUtil.memAddressSafe(b), MemoryUtil.memAddressSafe(a));
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderColorScale(@NativeType("SDL_Renderer *") long renderer, float scale) {
        long __functionAddress = Functions.SetRenderColorScale;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, scale, __functionAddress);
    }

    public static boolean nSDL_GetRenderColorScale(long renderer, long scale) {
        long __functionAddress = Functions.GetRenderColorScale;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, scale, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderColorScale(@NativeType("SDL_Renderer *") long renderer, @NativeType("float *") FloatBuffer scale) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) scale, 1);
        }
        return nSDL_GetRenderColorScale(renderer, MemoryUtil.memAddress(scale));
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderDrawBlendMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_BlendMode") int blendMode) {
        long __functionAddress = Functions.SetRenderDrawBlendMode;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, blendMode, __functionAddress);
    }

    public static boolean nSDL_GetRenderDrawBlendMode(long renderer, long blendMode) {
        long __functionAddress = Functions.GetRenderDrawBlendMode;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, blendMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderDrawBlendMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_BlendMode *") IntBuffer blendMode) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) blendMode, 1);
        }
        return nSDL_GetRenderDrawBlendMode(renderer, MemoryUtil.memAddress(blendMode));
    }

    @NativeType("bool")
    public static boolean SDL_RenderClear(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderClear;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderPoint(@NativeType("SDL_Renderer *") long renderer, float x, float y) {
        long __functionAddress = Functions.RenderPoint;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, x, y, __functionAddress);
    }

    public static boolean nSDL_RenderPoints(long renderer, long points, int count) {
        long __functionAddress = Functions.RenderPoints;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, points, count, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderPoints(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FPoint const *") SDL_FPoint.Buffer points) {
        return nSDL_RenderPoints(renderer, points.address(), points.remaining());
    }

    @NativeType("bool")
    public static boolean SDL_RenderLine(@NativeType("SDL_Renderer *") long renderer, float x1, float y1, float x2, float y2) {
        long __functionAddress = Functions.RenderLine;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, x1, y1, x2, y2, __functionAddress);
    }

    public static boolean nSDL_RenderLines(long renderer, long points, int count) {
        long __functionAddress = Functions.RenderLines;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, points, count, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderLines(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FPoint const *") SDL_FPoint.Buffer points) {
        return nSDL_RenderLines(renderer, points.address(), points.remaining());
    }

    public static boolean nSDL_RenderRect(long renderer, long rect) {
        long __functionAddress = Functions.RenderRect;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect rect) {
        return nSDL_RenderRect(renderer, MemoryUtil.memAddressSafe(rect));
    }

    public static boolean nSDL_RenderRects(long renderer, long rects, int count) {
        long __functionAddress = Functions.RenderRects;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rects, count, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderRects(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect.Buffer rects) {
        return nSDL_RenderRects(renderer, rects.address(), rects.remaining());
    }

    public static boolean nSDL_RenderFillRect(long renderer, long rect) {
        long __functionAddress = Functions.RenderFillRect;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderFillRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect rect) {
        return nSDL_RenderFillRect(renderer, MemoryUtil.memAddressSafe(rect));
    }

    public static boolean nSDL_RenderFillRects(long renderer, long rects, int count) {
        long __functionAddress = Functions.RenderFillRects;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, rects, count, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderFillRects(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect.Buffer rects) {
        return nSDL_RenderFillRects(renderer, rects.address(), rects.remaining());
    }

    public static boolean nSDL_RenderTexture(long renderer, long texture, long srcrect, long dstrect) {
        long __functionAddress = Functions.RenderTexture;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPZ(renderer, texture, srcrect, dstrect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderTexture(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") SDL_FRect srcrect, @NativeType("SDL_FRect const *") SDL_FRect dstrect) {
        return nSDL_RenderTexture(renderer, texture.address(), MemoryUtil.memAddressSafe(srcrect), MemoryUtil.memAddressSafe(dstrect));
    }

    public static boolean nSDL_RenderTextureRotated(long renderer, long texture, long srcrect, long dstrect, double angle, long center, int flip) {
        long __functionAddress = Functions.RenderTextureRotated;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPPZ(renderer, texture, srcrect, dstrect, angle, center, flip, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderTextureRotated(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") SDL_FRect srcrect, @NativeType("SDL_FRect const *") SDL_FRect dstrect, double angle, @NativeType("SDL_FPoint const *") SDL_FPoint center, @NativeType("SDL_FlipMode") int flip) {
        return nSDL_RenderTextureRotated(renderer, texture.address(), MemoryUtil.memAddressSafe(srcrect), MemoryUtil.memAddressSafe(dstrect), angle, MemoryUtil.memAddressSafe(center), flip);
    }

    public static boolean nSDL_RenderTextureAffine(long renderer, long texture, long srcrect, long origin, long right, long down) {
        long __functionAddress = Functions.RenderTextureAffine;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPPPZ(renderer, texture, srcrect, origin, right, down, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderTextureAffine(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") SDL_FRect srcrect, @NativeType("SDL_FPoint const *") SDL_FPoint origin, @NativeType("SDL_FPoint const *") SDL_FPoint right, @NativeType("SDL_FPoint const *") SDL_FPoint down) {
        return nSDL_RenderTextureAffine(renderer, texture.address(), MemoryUtil.memAddressSafe(srcrect), MemoryUtil.memAddressSafe(origin), MemoryUtil.memAddressSafe(right), MemoryUtil.memAddressSafe(down));
    }

    public static boolean nSDL_RenderTextureTiled(long renderer, long texture, long srcrect, float scale, long dstrect) {
        long __functionAddress = Functions.RenderTextureTiled;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPZ(renderer, texture, srcrect, scale, dstrect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderTextureTiled(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") SDL_FRect srcrect, float scale, @NativeType("SDL_FRect const *") SDL_FRect dstrect) {
        return nSDL_RenderTextureTiled(renderer, texture.address(), MemoryUtil.memAddressSafe(srcrect), scale, MemoryUtil.memAddressSafe(dstrect));
    }

    public static boolean nSDL_RenderTexture9Grid(long renderer, long texture, long srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, long dstrect) {
        long __functionAddress = Functions.RenderTexture9Grid;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPZ(renderer, texture, srcrect, left_width, right_width, top_height, bottom_height, scale, dstrect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderTexture9Grid(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") SDL_FRect srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, @NativeType("SDL_FRect const *") SDL_FRect dstrect) {
        return nSDL_RenderTexture9Grid(renderer, texture.address(), MemoryUtil.memAddressSafe(srcrect), left_width, right_width, top_height, bottom_height, scale, MemoryUtil.memAddressSafe(dstrect));
    }

    public static boolean nSDL_RenderTexture9GridTiled(long renderer, long texture, long srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, long dstrect, float tileScale) {
        long __functionAddress = Functions.RenderTexture9GridTiled;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPZ(renderer, texture, srcrect, left_width, right_width, top_height, bottom_height, scale, dstrect, tileScale, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderTexture9GridTiled(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") SDL_FRect srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, @NativeType("SDL_FRect const *") SDL_FRect dstrect, float tileScale) {
        return nSDL_RenderTexture9GridTiled(renderer, texture.address(), MemoryUtil.memAddressSafe(srcrect), left_width, right_width, top_height, bottom_height, scale, MemoryUtil.memAddressSafe(dstrect), tileScale);
    }

    public static boolean nSDL_RenderGeometry(long renderer, long texture, long vertices, int num_vertices, long indices, int num_indices) {
        long __functionAddress = Functions.RenderGeometry;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPZ(renderer, texture, vertices, num_vertices, indices, num_indices, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderGeometry(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Vertex const *") SDL_Vertex.Buffer vertices, @NativeType("int const *") IntBuffer indices) {
        return nSDL_RenderGeometry(renderer, MemoryUtil.memAddressSafe(texture), vertices.address(), vertices.remaining(), MemoryUtil.memAddressSafe(indices), Checks.remainingSafe(indices));
    }

    public static boolean nSDL_RenderGeometryRaw(long renderer, long texture, long xy, int xy_stride, long color, int color_stride, long uv, int uv_stride, int num_vertices, long indices, int num_indices, int size_indices) {
        long __functionAddress = Functions.RenderGeometryRaw;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPPPPZ(renderer, texture, xy, xy_stride, color, color_stride, uv, uv_stride, num_vertices, indices, num_indices, size_indices, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderGeometryRaw(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float const *") FloatBuffer xy, int xy_stride, @NativeType("SDL_FColor const *") SDL_FColor.Buffer color, int color_stride, @NativeType("float const *") FloatBuffer uv, int uv_stride, int num_vertices, @NativeType("void const *") ByteBuffer indices, int num_indices, int size_indices) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) xy, (num_vertices * xy_stride) >> 2);
            Checks.check((CustomBuffer<?>) color, (num_vertices * color_stride) / SDL_FColor.SIZEOF);
            Checks.checkSafe((Buffer) uv, (num_vertices * uv_stride) >> 2);
            Checks.checkSafe((Buffer) indices, num_indices * size_indices);
        }
        return nSDL_RenderGeometryRaw(renderer, MemoryUtil.memAddressSafe(texture), MemoryUtil.memAddress(xy), xy_stride, color.address(), color_stride, MemoryUtil.memAddressSafe(uv), uv_stride, num_vertices, MemoryUtil.memAddressSafe(indices), num_indices, size_indices);
    }

    @NativeType("bool")
    public static boolean SDL_RenderGeometryRaw(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float const *") FloatBuffer xy, int xy_stride, @NativeType("SDL_FColor const *") SDL_FColor.Buffer color, int color_stride, @NativeType("float const *") FloatBuffer uv, int uv_stride, int num_vertices, @NativeType("void const *") ShortBuffer indices, int num_indices, int size_indices) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) xy, (num_vertices * xy_stride) >> 2);
            Checks.check((CustomBuffer<?>) color, (num_vertices * color_stride) / SDL_FColor.SIZEOF);
            Checks.checkSafe((Buffer) uv, (num_vertices * uv_stride) >> 2);
            Checks.checkSafe((Buffer) indices, (num_indices * size_indices) >> 1);
        }
        return nSDL_RenderGeometryRaw(renderer, MemoryUtil.memAddressSafe(texture), MemoryUtil.memAddress(xy), xy_stride, color.address(), color_stride, MemoryUtil.memAddressSafe(uv), uv_stride, num_vertices, MemoryUtil.memAddressSafe(indices), num_indices, size_indices);
    }

    @NativeType("bool")
    public static boolean SDL_RenderGeometryRaw(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float const *") FloatBuffer xy, int xy_stride, @NativeType("SDL_FColor const *") SDL_FColor.Buffer color, int color_stride, @NativeType("float const *") FloatBuffer uv, int uv_stride, int num_vertices, @NativeType("void const *") IntBuffer indices, int num_indices, int size_indices) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) xy, (num_vertices * xy_stride) >> 2);
            Checks.check((CustomBuffer<?>) color, (num_vertices * color_stride) / SDL_FColor.SIZEOF);
            Checks.checkSafe((Buffer) uv, (num_vertices * uv_stride) >> 2);
            Checks.checkSafe((Buffer) indices, (num_indices * size_indices) >> 2);
        }
        return nSDL_RenderGeometryRaw(renderer, MemoryUtil.memAddressSafe(texture), MemoryUtil.memAddress(xy), xy_stride, color.address(), color_stride, MemoryUtil.memAddressSafe(uv), uv_stride, num_vertices, MemoryUtil.memAddressSafe(indices), num_indices, size_indices);
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderTextureAddressMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_TextureAddressMode") int u_mode, @NativeType("SDL_TextureAddressMode") int v_mode) {
        long __functionAddress = Functions.SetRenderTextureAddressMode;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, u_mode, v_mode, __functionAddress);
    }

    public static boolean nSDL_GetRenderTextureAddressMode(long renderer, long u_mode, long v_mode) {
        long __functionAddress = Functions.GetRenderTextureAddressMode;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPPZ(renderer, u_mode, v_mode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderTextureAddressMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_TextureAddressMode *") IntBuffer u_mode, @NativeType("SDL_TextureAddressMode *") IntBuffer v_mode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) u_mode, 1);
            Checks.checkSafe((Buffer) v_mode, 1);
        }
        return nSDL_GetRenderTextureAddressMode(renderer, MemoryUtil.memAddressSafe(u_mode), MemoryUtil.memAddressSafe(v_mode));
    }

    public static long nSDL_RenderReadPixels(long renderer, long rect) {
        long __functionAddress = Functions.RenderReadPixels;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPP(renderer, rect, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_RenderReadPixels(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect const *") SDL_Rect rect) {
        long __result = nSDL_RenderReadPixels(renderer, MemoryUtil.memAddressSafe(rect));
        return SDL_Surface.createSafe(__result);
    }

    @NativeType("bool")
    public static boolean SDL_RenderPresent(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderPresent;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, __functionAddress);
    }

    public static void nSDL_DestroyTexture(long texture) {
        long __functionAddress = Functions.DestroyTexture;
        JNI.invokePV(texture, __functionAddress);
    }

    public static void SDL_DestroyTexture(@NativeType("SDL_Texture *") SDL_Texture texture) {
        nSDL_DestroyTexture(texture.address());
    }

    public static void SDL_DestroyRenderer(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.DestroyRenderer;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        JNI.invokePV(renderer, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_FlushRenderer(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.FlushRenderer;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, __functionAddress);
    }

    @NativeType("void *")
    public static long SDL_GetRenderMetalLayer(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRenderMetalLayer;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePP(renderer, __functionAddress);
    }

    @NativeType("void *")
    public static long SDL_GetRenderMetalCommandEncoder(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRenderMetalCommandEncoder;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePP(renderer, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_AddVulkanRenderSemaphores(@NativeType("SDL_Renderer *") long renderer, @NativeType("Uint32") int wait_stage_mask, @NativeType("Sint64") long wait_semaphore, @NativeType("Sint64") long signal_semaphore) {
        long __functionAddress = Functions.AddVulkanRenderSemaphores;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePJJZ(renderer, wait_stage_mask, wait_semaphore, signal_semaphore, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetRenderVSync(@NativeType("SDL_Renderer *") long renderer, int vsync) {
        long __functionAddress = Functions.SetRenderVSync;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, vsync, __functionAddress);
    }

    public static boolean nSDL_GetRenderVSync(long renderer, long vsync) {
        long __functionAddress = Functions.GetRenderVSync;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, vsync, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRenderVSync(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") IntBuffer vsync) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) vsync, 1);
        }
        return nSDL_GetRenderVSync(renderer, MemoryUtil.memAddress(vsync));
    }

    public static boolean nSDL_RenderDebugText(long renderer, float x, float y, long str) {
        long __functionAddress = Functions.RenderDebugText;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, x, y, str, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderDebugText(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") ByteBuffer str) {
        if (Checks.CHECKS) {
            Checks.checkNT1(str);
        }
        return nSDL_RenderDebugText(renderer, x, y, MemoryUtil.memAddress(str));
    }

    @NativeType("bool")
    public static boolean SDL_RenderDebugText(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") CharSequence str) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            boolean zNSDL_RenderDebugText = nSDL_RenderDebugText(renderer, x, y, strEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_RenderDebugText;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_RenderDebugTextFormat(long renderer, float x, float y, long fmt) {
        long __functionAddress = Functions.RenderDebugTextFormat;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, x, y, fmt, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenderDebugTextFormat(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        return nSDL_RenderDebugTextFormat(renderer, x, y, MemoryUtil.memAddress(fmt));
    }

    @NativeType("bool")
    public static boolean SDL_RenderDebugTextFormat(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            boolean zNSDL_RenderDebugTextFormat = nSDL_RenderDebugTextFormat(renderer, x, y, fmtEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_RenderDebugTextFormat;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("bool")
    public static boolean SDL_SetDefaultTextureScaleMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_ScaleMode") int scale_mode) {
        long __functionAddress = Functions.SetDefaultTextureScaleMode;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePZ(renderer, scale_mode, __functionAddress);
    }

    public static boolean nSDL_GetDefaultTextureScaleMode(long renderer, long scale_mode) {
        long __functionAddress = Functions.GetDefaultTextureScaleMode;
        if (Checks.CHECKS) {
            Checks.check(renderer);
        }
        return JNI.invokePPZ(renderer, scale_mode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetDefaultTextureScaleMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_ScaleMode *") IntBuffer scale_mode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) scale_mode, 1);
        }
        return nSDL_GetDefaultTextureScaleMode(renderer, MemoryUtil.memAddressSafe(scale_mode));
    }

    public static long nSDL_CreateGPURenderState(long renderer, long createinfo) {
        long __functionAddress = Functions.CreateGPURenderState;
        if (Checks.CHECKS) {
            Checks.check(renderer);
            SDL_GPURenderStateCreateInfo.validate(createinfo);
        }
        return JNI.invokePPP(renderer, createinfo, __functionAddress);
    }

    @NativeType("SDL_GPURenderState *")
    public static long SDL_CreateGPURenderState(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_GPURenderStateCreateInfo const *") SDL_GPURenderStateCreateInfo createinfo) {
        return nSDL_CreateGPURenderState(renderer, createinfo.address());
    }

    public static boolean nSDL_SetGPURenderStateFragmentUniforms(long state, int slot_index, long data, int length) {
        long __functionAddress = Functions.SetGPURenderStateFragmentUniforms;
        if (Checks.CHECKS) {
            Checks.check(state);
        }
        return JNI.invokePPZ(state, slot_index, data, length, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetGPURenderStateFragmentUniforms(@NativeType("SDL_GPURenderState *") long state, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        return nSDL_SetGPURenderStateFragmentUniforms(state, slot_index, MemoryUtil.memAddress(data), data.remaining());
    }

    @NativeType("bool")
    public static boolean SDL_SetGPURenderState(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_GPURenderState *") long state) {
        long __functionAddress = Functions.SetGPURenderState;
        if (Checks.CHECKS) {
            Checks.check(renderer);
            Checks.check(state);
        }
        return JNI.invokePPZ(renderer, state, __functionAddress);
    }

    public static void SDL_DestroyGPURenderState(@NativeType("SDL_GPURenderState *") long state) {
        long __functionAddress = Functions.DestroyGPURenderState;
        if (Checks.CHECKS) {
            Checks.check(state);
        }
        JNI.invokePV(state, __functionAddress);
    }
}
