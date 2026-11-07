package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_FPoint.class */
public class SDL_FPoint extends Struct<SDL_FPoint> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected SDL_FPoint(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_FPoint create(long address, ByteBuffer container) {
        return new SDL_FPoint(address, container);
    }

    public SDL_FPoint(ByteBuffer container) {
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

    public SDL_FPoint x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_FPoint y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_FPoint set(float x, float y) {
        x(x);
        y(y);
        return this;
    }

    public SDL_FPoint set(SDL_FPoint src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_FPoint malloc() {
        return new SDL_FPoint(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_FPoint calloc() {
        return new SDL_FPoint(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_FPoint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_FPoint(MemoryUtil.memAddress(container), container);
    }

    public static SDL_FPoint create(long address) {
        return new SDL_FPoint(address, null);
    }

    public static SDL_FPoint createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_FPoint(address, null);
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

    public static SDL_FPoint malloc(MemoryStack stack) {
        return new SDL_FPoint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_FPoint calloc(MemoryStack stack) {
        return new SDL_FPoint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_FPoint$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_FPoint, Buffer> implements NativeResource {
        private static final SDL_FPoint ELEMENT_FACTORY = SDL_FPoint.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_FPoint.SIZEOF);
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
        public SDL_FPoint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float x() {
            return SDL_FPoint.nx(address());
        }

        public float y() {
            return SDL_FPoint.ny(address());
        }

        public Buffer x(float value) {
            SDL_FPoint.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_FPoint.ny(address(), value);
            return this;
        }
    }
}
