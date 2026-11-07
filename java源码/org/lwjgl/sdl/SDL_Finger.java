package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Finger.class */
public class SDL_Finger extends Struct<SDL_Finger> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ID;
    public static final int X;
    public static final int Y;
    public static final int PRESSURE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ID = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
        PRESSURE = layout.offsetof(3);
    }

    protected SDL_Finger(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_Finger create(long address, ByteBuffer container) {
        return new SDL_Finger(address, container);
    }

    public SDL_Finger(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_FingerID")
    public long id() {
        return nid(address());
    }

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    public float pressure() {
        return npressure(address());
    }

    public SDL_Finger id(@NativeType("SDL_FingerID") long value) {
        nid(address(), value);
        return this;
    }

    public SDL_Finger x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_Finger y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_Finger pressure(float value) {
        npressure(address(), value);
        return this;
    }

    public SDL_Finger set(long id, float x, float y, float pressure) {
        id(id);
        x(x);
        y(y);
        pressure(pressure);
        return this;
    }

    public SDL_Finger set(SDL_Finger src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_Finger malloc() {
        return new SDL_Finger(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_Finger calloc() {
        return new SDL_Finger(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_Finger create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Finger(MemoryUtil.memAddress(container), container);
    }

    public static SDL_Finger create(long address) {
        return new SDL_Finger(address, null);
    }

    public static SDL_Finger createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_Finger(address, null);
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

    public static SDL_Finger malloc(MemoryStack stack) {
        return new SDL_Finger(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_Finger calloc(MemoryStack stack) {
        return new SDL_Finger(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nid(long struct) {
        return MemoryUtil.memGetLong(struct + ID);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
    }

    public static float npressure(long struct) {
        return MemoryUtil.memGetFloat(struct + PRESSURE);
    }

    public static void nid(long struct, long value) {
        MemoryUtil.memPutLong(struct + ID, value);
    }

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    public static void npressure(long struct, float value) {
        MemoryUtil.memPutFloat(struct + PRESSURE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Finger$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_Finger, Buffer> implements NativeResource {
        private static final SDL_Finger ELEMENT_FACTORY = SDL_Finger.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_Finger.SIZEOF);
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
        public SDL_Finger getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_FingerID")
        public long id() {
            return SDL_Finger.nid(address());
        }

        public float x() {
            return SDL_Finger.nx(address());
        }

        public float y() {
            return SDL_Finger.ny(address());
        }

        public float pressure() {
            return SDL_Finger.npressure(address());
        }

        public Buffer id(@NativeType("SDL_FingerID") long value) {
            SDL_Finger.nid(address(), value);
            return this;
        }

        public Buffer x(float value) {
            SDL_Finger.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_Finger.ny(address(), value);
            return this;
        }

        public Buffer pressure(float value) {
            SDL_Finger.npressure(address(), value);
            return this;
        }
    }
}
