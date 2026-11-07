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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264WeightTableFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264WeightTableFlags.class */
public class StdVideoEncodeH264WeightTableFlags extends Struct<StdVideoEncodeH264WeightTableFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LUMA_WEIGHT_L0_FLAG;
    public static final int CHROMA_WEIGHT_L0_FLAG;
    public static final int LUMA_WEIGHT_L1_FLAG;
    public static final int CHROMA_WEIGHT_L1_FLAG;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LUMA_WEIGHT_L0_FLAG = layout.offsetof(0);
        CHROMA_WEIGHT_L0_FLAG = layout.offsetof(1);
        LUMA_WEIGHT_L1_FLAG = layout.offsetof(2);
        CHROMA_WEIGHT_L1_FLAG = layout.offsetof(3);
    }

    protected StdVideoEncodeH264WeightTableFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264WeightTableFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264WeightTableFlags(address, container);
    }

    public StdVideoEncodeH264WeightTableFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int luma_weight_l0_flag() {
        return nluma_weight_l0_flag(address());
    }

    @NativeType("uint32_t")
    public int chroma_weight_l0_flag() {
        return nchroma_weight_l0_flag(address());
    }

    @NativeType("uint32_t")
    public int luma_weight_l1_flag() {
        return nluma_weight_l1_flag(address());
    }

    @NativeType("uint32_t")
    public int chroma_weight_l1_flag() {
        return nchroma_weight_l1_flag(address());
    }

    public StdVideoEncodeH264WeightTableFlags luma_weight_l0_flag(@NativeType("uint32_t") int value) {
        nluma_weight_l0_flag(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTableFlags chroma_weight_l0_flag(@NativeType("uint32_t") int value) {
        nchroma_weight_l0_flag(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTableFlags luma_weight_l1_flag(@NativeType("uint32_t") int value) {
        nluma_weight_l1_flag(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTableFlags chroma_weight_l1_flag(@NativeType("uint32_t") int value) {
        nchroma_weight_l1_flag(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTableFlags set(int luma_weight_l0_flag, int chroma_weight_l0_flag, int luma_weight_l1_flag, int chroma_weight_l1_flag) {
        luma_weight_l0_flag(luma_weight_l0_flag);
        chroma_weight_l0_flag(chroma_weight_l0_flag);
        luma_weight_l1_flag(luma_weight_l1_flag);
        chroma_weight_l1_flag(chroma_weight_l1_flag);
        return this;
    }

    public StdVideoEncodeH264WeightTableFlags set(StdVideoEncodeH264WeightTableFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264WeightTableFlags malloc() {
        return new StdVideoEncodeH264WeightTableFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264WeightTableFlags calloc() {
        return new StdVideoEncodeH264WeightTableFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264WeightTableFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264WeightTableFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264WeightTableFlags create(long address) {
        return new StdVideoEncodeH264WeightTableFlags(address, null);
    }

    public static StdVideoEncodeH264WeightTableFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264WeightTableFlags(address, null);
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

    public static StdVideoEncodeH264WeightTableFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH264WeightTableFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264WeightTableFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH264WeightTableFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nluma_weight_l0_flag(long struct) {
        return MemoryUtil.memGetInt(struct + LUMA_WEIGHT_L0_FLAG);
    }

    public static int nchroma_weight_l0_flag(long struct) {
        return MemoryUtil.memGetInt(struct + CHROMA_WEIGHT_L0_FLAG);
    }

    public static int nluma_weight_l1_flag(long struct) {
        return MemoryUtil.memGetInt(struct + LUMA_WEIGHT_L1_FLAG);
    }

    public static int nchroma_weight_l1_flag(long struct) {
        return MemoryUtil.memGetInt(struct + CHROMA_WEIGHT_L1_FLAG);
    }

    public static void nluma_weight_l0_flag(long struct, int value) {
        MemoryUtil.memPutInt(struct + LUMA_WEIGHT_L0_FLAG, value);
    }

    public static void nchroma_weight_l0_flag(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHROMA_WEIGHT_L0_FLAG, value);
    }

    public static void nluma_weight_l1_flag(long struct, int value) {
        MemoryUtil.memPutInt(struct + LUMA_WEIGHT_L1_FLAG, value);
    }

    public static void nchroma_weight_l1_flag(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHROMA_WEIGHT_L1_FLAG, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264WeightTableFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264WeightTableFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264WeightTableFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264WeightTableFlags ELEMENT_FACTORY = StdVideoEncodeH264WeightTableFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264WeightTableFlags.SIZEOF);
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
        public StdVideoEncodeH264WeightTableFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int luma_weight_l0_flag() {
            return StdVideoEncodeH264WeightTableFlags.nluma_weight_l0_flag(address());
        }

        @NativeType("uint32_t")
        public int chroma_weight_l0_flag() {
            return StdVideoEncodeH264WeightTableFlags.nchroma_weight_l0_flag(address());
        }

        @NativeType("uint32_t")
        public int luma_weight_l1_flag() {
            return StdVideoEncodeH264WeightTableFlags.nluma_weight_l1_flag(address());
        }

        @NativeType("uint32_t")
        public int chroma_weight_l1_flag() {
            return StdVideoEncodeH264WeightTableFlags.nchroma_weight_l1_flag(address());
        }

        public Buffer luma_weight_l0_flag(@NativeType("uint32_t") int value) {
            StdVideoEncodeH264WeightTableFlags.nluma_weight_l0_flag(address(), value);
            return this;
        }

        public Buffer chroma_weight_l0_flag(@NativeType("uint32_t") int value) {
            StdVideoEncodeH264WeightTableFlags.nchroma_weight_l0_flag(address(), value);
            return this;
        }

        public Buffer luma_weight_l1_flag(@NativeType("uint32_t") int value) {
            StdVideoEncodeH264WeightTableFlags.nluma_weight_l1_flag(address(), value);
            return this;
        }

        public Buffer chroma_weight_l1_flag(@NativeType("uint32_t") int value) {
            StdVideoEncodeH264WeightTableFlags.nchroma_weight_l1_flag(address(), value);
            return this;
        }
    }
}
