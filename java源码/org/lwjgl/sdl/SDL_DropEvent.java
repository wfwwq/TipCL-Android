package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DropEvent.class */
public class SDL_DropEvent extends Struct<SDL_DropEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int X;
    public static final int Y;
    public static final int SOURCE;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        X = layout.offsetof(4);
        Y = layout.offsetof(5);
        SOURCE = layout.offsetof(6);
        DATA = layout.offsetof(7);
    }

    protected SDL_DropEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_DropEvent create(long address, ByteBuffer container) {
        return new SDL_DropEvent(address, container);
    }

    public SDL_DropEvent(ByteBuffer container) {
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

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    @NativeType("char const *")
    public ByteBuffer source() {
        return nsource(address());
    }

    @NativeType("char const *")
    public String sourceString() {
        return nsourceString(address());
    }

    @NativeType("char const *")
    public ByteBuffer data() {
        return ndata(address());
    }

    @NativeType("char const *")
    public String dataString() {
        return ndataString(address());
    }

    public SDL_DropEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_DropEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_DropEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_DropEvent x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_DropEvent y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_DropEvent source(@NativeType("char const *") ByteBuffer value) {
        nsource(address(), value);
        return this;
    }

    public SDL_DropEvent data(@NativeType("char const *") ByteBuffer value) {
        ndata(address(), value);
        return this;
    }

    public SDL_DropEvent set(int type, long timestamp, int windowID, float x, float y, ByteBuffer source, ByteBuffer data) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        x(x);
        y(y);
        source(source);
        data(data);
        return this;
    }

    public SDL_DropEvent set(SDL_DropEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_DropEvent malloc() {
        return new SDL_DropEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_DropEvent calloc() {
        return new SDL_DropEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_DropEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DropEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_DropEvent create(long address) {
        return new SDL_DropEvent(address, null);
    }

    public static SDL_DropEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_DropEvent(address, null);
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

    public static SDL_DropEvent malloc(MemoryStack stack) {
        return new SDL_DropEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_DropEvent calloc(MemoryStack stack) {
        return new SDL_DropEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
    }

    public static ByteBuffer nsource(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + SOURCE));
    }

    public static String nsourceString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + SOURCE));
    }

    public static ByteBuffer ndata(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + DATA));
    }

    public static String ndataString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + DATA));
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

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    public static void nsource(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + SOURCE, MemoryUtil.memAddressSafe(value));
    }

    public static void ndata(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + DATA, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DropEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_DropEvent, Buffer> implements NativeResource {
        private static final SDL_DropEvent ELEMENT_FACTORY = SDL_DropEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_DropEvent.SIZEOF);
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
        public SDL_DropEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_DropEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_DropEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_DropEvent.nwindowID(address());
        }

        public float x() {
            return SDL_DropEvent.nx(address());
        }

        public float y() {
            return SDL_DropEvent.ny(address());
        }

        @NativeType("char const *")
        public ByteBuffer source() {
            return SDL_DropEvent.nsource(address());
        }

        @NativeType("char const *")
        public String sourceString() {
            return SDL_DropEvent.nsourceString(address());
        }

        @NativeType("char const *")
        public ByteBuffer data() {
            return SDL_DropEvent.ndata(address());
        }

        @NativeType("char const *")
        public String dataString() {
            return SDL_DropEvent.ndataString(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_DropEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_DropEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_DropEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer x(float value) {
            SDL_DropEvent.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_DropEvent.ny(address(), value);
            return this;
        }

        public Buffer source(@NativeType("char const *") ByteBuffer value) {
            SDL_DropEvent.nsource(address(), value);
            return this;
        }

        public Buffer data(@NativeType("char const *") ByteBuffer value) {
            SDL_DropEvent.ndata(address(), value);
            return this;
        }
    }
}
