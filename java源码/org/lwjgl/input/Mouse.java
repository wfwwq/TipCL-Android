package org.lwjgl.input;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.InputImplementation;
import org.lwjgl.util.freetype.FreeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/input/Mouse.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/input/Mouse.class */
public class Mouse {
    public static final int EVENT_SIZE = 22;
    private static boolean created;
    private static ByteBuffer buttons;
    private static int x;
    private static int y;
    private static int absolute_x;
    private static int absolute_y;
    private static IntBuffer coord_buffer;
    private static int dx;
    private static int dy;
    private static int dwheel;
    private static boolean hasWheel;
    private static Cursor currentCursor;
    private static String[] buttonName;
    private static boolean initialized;
    private static ByteBuffer readBuffer;
    private static int eventButton;
    private static boolean eventState;
    private static int event_dx;
    private static int event_dy;
    private static int event_dwheel;
    private static int event_x;
    private static int event_y;
    private static long event_nanos;
    private static int grab_x;
    private static int grab_y;
    private static int last_event_raw_x;
    private static int last_event_raw_y;
    private static final int BUFFER_SIZE = 50;
    private static boolean isGrabbed;
    private static InputImplementation implementation;
    private static EmptyCursorGrabListener grabListener;
    private static final boolean emulateCursorAnimation;
    private static boolean clipMouseCoordinatesToWindow;
    private static int buttonCount = -1;
    private static final Map<String, Integer> buttonMap = new HashMap(16);

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/input/Mouse$EmptyCursorGrabListener.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/input/Mouse$EmptyCursorGrabListener.class */
    interface EmptyCursorGrabListener {
        void onGrab(boolean z);
    }

