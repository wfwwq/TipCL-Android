package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyAxisEvent.class */
public class SDL_JoyAxisEvent extends Struct<SDL_JoyAxisEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WHICH;
    public static final int AXIS;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PADDING3;
    public static final int VALUE;
    public static final int PADDING4;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(1), __member(1), __member(1), __member(1), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        AXIS = layout.offsetof(4);
        PADDING1 = layout.offsetof(5);
        PADDING2 = layout.offsetof(6);
        PADDING3 = layout.offsetof(7);
        VALUE = layout.offsetof(8);
        PADDING4 = layout.offsetof(9);
    }

    protected SDL_JoyAxisEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_JoyAxisEvent create(long address, ByteBuffer container) {
        return new SDL_JoyAxisEvent(address, container);
    }

    public SDL_JoyAxisEvent(ByteBuffer container) {
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
    public byte axis() {
        return naxis(address());
    }

    @NativeType("Sint16")
    public short value() {
        return nvalue(address());
    }

    public SDL_JoyAxisEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_JoyAxisEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_JoyAxisEvent which(@NativeType("SDL_JoystickID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_JoyAxisEvent axis(@NativeType("Uint8") byte value) {
        naxis(address(), value);
        return this;
    }

    public SDL_JoyAxisEvent value(@NativeType("Sint16") short value) {
        nvalue(address(), value);
        return this;
    }

    public SDL_JoyAxisEvent set(int type, long timestamp, int which, byte axis, short value) {
        type(type);
        timestamp(timestamp);
        which(which);
        axis(axis);
        value(value);
        return this;
    }

    public SDL_JoyAxisEvent set(SDL_JoyAxisEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_JoyAxisEvent malloc() {
        return new SDL_JoyAxisEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_JoyAxisEvent calloc() {
        return new SDL_JoyAxisEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_JoyAxisEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_JoyAxisEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_JoyAxisEvent create(long address) {
        return new SDL_JoyAxisEvent(address, null);
    }

    public static SDL_JoyAxisEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_JoyAxisEvent(address, null);
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

    public static SDL_JoyAxisEvent malloc(MemoryStack stack) {
        return new SDL_JoyAxisEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_JoyAxisEvent calloc(MemoryStack stack) {
        return new SDL_JoyAxisEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static byte naxis(long struct) {
        return MemoryUtil.memGetByte(struct + AXIS);
    }

    public static byte npadding1(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING1);
    }

    public static byte npadding2(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING2);
    }

    public static byte npadding3(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING3);
    }

    public static short nvalue(long struct) {
        return MemoryUtil.memGetShort(struct + VALUE);
    }

    public static short npadding4(long struct) {
        return MemoryUtil.memGetShort(struct + PADDING4);
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

    public static void naxis(long struct, byte value) {
        MemoryUtil.memPutByte(struct + AXIS, value);
    }

    public static void npadding1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING1, value);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    public static void npadding3(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING3, value);
    }

    public static void nvalue(long struct, short value) {
        MemoryUtil.memPutShort(struct + VALUE, value);
    }

    public static void npadding4(long struct, short value) {
        MemoryUtil.memPutShort(struct + PADDING4, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyAxisEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_JoyAxisEvent, Buffer> implements NativeResource {
        private static final SDL_JoyAxisEvent ELEMENT_FACTORY = SDL_JoyAxisEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_JoyAxisEvent.SIZEOF);
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
        public SDL_JoyAxisEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_JoyAxisEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_JoyAxisEvent.ntimestamp(address());
        }

        @NativeType("SDL_JoystickID")
        public int which() {
            return SDL_JoyAxisEvent.nwhich(address());
        }

        @NativeType("Uint8")
        public byte axis() {
            return SDL_JoyAxisEvent.naxis(address());
        }

        @NativeType("Sint16")
        public short value() {
            return SDL_JoyAxisEvent.nvalue(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_JoyAxisEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_JoyAxisEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_JoystickID") int value) {
            SDL_JoyAxisEvent.nwhich(address(), value);
            return this;
        }

        public Buffer axis(@NativeType("Uint8") byte value) {
            SDL_JoyAxisEvent.naxis(address(), value);
            return this;
        }

        public Buffer value(@NativeType("Sint16") short value) {
            SDL_JoyAxisEvent.nvalue(address(), value);
            return this;
        }
    }
}
