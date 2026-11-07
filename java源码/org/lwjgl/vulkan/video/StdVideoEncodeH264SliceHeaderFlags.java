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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeaderFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeaderFlags.class */
public class StdVideoEncodeH264SliceHeaderFlags extends Struct<StdVideoEncodeH264SliceHeaderFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoEncodeH264SliceHeaderFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264SliceHeaderFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264SliceHeaderFlags(address, container);
    }

    public StdVideoEncodeH264SliceHeaderFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean direct_spatial_mv_pred_flag() {
        return ndirect_spatial_mv_pred_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean num_ref_idx_active_override_flag() {
        return nnum_ref_idx_active_override_flag(address()) != 0;
    }

    public StdVideoEncodeH264SliceHeaderFlags direct_spatial_mv_pred_flag(@NativeType("uint32_t") boolean value) {
        ndirect_spatial_mv_pred_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH264SliceHeaderFlags num_ref_idx_active_override_flag(@NativeType("uint32_t") boolean value) {
        nnum_ref_idx_active_override_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH264SliceHeaderFlags set(boolean direct_spatial_mv_pred_flag, boolean num_ref_idx_active_override_flag) {
        direct_spatial_mv_pred_flag(direct_spatial_mv_pred_flag);
        num_ref_idx_active_override_flag(num_ref_idx_active_override_flag);
        return this;
    }

    public StdVideoEncodeH264SliceHeaderFlags set(StdVideoEncodeH264SliceHeaderFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264SliceHeaderFlags malloc() {
        return new StdVideoEncodeH264SliceHeaderFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264SliceHeaderFlags calloc() {
        return new StdVideoEncodeH264SliceHeaderFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264SliceHeaderFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264SliceHeaderFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264SliceHeaderFlags create(long address) {
        return new StdVideoEncodeH264SliceHeaderFlags(address, null);
    }

    public static StdVideoEncodeH264SliceHeaderFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264SliceHeaderFlags(address, null);
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

    public static StdVideoEncodeH264SliceHeaderFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH264SliceHeaderFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264SliceHeaderFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH264SliceHeaderFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndirect_spatial_mv_pred_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nnum_ref_idx_active_override_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nreserved(long struct) {
        return nbitfield0(struct) >>> 2;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ndirect_spatial_mv_pred_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nnum_ref_idx_active_override_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nreserved(long struct, int value) {
        nbitfield0(struct, (value << 2) | (nbitfield0(struct) & 3));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeaderFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeaderFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264SliceHeaderFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264SliceHeaderFlags ELEMENT_FACTORY = StdVideoEncodeH264SliceHeaderFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264SliceHeaderFlags.SIZEOF);
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
        public StdVideoEncodeH264SliceHeaderFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean direct_spatial_mv_pred_flag() {
            return StdVideoEncodeH264SliceHeaderFlags.ndirect_spatial_mv_pred_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean num_ref_idx_active_override_flag() {
            return StdVideoEncodeH264SliceHeaderFlags.nnum_ref_idx_active_override_flag(address()) != 0;
        }

        public Buffer direct_spatial_mv_pred_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH264SliceHeaderFlags.ndirect_spatial_mv_pred_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer num_ref_idx_active_override_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH264SliceHeaderFlags.nnum_ref_idx_active_override_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
