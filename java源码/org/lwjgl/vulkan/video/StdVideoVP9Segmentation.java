package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9Segmentation.class */
public class StdVideoVP9Segmentation extends Struct<StdVideoVP9Segmentation> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int SEGMENTATION_TREE_PROBS;
    public static final int SEGMENTATION_PRED_PROB;
    public static final int FEATUREENABLED;
    public static final int FEATUREDATA;

    static {
        Struct.Layout layout = __struct(__member(StdVideoVP9SegmentationFlags.SIZEOF, StdVideoVP9SegmentationFlags.ALIGNOF), __array(1, 7), __array(1, 3), __array(1, 8), __array(2, 4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        SEGMENTATION_TREE_PROBS = layout.offsetof(1);
        SEGMENTATION_PRED_PROB = layout.offsetof(2);
        FEATUREENABLED = layout.offsetof(3);
        FEATUREDATA = layout.offsetof(4);
    }

    protected StdVideoVP9Segmentation(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoVP9Segmentation create(long address, ByteBuffer container) {
        return new StdVideoVP9Segmentation(address, container);
    }

    public StdVideoVP9Segmentation(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoVP9SegmentationFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]")
    public ByteBuffer segmentation_tree_probs() {
        return nsegmentation_tree_probs(address());
    }

    @NativeType("uint8_t")
    public byte segmentation_tree_probs(int index) {
        return nsegmentation_tree_probs(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]")
    public ByteBuffer segmentation_pred_prob() {
        return nsegmentation_pred_prob(address());
    }

    @NativeType("uint8_t")
    public byte segmentation_pred_prob(int index) {
        return nsegmentation_pred_prob(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]")
    public ByteBuffer FeatureEnabled() {
        return nFeatureEnabled(address());
    }

    @NativeType("uint8_t")
    public byte FeatureEnabled(int index) {
        return nFeatureEnabled(address(), index);
    }

    @NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]")
    public ShortBuffer FeatureData() {
        return nFeatureData(address());
    }

    @NativeType("int16_t")
    public short FeatureData(int index) {
        return nFeatureData(address(), index);
    }

    public StdVideoVP9Segmentation flags(StdVideoVP9SegmentationFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoVP9Segmentation flags(Consumer<StdVideoVP9SegmentationFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoVP9Segmentation segmentation_tree_probs(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]") ByteBuffer value) {
        nsegmentation_tree_probs(address(), value);
        return this;
    }

    public StdVideoVP9Segmentation segmentation_tree_probs(int index, @NativeType("uint8_t") byte value) {
        nsegmentation_tree_probs(address(), index, value);
        return this;
    }

    public StdVideoVP9Segmentation segmentation_pred_prob(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]") ByteBuffer value) {
        nsegmentation_pred_prob(address(), value);
        return this;
    }

    public StdVideoVP9Segmentation segmentation_pred_prob(int index, @NativeType("uint8_t") byte value) {
        nsegmentation_pred_prob(address(), index, value);
        return this;
    }

    public StdVideoVP9Segmentation FeatureEnabled(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]") ByteBuffer value) {
        nFeatureEnabled(address(), value);
        return this;
    }

    public StdVideoVP9Segmentation FeatureEnabled(int index, @NativeType("uint8_t") byte value) {
        nFeatureEnabled(address(), index, value);
        return this;
    }

    public StdVideoVP9Segmentation FeatureData(@NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]") ShortBuffer value) {
        nFeatureData(address(), value);
        return this;
    }

    public StdVideoVP9Segmentation FeatureData(int index, @NativeType("int16_t") short value) {
        nFeatureData(address(), index, value);
        return this;
    }

    public StdVideoVP9Segmentation set(StdVideoVP9SegmentationFlags flags, ByteBuffer segmentation_tree_probs, ByteBuffer segmentation_pred_prob, ByteBuffer FeatureEnabled, ShortBuffer FeatureData) {
        flags(flags);
        segmentation_tree_probs(segmentation_tree_probs);
        segmentation_pred_prob(segmentation_pred_prob);
        FeatureEnabled(FeatureEnabled);
        FeatureData(FeatureData);
        return this;
    }

    public StdVideoVP9Segmentation set(StdVideoVP9Segmentation src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoVP9Segmentation malloc() {
        return new StdVideoVP9Segmentation(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoVP9Segmentation calloc() {
        return new StdVideoVP9Segmentation(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoVP9Segmentation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9Segmentation(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoVP9Segmentation create(long address) {
        return new StdVideoVP9Segmentation(address, null);
    }

    public static StdVideoVP9Segmentation createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoVP9Segmentation(address, null);
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

    public static StdVideoVP9Segmentation malloc(MemoryStack stack) {
        return new StdVideoVP9Segmentation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoVP9Segmentation calloc(MemoryStack stack) {
        return new StdVideoVP9Segmentation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoVP9SegmentationFlags nflags(long struct) {
        return StdVideoVP9SegmentationFlags.create(struct + FLAGS);
    }

    public static ByteBuffer nsegmentation_tree_probs(long struct) {
        return MemoryUtil.memByteBuffer(struct + SEGMENTATION_TREE_PROBS, 7);
    }

    public static byte nsegmentation_tree_probs(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SEGMENTATION_TREE_PROBS + (Checks.check(index, 7) * 1));
    }

    public static ByteBuffer nsegmentation_pred_prob(long struct) {
        return MemoryUtil.memByteBuffer(struct + SEGMENTATION_PRED_PROB, 3);
    }

    public static byte nsegmentation_pred_prob(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SEGMENTATION_PRED_PROB + (Checks.check(index, 3) * 1));
    }

    public static ByteBuffer nFeatureEnabled(long struct) {
        return MemoryUtil.memByteBuffer(struct + FEATUREENABLED, 8);
    }

    public static byte nFeatureEnabled(long struct, int index) {
        return MemoryUtil.memGetByte(struct + FEATUREENABLED + (Checks.check(index, 8) * 1));
    }

    public static ShortBuffer nFeatureData(long struct) {
        return MemoryUtil.memShortBuffer(struct + FEATUREDATA, 4);
    }

    public static short nFeatureData(long struct, int index) {
        return MemoryUtil.memGetShort(struct + FEATUREDATA + (Checks.check(index, 4) * 2));
    }

    public static void nflags(long struct, StdVideoVP9SegmentationFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoVP9SegmentationFlags.SIZEOF);
    }

    public static void nsegmentation_tree_probs(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SEGMENTATION_TREE_PROBS, value.remaining() * 1);
    }

    public static void nsegmentation_tree_probs(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SEGMENTATION_TREE_PROBS + (Checks.check(index, 7) * 1), value);
    }

    public static void nsegmentation_pred_prob(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SEGMENTATION_PRED_PROB, value.remaining() * 1);
    }

    public static void nsegmentation_pred_prob(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SEGMENTATION_PRED_PROB + (Checks.check(index, 3) * 1), value);
    }

    public static void nFeatureEnabled(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + FEATUREENABLED, value.remaining() * 1);
    }

    public static void nFeatureEnabled(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + FEATUREENABLED + (Checks.check(index, 8) * 1), value);
    }

    public static void nFeatureData(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + FEATUREDATA, value.remaining() * 2);
    }

    public static void nFeatureData(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + FEATUREDATA + (Checks.check(index, 4) * 2), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9Segmentation$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoVP9Segmentation, Buffer> implements NativeResource {
        private static final StdVideoVP9Segmentation ELEMENT_FACTORY = StdVideoVP9Segmentation.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoVP9Segmentation.SIZEOF);
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
        public StdVideoVP9Segmentation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoVP9SegmentationFlags flags() {
            return StdVideoVP9Segmentation.nflags(address());
        }

        @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]")
        public ByteBuffer segmentation_tree_probs() {
            return StdVideoVP9Segmentation.nsegmentation_tree_probs(address());
        }

        @NativeType("uint8_t")
        public byte segmentation_tree_probs(int index) {
            return StdVideoVP9Segmentation.nsegmentation_tree_probs(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]")
        public ByteBuffer segmentation_pred_prob() {
            return StdVideoVP9Segmentation.nsegmentation_pred_prob(address());
        }

        @NativeType("uint8_t")
        public byte segmentation_pred_prob(int index) {
            return StdVideoVP9Segmentation.nsegmentation_pred_prob(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]")
        public ByteBuffer FeatureEnabled() {
            return StdVideoVP9Segmentation.nFeatureEnabled(address());
        }

        @NativeType("uint8_t")
        public byte FeatureEnabled(int index) {
            return StdVideoVP9Segmentation.nFeatureEnabled(address(), index);
        }

        @NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]")
        public ShortBuffer FeatureData() {
            return StdVideoVP9Segmentation.nFeatureData(address());
        }

        @NativeType("int16_t")
        public short FeatureData(int index) {
            return StdVideoVP9Segmentation.nFeatureData(address(), index);
        }

        public Buffer flags(StdVideoVP9SegmentationFlags value) {
            StdVideoVP9Segmentation.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoVP9SegmentationFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer segmentation_tree_probs(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]") ByteBuffer value) {
            StdVideoVP9Segmentation.nsegmentation_tree_probs(address(), value);
            return this;
        }

        public Buffer segmentation_tree_probs(int index, @NativeType("uint8_t") byte value) {
            StdVideoVP9Segmentation.nsegmentation_tree_probs(address(), index, value);
            return this;
        }

        public Buffer segmentation_pred_prob(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]") ByteBuffer value) {
            StdVideoVP9Segmentation.nsegmentation_pred_prob(address(), value);
            return this;
        }

        public Buffer segmentation_pred_prob(int index, @NativeType("uint8_t") byte value) {
            StdVideoVP9Segmentation.nsegmentation_pred_prob(address(), index, value);
            return this;
        }

        public Buffer FeatureEnabled(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]") ByteBuffer value) {
            StdVideoVP9Segmentation.nFeatureEnabled(address(), value);
            return this;
        }

        public Buffer FeatureEnabled(int index, @NativeType("uint8_t") byte value) {
            StdVideoVP9Segmentation.nFeatureEnabled(address(), index, value);
            return this;
        }

        public Buffer FeatureData(@NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]") ShortBuffer value) {
            StdVideoVP9Segmentation.nFeatureData(address(), value);
            return this;
        }

        public Buffer FeatureData(int index, @NativeType("int16_t") short value) {
            StdVideoVP9Segmentation.nFeatureData(address(), index, value);
            return this;
        }
    }
}
