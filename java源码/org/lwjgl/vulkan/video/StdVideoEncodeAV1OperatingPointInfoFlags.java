package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1OperatingPointInfoFlags.class */
public class StdVideoEncodeAV1OperatingPointInfoFlags extends Struct<StdVideoEncodeAV1OperatingPointInfoFlags> implements NativeResource {
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

    protected StdVideoEncodeAV1OperatingPointInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeAV1OperatingPointInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(address, container);
    }

    public StdVideoEncodeAV1OperatingPointInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean decoder_model_present_for_this_op() {
        return ndecoder_model_present_for_this_op(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean low_delay_mode_flag() {
        return nlow_delay_mode_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean initial_display_delay_present_for_this_op() {
        return ninitial_display_delay_present_for_this_op(address()) != 0;
    }

    public StdVideoEncodeAV1OperatingPointInfoFlags decoder_model_present_for_this_op(@NativeType("uint32_t") boolean value) {
        ndecoder_model_present_for_this_op(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfoFlags low_delay_mode_flag(@NativeType("uint32_t") boolean value) {
        nlow_delay_mode_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfoFlags initial_display_delay_present_for_this_op(@NativeType("uint32_t") boolean value) {
        ninitial_display_delay_present_for_this_op(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfoFlags set(boolean decoder_model_present_for_this_op, boolean low_delay_mode_flag, boolean initial_display_delay_present_for_this_op) {
        decoder_model_present_for_this_op(decoder_model_present_for_this_op);
        low_delay_mode_flag(low_delay_mode_flag);
        initial_display_delay_present_for_this_op(initial_display_delay_present_for_this_op);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfoFlags set(StdVideoEncodeAV1OperatingPointInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags malloc() {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags calloc() {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1OperatingPointInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags create(long address) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(address, null);
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeAV1OperatingPointInfoFlags(address, null);
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

    public static StdVideoEncodeAV1OperatingPointInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndecoder_model_present_for_this_op(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nlow_delay_mode_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int ninitial_display_delay_present_for_this_op(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & 536870911;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ndecoder_model_present_for_this_op(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nlow_delay_mode_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void ninitial_display_delay_present_for_this_op(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-536870912)) | (value & 536870911));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1OperatingPointInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1OperatingPointInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeAV1OperatingPointInfoFlags ELEMENT_FACTORY = StdVideoEncodeAV1OperatingPointInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeAV1OperatingPointInfoFlags.SIZEOF);
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
        public StdVideoEncodeAV1OperatingPointInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean decoder_model_present_for_this_op() {
            return StdVideoEncodeAV1OperatingPointInfoFlags.ndecoder_model_present_for_this_op(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean low_delay_mode_flag() {
            return StdVideoEncodeAV1OperatingPointInfoFlags.nlow_delay_mode_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean initial_display_delay_present_for_this_op() {
            return StdVideoEncodeAV1OperatingPointInfoFlags.ninitial_display_delay_present_for_this_op(address()) != 0;
        }

        public Buffer decoder_model_present_for_this_op(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1OperatingPointInfoFlags.ndecoder_model_present_for_this_op(address(), value ? 1 : 0);
            return this;
        }

        public Buffer low_delay_mode_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1OperatingPointInfoFlags.nlow_delay_mode_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer initial_display_delay_present_for_this_op(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1OperatingPointInfoFlags.ninitial_display_delay_present_for_this_op(address(), value ? 1 : 0);
            return this;
        }
    }
}
