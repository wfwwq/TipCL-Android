package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyButtonEvent.class */
public class SDL_JoyButtonEvent extends Struct<SDL_JoyButtonEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WHICH;
    public static final int BUTTON;
    public static final int DOWN;
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
        BUTTON = layout.offsetof(4);
        DOWN = layout.offsetof(5);
        PADDING1 = layout.offsetof(6);
        PADDING2 = layout.offsetof(7);
    }

    protected SDL_JoyButtonEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_JoyButtonEvent create(long address, ByteBuffer container) {
        return new SDL_JoyButtonEvent(address, container);
    }

    public SDL_JoyButtonEvent(ByteBuffer container) {
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
    public byte button() {
        return nbutton(address());
    }

    @NativeType("bool")
    public boolean down() {
        return ndown(address());
    }

    public SDL_JoyButtonEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_JoyButtonEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_JoyButtonEvent which(@NativeType("SDL_JoystickID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_JoyButtonEvent button(@NativeType("Uint8") byte value) {
        nbutton(address(), value);
        return this;
    }

    public SDL_JoyButtonEvent down(@NativeType("bool") boolean value) {
        ndown(address(), value);
        return this;
    }

    public SDL_JoyButtonEvent set(int type, long timestamp, int which, byte button, boolean down) {
        type(type);
        timestamp(timestamp);
        which(which);
        button(button);
        down(down);
        return this;
    }

    public SDL_JoyButtonEvent set(SDL_JoyButtonEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_JoyButtonEvent malloc() {
        return new SDL_JoyButtonEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_JoyButtonEvent calloc() {
        return new SDL_JoyButtonEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_JoyButtonEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_JoyButtonEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_JoyButtonEvent create(long address) {
        return new SDL_JoyButtonEvent(address, null);
    }

    public static SDL_JoyButtonEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_JoyButtonEvent(address, null);
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

    public static SDL_JoyButtonEvent malloc(MemoryStack stack) {
        return new SDL_JoyButtonEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_JoyButtonEvent calloc(MemoryStack stack) {
        return new SDL_JoyButtonEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static byte nbutton(long struct) {
        return MemoryUtil.memGetByte(struct + BUTTON);
    }

    public static boolean ndown(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) DOWN)) != 0;
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

    public static void nbutton(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BUTTON, value);
    }

    public static void ndown(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + DOWN, value ? (byte) 1 : (byte) 0);
    }

    public static void npadding1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING1, value);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyButtonEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_JoyButtonEvent, Buffer> implements NativeResource {
        private static final SDL_JoyButtonEvent ELEMENT_FACTORY = SDL_JoyButtonEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_JoyButtonEvent.SIZEOF);
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
        public SDL_JoyButtonEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_JoyButtonEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_JoyButtonEvent.ntimestamp(address());
        }

        @NativeType("SDL_JoystickID")
        public int which() {
            return SDL_JoyButtonEvent.nwhich(address());
        }

        @NativeType("Uint8")
        public byte button() {
            return SDL_JoyButtonEvent.nbutton(address());
        }

        @NativeType("bool")
        public boolean down() {
            return SDL_JoyButtonEvent.ndown(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_JoyButtonEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_JoyButtonEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_JoystickID") int value) {
            SDL_JoyButtonEvent.nwhich(address(), value);
            return this;
        }

        public Buffer button(@NativeType("Uint8") byte value) {
            SDL_JoyButtonEvent.nbutton(address(), value);
            return this;
        }

        public Buffer down(@NativeType("bool") boolean value) {
            SDL_JoyButtonEvent.ndown(address(), value);
            return this;
        }
    }
}
