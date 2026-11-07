package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MessageBoxColor.class */
public class SDL_MessageBoxColor extends Struct<SDL_MessageBoxColor> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int R;
    public static final int G;
    public static final int B;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
    }

    protected SDL_MessageBoxColor(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_MessageBoxColor create(long address, ByteBuffer container) {
        return new SDL_MessageBoxColor(address, container);
    }

    public SDL_MessageBoxColor(ByteBuffer container) {
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

    public SDL_MessageBoxColor r(@NativeType("Uint8") byte value) {
        nr(address(), value);
        return this;
    }

    public SDL_MessageBoxColor g(@NativeType("Uint8") byte value) {
        ng(address(), value);
        return this;
    }

    public SDL_MessageBoxColor b(@NativeType("Uint8") byte value) {
        nb(address(), value);
        return this;
    }

    public SDL_MessageBoxColor set(byte r, byte g, byte b) {
        r(r);
        g(g);
        b(b);
        return this;
    }

    public SDL_MessageBoxColor set(SDL_MessageBoxColor src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_MessageBoxColor malloc() {
        return new SDL_MessageBoxColor(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_MessageBoxColor calloc() {
        return new SDL_MessageBoxColor(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_MessageBoxColor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MessageBoxColor(MemoryUtil.memAddress(container), container);
    }

    public static SDL_MessageBoxColor create(long address) {
        return new SDL_MessageBoxColor(address, null);
    }

    public static SDL_MessageBoxColor createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_MessageBoxColor(address, null);
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

    public static SDL_MessageBoxColor malloc(MemoryStack stack) {
        return new SDL_MessageBoxColor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_MessageBoxColor calloc(MemoryStack stack) {
        return new SDL_MessageBoxColor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nr(long struct, byte value) {
        MemoryUtil.memPutByte(struct + R, value);
    }

    public static void ng(long struct, byte value) {
        MemoryUtil.memPutByte(struct + G, value);
    }

    public static void nb(long struct, byte value) {
        MemoryUtil.memPutByte(struct + B, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MessageBoxColor$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_MessageBoxColor, Buffer> implements NativeResource {
        private static final SDL_MessageBoxColor ELEMENT_FACTORY = SDL_MessageBoxColor.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_MessageBoxColor.SIZEOF);
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
        public SDL_MessageBoxColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint8")
        public byte r() {
            return SDL_MessageBoxColor.nr(address());
        }

        @NativeType("Uint8")
        public byte g() {
            return SDL_MessageBoxColor.ng(address());
        }

        @NativeType("Uint8")
        public byte b() {
            return SDL_MessageBoxColor.nb(address());
        }

        public Buffer r(@NativeType("Uint8") byte value) {
            SDL_MessageBoxColor.nr(address(), value);
            return this;
        }

        public Buffer g(@NativeType("Uint8") byte value) {
            SDL_MessageBoxColor.ng(address(), value);
            return this;
        }

        public Buffer b(@NativeType("Uint8") byte value) {
            SDL_MessageBoxColor.nb(address(), value);
            return this;
        }
    }
}
