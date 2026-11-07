package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceInfoFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceInfoFlags.class */
public class StdVideoEncodeH265ReferenceInfoFlags extends Struct<StdVideoEncodeH265ReferenceInfoFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;
    public static final int BITFIELD1;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoEncodeH265ReferenceInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265ReferenceInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265ReferenceInfoFlags(address, container);
    }

    public StdVideoEncodeH265ReferenceInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean used_for_long_term_reference() {
        return nused_for_long_term_reference(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean unused_for_reference() {
        return nunused_for_reference(address()) != 0;
    }

    public StdVideoEncodeH265ReferenceInfoFlags used_for_long_term_reference(@NativeType("uint32_t") boolean value) {
        nused_for_long_term_reference(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265ReferenceInfoFlags unused_for_reference(@NativeType("uint32_t") boolean value) {
        nunused_for_reference(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265ReferenceInfoFlags set(boolean used_for_long_term_reference, boolean unused_for_reference) {
        used_for_long_term_reference(used_for_long_term_reference);
        unused_for_reference(unused_for_reference);
        return this;
    }

    public StdVideoEncodeH265ReferenceInfoFlags set(StdVideoEncodeH265ReferenceInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265ReferenceInfoFlags malloc() {
        return new StdVideoEncodeH265ReferenceInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceInfoFlags calloc() {
        return new StdVideoEncodeH265ReferenceInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265ReferenceInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265ReferenceInfoFlags create(long address) {
        return new StdVideoEncodeH265ReferenceInfoFlags(address, null);
    }

    public static StdVideoEncodeH265ReferenceInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265ReferenceInfoFlags(address, null);
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

    public static StdVideoEncodeH265ReferenceInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbitfield0(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD0);
    }

    public static int nused_for_long_term_reference(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nunused_for_reference(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nused_for_long_term_reference(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nunused_for_reference(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-1073741824)) | (value & LockFreeTaskQueueCore.MAX_CAPACITY_MASK));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceInfoFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265ReferenceInfoFlags ELEMENT_FACTORY = StdVideoEncodeH265ReferenceInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265ReferenceInfoFlags.SIZEOF);
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
        public StdVideoEncodeH265ReferenceInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean used_for_long_term_reference() {
            return StdVideoEncodeH265ReferenceInfoFlags.nused_for_long_term_reference(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean unused_for_reference() {
            return StdVideoEncodeH265ReferenceInfoFlags.nunused_for_reference(address()) != 0;
        }

        public Buffer used_for_long_term_reference(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265ReferenceInfoFlags.nused_for_long_term_reference(address(), value ? 1 : 0);
            return this;
        }

        public Buffer unused_for_reference(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265ReferenceInfoFlags.nunused_for_reference(address(), value ? 1 : 0);
            return this;
        }
    }
}
