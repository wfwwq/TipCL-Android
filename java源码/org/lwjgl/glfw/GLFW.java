package org.lwjgl.glfw;

import android.util.ArrayMap;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFW.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFW.class */
public class GLFW {
    private static long gamepadDataPointer;
    private static ByteBuffer gamepadButtonData;
    private static FloatBuffer gamepadAxisData;
    public static final int GLFW_VERSION_MAJOR = 3;
    public static final int GLFW_VERSION_MINOR = 4;
    public static final int GLFW_VERSION_REVISION = 0;
    public static final int GLFW_TRUE = 1;
    public static final int GLFW_FALSE = 0;
    public static final int GLFW_RELEASE = 0;
    public static final int GLFW_PRESS = 1;
    public static final int GLFW_REPEAT = 2;
    public static final int GLFW_HAT_CENTERED = 0;
    public static final int GLFW_HAT_UP = 1;
    public static final int GLFW_HAT_RIGHT = 2;
    public static final int GLFW_HAT_DOWN = 4;
    public static final int GLFW_HAT_LEFT = 8;
    public static final int GLFW_HAT_RIGHT_UP = 3;
    public static final int GLFW_HAT_RIGHT_DOWN = 6;
    public static final int GLFW_HAT_LEFT_UP = 9;
    public static final int GLFW_HAT_LEFT_DOWN = 12;
    public static final int GLFW_KEY_UNKNOWN = -1;
    public static final int GLFW_KEY_SPACE = 32;
    public static final int GLFW_KEY_APOSTROPHE = 39;
    public static final int GLFW_KEY_COMMA = 44;
    public static final int GLFW_KEY_MINUS = 45;
    public static final int GLFW_KEY_PERIOD = 46;
    public static final int GLFW_KEY_SLASH = 47;
    public static final int GLFW_KEY_0 = 48;
    public static final int GLFW_KEY_1 = 49;
    public static final int GLFW_KEY_2 = 50;
    public static final int GLFW_KEY_3 = 51;
    public static final int GLFW_KEY_4 = 52;
    public static final int GLFW_KEY_5 = 53;
    public static final int GLFW_KEY_6 = 54;
    public static final int GLFW_KEY_7 = 55;
    public static final int GLFW_KEY_8 = 56;
    public static final int GLFW_KEY_9 = 57;
    public static final int GLFW_KEY_SEMICOLON = 59;
    public static final int GLFW_KEY_EQUAL = 61;
    public static final int GLFW_KEY_A = 65;
    public static final int GLFW_KEY_B = 66;
    public static final int GLFW_KEY_C = 67;
    public static final int GLFW_KEY_D = 68;
    public static final int GLFW_KEY_E = 69;
    public static final int GLFW_KEY_F = 70;
    public static final int GLFW_KEY_G = 71;
    public static final int GLFW_KEY_H = 72;
    public static final int GLFW_KEY_I = 73;
    public static final int GLFW_KEY_J = 74;
    public static final int GLFW_KEY_K = 75;
    public static final int GLFW_KEY_L = 76;
    public static final int GLFW_KEY_M = 77;
    public static final int GLFW_KEY_N = 78;
    public static final int GLFW_KEY_O = 79;
    public static final int GLFW_KEY_P = 80;
    public static final int GLFW_KEY_Q = 81;
    public static final int GLFW_KEY_R = 82;
    public static final int GLFW_KEY_S = 83;
    public static final int GLFW_KEY_T = 84;
    public static final int GLFW_KEY_U = 85;
    public static final int GLFW_KEY_V = 86;
    public static final int GLFW_KEY_W = 87;
    public static final int GLFW_KEY_X = 88;
    public static final int GLFW_KEY_Y = 89;
    public static final int GLFW_KEY_Z = 90;
    public static final int GLFW_KEY_LEFT_BRACKET = 91;
    public static final int GLFW_KEY_BACKSLASH = 92;
    public static final int GLFW_KEY_RIGHT_BRACKET = 93;
    public static final int GLFW_KEY_GRAVE_ACCENT = 96;
    public static final int GLFW_KEY_WORLD_1 = 161;
    public static final int GLFW_KEY_WORLD_2 = 162;
    public static final int GLFW_KEY_ESCAPE = 256;
    public static final int GLFW_KEY_ENTER = 257;
    public static final int GLFW_KEY_TAB = 258;
    public static final int GLFW_KEY_BACKSPACE = 259;
    public static final int GLFW_KEY_INSERT = 260;
    public static final int GLFW_KEY_DELETE = 261;
    public static final int GLFW_KEY_RIGHT = 262;
    public static final int GLFW_KEY_LEFT = 263;
    public static final int GLFW_KEY_DOWN = 264;
    public static final int GLFW_KEY_UP = 265;
    public static final int GLFW_KEY_PAGE_UP = 266;
    public static final int GLFW_KEY_PAGE_DOWN = 267;
    public static final int GLFW_KEY_HOME = 268;
    public static final int GLFW_KEY_END = 269;
    public static final int GLFW_KEY_CAPS_LOCK = 280;
    public static final int GLFW_KEY_SCROLL_LOCK = 281;
    public static final int GLFW_KEY_NUM_LOCK = 282;
    public static final int GLFW_KEY_PRINT_SCREEN = 283;
    public static final int GLFW_KEY_PAUSE = 284;
    public static final int GLFW_KEY_F1 = 290;
    public static final int GLFW_KEY_F2 = 291;
    public static final int GLFW_KEY_F3 = 292;
    public static final int GLFW_KEY_F4 = 293;
    public static final int GLFW_KEY_F5 = 294;
    public static final int GLFW_KEY_F6 = 295;
    public static final int GLFW_KEY_F7 = 296;
    public static final int GLFW_KEY_F8 = 297;
    public static final int GLFW_KEY_F9 = 298;
    public static final int GLFW_KEY_F10 = 299;
    public static final int GLFW_KEY_F11 = 300;
    public static final int GLFW_KEY_F12 = 301;
    public static final int GLFW_KEY_F13 = 302;
    public static final int GLFW_KEY_F14 = 303;
    public static final int GLFW_KEY_F15 = 304;
    public static final int GLFW_KEY_F16 = 305;
    public static final int GLFW_KEY_F17 = 306;
    public static final int GLFW_KEY_F18 = 307;
    public static final int GLFW_KEY_F19 = 308;
    public static final int GLFW_KEY_F20 = 309;
    public static final int GLFW_KEY_F21 = 310;
    public static final int GLFW_KEY_F22 = 311;
    public static final int GLFW_KEY_F23 = 312;
    public static final int GLFW_KEY_F24 = 313;
    public static final int GLFW_KEY_F25 = 314;
    public static final int GLFW_KEY_KP_0 = 320;
    public static final int GLFW_KEY_KP_1 = 321;
    public static final int GLFW_KEY_KP_2 = 322;
    public static final int GLFW_KEY_KP_3 = 323;
    public static final int GLFW_KEY_KP_4 = 324;
    public static final int GLFW_KEY_KP_5 = 325;
    public static final int GLFW_KEY_KP_6 = 326;
    public static final int GLFW_KEY_KP_7 = 327;
    public static final int GLFW_KEY_KP_8 = 328;
    public static final int GLFW_KEY_KP_9 = 329;
    public static final int GLFW_KEY_KP_DECIMAL = 330;
    public static final int GLFW_KEY_KP_DIVIDE = 331;
    public static final int GLFW_KEY_KP_MULTIPLY = 332;
    public static final int GLFW_KEY_KP_SUBTRACT = 333;
    public static final int GLFW_KEY_KP_ADD = 334;
    public static final int GLFW_KEY_KP_ENTER = 335;
    public static final int GLFW_KEY_KP_EQUAL = 336;
    public static final int GLFW_KEY_LEFT_SHIFT = 340;
    public static final int GLFW_KEY_LEFT_CONTROL = 341;
    public static final int GLFW_KEY_LEFT_ALT = 342;
    public static final int GLFW_KEY_LEFT_SUPER = 343;
    public static final int GLFW_KEY_RIGHT_SHIFT = 344;
    public static final int GLFW_KEY_RIGHT_CONTROL = 345;
    public static final int GLFW_KEY_RIGHT_ALT = 346;
    public static final int GLFW_KEY_RIGHT_SUPER = 347;
    public static final int GLFW_KEY_MENU = 348;
    public static final int GLFW_KEY_LAST = 348;
    public static final int GLFW_MOD_SHIFT = 1;
    public static final int GLFW_MOD_CONTROL = 2;
    public static final int GLFW_MOD_ALT = 4;
    public static final int GLFW_MOD_SUPER = 8;
    public static final int GLFW_MOD_CAPS_LOCK = 16;
    public static final int GLFW_MOD_NUM_LOCK = 32;
    public static final int GLFW_MOUSE_BUTTON_1 = 0;
    public static final int GLFW_MOUSE_BUTTON_2 = 1;
    public static final int GLFW_MOUSE_BUTTON_3 = 2;
    public static final int GLFW_MOUSE_BUTTON_4 = 3;
    public static final int GLFW_MOUSE_BUTTON_5 = 4;
    public static final int GLFW_MOUSE_BUTTON_6 = 5;
    public static final int GLFW_MOUSE_BUTTON_7 = 6;
    public static final int GLFW_MOUSE_BUTTON_8 = 7;
    public static final int GLFW_MOUSE_BUTTON_LAST = 7;
    public static final int GLFW_MOUSE_BUTTON_LEFT = 0;
    public static final int GLFW_MOUSE_BUTTON_RIGHT = 1;
    public static final int GLFW_MOUSE_BUTTON_MIDDLE = 2;
    public static final int GLFW_JOYSTICK_1 = 0;
    public static final int GLFW_JOYSTICK_2 = 1;
    public static final int GLFW_JOYSTICK_3 = 2;
    public static final int GLFW_JOYSTICK_4 = 3;
    public static final int GLFW_JOYSTICK_5 = 4;
    public static final int GLFW_JOYSTICK_6 = 5;
    public static final int GLFW_JOYSTICK_7 = 6;
    public static final int GLFW_JOYSTICK_8 = 7;
    public static final int GLFW_JOYSTICK_9 = 8;
    public static final int GLFW_JOYSTICK_10 = 9;
    public static final int GLFW_JOYSTICK_11 = 10;
    public static final int GLFW_JOYSTICK_12 = 11;
    public static final int GLFW_JOYSTICK_13 = 12;
    public static final int GLFW_JOYSTICK_14 = 13;
    public static final int GLFW_JOYSTICK_15 = 14;
    public static final int GLFW_JOYSTICK_16 = 15;
    public static final int GLFW_JOYSTICK_LAST = 15;
    public static final int GLFW_GAMEPAD_BUTTON_A = 0;
    public static final int GLFW_GAMEPAD_BUTTON_B = 1;
    public static final int GLFW_GAMEPAD_BUTTON_X = 2;
    public static final int GLFW_GAMEPAD_BUTTON_Y = 3;
    public static final int GLFW_GAMEPAD_BUTTON_LEFT_BUMPER = 4;
    public static final int GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER = 5;
    public static final int GLFW_GAMEPAD_BUTTON_BACK = 6;
    public static final int GLFW_GAMEPAD_BUTTON_START = 7;
    public static final int GLFW_GAMEPAD_BUTTON_GUIDE = 8;
    public static final int GLFW_GAMEPAD_BUTTON_LEFT_THUMB = 9;
    public static final int GLFW_GAMEPAD_BUTTON_RIGHT_THUMB = 10;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_UP = 11;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_RIGHT = 12;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_DOWN = 13;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_LEFT = 14;
    public static final int GLFW_GAMEPAD_BUTTON_LAST = 14;
    public static final int GLFW_GAMEPAD_BUTTON_CROSS = 0;
    public static final int GLFW_GAMEPAD_BUTTON_CIRCLE = 1;
    public static final int GLFW_GAMEPAD_BUTTON_SQUARE = 2;
    public static final int GLFW_GAMEPAD_BUTTON_TRIANGLE = 3;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_X = 0;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_Y = 1;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_X = 2;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_Y = 3;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_TRIGGER = 4;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5;
    public static final int GLFW_GAMEPAD_AXIS_LAST = 5;
    public static final int GLFW_NO_ERROR = 0;
    public static final int GLFW_NOT_INITIALIZED = 65537;
    public static final int GLFW_NO_CURRENT_CONTEXT = 65538;
    public static final int GLFW_INVALID_ENUM = 65539;
    public static final int GLFW_INVALID_VALUE = 65540;
    public static final int GLFW_OUT_OF_MEMORY = 65541;
    public static final int GLFW_API_UNAVAILABLE = 65542;
    public static final int GLFW_VERSION_UNAVAILABLE = 65543;
    public static final int GLFW_PLATFORM_ERROR = 65544;
    public static final int GLFW_FORMAT_UNAVAILABLE = 65545;
    public static final int GLFW_NO_WINDOW_CONTEXT = 65546;
    public static final int GLFW_CURSOR_UNAVAILABLE = 65547;
    public static final int GLFW_FEATURE_UNAVAILABLE = 65548;
    public static final int GLFW_FEATURE_UNIMPLEMENTED = 65549;
    public static final int GLFW_PLATFORM_UNAVAILABLE = 65550;
    public static final int GLFW_FOCUSED = 131073;
    public static final int GLFW_ICONIFIED = 131074;
    public static final int GLFW_RESIZABLE = 131075;
    public static final int GLFW_VISIBLE = 131076;
    public static final int GLFW_DECORATED = 131077;
    public static final int GLFW_AUTO_ICONIFY = 131078;
    public static final int GLFW_FLOATING = 131079;
    public static final int GLFW_MAXIMIZED = 131080;
    public static final int GLFW_CENTER_CURSOR = 131081;
    public static final int GLFW_TRANSPARENT_FRAMEBUFFER = 131082;
    public static final int GLFW_HOVERED = 131083;
    public static final int GLFW_FOCUS_ON_SHOW = 131084;
    public static final int GLFW_MOUSE_PASSTHROUGH = 131085;
    public static final int GLFW_POSITION_X = 131086;
    public static final int GLFW_POSITION_Y = 131087;
    public static final int GLFW_SOFT_FULLSCREEN = 131088;
    public static final int GLFW_CURSOR = 208897;
    public static final int GLFW_STICKY_KEYS = 208898;
    public static final int GLFW_STICKY_MOUSE_BUTTONS = 208899;
    public static final int GLFW_LOCK_KEY_MODS = 208900;
    public static final int GLFW_RAW_MOUSE_MOTION = 208901;
    public static final int GLFW_UNLIMITED_MOUSE_BUTTONS = 208902;
    public static final int GLFW_IME = 208903;
    public static final int GLFW_CURSOR_NORMAL = 212993;
    public static final int GLFW_CURSOR_HIDDEN = 212994;
    public static final int GLFW_CURSOR_DISABLED = 212995;
    public static final int GLFW_CURSOR_CAPTURED = 212996;
    public static final int GLFW_ARROW_CURSOR = 221185;
    public static final int GLFW_IBEAM_CURSOR = 221186;
    public static final int GLFW_CROSSHAIR_CURSOR = 221187;
    public static final int GLFW_POINTING_HAND_CURSOR = 221188;
    public static final int GLFW_RESIZE_EW_CURSOR = 221189;
    public static final int GLFW_RESIZE_NS_CURSOR = 221190;
    public static final int GLFW_RESIZE_NWSE_CURSOR = 221191;
    public static final int GLFW_RESIZE_NESW_CURSOR = 221192;
    public static final int GLFW_RESIZE_ALL_CURSOR = 221193;
    public static final int GLFW_NOT_ALLOWED_CURSOR = 221194;
    public static final int GLFW_HRESIZE_CURSOR = 221189;
    public static final int GLFW_VRESIZE_CURSOR = 221190;
    public static final int GLFW_HAND_CURSOR = 221188;
    public static final int GLFW_CONNECTED = 262145;
    public static final int GLFW_DISCONNECTED = 262146;
    public static final int GLFW_JOYSTICK_HAT_BUTTONS = 327681;
    public static final int GLFW_ANGLE_PLATFORM_TYPE = 327682;
    public static final int GLFW_ANY_POSITION = Integer.MIN_VALUE;
    public static final int GLFW_PLATFORM = 327683;
    public static final int GLFW_MANAGE_PREEDIT_CANDIDATE = 327684;
    public static final int GLFW_COCOA_CHDIR_RESOURCES = 331777;
    public static final int GLFW_COCOA_MENUBAR = 331778;
    public static final int GLFW_X11_XCB_VULKAN_SURFACE = 335873;
    public static final int GLFW_X11_ONTHESPOT = 335874;
    public static final int GLFW_WAYLAND_LIBDECOR = 339969;
    public static final int GLFW_ANY_PLATFORM = 393216;
    public static final int GLFW_PLATFORM_WIN32 = 393217;
    public static final int GLFW_PLATFORM_COCOA = 393218;
    public static final int GLFW_PLATFORM_WAYLAND = 393219;
    public static final int GLFW_PLATFORM_X11 = 393220;
    public static final int GLFW_PLATFORM_NULL = 393221;
    public static final int GLFW_DONT_CARE = -1;
    public static final int GLFW_RED_BITS = 135169;
    public static final int GLFW_GREEN_BITS = 135170;
    public static final int GLFW_BLUE_BITS = 135171;
    public static final int GLFW_ALPHA_BITS = 135172;
    public static final int GLFW_DEPTH_BITS = 135173;
    public static final int GLFW_STENCIL_BITS = 135174;
    public static final int GLFW_ACCUM_RED_BITS = 135175;
    public static final int GLFW_ACCUM_GREEN_BITS = 135176;
    public static final int GLFW_ACCUM_BLUE_BITS = 135177;
    public static final int GLFW_ACCUM_ALPHA_BITS = 135178;
    public static final int GLFW_AUX_BUFFERS = 135179;
    public static final int GLFW_STEREO = 135180;
    public static final int GLFW_SAMPLES = 135181;
    public static final int GLFW_SRGB_CAPABLE = 135182;
    public static final int GLFW_REFRESH_RATE = 135183;
    public static final int GLFW_DOUBLEBUFFER = 135184;
    public static final int GLFW_CLIENT_API = 139265;
    public static final int GLFW_CONTEXT_VERSION_MAJOR = 139266;
    public static final int GLFW_CONTEXT_VERSION_MINOR = 139267;
    public static final int GLFW_CONTEXT_REVISION = 139268;
    public static final int GLFW_CONTEXT_ROBUSTNESS = 139269;
    public static final int GLFW_OPENGL_FORWARD_COMPAT = 139270;
    public static final int GLFW_OPENGL_DEBUG_CONTEXT = 139271;
    public static final int GLFW_CONTEXT_DEBUG = 139271;
    public static final int GLFW_OPENGL_PROFILE = 139272;
    public static final int GLFW_CONTEXT_RELEASE_BEHAVIOR = 139273;
    public static final int GLFW_CONTEXT_NO_ERROR = 139274;
    public static final int GLFW_CONTEXT_CREATION_API = 139275;
    public static final int GLFW_SCALE_TO_MONITOR = 139276;
    public static final int GLFW_SCALE_FRAMEBUFFER = 139277;
    public static final int GLFW_COCOA_RETINA_FRAMEBUFFER = 143361;
    public static final int GLFW_COCOA_FRAME_NAME = 143362;
    public static final int GLFW_COCOA_GRAPHICS_SWITCHING = 143363;
    public static final int GLFW_X11_CLASS_NAME = 147457;
    public static final int GLFW_X11_INSTANCE_NAME = 147458;
    public static final int GLFW_WIN32_KEYBOARD_MENU = 151553;
    public static final int GLFW_WIN32_SHOWDEFAULT = 151554;
    public static final int GLFW_WAYLAND_APP_ID = 155649;
    public static final int GLFW_NO_API = 0;
    public static final int GLFW_OPENGL_API = 196609;
    public static final int GLFW_OPENGL_ES_API = 196610;
    public static final int GLFW_NO_ROBUSTNESS = 0;
    public static final int GLFW_NO_RESET_NOTIFICATION = 200705;
    public static final int GLFW_LOSE_CONTEXT_ON_RESET = 200706;
    public static final int GLFW_OPENGL_ANY_PROFILE = 0;
    public static final int GLFW_OPENGL_CORE_PROFILE = 204801;
    public static final int GLFW_OPENGL_COMPAT_PROFILE = 204802;
    public static final int GLFW_ANY_RELEASE_BEHAVIOR = 0;
    public static final int GLFW_RELEASE_BEHAVIOR_FLUSH = 217089;
    public static final int GLFW_RELEASE_BEHAVIOR_NONE = 217090;
    public static final int GLFW_NATIVE_CONTEXT_API = 221185;
    public static final int GLFW_EGL_CONTEXT_API = 221186;
    public static final int GLFW_OSMESA_CONTEXT_API = 221187;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_NONE = 225281;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_OPENGL = 225282;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_OPENGLES = 225283;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_D3D9 = 225284;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_D3D11 = 225285;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_VULKAN = 225287;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_METAL = 225288;
    public static final int GLFW_WAYLAND_PREFER_LIBDECOR = 229377;
    public static final int GLFW_WAYLAND_DISABLE_LIBDECOR = 229378;
    public static GLFWCharCallback mGLFWCharCallback;
    public static GLFWCharModsCallback mGLFWCharModsCallback;
    public static GLFWCursorEnterCallback mGLFWCursorEnterCallback;
    public static GLFWCursorPosCallback mGLFWCursorPosCallback;
    public static GLFWDropCallback mGLFWDropCallback;
    public static GLFWErrorCallback mGLFWErrorCallback;
    public static GLFWJoystickCallback mGLFWJoystickCallback;
    public static GLFWKeyCallback mGLFWKeyCallback;
    public static GLFWMonitorCallback mGLFWMonitorCallback;
    public static GLFWMouseButtonCallback mGLFWMouseButtonCallback;
    public static GLFWScrollCallback mGLFWScrollCallback;
    public static GLFWWindowCloseCallback mGLFWWindowCloseCallback;
    public static GLFWWindowContentScaleCallback mGLFWWindowContentScaleCallback;
    public static GLFWWindowFocusCallback mGLFWWindowFocusCallback;
    public static GLFWWindowIconifyCallback mGLFWWindowIconifyCallback;
    public static GLFWWindowMaximizeCallback mGLFWWindowMaximizeCallback;
    public static GLFWWindowPosCallback mGLFWWindowPosCallback;
    public static GLFWWindowRefreshCallback mGLFWWindowRefreshCallback;
    public static GLFWPreeditCallback mGLFWPreeditCallback;
    public static GLFWIMEStatusCallback mGLFWIMEStatusCallback;
    public static GLFWPreeditCandidateCallback mGLFWPreeditCandidateCallback;
    public static GLFWFramebufferSizeCallbackI mGLFWFramebufferSizeCallbackI;
    public static GLFWWindowSizeCallbackI mGLFWWindowSizeCallbackI;
    public static volatile int mGLFWWindowWidth;
    public static volatile int mGLFWWindowHeight;
    private static GLFWGammaRamp mGLFWGammaRamp;
    private static Map<Integer, String> mGLFWKeyCodes;
    private static GLFWVidMode mGLFWVideoMode;
    private static long mGLFWWindowMonitor;
    private static long mUserPointer;
    private static double mGLFWInitialTime;
    private static ArrayMap<Long, GLFWWindowProperties> mGLFWWindowMap;
    public static boolean mGLFWIsInputReady;
    private static boolean mGLFWInputPumping;
    private static final SharedLibrary GLFW;
    static boolean isGLFWReady;
    static FloatBuffer joystickData = FloatBuffer.allocate(8).flip();
    static ByteBuffer buttonData = ByteBuffer.allocate(8).flip();
    private static boolean mGLFWWindowVisibleOnCreation = true;
    public static final ByteBuffer keyDownBuffer = ByteBuffer.allocateDirect(318);
    public static final ByteBuffer mouseDownBuffer = ByteBuffer.allocateDirect(8);
    public static long mainContext = 0;

