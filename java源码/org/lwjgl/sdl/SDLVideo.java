package org.lwjgl.sdl;

import androidx.core.internal.view.SupportMenu;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.sdl.SDL_Rect;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLVideo.class */
public class SDLVideo {
    public static final String SDL_PROP_GLOBAL_VIDEO_WAYLAND_WL_DISPLAY_POINTER = "SDL.video.wayland.wl_display";
    public static final int SDL_SYSTEM_THEME_UNKNOWN = 0;
    public static final int SDL_SYSTEM_THEME_LIGHT = 1;
    public static final int SDL_SYSTEM_THEME_DARK = 2;
    public static final int SDL_ORIENTATION_UNKNOWN = 0;
    public static final int SDL_ORIENTATION_LANDSCAPE = 1;
    public static final int SDL_ORIENTATION_LANDSCAPE_FLIPPED = 2;
    public static final int SDL_ORIENTATION_PORTRAIT = 3;
    public static final int SDL_ORIENTATION_PORTRAIT_FLIPPED = 4;
    public static final long SDL_WINDOW_FULLSCREEN = 1;
    public static final long SDL_WINDOW_OPENGL = 2;
    public static final long SDL_WINDOW_OCCLUDED = 4;
    public static final long SDL_WINDOW_HIDDEN = 8;
    public static final long SDL_WINDOW_BORDERLESS = 16;
    public static final long SDL_WINDOW_RESIZABLE = 32;
    public static final long SDL_WINDOW_MINIMIZED = 64;
    public static final long SDL_WINDOW_MAXIMIZED = 128;
    public static final long SDL_WINDOW_MOUSE_GRABBED = 256;
    public static final long SDL_WINDOW_INPUT_FOCUS = 512;
    public static final long SDL_WINDOW_MOUSE_FOCUS = 1024;
    public static final long SDL_WINDOW_EXTERNAL = 2048;
    public static final long SDL_WINDOW_MODAL = 4096;
    public static final long SDL_WINDOW_HIGH_PIXEL_DENSITY = 8192;
    public static final long SDL_WINDOW_MOUSE_CAPTURE = 16384;
    public static final long SDL_WINDOW_MOUSE_RELATIVE_MODE = 32768;
    public static final long SDL_WINDOW_ALWAYS_ON_TOP = 65536;
    public static final long SDL_WINDOW_UTILITY = 131072;
    public static final long SDL_WINDOW_TOOLTIP = 262144;
    public static final long SDL_WINDOW_POPUP_MENU = 524288;
    public static final long SDL_WINDOW_KEYBOARD_GRABBED = 1048576;
    public static final long SDL_WINDOW_FILL_DOCUMENT = 2097152;
    public static final long SDL_WINDOW_VULKAN = 268435456;
    public static final long SDL_WINDOW_METAL = 536870912;
    public static final long SDL_WINDOW_TRANSPARENT = 1073741824;
    public static final long SDL_WINDOW_NOT_FOCUSABLE = 2147483648L;
    public static final int SDL_WINDOWPOS_UNDEFINED_MASK = 536805376;
    public static final int SDL_WINDOWPOS_CENTERED_MASK = 805240832;
    public static final int SDL_FLASH_CANCEL = 0;
    public static final int SDL_FLASH_BRIEFLY = 1;
    public static final int SDL_FLASH_UNTIL_FOCUSED = 2;
    public static final int SDL_PROGRESS_STATE_INVALID = -1;
    public static final int SDL_PROGRESS_STATE_NONE = 0;
    public static final int SDL_PROGRESS_STATE_INDETERMINATE = 1;
    public static final int SDL_PROGRESS_STATE_NORMAL = 2;
    public static final int SDL_PROGRESS_STATE_PAUSED = 3;
    public static final int SDL_PROGRESS_STATE_ERROR = 4;
    public static final int SDL_GL_RED_SIZE = 0;
    public static final int SDL_GL_GREEN_SIZE = 1;
    public static final int SDL_GL_BLUE_SIZE = 2;
    public static final int SDL_GL_ALPHA_SIZE = 3;
    public static final int SDL_GL_BUFFER_SIZE = 4;
    public static final int SDL_GL_DOUBLEBUFFER = 5;
    public static final int SDL_GL_DEPTH_SIZE = 6;
    public static final int SDL_GL_STENCIL_SIZE = 7;
    public static final int SDL_GL_ACCUM_RED_SIZE = 8;
    public static final int SDL_GL_ACCUM_GREEN_SIZE = 9;
    public static final int SDL_GL_ACCUM_BLUE_SIZE = 10;
    public static final int SDL_GL_ACCUM_ALPHA_SIZE = 11;
    public static final int SDL_GL_STEREO = 12;
    public static final int SDL_GL_MULTISAMPLEBUFFERS = 13;
    public static final int SDL_GL_MULTISAMPLESAMPLES = 14;
    public static final int SDL_GL_ACCELERATED_VISUAL = 15;
    public static final int SDL_GL_RETAINED_BACKING = 16;
    public static final int SDL_GL_CONTEXT_MAJOR_VERSION = 17;
    public static final int SDL_GL_CONTEXT_MINOR_VERSION = 18;
    public static final int SDL_GL_CONTEXT_FLAGS = 19;
    public static final int SDL_GL_CONTEXT_PROFILE_MASK = 20;
    public static final int SDL_GL_SHARE_WITH_CURRENT_CONTEXT = 21;
    public static final int SDL_GL_FRAMEBUFFER_SRGB_CAPABLE = 22;
    public static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR = 23;
    public static final int SDL_GL_CONTEXT_RESET_NOTIFICATION = 24;
    public static final int SDL_GL_CONTEXT_NO_ERROR = 25;
    public static final int SDL_GL_FLOATBUFFERS = 26;
    public static final int SDL_GL_EGL_PLATFORM = 27;
    public static final int SDL_GL_CONTEXT_PROFILE_CORE = 1;
    public static final int SDL_GL_CONTEXT_PROFILE_COMPATIBILITY = 2;
    public static final int SDL_GL_CONTEXT_PROFILE_ES = 4;
    public static final int SDL_GL_CONTEXT_DEBUG_FLAG = 1;
    public static final int SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG = 2;
    public static final int SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG = 4;
    public static final int SDL_GL_CONTEXT_RESET_ISOLATION_FLAG = 8;
    public static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE = 0;
    public static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 1;
    public static final int SDL_GL_CONTEXT_RESET_NO_NOTIFICATION = 0;
    public static final int SDL_GL_CONTEXT_RESET_LOSE_CONTEXT = 1;
    public static final String SDL_PROP_DISPLAY_HDR_ENABLED_BOOLEAN = "SDL.display.HDR_enabled";
    public static final String SDL_PROP_DISPLAY_KMSDRM_PANEL_ORIENTATION_NUMBER = "SDL.display.KMSDRM.panel_orientation";
    public static final String SDL_PROP_DISPLAY_WAYLAND_WL_OUTPUT_POINTER = "SDL.display.wayland.wl_output";
    public static final String SDL_PROP_DISPLAY_WINDOWS_HMONITOR_POINTER = "SDL.display.windows.hmonitor";
    public static final String SDL_PROP_WINDOW_CREATE_ALWAYS_ON_TOP_BOOLEAN = "SDL.window.create.always_on_top";
    public static final String SDL_PROP_WINDOW_CREATE_BORDERLESS_BOOLEAN = "SDL.window.create.borderless";
    public static final String SDL_PROP_WINDOW_CREATE_CONSTRAIN_POPUP_BOOLEAN = "SDL.window.create.constrain_popup";
    public static final String SDL_PROP_WINDOW_CREATE_FOCUSABLE_BOOLEAN = "SDL.window.create.focusable";
    public static final String SDL_PROP_WINDOW_CREATE_EXTERNAL_GRAPHICS_CONTEXT_BOOLEAN = "SDL.window.create.external_graphics_context";
    public static final String SDL_PROP_WINDOW_CREATE_FLAGS_NUMBER = "SDL.window.create.flags";
    public static final String SDL_PROP_WINDOW_CREATE_FULLSCREEN_BOOLEAN = "SDL.window.create.fullscreen";
    public static final String SDL_PROP_WINDOW_CREATE_HEIGHT_NUMBER = "SDL.window.create.height";
    public static final String SDL_PROP_WINDOW_CREATE_HIDDEN_BOOLEAN = "SDL.window.create.hidden";
    public static final String SDL_PROP_WINDOW_CREATE_HIGH_PIXEL_DENSITY_BOOLEAN = "SDL.window.create.high_pixel_density";
    public static final String SDL_PROP_WINDOW_CREATE_MAXIMIZED_BOOLEAN = "SDL.window.create.maximized";
    public static final String SDL_PROP_WINDOW_CREATE_MENU_BOOLEAN = "SDL.window.create.menu";
    public static final String SDL_PROP_WINDOW_CREATE_METAL_BOOLEAN = "SDL.window.create.metal";
    public static final String SDL_PROP_WINDOW_CREATE_MINIMIZED_BOOLEAN = "SDL.window.create.minimized";
    public static final String SDL_PROP_WINDOW_CREATE_MODAL_BOOLEAN = "SDL.window.create.modal";
    public static final String SDL_PROP_WINDOW_CREATE_MOUSE_GRABBED_BOOLEAN = "SDL.window.create.mouse_grabbed";
    public static final String SDL_PROP_WINDOW_CREATE_OPENGL_BOOLEAN = "SDL.window.create.opengl";
    public static final String SDL_PROP_WINDOW_CREATE_PARENT_POINTER = "SDL.window.create.parent";
    public static final String SDL_PROP_WINDOW_CREATE_RESIZABLE_BOOLEAN = "SDL.window.create.resizable";
    public static final String SDL_PROP_WINDOW_CREATE_TITLE_STRING = "SDL.window.create.title";
    public static final String SDL_PROP_WINDOW_CREATE_TRANSPARENT_BOOLEAN = "SDL.window.create.transparent";
    public static final String SDL_PROP_WINDOW_CREATE_TOOLTIP_BOOLEAN = "SDL.window.create.tooltip";
    public static final String SDL_PROP_WINDOW_CREATE_UTILITY_BOOLEAN = "SDL.window.create.utility";
    public static final String SDL_PROP_WINDOW_CREATE_VULKAN_BOOLEAN = "SDL.window.create.vulkan";
    public static final String SDL_PROP_WINDOW_CREATE_WIDTH_NUMBER = "SDL.window.create.width";
    public static final String SDL_PROP_WINDOW_CREATE_X_NUMBER = "SDL.window.create.x";
    public static final String SDL_PROP_WINDOW_CREATE_Y_NUMBER = "SDL.window.create.y";
    public static final String SDL_PROP_WINDOW_CREATE_COCOA_WINDOW_POINTER = "SDL.window.create.cocoa.window";
    public static final String SDL_PROP_WINDOW_CREATE_COCOA_VIEW_POINTER = "SDL.window.create.cocoa.view";
    public static final String SDL_PROP_WINDOW_CREATE_WINDOWSCENE_POINTER = "SDL.window.create.uikit.windowscene";
    public static final String SDL_PROP_WINDOW_CREATE_WAYLAND_SURFACE_ROLE_CUSTOM_BOOLEAN = "SDL.window.create.wayland.surface_role_custom";
    public static final String SDL_PROP_WINDOW_CREATE_WAYLAND_CREATE_EGL_WINDOW_BOOLEAN = "SDL.window.create.wayland.create_egl_window";
    public static final String SDL_PROP_WINDOW_CREATE_WAYLAND_WL_SURFACE_POINTER = "SDL.window.create.wayland.wl_surface";
    public static final String SDL_PROP_WINDOW_CREATE_WIN32_HWND_POINTER = "SDL.window.create.win32.hwnd";
    public static final String SDL_PROP_WINDOW_CREATE_WIN32_PIXEL_FORMAT_HWND_POINTER = "SDL.window.create.win32.pixel_format_hwnd";
    public static final String SDL_PROP_WINDOW_CREATE_X11_WINDOW_NUMBER = "SDL.window.create.x11.window";
    public static final String SDL_PROP_WINDOW_CREATE_EMSCRIPTEN_CANVAS_ID_STRING = "SDL.window.create.emscripten.canvas_id";
    public static final String SDL_PROP_WINDOW_CREATE_EMSCRIPTEN_KEYBOARD_ELEMENT_STRING = "SDL.window.create.emscripten.keyboard_element";
    public static final String SDL_PROP_WINDOW_SHAPE_POINTER = "SDL.window.shape";
    public static final String SDL_PROP_WINDOW_HDR_ENABLED_BOOLEAN = "SDL.window.HDR_enabled";
    public static final String SDL_PROP_WINDOW_SDR_WHITE_LEVEL_FLOAT = "SDL.window.SDR_white_level";
    public static final String SDL_PROP_WINDOW_HDR_HEADROOM_FLOAT = "SDL.window.HDR_headroom";
    public static final String SDL_PROP_WINDOW_ANDROID_WINDOW_POINTER = "SDL.window.android.window";
    public static final String SDL_PROP_WINDOW_ANDROID_SURFACE_POINTER = "SDL.window.android.surface";
    public static final String SDL_PROP_WINDOW_UIKIT_WINDOW_POINTER = "SDL.window.uikit.window";
    public static final String SDL_PROP_WINDOW_UIKIT_METAL_VIEW_TAG_NUMBER = "SDL.window.uikit.metal_view_tag";
    public static final String SDL_PROP_WINDOW_UIKIT_OPENGL_FRAMEBUFFER_NUMBER = "SDL.window.uikit.opengl.framebuffer";
    public static final String SDL_PROP_WINDOW_UIKIT_OPENGL_RENDERBUFFER_NUMBER = "SDL.window.uikit.opengl.renderbuffer";
    public static final String SDL_PROP_WINDOW_UIKIT_OPENGL_RESOLVE_FRAMEBUFFER_NUMBER = "SDL.window.uikit.opengl.resolve_framebuffer";
    public static final String SDL_PROP_WINDOW_KMSDRM_DEVICE_INDEX_NUMBER = "SDL.window.kmsdrm.dev_index";
    public static final String SDL_PROP_WINDOW_KMSDRM_DRM_FD_NUMBER = "SDL.window.kmsdrm.drm_fd";
    public static final String SDL_PROP_WINDOW_KMSDRM_GBM_DEVICE_POINTER = "SDL.window.kmsdrm.gbm_dev";
    public static final String SDL_PROP_WINDOW_COCOA_WINDOW_POINTER = "SDL.window.cocoa.window";
    public static final String SDL_PROP_WINDOW_COCOA_METAL_VIEW_TAG_NUMBER = "SDL.window.cocoa.metal_view_tag";
    public static final String SDL_PROP_WINDOW_OPENVR_OVERLAY_ID_NUMBER = "SDL.window.openvr.overlay_id";
    public static final String SDL_PROP_WINDOW_VIVANTE_DISPLAY_POINTER = "SDL.window.vivante.display";
    public static final String SDL_PROP_WINDOW_VIVANTE_WINDOW_POINTER = "SDL.window.vivante.window";
    public static final String SDL_PROP_WINDOW_VIVANTE_SURFACE_POINTER = "SDL.window.vivante.surface";
    public static final String SDL_PROP_WINDOW_WIN32_HWND_POINTER = "SDL.window.win32.hwnd";
    public static final String SDL_PROP_WINDOW_WIN32_HDC_POINTER = "SDL.window.win32.hdc";
    public static final String SDL_PROP_WINDOW_WIN32_INSTANCE_POINTER = "SDL.window.win32.instance";
    public static final String SDL_PROP_WINDOW_WAYLAND_DISPLAY_POINTER = "SDL.window.wayland.display";
    public static final String SDL_PROP_WINDOW_WAYLAND_SURFACE_POINTER = "SDL.window.wayland.surface";
    public static final String SDL_PROP_WINDOW_WAYLAND_VIEWPORT_POINTER = "SDL.window.wayland.viewport";
    public static final String SDL_PROP_WINDOW_WAYLAND_EGL_WINDOW_POINTER = "SDL.window.wayland.egl_window";
    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_SURFACE_POINTER = "SDL.window.wayland.xdg_surface";
    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_POINTER = "SDL.window.wayland.xdg_toplevel";
    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_EXPORT_HANDLE_STRING = "SDL.window.wayland.xdg_toplevel_export_handle";
    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_POPUP_POINTER = "SDL.window.wayland.xdg_popup";
    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_POSITIONER_POINTER = "SDL.window.wayland.xdg_positioner";
    public static final String SDL_PROP_WINDOW_X11_DISPLAY_POINTER = "SDL.window.x11.display";
    public static final String SDL_PROP_WINDOW_X11_SCREEN_NUMBER = "SDL.window.x11.screen";
    public static final String SDL_PROP_WINDOW_X11_WINDOW_NUMBER = "SDL.window.x11.window";
    public static final String SDL_PROP_WINDOW_EMSCRIPTEN_CANVAS_ID_STRING = "SDL.window.emscripten.canvas_id";
    public static final String SDL_PROP_WINDOW_EMSCRIPTEN_KEYBOARD_ELEMENT_STRING = "SDL.window.emscripten.keyboard_element";
    public static final int SDL_WINDOW_SURFACE_VSYNC_DISABLED = 0;
    public static final int SDL_WINDOW_SURFACE_VSYNC_ADAPTIVE = -1;
    public static final int SDL_HITTEST_NORMAL = 0;
    public static final int SDL_HITTEST_DRAGGABLE = 1;
    public static final int SDL_HITTEST_RESIZE_TOPLEFT = 2;
    public static final int SDL_HITTEST_RESIZE_TOP = 3;
    public static final int SDL_HITTEST_RESIZE_TOPRIGHT = 4;
    public static final int SDL_HITTEST_RESIZE_RIGHT = 5;
    public static final int SDL_HITTEST_RESIZE_BOTTOMRIGHT = 6;
    public static final int SDL_HITTEST_RESIZE_BOTTOM = 7;
    public static final int SDL_HITTEST_RESIZE_BOTTOMLEFT = 8;
    public static final int SDL_HITTEST_RESIZE_LEFT = 9;
    public static final int SDL_WINDOWPOS_UNDEFINED = SDL_WINDOWPOS_UNDEFINED_DISPLAY(0);
    public static final int SDL_WINDOWPOS_CENTERED = SDL_WINDOWPOS_CENTERED_DISPLAY(0);

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLVideo$Functions.class */
    public static final class Functions {
        public static final long GetNumVideoDrivers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumVideoDrivers");
        public static final long GetVideoDriver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetVideoDriver");
        public static final long GetCurrentVideoDriver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentVideoDriver");
        public static final long GetSystemTheme = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSystemTheme");
        public static final long GetDisplays = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplays");
        public static final long GetPrimaryDisplay = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPrimaryDisplay");
        public static final long GetDisplayProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayProperties");
        public static final long GetDisplayName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayName");
        public static final long GetDisplayBounds = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayBounds");
        public static final long GetDisplayUsableBounds = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayUsableBounds");
        public static final long GetNaturalDisplayOrientation = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNaturalDisplayOrientation");
        public static final long GetCurrentDisplayOrientation = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentDisplayOrientation");
        public static final long GetDisplayContentScale = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayContentScale");
        public static final long GetFullscreenDisplayModes = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetFullscreenDisplayModes");
        public static final long GetClosestFullscreenDisplayMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetClosestFullscreenDisplayMode");
        public static final long GetDesktopDisplayMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDesktopDisplayMode");
        public static final long GetCurrentDisplayMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentDisplayMode");
        public static final long GetDisplayForPoint = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayForPoint");
        public static final long GetDisplayForRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayForRect");
        public static final long GetDisplayForWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayForWindow");
        public static final long GetWindowPixelDensity = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowPixelDensity");
        public static final long GetWindowDisplayScale = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowDisplayScale");
        public static final long SetWindowFullscreenMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowFullscreenMode");
        public static final long GetWindowFullscreenMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowFullscreenMode");
        public static final long GetWindowICCProfile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowICCProfile");
        public static final long GetWindowPixelFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowPixelFormat");
        public static final long GetWindows = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindows");
        public static final long CreateWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateWindow");
        public static final long CreatePopupWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreatePopupWindow");
        public static final long CreateWindowWithProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateWindowWithProperties");
        public static final long GetWindowID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowID");
        public static final long GetWindowFromID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowFromID");
        public static final long GetWindowParent = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowParent");
        public static final long GetWindowProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowProperties");
        public static final long GetWindowFlags = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowFlags");
        public static final long SetWindowTitle = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowTitle");
        public static final long GetWindowTitle = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowTitle");
        public static final long SetWindowIcon = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowIcon");
        public static final long SetWindowPosition = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowPosition");
        public static final long GetWindowPosition = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowPosition");
        public static final long SetWindowSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowSize");
        public static final long GetWindowSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSize");
        public static final long GetWindowSafeArea = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSafeArea");
        public static final long SetWindowAspectRatio = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowAspectRatio");
        public static final long GetWindowAspectRatio = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowAspectRatio");
        public static final long GetWindowBordersSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowBordersSize");
        public static final long GetWindowSizeInPixels = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSizeInPixels");
        public static final long SetWindowMinimumSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowMinimumSize");
        public static final long GetWindowMinimumSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowMinimumSize");
        public static final long SetWindowMaximumSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowMaximumSize");
        public static final long GetWindowMaximumSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowMaximumSize");
        public static final long SetWindowBordered = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowBordered");
        public static final long SetWindowResizable = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowResizable");
        public static final long SetWindowAlwaysOnTop = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowAlwaysOnTop");
        public static final long SetWindowFillDocument = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowFillDocument");
        public static final long ShowWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowWindow");
        public static final long HideWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HideWindow");
        public static final long RaiseWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RaiseWindow");
        public static final long MaximizeWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_MaximizeWindow");
        public static final long MinimizeWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_MinimizeWindow");
        public static final long RestoreWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RestoreWindow");
        public static final long SetWindowFullscreen = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowFullscreen");
        public static final long SyncWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SyncWindow");
        public static final long WindowHasSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WindowHasSurface");
        public static final long GetWindowSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSurface");
        public static final long SetWindowSurfaceVSync = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowSurfaceVSync");
        public static final long GetWindowSurfaceVSync = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSurfaceVSync");
        public static final long UpdateWindowSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateWindowSurface");
        public static final long UpdateWindowSurfaceRects = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateWindowSurfaceRects");
        public static final long DestroyWindowSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyWindowSurface");
        public static final long SetWindowKeyboardGrab = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowKeyboardGrab");
        public static final long SetWindowMouseGrab = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowMouseGrab");
        public static final long GetWindowKeyboardGrab = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowKeyboardGrab");
        public static final long GetWindowMouseGrab = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowMouseGrab");
        public static final long GetGrabbedWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGrabbedWindow");
        public static final long SetWindowMouseRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowMouseRect");
        public static final long GetWindowMouseRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowMouseRect");
        public static final long SetWindowOpacity = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowOpacity");
        public static final long GetWindowOpacity = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowOpacity");
        public static final long SetWindowParent = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowParent");
        public static final long SetWindowModal = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowModal");
        public static final long SetWindowFocusable = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowFocusable");
        public static final long ShowWindowSystemMenu = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowWindowSystemMenu");
        public static final long SetWindowHitTest = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowHitTest");
        public static final long SetWindowShape = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowShape");
        public static final long FlashWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlashWindow");
        public static final long SetWindowProgressState = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowProgressState");
        public static final long GetWindowProgressState = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowProgressState");
        public static final long SetWindowProgressValue = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowProgressValue");
        public static final long GetWindowProgressValue = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowProgressValue");
        public static final long DestroyWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyWindow");
        public static final long ScreenSaverEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ScreenSaverEnabled");
        public static final long EnableScreenSaver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnableScreenSaver");
        public static final long DisableScreenSaver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DisableScreenSaver");
        public static final long GL_LoadLibrary = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_LoadLibrary");
        public static final long GL_GetProcAddress = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetProcAddress");
        public static final long EGL_GetProcAddress = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_GetProcAddress");
        public static final long GL_UnloadLibrary = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_UnloadLibrary");
        public static final long GL_ExtensionSupported = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_ExtensionSupported");
        public static final long GL_ResetAttributes = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_ResetAttributes");
        public static final long GL_SetAttribute = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_SetAttribute");
        public static final long GL_GetAttribute = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetAttribute");
        public static final long GL_CreateContext = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_CreateContext");
        public static final long GL_MakeCurrent = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_MakeCurrent");
        public static final long GL_GetCurrentWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetCurrentWindow");
        public static final long GL_GetCurrentContext = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetCurrentContext");
        public static final long EGL_GetCurrentDisplay = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_GetCurrentDisplay");
        public static final long EGL_GetCurrentConfig = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_GetCurrentConfig");
        public static final long EGL_GetWindowSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_GetWindowSurface");
        public static final long EGL_SetAttributeCallbacks = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_SetAttributeCallbacks");
        public static final long GL_SetSwapInterval = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_SetSwapInterval");
        public static final long GL_GetSwapInterval = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetSwapInterval");
        public static final long GL_SwapWindow = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_SwapWindow");
        public static final long GL_DestroyContext = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_DestroyContext");

