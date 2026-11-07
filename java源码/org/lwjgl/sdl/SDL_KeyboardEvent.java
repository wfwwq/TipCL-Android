package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_KeyboardEvent.class */
public class SDL_KeyboardEvent extends Struct<SDL_KeyboardEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int WHICH;
    public static final int SCANCODE;
    public static final int KEY;
    public static final int MOD;
    public static final int RAW;
    public static final int DOWN;
    public static final int REPEAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(4), __member(2), __member(2), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        WHICH = layout.offsetof(4);
        SCANCODE = layout.offsetof(5);
        KEY = layout.offsetof(6);
        MOD = layout.offsetof(7);
        RAW = layout.offsetof(8);
        DOWN = layout.offsetof(9);
        REPEAT = layout.offsetof(10);
    }

    protected SDL_KeyboardEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_KeyboardEvent create(long address, ByteBuffer container) {
        return new SDL_KeyboardEvent(address, container);
    }

    public SDL_KeyboardEvent(ByteBuffer container) {
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

    @NativeType("SDL_KeyboardID")
    public int which() {
        return nwhich(address());
    }

    @NativeType("SDL_Scancode")
    public int scancode() {
        return nscancode(address());
    }

    @NativeType("SDL_Keycode")
    public int key() {
        return nkey(address());
    }

    @NativeType("SDL_Keymod")
    public short mod() {
        return nmod(address());
    }

    @NativeType("Uint16")
    public short raw() {
        return nraw(address());
    }

    @NativeType("bool")
    public boolean down() {
        return ndown(address());
    }

    @NativeType("bool")
    public boolean repeat() {
        return nrepeat(address());
    }

    public SDL_KeyboardEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_KeyboardEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_KeyboardEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_KeyboardEvent which(@NativeType("SDL_KeyboardID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_KeyboardEvent scancode(@NativeType("SDL_Scancode") int value) {
        nscancode(address(), value);
        return this;
    }

    public SDL_KeyboardEvent key(@NativeType("SDL_Keycode") int value) {
        nkey(address(), value);
        return this;
    }

    public SDL_KeyboardEvent mod(@NativeType("SDL_Keymod") short value) {
        nmod(address(), value);
        return this;
    }

    public SDL_KeyboardEvent raw(@NativeType("Uint16") short value) {
        nraw(address(), value);
        return this;
    }

    public SDL_KeyboardEvent down(@NativeType("bool") boolean value) {
        ndown(address(), value);
        return this;
    }

    public SDL_KeyboardEvent repeat(@NativeType("bool") boolean value) {
        nrepeat(address(), value);
        return this;
    }

    public SDL_KeyboardEvent set(int type, long timestamp, int windowID, int which, int scancode, int key, short mod, short raw, boolean down, boolean repeat) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        scancode(scancode);
        key(key);
        mod(mod);
        raw(raw);
        down(down);
        repeat(repeat);
        return this;
    }

    public SDL_KeyboardEvent set(SDL_KeyboardEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_KeyboardEvent malloc() {
        return new SDL_KeyboardEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_KeyboardEvent calloc() {
        return new SDL_KeyboardEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_KeyboardEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_KeyboardEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_KeyboardEvent create(long address) {
        return new SDL_KeyboardEvent(address, null);
    }

    public static SDL_KeyboardEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_KeyboardEvent(address, null);
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

    public static SDL_KeyboardEvent malloc(MemoryStack stack) {
        return new SDL_KeyboardEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_KeyboardEvent calloc(MemoryStack stack) {
        return new SDL_KeyboardEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nscancode(long struct) {
        return MemoryUtil.memGetInt(struct + SCANCODE);
    }

    public static int nkey(long struct) {
        return MemoryUtil.memGetInt(struct + KEY);
    }

    public static short nmod(long struct) {
        return MemoryUtil.memGetShort(struct + MOD);
    }

    public static short nraw(long struct) {
        return MemoryUtil.memGetShort(struct + RAW);
    }

    public static boolean ndown(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) DOWN)) != 0;
    }

    public static boolean nrepeat(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) REPEAT)) != 0;
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

    public static void nscancode(long struct, int value) {
        MemoryUtil.memPutInt(struct + SCANCODE, value);
    }

    public static void nkey(long struct, int value) {
        MemoryUtil.memPutInt(struct + KEY, value);
    }

    public static void nmod(long struct, short value) {
        MemoryUtil.memPutShort(struct + MOD, value);
    }

    public static void nraw(long struct, short value) {
        MemoryUtil.memPutShort(struct + RAW, value);
    }

    public static void ndown(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + DOWN, value ? (byte) 1 : (byte) 0);
    }

    public static void nrepeat(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + REPEAT, value ? (byte) 1 : (byte) 0);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_KeyboardEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_KeyboardEvent, Buffer> implements NativeResource {
        private static final SDL_KeyboardEvent ELEMENT_FACTORY = SDL_KeyboardEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_KeyboardEvent.SIZEOF);
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
        public SDL_KeyboardEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_KeyboardEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_KeyboardEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_KeyboardEvent.nwindowID(address());
        }

        @NativeType("SDL_KeyboardID")
        public int which() {
            return SDL_KeyboardEvent.nwhich(address());
        }

        @NativeType("SDL_Scancode")
        public int scancode() {
            return SDL_KeyboardEvent.nscancode(address());
        }

        @NativeType("SDL_Keycode")
        public int key() {
            return SDL_KeyboardEvent.nkey(address());
        }

        @NativeType("SDL_Keymod")
        public short mod() {
            return SDL_KeyboardEvent.nmod(address());
        }

        @NativeType("Uint16")
        public short raw() {
            return SDL_KeyboardEvent.nraw(address());
        }

        @NativeType("bool")
        public boolean down() {
            return SDL_KeyboardEvent.ndown(address());
        }

        @NativeType("bool")
        public boolean repeat() {
            return SDL_KeyboardEvent.nrepeat(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_KeyboardEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_KeyboardEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_KeyboardEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_KeyboardID") int value) {
            SDL_KeyboardEvent.nwhich(address(), value);
            return this;
        }

        public Buffer scancode(@NativeType("SDL_Scancode") int value) {
            SDL_KeyboardEvent.nscancode(address(), value);
            return this;
        }

        public Buffer key(@NativeType("SDL_Keycode") int value) {
            SDL_KeyboardEvent.nkey(address(), value);
            return this;
        }

        public Buffer mod(@NativeType("SDL_Keymod") short value) {
            SDL_KeyboardEvent.nmod(address(), value);
            return this;
        }

        public Buffer raw(@NativeType("Uint16") short value) {
            SDL_KeyboardEvent.nraw(address(), value);
            return this;
        }

        public Buffer down(@NativeType("bool") boolean value) {
            SDL_KeyboardEvent.ndown(address(), value);
            return this;
        }

        public Buffer repeat(@NativeType("bool") boolean value) {
            SDL_KeyboardEvent.nrepeat(address(), value);
            return this;
        }
    }
}
