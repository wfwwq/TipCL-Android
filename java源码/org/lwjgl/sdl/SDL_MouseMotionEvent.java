package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MouseMotionEvent.class */
public class SDL_MouseMotionEvent extends Struct<SDL_MouseMotionEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int WHICH;
    public static final int STATE;
    public static final int X;
    public static final int Y;
    public static final int XREL;
    public static final int YREL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        WHICH = layout.offsetof(4);
        STATE = layout.offsetof(5);
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
        XREL = layout.offsetof(8);
        YREL = layout.offsetof(9);
    }

    protected SDL_MouseMotionEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_MouseMotionEvent create(long address, ByteBuffer container) {
        return new SDL_MouseMotionEvent(address, container);
    }

    public SDL_MouseMotionEvent(ByteBuffer container) {
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

    @NativeType("SDL_MouseButtonFlags")
    public int state() {
        return nstate(address());
    }

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    public float xrel() {
        return nxrel(address());
    }

    public float yrel() {
        return nyrel(address());
    }

    public SDL_MouseMotionEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_MouseMotionEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_MouseMotionEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_MouseMotionEvent which(@NativeType("SDL_MouseID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_MouseMotionEvent state(@NativeType("SDL_MouseButtonFlags") int value) {
        nstate(address(), value);
        return this;
    }

    public SDL_MouseMotionEvent x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_MouseMotionEvent y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_MouseMotionEvent xrel(float value) {
        nxrel(address(), value);
        return this;
    }

    public SDL_MouseMotionEvent yrel(float value) {
        nyrel(address(), value);
        return this;
    }

    public SDL_MouseMotionEvent set(int type, long timestamp, int windowID, int which, int state, float x, float y, float xrel, float yrel) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        state(state);
        x(x);
        y(y);
        xrel(xrel);
        yrel(yrel);
        return this;
    }

    public SDL_MouseMotionEvent set(SDL_MouseMotionEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_MouseMotionEvent malloc() {
        return new SDL_MouseMotionEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_MouseMotionEvent calloc() {
        return new SDL_MouseMotionEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_MouseMotionEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MouseMotionEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_MouseMotionEvent create(long address) {
        return new SDL_MouseMotionEvent(address, null);
    }

    public static SDL_MouseMotionEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_MouseMotionEvent(address, null);
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

    public static SDL_MouseMotionEvent malloc(MemoryStack stack) {
        return new SDL_MouseMotionEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_MouseMotionEvent calloc(MemoryStack stack) {
        return new SDL_MouseMotionEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstate(long struct) {
        return MemoryUtil.memGetInt(struct + STATE);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
    }

    public static float nxrel(long struct) {
        return MemoryUtil.memGetFloat(struct + XREL);
    }

    public static float nyrel(long struct) {
        return MemoryUtil.memGetFloat(struct + YREL);
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

    public static void nstate(long struct, int value) {
        MemoryUtil.memPutInt(struct + STATE, value);
    }

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    public static void nxrel(long struct, float value) {
        MemoryUtil.memPutFloat(struct + XREL, value);
    }

    public static void nyrel(long struct, float value) {
        MemoryUtil.memPutFloat(struct + YREL, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MouseMotionEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_MouseMotionEvent, Buffer> implements NativeResource {
        private static final SDL_MouseMotionEvent ELEMENT_FACTORY = SDL_MouseMotionEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_MouseMotionEvent.SIZEOF);
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
        public SDL_MouseMotionEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_MouseMotionEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_MouseMotionEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_MouseMotionEvent.nwindowID(address());
        }

        @NativeType("SDL_MouseID")
        public int which() {
            return SDL_MouseMotionEvent.nwhich(address());
        }

        @NativeType("SDL_MouseButtonFlags")
        public int state() {
            return SDL_MouseMotionEvent.nstate(address());
        }

        public float x() {
            return SDL_MouseMotionEvent.nx(address());
        }

        public float y() {
            return SDL_MouseMotionEvent.ny(address());
        }

        public float xrel() {
            return SDL_MouseMotionEvent.nxrel(address());
        }

        public float yrel() {
            return SDL_MouseMotionEvent.nyrel(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_MouseMotionEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_MouseMotionEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_MouseMotionEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_MouseID") int value) {
            SDL_MouseMotionEvent.nwhich(address(), value);
            return this;
        }

        public Buffer state(@NativeType("SDL_MouseButtonFlags") int value) {
            SDL_MouseMotionEvent.nstate(address(), value);
            return this;
        }

        public Buffer x(float value) {
            SDL_MouseMotionEvent.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_MouseMotionEvent.ny(address(), value);
            return this;
        }

        public Buffer xrel(float value) {
            SDL_MouseMotionEvent.nxrel(address(), value);
            return this;
        }

        public Buffer yrel(float value) {
            SDL_MouseMotionEvent.nyrel(address(), value);
            return this;
        }
    }
}
