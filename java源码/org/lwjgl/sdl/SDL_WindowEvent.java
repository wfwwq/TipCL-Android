package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_WindowEvent.class */
public class SDL_WindowEvent extends Struct<SDL_WindowEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int DATA1;
    public static final int DATA2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        DATA1 = layout.offsetof(4);
        DATA2 = layout.offsetof(5);
    }

    protected SDL_WindowEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_WindowEvent create(long address, ByteBuffer container) {
        return new SDL_WindowEvent(address, container);
    }

    public SDL_WindowEvent(ByteBuffer container) {
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

    @NativeType("Sint32")
    public int data1() {
        return ndata1(address());
    }

    @NativeType("Sint32")
    public int data2() {
        return ndata2(address());
    }

    public SDL_WindowEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_WindowEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_WindowEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_WindowEvent data1(@NativeType("Sint32") int value) {
        ndata1(address(), value);
        return this;
    }

    public SDL_WindowEvent data2(@NativeType("Sint32") int value) {
        ndata2(address(), value);
        return this;
    }

    public SDL_WindowEvent set(int type, long timestamp, int windowID, int data1, int data2) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        data1(data1);
        data2(data2);
        return this;
    }

    public SDL_WindowEvent set(SDL_WindowEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_WindowEvent malloc() {
        return new SDL_WindowEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_WindowEvent calloc() {
        return new SDL_WindowEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_WindowEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_WindowEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_WindowEvent create(long address) {
        return new SDL_WindowEvent(address, null);
    }

    public static SDL_WindowEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_WindowEvent(address, null);
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

    public static SDL_WindowEvent malloc(MemoryStack stack) {
        return new SDL_WindowEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_WindowEvent calloc(MemoryStack stack) {
        return new SDL_WindowEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndata1(long struct) {
        return MemoryUtil.memGetInt(struct + DATA1);
    }

    public static int ndata2(long struct) {
        return MemoryUtil.memGetInt(struct + DATA2);
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

    public static void ndata1(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATA1, value);
    }

    public static void ndata2(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATA2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_WindowEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_WindowEvent, Buffer> implements NativeResource {
        private static final SDL_WindowEvent ELEMENT_FACTORY = SDL_WindowEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_WindowEvent.SIZEOF);
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
        public SDL_WindowEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_WindowEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_WindowEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_WindowEvent.nwindowID(address());
        }

        @NativeType("Sint32")
        public int data1() {
            return SDL_WindowEvent.ndata1(address());
        }

        @NativeType("Sint32")
        public int data2() {
            return SDL_WindowEvent.ndata2(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_WindowEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_WindowEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_WindowEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer data1(@NativeType("Sint32") int value) {
            SDL_WindowEvent.ndata1(address(), value);
            return this;
        }

        public Buffer data2(@NativeType("Sint32") int value) {
            SDL_WindowEvent.ndata2(address(), value);
            return this;
        }
    }
}
