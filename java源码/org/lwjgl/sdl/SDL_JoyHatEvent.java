package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyHatEvent.class */
public class SDL_JoyHatEvent extends Struct<SDL_JoyHatEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WHICH;
    public static final int HAT;
    public static final int VALUE;
    public static final int PADDING1;
    public static final int PADDING2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        HAT = layout.offsetof(4);
        VALUE = layout.offsetof(5);
        PADDING1 = layout.offsetof(6);
        PADDING2 = layout.offsetof(7);
    }

    protected SDL_JoyHatEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_JoyHatEvent create(long address, ByteBuffer container) {
        return new SDL_JoyHatEvent(address, container);
    }

    public SDL_JoyHatEvent(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_EventType")
    public int type() {
        return ntype(address());
    }

    @NativeType("Uint64")
    public long timestamp() {
        return ntimestamp(address());
    }

    @NativeType("SDL_JoystickID")
    public int which() {
        return nwhich(address());
    }

    @NativeType("Uint8")
    public byte hat() {
        return nhat(address());
    }

    @NativeType("Uint8")
    public byte value() {
        return nvalue(address());
    }

    public SDL_JoyHatEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_JoyHatEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_JoyHatEvent which(@NativeType("SDL_JoystickID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_JoyHatEvent hat(@NativeType("Uint8") byte value) {
        nhat(address(), value);
        return this;
    }

    public SDL_JoyHatEvent value(@NativeType("Uint8") byte value) {
        nvalue(address(), value);
        return this;
    }

    public SDL_JoyHatEvent set(int type, long timestamp, int which, byte hat, byte value) {
        type(type);
        timestamp(timestamp);
        which(which);
        hat(hat);
        value(value);
        return this;
    }

    public SDL_JoyHatEvent set(SDL_JoyHatEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_JoyHatEvent malloc() {
        return new SDL_JoyHatEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_JoyHatEvent calloc() {
        return new SDL_JoyHatEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_JoyHatEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_JoyHatEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_JoyHatEvent create(long address) {
        return new SDL_JoyHatEvent(address, null);
    }

    public static SDL_JoyHatEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_JoyHatEvent(address, null);
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

    public static SDL_JoyHatEvent malloc(MemoryStack stack) {
        return new SDL_JoyHatEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_JoyHatEvent calloc(MemoryStack stack) {
        return new SDL_JoyHatEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nreserved(long struct) {
        return MemoryUtil.memGetInt(struct + RESERVED);
    }

    public static long ntimestamp(long struct) {
        return MemoryUtil.memGetLong(struct + TIMESTAMP);
    }

    public static int nwhich(long struct) {
        return MemoryUtil.memGetInt(struct + WHICH);
    }

    public static byte nhat(long struct) {
        return MemoryUtil.memGetByte(struct + HAT);
    }

    public static byte nvalue(long struct) {
        return MemoryUtil.memGetByte(struct + VALUE);
    }

    public static byte npadding1(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING1);
    }

    public static byte npadding2(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING2);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nreserved(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESERVED, value);
    }

    public static void ntimestamp(long struct, long value) {
        MemoryUtil.memPutLong(struct + TIMESTAMP, value);
    }

    public static void nwhich(long struct, int value) {
        MemoryUtil.memPutInt(struct + WHICH, value);
    }

    public static void nhat(long struct, byte value) {
        MemoryUtil.memPutByte(struct + HAT, value);
    }

    public static void nvalue(long struct, byte value) {
        MemoryUtil.memPutByte(struct + VALUE, value);
    }

    public static void npadding1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING1, value);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyHatEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_JoyHatEvent, Buffer> implements NativeResource {
        private static final SDL_JoyHatEvent ELEMENT_FACTORY = SDL_JoyHatEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_JoyHatEvent.SIZEOF);
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
        public SDL_JoyHatEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_JoyHatEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_JoyHatEvent.ntimestamp(address());
        }

        @NativeType("SDL_JoystickID")
        public int which() {
            return SDL_JoyHatEvent.nwhich(address());
        }

        @NativeType("Uint8")
        public byte hat() {
            return SDL_JoyHatEvent.nhat(address());
        }

        @NativeType("Uint8")
        public byte value() {
            return SDL_JoyHatEvent.nvalue(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_JoyHatEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_JoyHatEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_JoystickID") int value) {
            SDL_JoyHatEvent.nwhich(address(), value);
            return this;
        }

        public Buffer hat(@NativeType("Uint8") byte value) {
            SDL_JoyHatEvent.nhat(address(), value);
            return this;
        }

        public Buffer value(@NativeType("Uint8") byte value) {
            SDL_JoyHatEvent.nvalue(address(), value);
            return this;
        }
    }
}
