package org.lwjgl.util.spvc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcBufferRange.class
 */
@NativeType("struct spvc_buffer_range")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcBufferRange.class */
public class SpvcBufferRange extends Struct<SpvcBufferRange> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INDEX;
    public static final int OFFSET;
    public static final int RANGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INDEX = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        RANGE = layout.offsetof(2);
    }

    protected SpvcBufferRange(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcBufferRange create(long address, ByteBuffer container) {
        return new SpvcBufferRange(address, container);
    }

    public SpvcBufferRange(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned int")
    public int index() {
        return nindex(address());
    }

    @NativeType("size_t")
    public long offset() {
        return noffset(address());
    }

    @NativeType("size_t")
    public long range() {
        return nrange(address());
    }

    public SpvcBufferRange index(@NativeType("unsigned int") int value) {
        nindex(address(), value);
        return this;
    }

    public SpvcBufferRange offset(@NativeType("size_t") long value) {
        noffset(address(), value);
        return this;
    }

    public SpvcBufferRange range(@NativeType("size_t") long value) {
        nrange(address(), value);
        return this;
    }

    public SpvcBufferRange set(int index, long offset, long range) {
        index(index);
        offset(offset);
        range(range);
        return this;
    }

    public SpvcBufferRange set(SpvcBufferRange src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcBufferRange malloc() {
        return new SpvcBufferRange(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcBufferRange calloc() {
        return new SpvcBufferRange(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcBufferRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcBufferRange(MemoryUtil.memAddress(container), container);
    }

    public static SpvcBufferRange create(long address) {
        return new SpvcBufferRange(address, null);
    }

    public static SpvcBufferRange createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcBufferRange(address, null);
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

    public static SpvcBufferRange malloc(MemoryStack stack) {
        return new SpvcBufferRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcBufferRange calloc(MemoryStack stack) {
        return new SpvcBufferRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nindex(long struct) {
        return MemoryUtil.memGetInt(struct + INDEX);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetAddress(struct + OFFSET);
    }

    public static long nrange(long struct) {
        return MemoryUtil.memGetAddress(struct + RANGE);
    }

    public static void nindex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEX, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutAddress(struct + OFFSET, value);
    }

    public static void nrange(long struct, long value) {
        MemoryUtil.memPutAddress(struct + RANGE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcBufferRange$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcBufferRange$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcBufferRange, Buffer> implements NativeResource {
        private static final SpvcBufferRange ELEMENT_FACTORY = SpvcBufferRange.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcBufferRange.SIZEOF);
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
        public SpvcBufferRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned int")
        public int index() {
            return SpvcBufferRange.nindex(address());
        }

        @NativeType("size_t")
        public long offset() {
            return SpvcBufferRange.noffset(address());
        }

        @NativeType("size_t")
        public long range() {
            return SpvcBufferRange.nrange(address());
        }

        public Buffer index(@NativeType("unsigned int") int value) {
            SpvcBufferRange.nindex(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("size_t") long value) {
            SpvcBufferRange.noffset(address(), value);
            return this;
        }

        public Buffer range(@NativeType("size_t") long value) {
            SpvcBufferRange.nrange(address(), value);
            return this;
        }
    }
}
