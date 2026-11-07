package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CameraSpec.class */
public class SDL_CameraSpec extends Struct<SDL_CameraSpec> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FORMAT;
    public static final int COLORSPACE;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int FRAMERATE_NUMERATOR;
    public static final int FRAMERATE_DENOMINATOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FORMAT = layout.offsetof(0);
        COLORSPACE = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        FRAMERATE_NUMERATOR = layout.offsetof(4);
        FRAMERATE_DENOMINATOR = layout.offsetof(5);
    }

    protected SDL_CameraSpec(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_CameraSpec create(long address, ByteBuffer container) {
        return new SDL_CameraSpec(address, container);
    }

    public SDL_CameraSpec(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_PixelFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("SDL_Colorspace")
    public int colorspace() {
        return ncolorspace(address());
    }

    public int width() {
        return nwidth(address());
    }

    public int height() {
        return nheight(address());
    }

    public int framerate_numerator() {
        return nframerate_numerator(address());
    }

    public int framerate_denominator() {
        return nframerate_denominator(address());
    }

    public SDL_CameraSpec format(@NativeType("SDL_PixelFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_CameraSpec colorspace(@NativeType("SDL_Colorspace") int value) {
        ncolorspace(address(), value);
        return this;
    }

    public SDL_CameraSpec width(int value) {
        nwidth(address(), value);
        return this;
    }

    public SDL_CameraSpec height(int value) {
        nheight(address(), value);
        return this;
    }

    public SDL_CameraSpec framerate_numerator(int value) {
        nframerate_numerator(address(), value);
        return this;
    }

    public SDL_CameraSpec framerate_denominator(int value) {
        nframerate_denominator(address(), value);
        return this;
    }

    public SDL_CameraSpec set(int format, int colorspace, int width, int height, int framerate_numerator, int framerate_denominator) {
        format(format);
        colorspace(colorspace);
        width(width);
        height(height);
        framerate_numerator(framerate_numerator);
        framerate_denominator(framerate_denominator);
        return this;
    }

    public SDL_CameraSpec set(SDL_CameraSpec src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_CameraSpec malloc() {
        return new SDL_CameraSpec(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_CameraSpec calloc() {
        return new SDL_CameraSpec(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_CameraSpec create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_CameraSpec(MemoryUtil.memAddress(container), container);
    }

    public static SDL_CameraSpec create(long address) {
        return new SDL_CameraSpec(address, null);
    }

    public static SDL_CameraSpec createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_CameraSpec(address, null);
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

    public static SDL_CameraSpec malloc(MemoryStack stack) {
        return new SDL_CameraSpec(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_CameraSpec calloc(MemoryStack stack) {
        return new SDL_CameraSpec(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int ncolorspace(long struct) {
        return MemoryUtil.memGetInt(struct + COLORSPACE);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int nframerate_numerator(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMERATE_NUMERATOR);
    }

    public static int nframerate_denominator(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMERATE_DENOMINATOR);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void ncolorspace(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORSPACE, value);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void nframerate_numerator(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMERATE_NUMERATOR, value);
    }

    public static void nframerate_denominator(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMERATE_DENOMINATOR, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CameraSpec$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_CameraSpec, Buffer> implements NativeResource {
        private static final SDL_CameraSpec ELEMENT_FACTORY = SDL_CameraSpec.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_CameraSpec.SIZEOF);
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
        public SDL_CameraSpec getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_PixelFormat")
        public int format() {
            return SDL_CameraSpec.nformat(address());
        }

        @NativeType("SDL_Colorspace")
        public int colorspace() {
            return SDL_CameraSpec.ncolorspace(address());
        }

        public int width() {
            return SDL_CameraSpec.nwidth(address());
        }

        public int height() {
            return SDL_CameraSpec.nheight(address());
        }

        public int framerate_numerator() {
            return SDL_CameraSpec.nframerate_numerator(address());
        }

        public int framerate_denominator() {
            return SDL_CameraSpec.nframerate_denominator(address());
        }

        public Buffer format(@NativeType("SDL_PixelFormat") int value) {
            SDL_CameraSpec.nformat(address(), value);
            return this;
        }

        public Buffer colorspace(@NativeType("SDL_Colorspace") int value) {
            SDL_CameraSpec.ncolorspace(address(), value);
            return this;
        }

        public Buffer width(int value) {
            SDL_CameraSpec.nwidth(address(), value);
            return this;
        }

        public Buffer height(int value) {
            SDL_CameraSpec.nheight(address(), value);
            return this;
        }

        public Buffer framerate_numerator(int value) {
            SDL_CameraSpec.nframerate_numerator(address(), value);
            return this;
        }

        public Buffer framerate_denominator(int value) {
            SDL_CameraSpec.nframerate_denominator(address(), value);
            return this;
        }
    }
}