    private static native void nativeInitializeGLFWNativeBridge();

    private static native long nglfwSetCharCallback(long j, long j2);

    private static native long nglfwSetCharModsCallback(long j, long j2);

    private static native long nglfwSetCursorEnterCallback(long j, long j2);

    private static native long nglfwSetCursorPosCallback(long j, long j2);

    private static native long nglfwSetKeyCallback(long j, long j2);

    private static native long nglfwSetMouseButtonCallback(long j, long j2);

    private static native long nglfwSetScrollCallback(long j, long j2);

    private static native void nglfwSetShowingWindow(long j);

    public static native void nglfwGetCursorPos(@NativeType("GLFWwindow *") long j, @NativeType("double *") DoubleBuffer doubleBuffer, @NativeType("double *") DoubleBuffer doubleBuffer2);

    public static native void nglfwGetCursorPosA(@NativeType("GLFWwindow *") long j, @NativeType("double *") double[] dArr, @NativeType("double *") double[] dArr2);

    public static native void glfwSetCursorPos(@NativeType("GLFWwindow *") long j, double d, double d2);

    private static native long internalGetGamepadDataPointer();

    static {
        try {
            System.loadLibrary("pojavexec");
            nativeInitializeGLFWNativeBridge();
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        mGLFWErrorCallback = GLFWErrorCallback.createPrint();
        mGLFWKeyCodes = new ArrayMap();
        mGLFWWindowMap = new ArrayMap<>();
        mGLFWVideoMode = new GLFWVidMode(ByteBuffer.allocateDirect(GLFWVidMode.SIZEOF));
        long jAddress = mGLFWVideoMode.address();
        GLFWVidMode gLFWVidMode = mGLFWVideoMode;
        MemoryUtil.memPutInt(jAddress + GLFWVidMode.WIDTH, mGLFWWindowWidth);
        long jAddress2 = mGLFWVideoMode.address();
        GLFWVidMode gLFWVidMode2 = mGLFWVideoMode;
        MemoryUtil.memPutInt(jAddress2 + GLFWVidMode.HEIGHT, mGLFWWindowHeight);
        long jAddress3 = mGLFWVideoMode.address();
        GLFWVidMode gLFWVidMode3 = mGLFWVideoMode;
        MemoryUtil.memPutInt(jAddress3 + GLFWVidMode.REDBITS, 8);
        long jAddress4 = mGLFWVideoMode.address();
        GLFWVidMode gLFWVidMode4 = mGLFWVideoMode;
        MemoryUtil.memPutInt(jAddress4 + GLFWVidMode.GREENBITS, 8);
        long jAddress5 = mGLFWVideoMode.address();
        GLFWVidMode gLFWVidMode5 = mGLFWVideoMode;
        MemoryUtil.memPutInt(jAddress5 + GLFWVidMode.BLUEBITS, 8);
        long jAddress6 = mGLFWVideoMode.address();
        GLFWVidMode gLFWVidMode6 = mGLFWVideoMode;
        MemoryUtil.memPutInt(jAddress6 + GLFWVidMode.REFRESHRATE, 60);
        Field[] thisFieldArr = GLFW.class.getFields();
        try {
            for (Field thisField : thisFieldArr) {
                if (thisField.getName().startsWith("GLFW_KEY_")) {
                    mGLFWKeyCodes.put(Integer.valueOf(((Integer) thisField.get(null)).intValue()), thisField.getName().substring(9, 10).toUpperCase() + thisField.getName().substring(10).replace("_", StringUtils.SPACE).toLowerCase());
                }
            }
        } catch (IllegalAccessException e2) {
        }
        GLFW = Library.loadNative((Class<?>) GLFW.class, "org.lwjgl.glfw", "libpojavexec.so", true);
    }

    protected GLFW() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFW$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFW$Functions.class */
    public static final class Functions {
        public static final long Init = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavInit");
        public static final long CreateContext = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavCreateContext");
        public static final long GetCurrentContext = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavGetCurrentContext");
        public static final long MakeContextCurrent = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavMakeCurrent");
        public static final long Terminate = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavTerminate");
        public static final long SetWindowHint = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavSetWindowHint");
        public static final long SwapBuffers = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavSwapBuffers");
        public static final long SwapInterval = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavSwapInterval");
        public static final long PumpEvents = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavPumpEvents");
        public static final long StopPumping = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavStopPumping");
        public static final long StartPumping = APIUtil.apiGetFunctionAddress(GLFW.GLFW, "pojavStartPumping");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return GLFW;
    }

    public static void internalChangeMonitorSize(int width, int height) {
        mGLFWWindowWidth = width;
        mGLFWWindowHeight = height;
        if (mGLFWVideoMode == null) {
            return;
        }
        long jAddress = mGLFWVideoMode.address();
        GLFWVidMode gLFWVidMode = mGLFWVideoMode;
        MemoryUtil.memPutInt(jAddress + GLFWVidMode.WIDTH, mGLFWWindowWidth);
        long jAddress2 = mGLFWVideoMode.address();
        GLFWVidMode gLFWVidMode2 = mGLFWVideoMode;
        MemoryUtil.memPutInt(jAddress2 + GLFWVidMode.HEIGHT, mGLFWWindowHeight);
    }

    public static GLFWWindowProperties internalGetWindow(long window) {
        GLFWWindowProperties win = mGLFWWindowMap.get(Long.valueOf(window));
        if (win == null) {
            throw new IllegalArgumentException("No window pointer found: " + window);
        }
        return win;
    }

    public static GLFWCharCallback glfwSetCharCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcharfun") GLFWCharCallbackI cbfun) {
        GLFWCharCallback lastCallback = mGLFWCharCallback;
        if (cbfun == null) {
            mGLFWCharCallback = null;
        } else {
            mGLFWCharCallback = GLFWCharCallback.createSafe(nglfwSetCharCallback(window, MemoryUtil.memAddressSafe(cbfun)));
        }
        return lastCallback;
    }

