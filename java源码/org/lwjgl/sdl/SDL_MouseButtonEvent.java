package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MouseButtonEvent.class */
public class SDL_MouseButtonEvent extends Struct<SDL_MouseButtonEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int WHICH;
    public static final int BUTTON;
    public static final int DOWN;
    public static final int CLICKS;
    public static final int PADDING;
    public static final int X;
    public static final int Y;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        WHICH = layout.offsetof(4);
        BUTTON = layout.offsetof(5);
        DOWN = layout.offsetof(6);
        CLICKS = layout.offsetof(7);
        PADDING = layout.offsetof(8);
        X = layout.offsetof(9);
        Y = layout.offsetof(10);
    }

    protected SDL_MouseButtonEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_MouseButtonEvent create(long address, ByteBuffer container) {
        return new SDL_MouseButtonEvent(address, container);
    }

    public SDL_MouseButtonEvent(ByteBuffer container) {
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

    @NativeType("SDL_WindowID")
    public int windowID() {
        return nwindowID(address());
    }

    @NativeType("SDL_MouseID")
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

    @NativeType("Uint8")
    public byte clicks() {
        return nclicks(address());
    }

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    public SDL_MouseButtonEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_MouseButtonEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_MouseButtonEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_MouseButtonEvent which(@NativeType("SDL_MouseID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_MouseButtonEvent button(@NativeType("Uint8") byte value) {
        nbutton(address(), value);
        return this;
    }

    public SDL_MouseButtonEvent down(@NativeType("bool") boolean value) {
        ndown(address(), value);
        return this;
    }

    public SDL_MouseButtonEvent clicks(@NativeType("Uint8") byte value) {
        nclicks(address(), value);
        return this;
    }

    public SDL_MouseButtonEvent x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_MouseButtonEvent y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_MouseButtonEvent set(int type, long timestamp, int windowID, int which, byte button, boolean down, byte clicks, float x, float y) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        button(button);
        down(down);
        clicks(clicks);
        x(x);
        y(y);
        return this;
    }

    public SDL_MouseButtonEvent set(SDL_MouseButtonEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_MouseButtonEvent malloc() {
        return new SDL_MouseButtonEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_MouseButtonEvent calloc() {
        return new SDL_MouseButtonEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_MouseButtonEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MouseButtonEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_MouseButtonEvent create(long address) {
        return new SDL_MouseButtonEvent(address, null);
    }

    public static SDL_MouseButtonEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_MouseButtonEvent(address, null);
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

    public static SDL_MouseButtonEvent malloc(MemoryStack stack) {
        return new SDL_MouseButtonEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_MouseButtonEvent calloc(MemoryStack stack) {
        return new SDL_MouseButtonEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwindowID(long struct) {
        return MemoryUtil.memGetInt(struct + WINDOWID);
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

    public static byte nclicks(long struct) {
        return MemoryUtil.memGetByte(struct + CLICKS);
    }

    public static byte npadding(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
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

    public static void nwindowID(long struct, int value) {
        MemoryUtil.memPutInt(struct + WINDOWID, value);
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

    public static void nclicks(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CLICKS, value);
    }

    public static void npadding(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING, value);
    }

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MouseButtonEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_MouseButtonEvent, Buffer> implements NativeResource {
        private static final SDL_MouseButtonEvent ELEMENT_FACTORY = SDL_MouseButtonEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_MouseButtonEvent.SIZEOF);
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
        public SDL_MouseButtonEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_MouseButtonEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_MouseButtonEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_MouseButtonEvent.nwindowID(address());
        }

        @NativeType("SDL_MouseID")
        public int which() {
            return SDL_MouseButtonEvent.nwhich(address());
        }

        @NativeType("Uint8")
        public byte button() {
            return SDL_MouseButtonEvent.nbutton(address());
        }

        @NativeType("bool")
        public boolean down() {
            return SDL_MouseButtonEvent.ndown(address());
        }

        @NativeType("Uint8")
        public byte clicks() {
            return SDL_MouseButtonEvent.nclicks(address());
        }

        public float x() {
            return SDL_MouseButtonEvent.nx(address());
        }

        public float y() {
            return SDL_MouseButtonEvent.ny(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_MouseButtonEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_MouseButtonEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_MouseButtonEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_MouseID") int value) {
            SDL_MouseButtonEvent.nwhich(address(), value);
            return this;
        }

        public Buffer button(@NativeType("Uint8") byte value) {
            SDL_MouseButtonEvent.nbutton(address(), value);
            return this;
        }

        public Buffer down(@NativeType("bool") boolean value) {
            SDL_MouseButtonEvent.ndown(address(), value);
            return this;
        }

        public Buffer clicks(@NativeType("Uint8") byte value) {
            SDL_MouseButtonEvent.nclicks(address(), value);
            return this;
        }

        public Buffer x(float value) {
            SDL_MouseButtonEvent.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_MouseButtonEvent.ny(address(), value);
            return this;
        }
    }
}
