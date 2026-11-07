package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1Segmentation.class */
public class StdVideoAV1Segmentation extends Struct<StdVideoAV1Segmentation> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FEATUREENABLED;
    public static final int FEATUREDATA;

    static {
        Struct.Layout layout = __struct(__array(1, 8), __array(2, 8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FEATUREENABLED = layout.offsetof(0);
        FEATUREDATA = layout.offsetof(1);
    }

    protected StdVideoAV1Segmentation(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1Segmentation create(long address, ByteBuffer container) {
        return new StdVideoAV1Segmentation(address, container);
    }

    public StdVideoAV1Segmentation(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_SEGMENTS]")
    public ByteBuffer FeatureEnabled() {
        return nFeatureEnabled(address());
    }

    @NativeType("uint8_t")
    public byte FeatureEnabled(int index) {
        return nFeatureEnabled(address(), index);
    }

    @NativeType("int16_t[STD_VIDEO_AV1_SEG_LVL_MAX]")
    public ShortBuffer FeatureData() {
        return nFeatureData(address());
    }

    @NativeType("int16_t")
    public short FeatureData(int index) {
        return nFeatureData(address(), index);
    }

    public StdVideoAV1Segmentation FeatureEnabled(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_SEGMENTS]") ByteBuffer value) {
        nFeatureEnabled(address(), value);
        return this;
    }

    public StdVideoAV1Segmentation FeatureEnabled(int index, @NativeType("uint8_t") byte value) {
        nFeatureEnabled(address(), index, value);
        return this;
    }

    public StdVideoAV1Segmentation FeatureData(@NativeType("int16_t[STD_VIDEO_AV1_SEG_LVL_MAX]") ShortBuffer value) {
        nFeatureData(address(), value);
        return this;
    }

    public StdVideoAV1Segmentation FeatureData(int index, @NativeType("int16_t") short value) {
        nFeatureData(address(), index, value);
        return this;
    }

    public StdVideoAV1Segmentation set(ByteBuffer FeatureEnabled, ShortBuffer FeatureData) {
        FeatureEnabled(FeatureEnabled);
        FeatureData(FeatureData);
        return this;
    }

    public StdVideoAV1Segmentation set(StdVideoAV1Segmentation src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1Segmentation malloc() {
        return new StdVideoAV1Segmentation(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1Segmentation calloc() {
        return new StdVideoAV1Segmentation(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1Segmentation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1Segmentation(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1Segmentation create(long address) {
        return new StdVideoAV1Segmentation(address, null);
    }

    public static StdVideoAV1Segmentation createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1Segmentation(address, null);
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

    public static StdVideoAV1Segmentation malloc(MemoryStack stack) {
        return new StdVideoAV1Segmentation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1Segmentation calloc(MemoryStack stack) {
        return new StdVideoAV1Segmentation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nFeatureEnabled(long struct) {
        return MemoryUtil.memByteBuffer(struct + FEATUREENABLED, 8);
    }

    public static byte nFeatureEnabled(long struct, int index) {
        return MemoryUtil.memGetByte(struct + FEATUREENABLED + (Checks.check(index, 8) * 1));
    }

    public static ShortBuffer nFeatureData(long struct) {
        return MemoryUtil.memShortBuffer(struct + FEATUREDATA, 8);
    }

    public static short nFeatureData(long struct, int index) {
        return MemoryUtil.memGetShort(struct + FEATUREDATA + (Checks.check(index, 8) * 2));
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
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + FEATUREDATA, value.remaining() * 2);
    }

    public static void nFeatureData(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + FEATUREDATA + (Checks.check(index, 8) * 2), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1Segmentation$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1Segmentation, Buffer> implements NativeResource {
        private static final StdVideoAV1Segmentation ELEMENT_FACTORY = StdVideoAV1Segmentation.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1Segmentation.SIZEOF);
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
        public StdVideoAV1Segmentation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_SEGMENTS]")
        public ByteBuffer FeatureEnabled() {
            return StdVideoAV1Segmentation.nFeatureEnabled(address());
        }

        @NativeType("uint8_t")
        public byte FeatureEnabled(int index) {
            return StdVideoAV1Segmentation.nFeatureEnabled(address(), index);
        }

        @NativeType("int16_t[STD_VIDEO_AV1_SEG_LVL_MAX]")
        public ShortBuffer FeatureData() {
            return StdVideoAV1Segmentation.nFeatureData(address());
        }

        @NativeType("int16_t")
        public short FeatureData(int index) {
            return StdVideoAV1Segmentation.nFeatureData(address(), index);
        }

        public Buffer FeatureEnabled(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_SEGMENTS]") ByteBuffer value) {
            StdVideoAV1Segmentation.nFeatureEnabled(address(), value);
            return this;
        }

        public Buffer FeatureEnabled(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1Segmentation.nFeatureEnabled(address(), index, value);
            return this;
        }

        public Buffer FeatureData(@NativeType("int16_t[STD_VIDEO_AV1_SEG_LVL_MAX]") ShortBuffer value) {
            StdVideoAV1Segmentation.nFeatureData(address(), value);
            return this;
        }

        public Buffer FeatureData(int index, @NativeType("int16_t") short value) {
            StdVideoAV1Segmentation.nFeatureData(address(), index, value);
            return this;
        }
    }
}
