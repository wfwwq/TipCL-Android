package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_FColor.class */
public class SDL_FColor extends Struct<SDL_FColor> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int R;
    public static final int G;
    public static final int B;
    public static final int A;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    protected SDL_FColor(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_FColor create(long address, ByteBuffer container) {
        return new SDL_FColor(address, container);
    }

    public SDL_FColor(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float r() {
        return nr(address());
    }

    public float g() {
        return ng(address());
    }

    public float b() {
        return nb(address());
    }

    public float a() {
        return na(address());
    }

    public SDL_FColor r(float value) {
        nr(address(), value);
        return this;
    }

    public SDL_FColor g(float value) {
        ng(address(), value);
        return this;
    }

    public SDL_FColor b(float value) {
        nb(address(), value);
        return this;
    }

    public SDL_FColor a(float value) {
        na(address(), value);
        return this;
    }

    public SDL_FColor set(float r, float g, float b, float a) {
        r(r);
        g(g);
        b(b);
        a(a);
        return this;
    }

    public SDL_FColor set(SDL_FColor src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_FColor malloc() {
        return new SDL_FColor(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_FColor calloc() {
        return new SDL_FColor(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_FColor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_FColor(MemoryUtil.memAddress(container), container);
    }

    public static SDL_FColor create(long address) {
        return new SDL_FColor(address, null);
    }

    public static SDL_FColor createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_FColor(address, null);
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

    public static SDL_FColor malloc(MemoryStack stack) {
        return new SDL_FColor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_FColor calloc(MemoryStack stack) {
        return new SDL_FColor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float nr(long struct) {
        return MemoryUtil.memGetFloat(struct + R);
    }

    public static float ng(long struct) {
        return MemoryUtil.memGetFloat(struct + G);
    }

    public static float nb(long struct) {
        return MemoryUtil.memGetFloat(struct + B);
    }

    public static float na(long struct) {
        return MemoryUtil.memGetFloat(struct + A);
    }

    public static void nr(long struct, float value) {
        MemoryUtil.memPutFloat(struct + R, value);
    }

    public static void ng(long struct, float value) {
        MemoryUtil.memPutFloat(struct + G, value);
    }

    public static void nb(long struct, float value) {
        MemoryUtil.memPutFloat(struct + B, value);
    }

    public static void na(long struct, float value) {
        MemoryUtil.memPutFloat(struct + A, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_FColor$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_FColor, Buffer> implements NativeResource {
        private static final SDL_FColor ELEMENT_FACTORY = SDL_FColor.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_FColor.SIZEOF);
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
        public SDL_FColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float r() {
            return SDL_FColor.nr(address());
        }

        public float g() {
            return SDL_FColor.ng(address());
        }

        public float b() {
            return SDL_FColor.nb(address());
        }

        public float a() {
            return SDL_FColor.na(address());
        }

        public Buffer r(float value) {
            SDL_FColor.nr(address(), value);
            return this;
        }

        public Buffer g(float value) {
            SDL_FColor.ng(address(), value);
            return this;
        }

        public Buffer b(float value) {
            SDL_FColor.nb(address(), value);
            return this;
        }

        public Buffer a(float value) {
            SDL_FColor.na(address(), value);
            return this;
        }
    }
}
