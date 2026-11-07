package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TouchFingerEvent.class */
public class SDL_TouchFingerEvent extends Struct<SDL_TouchFingerEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int TOUCHID;
    public static final int FINGERID;
    public static final int X;
    public static final int Y;
    public static final int DX;
    public static final int DY;
    public static final int PRESSURE;
    public static final int WINDOWID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(8), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        TOUCHID = layout.offsetof(3);
        FINGERID = layout.offsetof(4);
        X = layout.offsetof(5);
        Y = layout.offsetof(6);
        DX = layout.offsetof(7);
        DY = layout.offsetof(8);
        PRESSURE = layout.offsetof(9);
        WINDOWID = layout.offsetof(10);
    }

    protected SDL_TouchFingerEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_TouchFingerEvent create(long address, ByteBuffer container) {
        return new SDL_TouchFingerEvent(address, container);
    }

    public SDL_TouchFingerEvent(ByteBuffer container) {
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

    @NativeType("SDL_TouchID")
    public long touchID() {
        return ntouchID(address());
    }

    @NativeType("SDL_FingerID")
    public long fingerID() {
        return nfingerID(address());
    }

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    public float dx() {
        return ndx(address());
    }

    public float dy() {
        return ndy(address());
    }

    public float pressure() {
        return npressure(address());
    }

    @NativeType("SDL_WindowID")
    public int windowID() {
        return nwindowID(address());
    }

    public SDL_TouchFingerEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent touchID(@NativeType("SDL_TouchID") long value) {
        ntouchID(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent fingerID(@NativeType("SDL_FingerID") long value) {
        nfingerID(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent dx(float value) {
        ndx(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent dy(float value) {
        ndy(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent pressure(float value) {
        npressure(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_TouchFingerEvent set(int type, long timestamp, long touchID, long fingerID, float x, float y, float dx, float dy, float pressure, int windowID) {
        type(type);
        timestamp(timestamp);
        touchID(touchID);
        fingerID(fingerID);
        x(x);
        y(y);
        dx(dx);
        dy(dy);
        pressure(pressure);
        windowID(windowID);
        return this;
    }

    public SDL_TouchFingerEvent set(SDL_TouchFingerEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_TouchFingerEvent malloc() {
        return new SDL_TouchFingerEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_TouchFingerEvent calloc() {
        return new SDL_TouchFingerEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_TouchFingerEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_TouchFingerEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_TouchFingerEvent create(long address) {
        return new SDL_TouchFingerEvent(address, null);
    }

    public static SDL_TouchFingerEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_TouchFingerEvent(address, null);
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

    public static SDL_TouchFingerEvent malloc(MemoryStack stack) {
        return new SDL_TouchFingerEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_TouchFingerEvent calloc(MemoryStack stack) {
        return new SDL_TouchFingerEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ntouchID(long struct) {
        return MemoryUtil.memGetLong(struct + TOUCHID);
    }

    public static long nfingerID(long struct) {
        return MemoryUtil.memGetLong(struct + FINGERID);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
    }

    public static float ndx(long struct) {
        return MemoryUtil.memGetFloat(struct + DX);
    }

    public static float ndy(long struct) {
        return MemoryUtil.memGetFloat(struct + DY);
    }

    public static float npressure(long struct) {
        return MemoryUtil.memGetFloat(struct + PRESSURE);
    }

    public static int nwindowID(long struct) {
        return MemoryUtil.memGetInt(struct + WINDOWID);
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

    public static void ntouchID(long struct, long value) {
        MemoryUtil.memPutLong(struct + TOUCHID, value);
    }

    public static void nfingerID(long struct, long value) {
        MemoryUtil.memPutLong(struct + FINGERID, value);
    }

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    public static void ndx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + DX, value);
    }

    public static void ndy(long struct, float value) {
        MemoryUtil.memPutFloat(struct + DY, value);
    }

    public static void npressure(long struct, float value) {
        MemoryUtil.memPutFloat(struct + PRESSURE, value);
    }

    public static void nwindowID(long struct, int value) {
        MemoryUtil.memPutInt(struct + WINDOWID, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TouchFingerEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_TouchFingerEvent, Buffer> implements NativeResource {
        private static final SDL_TouchFingerEvent ELEMENT_FACTORY = SDL_TouchFingerEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_TouchFingerEvent.SIZEOF);
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
        public SDL_TouchFingerEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_TouchFingerEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_TouchFingerEvent.ntimestamp(address());
        }

        @NativeType("SDL_TouchID")
        public long touchID() {
            return SDL_TouchFingerEvent.ntouchID(address());
        }

        @NativeType("SDL_FingerID")
        public long fingerID() {
            return SDL_TouchFingerEvent.nfingerID(address());
        }

        public float x() {
            return SDL_TouchFingerEvent.nx(address());
        }

        public float y() {
            return SDL_TouchFingerEvent.ny(address());
        }

        public float dx() {
            return SDL_TouchFingerEvent.ndx(address());
        }

        public float dy() {
            return SDL_TouchFingerEvent.ndy(address());
        }

        public float pressure() {
            return SDL_TouchFingerEvent.npressure(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_TouchFingerEvent.nwindowID(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_TouchFingerEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_TouchFingerEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer touchID(@NativeType("SDL_TouchID") long value) {
            SDL_TouchFingerEvent.ntouchID(address(), value);
            return this;
        }

        public Buffer fingerID(@NativeType("SDL_FingerID") long value) {
            SDL_TouchFingerEvent.nfingerID(address(), value);
            return this;
        }

        public Buffer x(float value) {
            SDL_TouchFingerEvent.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_TouchFingerEvent.ny(address(), value);
            return this;
        }

        public Buffer dx(float value) {
            SDL_TouchFingerEvent.ndx(address(), value);
            return this;
        }

        public Buffer dy(float value) {
            SDL_TouchFingerEvent.ndy(address(), value);
            return this;
        }

        public Buffer pressure(float value) {
            SDL_TouchFingerEvent.npressure(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_TouchFingerEvent.nwindowID(address(), value);
            return this;
        }
    }
}
