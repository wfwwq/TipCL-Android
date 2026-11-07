package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisAlloc.class
 */
@NativeType("struct stb_vorbis_alloc")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisAlloc.class */
public class STBVorbisAlloc extends Struct<STBVorbisAlloc> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ALLOC_BUFFER;
    public static final int ALLOC_BUFFER_LENGTH_IN_BYTES;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ALLOC_BUFFER = layout.offsetof(0);
        ALLOC_BUFFER_LENGTH_IN_BYTES = layout.offsetof(1);
    }

    protected STBVorbisAlloc(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBVorbisAlloc create(long address, ByteBuffer container) {
        return new STBVorbisAlloc(address, container);
    }

    public STBVorbisAlloc(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char *")
    public ByteBuffer alloc_buffer() {
        return nalloc_buffer(address());
    }

    public int alloc_buffer_length_in_bytes() {
        return nalloc_buffer_length_in_bytes(address());
    }

    public STBVorbisAlloc alloc_buffer(@NativeType("char *") ByteBuffer value) {
        nalloc_buffer(address(), value);
        return this;
    }

    public STBVorbisAlloc set(STBVorbisAlloc src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static STBVorbisAlloc malloc() {
        return new STBVorbisAlloc(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBVorbisAlloc calloc() {
        return new STBVorbisAlloc(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBVorbisAlloc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBVorbisAlloc(MemoryUtil.memAddress(container), container);
    }

    public static STBVorbisAlloc create(long address) {
        return new STBVorbisAlloc(address, null);
    }

    public static STBVorbisAlloc createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBVorbisAlloc(address, null);
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

    public static STBVorbisAlloc malloc(MemoryStack stack) {
        return new STBVorbisAlloc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBVorbisAlloc calloc(MemoryStack stack) {
        return new STBVorbisAlloc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nalloc_buffer(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + ALLOC_BUFFER), nalloc_buffer_length_in_bytes(struct));
    }

    public static int nalloc_buffer_length_in_bytes(long struct) {
        return MemoryUtil.memGetInt(struct + ALLOC_BUFFER_LENGTH_IN_BYTES);
    }

    public static void nalloc_buffer(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + ALLOC_BUFFER, MemoryUtil.memAddress(value));
        nalloc_buffer_length_in_bytes(struct, value.remaining());
    }

    public static void nalloc_buffer_length_in_bytes(long struct, int value) {
        MemoryUtil.memPutInt(struct + ALLOC_BUFFER_LENGTH_IN_BYTES, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + ALLOC_BUFFER));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisAlloc$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisAlloc$Buffer.class */
    public static class Buffer extends StructBuffer<STBVorbisAlloc, Buffer> implements NativeResource {
        private static final STBVorbisAlloc ELEMENT_FACTORY = STBVorbisAlloc.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBVorbisAlloc.SIZEOF);
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
        public STBVorbisAlloc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char *")
        public ByteBuffer alloc_buffer() {
            return STBVorbisAlloc.nalloc_buffer(address());
        }

        public int alloc_buffer_length_in_bytes() {
            return STBVorbisAlloc.nalloc_buffer_length_in_bytes(address());
        }

        public Buffer alloc_buffer(@NativeType("char *") ByteBuffer value) {
            STBVorbisAlloc.nalloc_buffer(address(), value);
            return this;
        }
    }
}
