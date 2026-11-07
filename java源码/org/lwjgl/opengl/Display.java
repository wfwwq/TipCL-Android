package org.lwjgl.opengl;

import java.awt.Canvas;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.Sys;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCharCallback;
import org.lwjgl.glfw.GLFWCursorEnterCallback;
import org.lwjgl.glfw.GLFWCursorPosCallback;
import org.lwjgl.glfw.GLFWFramebufferSizeCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWMouseButtonCallback;
import org.lwjgl.glfw.GLFWScrollCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWWindowFocusCallback;
import org.lwjgl.glfw.GLFWWindowIconifyCallback;
import org.lwjgl.glfw.GLFWWindowPosCallback;
import org.lwjgl.glfw.GLFWWindowRefreshCallback;
import org.lwjgl.glfw.GLFWWindowSizeCallback;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.GLFWInputImplementation;
import org.lwjgl.input.KeyCodes;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/Display.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/Display.class */
public class Display {
    private static GLContext context;
    private static DisplayImplementation display_impl;
    private static DisplayMode mode;
    private static DisplayMode desktopDisplayMode;
    private static int displayWidth;
    private static int displayHeight;
    private static int displayFramebufferWidth;
    private static int displayFramebufferHeight;
    private static float fps;
    private static boolean window_created;
    private static Canvas parent;
    private static GLFWImage.Buffer icons;
    private static int swap_interval;
    private static boolean isCreated;
    private static String windowTitle = "Game";
    private static boolean displayCreated = false;
    private static boolean displayFocused = true;
    private static boolean displayVisible = true;
    private static boolean displayDirty = false;
    private static boolean displayResizable = false;
    private static int latestEventKey = 0;
    private static int displayX = -1;
    private static int displayY = -1;
    private static boolean displayResized = false;
    private static boolean latestResized = false;
    private static int latestWidth = 0;
    private static int latestHeight = 0;
    private static boolean vsyncEnabled = false;
    private static boolean displayFullscreen = true;
    private static volatile DrawableLWJGL drawable = null;

    static {
        displayWidth = 0;
        displayHeight = 0;
        displayFramebufferWidth = 0;
        displayFramebufferHeight = 0;
        Sys.initialize();
        long monitor = GLFW.glfwGetPrimaryMonitor();
        GLFWVidMode vidmode = GLFW.glfwGetVideoMode(monitor);
        int monitorWidth = vidmode.width();
        displayFramebufferWidth = monitorWidth;
        displayWidth = monitorWidth;
        int monitorHeight = vidmode.height();
        displayFramebufferHeight = monitorHeight;
        displayHeight = monitorHeight;
        int monitorBitPerPixel = vidmode.redBits() + vidmode.greenBits() + vidmode.blueBits();
        int monitorRefreshRate = vidmode.refreshRate();
        DisplayMode displayMode = new DisplayMode(monitorWidth, monitorHeight, monitorBitPerPixel, monitorRefreshRate);
        desktopDisplayMode = displayMode;
        mode = displayMode;
        LWJGLUtil.log("Initial mode: " + desktopDisplayMode);
        if ("opengles2".equals(System.getenv("POJAV_RENDERER"))) {
            GLContext.initCapabilities();
        }
        isCreated = false;
    }

    public static void setSwapInterval(int value) {
        synchronized (GlobalLock.lock) {
            swap_interval = value;
            if (isCreated()) {
                drawable.setSwapInterval(swap_interval);
            }
        }
    }

    private static void makeCurrentAndSetSwapInterval() throws LWJGLException {
        makeCurrent();
        try {
            drawable.checkGLError();
        } catch (OpenGLException e) {
            LWJGLUtil.log("OpenGL error during context creation: " + e.getMessage());
        }
        setSwapInterval(swap_interval);
    }

    private static void initContext() {
        drawable.initContext(0.0f, 0.0f, 0.0f);
        update();
    }

