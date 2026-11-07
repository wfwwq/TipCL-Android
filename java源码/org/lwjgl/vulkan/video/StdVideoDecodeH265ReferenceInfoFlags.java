package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265ReferenceInfoFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265ReferenceInfoFlags.class */
public class StdVideoDecodeH265ReferenceInfoFlags extends Struct<StdVideoDecodeH265ReferenceInfoFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoDecodeH265ReferenceInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeH265ReferenceInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoDecodeH265ReferenceInfoFlags(address, container);
    }

    public StdVideoDecodeH265ReferenceInfoFlags(ByteBuffer container) {
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

    public StdVideoDecodeH265ReferenceInfoFlags used_for_long_term_reference(@NativeType("uint32_t") boolean value) {
        nused_for_long_term_reference(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH265ReferenceInfoFlags unused_for_reference(@NativeType("uint32_t") boolean value) {
        nunused_for_reference(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH265ReferenceInfoFlags set(boolean used_for_long_term_reference, boolean unused_for_reference) {
        used_for_long_term_reference(used_for_long_term_reference);
        unused_for_reference(unused_for_reference);
        return this;
    }

    public StdVideoDecodeH265ReferenceInfoFlags set(StdVideoDecodeH265ReferenceInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeH265ReferenceInfoFlags malloc() {
        return new StdVideoDecodeH265ReferenceInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeH265ReferenceInfoFlags calloc() {
        return new StdVideoDecodeH265ReferenceInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeH265ReferenceInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeH265ReferenceInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeH265ReferenceInfoFlags create(long address) {
        return new StdVideoDecodeH265ReferenceInfoFlags(address, null);
    }

    public static StdVideoDecodeH265ReferenceInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeH265ReferenceInfoFlags(address, null);
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

    public static StdVideoDecodeH265ReferenceInfoFlags malloc(MemoryStack stack) {
        return new StdVideoDecodeH265ReferenceInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeH265ReferenceInfoFlags calloc(MemoryStack stack) {
        return new StdVideoDecodeH265ReferenceInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nused_for_long_term_reference(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nunused_for_reference(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265ReferenceInfoFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265ReferenceInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeH265ReferenceInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoDecodeH265ReferenceInfoFlags ELEMENT_FACTORY = StdVideoDecodeH265ReferenceInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeH265ReferenceInfoFlags.SIZEOF);
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
        public StdVideoDecodeH265ReferenceInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean used_for_long_term_reference() {
            return StdVideoDecodeH265ReferenceInfoFlags.nused_for_long_term_reference(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean unused_for_reference() {
            return StdVideoDecodeH265ReferenceInfoFlags.nunused_for_reference(address()) != 0;
        }

        public Buffer used_for_long_term_reference(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH265ReferenceInfoFlags.nused_for_long_term_reference(address(), value ? 1 : 0);
            return this;
        }

        public Buffer unused_for_reference(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH265ReferenceInfoFlags.nunused_for_reference(address(), value ? 1 : 0);
            return this;
        }
    }
}
