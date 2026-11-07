package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticLeftRight.class */
public class SDL_HapticLeftRight extends Struct<SDL_HapticLeftRight> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int LENGTH;
    public static final int LARGE_MAGNITUDE;
    public static final int SMALL_MAGNITUDE;

    static {
        Struct.Layout layout = __struct(__member(2), __member(4), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
        LARGE_MAGNITUDE = layout.offsetof(2);
        SMALL_MAGNITUDE = layout.offsetof(3);
    }

    protected SDL_HapticLeftRight(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_HapticLeftRight create(long address, ByteBuffer container) {
        return new SDL_HapticLeftRight(address, container);
    }

    public SDL_HapticLeftRight(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_HapticEffectType")
    public short type() {
        return ntype(address());
    }

    @NativeType("Uint32")
    public int length() {
        return nlength(address());
    }

    @NativeType("Uint16")
    public short large_magnitude() {
        return nlarge_magnitude(address());
    }

    @NativeType("Uint16")
    public short small_magnitude() {
        return nsmall_magnitude(address());
    }

    public SDL_HapticLeftRight type(@NativeType("SDL_HapticEffectType") short value) {
        ntype(address(), value);
        return this;
    }

    public SDL_HapticLeftRight length(@NativeType("Uint32") int value) {
        nlength(address(), value);
        return this;
    }

    public SDL_HapticLeftRight large_magnitude(@NativeType("Uint16") short value) {
        nlarge_magnitude(address(), value);
        return this;
    }

    public SDL_HapticLeftRight small_magnitude(@NativeType("Uint16") short value) {
        nsmall_magnitude(address(), value);
        return this;
    }

    public SDL_HapticLeftRight set(short type, int length, short large_magnitude, short small_magnitude) {
        type(type);
        length(length);
        large_magnitude(large_magnitude);
        small_magnitude(small_magnitude);
        return this;
    }

    public SDL_HapticLeftRight set(SDL_HapticLeftRight src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_HapticLeftRight malloc() {
        return new SDL_HapticLeftRight(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_HapticLeftRight calloc() {
        return new SDL_HapticLeftRight(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_HapticLeftRight create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticLeftRight(MemoryUtil.memAddress(container), container);
    }

    public static SDL_HapticLeftRight create(long address) {
        return new SDL_HapticLeftRight(address, null);
    }

    public static SDL_HapticLeftRight createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_HapticLeftRight(address, null);
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

    public static SDL_HapticLeftRight malloc(MemoryStack stack) {
        return new SDL_HapticLeftRight(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_HapticLeftRight calloc(MemoryStack stack) {
        return new SDL_HapticLeftRight(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short ntype(long struct) {
        return MemoryUtil.memGetShort(struct + TYPE);
    }

    public static int nlength(long struct) {
        return MemoryUtil.memGetInt(struct + LENGTH);
    }

    public static short nlarge_magnitude(long struct) {
        return MemoryUtil.memGetShort(struct + LARGE_MAGNITUDE);
    }

    public static short nsmall_magnitude(long struct) {
        return MemoryUtil.memGetShort(struct + SMALL_MAGNITUDE);
    }

    public static void ntype(long struct, short value) {
        MemoryUtil.memPutShort(struct + TYPE, value);
    }

    public static void nlength(long struct, int value) {
        MemoryUtil.memPutInt(struct + LENGTH, value);
    }

    public static void nlarge_magnitude(long struct, short value) {
        MemoryUtil.memPutShort(struct + LARGE_MAGNITUDE, value);
    }

    public static void nsmall_magnitude(long struct, short value) {
        MemoryUtil.memPutShort(struct + SMALL_MAGNITUDE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticLeftRight$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_HapticLeftRight, Buffer> implements NativeResource {
        private static final SDL_HapticLeftRight ELEMENT_FACTORY = SDL_HapticLeftRight.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_HapticLeftRight.SIZEOF);
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
        public SDL_HapticLeftRight getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_HapticEffectType")
        public short type() {
            return SDL_HapticLeftRight.ntype(address());
        }

        @NativeType("Uint32")
        public int length() {
            return SDL_HapticLeftRight.nlength(address());
        }

        @NativeType("Uint16")
        public short large_magnitude() {
            return SDL_HapticLeftRight.nlarge_magnitude(address());
        }

        @NativeType("Uint16")
        public short small_magnitude() {
            return SDL_HapticLeftRight.nsmall_magnitude(address());
        }

        public Buffer type(@NativeType("SDL_HapticEffectType") short value) {
            SDL_HapticLeftRight.ntype(address(), value);
            return this;
        }

        public Buffer length(@NativeType("Uint32") int value) {
            SDL_HapticLeftRight.nlength(address(), value);
            return this;
        }

        public Buffer large_magnitude(@NativeType("Uint16") short value) {
            SDL_HapticLeftRight.nlarge_magnitude(address(), value);
            return this;
        }

        public Buffer small_magnitude(@NativeType("Uint16") short value) {
            SDL_HapticLeftRight.nsmall_magnitude(address(), value);
            return this;
        }
    }
}
