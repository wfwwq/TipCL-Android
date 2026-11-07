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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSetFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSetFlags.class */
public class StdVideoH265ShortTermRefPicSetFlags extends Struct<StdVideoH265ShortTermRefPicSetFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoH265ShortTermRefPicSetFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265ShortTermRefPicSetFlags create(long address, ByteBuffer container) {
        return new StdVideoH265ShortTermRefPicSetFlags(address, container);
    }

    public StdVideoH265ShortTermRefPicSetFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean inter_ref_pic_set_prediction_flag() {
        return ninter_ref_pic_set_prediction_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean delta_rps_sign() {
        return ndelta_rps_sign(address()) != 0;
    }

    public StdVideoH265ShortTermRefPicSetFlags inter_ref_pic_set_prediction_flag(@NativeType("uint32_t") boolean value) {
        ninter_ref_pic_set_prediction_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265ShortTermRefPicSetFlags delta_rps_sign(@NativeType("uint32_t") boolean value) {
        ndelta_rps_sign(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265ShortTermRefPicSetFlags set(boolean inter_ref_pic_set_prediction_flag, boolean delta_rps_sign) {
        inter_ref_pic_set_prediction_flag(inter_ref_pic_set_prediction_flag);
        delta_rps_sign(delta_rps_sign);
        return this;
    }

    public StdVideoH265ShortTermRefPicSetFlags set(StdVideoH265ShortTermRefPicSetFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265ShortTermRefPicSetFlags malloc() {
        return new StdVideoH265ShortTermRefPicSetFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265ShortTermRefPicSetFlags calloc() {
        return new StdVideoH265ShortTermRefPicSetFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265ShortTermRefPicSetFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265ShortTermRefPicSetFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265ShortTermRefPicSetFlags create(long address) {
        return new StdVideoH265ShortTermRefPicSetFlags(address, null);
    }

    public static StdVideoH265ShortTermRefPicSetFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265ShortTermRefPicSetFlags(address, null);
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

    public static StdVideoH265ShortTermRefPicSetFlags malloc(MemoryStack stack) {
        return new StdVideoH265ShortTermRefPicSetFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265ShortTermRefPicSetFlags calloc(MemoryStack stack) {
        return new StdVideoH265ShortTermRefPicSetFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ninter_ref_pic_set_prediction_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int ndelta_rps_sign(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ninter_ref_pic_set_prediction_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void ndelta_rps_sign(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSetFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSetFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265ShortTermRefPicSetFlags, Buffer> implements NativeResource {
        private static final StdVideoH265ShortTermRefPicSetFlags ELEMENT_FACTORY = StdVideoH265ShortTermRefPicSetFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265ShortTermRefPicSetFlags.SIZEOF);
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
        public StdVideoH265ShortTermRefPicSetFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean inter_ref_pic_set_prediction_flag() {
            return StdVideoH265ShortTermRefPicSetFlags.ninter_ref_pic_set_prediction_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean delta_rps_sign() {
            return StdVideoH265ShortTermRefPicSetFlags.ndelta_rps_sign(address()) != 0;
        }

        public Buffer inter_ref_pic_set_prediction_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265ShortTermRefPicSetFlags.ninter_ref_pic_set_prediction_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer delta_rps_sign(@NativeType("uint32_t") boolean value) {
            StdVideoH265ShortTermRefPicSetFlags.ndelta_rps_sign(address(), value ? 1 : 0);
            return this;
        }
    }
}
