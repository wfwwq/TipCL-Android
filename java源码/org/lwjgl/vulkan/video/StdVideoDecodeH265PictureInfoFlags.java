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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265PictureInfoFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265PictureInfoFlags.class */
public class StdVideoDecodeH265PictureInfoFlags extends Struct<StdVideoDecodeH265PictureInfoFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoDecodeH265PictureInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeH265PictureInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoDecodeH265PictureInfoFlags(address, container);
    }

    public StdVideoDecodeH265PictureInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean IrapPicFlag() {
        return nIrapPicFlag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean IdrPicFlag() {
        return nIdrPicFlag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean IsReference() {
        return nIsReference(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean short_term_ref_pic_set_sps_flag() {
        return nshort_term_ref_pic_set_sps_flag(address()) != 0;
    }

    public StdVideoDecodeH265PictureInfoFlags IrapPicFlag(@NativeType("uint32_t") boolean value) {
        nIrapPicFlag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH265PictureInfoFlags IdrPicFlag(@NativeType("uint32_t") boolean value) {
        nIdrPicFlag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH265PictureInfoFlags IsReference(@NativeType("uint32_t") boolean value) {
        nIsReference(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH265PictureInfoFlags short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) {
        nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH265PictureInfoFlags set(boolean IrapPicFlag, boolean IdrPicFlag, boolean IsReference, boolean short_term_ref_pic_set_sps_flag) {
        IrapPicFlag(IrapPicFlag);
        IdrPicFlag(IdrPicFlag);
        IsReference(IsReference);
        short_term_ref_pic_set_sps_flag(short_term_ref_pic_set_sps_flag);
        return this;
    }

    public StdVideoDecodeH265PictureInfoFlags set(StdVideoDecodeH265PictureInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeH265PictureInfoFlags malloc() {
        return new StdVideoDecodeH265PictureInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeH265PictureInfoFlags calloc() {
        return new StdVideoDecodeH265PictureInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeH265PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeH265PictureInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeH265PictureInfoFlags create(long address) {
        return new StdVideoDecodeH265PictureInfoFlags(address, null);
    }

    public static StdVideoDecodeH265PictureInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeH265PictureInfoFlags(address, null);
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

    public static StdVideoDecodeH265PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoDecodeH265PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeH265PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoDecodeH265PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nIrapPicFlag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nIdrPicFlag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nIsReference(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nshort_term_ref_pic_set_sps_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nIrapPicFlag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nIdrPicFlag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nIsReference(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nshort_term_ref_pic_set_sps_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265PictureInfoFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265PictureInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeH265PictureInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoDecodeH265PictureInfoFlags ELEMENT_FACTORY = StdVideoDecodeH265PictureInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeH265PictureInfoFlags.SIZEOF);
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
        public StdVideoDecodeH265PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean IrapPicFlag() {
            return StdVideoDecodeH265PictureInfoFlags.nIrapPicFlag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean IdrPicFlag() {
            return StdVideoDecodeH265PictureInfoFlags.nIdrPicFlag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean IsReference() {
            return StdVideoDecodeH265PictureInfoFlags.nIsReference(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean short_term_ref_pic_set_sps_flag() {
            return StdVideoDecodeH265PictureInfoFlags.nshort_term_ref_pic_set_sps_flag(address()) != 0;
        }

        public Buffer IrapPicFlag(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH265PictureInfoFlags.nIrapPicFlag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer IdrPicFlag(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH265PictureInfoFlags.nIdrPicFlag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer IsReference(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH265PictureInfoFlags.nIsReference(address(), value ? 1 : 0);
            return this;
        }

        public Buffer short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH265PictureInfoFlags.nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
