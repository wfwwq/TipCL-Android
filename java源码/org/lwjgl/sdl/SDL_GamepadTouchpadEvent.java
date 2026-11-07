package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GamepadTouchpadEvent.class */
public class SDL_GamepadTouchpadEvent extends Struct<SDL_GamepadTouchpadEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WHICH;
    public static final int TOUCHPAD;
    public static final int FINGER;
    public static final int X;
    public static final int Y;
    public static final int PRESSURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        TOUCHPAD = layout.offsetof(4);
        FINGER = layout.offsetof(5);
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
        PRESSURE = layout.offsetof(8);
    }

    protected SDL_GamepadTouchpadEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GamepadTouchpadEvent create(long address, ByteBuffer container) {
        return new SDL_GamepadTouchpadEvent(address, container);
    }

    public SDL_GamepadTouchpadEvent(ByteBuffer container) {
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

    @NativeType("Sint32")
    public int touchpad() {
        return ntouchpad(address());
    }

    @NativeType("Sint32")
    public int finger() {
        return nfinger(address());
    }

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    public float pressure() {
        return npressure(address());
    }

    public SDL_GamepadTouchpadEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_GamepadTouchpadEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_GamepadTouchpadEvent which(@NativeType("SDL_JoystickID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_GamepadTouchpadEvent touchpad(@NativeType("Sint32") int value) {
        ntouchpad(address(), value);
        return this;
    }

    public SDL_GamepadTouchpadEvent finger(@NativeType("Sint32") int value) {
        nfinger(address(), value);
        return this;
    }

    public SDL_GamepadTouchpadEvent x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_GamepadTouchpadEvent y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_GamepadTouchpadEvent pressure(float value) {
        npressure(address(), value);
        return this;
    }

    public SDL_GamepadTouchpadEvent set(int type, long timestamp, int which, int touchpad, int finger, float x, float y, float pressure) {
        type(type);
        timestamp(timestamp);
        which(which);
        touchpad(touchpad);
        finger(finger);
        x(x);
        y(y);
        pressure(pressure);
        return this;
    }

    public SDL_GamepadTouchpadEvent set(SDL_GamepadTouchpadEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GamepadTouchpadEvent malloc() {
        return new SDL_GamepadTouchpadEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GamepadTouchpadEvent calloc() {
        return new SDL_GamepadTouchpadEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GamepadTouchpadEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GamepadTouchpadEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GamepadTouchpadEvent create(long address) {
        return new SDL_GamepadTouchpadEvent(address, null);
    }

    public static SDL_GamepadTouchpadEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GamepadTouchpadEvent(address, null);
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

    public static SDL_GamepadTouchpadEvent malloc(MemoryStack stack) {
        return new SDL_GamepadTouchpadEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GamepadTouchpadEvent calloc(MemoryStack stack) {
        return new SDL_GamepadTouchpadEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntouchpad(long struct) {
        return MemoryUtil.memGetInt(struct + TOUCHPAD);
    }

    public static int nfinger(long struct) {
        return MemoryUtil.memGetInt(struct + FINGER);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
    }

    public static float npressure(long struct) {
        return MemoryUtil.memGetFloat(struct + PRESSURE);
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

    public static void ntouchpad(long struct, int value) {
        MemoryUtil.memPutInt(struct + TOUCHPAD, value);
    }

    public static void nfinger(long struct, int value) {
        MemoryUtil.memPutInt(struct + FINGER, value);
    }

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    public static void npressure(long struct, float value) {
        MemoryUtil.memPutFloat(struct + PRESSURE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GamepadTouchpadEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GamepadTouchpadEvent, Buffer> implements NativeResource {
        private static final SDL_GamepadTouchpadEvent ELEMENT_FACTORY = SDL_GamepadTouchpadEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GamepadTouchpadEvent.SIZEOF);
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
        public SDL_GamepadTouchpadEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_GamepadTouchpadEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_GamepadTouchpadEvent.ntimestamp(address());
        }

        @NativeType("SDL_JoystickID")
        public int which() {
            return SDL_GamepadTouchpadEvent.nwhich(address());
        }

        @NativeType("Sint32")
        public int touchpad() {
            return SDL_GamepadTouchpadEvent.ntouchpad(address());
        }

        @NativeType("Sint32")
        public int finger() {
            return SDL_GamepadTouchpadEvent.nfinger(address());
        }

        public float x() {
            return SDL_GamepadTouchpadEvent.nx(address());
        }

        public float y() {
            return SDL_GamepadTouchpadEvent.ny(address());
        }

        public float pressure() {
            return SDL_GamepadTouchpadEvent.npressure(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_GamepadTouchpadEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_GamepadTouchpadEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_JoystickID") int value) {
            SDL_GamepadTouchpadEvent.nwhich(address(), value);
            return this;
        }

        public Buffer touchpad(@NativeType("Sint32") int value) {
            SDL_GamepadTouchpadEvent.ntouchpad(address(), value);
            return this;
        }

        public Buffer finger(@NativeType("Sint32") int value) {
            SDL_GamepadTouchpadEvent.nfinger(address(), value);
            return this;
        }

        public Buffer x(float value) {
            SDL_GamepadTouchpadEvent.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_GamepadTouchpadEvent.ny(address(), value);
            return this;
        }

        public Buffer pressure(float value) {
            SDL_GamepadTouchpadEvent.npressure(address(), value);
            return this;
        }
    }
}