    private static void initControls() {
        if (!Mouse.isCreated()) {
            try {
                Mouse.create();
            } catch (LWJGLException e) {
                if (LWJGLUtil.DEBUG) {
                    e.printStackTrace(System.err);
                } else {
                    LWJGLUtil.log("Failed to create Mouse: " + e);
                }
            }
        }
        if (!Keyboard.isCreated()) {
            try {
                Keyboard.create();
            } catch (LWJGLException e2) {
                if (LWJGLUtil.DEBUG) {
                    e2.printStackTrace(System.err);
                } else {
                    LWJGLUtil.log("Failed to create Keyboard: " + e2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void releaseDrawable() {
        try {
            Context context2 = drawable.getContext();
            if (context2 != null && context2.isCurrent()) {
                context2.releaseCurrent();
                context2.releaseDrawable();
            }
        } catch (LWJGLException e) {
            LWJGLUtil.log("Exception occurred while trying to release context: " + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void destroyWindow() {
        if (!window_created) {
            return;
        }
        releaseDrawable();
        if (Mouse.isCreated()) {
            Mouse.destroy();
        }
        if (Keyboard.isCreated()) {
            Keyboard.destroy();
        }
        display_impl.destroyWindow();
        window_created = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reset() {
        display_impl.resetDisplayMode();
    }

    private static void createWindow() throws LWJGLException {
        if (window_created) {
            return;
        }
        DisplayMode mode2 = getDisplayMode();
        display_impl.createWindow(drawable, mode2, null, 0, 0);
        window_created = true;
        displayWidth = mode2.getWidth();
        displayHeight = mode2.getHeight();
        initControls();
        setIcon(new ByteBuffer[]{LWJGLUtil.LWJGLIcon32x32, LWJGLUtil.LWJGLIcon16x16});
    }

    public static void create(PixelFormat pixel_format, Drawable shared_drawable) throws LWJGLException {
        create(pixel_format);
        try {
            drawable.setPixelFormat(pixel_format, null);
            try {
                createWindow();
                try {
                    ((DrawableGL) drawable).context = new ContextGL(((DrawableGL) drawable).peer_info, null, shared_drawable != null ? ((DrawableGL) shared_drawable).getContext() : null);
                    try {
                        makeCurrentAndSetSwapInterval();
                        initContext();
                    } catch (LWJGLException e) {
                        throw e;
                    }
                } catch (LWJGLException e2) {
                    destroyWindow();
                    throw e2;
                }
            } catch (LWJGLException e3) {
                drawable.destroy();
                throw e3;
            }
        } catch (LWJGLException e4) {
            display_impl.resetDisplayMode();
            throw e4;
        }
    }

    public static void create(PixelFormat pixel_format, ContextAttribs attribs) throws LWJGLException {
        create(pixel_format);
    }

    public static void create(PixelFormat format) throws LWJGLException {
        GLFW.glfwWindowHint(GLFW.GLFW_ACCUM_ALPHA_BITS, format.getAccumulationBitsPerPixel());
        GLFW.glfwWindowHint(GLFW.GLFW_ALPHA_BITS, format.getAlphaBits());
        GLFW.glfwWindowHint(GLFW.GLFW_AUX_BUFFERS, format.getAuxBuffers());
        GLFW.glfwWindowHint(GLFW.GLFW_DEPTH_BITS, format.getDepthBits());
        GLFW.glfwWindowHint(GLFW.GLFW_SAMPLES, format.getSamples());
        GLFW.glfwWindowHint(GLFW.GLFW_STENCIL_BITS, format.getStencilBits());
        create();
    }

    public static void create() throws LWJGLException {
        if (isCreated) {
            return;
        }
        isCreated = true;
        if (Window.handle != 0) {
            GLFW.glfwDestroyWindow(Window.handle);
        }
        long monitor = GLFW.glfwGetPrimaryMonitor();
        GLFWVidMode vidmode = GLFW.glfwGetVideoMode(monitor);
        int monitorWidth = vidmode.width();
        int monitorHeight = vidmode.height();
        int monitorBitPerPixel = vidmode.redBits() + vidmode.greenBits() + vidmode.blueBits();
        int monitorRefreshRate = vidmode.refreshRate();
        desktopDisplayMode = new DisplayMode(monitorWidth, monitorHeight, monitorBitPerPixel, monitorRefreshRate);
        GLFW.glfwDefaultWindowHints();
        GLFW.glfwWindowHint(131076, 0);
        GLFW.glfwWindowHint(131075, displayResizable ? 1 : 0);
        GLFW.glfwWindowHint(139271, 1);
        Window.handle = GLFW.glfwCreateWindow(mode.getWidth(), mode.getHeight(), windowTitle, 0L, 0L);
        if (Window.handle == 0) {
            throw new LWJGLException("Failed to create Display window");
        }
        Window.keyCallback = new GLFWKeyCallback() { // from class: org.lwjgl.opengl.Display.1
            @Override // org.lwjgl.glfw.GLFWKeyCallbackI
            public void invoke(long window, int key, int scancode, int action, int mods) {
                int unused = Display.latestEventKey = key;
                GLFWInputImplementation.singleton.putKeyboardEvent(KeyCodes.toLwjglKey(key), (byte) action, 0, Sys.getNanoTime(), false);
            }
        };
        Window.charCallback = new GLFWCharCallback() { // from class: org.lwjgl.opengl.Display.2
            @Override // org.lwjgl.glfw.GLFWCharCallbackI
            public void invoke(long window, int codepoint) {
                GLFWInputImplementation.singleton.putKeyboardEvent(0, (byte) 1, codepoint, Sys.getNanoTime(), false);
            }
        };
        Window.cursorEnterCallback = new GLFWCursorEnterCallback() { // from class: org.lwjgl.opengl.Display.3
            @Override // org.lwjgl.glfw.GLFWCursorEnterCallbackI
            public void invoke(long window, boolean entered) {
            }
        };
        Window.cursorPosCallback = new GLFWCursorPosCallback() { // from class: org.lwjgl.opengl.Display.4
            @Override // org.lwjgl.glfw.GLFWCursorPosCallbackI
            public void invoke(long window, double xpos, double ypos) {
                GLFWInputImplementation.singleton.putMouseEventWithCoords((byte) -1, (byte) 0, (int) xpos, (int) ypos, 0, Sys.getNanoTime());
            }
        };
        Window.mouseButtonCallback = new GLFWMouseButtonCallback() { // from class: org.lwjgl.opengl.Display.5
            @Override // org.lwjgl.glfw.GLFWMouseButtonCallbackI
            public void invoke(long window, int button, int action, int mods) {
                GLFWInputImplementation.singleton.putMouseEventWithCoords((byte) button, (byte) action, -1, -1, 0, Sys.getNanoTime());
            }
        };
        Window.windowFocusCallback = new GLFWWindowFocusCallback() { // from class: org.lwjgl.opengl.Display.6
            @Override // org.lwjgl.glfw.GLFWWindowFocusCallbackI
            public void invoke(long window, boolean focused) {
                boolean unused = Display.displayFocused = focused;
            }
        };
        Window.windowIconifyCallback = new GLFWWindowIconifyCallback() { // from class: org.lwjgl.opengl.Display.7
            @Override // org.lwjgl.glfw.GLFWWindowIconifyCallbackI
            public void invoke(long window, boolean iconified) {
                boolean unused = Display.displayVisible = !iconified;
            }
        };
        Window.windowSizeCallback = new GLFWWindowSizeCallback() { // from class: org.lwjgl.opengl.Display.8
            @Override // org.lwjgl.glfw.GLFWWindowSizeCallbackI
            public void invoke(long window, int width, int height) {
                boolean unused = Display.latestResized = true;
                int unused2 = Display.latestWidth = width;
                int unused3 = Display.latestHeight = height;
                if (Display.parent != null) {
                    Display.parent.setSize(width, height);
                }
            }
        };
        Window.windowPosCallback = new GLFWWindowPosCallback() { // from class: org.lwjgl.opengl.Display.9
            @Override // org.lwjgl.glfw.GLFWWindowPosCallbackI
            public void invoke(long window, int xpos, int ypos) {
                int unused = Display.displayX = xpos;
                int unused2 = Display.displayY = ypos;
            }
        };
        Window.windowRefreshCallback = new GLFWWindowRefreshCallback() { // from class: org.lwjgl.opengl.Display.10
            @Override // org.lwjgl.glfw.GLFWWindowRefreshCallbackI
            public void invoke(long window) {
                boolean unused = Display.displayDirty = true;
            }
        };
        Window.framebufferSizeCallback = new GLFWFramebufferSizeCallback() { // from class: org.lwjgl.opengl.Display.11
            @Override // org.lwjgl.glfw.GLFWFramebufferSizeCallbackI
            public void invoke(long window, int width, int height) {
                int unused = Display.displayFramebufferWidth = width;
                int unused2 = Display.displayFramebufferHeight = height;
            }
        };
        Window.scrollCallback = new GLFWScrollCallback() { // from class: org.lwjgl.opengl.Display.12
            @Override // org.lwjgl.glfw.GLFWScrollCallbackI
            public void invoke(long window, double xoffset, double yoffset) {
                GLFWInputImplementation.singleton.putMouseEventWithCoords((byte) -1, (byte) 0, -1, -1, (int) (yoffset * 120.0d), Sys.getNanoTime());
            }
        };
        Window.setCallbacks();
        displayWidth = mode.getWidth();
        displayHeight = mode.getHeight();
        IntBuffer fbw = BufferUtils.createIntBuffer(1);
        IntBuffer fbh = BufferUtils.createIntBuffer(1);
        GLFW.glfwGetFramebufferSize(Window.handle, fbw, fbh);
        displayFramebufferWidth = fbw.get(0);
        displayFramebufferHeight = fbh.get(0);
        GLFW.glfwSetWindowPos(Window.handle, (monitorWidth - mode.getWidth()) / 2, (monitorHeight - mode.getHeight()) / 2);
        if (displayX == -1) {
            displayX = (monitorWidth - mode.getWidth()) / 2;
        }
        if (displayY == -1) {
            displayY = (monitorHeight - mode.getHeight()) / 2;
        }
        DrawableGL drawable2 = new DrawableGL() { // from class: org.lwjgl.opengl.Display.13
            @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.Drawable
            public void destroy() {
                synchronized (GlobalLock.lock) {
                    if (Display.isCreated()) {
                        Display.releaseDrawable();
                        super.destroy();
                        Display.destroyWindow();
                        Display.reset();
                    }
                }
            }
        };
        drawable2.context = new ContextGL(Window.handle);
        drawable2.context.makeCurrent();
        drawable = drawable2;
        context = GLContext.createFromCurrent();
        GLFW.glfwShowWindow(Window.handle);
        if (parent != null) {
            parent.setSize(displayWidth, displayHeight);
        }
        display_impl = new DisplayImplementation() { // from class: org.lwjgl.opengl.Display.14
            @Override // org.lwjgl.opengl.InputImplementation
            public void setNativeCursor(Object handle) throws LWJGLException {
                try {
                    Mouse.setNativeCursor((Cursor) handle);
                } catch (ClassCastException e) {
                    throw new LWJGLException("Handle is not an instance of cursor");
                }
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void setCursorPosition(int x, int y) {
                Mouse.setCursorPosition(x, y);
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void readMouse(ByteBuffer buffer) {
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void readKeyboard(ByteBuffer buffer) {
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void pollMouse(IntBuffer coord_buffer, ByteBuffer buttons) {
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void pollKeyboard(ByteBuffer keyDownBuffer) {
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public boolean isInsideWindow() {
                return false;
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public boolean hasWheel() {
                return false;
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void grabMouse(boolean grab) {
                Mouse.setGrabbed(grab);
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public int getNativeCursorCapabilities() {
                return 0;
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public int getMinCursorSize() {
                return 0;
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public int getMaxCursorSize() {
                return 0;
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public int getButtonCount() {
                return 0;
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void destroyMouse() {
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void destroyKeyboard() {
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void destroyCursor(Object cursor_handle) {
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void createMouse() throws LWJGLException {
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public void createKeyboard() throws LWJGLException {
            }

            @Override // org.lwjgl.opengl.InputImplementation
            public Object createCursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
                return null;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public boolean wasResized() {
                return false;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void update() {
                Display.update();
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void switchDisplayMode(DisplayMode mode2) throws LWJGLException {
                Display.setDisplayMode(mode2);
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void setTitle(String title) {
                String unused = Display.windowTitle = title;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void setResizable(boolean resizable) {
                Display.setResizable(resizable);
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void setPbufferAttrib(PeerInfo handle, int attrib, int value) {
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public int setIcon(ByteBuffer[] icons2) {
                Display.setIcon(icons2);
                return 0;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void setGammaRamp(FloatBuffer gammaRamp) throws LWJGLException {
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void reshape(int x, int y, int width, int height) {
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void resetDisplayMode() {
                try {
                    Display.setDisplayMode(Display.desktopDisplayMode);
                } catch (LWJGLException e) {
                }
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void releaseTexImageFromPbuffer(PeerInfo handle, int buffer) {
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public boolean isVisible() {
                return Display.displayVisible;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public boolean isDirty() {
                return Display.displayDirty;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public boolean isCloseRequested() {
                return GLFW.glfwWindowShouldClose(Window.handle);
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public boolean isBufferLost(PeerInfo handle) {
                return false;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public boolean isActive() {
                return Display.displayFocused;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public DisplayMode init() throws LWJGLException {
                return Display.desktopDisplayMode;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public int getY() {
                return Display.displayY;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public int getX() {
                return Display.displayX;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation, org.lwjgl.opengl.InputImplementation
            public int getWidth() {
                return Display.latestWidth;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public String getVersion() {
                return Sys.getVersion();
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public float getPixelScaleFactor() {
                return 0.0f;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public int getPbufferCapabilities() {
                return 0;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation, org.lwjgl.opengl.InputImplementation
            public int getHeight() {
                return Display.latestHeight;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public int getGammaRampLength() {
                return 0;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public DisplayMode[] getAvailableDisplayModes() throws LWJGLException {
                return Display.getAvailableDisplayModes();
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public String getAdapter() {
                return Display.getAdapter();
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void destroyWindow() {
                Display.destroy();
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void createWindow(DrawableLWJGL drawable3, DisplayMode mode2, Canvas parent2, int x, int y) throws LWJGLException {
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public PeerInfo createPeerInfo(PixelFormat pixel_format, ContextAttribs attribs) throws LWJGLException {
                return null;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public PeerInfo createPbuffer(int width, int height, PixelFormat pixel_format, ContextAttribs attribs, IntBuffer pixelFormatCaps, IntBuffer pBufferAttribs) throws LWJGLException {
                return null;
            }

            @Override // org.lwjgl.opengl.DisplayImplementation
            public void bindTexImageToPbuffer(PeerInfo handle, int buffer) {
            }
        };
        displayCreated = true;
        Mouse.create();
        Keyboard.create();
    }

    public static boolean isCreated() {
        return displayCreated;
    }

    public static boolean isActive() {
        return displayFocused;
    }

    public static boolean isVisible() {
        return displayVisible;
    }

    public static GLContext getContext() {
        return context;
    }

    public static void setLocation(int new_x, int new_y) {
        if (Window.handle == 0) {
            displayX = new_x;
            displayY = new_y;
        } else {
            GLFW.glfwSetWindowPos(Window.handle, new_x, new_y);
        }
    }

    public static void setVSyncEnabled(boolean sync) {
        vsyncEnabled = sync;
        GLFW.glfwSwapInterval(vsyncEnabled ? 1 : 0);
    }

    public static long getWindow() {
        return Window.handle;
    }

    public static void update() {
        update(true);
    }

    public static void update(boolean processMessages) {
        try {
            swapBuffers();
            displayDirty = false;
            if (processMessages) {
                processMessages();
            }
        } catch (LWJGLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void processMessages() {
        GLFW.glfwPollEvents();
        Keyboard.poll();
        Mouse.poll();
        if (latestResized) {
            latestResized = false;
            displayResized = true;
            displayWidth = latestWidth;
            displayHeight = latestHeight;
            return;
        }
        displayResized = false;
    }

    public static Canvas getParent() {
        return parent;
    }

    public static void setParent(Canvas parent2) throws LWJGLException {
        if (parent != parent2) {
            parent = parent2;
        }
    }

    public static void swapBuffers() throws LWJGLException {
        GLFW.glfwSwapBuffers(Window.handle);
    }

    public static void destroy() {
        Window.releaseCallbacks();
        GLFW.glfwDestroyWindow(Window.handle);
        displayCreated = false;
    }

    public static void setDisplayMode(DisplayMode dm) throws LWJGLException {
        mode = dm;
        if (isCreated) {
            GLFW.glfwSetWindowSize(Window.handle, dm.getWidth(), dm.getHeight());
        }
    }

    public static DisplayMode getDisplayMode() {
        return mode;
    }

    public static DisplayMode[] getAvailableDisplayModes() throws LWJGLException {
        GLFWVidMode.Buffer modes = GLFW.glfwGetVideoModes(GLFW.glfwGetPrimaryMonitor());
        DisplayMode[] displayModes = new DisplayMode[modes.capacity()];
        for (int i = 0; i < modes.capacity(); i++) {
            modes.position(i);
            int w = modes.width();
            int h = modes.height();
            int b = modes.redBits() + modes.greenBits() + modes.blueBits();
            int r = modes.refreshRate();
            displayModes[i] = new DisplayMode(w, h, b, r);
        }
        return displayModes;
    }

    public static DisplayMode getDesktopDisplayMode() {
        long mon = GLFW.glfwGetPrimaryMonitor();
        GLFWVidMode mode2 = GLFW.glfwGetVideoMode(mon);
        return new DisplayMode(mode2.width(), mode2.height(), mode2.redBits() + mode2.greenBits() + mode2.blueBits(), mode2.refreshRate());
    }

    public static boolean wasResized() {
        return displayResized;
    }

    public static int getX() {
        return displayX;
    }

    public static int getY() {
        return displayY;
    }

    public static int getWidth() {
        return displayWidth;
    }

    public static int getHeight() {
        return displayHeight;
    }

    public static int getFramebufferWidth() {
        return displayFramebufferWidth;
    }

    public static int getFramebufferHeight() {
        return displayFramebufferHeight;
    }

    public static void setTitle(String title) {
        windowTitle = title;
    }

    public static String getTitle() {
        return windowTitle;
    }

    public static boolean isCloseRequested() {
        return GLFW.glfwWindowShouldClose(Window.handle);
    }

    public static boolean isDirty() {
        return displayDirty;
    }

    public static void setInitialBackground(float red, float green, float blue) {
        if (Window.handle != 0) {
            GL11.glClearColor(red, green, blue, 1.0f);
            GL11.glClear(16384);
        }
    }

    public static int setIcon(ByteBuffer[] icons2) {
        try {
            if (Window.handle == 0) {
                icons = new GLFWImage.Buffer(icons2[1]);
            } else {
                GLFW.glfwSetWindowIcon(Window.handle, new GLFWImage.Buffer(icons2[0]));
            }
            return 0;
        } catch (Exception e) {
            LWJGLUtil.log("Couldn't set icon");
            e.printStackTrace();
            return 0;
        }
    }

    public static void setResizable(boolean resizable) {
        if ((displayResizable ^ resizable) && Window.handle != 0) {
            IntBuffer width = BufferUtils.createIntBuffer(1);
            IntBuffer height = BufferUtils.createIntBuffer(1);
            GLFW.glfwGetWindowSize(Window.handle, width, height);
            width.rewind();
            height.rewind();
            GLFW.glfwDefaultWindowHints();
            GLFW.glfwWindowHint(131076, displayVisible ? 1 : 0);
            GLFW.glfwWindowHint(131075, displayResizable ? 1 : 0);
            GLFW.glfwWindowHint(139271, 1);
            GLFW.glfwSetWindowSize(Window.handle, width.get(), height.get());
        }
        displayResizable = resizable;
    }

    public static boolean isResizable() {
        return displayResizable;
    }

    public static void setDisplayModeAndFullscreen(DisplayMode dm) throws LWJGLException {
        if (Window.handle != 0) {
            mode = dm;
            GLFW.glfwSetWindowSize(Window.handle, dm.getWidth(), dm.getHeight());
        }
    }

    public static void setFullscreen(boolean fullscreen) throws LWJGLException {
        System.out.println("LWJGLX: switch fullscreen to " + fullscreen);
        if (isFullscreen() ^ fullscreen) {
            if (fullscreen && !mode.isFullscreenCapable()) {
                throw new LWJGLException("Display mode is not fullscreen capable");
            }
            if (Window.handle != 0) {
                IntBuffer width = BufferUtils.createIntBuffer(1);
                IntBuffer height = BufferUtils.createIntBuffer(1);
                GLFW.glfwGetWindowSize(Window.handle, width, height);
                width.rewind();
                height.rewind();
                GLFW.glfwDefaultWindowHints();
                GLFW.glfwWindowHint(131076, displayVisible ? 1 : 0);
                GLFW.glfwWindowHint(131075, displayResizable ? 1 : 0);
                GLFW.glfwWindowHint(139271, 1);
                GLFW.glfwSetWindowSize(Window.handle, width.get(), height.get());
            }
        }
        displayFullscreen = fullscreen;
    }

    public static boolean isFullscreen() {
        return displayFullscreen;
    }

    public static void releaseContext() throws LWJGLException {
        GLFW.glfwMakeContextCurrent(0L);
    }

    public static boolean isCurrent() throws LWJGLException {
        return GLFW.glfwGetCurrentContext() == Window.handle;
    }

    public static void makeCurrent() throws LWJGLException {
        if (!isCurrent()) {
        }
    }

    public static void setDisplayConfiguration(float gamma, float brightness, float contrast) throws LWJGLException {
    }

    public static String getAdapter() {
        return "GeNotSupportedAdapter";
    }

    public static String getVersion() {
        return "1.0 NOT SUPPORTED";
    }

    public static void sync(int fps2) throws InterruptedException {
        Sync.sync(fps2);
    }

    public static Drawable getDrawable() {
        return drawable;
    }

    static DisplayImplementation getImplementation() {
        return display_impl;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/Display$Window.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/Display$Window.class */
    static class Window {
        static long handle;
        static GLFWKeyCallback keyCallback;
        static GLFWCharCallback charCallback;
        static GLFWCursorEnterCallback cursorEnterCallback;
        static GLFWCursorPosCallback cursorPosCallback;
        static GLFWMouseButtonCallback mouseButtonCallback;
        static GLFWWindowFocusCallback windowFocusCallback;
        static GLFWWindowIconifyCallback windowIconifyCallback;
        static GLFWWindowSizeCallback windowSizeCallback;
        static GLFWWindowPosCallback windowPosCallback;
        static GLFWWindowRefreshCallback windowRefreshCallback;
        static GLFWFramebufferSizeCallback framebufferSizeCallback;
        static GLFWScrollCallback scrollCallback;

        Window() {
        }

        public static void setCallbacks() {
            GLFW.glfwSetKeyCallback(handle, keyCallback);
            GLFW.glfwSetCharCallback(handle, charCallback);
            GLFW.glfwSetCursorEnterCallback(handle, cursorEnterCallback);
            GLFW.glfwSetCursorPosCallback(handle, cursorPosCallback);
            GLFW.glfwSetMouseButtonCallback(handle, mouseButtonCallback);
            GLFW.glfwSetWindowFocusCallback(handle, windowFocusCallback);
            GLFW.glfwSetWindowIconifyCallback(handle, windowIconifyCallback);
            GLFW.glfwSetWindowSizeCallback(handle, windowSizeCallback);
            GLFW.glfwSetWindowPosCallback(handle, windowPosCallback);
            GLFW.glfwSetWindowRefreshCallback(handle, windowRefreshCallback);
            GLFW.glfwSetFramebufferSizeCallback(handle, framebufferSizeCallback);
            GLFW.glfwSetScrollCallback(handle, scrollCallback);
        }

        public static void releaseCallbacks() {
            Callbacks.glfwFreeCallbacks(handle);
            keyCallback = null;
            charCallback = null;
            cursorEnterCallback = null;
            cursorPosCallback = null;
            mouseButtonCallback = null;
            windowFocusCallback = null;
            windowIconifyCallback = null;
            windowSizeCallback = null;
            windowPosCallback = null;
            windowRefreshCallback = null;
            framebufferSizeCallback = null;
            scrollCallback = null;
            System.gc();
        }
    }
}
