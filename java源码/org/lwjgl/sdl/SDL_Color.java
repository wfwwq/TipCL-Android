package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Color.class */
public class SDL_Color extends Struct<SDL_Color> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int R;
    public static final int G;
    public static final int B;
    public static final int A;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    protected SDL_Color(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_Color create(long address, ByteBuffer container) {
        return new SDL_Color(address, container);
    }

    public SDL_Color(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint8")
    public byte r() {
        return nr(address());
    }

    @NativeType("Uint8")
    public byte g() {
        return ng(address());
    }

    @NativeType("Uint8")
    public byte b() {
        return nb(address());
    }

    @NativeType("Uint8")
    public byte a() {
        return na(address());
    }

    public SDL_Color r(@NativeType("Uint8") byte value) {
        nr(address(), value);
        return this;
    }

    public SDL_Color g(@NativeType("Uint8") byte value) {
        ng(address(), value);
        return this;
    }

    public SDL_Color b(@NativeType("Uint8") byte value) {
        nb(address(), value);
        return this;
    }

    public SDL_Color a(@NativeType("Uint8") byte value) {
        na(address(), value);
        return this;
    }

    public SDL_Color set(byte r, byte g, byte b, byte a) {
        r(r);
        g(g);
        b(b);
        a(a);
        return this;
    }

    public SDL_Color set(SDL_Color src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_Color malloc() {
        return new SDL_Color(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_Color calloc() {
        return new SDL_Color(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_Color create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Color(MemoryUtil.memAddress(container), container);
    }

    public static SDL_Color create(long address) {
        return new SDL_Color(address, null);
    }

    public static SDL_Color createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_Color(address, null);
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

    public static SDL_Color malloc(MemoryStack stack) {
        return new SDL_Color(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_Color calloc(MemoryStack stack) {
        return new SDL_Color(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte nr(long struct) {
        return MemoryUtil.memGetByte(struct + R);
    }

    public static byte ng(long struct) {
        return MemoryUtil.memGetByte(struct + G);
    }

    public static byte nb(long struct) {
        return MemoryUtil.memGetByte(struct + B);
    }

    public static byte na(long struct) {
        return MemoryUtil.memGetByte(struct + A);
    }

    public static void nr(long struct, byte value) {
        MemoryUtil.memPutByte(struct + R, value);
    }

    public static void ng(long struct, byte value) {
        MemoryUtil.memPutByte(struct + G, value);
    }

    public static void nb(long struct, byte value) {
        MemoryUtil.memPutByte(struct + B, value);
    }

    public static void na(long struct, byte value) {
        MemoryUtil.memPutByte(struct + A, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Color$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_Color, Buffer> implements NativeResource {
        private static final SDL_Color ELEMENT_FACTORY = SDL_Color.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_Color.SIZEOF);
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
        public SDL_Color getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint8")
        public byte r() {
            return SDL_Color.nr(address());
        }

        @NativeType("Uint8")
        public byte g() {
            return SDL_Color.ng(address());
        }

        @NativeType("Uint8")
        public byte b() {
            return SDL_Color.nb(address());
        }

        @NativeType("Uint8")
        public byte a() {
            return SDL_Color.na(address());
        }

        public Buffer r(@NativeType("Uint8") byte value) {
            SDL_Color.nr(address(), value);
            return this;
        }

        public Buffer g(@NativeType("Uint8") byte value) {
            SDL_Color.ng(address(), value);
            return this;
        }

        public Buffer b(@NativeType("Uint8") byte value) {
            SDL_Color.nb(address(), value);
            return this;
        }

        public Buffer a(@NativeType("Uint8") byte value) {
            SDL_Color.na(address(), value);
            return this;
        }
    }
}
