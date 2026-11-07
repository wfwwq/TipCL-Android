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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264RefPicMarkingEntry.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264RefPicMarkingEntry.class */
public class StdVideoEncodeH264RefPicMarkingEntry extends Struct<StdVideoEncodeH264RefPicMarkingEntry> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MEMORY_MANAGEMENT_CONTROL_OPERATION;
    public static final int DIFFERENCE_OF_PIC_NUMS_MINUS1;
    public static final int LONG_TERM_PIC_NUM;
    public static final int LONG_TERM_FRAME_IDX;
    public static final int MAX_LONG_TERM_FRAME_IDX_PLUS1;

    static {
        Struct.Layout layout = __struct(__member(4), __member(2), __member(2), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MEMORY_MANAGEMENT_CONTROL_OPERATION = layout.offsetof(0);
        DIFFERENCE_OF_PIC_NUMS_MINUS1 = layout.offsetof(1);
        LONG_TERM_PIC_NUM = layout.offsetof(2);
        LONG_TERM_FRAME_IDX = layout.offsetof(3);
        MAX_LONG_TERM_FRAME_IDX_PLUS1 = layout.offsetof(4);
    }

    protected StdVideoEncodeH264RefPicMarkingEntry(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264RefPicMarkingEntry create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264RefPicMarkingEntry(address, container);
    }

    public StdVideoEncodeH264RefPicMarkingEntry(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("StdVideoH264MemMgmtControlOp")
    public int memory_management_control_operation() {
        return nmemory_management_control_operation(address());
    }

    @NativeType("uint16_t")
    public short difference_of_pic_nums_minus1() {
        return ndifference_of_pic_nums_minus1(address());
    }

    @NativeType("uint16_t")
    public short long_term_pic_num() {
        return nlong_term_pic_num(address());
    }

    @NativeType("uint16_t")
    public short long_term_frame_idx() {
        return nlong_term_frame_idx(address());
    }

    @NativeType("uint16_t")
    public short max_long_term_frame_idx_plus1() {
        return nmax_long_term_frame_idx_plus1(address());
    }

    public StdVideoEncodeH264RefPicMarkingEntry memory_management_control_operation(@NativeType("StdVideoH264MemMgmtControlOp") int value) {
        nmemory_management_control_operation(address(), value);
        return this;
    }

    public StdVideoEncodeH264RefPicMarkingEntry difference_of_pic_nums_minus1(@NativeType("uint16_t") short value) {
        ndifference_of_pic_nums_minus1(address(), value);
        return this;
    }

    public StdVideoEncodeH264RefPicMarkingEntry long_term_pic_num(@NativeType("uint16_t") short value) {
        nlong_term_pic_num(address(), value);
        return this;
    }

    public StdVideoEncodeH264RefPicMarkingEntry long_term_frame_idx(@NativeType("uint16_t") short value) {
        nlong_term_frame_idx(address(), value);
        return this;
    }

    public StdVideoEncodeH264RefPicMarkingEntry max_long_term_frame_idx_plus1(@NativeType("uint16_t") short value) {
        nmax_long_term_frame_idx_plus1(address(), value);
        return this;
    }

    public StdVideoEncodeH264RefPicMarkingEntry set(int memory_management_control_operation, short difference_of_pic_nums_minus1, short long_term_pic_num, short long_term_frame_idx, short max_long_term_frame_idx_plus1) {
        memory_management_control_operation(memory_management_control_operation);
        difference_of_pic_nums_minus1(difference_of_pic_nums_minus1);
        long_term_pic_num(long_term_pic_num);
        long_term_frame_idx(long_term_frame_idx);
        max_long_term_frame_idx_plus1(max_long_term_frame_idx_plus1);
        return this;
    }

    public StdVideoEncodeH264RefPicMarkingEntry set(StdVideoEncodeH264RefPicMarkingEntry src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264RefPicMarkingEntry malloc() {
        return new StdVideoEncodeH264RefPicMarkingEntry(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264RefPicMarkingEntry calloc() {
        return new StdVideoEncodeH264RefPicMarkingEntry(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264RefPicMarkingEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264RefPicMarkingEntry(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264RefPicMarkingEntry create(long address) {
        return new StdVideoEncodeH264RefPicMarkingEntry(address, null);
    }

    public static StdVideoEncodeH264RefPicMarkingEntry createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264RefPicMarkingEntry(address, null);
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

    public static StdVideoEncodeH264RefPicMarkingEntry malloc(MemoryStack stack) {
        return new StdVideoEncodeH264RefPicMarkingEntry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264RefPicMarkingEntry calloc(MemoryStack stack) {
        return new StdVideoEncodeH264RefPicMarkingEntry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmemory_management_control_operation(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORY_MANAGEMENT_CONTROL_OPERATION);
    }

    public static short ndifference_of_pic_nums_minus1(long struct) {
        return MemoryUtil.memGetShort(struct + DIFFERENCE_OF_PIC_NUMS_MINUS1);
    }

    public static short nlong_term_pic_num(long struct) {
        return MemoryUtil.memGetShort(struct + LONG_TERM_PIC_NUM);
    }

    public static short nlong_term_frame_idx(long struct) {
        return MemoryUtil.memGetShort(struct + LONG_TERM_FRAME_IDX);
    }

    public static short nmax_long_term_frame_idx_plus1(long struct) {
        return MemoryUtil.memGetShort(struct + MAX_LONG_TERM_FRAME_IDX_PLUS1);
    }

    public static void nmemory_management_control_operation(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORY_MANAGEMENT_CONTROL_OPERATION, value);
    }

    public static void ndifference_of_pic_nums_minus1(long struct, short value) {
        MemoryUtil.memPutShort(struct + DIFFERENCE_OF_PIC_NUMS_MINUS1, value);
    }

    public static void nlong_term_pic_num(long struct, short value) {
        MemoryUtil.memPutShort(struct + LONG_TERM_PIC_NUM, value);
    }

    public static void nlong_term_frame_idx(long struct, short value) {
        MemoryUtil.memPutShort(struct + LONG_TERM_FRAME_IDX, value);
    }

    public static void nmax_long_term_frame_idx_plus1(long struct, short value) {
        MemoryUtil.memPutShort(struct + MAX_LONG_TERM_FRAME_IDX_PLUS1, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264RefPicMarkingEntry$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264RefPicMarkingEntry$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264RefPicMarkingEntry, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264RefPicMarkingEntry ELEMENT_FACTORY = StdVideoEncodeH264RefPicMarkingEntry.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264RefPicMarkingEntry.SIZEOF);
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
        public StdVideoEncodeH264RefPicMarkingEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("StdVideoH264MemMgmtControlOp")
        public int memory_management_control_operation() {
            return StdVideoEncodeH264RefPicMarkingEntry.nmemory_management_control_operation(address());
        }

        @NativeType("uint16_t")
        public short difference_of_pic_nums_minus1() {
            return StdVideoEncodeH264RefPicMarkingEntry.ndifference_of_pic_nums_minus1(address());
        }

        @NativeType("uint16_t")
        public short long_term_pic_num() {
            return StdVideoEncodeH264RefPicMarkingEntry.nlong_term_pic_num(address());
        }

        @NativeType("uint16_t")
        public short long_term_frame_idx() {
            return StdVideoEncodeH264RefPicMarkingEntry.nlong_term_frame_idx(address());
        }

        @NativeType("uint16_t")
        public short max_long_term_frame_idx_plus1() {
            return StdVideoEncodeH264RefPicMarkingEntry.nmax_long_term_frame_idx_plus1(address());
        }

        public Buffer memory_management_control_operation(@NativeType("StdVideoH264MemMgmtControlOp") int value) {
            StdVideoEncodeH264RefPicMarkingEntry.nmemory_management_control_operation(address(), value);
            return this;
        }

        public Buffer difference_of_pic_nums_minus1(@NativeType("uint16_t") short value) {
            StdVideoEncodeH264RefPicMarkingEntry.ndifference_of_pic_nums_minus1(address(), value);
            return this;
        }

        public Buffer long_term_pic_num(@NativeType("uint16_t") short value) {
            StdVideoEncodeH264RefPicMarkingEntry.nlong_term_pic_num(address(), value);
            return this;
        }

        public Buffer long_term_frame_idx(@NativeType("uint16_t") short value) {
            StdVideoEncodeH264RefPicMarkingEntry.nlong_term_frame_idx(address(), value);
            return this;
        }

        public Buffer max_long_term_frame_idx_plus1(@NativeType("uint16_t") short value) {
            StdVideoEncodeH264RefPicMarkingEntry.nmax_long_term_frame_idx_plus1(address(), value);
            return this;
        }
    }
}
