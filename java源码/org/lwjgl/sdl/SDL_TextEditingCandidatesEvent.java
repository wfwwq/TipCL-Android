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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TextEditingCandidatesEvent.class */
public class SDL_TextEditingCandidatesEvent extends Struct<SDL_TextEditingCandidatesEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int CANDIDATES;
    public static final int NUM_CANDIDATES;
    public static final int SELECTED_CANDIDATE;
    public static final int HORIZONTAL;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PADDING3;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        CANDIDATES = layout.offsetof(4);
        NUM_CANDIDATES = layout.offsetof(5);
        SELECTED_CANDIDATE = layout.offsetof(6);
        HORIZONTAL = layout.offsetof(7);
        PADDING1 = layout.offsetof(8);
        PADDING2 = layout.offsetof(9);
        PADDING3 = layout.offsetof(10);
    }

    protected SDL_TextEditingCandidatesEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_TextEditingCandidatesEvent create(long address, ByteBuffer container) {
        return new SDL_TextEditingCandidatesEvent(address, container);
    }

    public SDL_TextEditingCandidatesEvent(ByteBuffer container) {
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

    @NativeType("char const * const *")
    public PointerBuffer candidates() {
        return ncandidates(address());
    }

    @NativeType("Sint32")
    public int num_candidates() {
        return nnum_candidates(address());
    }

    @NativeType("Sint32")
    public int selected_candidate() {
        return nselected_candidate(address());
    }

    @NativeType("bool")
    public boolean horizontal() {
        return nhorizontal(address());
    }

    public SDL_TextEditingCandidatesEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_TextEditingCandidatesEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_TextEditingCandidatesEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_TextEditingCandidatesEvent candidates(@NativeType("char const * const *") PointerBuffer value) {
        ncandidates(address(), value);
        return this;
    }

    public SDL_TextEditingCandidatesEvent num_candidates(@NativeType("Sint32") int value) {
        nnum_candidates(address(), value);
        return this;
    }

    public SDL_TextEditingCandidatesEvent selected_candidate(@NativeType("Sint32") int value) {
        nselected_candidate(address(), value);
        return this;
    }

    public SDL_TextEditingCandidatesEvent horizontal(@NativeType("bool") boolean value) {
        nhorizontal(address(), value);
        return this;
    }

    public SDL_TextEditingCandidatesEvent set(int type, long timestamp, int windowID, PointerBuffer candidates, int num_candidates, int selected_candidate, boolean horizontal) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        candidates(candidates);
        num_candidates(num_candidates);
        selected_candidate(selected_candidate);
        horizontal(horizontal);
        return this;
    }

    public SDL_TextEditingCandidatesEvent set(SDL_TextEditingCandidatesEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_TextEditingCandidatesEvent malloc() {
        return new SDL_TextEditingCandidatesEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_TextEditingCandidatesEvent calloc() {
        return new SDL_TextEditingCandidatesEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_TextEditingCandidatesEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_TextEditingCandidatesEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_TextEditingCandidatesEvent create(long address) {
        return new SDL_TextEditingCandidatesEvent(address, null);
    }

    public static SDL_TextEditingCandidatesEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_TextEditingCandidatesEvent(address, null);
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

    public static SDL_TextEditingCandidatesEvent malloc(MemoryStack stack) {
        return new SDL_TextEditingCandidatesEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_TextEditingCandidatesEvent calloc(MemoryStack stack) {
        return new SDL_TextEditingCandidatesEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static PointerBuffer ncandidates(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + CANDIDATES), nnum_candidates(struct));
    }

    public static int nnum_candidates(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_CANDIDATES);
    }

    public static int nselected_candidate(long struct) {
        return MemoryUtil.memGetInt(struct + SELECTED_CANDIDATE);
    }

    public static boolean nhorizontal(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) HORIZONTAL)) != 0;
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

    public static void nwindowID(long struct, int value) {
        MemoryUtil.memPutInt(struct + WINDOWID, value);
    }

    public static void ncandidates(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + CANDIDATES, MemoryUtil.memAddressSafe(value));
        nnum_candidates(struct, value == null ? 0 : value.remaining());
    }

    public static void nnum_candidates(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_CANDIDATES, value);
    }

    public static void nselected_candidate(long struct, int value) {
        MemoryUtil.memPutInt(struct + SELECTED_CANDIDATE, value);
    }

    public static void nhorizontal(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + HORIZONTAL, value ? (byte) 1 : (byte) 0);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TextEditingCandidatesEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_TextEditingCandidatesEvent, Buffer> implements NativeResource {
        private static final SDL_TextEditingCandidatesEvent ELEMENT_FACTORY = SDL_TextEditingCandidatesEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_TextEditingCandidatesEvent.SIZEOF);
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
        public SDL_TextEditingCandidatesEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_TextEditingCandidatesEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_TextEditingCandidatesEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_TextEditingCandidatesEvent.nwindowID(address());
        }

        @NativeType("char const * const *")
        public PointerBuffer candidates() {
            return SDL_TextEditingCandidatesEvent.ncandidates(address());
        }

        @NativeType("Sint32")
        public int num_candidates() {
            return SDL_TextEditingCandidatesEvent.nnum_candidates(address());
        }

        @NativeType("Sint32")
        public int selected_candidate() {
            return SDL_TextEditingCandidatesEvent.nselected_candidate(address());
        }

        @NativeType("bool")
        public boolean horizontal() {
            return SDL_TextEditingCandidatesEvent.nhorizontal(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_TextEditingCandidatesEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_TextEditingCandidatesEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_TextEditingCandidatesEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer candidates(@NativeType("char const * const *") PointerBuffer value) {
            SDL_TextEditingCandidatesEvent.ncandidates(address(), value);
            return this;
        }

        public Buffer num_candidates(@NativeType("Sint32") int value) {
            SDL_TextEditingCandidatesEvent.nnum_candidates(address(), value);
            return this;
        }

        public Buffer selected_candidate(@NativeType("Sint32") int value) {
            SDL_TextEditingCandidatesEvent.nselected_candidate(address(), value);
            return this;
        }

        public Buffer horizontal(@NativeType("bool") boolean value) {
            SDL_TextEditingCandidatesEvent.nhorizontal(address(), value);
            return this;
        }
    }
}
