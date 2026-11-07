package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1QuantizationFlags.class */
public class StdVideoAV1QuantizationFlags extends Struct<StdVideoAV1QuantizationFlags> implements NativeResource {
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

    protected StdVideoAV1QuantizationFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1QuantizationFlags create(long address, ByteBuffer container) {
        return new StdVideoAV1QuantizationFlags(address, container);
    }

    public StdVideoAV1QuantizationFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean using_qmatrix() {
        return nusing_qmatrix(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean diff_uv_delta() {
        return ndiff_uv_delta(address()) != 0;
    }

    public StdVideoAV1QuantizationFlags using_qmatrix(@NativeType("uint32_t") boolean value) {
        nusing_qmatrix(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1QuantizationFlags diff_uv_delta(@NativeType("uint32_t") boolean value) {
        ndiff_uv_delta(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1QuantizationFlags set(boolean using_qmatrix, boolean diff_uv_delta) {
        using_qmatrix(using_qmatrix);
        diff_uv_delta(diff_uv_delta);
        return this;
    }

    public StdVideoAV1QuantizationFlags set(StdVideoAV1QuantizationFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1QuantizationFlags malloc() {
        return new StdVideoAV1QuantizationFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1QuantizationFlags calloc() {
        return new StdVideoAV1QuantizationFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1QuantizationFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1QuantizationFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1QuantizationFlags create(long address) {
        return new StdVideoAV1QuantizationFlags(address, null);
    }

    public static StdVideoAV1QuantizationFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1QuantizationFlags(address, null);
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

    public static StdVideoAV1QuantizationFlags malloc(MemoryStack stack) {
        return new StdVideoAV1QuantizationFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1QuantizationFlags calloc(MemoryStack stack) {
        return new StdVideoAV1QuantizationFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nusing_qmatrix(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int ndiff_uv_delta(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nusing_qmatrix(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void ndiff_uv_delta(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-1073741824)) | (value & LockFreeTaskQueueCore.MAX_CAPACITY_MASK));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1QuantizationFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1QuantizationFlags, Buffer> implements NativeResource {
        private static final StdVideoAV1QuantizationFlags ELEMENT_FACTORY = StdVideoAV1QuantizationFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1QuantizationFlags.SIZEOF);
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
        public StdVideoAV1QuantizationFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean using_qmatrix() {
            return StdVideoAV1QuantizationFlags.nusing_qmatrix(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean diff_uv_delta() {
            return StdVideoAV1QuantizationFlags.ndiff_uv_delta(address()) != 0;
        }

        public Buffer using_qmatrix(@NativeType("uint32_t") boolean value) {
            StdVideoAV1QuantizationFlags.nusing_qmatrix(address(), value ? 1 : 0);
            return this;
        }

        public Buffer diff_uv_delta(@NativeType("uint32_t") boolean value) {
            StdVideoAV1QuantizationFlags.ndiff_uv_delta(address(), value ? 1 : 0);
            return this;
        }
    }
}
