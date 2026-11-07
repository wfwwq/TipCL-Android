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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags.class */
public class StdVideoDecodeH264PictureInfoFlags extends Struct<StdVideoDecodeH264PictureInfoFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoDecodeH264PictureInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeH264PictureInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoDecodeH264PictureInfoFlags(address, container);
    }

    public StdVideoDecodeH264PictureInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean field_pic_flag() {
        return nfield_pic_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean is_intra() {
        return nis_intra(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean IdrPicFlag() {
        return nIdrPicFlag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean bottom_field_flag() {
        return nbottom_field_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean is_reference() {
        return nis_reference(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean complementary_field_pair() {
        return ncomplementary_field_pair(address()) != 0;
    }

    public StdVideoDecodeH264PictureInfoFlags field_pic_flag(@NativeType("uint32_t") boolean value) {
        nfield_pic_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH264PictureInfoFlags is_intra(@NativeType("uint32_t") boolean value) {
        nis_intra(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH264PictureInfoFlags IdrPicFlag(@NativeType("uint32_t") boolean value) {
        nIdrPicFlag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH264PictureInfoFlags bottom_field_flag(@NativeType("uint32_t") boolean value) {
        nbottom_field_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH264PictureInfoFlags is_reference(@NativeType("uint32_t") boolean value) {
        nis_reference(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH264PictureInfoFlags complementary_field_pair(@NativeType("uint32_t") boolean value) {
        ncomplementary_field_pair(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeH264PictureInfoFlags set(boolean field_pic_flag, boolean is_intra, boolean IdrPicFlag, boolean bottom_field_flag, boolean is_reference, boolean complementary_field_pair) {
        field_pic_flag(field_pic_flag);
        is_intra(is_intra);
        IdrPicFlag(IdrPicFlag);
        bottom_field_flag(bottom_field_flag);
        is_reference(is_reference);
        complementary_field_pair(complementary_field_pair);
        return this;
    }

    public StdVideoDecodeH264PictureInfoFlags set(StdVideoDecodeH264PictureInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeH264PictureInfoFlags malloc() {
        return new StdVideoDecodeH264PictureInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeH264PictureInfoFlags calloc() {
        return new StdVideoDecodeH264PictureInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeH264PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeH264PictureInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeH264PictureInfoFlags create(long address) {
        return new StdVideoDecodeH264PictureInfoFlags(address, null);
    }

    public static StdVideoDecodeH264PictureInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeH264PictureInfoFlags(address, null);
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

    public static StdVideoDecodeH264PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoDecodeH264PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeH264PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoDecodeH264PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nfield_pic_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nis_intra(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nIdrPicFlag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nbottom_field_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nis_reference(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int ncomplementary_field_pair(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nfield_pic_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nis_intra(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nIdrPicFlag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nbottom_field_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nis_reference(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void ncomplementary_field_pair(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264PictureInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoDecodeH264PictureInfoFlags ELEMENT_FACTORY = StdVideoDecodeH264PictureInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeH264PictureInfoFlags.SIZEOF);
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
        public StdVideoDecodeH264PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean field_pic_flag() {
            return StdVideoDecodeH264PictureInfoFlags.nfield_pic_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean is_intra() {
            return StdVideoDecodeH264PictureInfoFlags.nis_intra(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean IdrPicFlag() {
            return StdVideoDecodeH264PictureInfoFlags.nIdrPicFlag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean bottom_field_flag() {
            return StdVideoDecodeH264PictureInfoFlags.nbottom_field_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean is_reference() {
            return StdVideoDecodeH264PictureInfoFlags.nis_reference(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean complementary_field_pair() {
            return StdVideoDecodeH264PictureInfoFlags.ncomplementary_field_pair(address()) != 0;
        }

        public Buffer field_pic_flag(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH264PictureInfoFlags.nfield_pic_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer is_intra(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH264PictureInfoFlags.nis_intra(address(), value ? 1 : 0);
            return this;
        }

        public Buffer IdrPicFlag(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH264PictureInfoFlags.nIdrPicFlag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bottom_field_flag(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH264PictureInfoFlags.nbottom_field_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer is_reference(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH264PictureInfoFlags.nis_reference(address(), value ? 1 : 0);
            return this;
        }

        public Buffer complementary_field_pair(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeH264PictureInfoFlags.ncomplementary_field_pair(address(), value ? 1 : 0);
            return this;
        }
    }
}
