package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Texture.class */
public class SDL_Texture extends Struct<SDL_Texture> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FORMAT;
    public static final int W;
    public static final int H;
    public static final int REFCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FORMAT = layout.offsetof(0);
        W = layout.offsetof(1);
        H = layout.offsetof(2);
        REFCOUNT = layout.offsetof(3);
    }

    protected SDL_Texture(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_Texture create(long address, ByteBuffer container) {
        return new SDL_Texture(address, container);
    }

    public SDL_Texture(ByteBuffer container) {
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

    public int w() {
        return nw(address());
    }

    public int h() {
        return nh(address());
    }

    public int refcount() {
        return nrefcount(address());
    }

    public SDL_Texture format(@NativeType("SDL_PixelFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_Texture w(int value) {
        nw(address(), value);
        return this;
    }

    public SDL_Texture h(int value) {
        nh(address(), value);
        return this;
    }

    public SDL_Texture refcount(int value) {
        nrefcount(address(), value);
        return this;
    }

    public SDL_Texture set(int format, int w, int h, int refcount) {
        format(format);
        w(w);
        h(h);
        refcount(refcount);
        return this;
    }

    public SDL_Texture set(SDL_Texture src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_Texture malloc() {
        return new SDL_Texture(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_Texture calloc() {
        return new SDL_Texture(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_Texture create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Texture(MemoryUtil.memAddress(container), container);
    }

    public static SDL_Texture create(long address) {
        return new SDL_Texture(address, null);
    }

    public static SDL_Texture createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_Texture(address, null);
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

    public static SDL_Texture malloc(MemoryStack stack) {
        return new SDL_Texture(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_Texture calloc(MemoryStack stack) {
        return new SDL_Texture(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nw(long struct) {
        return MemoryUtil.memGetInt(struct + W);
    }

    public static int nh(long struct) {
        return MemoryUtil.memGetInt(struct + H);
    }

    public static int nrefcount(long struct) {
        return MemoryUtil.memGetInt(struct + REFCOUNT);
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

    public static void nrefcount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REFCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Texture$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_Texture, Buffer> implements NativeResource {
        private static final SDL_Texture ELEMENT_FACTORY = SDL_Texture.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_Texture.SIZEOF);
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
        public SDL_Texture getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_PixelFormat")
        public int format() {
            return SDL_Texture.nformat(address());
        }

        public int w() {
            return SDL_Texture.nw(address());
        }

        public int h() {
            return SDL_Texture.nh(address());
        }

        public int refcount() {
            return SDL_Texture.nrefcount(address());
        }

        public Buffer format(@NativeType("SDL_PixelFormat") int value) {
            SDL_Texture.nformat(address(), value);
            return this;
        }

        public Buffer w(int value) {
            SDL_Texture.nw(address(), value);
            return this;
        }

        public Buffer h(int value) {
            SDL_Texture.nh(address(), value);
            return this;
        }

        public Buffer refcount(int value) {
            SDL_Texture.nrefcount(address(), value);
            return this;
        }
    }
}
