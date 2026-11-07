package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyDeviceEvent.class */
public class SDL_JoyDeviceEvent extends Struct<SDL_JoyDeviceEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WHICH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
    }

    protected SDL_JoyDeviceEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_JoyDeviceEvent create(long address, ByteBuffer container) {
        return new SDL_JoyDeviceEvent(address, container);
    }

    public SDL_JoyDeviceEvent(ByteBuffer container) {
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

    public SDL_JoyDeviceEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_JoyDeviceEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_JoyDeviceEvent which(@NativeType("SDL_JoystickID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_JoyDeviceEvent set(int type, long timestamp, int which) {
        type(type);
        timestamp(timestamp);
        which(which);
        return this;
    }

    public SDL_JoyDeviceEvent set(SDL_JoyDeviceEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_JoyDeviceEvent malloc() {
        return new SDL_JoyDeviceEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_JoyDeviceEvent calloc() {
        return new SDL_JoyDeviceEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_JoyDeviceEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_JoyDeviceEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_JoyDeviceEvent create(long address) {
        return new SDL_JoyDeviceEvent(address, null);
    }

    public static SDL_JoyDeviceEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_JoyDeviceEvent(address, null);
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

    public static SDL_JoyDeviceEvent malloc(MemoryStack stack) {
        return new SDL_JoyDeviceEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_JoyDeviceEvent calloc(MemoryStack stack) {
        return new SDL_JoyDeviceEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_JoyDeviceEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_JoyDeviceEvent, Buffer> implements NativeResource {
        private static final SDL_JoyDeviceEvent ELEMENT_FACTORY = SDL_JoyDeviceEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_JoyDeviceEvent.SIZEOF);
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
        public SDL_JoyDeviceEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_JoyDeviceEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_JoyDeviceEvent.ntimestamp(address());
        }

        @NativeType("SDL_JoystickID")
        public int which() {
            return SDL_JoyDeviceEvent.nwhich(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_JoyDeviceEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_JoyDeviceEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_JoystickID") int value) {
            SDL_JoyDeviceEvent.nwhich(address(), value);
            return this;
        }
    }
}
