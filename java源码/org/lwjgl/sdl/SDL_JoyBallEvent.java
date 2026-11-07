package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyBallEvent.class */
public class SDL_JoyBallEvent extends Struct<SDL_JoyBallEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WHICH;
    public static final int BALL;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PADDING3;
    public static final int XREL;
    public static final int YREL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(1), __member(1), __member(1), __member(1), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        BALL = layout.offsetof(4);
        PADDING1 = layout.offsetof(5);
        PADDING2 = layout.offsetof(6);
        PADDING3 = layout.offsetof(7);
        XREL = layout.offsetof(8);
        YREL = layout.offsetof(9);
    }

    protected SDL_JoyBallEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_JoyBallEvent create(long address, ByteBuffer container) {
        return new SDL_JoyBallEvent(address, container);
    }

    public SDL_JoyBallEvent(ByteBuffer container) {
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
    public byte ball() {
        return nball(address());
    }

    @NativeType("Sint16")
    public short xrel() {
        return nxrel(address());
    }

    @NativeType("Sint16")
    public short yrel() {
        return nyrel(address());
    }

    public SDL_JoyBallEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_JoyBallEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_JoyBallEvent which(@NativeType("SDL_JoystickID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_JoyBallEvent ball(@NativeType("Uint8") byte value) {
        nball(address(), value);
        return this;
    }

    public SDL_JoyBallEvent xrel(@NativeType("Sint16") short value) {
        nxrel(address(), value);
        return this;
    }

    public SDL_JoyBallEvent yrel(@NativeType("Sint16") short value) {
        nyrel(address(), value);
        return this;
    }

    public SDL_JoyBallEvent set(int type, long timestamp, int which, byte ball, short xrel, short yrel) {
        type(type);
        timestamp(timestamp);
        which(which);
        ball(ball);
        xrel(xrel);
        yrel(yrel);
        return this;
    }

    public SDL_JoyBallEvent set(SDL_JoyBallEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_JoyBallEvent malloc() {
        return new SDL_JoyBallEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_JoyBallEvent calloc() {
        return new SDL_JoyBallEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_JoyBallEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_JoyBallEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_JoyBallEvent create(long address) {
        return new SDL_JoyBallEvent(address, null);
    }

    public static SDL_JoyBallEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_JoyBallEvent(address, null);
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

    public static SDL_JoyBallEvent malloc(MemoryStack stack) {
        return new SDL_JoyBallEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_JoyBallEvent calloc(MemoryStack stack) {
        return new SDL_JoyBallEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static byte nball(long struct) {
        return MemoryUtil.memGetByte(struct + BALL);
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

    public static short nxrel(long struct) {
        return MemoryUtil.memGetShort(struct + XREL);
    }

    public static short nyrel(long struct) {
        return MemoryUtil.memGetShort(struct + YREL);
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

    public static void nball(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BALL, value);
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

    public static void nxrel(long struct, short value) {
        MemoryUtil.memPutShort(struct + XREL, value);
    }

    public static void nyrel(long struct, short value) {
        MemoryUtil.memPutShort(struct + YREL, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyBallEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_JoyBallEvent, Buffer> implements NativeResource {
        private static final SDL_JoyBallEvent ELEMENT_FACTORY = SDL_JoyBallEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_JoyBallEvent.SIZEOF);
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
        public SDL_JoyBallEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_JoyBallEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_JoyBallEvent.ntimestamp(address());
        }

        @NativeType("SDL_JoystickID")
        public int which() {
            return SDL_JoyBallEvent.nwhich(address());
        }

        @NativeType("Uint8")
        public byte ball() {
            return SDL_JoyBallEvent.nball(address());
        }

        @NativeType("Sint16")
        public short xrel() {
            return SDL_JoyBallEvent.nxrel(address());
        }

        @NativeType("Sint16")
        public short yrel() {
            return SDL_JoyBallEvent.nyrel(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_JoyBallEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_JoyBallEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_JoystickID") int value) {
            SDL_JoyBallEvent.nwhich(address(), value);
            return this;
        }

        public Buffer ball(@NativeType("Uint8") byte value) {
            SDL_JoyBallEvent.nball(address(), value);
            return this;
        }

        public Buffer xrel(@NativeType("Sint16") short value) {
            SDL_JoyBallEvent.nxrel(address(), value);
            return this;
        }

        public Buffer yrel(@NativeType("Sint16") short value) {
            SDL_JoyBallEvent.nyrel(address(), value);
            return this;
        }
    }
}
