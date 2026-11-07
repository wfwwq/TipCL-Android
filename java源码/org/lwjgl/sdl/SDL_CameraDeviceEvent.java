package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CameraDeviceEvent.class */
public class SDL_CameraDeviceEvent extends Struct<SDL_CameraDeviceEvent> implements NativeResource {
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

    protected SDL_CameraDeviceEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_CameraDeviceEvent create(long address, ByteBuffer container) {
        return new SDL_CameraDeviceEvent(address, container);
    }

    public SDL_CameraDeviceEvent(ByteBuffer container) {
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

    @NativeType("SDL_CameraID")
    public int which() {
        return nwhich(address());
    }

    public SDL_CameraDeviceEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_CameraDeviceEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_CameraDeviceEvent which(@NativeType("SDL_CameraID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_CameraDeviceEvent set(int type, long timestamp, int which) {
        type(type);
        timestamp(timestamp);
        which(which);
        return this;
    }

    public SDL_CameraDeviceEvent set(SDL_CameraDeviceEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_CameraDeviceEvent malloc() {
        return new SDL_CameraDeviceEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_CameraDeviceEvent calloc() {
        return new SDL_CameraDeviceEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_CameraDeviceEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_CameraDeviceEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_CameraDeviceEvent create(long address) {
        return new SDL_CameraDeviceEvent(address, null);
    }

    public static SDL_CameraDeviceEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_CameraDeviceEvent(address, null);
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

    public static SDL_CameraDeviceEvent malloc(MemoryStack stack) {
        return new SDL_CameraDeviceEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_CameraDeviceEvent calloc(MemoryStack stack) {
        return new SDL_CameraDeviceEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CameraDeviceEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_CameraDeviceEvent, Buffer> implements NativeResource {
        private static final SDL_CameraDeviceEvent ELEMENT_FACTORY = SDL_CameraDeviceEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_CameraDeviceEvent.SIZEOF);
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
        public SDL_CameraDeviceEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_CameraDeviceEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_CameraDeviceEvent.ntimestamp(address());
        }

        @NativeType("SDL_CameraID")
        public int which() {
            return SDL_CameraDeviceEvent.nwhich(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_CameraDeviceEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_CameraDeviceEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_CameraID") int value) {
            SDL_CameraDeviceEvent.nwhich(address(), value);
            return this;
        }
    }
}
