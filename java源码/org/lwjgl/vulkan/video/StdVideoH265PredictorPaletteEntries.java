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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries.class */
public class StdVideoH265PredictorPaletteEntries extends Struct<StdVideoH265PredictorPaletteEntries> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PREDICTORPALETTEENTRIES;

    static {
        Struct.Layout layout = __struct(__array(2, 128));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PREDICTORPALETTEENTRIES = layout.offsetof(0);
    }

    protected StdVideoH265PredictorPaletteEntries(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265PredictorPaletteEntries create(long address, ByteBuffer container) {
        return new StdVideoH265PredictorPaletteEntries(address, container);
    }

    public StdVideoH265PredictorPaletteEntries(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]")
    public ShortBuffer PredictorPaletteEntries() {
        return nPredictorPaletteEntries(address());
    }

    @NativeType("uint16_t")
    public short PredictorPaletteEntries(int index) {
        return nPredictorPaletteEntries(address(), index);
    }

    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(@NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]") ShortBuffer value) {
        nPredictorPaletteEntries(address(), value);
        return this;
    }

    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(int index, @NativeType("uint16_t") short value) {
        nPredictorPaletteEntries(address(), index, value);
        return this;
    }

    public StdVideoH265PredictorPaletteEntries set(StdVideoH265PredictorPaletteEntries src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265PredictorPaletteEntries malloc() {
        return new StdVideoH265PredictorPaletteEntries(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265PredictorPaletteEntries calloc() {
        return new StdVideoH265PredictorPaletteEntries(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265PredictorPaletteEntries create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265PredictorPaletteEntries(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265PredictorPaletteEntries create(long address) {
        return new StdVideoH265PredictorPaletteEntries(address, null);
    }

    public static StdVideoH265PredictorPaletteEntries createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265PredictorPaletteEntries(address, null);
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

    public static StdVideoH265PredictorPaletteEntries malloc(MemoryStack stack) {
        return new StdVideoH265PredictorPaletteEntries(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265PredictorPaletteEntries calloc(MemoryStack stack) {
        return new StdVideoH265PredictorPaletteEntries(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ShortBuffer nPredictorPaletteEntries(long struct) {
        return MemoryUtil.memShortBuffer(struct + PREDICTORPALETTEENTRIES, 128);
    }

    public static short nPredictorPaletteEntries(long struct, int index) {
        return MemoryUtil.memGetShort(struct + PREDICTORPALETTEENTRIES + (Checks.check(index, 128) * 2));
    }

    public static void nPredictorPaletteEntries(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 128);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PREDICTORPALETTEENTRIES, value.remaining() * 2);
    }

    public static void nPredictorPaletteEntries(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + PREDICTORPALETTEENTRIES + (Checks.check(index, 128) * 2), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265PredictorPaletteEntries, Buffer> implements NativeResource {
        private static final StdVideoH265PredictorPaletteEntries ELEMENT_FACTORY = StdVideoH265PredictorPaletteEntries.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265PredictorPaletteEntries.SIZEOF);
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
        public StdVideoH265PredictorPaletteEntries getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]")
        public ShortBuffer PredictorPaletteEntries() {
            return StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(address());
        }

        @NativeType("uint16_t")
        public short PredictorPaletteEntries(int index) {
            return StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(address(), index);
        }

        public Buffer PredictorPaletteEntries(@NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]") ShortBuffer value) {
            StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(address(), value);
            return this;
        }

        public Buffer PredictorPaletteEntries(int index, @NativeType("uint16_t") short value) {
            StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(address(), index, value);
            return this;
        }
    }
}
