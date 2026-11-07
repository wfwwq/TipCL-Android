package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1TimingInfo.class */
public class StdVideoAV1TimingInfo extends Struct<StdVideoAV1TimingInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int NUM_UNITS_IN_DISPLAY_TICK;
    public static final int TIME_SCALE;
    public static final int NUM_TICKS_PER_PICTURE_MINUS_1;

    static {
        Struct.Layout layout = __struct(__member(StdVideoAV1TimingInfoFlags.SIZEOF, StdVideoAV1TimingInfoFlags.ALIGNOF), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        NUM_UNITS_IN_DISPLAY_TICK = layout.offsetof(1);
        TIME_SCALE = layout.offsetof(2);
        NUM_TICKS_PER_PICTURE_MINUS_1 = layout.offsetof(3);
    }

    protected StdVideoAV1TimingInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1TimingInfo create(long address, ByteBuffer container) {
        return new StdVideoAV1TimingInfo(address, container);
    }

    public StdVideoAV1TimingInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoAV1TimingInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int num_units_in_display_tick() {
        return nnum_units_in_display_tick(address());
    }

    @NativeType("uint32_t")
    public int time_scale() {
        return ntime_scale(address());
    }

    @NativeType("uint32_t")
    public int num_ticks_per_picture_minus_1() {
        return nnum_ticks_per_picture_minus_1(address());
    }

    public StdVideoAV1TimingInfo flags(StdVideoAV1TimingInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoAV1TimingInfo flags(Consumer<StdVideoAV1TimingInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoAV1TimingInfo num_units_in_display_tick(@NativeType("uint32_t") int value) {
        nnum_units_in_display_tick(address(), value);
        return this;
    }

    public StdVideoAV1TimingInfo time_scale(@NativeType("uint32_t") int value) {
        ntime_scale(address(), value);
        return this;
    }

    public StdVideoAV1TimingInfo num_ticks_per_picture_minus_1(@NativeType("uint32_t") int value) {
        nnum_ticks_per_picture_minus_1(address(), value);
        return this;
    }

    public StdVideoAV1TimingInfo set(StdVideoAV1TimingInfoFlags flags, int num_units_in_display_tick, int time_scale, int num_ticks_per_picture_minus_1) {
        flags(flags);
        num_units_in_display_tick(num_units_in_display_tick);
        time_scale(time_scale);
        num_ticks_per_picture_minus_1(num_ticks_per_picture_minus_1);
        return this;
    }

    public StdVideoAV1TimingInfo set(StdVideoAV1TimingInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1TimingInfo malloc() {
        return new StdVideoAV1TimingInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1TimingInfo calloc() {
        return new StdVideoAV1TimingInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1TimingInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1TimingInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1TimingInfo create(long address) {
        return new StdVideoAV1TimingInfo(address, null);
    }

    public static StdVideoAV1TimingInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1TimingInfo(address, null);
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

    public static StdVideoAV1TimingInfo malloc(MemoryStack stack) {
        return new StdVideoAV1TimingInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1TimingInfo calloc(MemoryStack stack) {
        return new StdVideoAV1TimingInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoAV1TimingInfoFlags nflags(long struct) {
        return StdVideoAV1TimingInfoFlags.create(struct + FLAGS);
    }

    public static int nnum_units_in_display_tick(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_UNITS_IN_DISPLAY_TICK);
    }

    public static int ntime_scale(long struct) {
        return MemoryUtil.memGetInt(struct + TIME_SCALE);
    }

    public static int nnum_ticks_per_picture_minus_1(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_TICKS_PER_PICTURE_MINUS_1);
    }

    public static void nflags(long struct, StdVideoAV1TimingInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoAV1TimingInfoFlags.SIZEOF);
    }

    public static void nnum_units_in_display_tick(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_UNITS_IN_DISPLAY_TICK, value);
    }

    public static void ntime_scale(long struct, int value) {
        MemoryUtil.memPutInt(struct + TIME_SCALE, value);
    }

    public static void nnum_ticks_per_picture_minus_1(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_TICKS_PER_PICTURE_MINUS_1, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1TimingInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1TimingInfo, Buffer> implements NativeResource {
        private static final StdVideoAV1TimingInfo ELEMENT_FACTORY = StdVideoAV1TimingInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1TimingInfo.SIZEOF);
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
        public StdVideoAV1TimingInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoAV1TimingInfoFlags flags() {
            return StdVideoAV1TimingInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int num_units_in_display_tick() {
            return StdVideoAV1TimingInfo.nnum_units_in_display_tick(address());
        }

        @NativeType("uint32_t")
        public int time_scale() {
            return StdVideoAV1TimingInfo.ntime_scale(address());
        }

        @NativeType("uint32_t")
        public int num_ticks_per_picture_minus_1() {
            return StdVideoAV1TimingInfo.nnum_ticks_per_picture_minus_1(address());
        }

        public Buffer flags(StdVideoAV1TimingInfoFlags value) {
            StdVideoAV1TimingInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoAV1TimingInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer num_units_in_display_tick(@NativeType("uint32_t") int value) {
            StdVideoAV1TimingInfo.nnum_units_in_display_tick(address(), value);
            return this;
        }

        public Buffer time_scale(@NativeType("uint32_t") int value) {
            StdVideoAV1TimingInfo.ntime_scale(address(), value);
            return this;
        }

        public Buffer num_ticks_per_picture_minus_1(@NativeType("uint32_t") int value) {
            StdVideoAV1TimingInfo.nnum_ticks_per_picture_minus_1(address(), value);
            return this;
        }
    }
}