    public static GLFWCharModsCallback glfwSetCharModsCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcharmodsfun") GLFWCharModsCallbackI cbfun) {
        GLFWCharModsCallback lastCallback = mGLFWCharModsCallback;
        if (cbfun == null) {
            mGLFWCharModsCallback = null;
        } else {
            mGLFWCharModsCallback = GLFWCharModsCallback.createSafe(nglfwSetCharModsCallback(window, MemoryUtil.memAddressSafe(cbfun)));
        }
        return lastCallback;
    }

    public static GLFWCursorEnterCallback glfwSetCursorEnterCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcursorenterfun") GLFWCursorEnterCallbackI cbfun) {
        GLFWCursorEnterCallback lastCallback = mGLFWCursorEnterCallback;
        if (cbfun == null) {
            mGLFWCursorEnterCallback = null;
        } else {
            mGLFWCursorEnterCallback = GLFWCursorEnterCallback.createSafe(nglfwSetCursorEnterCallback(window, MemoryUtil.memAddressSafe(cbfun)));
        }
        return lastCallback;
    }

    public static GLFWCursorPosCallback glfwSetCursorPosCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcursorposfun") GLFWCursorPosCallbackI cbfun) {
        GLFWCursorPosCallback lastCallback = mGLFWCursorPosCallback;
        if (cbfun == null) {
            mGLFWCursorPosCallback = null;
        } else {
            mGLFWCursorPosCallback = GLFWCursorPosCallback.createSafe(nglfwSetCursorPosCallback(window, MemoryUtil.memAddressSafe(cbfun)));
        }
        return lastCallback;
    }

    public static GLFWDropCallback glfwSetDropCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWdropfun") GLFWDropCallbackI cbfun) {
        GLFWDropCallback lastCallback = mGLFWDropCallback;
        if (cbfun == null) {
            mGLFWDropCallback = null;
        } else {
            mGLFWDropCallback = GLFWDropCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWErrorCallback glfwSetErrorCallback(@NativeType("GLFWerrorfun") GLFWErrorCallbackI cbfun) {
        GLFWErrorCallback lastCallback = mGLFWErrorCallback;
        if (cbfun == null) {
            mGLFWErrorCallback = null;
        } else {
            mGLFWErrorCallback = GLFWErrorCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWFramebufferSizeCallback glfwSetFramebufferSizeCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWframebuffersizefun") GLFWFramebufferSizeCallbackI cbfun) {
        GLFWFramebufferSizeCallback previousCallback = null;
        if (mGLFWFramebufferSizeCallbackI != null) {
            previousCallback = GLFWFramebufferSizeCallback.create(mGLFWFramebufferSizeCallbackI);
        }
        mGLFWFramebufferSizeCallbackI = cbfun;
        return previousCallback;
    }

    public static GLFWJoystickCallback glfwSetJoystickCallback(@NativeType("GLFWjoystickfun") GLFWJoystickCallbackI cbfun) {
        GLFWJoystickCallback lastCallback = mGLFWJoystickCallback;
        if (cbfun == null) {
            mGLFWJoystickCallback = null;
        } else {
            mGLFWJoystickCallback = GLFWJoystickCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWKeyCallback glfwSetKeyCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWkeyfun") GLFWKeyCallbackI cbfun) {
        GLFWKeyCallback lastCallback = mGLFWKeyCallback;
        if (cbfun == null) {
            mGLFWKeyCallback = null;
        } else {
            mGLFWKeyCallback = GLFWKeyCallback.createSafe(nglfwSetKeyCallback(window, MemoryUtil.memAddressSafe(cbfun)));
        }
        return lastCallback;
    }

    public static GLFWMonitorCallback glfwSetMonitorCallback(@NativeType("GLFWmonitorfun") GLFWMonitorCallbackI cbfun) {
        GLFWMonitorCallback lastCallback = mGLFWMonitorCallback;
        if (cbfun == null) {
            mGLFWMonitorCallback = null;
        } else {
            mGLFWMonitorCallback = GLFWMonitorCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWMouseButtonCallback glfwSetMouseButtonCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWmousebuttonfun") GLFWMouseButtonCallbackI cbfun) {
        GLFWMouseButtonCallback lastCallback = mGLFWMouseButtonCallback;
        if (cbfun == null) {
            mGLFWMouseButtonCallback = null;
        } else {
            mGLFWMouseButtonCallback = GLFWMouseButtonCallback.createSafe(nglfwSetMouseButtonCallback(window, MemoryUtil.memAddressSafe(cbfun)));
        }
        return lastCallback;
    }

    public static GLFWScrollCallback glfwSetScrollCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWscrollfun") GLFWScrollCallbackI cbfun) {
        GLFWScrollCallback lastCallback = mGLFWScrollCallback;
        if (cbfun == null) {
            mGLFWScrollCallback = null;
        } else {
            mGLFWScrollCallback = GLFWScrollCallback.createSafe(nglfwSetScrollCallback(window, MemoryUtil.memAddressSafe(cbfun)));
        }
        return lastCallback;
    }

    public static GLFWWindowCloseCallback glfwSetWindowCloseCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowclosefun") GLFWWindowCloseCallbackI cbfun) {
        GLFWWindowCloseCallback lastCallback = mGLFWWindowCloseCallback;
        if (cbfun == null) {
            mGLFWWindowCloseCallback = null;
        } else {
            mGLFWWindowCloseCallback = GLFWWindowCloseCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWWindowContentScaleCallback glfwSetWindowContentScaleCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowcontentscalefun") GLFWWindowContentScaleCallbackI cbfun) {
        GLFWWindowContentScaleCallback lastCallback = mGLFWWindowContentScaleCallback;
        if (cbfun == null) {
            mGLFWWindowContentScaleCallback = null;
        } else {
            mGLFWWindowContentScaleCallback = GLFWWindowContentScaleCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWWindowFocusCallback glfwSetWindowFocusCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowfocusfun") GLFWWindowFocusCallbackI cbfun) {
        GLFWWindowFocusCallback lastCallback = mGLFWWindowFocusCallback;
        if (cbfun == null) {
            mGLFWWindowFocusCallback = null;
        } else {
            mGLFWWindowFocusCallback = GLFWWindowFocusCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWWindowIconifyCallback glfwSetWindowIconifyCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowiconifyfun") GLFWWindowIconifyCallbackI cbfun) {
        GLFWWindowIconifyCallback lastCallback = mGLFWWindowIconifyCallback;
        if (cbfun == null) {
            mGLFWWindowIconifyCallback = null;
        } else {
            mGLFWWindowIconifyCallback = GLFWWindowIconifyCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWWindowMaximizeCallback glfwSetWindowMaximizeCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowmaximizefun") GLFWWindowMaximizeCallbackI cbfun) {
        GLFWWindowMaximizeCallback lastCallback = mGLFWWindowMaximizeCallback;
        if (cbfun == null) {
            mGLFWWindowMaximizeCallback = null;
        } else {
            mGLFWWindowMaximizeCallback = GLFWWindowMaximizeCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWWindowPosCallback glfwSetWindowPosCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowposfun") GLFWWindowPosCallbackI cbfun) {
        GLFWWindowPosCallback lastCallback = mGLFWWindowPosCallback;
        if (cbfun == null) {
            mGLFWWindowPosCallback = null;
        } else {
            mGLFWWindowPosCallback = GLFWWindowPosCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWWindowRefreshCallback glfwSetWindowRefreshCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowrefreshfun") GLFWWindowRefreshCallbackI cbfun) {
        GLFWWindowRefreshCallback lastCallback = mGLFWWindowRefreshCallback;
        if (cbfun == null) {
            mGLFWWindowRefreshCallback = null;
        } else {
            mGLFWWindowRefreshCallback = GLFWWindowRefreshCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWPreeditCallback glfwSetPreeditCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWpreeditfun") GLFWPreeditCallbackI cbfun) {
        GLFWPreeditCallback lastCallback = mGLFWPreeditCallback;
        if (cbfun == null) {
            mGLFWPreeditCallback = null;
        } else {
            mGLFWPreeditCallback = GLFWPreeditCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWIMEStatusCallback glfwSetIMEStatusCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWimestatusfun") GLFWIMEStatusCallbackI cbfun) {
        GLFWIMEStatusCallback lastCallback = mGLFWIMEStatusCallback;
        if (cbfun == null) {
            mGLFWIMEStatusCallback = null;
        } else {
            mGLFWIMEStatusCallback = GLFWIMEStatusCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWPreeditCandidateCallback glfwSetPreeditCandidateCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWpreeditcandidatefun") GLFWPreeditCandidateCallbackI cbfun) {
        GLFWPreeditCandidateCallback lastCallback = mGLFWPreeditCandidateCallback;
        if (cbfun == null) {
            mGLFWPreeditCandidateCallback = null;
        } else {
            mGLFWPreeditCandidateCallback = GLFWPreeditCandidateCallback.create(cbfun);
        }
        return lastCallback;
    }

    public static GLFWWindowSizeCallback glfwSetWindowSizeCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowsizefun") GLFWWindowSizeCallbackI cbfun) {
        GLFWWindowSizeCallback previousCallback = null;
        if (mGLFWWindowSizeCallbackI != null) {
            previousCallback = GLFWWindowSizeCallback.create(mGLFWWindowSizeCallbackI);
        }
        mGLFWWindowSizeCallbackI = cbfun;
        return previousCallback;
    }

    public static boolean glfwInit() {
        if (!isGLFWReady) {
            mGLFWInitialTime = System.nanoTime();
            long __functionAddress = Functions.Init;
            isGLFWReady = JNI.invokeI(__functionAddress) != 0;
        }
        return isGLFWReady;
    }

    public static void glfwTerminate() {
        mGLFWIsInputReady = false;
        CallbackBridge.nativeSetInputReady(false);
        long __functionAddress = Functions.Terminate;
        JNI.invokeV(__functionAddress);
    }

    public static void glfwInitHint(int hint, int value) {
    }

    public static void glfwInitAllocator(@NativeType("GLFWallocator const *") GLFWAllocator allocator) {
    }

    public static int glfwGetPlatform() {
        return GLFW_PLATFORM_X11;
    }

    public static boolean glfwPlatformSupported(int platform) {
        return platform == 393220;
    }

    @NativeType("GLFWwindow *")
    public static long glfwGetCurrentContext() {
        long __functionAddress = Functions.GetCurrentContext;
        return JNI.invokeP(__functionAddress);
    }

    public static void glfwGetFramebufferSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) width, 1);
            Checks.checkSafe((Buffer) height, 1);
        }
        width.put(internalGetWindow(window).width);
        height.put(internalGetWindow(window).height);
    }

    public static void glfwGetWindowFrameSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") IntBuffer left, @NativeType("int *") IntBuffer top2, @NativeType("int *") IntBuffer right, @NativeType("int *") IntBuffer bottom) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) left, 1);
            Checks.checkSafe((Buffer) top2, 1);
            Checks.checkSafe((Buffer) right, 1);
            Checks.checkSafe((Buffer) bottom, 1);
        }
        if (left != null) {
            left.put(0);
        }
        if (top2 != null) {
            top2.put(0);
        }
        if (right != null) {
            right.put(internalGetWindow(window).width);
        }
        if (bottom != null) {
            bottom.put(internalGetWindow(window).height);
        }
    }

    public static void glfwGetWindowContentScale(@NativeType("GLFWwindow *") long window, @NativeType("float *") FloatBuffer xscale, @NativeType("float *") FloatBuffer yscale) {
        if (xscale != null && yscale != null) {
            xscale.put(1.0f);
            yscale.put(1.0f);
        }
    }

    @NativeType("GLFWmonitor **")
    public static PointerBuffer glfwGetMonitors() {
        PointerBuffer pBuffer = PointerBuffer.allocateDirect(1);
        pBuffer.put(glfwGetPrimaryMonitor());
        return pBuffer;
    }

    public static long glfwGetPrimaryMonitor() {
        return 1L;
    }

    public static void glfwGetMonitorPos(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") IntBuffer xpos, @NativeType("int *") IntBuffer ypos) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) xpos, 1);
            Checks.checkSafe((Buffer) ypos, 1);
        }
        xpos.put(0);
        ypos.put(0);
    }

    public static void glfwGetMonitorWorkarea(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") IntBuffer xpos, @NativeType("int *") IntBuffer ypos, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) xpos, 1);
            Checks.checkSafe((Buffer) ypos, 1);
            Checks.checkSafe((Buffer) width, 1);
            Checks.checkSafe((Buffer) height, 1);
        }
        xpos.put(0);
        ypos.put(0);
        width.put(mGLFWWindowWidth);
        height.put(mGLFWWindowHeight);
    }

    public static void glfwGetMonitorPhysicalSize(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") IntBuffer widthMM, @NativeType("int *") IntBuffer heightMM) {
        if (widthMM != null && heightMM != null) {
            widthMM.put(mGLFWWindowWidth);
            heightMM.put(mGLFWWindowHeight);
        }
    }

    @NativeType("char const *")
    public static String glfwGetMonitorName(@NativeType("GLFWmonitor *") long monitor) {
        return String.format(Locale.US, "Android Display (%dx%d)", Integer.valueOf(mGLFWWindowWidth), Integer.valueOf(mGLFWWindowHeight));
    }

    public static void glfwSetMonitorUserPointer(@NativeType("GLFWmonitor *") long monitor, @NativeType("void *") long pointer) {
    }

    public static long glfwGetMonitorUserPointer(@NativeType("GLFWmonitor *") long monitor) {
        return 0L;
    }

    @NativeType("GLFWmonitor *")
    public static long glfwGetWindowMonitor(@NativeType("GLFWwindow *") long window) {
        return mGLFWWindowMonitor;
    }

    public static void glfwSetWindowMonitor(@NativeType("GLFWwindow *") long window, @NativeType("GLFWmonitor *") long monitor, int xpos, int ypos, int width, int height, int refreshRate) {
        mGLFWWindowMonitor = window * monitor;
    }

    public static int glfwGetWindowAttrib(@NativeType("GLFWwindow *") long window, int attrib) {
        return internalGetWindow(window).windowAttribs.getOrDefault(Integer.valueOf(attrib), 0).intValue();
    }

    public static void glfwSetWindowAttrib(@NativeType("GLFWwindow *") long window, int attrib, int value) {
        internalGetWindow(window).windowAttribs.put(Integer.valueOf(attrib), Integer.valueOf(value));
    }

    public static void glfwSetWindowUserPointer(@NativeType("GLFWwindow *") long window, @NativeType("void *") long pointer) {
        mUserPointer = pointer;
    }

    public static long glfwGetWindowUserPointer(@NativeType("GLFWwindow *") long window) {
        return mUserPointer;
    }

    public static void glfwGetVersion(IntBuffer major, IntBuffer minor, IntBuffer rev) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) major, 1);
            Checks.checkSafe((Buffer) minor, 1);
            Checks.checkSafe((Buffer) rev, 1);
        }
        major.put(3);
        minor.put(4);
        rev.put(0);
    }

    public static String glfwGetVersionString() {
        return "3.4.0";
    }

    public static int glfwGetError(PointerBuffer description) {
        return 0;
    }

    @NativeType("GLFWvidmode const *")
    public static GLFWVidMode.Buffer glfwGetVideoModes(@NativeType("GLFWmonitor *") long monitor) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long __result = glfwGetVideoMode(monitor).address();
            GLFWVidMode.Buffer bufferCreateSafe = GLFWVidMode.createSafe(__result, 1);
            stack.setPointer(stackPointer);
            return bufferCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static GLFWVidMode glfwGetVideoMode(long monitor) {
        return mGLFWVideoMode;
    }

    public static GLFWGammaRamp glfwGetGammaRamp(@NativeType("GLFWmonitor *") long monitor) {
        return mGLFWGammaRamp;
    }

    public static void glfwSetGamma(@NativeType("GLFWmonitor *") long monitor, float gamma) {
    }

    public static void glfwSetGammaRamp(@NativeType("GLFWmonitor *") long monitor, @NativeType("const GLFWgammaramp *") GLFWGammaRamp ramp) {
        mGLFWGammaRamp = ramp;
    }

    public static void glfwMakeContextCurrent(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.MakeContextCurrent;
        JNI.invokePV(window, __functionAddress);
    }

    public static void glfwSwapBuffers(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.SwapBuffers;
        JNI.invokePV(window, __functionAddress);
    }

    public static void glfwSwapInterval(int interval) {
        long __functionAddress = Functions.SwapInterval;
        JNI.invokeV(interval, __functionAddress);
    }

    public static double glfwGetTime() {
        return (System.nanoTime() - mGLFWInitialTime) / 1.0E9d;
    }

    public static void glfwSetTime(double time) {
        mGLFWInitialTime = System.nanoTime() - ((long) time);
    }

    public static long glfwGetTimerValue() {
        return System.currentTimeMillis();
    }

    public static long glfwGetTimerFrequency() {
        return 60L;
    }

    public static long nglfwCreateContext(long share) {
        return JNI.invokePP(share, Functions.CreateContext);
    }

    public static long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share) {
        long ptr = nglfwCreateContext(share);
        if (ptr == 0) {
            System.out.println("GLFW: Failed to create window context!");
            return 0L;
        }
        GLFWWindowProperties win = new GLFWWindowProperties();
        win.width = mGLFWWindowWidth;
        win.height = mGLFWWindowHeight;
        win.title = title;
        win.windowAttribs.put(131075, 0);
        win.inputModes.put(Integer.valueOf(GLFW_CURSOR), Integer.valueOf(GLFW_CURSOR_NORMAL));
        win.inputModes.put(Integer.valueOf(GLFW_STICKY_KEYS), 0);
        win.inputModes.put(Integer.valueOf(GLFW_STICKY_MOUSE_BUTTONS), 0);
        win.inputModes.put(Integer.valueOf(GLFW_IME), 0);
        int glMajor = 3;
        int glMinor = 3;
        String glDriver = System.getenv("POJAV_RENDERER");
        if (glDriver.equals("vulkan_zink")) {
            glMajor = 4;
            glMinor = 6;
        } else if (glDriver.equals("gallium_virgl")) {
            glMajor = 4;
            glMinor = 3;
        } else if (glDriver.equals("opengles3")) {
            glMajor = 4;
            glMinor = 0;
        }
        win.windowAttribs.put(Integer.valueOf(GLFW_CONTEXT_VERSION_MAJOR), Integer.valueOf(glMajor));
        win.windowAttribs.put(Integer.valueOf(GLFW_CONTEXT_VERSION_MINOR), Integer.valueOf(glMinor));
        mGLFWWindowMap.put(Long.valueOf(ptr), win);
        mainContext = ptr;
        if (mGLFWWindowVisibleOnCreation || monitor != 0) {
            glfwShowWindow(ptr);
        }
        return ptr;
    }

    public static void glfwDestroyWindow(long window) {
        try {
            internalGetWindow(window);
            mGLFWWindowMap.remove(Long.valueOf(window));
        } catch (IllegalArgumentException e) {
            System.out.println("GLFW: Warning: failed to remove window " + window);
            e.printStackTrace();
        }
        nglfwSetShowingWindow(mGLFWWindowMap.size() == 0 ? 0L : mGLFWWindowMap.keyAt(mGLFWWindowMap.size() - 1).longValue());
    }

    public static String glfwGetWindowTitle(long window) {
        return internalGetWindow(window).title.toString();
    }

    public static void glfwDefaultWindowHints() {
        mGLFWWindowVisibleOnCreation = true;
    }

    public static void glfwGetWindowSize(long window, IntBuffer width, IntBuffer height) {
        if (width != null) {
            width.put(internalGetWindow(window).width);
        }
        if (height != null) {
            height.put(internalGetWindow(window).height);
        }
    }

    public static void glfwSetWindowSizeLimits(@NativeType("GLFWwindow *") long window, int minwidth, int minheight, int maxwidth, int maxheight) {
    }

    public static void glfwSetWindowAspectRatio(@NativeType("GLFWwindow *") long window, int numer, int denom) {
    }

    public static void glfwSetWindowPos(long window, int x, int y) {
        internalGetWindow(window).x = x;
        internalGetWindow(window).y = y;
    }

    public static void glfwSetWindowSize(long window, int width, int height) {
        internalGetWindow(window).width = width;
        internalGetWindow(window).height = height;
        PrintStream printStream = System.out;
        printStream.println("GLFW: Set size for window " + window + ", width=" + printStream + ", height=" + width);
    }

    public static float glfwGetWindowOpacity(@NativeType("GLFWwindow *") long window) {
        return 1.0f;
    }

    public static void glfwSetWindowOpacity(@NativeType("GLFWwindow *") long window, float opacity) {
    }

    public static void glfwIconifyWindow(@NativeType("GLFWwindow *") long window) {
    }

    public static void glfwRestoreWindow(@NativeType("GLFWwindow *") long window) {
    }

    public static void glfwMaximizeWindow(@NativeType("GLFWwindow *") long window) {
    }

    public static void glfwShowWindow(long window) {
        GLFWWindowProperties win = internalGetWindow(window);
        win.windowAttribs.put(131083, 1);
        win.windowAttribs.put(131076, 1);
        nglfwSetShowingWindow(window);
    }

    public static void glfwHideWindow(long window) {
        GLFWWindowProperties win = internalGetWindow(window);
        win.windowAttribs.put(131083, 0);
        win.windowAttribs.put(131076, 0);
    }

    public static void glfwFocusWindow(@NativeType("GLFWwindow *") long window) {
    }

    public static void glfwWindowHint(int hint, int value) {
        if (hint == 131076) {
            mGLFWWindowVisibleOnCreation = value == 1;
        } else {
            long __functionAddress = Functions.SetWindowHint;
            JNI.invokeV(hint, value, __functionAddress);
        }
    }

    public static void glfwWindowHintString(int hint, @NativeType("const char *") ByteBuffer value) {
    }

    public static void glfwWindowHintString(int hint, @NativeType("const char *") CharSequence value) {
    }

    public static boolean glfwWindowShouldClose(long window) {
        return internalGetWindow(window).shouldClose;
    }

    public static void glfwSetWindowShouldClose(long window, boolean close) {
        internalGetWindow(window).shouldClose = close;
    }

    public static void glfwSetWindowTitle(@NativeType("GLFWwindow *") long window, @NativeType("char const *") ByteBuffer title) {
    }

    public static void glfwSetWindowTitle(@NativeType("GLFWwindow *") long window, @NativeType("char const *") CharSequence title) {
        internalGetWindow(window).title = title;
    }

    public static void glfwSetWindowIcon(@NativeType("GLFWwindow *") long window, @NativeType("GLFWimage const *") GLFWImage.Buffer images) {
    }

    public static void glfwPollEvents() {
        if (!mGLFWIsInputReady) {
            mGLFWIsInputReady = true;
            CallbackBridge.nativeSetInputReady(true);
        }
        if (mGLFWInputPumping) {
            return;
        }
        mGLFWInputPumping = true;
        JNI.callV(Functions.StartPumping);
        for (Long ptr : mGLFWWindowMap.keySet()) {
            JNI.callJV(ptr.longValue(), Functions.PumpEvents);
        }
        JNI.callV(Functions.StopPumping);
        mGLFWInputPumping = false;
    }

    public static void internalWindowSizeChanged(long window) {
        try {
            glfwSetWindowSize(window, mGLFWWindowWidth, mGLFWWindowHeight);
            if (mGLFWFramebufferSizeCallbackI != null) {
                mGLFWFramebufferSizeCallbackI.invoke(window, mGLFWWindowWidth, mGLFWWindowHeight);
            }
            if (mGLFWWindowSizeCallbackI != null) {
                mGLFWWindowSizeCallbackI.invoke(window, mGLFWWindowWidth, mGLFWWindowHeight);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void glfwWaitEvents() {
    }

    public static void glfwWaitEventsTimeout(double timeout) {
    }

    public static void glfwPostEmptyEvent() {
    }

    public static int glfwGetInputMode(@NativeType("GLFWwindow *") long window, int mode) {
        return internalGetWindow(window).inputModes.get(Integer.valueOf(mode)).intValue();
    }

    public static void glfwSetInputMode(@NativeType("GLFWwindow *") long window, int mode, int value) {
        if (mode == 208897) {
            switch (value) {
                case GLFW_CURSOR_DISABLED /* 212995 */:
                    CallbackBridge.nativeSetGrabbing(true);
                    break;
                default:
                    CallbackBridge.nativeSetGrabbing(false);
                    break;
            }
        }
        internalGetWindow(window).inputModes.put(Integer.valueOf(mode), Integer.valueOf(value));
    }

    public static String glfwGetKeyName(int key, int scancode) {
        return mGLFWKeyCodes.get(Integer.valueOf(key));
    }

    public static int glfwGetKeyScancode(int key) {
        return 0;
    }

    public static int glfwGetKey(@NativeType("GLFWwindow *") long window, int key) {
        if (key < 31 || key > 348) {
            return 0;
        }
        return keyDownBuffer.get(key - 31);
    }

    public static int glfwGetMouseButton(@NativeType("GLFWwindow *") long window, int button) {
        if (button < 0 || button >= mouseDownBuffer.capacity()) {
            return 0;
        }
        return mouseDownBuffer.get(button);
    }

    public static void glfwGetCursorPos(@NativeType("GLFWwindow *") long window, @NativeType("double *") DoubleBuffer xpos, @NativeType("double *") DoubleBuffer ypos) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) xpos, 1);
            Checks.checkSafe((Buffer) ypos, 1);
        }
        nglfwGetCursorPos(window, xpos, ypos);
    }

    public static long glfwCreateCursor(@NativeType("const GLFWimage *") GLFWImage image, int xhot, int yhot) {
        return 4L;
    }

    public static long glfwCreateStandardCursor(int shape) {
        return 4L;
    }

    public static void glfwDestroyCursor(@NativeType("GLFWcursor *") long cursor) {
    }

    public static void glfwSetCursor(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcursor *") long cursor) {
    }

    public static boolean glfwRawMouseMotionSupported() {
        return false;
    }

    public static void glfwSetClipboardString(@NativeType("GLFWwindow *") long window, @NativeType("char const *") ByteBuffer string) {
        byte[] arr = new byte[string.remaining()];
        string.get(arr);
        CallbackBridge.nativeClipboard(2000, arr);
    }

    public static void glfwSetClipboardString(@NativeType("GLFWwindow *") long window, @NativeType("char const *") CharSequence string) {
        glfwSetClipboardString(window, MemoryUtil.memUTF8Safe(string));
    }

    public static String glfwGetClipboardString(@NativeType("GLFWwindow *") long window) {
        return CallbackBridge.nativeClipboard(CallbackBridge.CLIPBOARD_PASTE, null);
    }

    public static void glfwRequestWindowAttention(@NativeType("GLFWwindow *") long window) {
    }

    private static void ensureGamepadBuffers() {
        if (gamepadDataPointer == 0) {
            gamepadDataPointer = internalGetGamepadDataPointer();
            gamepadButtonData = CallbackBridge.nativeCreateGamepadButtonBuffer();
            gamepadAxisData = CallbackBridge.nativeCreateGamepadAxisBuffer().order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer();
            CallbackBridge.enableGamepadDirectInput();
        }
    }

    public static boolean glfwJoystickPresent(int jid) {
        return jid == 0;
    }

    public static String glfwGetJoystickName(int jid) {
        if (jid == 0) {
            return "Pojav XBOX 360 compatible gamepad";
        }
        return null;
    }

    public static FloatBuffer glfwGetJoystickAxes(int jid) {
        if (jid != 0) {
            return null;
        }
        ensureGamepadBuffers();
        return gamepadAxisData;
    }

    public static ByteBuffer glfwGetJoystickButtons(int jid) {
        if (jid != 0) {
            return null;
        }
        ensureGamepadBuffers();
        return gamepadButtonData;
    }

    public static ByteBuffer glfwGetjoystickHats(int jid) {
        return null;
    }

    public static boolean glfwJoystickIsGamepad(int jid) {
        if (jid != 0) {
            return false;
        }
        ensureGamepadBuffers();
        return true;
    }

    public static String glfwGetJoystickGUID(int jid) {
        if (jid == 0) {
            return "030000005e0400008e02000056210000";
        }
        return null;
    }

    public static long glfwGetJoystickUserPointer(int jid) {
        return 0L;
    }

    public static void glfwSetJoystickUserPointer(int jid, long pointer) {
    }

    public static boolean glfwUpdateGamepadMappings(ByteBuffer string) {
        return false;
    }

    public static String glfwGetGamepadName(int jid) {
        if (jid == 0) {
            return "Pojav XBOX 360 compatible gamepad";
        }
        return null;
    }

    public static boolean glfwGetGamepadState(int jid, GLFWGamepadState state) {
        if (jid != 0 || state == null) {
            return false;
        }
        ensureGamepadBuffers();
        MemoryUtil.memCopy(gamepadDataPointer, state.address(), state.sizeof());
        return true;
    }

    public static void glfwGetVersion(@NativeType("int *") int[] major, @NativeType("int *") int[] minor, @NativeType("int *") int[] rev) {
        if (Checks.CHECKS) {
            Checks.checkSafe(major, 1);
            Checks.checkSafe(minor, 1);
            Checks.checkSafe(rev, 1);
        }
        major[0] = 3;
        minor[0] = 4;
        rev[0] = 0;
    }

    public static void glfwGetMonitorPos(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") int[] xpos, @NativeType("int *") int[] ypos) {
        if (Checks.CHECKS) {
            Checks.checkSafe(xpos, 1);
            Checks.checkSafe(ypos, 1);
        }
        xpos[0] = 0;
        ypos[0] = 0;
    }

    public static void glfwGetMonitorWorkarea(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") int[] xpos, @NativeType("int *") int[] ypos, @NativeType("int *") int[] width, @NativeType("int *") int[] height) {
        if (Checks.CHECKS) {
            Checks.checkSafe(xpos, 1);
            Checks.checkSafe(ypos, 1);
            Checks.checkSafe(width, 1);
            Checks.checkSafe(height, 1);
        }
        xpos[0] = 0;
        ypos[0] = 0;
        width[0] = mGLFWWindowWidth;
        height[0] = mGLFWWindowHeight;
    }

    public static void glfwGetMonitorPhysicalSize(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") int[] widthMM, @NativeType("int *") int[] heightMM) {
        if (widthMM != null && heightMM != null) {
            widthMM[0] = mGLFWWindowWidth;
            heightMM[0] = mGLFWWindowHeight;
        }
    }

    public static void glfwGetMonitorContentScale(@NativeType("GLFWmonitor *") long monitor, @NativeType("float *") float[] xscale, @NativeType("float *") float[] yscale) {
        if (Checks.CHECKS) {
            Checks.checkSafe(xscale, 1);
            Checks.checkSafe(yscale, 1);
        }
        xscale[0] = 1.0f;
        yscale[0] = 1.0f;
    }

    public static void glfwGetMonitorContentScale(@NativeType("GLFWmonitor *") long monitor, @NativeType("float *") FloatBuffer xscale, @NativeType("float *") FloatBuffer yscale) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) xscale, 1);
            Checks.checkSafe((Buffer) yscale, 1);
        }
        xscale.put(0, 1.0f);
        yscale.put(0, 1.0f);
    }

    public static void glfwGetWindowPos(@NativeType("GLFWwindow *") long window, @NativeType("int *") int[] xpos, @NativeType("int *") int[] ypos) {
        if (Checks.CHECKS) {
            Checks.checkSafe(xpos, 1);
            Checks.checkSafe(ypos, 1);
        }
        if (xpos != null) {
            xpos[0] = internalGetWindow(window).x;
        }
        if (ypos != null) {
            ypos[0] = internalGetWindow(window).y;
        }
    }

    public static void glfwGetWindowPos(@NativeType("GLFWwindow *") long window, @NativeType("int *") IntBuffer xpos, @NativeType("int *") IntBuffer ypos) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) xpos, 1);
            Checks.checkSafe((Buffer) ypos, 1);
        }
        if (xpos != null) {
            xpos.put(internalGetWindow(window).x);
        }
        if (ypos != null) {
            ypos.put(internalGetWindow(window).y);
        }
    }

    public static void glfwGetWindowSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") int[] width, @NativeType("int *") int[] height) {
        if (Checks.CHECKS) {
            Checks.checkSafe(width, 1);
            Checks.checkSafe(height, 1);
        }
        width[0] = internalGetWindow(window).width;
        height[0] = internalGetWindow(window).height;
    }

    public static void glfwGetFramebufferSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") int[] width, @NativeType("int *") int[] height) {
        if (Checks.CHECKS) {
            Checks.checkSafe(width, 1);
            Checks.checkSafe(height, 1);
        }
        width[0] = internalGetWindow(window).width;
        height[0] = internalGetWindow(window).height;
    }

    public static void glfwGetWindowFrameSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") int[] left, @NativeType("int *") int[] top2, @NativeType("int *") int[] right, @NativeType("int *") int[] bottom) {
        if (Checks.CHECKS) {
            Checks.checkSafe(left, 1);
            Checks.checkSafe(top2, 1);
            Checks.checkSafe(right, 1);
            Checks.checkSafe(bottom, 1);
        }
        top2[0] = 0;
        left[0] = 0;
        right[0] = internalGetWindow(window).width;
        bottom[0] = internalGetWindow(window).height;
    }

    public static void glfwGetWindowContentScale(@NativeType("GLFWwindow *") long window, @NativeType("float *") float[] xscale, @NativeType("float *") float[] yscale) {
        if (xscale != null && yscale != null) {
            xscale[0] = 1.0f;
            yscale[0] = 1.0f;
        }
    }

    public static void glfwGetCursorPos(@NativeType("GLFWwindow *") long window, @NativeType("double *") double[] xpos, @NativeType("double *") double[] ypos) {
        if (Checks.CHECKS) {
            Checks.checkSafe(xpos, 1);
            Checks.checkSafe(ypos, 1);
        }
        nglfwGetCursorPosA(window, xpos, ypos);
    }

    @NativeType("int")
    public static boolean glfwExtensionSupported(@NativeType("char const *") CharSequence ext) {
        String string = GL30.glGetString(7939);
        return string != null && string.contains(ext);
    }

    public static long glfwGetProcAddress(@NativeType("char const *") ByteBuffer procname) {
        throw new UnsupportedOperationException("Unimplemented!");
    }

    public static long glfwGetProcAddress(@NativeType("char const *") CharSequence procname) {
        throw new UnsupportedOperationException("Unimplemented!");
    }

    public static void glfwGetPreeditCursorRectangle(@NativeType("GLFWwindow *") long window, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
    }

    public static void glfwGetPreeditCursorRectangle(@NativeType("GLFWwindow *") long window, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] w, @NativeType("int *") int[] h) {
    }

    public static void glfwSetPreeditCursorRectangle(@NativeType("GLFWwindow *") long window, int x, int y, int w, int h) {
    }

    public static void glfwResetPreeditText(@NativeType("GLFWwindow *") long window) {
    }

    public static IntBuffer glfwGetPreeditCandidate(@NativeType("GLFWwindow *") long window, int index) {
        return null;
    }
}
