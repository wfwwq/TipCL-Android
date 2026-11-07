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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264RefListModEntry.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264RefListModEntry.class */
public class StdVideoEncodeH264RefListModEntry extends Struct<StdVideoEncodeH264RefListModEntry> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MODIFICATION_OF_PIC_NUMS_IDC;
    public static final int ABS_DIFF_PIC_NUM_MINUS1;
    public static final int LONG_TERM_PIC_NUM;

    static {
        Struct.Layout layout = __struct(__member(4), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MODIFICATION_OF_PIC_NUMS_IDC = layout.offsetof(0);
        ABS_DIFF_PIC_NUM_MINUS1 = layout.offsetof(1);
        LONG_TERM_PIC_NUM = layout.offsetof(2);
    }

    protected StdVideoEncodeH264RefListModEntry(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264RefListModEntry create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264RefListModEntry(address, container);
    }

    public StdVideoEncodeH264RefListModEntry(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("StdVideoH264ModificationOfPicNumsIdc")
    public int modification_of_pic_nums_idc() {
        return nmodification_of_pic_nums_idc(address());
    }

    @NativeType("uint16_t")
    public short abs_diff_pic_num_minus1() {
        return nabs_diff_pic_num_minus1(address());
    }

    @NativeType("uint16_t")
    public short long_term_pic_num() {
        return nlong_term_pic_num(address());
    }

    public StdVideoEncodeH264RefListModEntry modification_of_pic_nums_idc(@NativeType("StdVideoH264ModificationOfPicNumsIdc") int value) {
        nmodification_of_pic_nums_idc(address(), value);
        return this;
    }

    public StdVideoEncodeH264RefListModEntry abs_diff_pic_num_minus1(@NativeType("uint16_t") short value) {
        nabs_diff_pic_num_minus1(address(), value);
        return this;
    }

    public StdVideoEncodeH264RefListModEntry long_term_pic_num(@NativeType("uint16_t") short value) {
        nlong_term_pic_num(address(), value);
        return this;
    }

    public StdVideoEncodeH264RefListModEntry set(int modification_of_pic_nums_idc, short abs_diff_pic_num_minus1, short long_term_pic_num) {
        modification_of_pic_nums_idc(modification_of_pic_nums_idc);
        abs_diff_pic_num_minus1(abs_diff_pic_num_minus1);
        long_term_pic_num(long_term_pic_num);
        return this;
    }

    public StdVideoEncodeH264RefListModEntry set(StdVideoEncodeH264RefListModEntry src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264RefListModEntry malloc() {
        return new StdVideoEncodeH264RefListModEntry(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264RefListModEntry calloc() {
        return new StdVideoEncodeH264RefListModEntry(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264RefListModEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264RefListModEntry(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264RefListModEntry create(long address) {
        return new StdVideoEncodeH264RefListModEntry(address, null);
    }

    public static StdVideoEncodeH264RefListModEntry createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264RefListModEntry(address, null);
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

    public static StdVideoEncodeH264RefListModEntry malloc(MemoryStack stack) {
        return new StdVideoEncodeH264RefListModEntry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264RefListModEntry calloc(MemoryStack stack) {
        return new StdVideoEncodeH264RefListModEntry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmodification_of_pic_nums_idc(long struct) {
        return MemoryUtil.memGetInt(struct + MODIFICATION_OF_PIC_NUMS_IDC);
    }

    public static short nabs_diff_pic_num_minus1(long struct) {
        return MemoryUtil.memGetShort(struct + ABS_DIFF_PIC_NUM_MINUS1);
    }

    public static short nlong_term_pic_num(long struct) {
        return MemoryUtil.memGetShort(struct + LONG_TERM_PIC_NUM);
    }

    public static void nmodification_of_pic_nums_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODIFICATION_OF_PIC_NUMS_IDC, value);
    }

    public static void nabs_diff_pic_num_minus1(long struct, short value) {
        MemoryUtil.memPutShort(struct + ABS_DIFF_PIC_NUM_MINUS1, value);
    }

    public static void nlong_term_pic_num(long struct, short value) {
        MemoryUtil.memPutShort(struct + LONG_TERM_PIC_NUM, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264RefListModEntry$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264RefListModEntry$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264RefListModEntry, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264RefListModEntry ELEMENT_FACTORY = StdVideoEncodeH264RefListModEntry.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264RefListModEntry.SIZEOF);
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
        public StdVideoEncodeH264RefListModEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("StdVideoH264ModificationOfPicNumsIdc")
        public int modification_of_pic_nums_idc() {
            return StdVideoEncodeH264RefListModEntry.nmodification_of_pic_nums_idc(address());
        }

        @NativeType("uint16_t")
        public short abs_diff_pic_num_minus1() {
            return StdVideoEncodeH264RefListModEntry.nabs_diff_pic_num_minus1(address());
        }

        @NativeType("uint16_t")
        public short long_term_pic_num() {
            return StdVideoEncodeH264RefListModEntry.nlong_term_pic_num(address());
        }

        public Buffer modification_of_pic_nums_idc(@NativeType("StdVideoH264ModificationOfPicNumsIdc") int value) {
            StdVideoEncodeH264RefListModEntry.nmodification_of_pic_nums_idc(address(), value);
            return this;
        }

        public Buffer abs_diff_pic_num_minus1(@NativeType("uint16_t") short value) {
            StdVideoEncodeH264RefListModEntry.nabs_diff_pic_num_minus1(address(), value);
            return this;
        }

        public Buffer long_term_pic_num(@NativeType("uint16_t") short value) {
            StdVideoEncodeH264RefListModEntry.nlong_term_pic_num(address(), value);
            return this;
        }
    }
}
