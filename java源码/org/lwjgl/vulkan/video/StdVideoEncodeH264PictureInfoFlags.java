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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfoFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfoFlags.class */
public class StdVideoEncodeH264PictureInfoFlags extends Struct<StdVideoEncodeH264PictureInfoFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoEncodeH264PictureInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264PictureInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264PictureInfoFlags(address, container);
    }

    public StdVideoEncodeH264PictureInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean IdrPicFlag() {
        return nIdrPicFlag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean is_reference() {
        return nis_reference(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean no_output_of_prior_pics_flag() {
        return nno_output_of_prior_pics_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean long_term_reference_flag() {
        return nlong_term_reference_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean adaptive_ref_pic_marking_mode_flag() {
        return nadaptive_ref_pic_marking_mode_flag(address()) != 0;
    }

    public StdVideoEncodeH264PictureInfoFlags IdrPicFlag(@NativeType("uint32_t") boolean value) {
        nIdrPicFlag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH264PictureInfoFlags is_reference(@NativeType("uint32_t") boolean value) {
        nis_reference(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH264PictureInfoFlags no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) {
        nno_output_of_prior_pics_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH264PictureInfoFlags long_term_reference_flag(@NativeType("uint32_t") boolean value) {
        nlong_term_reference_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH264PictureInfoFlags adaptive_ref_pic_marking_mode_flag(@NativeType("uint32_t") boolean value) {
        nadaptive_ref_pic_marking_mode_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH264PictureInfoFlags set(boolean IdrPicFlag, boolean is_reference, boolean no_output_of_prior_pics_flag, boolean long_term_reference_flag, boolean adaptive_ref_pic_marking_mode_flag) {
        IdrPicFlag(IdrPicFlag);
        is_reference(is_reference);
        no_output_of_prior_pics_flag(no_output_of_prior_pics_flag);
        long_term_reference_flag(long_term_reference_flag);
        adaptive_ref_pic_marking_mode_flag(adaptive_ref_pic_marking_mode_flag);
        return this;
    }

    public StdVideoEncodeH264PictureInfoFlags set(StdVideoEncodeH264PictureInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264PictureInfoFlags malloc() {
        return new StdVideoEncodeH264PictureInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264PictureInfoFlags calloc() {
        return new StdVideoEncodeH264PictureInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264PictureInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264PictureInfoFlags create(long address) {
        return new StdVideoEncodeH264PictureInfoFlags(address, null);
    }

    public static StdVideoEncodeH264PictureInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264PictureInfoFlags(address, null);
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

    public static StdVideoEncodeH264PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH264PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH264PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nIdrPicFlag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nis_reference(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nno_output_of_prior_pics_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nlong_term_reference_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nadaptive_ref_pic_marking_mode_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int nreserved(long struct) {
        return nbitfield0(struct) >>> 5;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nIdrPicFlag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nis_reference(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nno_output_of_prior_pics_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nlong_term_reference_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nadaptive_ref_pic_marking_mode_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void nreserved(long struct, int value) {
        nbitfield0(struct, (value << 5) | (nbitfield0(struct) & 31));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfoFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264PictureInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264PictureInfoFlags ELEMENT_FACTORY = StdVideoEncodeH264PictureInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264PictureInfoFlags.SIZEOF);
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
        public StdVideoEncodeH264PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean IdrPicFlag() {
            return StdVideoEncodeH264PictureInfoFlags.nIdrPicFlag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean is_reference() {
            return StdVideoEncodeH264PictureInfoFlags.nis_reference(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean no_output_of_prior_pics_flag() {
            return StdVideoEncodeH264PictureInfoFlags.nno_output_of_prior_pics_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean long_term_reference_flag() {
            return StdVideoEncodeH264PictureInfoFlags.nlong_term_reference_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean adaptive_ref_pic_marking_mode_flag() {
            return StdVideoEncodeH264PictureInfoFlags.nadaptive_ref_pic_marking_mode_flag(address()) != 0;
        }

        public Buffer IdrPicFlag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH264PictureInfoFlags.nIdrPicFlag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer is_reference(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH264PictureInfoFlags.nis_reference(address(), value ? 1 : 0);
            return this;
        }

        public Buffer no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH264PictureInfoFlags.nno_output_of_prior_pics_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer long_term_reference_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH264PictureInfoFlags.nlong_term_reference_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer adaptive_ref_pic_marking_mode_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH264PictureInfoFlags.nadaptive_ref_pic_marking_mode_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
