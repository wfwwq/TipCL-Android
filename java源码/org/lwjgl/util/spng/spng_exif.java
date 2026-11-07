package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_exif")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_exif.class */
public class spng_exif extends Struct<spng_exif> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LENGTH;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LENGTH = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    protected spng_exif(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_exif create(long address, ByteBuffer container) {
        return new spng_exif(address, container);
    }

    public spng_exif(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("size_t")
    public long length() {
        return nlength(address());
    }

    @NativeType("char *")
    public ByteBuffer data() {
        return ndata(address());
    }

    public spng_exif data(@NativeType("char *") ByteBuffer value) {
        ndata(address(), value);
        return this;
    }

    public spng_exif set(spng_exif src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_exif malloc() {
        return new spng_exif(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_exif calloc() {
        return new spng_exif(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_exif create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_exif(MemoryUtil.memAddress(container), container);
    }

    public static spng_exif create(long address) {
        return new spng_exif(address, null);
    }

    public static spng_exif createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_exif(address, null);
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

    public static spng_exif malloc(MemoryStack stack) {
        return new spng_exif(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_exif calloc(MemoryStack stack) {
        return new spng_exif(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nlength(long struct) {
        return MemoryUtil.memGetAddress(struct + LENGTH);
    }

    public static ByteBuffer ndata(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + DATA), (int) nlength(struct));
    }

    public static void nlength(long struct, long value) {
        MemoryUtil.memPutAddress(struct + LENGTH, value);
    }

    public static void ndata(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + DATA, MemoryUtil.memAddress(value));
        nlength(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DATA));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_exif$Buffer.class */
    public static class Buffer extends StructBuffer<spng_exif, Buffer> implements NativeResource {
        private static final spng_exif ELEMENT_FACTORY = spng_exif.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_exif.SIZEOF);
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
        public spng_exif getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("size_t")
        public long length() {
            return spng_exif.nlength(address());
        }

        @NativeType("char *")
        public ByteBuffer data() {
            return spng_exif.ndata(address());
        }

        public Buffer data(@NativeType("char *") ByteBuffer value) {
            spng_exif.ndata(address(), value);
            return this;
        }
    }
}
