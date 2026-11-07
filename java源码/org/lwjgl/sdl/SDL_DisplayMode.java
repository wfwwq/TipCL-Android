package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DisplayMode.class */
public class SDL_DisplayMode extends Struct<SDL_DisplayMode> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DISPLAYID;
    public static final int FORMAT;
    public static final int W;
    public static final int H;
    public static final int PIXEL_DENSITY;
    public static final int REFRESH_RATE;
    public static final int REFRESH_RATE_NUMERATOR;
    public static final int REFRESH_RATE_DENOMINATOR;
    public static final int INTERNAL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DISPLAYID = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        W = layout.offsetof(2);
        H = layout.offsetof(3);
        PIXEL_DENSITY = layout.offsetof(4);
        REFRESH_RATE = layout.offsetof(5);
        REFRESH_RATE_NUMERATOR = layout.offsetof(6);
        REFRESH_RATE_DENOMINATOR = layout.offsetof(7);
        INTERNAL = layout.offsetof(8);
    }

    protected SDL_DisplayMode(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_DisplayMode create(long address, ByteBuffer container) {
        return new SDL_DisplayMode(address, container);
    }

    public SDL_DisplayMode(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_DisplayID")
    public int displayID() {
        return ndisplayID(address());
    }

    @NativeType("SDL_PixelFormat")
    public int format() {
        return nformat(address());
    }

    public int w() {
        return nw(address());
    }

    public int h() {
        return nh(address());
    }

    public float pixel_density() {
        return npixel_density(address());
    }

    public float refresh_rate() {
        return nrefresh_rate(address());
    }

    public int refresh_rate_numerator() {
        return nrefresh_rate_numerator(address());
    }

    public int refresh_rate_denominator() {
        return nrefresh_rate_denominator(address());
    }

    @NativeType("SDL_DisplayModeData *")
    public long internal() {
        return ninternal(address());
    }

    public SDL_DisplayMode displayID(@NativeType("SDL_DisplayID") int value) {
        ndisplayID(address(), value);
        return this;
    }

    public SDL_DisplayMode format(@NativeType("SDL_PixelFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_DisplayMode w(int value) {
        nw(address(), value);
        return this;
    }

    public SDL_DisplayMode h(int value) {
        nh(address(), value);
        return this;
    }

    public SDL_DisplayMode pixel_density(float value) {
        npixel_density(address(), value);
        return this;
    }

    public SDL_DisplayMode refresh_rate(float value) {
        nrefresh_rate(address(), value);
        return this;
    }

    public SDL_DisplayMode refresh_rate_numerator(int value) {
        nrefresh_rate_numerator(address(), value);
        return this;
    }

    public SDL_DisplayMode refresh_rate_denominator(int value) {
        nrefresh_rate_denominator(address(), value);
        return this;
    }

    public SDL_DisplayMode internal(@NativeType("SDL_DisplayModeData *") long value) {
        ninternal(address(), value);
        return this;
    }

    public SDL_DisplayMode set(int displayID, int format, int w, int h, float pixel_density, float refresh_rate, int refresh_rate_numerator, int refresh_rate_denominator, long internal) {
        displayID(displayID);
        format(format);
        w(w);
        h(h);
        pixel_density(pixel_density);
        refresh_rate(refresh_rate);
        refresh_rate_numerator(refresh_rate_numerator);
        refresh_rate_denominator(refresh_rate_denominator);
        internal(internal);
        return this;
    }

    public SDL_DisplayMode set(SDL_DisplayMode src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_DisplayMode malloc() {
        return new SDL_DisplayMode(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_DisplayMode calloc() {
        return new SDL_DisplayMode(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_DisplayMode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DisplayMode(MemoryUtil.memAddress(container), container);
    }

    public static SDL_DisplayMode create(long address) {
        return new SDL_DisplayMode(address, null);
    }

    public static SDL_DisplayMode createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_DisplayMode(address, null);
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

    public static SDL_DisplayMode malloc(MemoryStack stack) {
        return new SDL_DisplayMode(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_DisplayMode calloc(MemoryStack stack) {
        return new SDL_DisplayMode(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ndisplayID(long struct) {
        return MemoryUtil.memGetInt(struct + DISPLAYID);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int nw(long struct) {
        return MemoryUtil.memGetInt(struct + W);
    }

    public static int nh(long struct) {
        return MemoryUtil.memGetInt(struct + H);
    }

    public static float npixel_density(long struct) {
        return MemoryUtil.memGetFloat(struct + PIXEL_DENSITY);
    }

    public static float nrefresh_rate(long struct) {
        return MemoryUtil.memGetFloat(struct + REFRESH_RATE);
    }

    public static int nrefresh_rate_numerator(long struct) {
        return MemoryUtil.memGetInt(struct + REFRESH_RATE_NUMERATOR);
    }

    public static int nrefresh_rate_denominator(long struct) {
        return MemoryUtil.memGetInt(struct + REFRESH_RATE_DENOMINATOR);
    }

    public static long ninternal(long struct) {
        return MemoryUtil.memGetAddress(struct + INTERNAL);
    }

    public static void ndisplayID(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISPLAYID, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nw(long struct, int value) {
        MemoryUtil.memPutInt(struct + W, value);
    }

    public static void nh(long struct, int value) {
        MemoryUtil.memPutInt(struct + H, value);
    }

    public static void npixel_density(long struct, float value) {
        MemoryUtil.memPutFloat(struct + PIXEL_DENSITY, value);
    }

    public static void nrefresh_rate(long struct, float value) {
        MemoryUtil.memPutFloat(struct + REFRESH_RATE, value);
    }

    public static void nrefresh_rate_numerator(long struct, int value) {
        MemoryUtil.memPutInt(struct + REFRESH_RATE_NUMERATOR, value);
    }

    public static void nrefresh_rate_denominator(long struct, int value) {
        MemoryUtil.memPutInt(struct + REFRESH_RATE_DENOMINATOR, value);
    }

    public static void ninternal(long struct, long value) {
        MemoryUtil.memPutAddress(struct + INTERNAL, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + INTERNAL));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DisplayMode$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_DisplayMode, Buffer> implements NativeResource {
        private static final SDL_DisplayMode ELEMENT_FACTORY = SDL_DisplayMode.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_DisplayMode.SIZEOF);
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
        public SDL_DisplayMode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_DisplayID")
        public int displayID() {
            return SDL_DisplayMode.ndisplayID(address());
        }

        @NativeType("SDL_PixelFormat")
        public int format() {
            return SDL_DisplayMode.nformat(address());
        }

        public int w() {
            return SDL_DisplayMode.nw(address());
        }

        public int h() {
            return SDL_DisplayMode.nh(address());
        }

        public float pixel_density() {
            return SDL_DisplayMode.npixel_density(address());
        }

        public float refresh_rate() {
            return SDL_DisplayMode.nrefresh_rate(address());
        }

        public int refresh_rate_numerator() {
            return SDL_DisplayMode.nrefresh_rate_numerator(address());
        }

        public int refresh_rate_denominator() {
            return SDL_DisplayMode.nrefresh_rate_denominator(address());
        }

        @NativeType("SDL_DisplayModeData *")
        public long internal() {
            return SDL_DisplayMode.ninternal(address());
        }

        public Buffer displayID(@NativeType("SDL_DisplayID") int value) {
            SDL_DisplayMode.ndisplayID(address(), value);
            return this;
        }

        public Buffer format(@NativeType("SDL_PixelFormat") int value) {
            SDL_DisplayMode.nformat(address(), value);
            return this;
        }

        public Buffer w(int value) {
            SDL_DisplayMode.nw(address(), value);
            return this;
        }

        public Buffer h(int value) {
            SDL_DisplayMode.nh(address(), value);
            return this;
        }

        public Buffer pixel_density(float value) {
            SDL_DisplayMode.npixel_density(address(), value);
            return this;
        }

        public Buffer refresh_rate(float value) {
            SDL_DisplayMode.nrefresh_rate(address(), value);
            return this;
        }

        public Buffer refresh_rate_numerator(int value) {
            SDL_DisplayMode.nrefresh_rate_numerator(address(), value);
            return this;
        }

        public Buffer refresh_rate_denominator(int value) {
            SDL_DisplayMode.nrefresh_rate_denominator(address(), value);
            return this;
        }

        public Buffer internal(@NativeType("SDL_DisplayModeData *") long value) {
            SDL_DisplayMode.ninternal(address(), value);
            return this;
        }
    }
}