    static {
        grabListener = null;
        emulateCursorAnimation = LWJGLUtil.getPlatform() == 3 || LWJGLUtil.getPlatform() == 2;
        clipMouseCoordinatesToWindow = !getPrivilegedBoolean("org.lwjgl.input.Mouse.allowNegativeMouseCoords");
        try {
            Class infdevMouse = Class.forName("org.lwjgl.input.InfdevMouse");
            Constructor constructor = infdevMouse.getConstructor(new Class[0]);
            grabListener = (EmptyCursorGrabListener) constructor.newInstance(new Object[0]);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private Mouse() {
    }

    public static Cursor getNativeCursor() {
        return currentCursor;
    }

    public static Cursor setNativeCursor(Cursor cursor) throws LWJGLException {
        if (cursor == null && currentCursor.isEmpty()) {
            setGrabbed(false);
            if (grabListener != null) {
                grabListener.onGrab(false);
            }
        }
        if (cursor != null && cursor.isEmpty()) {
            setGrabbed(true);
            if (grabListener != null) {
                grabListener.onGrab(true);
            }
        }
        currentCursor = cursor;
        return currentCursor;
    }

    public static boolean isClipMouseCoordinatesToWindow() {
        return clipMouseCoordinatesToWindow;
    }

    public static void setClipMouseCoordinatesToWindow(boolean clip) {
        clipMouseCoordinatesToWindow = clip;
    }

    public static void setCursorPosition(int new_x, int new_y) {
    }

    private static void initialize() {
        Sys.initialize();
        buttonName = new String[16];
        for (int i = 0; i < 16; i++) {
            buttonName[i] = "BUTTON" + i;
            buttonMap.put(buttonName[i], Integer.valueOf(i));
        }
        initialized = true;
    }

    private static void resetMouse() {
        dwheel = 0;
        dy = 0;
        dx = 0;
        readBuffer.position(readBuffer.limit());
    }

    static InputImplementation getImplementation() {
        return implementation;
    }

    private static void create(InputImplementation impl) throws LWJGLException {
        if (created) {
            return;
        }
        if (!initialized) {
            initialize();
        }
        implementation = impl;
        implementation.createMouse();
        hasWheel = implementation.hasWheel();
        created = true;
        buttonCount = implementation.getButtonCount();
        buttons = BufferUtils.createByteBuffer(buttonCount);
        coord_buffer = BufferUtils.createIntBuffer(3);
        if (currentCursor != null && implementation.getNativeCursorCapabilities() != 0) {
            setNativeCursor(currentCursor);
        }
        readBuffer = ByteBuffer.allocate(FreeType.TT_MS_LANGID_MALAYALAM_INDIA);
        readBuffer.limit(0);
        setGrabbed(isGrabbed);
    }

    public static void create() throws LWJGLException {
        if (!Display.isCreated()) {
            throw new IllegalStateException("Display must be created.");
        }
        create(GLFWInputImplementation.singleton);
    }

    public static boolean isCreated() {
        return created;
    }

    public static void destroy() {
        if (created) {
            created = false;
            buttons = null;
            coord_buffer = null;
            implementation.destroyMouse();
        }
    }

    public static void poll() {
        if (!created) {
            throw new IllegalStateException("Mouse must be created before you can poll it");
        }
        implementation.pollMouse(coord_buffer, buttons);
        int poll_coord1 = coord_buffer.get(0);
        int poll_coord2 = coord_buffer.get(1);
        int poll_dwheel = coord_buffer.get(2);
        if (isGrabbed()) {
            dx += poll_coord1;
            dy += poll_coord2;
            x += poll_coord1;
            y += poll_coord2;
            absolute_x += poll_coord1;
            absolute_y += poll_coord2;
        } else {
            dx = poll_coord1 - absolute_x;
            dy = poll_coord2 - absolute_y;
            x = poll_coord1;
            absolute_x = poll_coord1;
            y = poll_coord2;
            absolute_y = poll_coord2;
        }
        if (clipMouseCoordinatesToWindow) {
            x = Math.min(Display.getWidth() - 1, Math.max(0, x));
            y = Math.min(Display.getHeight() - 1, Math.max(0, y));
        }
        dwheel += poll_dwheel;
        read();
    }

    private static void read() {
        readBuffer.compact();
        implementation.readMouse(readBuffer);
        readBuffer.flip();
    }

    public static boolean isButtonDown(int button) {
        if (created) {
            return button < buttonCount && button >= 0 && buttons.get(button) == 1;
        }
        throw new IllegalStateException("Mouse must be created before you can poll the button state");
    }

    public static String getButtonName(int button) {
        if (button >= buttonName.length || button < 0) {
            return null;
        }
        return buttonName[button];
    }

    public static int getButtonIndex(String buttonName2) {
        Integer ret = buttonMap.get(buttonName2);
        if (ret == null) {
            return -1;
        }
        return ret.intValue();
    }

    public static boolean next() {
        if (!created) {
            throw new IllegalStateException("Mouse must be created before you can read events");
        }
        if (readBuffer.hasRemaining()) {
            eventButton = readBuffer.get();
            eventState = readBuffer.get() != 0;
            if (isGrabbed()) {
                event_dx = readBuffer.getInt();
                event_dy = readBuffer.getInt();
                event_x += event_dx;
                event_y += event_dy;
                last_event_raw_x = event_x;
                last_event_raw_y = event_y;
            } else {
                int new_event_x = readBuffer.getInt();
                int new_event_y = readBuffer.getInt();
                event_dx = new_event_x - last_event_raw_x;
                event_dy = new_event_y - last_event_raw_y;
                event_x = new_event_x;
                event_y = new_event_y;
                last_event_raw_x = new_event_x;
                last_event_raw_y = new_event_y;
            }
            if (clipMouseCoordinatesToWindow) {
                event_x = Math.min(Display.getWidth() - 1, Math.max(0, event_x));
                event_y = Math.min(Display.getHeight() - 1, Math.max(0, event_y));
            }
            event_dwheel = readBuffer.getInt();
            event_nanos = readBuffer.getLong();
            return true;
        }
        return false;
    }

    public static int getEventButton() {
        return eventButton;
    }

    public static boolean getEventButtonState() {
        return eventState;
    }

    public static int getEventDX() {
        return event_dx;
    }

    public static int getEventDY() {
        return event_dy;
    }

    public static int getEventX() {
        return event_x;
    }

    public static int getEventY() {
        return event_y;
    }

    public static int getEventDWheel() {
        return event_dwheel;
    }

    public static long getEventNanoseconds() {
        return event_nanos;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getDX() {
        int result = dx;
        dx = 0;
        return result;
    }

    public static int getDY() {
        int result = dy;
        dy = 0;
        return result;
    }

    public static int getDWheel() {
        int result = dwheel;
        dwheel = 0;
        return result;
    }

    public static int getButtonCount() {
        return buttonCount;
    }

    public static boolean hasWheel() {
        return hasWheel;
    }

    public static boolean isGrabbed() {
        return isGrabbed;
    }

    public static void setGrabbed(boolean grab) {
        boolean z = isGrabbed;
        isGrabbed = grab;
        if (isCreated()) {
        }
        implementation.grabMouse(grab);
        poll();
        event_x = x;
        event_y = y;
        last_event_raw_x = x;
        last_event_raw_y = y;
        resetMouse();
    }

    public static void updateCursor() {
    }

    static boolean getPrivilegedBoolean(final String property_name) {
        Boolean value = (Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: org.lwjgl.input.Mouse.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                return Boolean.valueOf(Boolean.getBoolean(property_name));
            }
        });
        return value.booleanValue();
    }

    public static boolean isInsideWindow() {
        return implementation.isInsideWindow();
    }

    static int getAbsoluteX() {
        return absolute_x;
    }

    static int getAbsoluteY() {
        return absolute_y;
    }
}
