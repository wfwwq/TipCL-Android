package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopFilter.class */
public class StdVideoAV1LoopFilter extends Struct<StdVideoAV1LoopFilter> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int LOOP_FILTER_LEVEL;
    public static final int LOOP_FILTER_SHARPNESS;
    public static final int UPDATE_REF_DELTA;
    public static final int LOOP_FILTER_REF_DELTAS;
    public static final int UPDATE_MODE_DELTA;
    public static final int LOOP_FILTER_MODE_DELTAS;

    static {
        Struct.Layout layout = __struct(__member(StdVideoAV1LoopFilterFlags.SIZEOF, StdVideoAV1LoopFilterFlags.ALIGNOF), __array(1, 4), __member(1), __member(1), __array(1, 8), __member(1), __array(1, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        LOOP_FILTER_LEVEL = layout.offsetof(1);
        LOOP_FILTER_SHARPNESS = layout.offsetof(2);
        UPDATE_REF_DELTA = layout.offsetof(3);
        LOOP_FILTER_REF_DELTAS = layout.offsetof(4);
        UPDATE_MODE_DELTA = layout.offsetof(5);
        LOOP_FILTER_MODE_DELTAS = layout.offsetof(6);
    }

    protected StdVideoAV1LoopFilter(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1LoopFilter create(long address, ByteBuffer container) {
        return new StdVideoAV1LoopFilter(address, container);
    }

    public StdVideoAV1LoopFilter(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoAV1LoopFilterFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]")
    public ByteBuffer loop_filter_level() {
        return nloop_filter_level(address());
    }

    @NativeType("uint8_t")
    public byte loop_filter_level(int index) {
        return nloop_filter_level(address(), index);
    }

    @NativeType("uint8_t")
    public byte loop_filter_sharpness() {
        return nloop_filter_sharpness(address());
    }

    @NativeType("uint8_t")
    public byte update_ref_delta() {
        return nupdate_ref_delta(address());
    }

    @NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]")
    public ByteBuffer loop_filter_ref_deltas() {
        return nloop_filter_ref_deltas(address());
    }

    @NativeType("int8_t")
    public byte loop_filter_ref_deltas(int index) {
        return nloop_filter_ref_deltas(address(), index);
    }

    @NativeType("uint8_t")
    public byte update_mode_delta() {
        return nupdate_mode_delta(address());
    }

    @NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]")
    public ByteBuffer loop_filter_mode_deltas() {
        return nloop_filter_mode_deltas(address());
    }

    @NativeType("int8_t")
    public byte loop_filter_mode_deltas(int index) {
        return nloop_filter_mode_deltas(address(), index);
    }

    public StdVideoAV1LoopFilter flags(StdVideoAV1LoopFilterFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoAV1LoopFilter flags(Consumer<StdVideoAV1LoopFilterFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoAV1LoopFilter loop_filter_level(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]") ByteBuffer value) {
        nloop_filter_level(address(), value);
        return this;
    }

    public StdVideoAV1LoopFilter loop_filter_level(int index, @NativeType("uint8_t") byte value) {
        nloop_filter_level(address(), index, value);
        return this;
    }

    public StdVideoAV1LoopFilter loop_filter_sharpness(@NativeType("uint8_t") byte value) {
        nloop_filter_sharpness(address(), value);
        return this;
    }

    public StdVideoAV1LoopFilter update_ref_delta(@NativeType("uint8_t") byte value) {
        nupdate_ref_delta(address(), value);
        return this;
    }

    public StdVideoAV1LoopFilter loop_filter_ref_deltas(@NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]") ByteBuffer value) {
        nloop_filter_ref_deltas(address(), value);
        return this;
    }

    public StdVideoAV1LoopFilter loop_filter_ref_deltas(int index, @NativeType("int8_t") byte value) {
        nloop_filter_ref_deltas(address(), index, value);
        return this;
    }

    public StdVideoAV1LoopFilter update_mode_delta(@NativeType("uint8_t") byte value) {
        nupdate_mode_delta(address(), value);
        return this;
    }

    public StdVideoAV1LoopFilter loop_filter_mode_deltas(@NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]") ByteBuffer value) {
        nloop_filter_mode_deltas(address(), value);
        return this;
    }

    public StdVideoAV1LoopFilter loop_filter_mode_deltas(int index, @NativeType("int8_t") byte value) {
        nloop_filter_mode_deltas(address(), index, value);
        return this;
    }

    public StdVideoAV1LoopFilter set(StdVideoAV1LoopFilterFlags flags, ByteBuffer loop_filter_level, byte loop_filter_sharpness, byte update_ref_delta, ByteBuffer loop_filter_ref_deltas, byte update_mode_delta, ByteBuffer loop_filter_mode_deltas) {
        flags(flags);
        loop_filter_level(loop_filter_level);
        loop_filter_sharpness(loop_filter_sharpness);
        update_ref_delta(update_ref_delta);
        loop_filter_ref_deltas(loop_filter_ref_deltas);
        update_mode_delta(update_mode_delta);
        loop_filter_mode_deltas(loop_filter_mode_deltas);
        return this;
    }

    public StdVideoAV1LoopFilter set(StdVideoAV1LoopFilter src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1LoopFilter malloc() {
        return new StdVideoAV1LoopFilter(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1LoopFilter calloc() {
        return new StdVideoAV1LoopFilter(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1LoopFilter create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1LoopFilter(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1LoopFilter create(long address) {
        return new StdVideoAV1LoopFilter(address, null);
    }

    public static StdVideoAV1LoopFilter createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1LoopFilter(address, null);
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

    public static StdVideoAV1LoopFilter malloc(MemoryStack stack) {
        return new StdVideoAV1LoopFilter(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1LoopFilter calloc(MemoryStack stack) {
        return new StdVideoAV1LoopFilter(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoAV1LoopFilterFlags nflags(long struct) {
        return StdVideoAV1LoopFilterFlags.create(struct + FLAGS);
    }

    public static ByteBuffer nloop_filter_level(long struct) {
        return MemoryUtil.memByteBuffer(struct + LOOP_FILTER_LEVEL, 4);
    }

    public static byte nloop_filter_level(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LOOP_FILTER_LEVEL + (Checks.check(index, 4) * 1));
    }

    public static byte nloop_filter_sharpness(long struct) {
        return MemoryUtil.memGetByte(struct + LOOP_FILTER_SHARPNESS);
    }

    public static byte nupdate_ref_delta(long struct) {
        return MemoryUtil.memGetByte(struct + UPDATE_REF_DELTA);
    }

    public static ByteBuffer nloop_filter_ref_deltas(long struct) {
        return MemoryUtil.memByteBuffer(struct + LOOP_FILTER_REF_DELTAS, 8);
    }

    public static byte nloop_filter_ref_deltas(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LOOP_FILTER_REF_DELTAS + (Checks.check(index, 8) * 1));
    }

    public static byte nupdate_mode_delta(long struct) {
        return MemoryUtil.memGetByte(struct + UPDATE_MODE_DELTA);
    }

    public static ByteBuffer nloop_filter_mode_deltas(long struct) {
        return MemoryUtil.memByteBuffer(struct + LOOP_FILTER_MODE_DELTAS, 2);
    }

    public static byte nloop_filter_mode_deltas(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LOOP_FILTER_MODE_DELTAS + (Checks.check(index, 2) * 1));
    }

    public static void nflags(long struct, StdVideoAV1LoopFilterFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoAV1LoopFilterFlags.SIZEOF);
    }

    public static void nloop_filter_level(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LOOP_FILTER_LEVEL, value.remaining() * 1);
    }

    public static void nloop_filter_level(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LOOP_FILTER_LEVEL + (Checks.check(index, 4) * 1), value);
    }

    public static void nloop_filter_sharpness(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOOP_FILTER_SHARPNESS, value);
    }

    public static void nupdate_ref_delta(long struct, byte value) {
        MemoryUtil.memPutByte(struct + UPDATE_REF_DELTA, value);
    }

    public static void nloop_filter_ref_deltas(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LOOP_FILTER_REF_DELTAS, value.remaining() * 1);
    }

    public static void nloop_filter_ref_deltas(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LOOP_FILTER_REF_DELTAS + (Checks.check(index, 8) * 1), value);
    }

    public static void nupdate_mode_delta(long struct, byte value) {
        MemoryUtil.memPutByte(struct + UPDATE_MODE_DELTA, value);
    }

    public static void nloop_filter_mode_deltas(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LOOP_FILTER_MODE_DELTAS, value.remaining() * 1);
    }

    public static void nloop_filter_mode_deltas(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LOOP_FILTER_MODE_DELTAS + (Checks.check(index, 2) * 1), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopFilter$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1LoopFilter, Buffer> implements NativeResource {
        private static final StdVideoAV1LoopFilter ELEMENT_FACTORY = StdVideoAV1LoopFilter.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1LoopFilter.SIZEOF);
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
        public StdVideoAV1LoopFilter getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoAV1LoopFilterFlags flags() {
            return StdVideoAV1LoopFilter.nflags(address());
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]")
        public ByteBuffer loop_filter_level() {
            return StdVideoAV1LoopFilter.nloop_filter_level(address());
        }

        @NativeType("uint8_t")
        public byte loop_filter_level(int index) {
            return StdVideoAV1LoopFilter.nloop_filter_level(address(), index);
        }

        @NativeType("uint8_t")
        public byte loop_filter_sharpness() {
            return StdVideoAV1LoopFilter.nloop_filter_sharpness(address());
        }

        @NativeType("uint8_t")
        public byte update_ref_delta() {
            return StdVideoAV1LoopFilter.nupdate_ref_delta(address());
        }

        @NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]")
        public ByteBuffer loop_filter_ref_deltas() {
            return StdVideoAV1LoopFilter.nloop_filter_ref_deltas(address());
        }

        @NativeType("int8_t")
        public byte loop_filter_ref_deltas(int index) {
            return StdVideoAV1LoopFilter.nloop_filter_ref_deltas(address(), index);
        }

        @NativeType("uint8_t")
        public byte update_mode_delta() {
            return StdVideoAV1LoopFilter.nupdate_mode_delta(address());
        }

        @NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]")
        public ByteBuffer loop_filter_mode_deltas() {
            return StdVideoAV1LoopFilter.nloop_filter_mode_deltas(address());
        }

        @NativeType("int8_t")
        public byte loop_filter_mode_deltas(int index) {
            return StdVideoAV1LoopFilter.nloop_filter_mode_deltas(address(), index);
        }

        public Buffer flags(StdVideoAV1LoopFilterFlags value) {
            StdVideoAV1LoopFilter.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoAV1LoopFilterFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer loop_filter_level(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]") ByteBuffer value) {
            StdVideoAV1LoopFilter.nloop_filter_level(address(), value);
            return this;
        }

        public Buffer loop_filter_level(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1LoopFilter.nloop_filter_level(address(), index, value);
            return this;
        }

        public Buffer loop_filter_sharpness(@NativeType("uint8_t") byte value) {
            StdVideoAV1LoopFilter.nloop_filter_sharpness(address(), value);
            return this;
        }

        public Buffer update_ref_delta(@NativeType("uint8_t") byte value) {
            StdVideoAV1LoopFilter.nupdate_ref_delta(address(), value);
            return this;
        }

        public Buffer loop_filter_ref_deltas(@NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]") ByteBuffer value) {
            StdVideoAV1LoopFilter.nloop_filter_ref_deltas(address(), value);
            return this;
        }

        public Buffer loop_filter_ref_deltas(int index, @NativeType("int8_t") byte value) {
            StdVideoAV1LoopFilter.nloop_filter_ref_deltas(address(), index, value);
            return this;
        }

        public Buffer update_mode_delta(@NativeType("uint8_t") byte value) {
            StdVideoAV1LoopFilter.nupdate_mode_delta(address(), value);
            return this;
        }

        public Buffer loop_filter_mode_deltas(@NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]") ByteBuffer value) {
            StdVideoAV1LoopFilter.nloop_filter_mode_deltas(address(), value);
            return this;
        }

        public Buffer loop_filter_mode_deltas(int index, @NativeType("int8_t") byte value) {
            StdVideoAV1LoopFilter.nloop_filter_mode_deltas(address(), index, value);
            return this;
        }
    }
}
