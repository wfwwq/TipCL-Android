package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_UserEvent.class */
public class SDL_UserEvent extends Struct<SDL_UserEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int CODE;
    public static final int DATA1;
    public static final int DATA2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        CODE = layout.offsetof(4);
        DATA1 = layout.offsetof(5);
        DATA2 = layout.offsetof(6);
    }

    protected SDL_UserEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_UserEvent create(long address, ByteBuffer container) {
        return new SDL_UserEvent(address, container);
    }

    public SDL_UserEvent(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
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
    public int code() {
        return ncode(address());
    }

    @NativeType("void *")
    public long data1() {
        return ndata1(address());
    }

    @NativeType("void *")
    public long data2() {
        return ndata2(address());
    }

    public SDL_UserEvent type(@NativeType("Uint32") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_UserEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_UserEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_UserEvent code(@NativeType("Sint32") int value) {
        ncode(address(), value);
        return this;
    }

    public SDL_UserEvent data1(@NativeType("void *") long value) {
        ndata1(address(), value);
        return this;
    }

    public SDL_UserEvent data2(@NativeType("void *") long value) {
        ndata2(address(), value);
        return this;
    }

    public SDL_UserEvent set(int type, long timestamp, int windowID, int code, long data1, long data2) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        code(code);
        data1(data1);
        data2(data2);
        return this;
    }

    public SDL_UserEvent set(SDL_UserEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_UserEvent malloc() {
        return new SDL_UserEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_UserEvent calloc() {
        return new SDL_UserEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_UserEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_UserEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_UserEvent create(long address) {
        return new SDL_UserEvent(address, null);
    }

    public static SDL_UserEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_UserEvent(address, null);
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

    public static SDL_UserEvent malloc(MemoryStack stack) {
        return new SDL_UserEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_UserEvent calloc(MemoryStack stack) {
        return new SDL_UserEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncode(long struct) {
        return MemoryUtil.memGetInt(struct + CODE);
    }

    public static long ndata1(long struct) {
        return MemoryUtil.memGetAddress(struct + DATA1);
    }

    public static long ndata2(long struct) {
        return MemoryUtil.memGetAddress(struct + DATA2);
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

    public static void ncode(long struct, int value) {
        MemoryUtil.memPutInt(struct + CODE, value);
    }

    public static void ndata1(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DATA1, value);
    }

    public static void ndata2(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DATA2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_UserEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_UserEvent, Buffer> implements NativeResource {
        private static final SDL_UserEvent ELEMENT_FACTORY = SDL_UserEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_UserEvent.SIZEOF);
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
        public SDL_UserEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int type() {
            return SDL_UserEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_UserEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_UserEvent.nwindowID(address());
        }

        @NativeType("Sint32")
        public int code() {
            return SDL_UserEvent.ncode(address());
        }

        @NativeType("void *")
        public long data1() {
            return SDL_UserEvent.ndata1(address());
        }

        @NativeType("void *")
        public long data2() {
            return SDL_UserEvent.ndata2(address());
        }

        public Buffer type(@NativeType("Uint32") int value) {
            SDL_UserEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_UserEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_UserEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer code(@NativeType("Sint32") int value) {
            SDL_UserEvent.ncode(address(), value);
            return this;
        }

        public Buffer data1(@NativeType("void *") long value) {
            SDL_UserEvent.ndata1(address(), value);
            return this;
        }

        public Buffer data2(@NativeType("void *") long value) {
            SDL_UserEvent.ndata2(address(), value);
            return this;
        }
    }
}
