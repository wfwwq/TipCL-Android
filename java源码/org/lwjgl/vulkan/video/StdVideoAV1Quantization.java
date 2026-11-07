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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1Quantization.class */
public class StdVideoAV1Quantization extends Struct<StdVideoAV1Quantization> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int BASE_Q_IDX;
    public static final int DELTAQYDC;
    public static final int DELTAQUDC;
    public static final int DELTAQUAC;
    public static final int DELTAQVDC;
    public static final int DELTAQVAC;
    public static final int QM_Y;
    public static final int QM_U;
    public static final int QM_V;

    static {
        Struct.Layout layout = __struct(__member(StdVideoAV1QuantizationFlags.SIZEOF, StdVideoAV1QuantizationFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        BASE_Q_IDX = layout.offsetof(1);
        DELTAQYDC = layout.offsetof(2);
        DELTAQUDC = layout.offsetof(3);
        DELTAQUAC = layout.offsetof(4);
        DELTAQVDC = layout.offsetof(5);
        DELTAQVAC = layout.offsetof(6);
        QM_Y = layout.offsetof(7);
        QM_U = layout.offsetof(8);
        QM_V = layout.offsetof(9);
    }

    protected StdVideoAV1Quantization(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1Quantization create(long address, ByteBuffer container) {
        return new StdVideoAV1Quantization(address, container);
    }

    public StdVideoAV1Quantization(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoAV1QuantizationFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte base_q_idx() {
        return nbase_q_idx(address());
    }

    @NativeType("int8_t")
    public byte DeltaQYDc() {
        return nDeltaQYDc(address());
    }

    @NativeType("int8_t")
    public byte DeltaQUDc() {
        return nDeltaQUDc(address());
    }

    @NativeType("int8_t")
    public byte DeltaQUAc() {
        return nDeltaQUAc(address());
    }

    @NativeType("int8_t")
    public byte DeltaQVDc() {
        return nDeltaQVDc(address());
    }

    @NativeType("int8_t")
    public byte DeltaQVAc() {
        return nDeltaQVAc(address());
    }

    @NativeType("uint8_t")
    public byte qm_y() {
        return nqm_y(address());
    }

    @NativeType("uint8_t")
    public byte qm_u() {
        return nqm_u(address());
    }

    @NativeType("uint8_t")
    public byte qm_v() {
        return nqm_v(address());
    }

    public StdVideoAV1Quantization flags(StdVideoAV1QuantizationFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoAV1Quantization flags(Consumer<StdVideoAV1QuantizationFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoAV1Quantization base_q_idx(@NativeType("uint8_t") byte value) {
        nbase_q_idx(address(), value);
        return this;
    }

    public StdVideoAV1Quantization DeltaQYDc(@NativeType("int8_t") byte value) {
        nDeltaQYDc(address(), value);
        return this;
    }

    public StdVideoAV1Quantization DeltaQUDc(@NativeType("int8_t") byte value) {
        nDeltaQUDc(address(), value);
        return this;
    }

    public StdVideoAV1Quantization DeltaQUAc(@NativeType("int8_t") byte value) {
        nDeltaQUAc(address(), value);
        return this;
    }

    public StdVideoAV1Quantization DeltaQVDc(@NativeType("int8_t") byte value) {
        nDeltaQVDc(address(), value);
        return this;
    }

    public StdVideoAV1Quantization DeltaQVAc(@NativeType("int8_t") byte value) {
        nDeltaQVAc(address(), value);
        return this;
    }

    public StdVideoAV1Quantization qm_y(@NativeType("uint8_t") byte value) {
        nqm_y(address(), value);
        return this;
    }

    public StdVideoAV1Quantization qm_u(@NativeType("uint8_t") byte value) {
        nqm_u(address(), value);
        return this;
    }

    public StdVideoAV1Quantization qm_v(@NativeType("uint8_t") byte value) {
        nqm_v(address(), value);
        return this;
    }

    public StdVideoAV1Quantization set(StdVideoAV1QuantizationFlags flags, byte base_q_idx, byte DeltaQYDc, byte DeltaQUDc, byte DeltaQUAc, byte DeltaQVDc, byte DeltaQVAc, byte qm_y, byte qm_u, byte qm_v) {
        flags(flags);
        base_q_idx(base_q_idx);
        DeltaQYDc(DeltaQYDc);
        DeltaQUDc(DeltaQUDc);
        DeltaQUAc(DeltaQUAc);
        DeltaQVDc(DeltaQVDc);
        DeltaQVAc(DeltaQVAc);
        qm_y(qm_y);
        qm_u(qm_u);
        qm_v(qm_v);
        return this;
    }

    public StdVideoAV1Quantization set(StdVideoAV1Quantization src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1Quantization malloc() {
        return new StdVideoAV1Quantization(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1Quantization calloc() {
        return new StdVideoAV1Quantization(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1Quantization create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1Quantization(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1Quantization create(long address) {
        return new StdVideoAV1Quantization(address, null);
    }

    public static StdVideoAV1Quantization createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1Quantization(address, null);
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

    public static StdVideoAV1Quantization malloc(MemoryStack stack) {
        return new StdVideoAV1Quantization(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1Quantization calloc(MemoryStack stack) {
        return new StdVideoAV1Quantization(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoAV1QuantizationFlags nflags(long struct) {
        return StdVideoAV1QuantizationFlags.create(struct + FLAGS);
    }

    public static byte nbase_q_idx(long struct) {
        return MemoryUtil.memGetByte(struct + BASE_Q_IDX);
    }

    public static byte nDeltaQYDc(long struct) {
        return MemoryUtil.memGetByte(struct + DELTAQYDC);
    }

    public static byte nDeltaQUDc(long struct) {
        return MemoryUtil.memGetByte(struct + DELTAQUDC);
    }

    public static byte nDeltaQUAc(long struct) {
        return MemoryUtil.memGetByte(struct + DELTAQUAC);
    }

    public static byte nDeltaQVDc(long struct) {
        return MemoryUtil.memGetByte(struct + DELTAQVDC);
    }

    public static byte nDeltaQVAc(long struct) {
        return MemoryUtil.memGetByte(struct + DELTAQVAC);
    }

    public static byte nqm_y(long struct) {
        return MemoryUtil.memGetByte(struct + QM_Y);
    }

    public static byte nqm_u(long struct) {
        return MemoryUtil.memGetByte(struct + QM_U);
    }

    public static byte nqm_v(long struct) {
        return MemoryUtil.memGetByte(struct + QM_V);
    }

    public static void nflags(long struct, StdVideoAV1QuantizationFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoAV1QuantizationFlags.SIZEOF);
    }

    public static void nbase_q_idx(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BASE_Q_IDX, value);
    }

    public static void nDeltaQYDc(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTAQYDC, value);
    }

    public static void nDeltaQUDc(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTAQUDC, value);
    }

    public static void nDeltaQUAc(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTAQUAC, value);
    }

    public static void nDeltaQVDc(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTAQVDC, value);
    }

    public static void nDeltaQVAc(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTAQVAC, value);
    }

    public static void nqm_y(long struct, byte value) {
        MemoryUtil.memPutByte(struct + QM_Y, value);
    }

    public static void nqm_u(long struct, byte value) {
        MemoryUtil.memPutByte(struct + QM_U, value);
    }

    public static void nqm_v(long struct, byte value) {
        MemoryUtil.memPutByte(struct + QM_V, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1Quantization$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1Quantization, Buffer> implements NativeResource {
        private static final StdVideoAV1Quantization ELEMENT_FACTORY = StdVideoAV1Quantization.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1Quantization.SIZEOF);
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
        public StdVideoAV1Quantization getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoAV1QuantizationFlags flags() {
            return StdVideoAV1Quantization.nflags(address());
        }

        @NativeType("uint8_t")
        public byte base_q_idx() {
            return StdVideoAV1Quantization.nbase_q_idx(address());
        }

        @NativeType("int8_t")
        public byte DeltaQYDc() {
            return StdVideoAV1Quantization.nDeltaQYDc(address());
        }

        @NativeType("int8_t")
        public byte DeltaQUDc() {
            return StdVideoAV1Quantization.nDeltaQUDc(address());
        }

        @NativeType("int8_t")
        public byte DeltaQUAc() {
            return StdVideoAV1Quantization.nDeltaQUAc(address());
        }

        @NativeType("int8_t")
        public byte DeltaQVDc() {
            return StdVideoAV1Quantization.nDeltaQVDc(address());
        }

        @NativeType("int8_t")
        public byte DeltaQVAc() {
            return StdVideoAV1Quantization.nDeltaQVAc(address());
        }

        @NativeType("uint8_t")
        public byte qm_y() {
            return StdVideoAV1Quantization.nqm_y(address());
        }

        @NativeType("uint8_t")
        public byte qm_u() {
            return StdVideoAV1Quantization.nqm_u(address());
        }

        @NativeType("uint8_t")
        public byte qm_v() {
            return StdVideoAV1Quantization.nqm_v(address());
        }

        public Buffer flags(StdVideoAV1QuantizationFlags value) {
            StdVideoAV1Quantization.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoAV1QuantizationFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer base_q_idx(@NativeType("uint8_t") byte value) {
            StdVideoAV1Quantization.nbase_q_idx(address(), value);
            return this;
        }

        public Buffer DeltaQYDc(@NativeType("int8_t") byte value) {
            StdVideoAV1Quantization.nDeltaQYDc(address(), value);
            return this;
        }

        public Buffer DeltaQUDc(@NativeType("int8_t") byte value) {
            StdVideoAV1Quantization.nDeltaQUDc(address(), value);
            return this;
        }

        public Buffer DeltaQUAc(@NativeType("int8_t") byte value) {
            StdVideoAV1Quantization.nDeltaQUAc(address(), value);
            return this;
        }

        public Buffer DeltaQVDc(@NativeType("int8_t") byte value) {
            StdVideoAV1Quantization.nDeltaQVDc(address(), value);
            return this;
        }

        public Buffer DeltaQVAc(@NativeType("int8_t") byte value) {
            StdVideoAV1Quantization.nDeltaQVAc(address(), value);
            return this;
        }

        public Buffer qm_y(@NativeType("uint8_t") byte value) {
            StdVideoAV1Quantization.nqm_y(address(), value);
            return this;
        }

        public Buffer qm_u(@NativeType("uint8_t") byte value) {
            StdVideoAV1Quantization.nqm_u(address(), value);
            return this;
        }

        public Buffer qm_v(@NativeType("uint8_t") byte value) {
            StdVideoAV1Quantization.nqm_v(address(), value);
            return this;
        }
    }
}