        private Functions() {
        }
    }

    protected SDLVideo() {
        throw new UnsupportedOperationException();
    }

    public static int SDL_GetNumVideoDrivers() {
        long __functionAddress = Functions.GetNumVideoDrivers;
        return JNI.invokeI(__functionAddress);
    }

    public static long nSDL_GetVideoDriver(int index) {
        long __functionAddress = Functions.GetVideoDriver;
        return JNI.invokeP(index, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetVideoDriver(int index) {
        long __result = nSDL_GetVideoDriver(index);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nSDL_GetCurrentVideoDriver() {
        long __functionAddress = Functions.GetCurrentVideoDriver;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetCurrentVideoDriver() {
        long __result = nSDL_GetCurrentVideoDriver();
        return MemoryUtil.memASCIISafe(__result);
    }

    @NativeType("SDL_SystemTheme")
    public static int SDL_GetSystemTheme() {
        long __functionAddress = Functions.GetSystemTheme;
        return JNI.invokeI(__functionAddress);
    }

    public static long nSDL_GetDisplays(long count) {
        long __functionAddress = Functions.GetDisplays;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_DisplayID *")
    public static IntBuffer SDL_GetDisplays() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetDisplays(MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("SDL_DisplayID")
    public static int SDL_GetPrimaryDisplay() {
        long __functionAddress = Functions.GetPrimaryDisplay;
        return JNI.invokeI(__functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetDisplayProperties(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetDisplayProperties;
        return JNI.invokeI(displayID, __functionAddress);
    }

    public static long nSDL_GetDisplayName(int displayID) {
        long __functionAddress = Functions.GetDisplayName;
        return JNI.invokeP(displayID, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetDisplayName(@NativeType("SDL_DisplayID") int displayID) {
        long __result = nSDL_GetDisplayName(displayID);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static boolean nSDL_GetDisplayBounds(int displayID, long rect) {
        long __functionAddress = Functions.GetDisplayBounds;
        return JNI.invokePZ(displayID, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetDisplayBounds(@NativeType("SDL_DisplayID") int displayID, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetDisplayBounds(displayID, rect.address());
    }

    public static boolean nSDL_GetDisplayUsableBounds(int displayID, long rect) {
        long __functionAddress = Functions.GetDisplayUsableBounds;
        return JNI.invokePZ(displayID, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetDisplayUsableBounds(@NativeType("SDL_DisplayID") int displayID, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetDisplayUsableBounds(displayID, rect.address());
    }

    @NativeType("SDL_DisplayOrientation")
    public static int SDL_GetNaturalDisplayOrientation(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetNaturalDisplayOrientation;
        return JNI.invokeI(displayID, __functionAddress);
    }

    @NativeType("SDL_DisplayOrientation")
    public static int SDL_GetCurrentDisplayOrientation(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetCurrentDisplayOrientation;
        return JNI.invokeI(displayID, __functionAddress);
    }

    public static float SDL_GetDisplayContentScale(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetDisplayContentScale;
        return JNI.invokeF(displayID, __functionAddress);
    }

    public static long nSDL_GetFullscreenDisplayModes(int displayID, long count) {
        long __functionAddress = Functions.GetFullscreenDisplayModes;
        return JNI.invokePP(displayID, count, __functionAddress);
    }

    @NativeType("SDL_DisplayMode **")
    public static PointerBuffer SDL_GetFullscreenDisplayModes(@NativeType("SDL_DisplayID") int displayID) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetFullscreenDisplayModes(displayID, MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_GetClosestFullscreenDisplayMode(int displayID, int w, int h, float refresh_rate, boolean include_high_density_modes, long closest) {
        long __functionAddress = Functions.GetClosestFullscreenDisplayMode;
        return JNI.invokePZ(displayID, w, h, refresh_rate, include_high_density_modes, closest, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetClosestFullscreenDisplayMode(@NativeType("SDL_DisplayID") int displayID, int w, int h, float refresh_rate, @NativeType("bool") boolean include_high_density_modes, @NativeType("SDL_DisplayMode *") SDL_DisplayMode closest) {
        return nSDL_GetClosestFullscreenDisplayMode(displayID, w, h, refresh_rate, include_high_density_modes, closest.address());
    }

    public static long nSDL_GetDesktopDisplayMode(int displayID) {
        long __functionAddress = Functions.GetDesktopDisplayMode;
        return JNI.invokeP(displayID, __functionAddress);
    }

    @NativeType("SDL_DisplayMode const *")
    public static SDL_DisplayMode SDL_GetDesktopDisplayMode(@NativeType("SDL_DisplayID") int displayID) {
        long __result = nSDL_GetDesktopDisplayMode(displayID);
        return SDL_DisplayMode.createSafe(__result);
    }

    public static long nSDL_GetCurrentDisplayMode(int displayID) {
        long __functionAddress = Functions.GetCurrentDisplayMode;
        return JNI.invokeP(displayID, __functionAddress);
    }

    @NativeType("SDL_DisplayMode const *")
    public static SDL_DisplayMode SDL_GetCurrentDisplayMode(@NativeType("SDL_DisplayID") int displayID) {
        long __result = nSDL_GetCurrentDisplayMode(displayID);
        return SDL_DisplayMode.createSafe(__result);
    }

    public static int nSDL_GetDisplayForPoint(long point) {
        long __functionAddress = Functions.GetDisplayForPoint;
        return JNI.invokePI(point, __functionAddress);
    }

    @NativeType("SDL_DisplayID")
    public static int SDL_GetDisplayForPoint(@NativeType("SDL_Point const *") SDL_Point point) {
        return nSDL_GetDisplayForPoint(point.address());
    }

    public static int nSDL_GetDisplayForRect(long rect) {
        long __functionAddress = Functions.GetDisplayForRect;
        return JNI.invokePI(rect, __functionAddress);
    }

    @NativeType("SDL_DisplayID")
    public static int SDL_GetDisplayForRect(@NativeType("SDL_Rect const *") SDL_Rect rect) {
        return nSDL_GetDisplayForRect(rect.address());
    }

    @NativeType("SDL_DisplayID")
    public static int SDL_GetDisplayForWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetDisplayForWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePI(window, __functionAddress);
    }

    public static float SDL_GetWindowPixelDensity(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowPixelDensity;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePF(window, __functionAddress);
    }

    public static float SDL_GetWindowDisplayScale(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowDisplayScale;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePF(window, __functionAddress);
    }

    public static boolean nSDL_SetWindowFullscreenMode(long window, long mode) {
        long __functionAddress = Functions.SetWindowFullscreenMode;
        if (Checks.CHECKS) {
            Checks.check(window);
            if (mode != 0) {
                SDL_DisplayMode.validate(mode);
            }
        }
        return JNI.invokePPZ(window, mode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowFullscreenMode(@NativeType("SDL_Window *") long window, @NativeType("SDL_DisplayMode const *") SDL_DisplayMode mode) {
        return nSDL_SetWindowFullscreenMode(window, MemoryUtil.memAddressSafe(mode));
    }

    public static long nSDL_GetWindowFullscreenMode(long window) {
        long __functionAddress = Functions.GetWindowFullscreenMode;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePP(window, __functionAddress);
    }

    @NativeType("SDL_DisplayMode const *")
    public static SDL_DisplayMode SDL_GetWindowFullscreenMode(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowFullscreenMode(window);
        return SDL_DisplayMode.createSafe(__result);
    }

    public static long nSDL_GetWindowICCProfile(long window, long size) {
        long __functionAddress = Functions.GetWindowICCProfile;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPP(window, size, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_GetWindowICCProfile(@NativeType("SDL_Window *") long window) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nSDL_GetWindowICCProfile(window, MemoryUtil.memAddress(size));
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, (int) size.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("SDL_PixelFormat")
    public static int SDL_GetWindowPixelFormat(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowPixelFormat;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePI(window, __functionAddress);
    }

    public static long nSDL_GetWindows(long count) {
        long __functionAddress = Functions.GetWindows;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_Window **")
    public static PointerBuffer SDL_GetWindows() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetWindows(MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_CreateWindow(long title, int w, int h, long flags) {
        long __functionAddress = Functions.CreateWindow;
        return JNI.invokePJP(title, w, h, flags, __functionAddress);
    }

    @NativeType("SDL_Window *")
    public static long SDL_CreateWindow(@NativeType("char const *") ByteBuffer title, int w, int h, @NativeType("SDL_WindowFlags") long flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(title);
        }
        return nSDL_CreateWindow(MemoryUtil.memAddressSafe(title), w, h, flags);
    }

    @NativeType("SDL_Window *")
    public static long SDL_CreateWindow(@NativeType("char const *") CharSequence title, int w, int h, @NativeType("SDL_WindowFlags") long flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(title, true);
            long titleEncoded = title == null ? 0L : stack.getPointerAddress();
            long jNSDL_CreateWindow = nSDL_CreateWindow(titleEncoded, w, h, flags);
            stack.setPointer(stackPointer);
            return jNSDL_CreateWindow;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("SDL_Window *")
    public static long SDL_CreatePopupWindow(@NativeType("SDL_Window *") long parent, int offset_x, int offset_y, int w, int h, @NativeType("SDL_WindowFlags") long flags) {
        long __functionAddress = Functions.CreatePopupWindow;
        if (Checks.CHECKS) {
            Checks.check(parent);
        }
        return JNI.invokePJP(parent, offset_x, offset_y, w, h, flags, __functionAddress);
    }

    @NativeType("SDL_Window *")
    public static long SDL_CreateWindowWithProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.CreateWindowWithProperties;
        return JNI.invokeP(props, __functionAddress);
    }

    @NativeType("SDL_WindowID")
    public static int SDL_GetWindowID(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowID;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePI(window, __functionAddress);
    }

    @NativeType("SDL_Window *")
    public static long SDL_GetWindowFromID(@NativeType("SDL_WindowID") int id) {
        long __functionAddress = Functions.GetWindowFromID;
        return JNI.invokeP(id, __functionAddress);
    }

    @NativeType("SDL_Window *")
    public static long SDL_GetWindowParent(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowParent;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePP(window, __functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetWindowProperties(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowProperties;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePI(window, __functionAddress);
    }

    @NativeType("SDL_WindowFlags")
    public static long SDL_GetWindowFlags(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowFlags;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePJ(window, __functionAddress);
    }

    public static boolean nSDL_SetWindowTitle(long window, long title) {
        long __functionAddress = Functions.SetWindowTitle;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPZ(window, title, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowTitle(@NativeType("SDL_Window *") long window, @NativeType("char const *") ByteBuffer title) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(title);
        }
        return nSDL_SetWindowTitle(window, MemoryUtil.memAddressSafe(title));
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowTitle(@NativeType("SDL_Window *") long window, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(title, true);
            long titleEncoded = title == null ? 0L : stack.getPointerAddress();
            boolean zNSDL_SetWindowTitle = nSDL_SetWindowTitle(window, titleEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_SetWindowTitle;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetWindowTitle(long window) {
        long __functionAddress = Functions.GetWindowTitle;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePP(window, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetWindowTitle(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowTitle(window);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static boolean nSDL_SetWindowIcon(long window, long icon) {
        long __functionAddress = Functions.SetWindowIcon;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPZ(window, icon, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowIcon(@NativeType("SDL_Window *") long window, @NativeType("SDL_Surface *") SDL_Surface icon) {
        return nSDL_SetWindowIcon(window, icon.address());
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowPosition(@NativeType("SDL_Window *") long window, int x, int y) {
        long __functionAddress = Functions.SetWindowPosition;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, x, y, __functionAddress);
    }

    public static boolean nSDL_GetWindowPosition(long window, long x, long y) {
        long __functionAddress = Functions.GetWindowPosition;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPZ(window, x, y, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowPosition(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) x, 1);
            Checks.checkSafe((Buffer) y, 1);
        }
        return nSDL_GetWindowPosition(window, MemoryUtil.memAddressSafe(x), MemoryUtil.memAddressSafe(y));
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowSize(@NativeType("SDL_Window *") long window, int w, int h) {
        long __functionAddress = Functions.SetWindowSize;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, w, h, __functionAddress);
    }

    public static boolean nSDL_GetWindowSize(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowSize;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPZ(window, w, h, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowSize(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) w, 1);
            Checks.checkSafe((Buffer) h, 1);
        }
        return nSDL_GetWindowSize(window, MemoryUtil.memAddressSafe(w), MemoryUtil.memAddressSafe(h));
    }

    public static boolean nSDL_GetWindowSafeArea(long window, long rect) {
        long __functionAddress = Functions.GetWindowSafeArea;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPZ(window, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowSafeArea(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetWindowSafeArea(window, rect.address());
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowAspectRatio(@NativeType("SDL_Window *") long window, float min_aspect, float max_aspect) {
        long __functionAddress = Functions.SetWindowAspectRatio;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, min_aspect, max_aspect, __functionAddress);
    }

    public static boolean nSDL_GetWindowAspectRatio(long window, long min_aspect, long max_aspect) {
        long __functionAddress = Functions.GetWindowAspectRatio;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPZ(window, min_aspect, max_aspect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowAspectRatio(@NativeType("SDL_Window *") long window, @NativeType("float *") FloatBuffer min_aspect, @NativeType("float *") FloatBuffer max_aspect) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) min_aspect, 1);
            Checks.checkSafe((Buffer) max_aspect, 1);
        }
        return nSDL_GetWindowAspectRatio(window, MemoryUtil.memAddressSafe(min_aspect), MemoryUtil.memAddressSafe(max_aspect));
    }

    public static boolean nSDL_GetWindowBordersSize(long window, long top2, long left, long bottom, long right) {
        long __functionAddress = Functions.GetWindowBordersSize;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPPPZ(window, top2, left, bottom, right, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowBordersSize(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer top2, @NativeType("int *") IntBuffer left, @NativeType("int *") IntBuffer bottom, @NativeType("int *") IntBuffer right) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) top2, 1);
            Checks.checkSafe((Buffer) left, 1);
            Checks.checkSafe((Buffer) bottom, 1);
            Checks.checkSafe((Buffer) right, 1);
        }
        return nSDL_GetWindowBordersSize(window, MemoryUtil.memAddressSafe(top2), MemoryUtil.memAddressSafe(left), MemoryUtil.memAddressSafe(bottom), MemoryUtil.memAddressSafe(right));
    }

    public static boolean nSDL_GetWindowSizeInPixels(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowSizeInPixels;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPZ(window, w, h, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowSizeInPixels(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) w, 1);
            Checks.checkSafe((Buffer) h, 1);
        }
        return nSDL_GetWindowSizeInPixels(window, MemoryUtil.memAddressSafe(w), MemoryUtil.memAddressSafe(h));
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowMinimumSize(@NativeType("SDL_Window *") long window, int min_w, int min_h) {
        long __functionAddress = Functions.SetWindowMinimumSize;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, min_w, min_h, __functionAddress);
    }

    public static boolean nSDL_GetWindowMinimumSize(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowMinimumSize;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPZ(window, w, h, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowMinimumSize(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) w, 1);
            Checks.checkSafe((Buffer) h, 1);
        }
        return nSDL_GetWindowMinimumSize(window, MemoryUtil.memAddressSafe(w), MemoryUtil.memAddressSafe(h));
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowMaximumSize(@NativeType("SDL_Window *") long window, int max_w, int max_h) {
        long __functionAddress = Functions.SetWindowMaximumSize;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, max_w, max_h, __functionAddress);
    }

    public static boolean nSDL_GetWindowMaximumSize(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowMaximumSize;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPZ(window, w, h, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowMaximumSize(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) w, 1);
            Checks.checkSafe((Buffer) h, 1);
        }
        return nSDL_GetWindowMaximumSize(window, MemoryUtil.memAddressSafe(w), MemoryUtil.memAddressSafe(h));
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowBordered(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean bordered) {
        long __functionAddress = Functions.SetWindowBordered;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, bordered, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowResizable(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean resizable) {
        long __functionAddress = Functions.SetWindowResizable;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, resizable, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowAlwaysOnTop(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean on_top) {
        long __functionAddress = Functions.SetWindowAlwaysOnTop;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, on_top, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowFillDocument(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean fill) {
        long __functionAddress = Functions.SetWindowFillDocument;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, fill, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ShowWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ShowWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HideWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.HideWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RaiseWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.RaiseWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_MaximizeWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.MaximizeWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_MinimizeWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.MinimizeWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RestoreWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.RestoreWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowFullscreen(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean fullscreen) {
        long __functionAddress = Functions.SetWindowFullscreen;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, fullscreen, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SyncWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.SyncWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WindowHasSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.WindowHasSurface;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    public static long nSDL_GetWindowSurface(long window) {
        long __functionAddress = Functions.GetWindowSurface;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePP(window, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_GetWindowSurface(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowSurface(window);
        return SDL_Surface.createSafe(__result);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowSurfaceVSync(@NativeType("SDL_Window *") long window, int vsync) {
        long __functionAddress = Functions.SetWindowSurfaceVSync;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, vsync, __functionAddress);
    }

    public static boolean nSDL_GetWindowSurfaceVSync(long window, long vsync) {
        long __functionAddress = Functions.GetWindowSurfaceVSync;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPZ(window, vsync, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowSurfaceVSync(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer vsync) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) vsync, 1);
        }
        return nSDL_GetWindowSurfaceVSync(window, MemoryUtil.memAddress(vsync));
    }

    @NativeType("bool")
    public static boolean SDL_UpdateWindowSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.UpdateWindowSurface;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    public static boolean nSDL_UpdateWindowSurfaceRects(long window, long rects, int numrects) {
        long __functionAddress = Functions.UpdateWindowSurfaceRects;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPZ(window, rects, numrects, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_UpdateWindowSurfaceRects(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect const *") SDL_Rect.Buffer rects) {
        return nSDL_UpdateWindowSurfaceRects(window, rects.address(), rects.remaining());
    }

    @NativeType("bool")
    public static boolean SDL_DestroyWindowSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.DestroyWindowSurface;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowKeyboardGrab(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean grabbed) {
        long __functionAddress = Functions.SetWindowKeyboardGrab;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, grabbed, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowMouseGrab(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean grabbed) {
        long __functionAddress = Functions.SetWindowMouseGrab;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, grabbed, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowKeyboardGrab(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowKeyboardGrab;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetWindowMouseGrab(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowMouseGrab;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("SDL_Window *")
    public static long SDL_GetGrabbedWindow() {
        long __functionAddress = Functions.GetGrabbedWindow;
        return JNI.invokeP(__functionAddress);
    }

    public static boolean nSDL_SetWindowMouseRect(long window, long rect) {
        long __functionAddress = Functions.SetWindowMouseRect;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPZ(window, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowMouseRect(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect const *") SDL_Rect rect) {
        return nSDL_SetWindowMouseRect(window, rect.address());
    }

    public static long nSDL_GetWindowMouseRect(long window) {
        long __functionAddress = Functions.GetWindowMouseRect;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePP(window, __functionAddress);
    }

    @NativeType("SDL_Rect const *")
    public static SDL_Rect SDL_GetWindowMouseRect(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowMouseRect(window);
        return SDL_Rect.createSafe(__result);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowOpacity(@NativeType("SDL_Window *") long window, float opacity) {
        long __functionAddress = Functions.SetWindowOpacity;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, opacity, __functionAddress);
    }

    public static float SDL_GetWindowOpacity(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowOpacity;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePF(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowParent(@NativeType("SDL_Window *") long window, @NativeType("SDL_Window *") long parent) {
        long __functionAddress = Functions.SetWindowParent;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPZ(window, parent, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowModal(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean modal) {
        long __functionAddress = Functions.SetWindowModal;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, modal, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowFocusable(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean focusable) {
        long __functionAddress = Functions.SetWindowFocusable;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, focusable, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ShowWindowSystemMenu(@NativeType("SDL_Window *") long window, int x, int y) {
        long __functionAddress = Functions.ShowWindowSystemMenu;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, x, y, __functionAddress);
    }

    public static boolean nSDL_SetWindowHitTest(long window, long callback, long callback_data) {
        long __functionAddress = Functions.SetWindowHitTest;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPZ(window, callback, callback_data, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowHitTest(@NativeType("SDL_Window *") long window, @NativeType("SDL_HitTest") SDL_HitTestI callback, @NativeType("void *") long callback_data) {
        return nSDL_SetWindowHitTest(window, MemoryUtil.memAddressSafe(callback), callback_data);
    }

    public static boolean nSDL_SetWindowShape(long window, long shape) {
        long __functionAddress = Functions.SetWindowShape;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPZ(window, shape, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowShape(@NativeType("SDL_Window *") long window, @NativeType("SDL_Surface *") SDL_Surface shape) {
        return nSDL_SetWindowShape(window, MemoryUtil.memAddressSafe(shape));
    }

    @NativeType("bool")
    public static boolean SDL_FlashWindow(@NativeType("SDL_Window *") long window, @NativeType("SDL_FlashOperation") int operation) {
        long __functionAddress = Functions.FlashWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, operation, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowProgressState(@NativeType("SDL_Window *") long window, @NativeType("SDL_ProgressState") int state) {
        long __functionAddress = Functions.SetWindowProgressState;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, state, __functionAddress);
    }

    @NativeType("SDL_ProgressState")
    public static int SDL_GetWindowProgressState(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowProgressState;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePI(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetWindowProgressValue(@NativeType("SDL_Window *") long window, float value) {
        long __functionAddress = Functions.SetWindowProgressValue;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, value, __functionAddress);
    }

    public static float SDL_GetWindowProgressValue(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowProgressValue;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePF(window, __functionAddress);
    }

    public static void SDL_DestroyWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.DestroyWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        JNI.invokePV(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ScreenSaverEnabled() {
        long __functionAddress = Functions.ScreenSaverEnabled;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_EnableScreenSaver() {
        long __functionAddress = Functions.EnableScreenSaver;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_DisableScreenSaver() {
        long __functionAddress = Functions.DisableScreenSaver;
        return JNI.invokeZ(__functionAddress);
    }

    public static boolean nSDL_GL_LoadLibrary(long path) {
        long __functionAddress = Functions.GL_LoadLibrary;
        return JNI.invokePZ(path, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GL_LoadLibrary(@NativeType("char const *") ByteBuffer path) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(path);
        }
        return nSDL_GL_LoadLibrary(MemoryUtil.memAddressSafe(path));
    }

    @NativeType("bool")
    public static boolean SDL_GL_LoadLibrary(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? 0L : stack.getPointerAddress();
            boolean zNSDL_GL_LoadLibrary = nSDL_GL_LoadLibrary(pathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_GL_LoadLibrary;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GL_GetProcAddress(long proc) {
        long __functionAddress = Functions.GL_GetProcAddress;
        return JNI.invokePP(proc, __functionAddress);
    }

    @NativeType("SDL_FunctionPointer")
    public static long SDL_GL_GetProcAddress(@NativeType("char const *") ByteBuffer proc) {
        if (Checks.CHECKS) {
            Checks.checkNT1(proc);
        }
        return nSDL_GL_GetProcAddress(MemoryUtil.memAddress(proc));
    }

    @NativeType("SDL_FunctionPointer")
    public static long SDL_GL_GetProcAddress(@NativeType("char const *") CharSequence proc) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(proc, true);
            long procEncoded = stack.getPointerAddress();
            long jNSDL_GL_GetProcAddress = nSDL_GL_GetProcAddress(procEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_GL_GetProcAddress;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_EGL_GetProcAddress(long proc) {
        long __functionAddress = Functions.EGL_GetProcAddress;
        return JNI.invokePP(proc, __functionAddress);
    }

    @NativeType("SDL_FunctionPointer")
    public static long SDL_EGL_GetProcAddress(@NativeType("char const *") ByteBuffer proc) {
        if (Checks.CHECKS) {
            Checks.checkNT1(proc);
        }
        return nSDL_EGL_GetProcAddress(MemoryUtil.memAddress(proc));
    }

    @NativeType("SDL_FunctionPointer")
    public static long SDL_EGL_GetProcAddress(@NativeType("char const *") CharSequence proc) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(proc, true);
            long procEncoded = stack.getPointerAddress();
            long jNSDL_EGL_GetProcAddress = nSDL_EGL_GetProcAddress(procEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_EGL_GetProcAddress;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_GL_UnloadLibrary() {
        long __functionAddress = Functions.GL_UnloadLibrary;
        JNI.invokeV(__functionAddress);
    }

    public static boolean nSDL_GL_ExtensionSupported(long extension) {
        long __functionAddress = Functions.GL_ExtensionSupported;
        return JNI.invokePZ(extension, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GL_ExtensionSupported(@NativeType("char const *") ByteBuffer extension) {
        if (Checks.CHECKS) {
            Checks.checkNT1(extension);
        }
        return nSDL_GL_ExtensionSupported(MemoryUtil.memAddress(extension));
    }

    @NativeType("bool")
    public static boolean SDL_GL_ExtensionSupported(@NativeType("char const *") CharSequence extension) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(extension, true);
            long extensionEncoded = stack.getPointerAddress();
            boolean zNSDL_GL_ExtensionSupported = nSDL_GL_ExtensionSupported(extensionEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_GL_ExtensionSupported;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_GL_ResetAttributes() {
        long __functionAddress = Functions.GL_ResetAttributes;
        JNI.invokeV(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GL_SetAttribute(@NativeType("SDL_GLAttr") int attr, int value) {
        long __functionAddress = Functions.GL_SetAttribute;
        return JNI.invokeZ(attr, value, __functionAddress);
    }

    public static boolean nSDL_GL_GetAttribute(int attr, long value) {
        long __functionAddress = Functions.GL_GetAttribute;
        return JNI.invokePZ(attr, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GL_GetAttribute(@NativeType("SDL_GLAttr") int attr, @NativeType("int *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_GL_GetAttribute(attr, MemoryUtil.memAddress(value));
    }

    @NativeType("SDL_GLContext")
    public static long SDL_GL_CreateContext(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GL_CreateContext;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePP(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GL_MakeCurrent(@NativeType("SDL_Window *") long window, @NativeType("SDL_GLContext") long context) {
        long __functionAddress = Functions.GL_MakeCurrent;
        return JNI.invokePPZ(window, context, __functionAddress);
    }

    @NativeType("SDL_Window *")
    public static long SDL_GL_GetCurrentWindow() {
        long __functionAddress = Functions.GL_GetCurrentWindow;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("SDL_GLContext")
    public static long SDL_GL_GetCurrentContext() {
        long __functionAddress = Functions.GL_GetCurrentContext;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("SDL_EGLDisplay")
    public static long SDL_EGL_GetCurrentDisplay() {
        long __functionAddress = Functions.EGL_GetCurrentDisplay;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("SDL_EGLConfig")
    public static long SDL_EGL_GetCurrentConfig() {
        long __functionAddress = Functions.EGL_GetCurrentConfig;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("SDL_EGLSurface")
    public static long SDL_EGL_GetWindowSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.EGL_GetWindowSurface;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePP(window, __functionAddress);
    }

    public static void nSDL_EGL_SetAttributeCallbacks(long platformAttribCallback, long surfaceAttribCallback, long contextAttribCallback, long userdata) {
        long __functionAddress = Functions.EGL_SetAttributeCallbacks;
        JNI.invokePPPPV(platformAttribCallback, surfaceAttribCallback, contextAttribCallback, userdata, __functionAddress);
    }

    public static void SDL_EGL_SetAttributeCallbacks(@NativeType("SDL_EGLAttribArrayCallback") SDL_EGLAttribArrayCallbackI platformAttribCallback, @NativeType("SDL_EGLIntArrayCallback") SDL_EGLIntArrayCallbackI surfaceAttribCallback, @NativeType("SDL_EGLIntArrayCallback") SDL_EGLIntArrayCallbackI contextAttribCallback, @NativeType("void *") long userdata) {
        nSDL_EGL_SetAttributeCallbacks(MemoryUtil.memAddressSafe(platformAttribCallback), MemoryUtil.memAddressSafe(surfaceAttribCallback), MemoryUtil.memAddressSafe(contextAttribCallback), userdata);
    }

    @NativeType("bool")
    public static boolean SDL_GL_SetSwapInterval(int interval) {
        long __functionAddress = Functions.GL_SetSwapInterval;
        return JNI.invokeZ(interval, __functionAddress);
    }

    public static boolean nSDL_GL_GetSwapInterval(long interval) {
        long __functionAddress = Functions.GL_GetSwapInterval;
        return JNI.invokePZ(interval, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GL_GetSwapInterval(@NativeType("int *") IntBuffer interval) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) interval, 1);
        }
        return nSDL_GL_GetSwapInterval(MemoryUtil.memAddress(interval));
    }

    @NativeType("bool")
    public static boolean SDL_GL_SwapWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GL_SwapWindow;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePZ(window, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GL_DestroyContext(@NativeType("SDL_GLContext") long context) {
        long __functionAddress = Functions.GL_DestroyContext;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePZ(context, __functionAddress);
    }

    @NativeType("uint32_t")
    public static int SDL_WINDOWPOS_UNDEFINED_DISPLAY(@NativeType("SDL_DisplayID") int X) {
        return 536805376 | X;
    }

    @NativeType("bool")
    public static boolean SDL_WINDOWPOS_ISUNDEFINED(@NativeType("uint32_t") int X) {
        return (X & SupportMenu.CATEGORY_MASK) == 536805376;
    }

    @NativeType("uint32_t")
    public static int SDL_WINDOWPOS_CENTERED_DISPLAY(@NativeType("SDL_DisplayID") int X) {
        return 805240832 | X;
    }

    @NativeType("bool")
    public static boolean SDL_WINDOWPOS_ISCENTERED(@NativeType("uint32_t") int X) {
        return (X & SupportMenu.CATEGORY_MASK) == 805240832;
    }
}
