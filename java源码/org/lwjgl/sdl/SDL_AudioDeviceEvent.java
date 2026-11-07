package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioDeviceEvent.class */
public class SDL_AudioDeviceEvent extends Struct<SDL_AudioDeviceEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WHICH;
    public static final int RECORDING;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PADDING3;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        RECORDING = layout.offsetof(4);
        PADDING1 = layout.offsetof(5);
        PADDING2 = layout.offsetof(6);
        PADDING3 = layout.offsetof(7);
    }

    protected SDL_AudioDeviceEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_AudioDeviceEvent create(long address, ByteBuffer container) {
        return new SDL_AudioDeviceEvent(address, container);
    }

    public SDL_AudioDeviceEvent(ByteBuffer container) {
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

    @NativeType("SDL_AudioDeviceID")
    public int which() {
        return nwhich(address());
    }

    @NativeType("bool")
    public boolean recording() {
        return nrecording(address());
    }

    public SDL_AudioDeviceEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_AudioDeviceEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_AudioDeviceEvent which(@NativeType("SDL_AudioDeviceID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_AudioDeviceEvent recording(@NativeType("bool") boolean value) {
        nrecording(address(), value);
        return this;
    }

    public SDL_AudioDeviceEvent set(int type, long timestamp, int which, boolean recording) {
        type(type);
        timestamp(timestamp);
        which(which);
        recording(recording);
        return this;
    }

    public SDL_AudioDeviceEvent set(SDL_AudioDeviceEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_AudioDeviceEvent malloc() {
        return new SDL_AudioDeviceEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_AudioDeviceEvent calloc() {
        return new SDL_AudioDeviceEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_AudioDeviceEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_AudioDeviceEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_AudioDeviceEvent create(long address) {
        return new SDL_AudioDeviceEvent(address, null);
    }

    public static SDL_AudioDeviceEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_AudioDeviceEvent(address, null);
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

    public static SDL_AudioDeviceEvent malloc(MemoryStack stack) {
        return new SDL_AudioDeviceEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_AudioDeviceEvent calloc(MemoryStack stack) {
        return new SDL_AudioDeviceEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static boolean nrecording(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) RECORDING)) != 0;
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

    public static void nrecording(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + RECORDING, value ? (byte) 1 : (byte) 0);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioDeviceEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_AudioDeviceEvent, Buffer> implements NativeResource {
        private static final SDL_AudioDeviceEvent ELEMENT_FACTORY = SDL_AudioDeviceEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_AudioDeviceEvent.SIZEOF);
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
        public SDL_AudioDeviceEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_AudioDeviceEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_AudioDeviceEvent.ntimestamp(address());
        }

        @NativeType("SDL_AudioDeviceID")
        public int which() {
            return SDL_AudioDeviceEvent.nwhich(address());
        }

        @NativeType("bool")
        public boolean recording() {
            return SDL_AudioDeviceEvent.nrecording(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_AudioDeviceEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_AudioDeviceEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_AudioDeviceID") int value) {
            SDL_AudioDeviceEvent.nwhich(address(), value);
            return this;
        }

        public Buffer recording(@NativeType("bool") boolean value) {
            SDL_AudioDeviceEvent.nrecording(address(), value);
            return this;
        }
    }
}
