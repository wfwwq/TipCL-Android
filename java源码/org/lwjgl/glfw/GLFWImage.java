package org.lwjgl.glfw;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWImage.class
 */
@NativeType("struct GLFWimage")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWImage.class */
public class GLFWImage extends Struct<GLFWImage> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int PIXELS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        PIXELS = layout.offsetof(2);
    }

    protected GLFWImage(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLFWImage create(long address, ByteBuffer container) {
        return new GLFWImage(address, container);
    }

    public GLFWImage(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int width() {
        return nwidth(address());
    }

    public int height() {
        return nheight(address());
    }

    @NativeType("unsigned char *")
    public ByteBuffer pixels(int capacity) {
        return npixels(address(), capacity);
    }

    public GLFWImage width(int value) {
        nwidth(address(), value);
        return this;
    }

    public GLFWImage height(int value) {
        nheight(address(), value);
        return this;
    }

    public GLFWImage pixels(@NativeType("unsigned char *") ByteBuffer value) {
        npixels(address(), value);
        return this;
    }

    public GLFWImage set(int width, int height, ByteBuffer pixels) {
        width(width);
        height(height);
        pixels(pixels);
        return this;
    }

    public GLFWImage set(GLFWImage src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLFWImage malloc() {
        return new GLFWImage(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLFWImage calloc() {
        return new GLFWImage(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLFWImage create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLFWImage(MemoryUtil.memAddress(container), container);
    }

    public static GLFWImage create(long address) {
        return new GLFWImage(address, null);
    }

    public static GLFWImage createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLFWImage(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static GLFWImage malloc(MemoryStack stack) {
        return new GLFWImage(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLFWImage calloc(MemoryStack stack) {
        return new GLFWImage(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static ByteBuffer npixels(long struct, int capacity) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PIXELS), capacity);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void npixels(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PIXELS, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PIXELS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWImage$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWImage$Buffer.class */
    public static class Buffer extends StructBuffer<GLFWImage, Buffer> implements NativeResource {
        private static final GLFWImage ELEMENT_FACTORY = GLFWImage.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLFWImage.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public GLFWImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int width() {
            return GLFWImage.nwidth(address());
        }

        public int height() {
            return GLFWImage.nheight(address());
        }

        @NativeType("unsigned char *")
        public ByteBuffer pixels(int capacity) {
            return GLFWImage.npixels(address(), capacity);
        }

        public Buffer width(int value) {
            GLFWImage.nwidth(address(), value);
            return this;
        }

        public Buffer height(int value) {
            GLFWImage.nheight(address(), value);
            return this;
        }

        public Buffer pixels(@NativeType("unsigned char *") ByteBuffer value) {
            GLFWImage.npixels(address(), value);
            return this;
        }
    }
}
