package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_PenAxisEvent.class */
public class SDL_PenAxisEvent extends Struct<SDL_PenAxisEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int WHICH;
    public static final int PEN_STATE;
    public static final int X;
    public static final int Y;
    public static final int AXIS;
    public static final int VALUE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        WHICH = layout.offsetof(4);
        PEN_STATE = layout.offsetof(5);
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
        AXIS = layout.offsetof(8);
        VALUE = layout.offsetof(9);
    }

    protected SDL_PenAxisEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_PenAxisEvent create(long address, ByteBuffer container) {
        return new SDL_PenAxisEvent(address, container);
    }

    public SDL_PenAxisEvent(ByteBuffer container) {
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

    @NativeType("SDL_PenID")
    public int which() {
        return nwhich(address());
    }

    @NativeType("SDL_PenInputFlags")
    public int pen_state() {
        return npen_state(address());
    }

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    @NativeType("SDL_PenAxis")
    public int axis() {
        return naxis(address());
    }

    public float value() {
        return nvalue(address());
    }

    public SDL_PenAxisEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_PenAxisEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_PenAxisEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_PenAxisEvent which(@NativeType("SDL_PenID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_PenAxisEvent pen_state(@NativeType("SDL_PenInputFlags") int value) {
        npen_state(address(), value);
        return this;
    }

    public SDL_PenAxisEvent x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_PenAxisEvent y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_PenAxisEvent axis(@NativeType("SDL_PenAxis") int value) {
        naxis(address(), value);
        return this;
    }

    public SDL_PenAxisEvent value(float value) {
        nvalue(address(), value);
        return this;
    }

    public SDL_PenAxisEvent set(int type, long timestamp, int windowID, int which, int pen_state, float x, float y, int axis, float value) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        pen_state(pen_state);
        x(x);
        y(y);
        axis(axis);
        value(value);
        return this;
    }

    public SDL_PenAxisEvent set(SDL_PenAxisEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_PenAxisEvent malloc() {
        return new SDL_PenAxisEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_PenAxisEvent calloc() {
        return new SDL_PenAxisEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_PenAxisEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_PenAxisEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_PenAxisEvent create(long address) {
        return new SDL_PenAxisEvent(address, null);
    }

    public static SDL_PenAxisEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_PenAxisEvent(address, null);
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

    public static SDL_PenAxisEvent malloc(MemoryStack stack) {
        return new SDL_PenAxisEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_PenAxisEvent calloc(MemoryStack stack) {
        return new SDL_PenAxisEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npen_state(long struct) {
        return MemoryUtil.memGetInt(struct + PEN_STATE);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
    }

    public static int naxis(long struct) {
        return MemoryUtil.memGetInt(struct + AXIS);
    }

    public static float nvalue(long struct) {
        return MemoryUtil.memGetFloat(struct + VALUE);
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

    public static void npen_state(long struct, int value) {
        MemoryUtil.memPutInt(struct + PEN_STATE, value);
    }

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    public static void naxis(long struct, int value) {
        MemoryUtil.memPutInt(struct + AXIS, value);
    }

    public static void nvalue(long struct, float value) {
        MemoryUtil.memPutFloat(struct + VALUE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_PenAxisEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_PenAxisEvent, Buffer> implements NativeResource {
        private static final SDL_PenAxisEvent ELEMENT_FACTORY = SDL_PenAxisEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_PenAxisEvent.SIZEOF);
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
        public SDL_PenAxisEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_PenAxisEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_PenAxisEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_PenAxisEvent.nwindowID(address());
        }

        @NativeType("SDL_PenID")
        public int which() {
            return SDL_PenAxisEvent.nwhich(address());
        }

        @NativeType("SDL_PenInputFlags")
        public int pen_state() {
            return SDL_PenAxisEvent.npen_state(address());
        }

        public float x() {
            return SDL_PenAxisEvent.nx(address());
        }

        public float y() {
            return SDL_PenAxisEvent.ny(address());
        }

        @NativeType("SDL_PenAxis")
        public int axis() {
            return SDL_PenAxisEvent.naxis(address());
        }

        public float value() {
            return SDL_PenAxisEvent.nvalue(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_PenAxisEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_PenAxisEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_PenAxisEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_PenID") int value) {
            SDL_PenAxisEvent.nwhich(address(), value);
            return this;
        }

        public Buffer pen_state(@NativeType("SDL_PenInputFlags") int value) {
            SDL_PenAxisEvent.npen_state(address(), value);
            return this;
        }

        public Buffer x(float value) {
            SDL_PenAxisEvent.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_PenAxisEvent.ny(address(), value);
            return this;
        }

        public Buffer axis(@NativeType("SDL_PenAxis") int value) {
            SDL_PenAxisEvent.naxis(address(), value);
            return this;
        }

        public Buffer value(float value) {
            SDL_PenAxisEvent.nvalue(address(), value);
            return this;
        }
    }
}
