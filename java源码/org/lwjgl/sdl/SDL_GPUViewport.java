package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUViewport.class */
public class SDL_GPUViewport extends Struct<SDL_GPUViewport> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;
    public static final int W;
    public static final int H;
    public static final int MIN_DEPTH;
    public static final int MAX_DEPTH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        W = layout.offsetof(2);
        H = layout.offsetof(3);
        MIN_DEPTH = layout.offsetof(4);
        MAX_DEPTH = layout.offsetof(5);
    }

    protected SDL_GPUViewport(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUViewport create(long address, ByteBuffer container) {
        return new SDL_GPUViewport(address, container);
    }

    public SDL_GPUViewport(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    public float w() {
        return nw(address());
    }

    public float h() {
        return nh(address());
    }

    public float min_depth() {
        return nmin_depth(address());
    }

    public float max_depth() {
        return nmax_depth(address());
    }

    public SDL_GPUViewport x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_GPUViewport y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_GPUViewport w(float value) {
        nw(address(), value);
        return this;
    }

    public SDL_GPUViewport h(float value) {
        nh(address(), value);
        return this;
    }

    public SDL_GPUViewport min_depth(float value) {
        nmin_depth(address(), value);
        return this;
    }

    public SDL_GPUViewport max_depth(float value) {
        nmax_depth(address(), value);
        return this;
    }

    public SDL_GPUViewport set(float x, float y, float w, float h, float min_depth, float max_depth) {
        x(x);
        y(y);
        w(w);
        h(h);
        min_depth(min_depth);
        max_depth(max_depth);
        return this;
    }

    public SDL_GPUViewport set(SDL_GPUViewport src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUViewport malloc() {
        return new SDL_GPUViewport(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUViewport calloc() {
        return new SDL_GPUViewport(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUViewport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUViewport(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUViewport create(long address) {
        return new SDL_GPUViewport(address, null);
    }

    public static SDL_GPUViewport createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUViewport(address, null);
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

    public static SDL_GPUViewport malloc(MemoryStack stack) {
        return new SDL_GPUViewport(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUViewport calloc(MemoryStack stack) {
        return new SDL_GPUViewport(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
    }

    public static float nw(long struct) {
        return MemoryUtil.memGetFloat(struct + W);
    }

    public static float nh(long struct) {
        return MemoryUtil.memGetFloat(struct + H);
    }

    public static float nmin_depth(long struct) {
        return MemoryUtil.memGetFloat(struct + MIN_DEPTH);
    }

    public static float nmax_depth(long struct) {
        return MemoryUtil.memGetFloat(struct + MAX_DEPTH);
    }

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    public static void nw(long struct, float value) {
        MemoryUtil.memPutFloat(struct + W, value);
    }

    public static void nh(long struct, float value) {
        MemoryUtil.memPutFloat(struct + H, value);
    }

    public static void nmin_depth(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MIN_DEPTH, value);
    }

    public static void nmax_depth(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAX_DEPTH, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUViewport$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUViewport, Buffer> implements NativeResource {
        private static final SDL_GPUViewport ELEMENT_FACTORY = SDL_GPUViewport.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUViewport.SIZEOF);
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
        public SDL_GPUViewport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float x() {
            return SDL_GPUViewport.nx(address());
        }

        public float y() {
            return SDL_GPUViewport.ny(address());
        }

        public float w() {
            return SDL_GPUViewport.nw(address());
        }

        public float h() {
            return SDL_GPUViewport.nh(address());
        }

        public float min_depth() {
            return SDL_GPUViewport.nmin_depth(address());
        }

        public float max_depth() {
            return SDL_GPUViewport.nmax_depth(address());
        }

        public Buffer x(float value) {
            SDL_GPUViewport.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_GPUViewport.ny(address(), value);
            return this;
        }

        public Buffer w(float value) {
            SDL_GPUViewport.nw(address(), value);
            return this;
        }

        public Buffer h(float value) {
            SDL_GPUViewport.nh(address(), value);
            return this;
        }

        public Buffer min_depth(float value) {
            SDL_GPUViewport.nmin_depth(address(), value);
            return this;
        }

        public Buffer max_depth(float value) {
            SDL_GPUViewport.nmax_depth(address(), value);
            return this;
        }
    }
}
