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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9LoopFilter.class */
public class StdVideoVP9LoopFilter extends Struct<StdVideoVP9LoopFilter> implements NativeResource {
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
        Struct.Layout layout = __struct(__member(StdVideoVP9LoopFilterFlags.SIZEOF, StdVideoVP9LoopFilterFlags.ALIGNOF), __member(1), __member(1), __member(1), __array(1, 4), __member(1), __array(1, 2));
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

    protected StdVideoVP9LoopFilter(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoVP9LoopFilter create(long address, ByteBuffer container) {
        return new StdVideoVP9LoopFilter(address, container);
    }

    public StdVideoVP9LoopFilter(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoVP9LoopFilterFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte loop_filter_level() {
        return nloop_filter_level(address());
    }

    @NativeType("uint8_t")
    public byte loop_filter_sharpness() {
        return nloop_filter_sharpness(address());
    }

    @NativeType("uint8_t")
    public byte update_ref_delta() {
        return nupdate_ref_delta(address());
    }

    @NativeType("int8_t[STD_VIDEO_VP9_MAX_REF_FRAMES]")
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

    @NativeType("int8_t[STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS]")
    public ByteBuffer loop_filter_mode_deltas() {
        return nloop_filter_mode_deltas(address());
    }

    @NativeType("int8_t")
    public byte loop_filter_mode_deltas(int index) {
        return nloop_filter_mode_deltas(address(), index);
    }

    public StdVideoVP9LoopFilter flags(StdVideoVP9LoopFilterFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoVP9LoopFilter flags(Consumer<StdVideoVP9LoopFilterFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoVP9LoopFilter loop_filter_level(@NativeType("uint8_t") byte value) {
        nloop_filter_level(address(), value);
        return this;
    }

    public StdVideoVP9LoopFilter loop_filter_sharpness(@NativeType("uint8_t") byte value) {
        nloop_filter_sharpness(address(), value);
        return this;
    }

    public StdVideoVP9LoopFilter update_ref_delta(@NativeType("uint8_t") byte value) {
        nupdate_ref_delta(address(), value);
        return this;
    }

    public StdVideoVP9LoopFilter loop_filter_ref_deltas(@NativeType("int8_t[STD_VIDEO_VP9_MAX_REF_FRAMES]") ByteBuffer value) {
        nloop_filter_ref_deltas(address(), value);
        return this;
    }

    public StdVideoVP9LoopFilter loop_filter_ref_deltas(int index, @NativeType("int8_t") byte value) {
        nloop_filter_ref_deltas(address(), index, value);
        return this;
    }

    public StdVideoVP9LoopFilter update_mode_delta(@NativeType("uint8_t") byte value) {
        nupdate_mode_delta(address(), value);
        return this;
    }

    public StdVideoVP9LoopFilter loop_filter_mode_deltas(@NativeType("int8_t[STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS]") ByteBuffer value) {
        nloop_filter_mode_deltas(address(), value);
        return this;
    }

    public StdVideoVP9LoopFilter loop_filter_mode_deltas(int index, @NativeType("int8_t") byte value) {
        nloop_filter_mode_deltas(address(), index, value);
        return this;
    }

    public StdVideoVP9LoopFilter set(StdVideoVP9LoopFilterFlags flags, byte loop_filter_level, byte loop_filter_sharpness, byte update_ref_delta, ByteBuffer loop_filter_ref_deltas, byte update_mode_delta, ByteBuffer loop_filter_mode_deltas) {
        flags(flags);
        loop_filter_level(loop_filter_level);
        loop_filter_sharpness(loop_filter_sharpness);
        update_ref_delta(update_ref_delta);
        loop_filter_ref_deltas(loop_filter_ref_deltas);
        update_mode_delta(update_mode_delta);
        loop_filter_mode_deltas(loop_filter_mode_deltas);
        return this;
    }

    public StdVideoVP9LoopFilter set(StdVideoVP9LoopFilter src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoVP9LoopFilter malloc() {
        return new StdVideoVP9LoopFilter(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoVP9LoopFilter calloc() {
        return new StdVideoVP9LoopFilter(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoVP9LoopFilter create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9LoopFilter(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoVP9LoopFilter create(long address) {
        return new StdVideoVP9LoopFilter(address, null);
    }

    public static StdVideoVP9LoopFilter createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoVP9LoopFilter(address, null);
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

    public static StdVideoVP9LoopFilter malloc(MemoryStack stack) {
        return new StdVideoVP9LoopFilter(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoVP9LoopFilter calloc(MemoryStack stack) {
        return new StdVideoVP9LoopFilter(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoVP9LoopFilterFlags nflags(long struct) {
        return StdVideoVP9LoopFilterFlags.create(struct + FLAGS);
    }

    public static byte nloop_filter_level(long struct) {
        return MemoryUtil.memGetByte(struct + LOOP_FILTER_LEVEL);
    }

    public static byte nloop_filter_sharpness(long struct) {
        return MemoryUtil.memGetByte(struct + LOOP_FILTER_SHARPNESS);
    }

    public static byte nupdate_ref_delta(long struct) {
        return MemoryUtil.memGetByte(struct + UPDATE_REF_DELTA);
    }

    public static ByteBuffer nloop_filter_ref_deltas(long struct) {
        return MemoryUtil.memByteBuffer(struct + LOOP_FILTER_REF_DELTAS, 4);
    }

    public static byte nloop_filter_ref_deltas(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LOOP_FILTER_REF_DELTAS + (Checks.check(index, 4) * 1));
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

    public static void nflags(long struct, StdVideoVP9LoopFilterFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoVP9LoopFilterFlags.SIZEOF);
    }

    public static void nloop_filter_level(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOOP_FILTER_LEVEL, value);
    }

    public static void nloop_filter_sharpness(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOOP_FILTER_SHARPNESS, value);
    }

    public static void nupdate_ref_delta(long struct, byte value) {
        MemoryUtil.memPutByte(struct + UPDATE_REF_DELTA, value);
    }

    public static void nloop_filter_ref_deltas(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LOOP_FILTER_REF_DELTAS, value.remaining() * 1);
    }

    public static void nloop_filter_ref_deltas(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LOOP_FILTER_REF_DELTAS + (Checks.check(index, 4) * 1), value);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9LoopFilter$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoVP9LoopFilter, Buffer> implements NativeResource {
        private static final StdVideoVP9LoopFilter ELEMENT_FACTORY = StdVideoVP9LoopFilter.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoVP9LoopFilter.SIZEOF);
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
        public StdVideoVP9LoopFilter getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoVP9LoopFilterFlags flags() {
            return StdVideoVP9LoopFilter.nflags(address());
        }

        @NativeType("uint8_t")
        public byte loop_filter_level() {
            return StdVideoVP9LoopFilter.nloop_filter_level(address());
        }

        @NativeType("uint8_t")
        public byte loop_filter_sharpness() {
            return StdVideoVP9LoopFilter.nloop_filter_sharpness(address());
        }

        @NativeType("uint8_t")
        public byte update_ref_delta() {
            return StdVideoVP9LoopFilter.nupdate_ref_delta(address());
        }

        @NativeType("int8_t[STD_VIDEO_VP9_MAX_REF_FRAMES]")
        public ByteBuffer loop_filter_ref_deltas() {
            return StdVideoVP9LoopFilter.nloop_filter_ref_deltas(address());
        }

        @NativeType("int8_t")
        public byte loop_filter_ref_deltas(int index) {
            return StdVideoVP9LoopFilter.nloop_filter_ref_deltas(address(), index);
        }

        @NativeType("uint8_t")
        public byte update_mode_delta() {
            return StdVideoVP9LoopFilter.nupdate_mode_delta(address());
        }

        @NativeType("int8_t[STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS]")
        public ByteBuffer loop_filter_mode_deltas() {
            return StdVideoVP9LoopFilter.nloop_filter_mode_deltas(address());
        }

        @NativeType("int8_t")
        public byte loop_filter_mode_deltas(int index) {
            return StdVideoVP9LoopFilter.nloop_filter_mode_deltas(address(), index);
        }

        public Buffer flags(StdVideoVP9LoopFilterFlags value) {
            StdVideoVP9LoopFilter.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoVP9LoopFilterFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer loop_filter_level(@NativeType("uint8_t") byte value) {
            StdVideoVP9LoopFilter.nloop_filter_level(address(), value);
            return this;
        }

        public Buffer loop_filter_sharpness(@NativeType("uint8_t") byte value) {
            StdVideoVP9LoopFilter.nloop_filter_sharpness(address(), value);
            return this;
        }

        public Buffer update_ref_delta(@NativeType("uint8_t") byte value) {
            StdVideoVP9LoopFilter.nupdate_ref_delta(address(), value);
            return this;
        }

        public Buffer loop_filter_ref_deltas(@NativeType("int8_t[STD_VIDEO_VP9_MAX_REF_FRAMES]") ByteBuffer value) {
            StdVideoVP9LoopFilter.nloop_filter_ref_deltas(address(), value);
            return this;
        }

        public Buffer loop_filter_ref_deltas(int index, @NativeType("int8_t") byte value) {
            StdVideoVP9LoopFilter.nloop_filter_ref_deltas(address(), index, value);
            return this;
        }

        public Buffer update_mode_delta(@NativeType("uint8_t") byte value) {
            StdVideoVP9LoopFilter.nupdate_mode_delta(address(), value);
            return this;
        }

        public Buffer loop_filter_mode_deltas(@NativeType("int8_t[STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS]") ByteBuffer value) {
            StdVideoVP9LoopFilter.nloop_filter_mode_deltas(address(), value);
            return this;
        }

        public Buffer loop_filter_mode_deltas(int index, @NativeType("int8_t") byte value) {
            StdVideoVP9LoopFilter.nloop_filter_mode_deltas(address(), index, value);
            return this;
        }
    }
}
