package org.lwjgl.input;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.LWJGLException;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.InputImplementation;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/input/GLFWInputImplementation.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/input/GLFWInputImplementation.class */
public class GLFWInputImplementation implements InputImplementation {
    public static final GLFWInputImplementation singleton = new GLFWInputImplementation();
    public boolean grab;
    private final ByteBuffer event_buffer = ByteBuffer.allocate(22);
    private EventQueue event_queue = new EventQueue(22);
    private final EventQueue keyboardEventQueue = new EventQueue(18);
    private final ByteBuffer keyboardEvent = ByteBuffer.allocate(18);
    public final byte[] key_down_buffer = new byte[256];
    public final byte[] mouse_buffer = new byte[3];
    public int mouseX = 0;
    public int lastPhysicalX = 0;
    public int mouseY = 0;
    public int lastPhysicalY = 0;
    public int mouseLastX = 0;
    public int mouseLastY = 0;
    private long last_event_nanos = System.nanoTime();

    @Override // org.lwjgl.opengl.InputImplementation
    public boolean hasWheel() {
        return true;
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getButtonCount() {
        return 8;
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void createMouse() throws LWJGLException {
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void destroyMouse() {
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void pollMouse(IntBuffer coord_buffer, ByteBuffer buttons) {
        coord_buffer.put(0, this.grab ? this.mouseX - this.mouseLastX : this.mouseX);
        coord_buffer.put(1, this.grab ? this.mouseY - this.mouseLastY : this.mouseY);
        buttons.rewind();
        buttons.put(this.mouse_buffer);
        this.mouseLastX = this.mouseX;
        this.mouseLastY = this.mouseY;
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void readMouse(ByteBuffer buffer) {
        this.event_queue.copyEvents(buffer);
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void grabMouse(boolean new_grab) {
        System.out.println("Grab: " + new_grab);
        this.grab = new_grab;
        GLFW.glfwSetInputMode(Display.getWindow(), GLFW.GLFW_CURSOR, this.grab ? GLFW.GLFW_CURSOR_DISABLED : GLFW.GLFW_CURSOR_NORMAL);
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getNativeCursorCapabilities() {
        return 0;
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void setCursorPosition(int x, int y) {
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void setNativeCursor(Object handle) throws LWJGLException {
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
    public void createKeyboard() throws LWJGLException {
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void destroyKeyboard() {
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void pollKeyboard(ByteBuffer keyDownBuffer) {
        int old_position = keyDownBuffer.position();
        keyDownBuffer.put(this.key_down_buffer);
        keyDownBuffer.position(old_position);
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void readKeyboard(ByteBuffer buffer) {
        this.keyboardEventQueue.copyEvents(buffer);
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public Object createCursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
        return null;
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void destroyCursor(Object cursor_handle) {
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getWidth() {
        return Display.getWidth();
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getHeight() {
        return Display.getHeight();
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public boolean isInsideWindow() {
        return true;
    }

    public void putMouseEventWithCoords(byte button, byte state, int px, int py, int dz, long nanos) {
        if (px == -1 && py == -1) {
            px = this.lastPhysicalX;
            py = this.lastPhysicalY;
        }
        this.event_buffer.clear();
        this.event_buffer.put(button).put(state);
        if (this.grab) {
            int dx = px - this.lastPhysicalX;
            int dy = (py - this.lastPhysicalY) * (-1);
            this.mouseX += dx;
            this.mouseY += dy;
            this.event_buffer.putInt(dx).putInt(dy);
        } else {
            this.mouseX = px;
            this.mouseY = (py - Display.getHeight()) * (-1);
            this.event_buffer.putInt(this.mouseX).putInt(this.mouseY);
        }
        if (button != -1) {
            this.mouse_buffer[button] = state;
        }
        this.event_buffer.putInt(dz).putLong(nanos);
        this.event_buffer.flip();
        this.event_queue.putEvent(this.event_buffer);
        this.last_event_nanos = nanos;
        this.lastPhysicalX = px;
        this.lastPhysicalY = py;
    }

    public void setMouseButtonInGrabMode(byte button, byte state) {
        long nanos = System.nanoTime();
        this.event_buffer.clear();
        this.event_buffer.put(button).put(state).putInt(0).putInt(0).putInt(0).putLong(nanos);
        this.event_buffer.flip();
        this.event_queue.putEvent(this.event_buffer);
        this.last_event_nanos = nanos;
    }

    public void putKeyboardEvent(int keycode, byte state, int ch, long nanos, boolean repeat) {
        this.key_down_buffer[keycode] = state;
        this.keyboardEvent.clear();
        this.keyboardEvent.putInt(keycode).put(state).putInt(ch).putLong(nanos).put(repeat ? (byte) 1 : (byte) 0);
        this.keyboardEvent.flip();
        this.keyboardEventQueue.putEvent(this.keyboardEvent);
    }
}
