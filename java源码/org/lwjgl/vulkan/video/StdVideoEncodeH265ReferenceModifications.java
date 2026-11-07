package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceModifications.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceModifications.class */
public class StdVideoEncodeH265ReferenceModifications extends Struct<StdVideoEncodeH265ReferenceModifications> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int NUM_REF_IDX_L0_ACTIVE_MINUS1;
    public static final int NUM_REF_IDX_L1_ACTIVE_MINUS1;
    public static final int RESERVED1;
    public static final int REFPICLIST0;
    public static final int REFPICLIST1;
    public static final int LIST_ENTRY_L0;
    public static final int LIST_ENTRY_L1;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH265ReferenceModificationFlags.SIZEOF, StdVideoEncodeH265ReferenceModificationFlags.ALIGNOF), __member(1), __member(1), __member(2), __array(1, 15), __array(1, 15), __array(1, 15), __array(1, 15));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        NUM_REF_IDX_L0_ACTIVE_MINUS1 = layout.offsetof(1);
        NUM_REF_IDX_L1_ACTIVE_MINUS1 = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        REFPICLIST0 = layout.offsetof(4);
        REFPICLIST1 = layout.offsetof(5);
        LIST_ENTRY_L0 = layout.offsetof(6);
        LIST_ENTRY_L1 = layout.offsetof(7);
    }

    protected StdVideoEncodeH265ReferenceModifications(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265ReferenceModifications create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265ReferenceModifications(address, container);
    }

    public StdVideoEncodeH265ReferenceModifications(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH265ReferenceModificationFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte num_ref_idx_l0_active_minus1() {
        return nnum_ref_idx_l0_active_minus1(address());
    }

    @NativeType("uint8_t")
    public byte num_ref_idx_l1_active_minus1() {
        return nnum_ref_idx_l1_active_minus1(address());
    }

    @NativeType("uint16_t")
    public short reserved1() {
        return nreserved1(address());
    }

    @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer RefPicList0() {
        return nRefPicList0(address());
    }

    @NativeType("uint8_t")
    public byte RefPicList0(int index) {
        return nRefPicList0(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer RefPicList1() {
        return nRefPicList1(address());
    }

    @NativeType("uint8_t")
    public byte RefPicList1(int index) {
        return nRefPicList1(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer list_entry_l0() {
        return nlist_entry_l0(address());
    }

    @NativeType("uint8_t")
    public byte list_entry_l0(int index) {
        return nlist_entry_l0(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer list_entry_l1() {
        return nlist_entry_l1(address());
    }

    @NativeType("uint8_t")
    public byte list_entry_l1(int index) {
        return nlist_entry_l1(address(), index);
    }

    public StdVideoEncodeH265ReferenceModifications flags(StdVideoEncodeH265ReferenceModificationFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications flags(Consumer<StdVideoEncodeH265ReferenceModificationFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) {
        nnum_ref_idx_l0_active_minus1(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) {
        nnum_ref_idx_l1_active_minus1(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications reserved1(@NativeType("uint16_t") short value) {
        nreserved1(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications RefPicList0(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nRefPicList0(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications RefPicList0(int index, @NativeType("uint8_t") byte value) {
        nRefPicList0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications RefPicList1(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nRefPicList1(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications RefPicList1(int index, @NativeType("uint8_t") byte value) {
        nRefPicList1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications list_entry_l0(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nlist_entry_l0(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications list_entry_l0(int index, @NativeType("uint8_t") byte value) {
        nlist_entry_l0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications list_entry_l1(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nlist_entry_l1(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications list_entry_l1(int index, @NativeType("uint8_t") byte value) {
        nlist_entry_l1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications set(StdVideoEncodeH265ReferenceModificationFlags flags, byte num_ref_idx_l0_active_minus1, byte num_ref_idx_l1_active_minus1, short reserved1, ByteBuffer RefPicList0, ByteBuffer RefPicList1, ByteBuffer list_entry_l0, ByteBuffer list_entry_l1) {
        flags(flags);
        num_ref_idx_l0_active_minus1(num_ref_idx_l0_active_minus1);
        num_ref_idx_l1_active_minus1(num_ref_idx_l1_active_minus1);
        reserved1(reserved1);
        RefPicList0(RefPicList0);
        RefPicList1(RefPicList1);
        list_entry_l0(list_entry_l0);
        list_entry_l1(list_entry_l1);
        return this;
    }

    public StdVideoEncodeH265ReferenceModifications set(StdVideoEncodeH265ReferenceModifications src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265ReferenceModifications malloc() {
        return new StdVideoEncodeH265ReferenceModifications(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceModifications calloc() {
        return new StdVideoEncodeH265ReferenceModifications(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceModifications create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265ReferenceModifications(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265ReferenceModifications create(long address) {
        return new StdVideoEncodeH265ReferenceModifications(address, null);
    }

    public static StdVideoEncodeH265ReferenceModifications createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265ReferenceModifications(address, null);
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

    public static StdVideoEncodeH265ReferenceModifications malloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModifications(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceModifications calloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModifications(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH265ReferenceModificationFlags nflags(long struct) {
        return StdVideoEncodeH265ReferenceModificationFlags.create(struct + FLAGS);
    }

    public static byte nnum_ref_idx_l0_active_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_REF_IDX_L0_ACTIVE_MINUS1);
    }

    public static byte nnum_ref_idx_l1_active_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_REF_IDX_L1_ACTIVE_MINUS1);
    }

    public static short nreserved1(long struct) {
        return MemoryUtil.memGetShort(struct + RESERVED1);
    }

    public static ByteBuffer nRefPicList0(long struct) {
        return MemoryUtil.memByteBuffer(struct + REFPICLIST0, 15);
    }

    public static byte nRefPicList0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + REFPICLIST0 + (Checks.check(index, 15) * 1));
    }

    public static ByteBuffer nRefPicList1(long struct) {
        return MemoryUtil.memByteBuffer(struct + REFPICLIST1, 15);
    }

    public static byte nRefPicList1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + REFPICLIST1 + (Checks.check(index, 15) * 1));
    }

    public static ByteBuffer nlist_entry_l0(long struct) {
        return MemoryUtil.memByteBuffer(struct + LIST_ENTRY_L0, 15);
    }

    public static byte nlist_entry_l0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LIST_ENTRY_L0 + (Checks.check(index, 15) * 1));
    }

    public static ByteBuffer nlist_entry_l1(long struct) {
        return MemoryUtil.memByteBuffer(struct + LIST_ENTRY_L1, 15);
    }

    public static byte nlist_entry_l1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LIST_ENTRY_L1 + (Checks.check(index, 15) * 1));
    }

    public static void nflags(long struct, StdVideoEncodeH265ReferenceModificationFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH265ReferenceModificationFlags.SIZEOF);
    }

    public static void nnum_ref_idx_l0_active_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_REF_IDX_L0_ACTIVE_MINUS1, value);
    }

    public static void nnum_ref_idx_l1_active_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_REF_IDX_L1_ACTIVE_MINUS1, value);
    }

    public static void nreserved1(long struct, short value) {
        MemoryUtil.memPutShort(struct + RESERVED1, value);
    }

    public static void nRefPicList0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 15);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REFPICLIST0, value.remaining() * 1);
    }

    public static void nRefPicList0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + REFPICLIST0 + (Checks.check(index, 15) * 1), value);
    }

    public static void nRefPicList1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 15);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REFPICLIST1, value.remaining() * 1);
    }

    public static void nRefPicList1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + REFPICLIST1 + (Checks.check(index, 15) * 1), value);
    }

    public static void nlist_entry_l0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 15);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LIST_ENTRY_L0, value.remaining() * 1);
    }

    public static void nlist_entry_l0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LIST_ENTRY_L0 + (Checks.check(index, 15) * 1), value);
    }

    public static void nlist_entry_l1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 15);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LIST_ENTRY_L1, value.remaining() * 1);
    }

    public static void nlist_entry_l1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LIST_ENTRY_L1 + (Checks.check(index, 15) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceModifications$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceModifications$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceModifications, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265ReferenceModifications ELEMENT_FACTORY = StdVideoEncodeH265ReferenceModifications.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265ReferenceModifications.SIZEOF);
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
        public StdVideoEncodeH265ReferenceModifications getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH265ReferenceModificationFlags flags() {
            return StdVideoEncodeH265ReferenceModifications.nflags(address());
        }

        @NativeType("uint8_t")
        public byte num_ref_idx_l0_active_minus1() {
            return StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l0_active_minus1(address());
        }

        @NativeType("uint8_t")
        public byte num_ref_idx_l1_active_minus1() {
            return StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l1_active_minus1(address());
        }

        @NativeType("uint16_t")
        public short reserved1() {
            return StdVideoEncodeH265ReferenceModifications.nreserved1(address());
        }

        @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer RefPicList0() {
            return StdVideoEncodeH265ReferenceModifications.nRefPicList0(address());
        }

        @NativeType("uint8_t")
        public byte RefPicList0(int index) {
            return StdVideoEncodeH265ReferenceModifications.nRefPicList0(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer RefPicList1() {
            return StdVideoEncodeH265ReferenceModifications.nRefPicList1(address());
        }

        @NativeType("uint8_t")
        public byte RefPicList1(int index) {
            return StdVideoEncodeH265ReferenceModifications.nRefPicList1(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer list_entry_l0() {
            return StdVideoEncodeH265ReferenceModifications.nlist_entry_l0(address());
        }

        @NativeType("uint8_t")
        public byte list_entry_l0(int index) {
            return StdVideoEncodeH265ReferenceModifications.nlist_entry_l0(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer list_entry_l1() {
            return StdVideoEncodeH265ReferenceModifications.nlist_entry_l1(address());
        }

        @NativeType("uint8_t")
        public byte list_entry_l1(int index) {
            return StdVideoEncodeH265ReferenceModifications.nlist_entry_l1(address(), index);
        }

        public Buffer flags(StdVideoEncodeH265ReferenceModificationFlags value) {
            StdVideoEncodeH265ReferenceModifications.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH265ReferenceModificationFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l0_active_minus1(address(), value);
            return this;
        }

        public Buffer num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l1_active_minus1(address(), value);
            return this;
        }

        public Buffer reserved1(@NativeType("uint16_t") short value) {
            StdVideoEncodeH265ReferenceModifications.nreserved1(address(), value);
            return this;
        }

        public Buffer RefPicList0(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH265ReferenceModifications.nRefPicList0(address(), value);
            return this;
        }

        public Buffer RefPicList0(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH265ReferenceModifications.nRefPicList0(address(), index, value);
            return this;
        }

        public Buffer RefPicList1(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH265ReferenceModifications.nRefPicList1(address(), value);
            return this;
        }

        public Buffer RefPicList1(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH265ReferenceModifications.nRefPicList1(address(), index, value);
            return this;
        }

        public Buffer list_entry_l0(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH265ReferenceModifications.nlist_entry_l0(address(), value);
            return this;
        }

        public Buffer list_entry_l0(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH265ReferenceModifications.nlist_entry_l0(address(), index, value);
            return this;
        }

        public Buffer list_entry_l1(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH265ReferenceModifications.nlist_entry_l1(address(), value);
            return this;
        }

        public Buffer list_entry_l1(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH265ReferenceModifications.nlist_entry_l1(address(), index, value);
            return this;
        }
    }
}
