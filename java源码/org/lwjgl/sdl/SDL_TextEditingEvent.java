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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TextEditingEvent.class */
public class SDL_TextEditingEvent extends Struct<SDL_TextEditingEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int TEXT;
    public static final int START;
    public static final int LENGTH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        TEXT = layout.offsetof(4);
        START = layout.offsetof(5);
        LENGTH = layout.offsetof(6);
    }

    protected SDL_TextEditingEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_TextEditingEvent create(long address, ByteBuffer container) {
        return new SDL_TextEditingEvent(address, container);
    }

    public SDL_TextEditingEvent(ByteBuffer container) {
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

    @NativeType("char const *")
    public ByteBuffer text() {
        return ntext(address());
    }

    @NativeType("char const *")
    public String textString() {
        return ntextString(address());
    }

    @NativeType("Sint32")
    public int start() {
        return nstart(address());
    }

    @NativeType("Sint32")
    public int length() {
        return nlength(address());
    }

    public SDL_TextEditingEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_TextEditingEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_TextEditingEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_TextEditingEvent text(@NativeType("char const *") ByteBuffer value) {
        ntext(address(), value);
        return this;
    }

    public SDL_TextEditingEvent start(@NativeType("Sint32") int value) {
        nstart(address(), value);
        return this;
    }

    public SDL_TextEditingEvent length(@NativeType("Sint32") int value) {
        nlength(address(), value);
        return this;
    }

    public SDL_TextEditingEvent set(int type, long timestamp, int windowID, ByteBuffer text, int start, int length) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        text(text);
        start(start);
        length(length);
        return this;
    }

    public SDL_TextEditingEvent set(SDL_TextEditingEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_TextEditingEvent malloc() {
        return new SDL_TextEditingEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_TextEditingEvent calloc() {
        return new SDL_TextEditingEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_TextEditingEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_TextEditingEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_TextEditingEvent create(long address) {
        return new SDL_TextEditingEvent(address, null);
    }

    public static SDL_TextEditingEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_TextEditingEvent(address, null);
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

    public static SDL_TextEditingEvent malloc(MemoryStack stack) {
        return new SDL_TextEditingEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_TextEditingEvent calloc(MemoryStack stack) {
        return new SDL_TextEditingEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer ntext(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + TEXT));
    }

    public static String ntextString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + TEXT));
    }

    public static int nstart(long struct) {
        return MemoryUtil.memGetInt(struct + START);
    }

    public static int nlength(long struct) {
        return MemoryUtil.memGetInt(struct + LENGTH);
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

    public static void ntext(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + TEXT, MemoryUtil.memAddressSafe(value));
    }

    public static void nstart(long struct, int value) {
        MemoryUtil.memPutInt(struct + START, value);
    }

    public static void nlength(long struct, int value) {
        MemoryUtil.memPutInt(struct + LENGTH, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TextEditingEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_TextEditingEvent, Buffer> implements NativeResource {
        private static final SDL_TextEditingEvent ELEMENT_FACTORY = SDL_TextEditingEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_TextEditingEvent.SIZEOF);
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
        public SDL_TextEditingEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_TextEditingEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_TextEditingEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_TextEditingEvent.nwindowID(address());
        }

        @NativeType("char const *")
        public ByteBuffer text() {
            return SDL_TextEditingEvent.ntext(address());
        }

        @NativeType("char const *")
        public String textString() {
            return SDL_TextEditingEvent.ntextString(address());
        }

        @NativeType("Sint32")
        public int start() {
            return SDL_TextEditingEvent.nstart(address());
        }

        @NativeType("Sint32")
        public int length() {
            return SDL_TextEditingEvent.nlength(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_TextEditingEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_TextEditingEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_TextEditingEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer text(@NativeType("char const *") ByteBuffer value) {
            SDL_TextEditingEvent.ntext(address(), value);
            return this;
        }

        public Buffer start(@NativeType("Sint32") int value) {
            SDL_TextEditingEvent.nstart(address(), value);
            return this;
        }

        public Buffer length(@NativeType("Sint32") int value) {
            SDL_TextEditingEvent.nlength(address(), value);
            return this;
        }
    }
}
