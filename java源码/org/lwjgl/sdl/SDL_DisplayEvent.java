package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DisplayEvent.class */
public class SDL_DisplayEvent extends Struct<SDL_DisplayEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int DISPLAYID;
    public static final int DATA1;
    public static final int DATA2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        DISPLAYID = layout.offsetof(3);
        DATA1 = layout.offsetof(4);
        DATA2 = layout.offsetof(5);
    }

    protected SDL_DisplayEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_DisplayEvent create(long address, ByteBuffer container) {
        return new SDL_DisplayEvent(address, container);
    }

    public SDL_DisplayEvent(ByteBuffer container) {
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

    @NativeType("SDL_DisplayID")
    public int displayID() {
        return ndisplayID(address());
    }

    @NativeType("Sint32")
    public int data1() {
        return ndata1(address());
    }

    @NativeType("Sint32")
    public int data2() {
        return ndata2(address());
    }

    public SDL_DisplayEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_DisplayEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_DisplayEvent displayID(@NativeType("SDL_DisplayID") int value) {
        ndisplayID(address(), value);
        return this;
    }

    public SDL_DisplayEvent data1(@NativeType("Sint32") int value) {
        ndata1(address(), value);
        return this;
    }

    public SDL_DisplayEvent data2(@NativeType("Sint32") int value) {
        ndata2(address(), value);
        return this;
    }

    public SDL_DisplayEvent set(int type, long timestamp, int displayID, int data1, int data2) {
        type(type);
        timestamp(timestamp);
        displayID(displayID);
        data1(data1);
        data2(data2);
        return this;
    }

    public SDL_DisplayEvent set(SDL_DisplayEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_DisplayEvent malloc() {
        return new SDL_DisplayEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_DisplayEvent calloc() {
        return new SDL_DisplayEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_DisplayEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DisplayEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_DisplayEvent create(long address) {
        return new SDL_DisplayEvent(address, null);
    }

    public static SDL_DisplayEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_DisplayEvent(address, null);
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

    public static SDL_DisplayEvent malloc(MemoryStack stack) {
        return new SDL_DisplayEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_DisplayEvent calloc(MemoryStack stack) {
        return new SDL_DisplayEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndisplayID(long struct) {
        return MemoryUtil.memGetInt(struct + DISPLAYID);
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

    public static void ndisplayID(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISPLAYID, value);
    }

    public static void ndata1(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATA1, value);
    }

    public static void ndata2(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATA2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DisplayEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_DisplayEvent, Buffer> implements NativeResource {
        private static final SDL_DisplayEvent ELEMENT_FACTORY = SDL_DisplayEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_DisplayEvent.SIZEOF);
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
        public SDL_DisplayEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_DisplayEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_DisplayEvent.ntimestamp(address());
        }

        @NativeType("SDL_DisplayID")
        public int displayID() {
            return SDL_DisplayEvent.ndisplayID(address());
        }

        @NativeType("Sint32")
        public int data1() {
            return SDL_DisplayEvent.ndata1(address());
        }

        @NativeType("Sint32")
        public int data2() {
            return SDL_DisplayEvent.ndata2(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_DisplayEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_DisplayEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer displayID(@NativeType("SDL_DisplayID") int value) {
            SDL_DisplayEvent.ndisplayID(address(), value);
            return this;
        }

        public Buffer data1(@NativeType("Sint32") int value) {
            SDL_DisplayEvent.ndata1(address(), value);
            return this;
        }

        public Buffer data2(@NativeType("Sint32") int value) {
            SDL_DisplayEvent.ndata2(address(), value);
            return this;
        }
    }
}
