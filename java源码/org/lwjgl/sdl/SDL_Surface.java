package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Surface.class */
public class SDL_Surface extends Struct<SDL_Surface> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int FORMAT;
    public static final int W;
    public static final int H;
    public static final int PITCH;
    public static final int PIXELS;
    public static final int REFCOUNT;
    public static final int RESERVED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        W = layout.offsetof(2);
        H = layout.offsetof(3);
        PITCH = layout.offsetof(4);
        PIXELS = layout.offsetof(5);
        REFCOUNT = layout.offsetof(6);
        RESERVED = layout.offsetof(7);
    }

    protected SDL_Surface(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_Surface create(long address, ByteBuffer container) {
        return new SDL_Surface(address, container);
    }

    public SDL_Surface(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_SurfaceFlags")
    public int flags() {
        return nflags(address());
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

    public int pitch() {
        return npitch(address());
    }

    @NativeType("void *")
    public ByteBuffer pixels() {
        return npixels(address());
    }

    public int refcount() {
        return nrefcount(address());
    }

    public SDL_Surface flags(@NativeType("SDL_SurfaceFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public SDL_Surface format(@NativeType("SDL_PixelFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_Surface w(int value) {
        nw(address(), value);
        return this;
    }

    public SDL_Surface h(int value) {
        nh(address(), value);
        return this;
    }

    public SDL_Surface pitch(int value) {
        npitch(address(), value);
        return this;
    }

    public SDL_Surface pixels(@NativeType("void *") ByteBuffer value) {
        npixels(address(), value);
        return this;
    }

    public SDL_Surface refcount(int value) {
        nrefcount(address(), value);
        return this;
    }

    public SDL_Surface set(int flags, int format, int w, int h, int pitch, ByteBuffer pixels, int refcount) {
        flags(flags);
        format(format);
        w(w);
        h(h);
        pitch(pitch);
        pixels(pixels);
        refcount(refcount);
        return this;
    }

    public SDL_Surface set(SDL_Surface src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_Surface malloc() {
        return new SDL_Surface(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_Surface calloc() {
        return new SDL_Surface(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_Surface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Surface(MemoryUtil.memAddress(container), container);
    }

    public static SDL_Surface create(long address) {
        return new SDL_Surface(address, null);
    }

    public static SDL_Surface createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_Surface(address, null);
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

    public static SDL_Surface malloc(MemoryStack stack) {
        return new SDL_Surface(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_Surface calloc(MemoryStack stack) {
        return new SDL_Surface(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
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

    public static int npitch(long struct) {
        return MemoryUtil.memGetInt(struct + PITCH);
    }

    public static ByteBuffer npixels(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + PIXELS), npitch(struct) * nh(struct));
    }

    public static int nrefcount(long struct) {
        return MemoryUtil.memGetInt(struct + REFCOUNT);
    }

    public static long nreserved(long struct) {
        return MemoryUtil.memGetAddress(struct + RESERVED);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
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

    public static void npitch(long struct, int value) {
        MemoryUtil.memPutInt(struct + PITCH, value);
    }

    public static void npixels(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PIXELS, MemoryUtil.memAddressSafe(value));
    }

    public static void nrefcount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REFCOUNT, value);
    }

    public static void nreserved(long struct, long value) {
        MemoryUtil.memPutAddress(struct + RESERVED, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Surface$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_Surface, Buffer> implements NativeResource {
        private static final SDL_Surface ELEMENT_FACTORY = SDL_Surface.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_Surface.SIZEOF);
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
        public SDL_Surface getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_SurfaceFlags")
        public int flags() {
            return SDL_Surface.nflags(address());
        }

        @NativeType("SDL_PixelFormat")
        public int format() {
            return SDL_Surface.nformat(address());
        }

        public int w() {
            return SDL_Surface.nw(address());
        }

        public int h() {
            return SDL_Surface.nh(address());
        }

        public int pitch() {
            return SDL_Surface.npitch(address());
        }

        @NativeType("void *")
        public ByteBuffer pixels() {
            return SDL_Surface.npixels(address());
        }

        public int refcount() {
            return SDL_Surface.nrefcount(address());
        }

        public Buffer flags(@NativeType("SDL_SurfaceFlags") int value) {
            SDL_Surface.nflags(address(), value);
            return this;
        }

        public Buffer format(@NativeType("SDL_PixelFormat") int value) {
            SDL_Surface.nformat(address(), value);
            return this;
        }

        public Buffer w(int value) {
            SDL_Surface.nw(address(), value);
            return this;
        }

        public Buffer h(int value) {
            SDL_Surface.nh(address(), value);
            return this;
        }

        public Buffer pitch(int value) {
            SDL_Surface.npitch(address(), value);
            return this;
        }

        public Buffer pixels(@NativeType("void *") ByteBuffer value) {
            SDL_Surface.npixels(address(), value);
            return this;
        }

        public Buffer refcount(int value) {
            SDL_Surface.nrefcount(address(), value);
            return this;
        }
    }
}
