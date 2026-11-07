package org.lwjgl.input;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/input/Cursor.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/input/Cursor.class */
public class Cursor {
    public static final int CURSOR_ONE_BIT_TRANSPARENCY = 1;
    public static final int CURSOR_8_BIT_ALPHA = 2;
    public static final int CURSOR_ANIMATION = 4;
    private final CursorElement[] cursors;
    private int index;
    private boolean destroyed;
    private boolean isEmpty;

    public Cursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
        this.cursors = new CursorElement[numImages];
        IntBuffer flippedImages = BufferUtils.createIntBuffer(images.limit());
        flipImages(width, height, numImages, images, flippedImages);
        ByteBuffer pixels = convertARGBIntBuffertoRGBAByteBuffer(width, height, flippedImages);
        if (numImages == 1) {
            this.isEmpty = true;
            for (int i = 0; i < width * height; i++) {
                if (pixels.get(i) != 0) {
                    System.out.println("Encountered non-zero byte at " + i + ", custom cursor is not empty!");
                    this.isEmpty = false;
                }
            }
        }
        for (int i2 = 0; i2 < numImages; i2++) {
            int size = width * height;
            ByteBuffer image = BufferUtils.createByteBuffer(size);
            for (int j = 0; j < size; j++) {
                image.put(pixels.get());
            }
            GLFWImage cursorImage = GLFWImage.malloc();
            cursorImage.width(width);
            cursorImage.height(height);
            cursorImage.pixels(image);
            long delay = delays != null ? delays.get(i2) : 0L;
            long timeout = GLFW.glfwGetTimerValue();
            this.cursors[i2] = new CursorElement(xHotspot, yHotspot, delay, timeout, cursorImage);
        }
    }

    private static ByteBuffer convertARGBIntBuffertoRGBAByteBuffer(int width, int height, IntBuffer imageBuffer) {
        ByteBuffer pixels = BufferUtils.createByteBuffer(width * height * 4);
        for (int i = 0; i < imageBuffer.limit(); i++) {
            int argbColor = imageBuffer.get(i);
            byte alpha = (byte) (argbColor >>> 24);
            byte blue = (byte) (argbColor >>> 16);
            byte green = (byte) (argbColor >>> 8);
            byte red = (byte) argbColor;
            pixels.put(red);
            pixels.put(green);
            pixels.put(blue);
            pixels.put(alpha);
        }
        pixels.flip();
        return pixels;
    }

    public static int getMinCursorSize() {
        return 1;
    }

    public static int getMaxCursorSize() {
        return 512;
    }

    public static int getCapabilities() {
        return 6;
    }

    private static void flipImages(int width, int height, int numImages, IntBuffer images, IntBuffer images_copy) {
        for (int i = 0; i < numImages; i++) {
            int start_index = i * width * height;
            flipImage(width, height, start_index, images, images_copy);
        }
    }

    private static void flipImage(int width, int height, int start_index, IntBuffer images, IntBuffer images_copy) {
        for (int y = 0; y < (height >> 1); y++) {
            int index_y_1 = (y * width) + start_index;
            int index_y_2 = (((height - y) - 1) * width) + start_index;
            for (int x = 0; x < width; x++) {
                int index1 = index_y_1 + x;
                int index2 = index_y_2 + x;
                int temp_pixel = images.get(index1 + images.position());
                images_copy.put(index1, images.get(index2 + images.position()));
                images_copy.put(index2, temp_pixel);
            }
        }
    }

    long getHandle() {
        checkValid();
        return this.cursors[this.index].cursorHandle;
    }

    private void checkValid() {
        if (this.destroyed) {
            throw new IllegalStateException("The cursor is already destroyed");
        }
    }

    public void destroy() {
        for (CursorElement cursor : this.cursors) {
            GLFW.glfwDestroyCursor(cursor.cursorHandle);
        }
        this.destroyed = true;
    }

    protected void setTimeout() {
        checkValid();
        this.cursors[this.index].timeout = GLFW.glfwGetTimerValue() + this.cursors[this.index].delay;
    }

    protected boolean hasTimedOut() {
        checkValid();
        return this.cursors.length > 1 && this.cursors[this.index].timeout < GLFW.glfwGetTimerValue();
    }

    protected void nextCursor() {
        checkValid();
        int i = this.index + 1;
        this.index = i;
        this.index = i % this.cursors.length;
    }

    boolean isEmpty() {
        return this.isEmpty;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/input/Cursor$CursorElement.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/input/Cursor$CursorElement.class */
    private static class CursorElement {
        final long cursorHandle;
        long delay;
        long timeout;

        CursorElement(int xHotspot, int yHotspot, long delay, long timeout, GLFWImage image) {
            this.delay = delay;
            this.timeout = timeout;
            this.cursorHandle = GLFW.glfwCreateCursor(image, xHotspot, yHotspot);
            if (this.cursorHandle == 0) {
                throw new RuntimeException("Error creating GLFW cursor");
            }
        }
    }
}
