package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_ClipboardEvent.class */
public class SDL_ClipboardEvent extends Struct<SDL_ClipboardEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int OWNER;
    public static final int NUM_MIME_TYPES;
    public static final int MIME_TYPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(1), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        OWNER = layout.offsetof(3);
        NUM_MIME_TYPES = layout.offsetof(4);
        MIME_TYPES = layout.offsetof(5);
    }

    protected SDL_ClipboardEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_ClipboardEvent create(long address, ByteBuffer container) {
        return new SDL_ClipboardEvent(address, container);
    }

    public SDL_ClipboardEvent(ByteBuffer container) {
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

    @NativeType("bool")
    public boolean owner() {
        return nowner(address());
    }

    @NativeType("Sint32")
    public int num_mime_types() {
        return nnum_mime_types(address());
    }

    @NativeType("char const **")
    public PointerBuffer mime_types() {
        return nmime_types(address());
    }

    public SDL_ClipboardEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_ClipboardEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_ClipboardEvent owner(@NativeType("bool") boolean value) {
        nowner(address(), value);
        return this;
    }

    public SDL_ClipboardEvent num_mime_types(@NativeType("Sint32") int value) {
        nnum_mime_types(address(), value);
        return this;
    }

    public SDL_ClipboardEvent mime_types(@NativeType("char const **") PointerBuffer value) {
        nmime_types(address(), value);
        return this;
    }

    public SDL_ClipboardEvent set(int type, long timestamp, boolean owner, int num_mime_types, PointerBuffer mime_types) {
        type(type);
        timestamp(timestamp);
        owner(owner);
        num_mime_types(num_mime_types);
        mime_types(mime_types);
        return this;
    }

    public SDL_ClipboardEvent set(SDL_ClipboardEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_ClipboardEvent malloc() {
        return new SDL_ClipboardEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_ClipboardEvent calloc() {
        return new SDL_ClipboardEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_ClipboardEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_ClipboardEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_ClipboardEvent create(long address) {
        return new SDL_ClipboardEvent(address, null);
    }

    public static SDL_ClipboardEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_ClipboardEvent(address, null);
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

    public static SDL_ClipboardEvent malloc(MemoryStack stack) {
        return new SDL_ClipboardEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_ClipboardEvent calloc(MemoryStack stack) {
        return new SDL_ClipboardEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static boolean nowner(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) OWNER)) != 0;
    }

    public static int nnum_mime_types(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_MIME_TYPES);
    }

    public static PointerBuffer nmime_types(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + MIME_TYPES), nnum_mime_types(struct));
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

    public static void nowner(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + OWNER, value ? (byte) 1 : (byte) 0);
    }

    public static void nnum_mime_types(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_MIME_TYPES, value);
    }

    public static void nmime_types(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + MIME_TYPES, MemoryUtil.memAddressSafe(value));
        nnum_mime_types(struct, value == null ? 0 : value.remaining());
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_ClipboardEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_ClipboardEvent, Buffer> implements NativeResource {
        private static final SDL_ClipboardEvent ELEMENT_FACTORY = SDL_ClipboardEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_ClipboardEvent.SIZEOF);
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
        public SDL_ClipboardEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_ClipboardEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_ClipboardEvent.ntimestamp(address());
        }

        @NativeType("bool")
        public boolean owner() {
            return SDL_ClipboardEvent.nowner(address());
        }

        @NativeType("Sint32")
        public int num_mime_types() {
            return SDL_ClipboardEvent.nnum_mime_types(address());
        }

        @NativeType("char const **")
        public PointerBuffer mime_types() {
            return SDL_ClipboardEvent.nmime_types(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_ClipboardEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_ClipboardEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer owner(@NativeType("bool") boolean value) {
            SDL_ClipboardEvent.nowner(address(), value);
            return this;
        }

        public Buffer num_mime_types(@NativeType("Sint32") int value) {
            SDL_ClipboardEvent.nnum_mime_types(address(), value);
            return this;
        }

        public Buffer mime_types(@NativeType("char const **") PointerBuffer value) {
            SDL_ClipboardEvent.nmime_types(address(), value);
            return this;
        }
    }
}
