package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticDirection.class */
public class SDL_HapticDirection extends Struct<SDL_HapticDirection> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int DIR;

    static {
        Struct.Layout layout = __struct(__member(1), __array(4, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        DIR = layout.offsetof(1);
    }

    protected SDL_HapticDirection(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_HapticDirection create(long address, ByteBuffer container) {
        return new SDL_HapticDirection(address, container);
    }

    public SDL_HapticDirection(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_HapticDirectionType")
    public byte type() {
        return ntype(address());
    }

    @NativeType("Sint32[3]")
    public IntBuffer dir() {
        return ndir(address());
    }

    @NativeType("Sint32")
    public int dir(int index) {
        return ndir(address(), index);
    }

    public SDL_HapticDirection type(@NativeType("SDL_HapticDirectionType") byte value) {
        ntype(address(), value);
        return this;
    }

    public SDL_HapticDirection dir(@NativeType("Sint32[3]") IntBuffer value) {
        ndir(address(), value);
        return this;
    }

    public SDL_HapticDirection dir(int index, @NativeType("Sint32") int value) {
        ndir(address(), index, value);
        return this;
    }

    public SDL_HapticDirection set(byte type, IntBuffer dir) {
        type(type);
        dir(dir);
        return this;
    }

    public SDL_HapticDirection set(SDL_HapticDirection src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_HapticDirection malloc() {
        return new SDL_HapticDirection(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_HapticDirection calloc() {
        return new SDL_HapticDirection(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_HapticDirection create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticDirection(MemoryUtil.memAddress(container), container);
    }

    public static SDL_HapticDirection create(long address) {
        return new SDL_HapticDirection(address, null);
    }

    public static SDL_HapticDirection createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_HapticDirection(address, null);
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

    public static SDL_HapticDirection malloc(MemoryStack stack) {
        return new SDL_HapticDirection(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_HapticDirection calloc(MemoryStack stack) {
        return new SDL_HapticDirection(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte ntype(long struct) {
        return MemoryUtil.memGetByte(struct + TYPE);
    }

    public static IntBuffer ndir(long struct) {
        return MemoryUtil.memIntBuffer(struct + DIR, 3);
    }

    public static int ndir(long struct, int index) {
        return MemoryUtil.memGetInt(struct + DIR + (Checks.check(index, 3) * 4));
    }

    public static void ntype(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TYPE, value);
    }

    public static void ndir(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DIR, value.remaining() * 4);
    }

    public static void ndir(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + DIR + (Checks.check(index, 3) * 4), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticDirection$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_HapticDirection, Buffer> implements NativeResource {
        private static final SDL_HapticDirection ELEMENT_FACTORY = SDL_HapticDirection.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_HapticDirection.SIZEOF);
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
        public SDL_HapticDirection getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_HapticDirectionType")
        public byte type() {
            return SDL_HapticDirection.ntype(address());
        }

        @NativeType("Sint32[3]")
        public IntBuffer dir() {
            return SDL_HapticDirection.ndir(address());
        }

        @NativeType("Sint32")
        public int dir(int index) {
            return SDL_HapticDirection.ndir(address(), index);
        }

        public Buffer type(@NativeType("SDL_HapticDirectionType") byte value) {
            SDL_HapticDirection.ntype(address(), value);
            return this;
        }

        public Buffer dir(@NativeType("Sint32[3]") IntBuffer value) {
            SDL_HapticDirection.ndir(address(), value);
            return this;
        }

        public Buffer dir(int index, @NativeType("Sint32") int value) {
            SDL_HapticDirection.ndir(address(), index, value);
            return this;
        }
    }
}
