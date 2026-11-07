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
import org.lwjgl.vulkan.video.StdVideoEncodeH264RefListModEntry;
import org.lwjgl.vulkan.video.StdVideoEncodeH264RefPicMarkingEntry;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceListsInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceListsInfo.class */
public class StdVideoEncodeH264ReferenceListsInfo extends Struct<StdVideoEncodeH264ReferenceListsInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int NUM_REF_IDX_L0_ACTIVE_MINUS1;
    public static final int NUM_REF_IDX_L1_ACTIVE_MINUS1;
    public static final int REFPICLIST0;
    public static final int REFPICLIST1;
    public static final int REFLIST0MODOPCOUNT;
    public static final int REFLIST1MODOPCOUNT;
    public static final int REFPICMARKINGOPCOUNT;
    public static final int RESERVED1;
    public static final int PREFLIST0MODOPERATIONS;
    public static final int PREFLIST1MODOPERATIONS;
    public static final int PREFPICMARKINGOPERATIONS;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH264ReferenceListsInfoFlags.SIZEOF, StdVideoEncodeH264ReferenceListsInfoFlags.ALIGNOF), __member(1), __member(1), __array(1, 32), __array(1, 32), __member(1), __member(1), __member(1), __array(1, 7), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        NUM_REF_IDX_L0_ACTIVE_MINUS1 = layout.offsetof(1);
        NUM_REF_IDX_L1_ACTIVE_MINUS1 = layout.offsetof(2);
        REFPICLIST0 = layout.offsetof(3);
        REFPICLIST1 = layout.offsetof(4);
        REFLIST0MODOPCOUNT = layout.offsetof(5);
        REFLIST1MODOPCOUNT = layout.offsetof(6);
        REFPICMARKINGOPCOUNT = layout.offsetof(7);
        RESERVED1 = layout.offsetof(8);
        PREFLIST0MODOPERATIONS = layout.offsetof(9);
        PREFLIST1MODOPERATIONS = layout.offsetof(10);
        PREFPICMARKINGOPERATIONS = layout.offsetof(11);
    }

    protected StdVideoEncodeH264ReferenceListsInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264ReferenceListsInfo create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264ReferenceListsInfo(address, container);
    }

    public StdVideoEncodeH264ReferenceListsInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH264ReferenceListsInfoFlags flags() {
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

    @NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer RefPicList0() {
        return nRefPicList0(address());
    }

    @NativeType("uint8_t")
    public byte RefPicList0(int index) {
        return nRefPicList0(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer RefPicList1() {
        return nRefPicList1(address());
    }

    @NativeType("uint8_t")
    public byte RefPicList1(int index) {
        return nRefPicList1(address(), index);
    }

    @NativeType("uint8_t")
    public byte refList0ModOpCount() {
        return nrefList0ModOpCount(address());
    }

    @NativeType("uint8_t")
    public byte refList1ModOpCount() {
        return nrefList1ModOpCount(address());
    }

    @NativeType("uint8_t")
    public byte refPicMarkingOpCount() {
        return nrefPicMarkingOpCount(address());
    }

    @NativeType("StdVideoEncodeH264RefListModEntry const *")
    public StdVideoEncodeH264RefListModEntry.Buffer pRefList0ModOperations() {
        return npRefList0ModOperations(address());
    }

    @NativeType("StdVideoEncodeH264RefListModEntry const *")
    public StdVideoEncodeH264RefListModEntry.Buffer pRefList1ModOperations() {
        return npRefList1ModOperations(address());
    }

    @NativeType("StdVideoEncodeH264RefPicMarkingEntry const *")
    public StdVideoEncodeH264RefPicMarkingEntry.Buffer pRefPicMarkingOperations() {
        return npRefPicMarkingOperations(address());
    }

    public StdVideoEncodeH264ReferenceListsInfo flags(StdVideoEncodeH264ReferenceListsInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo flags(Consumer<StdVideoEncodeH264ReferenceListsInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) {
        nnum_ref_idx_l0_active_minus1(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) {
        nnum_ref_idx_l1_active_minus1(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo RefPicList0(@NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nRefPicList0(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo RefPicList0(int index, @NativeType("uint8_t") byte value) {
        nRefPicList0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo RefPicList1(@NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nRefPicList1(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo RefPicList1(int index, @NativeType("uint8_t") byte value) {
        nRefPicList1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo refList0ModOpCount(@NativeType("uint8_t") byte value) {
        nrefList0ModOpCount(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo refList1ModOpCount(@NativeType("uint8_t") byte value) {
        nrefList1ModOpCount(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo pRefList0ModOperations(@NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) {
        npRefList0ModOperations(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo pRefList1ModOperations(@NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) {
        npRefList1ModOperations(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo pRefPicMarkingOperations(@NativeType("StdVideoEncodeH264RefPicMarkingEntry const *") StdVideoEncodeH264RefPicMarkingEntry.Buffer value) {
        npRefPicMarkingOperations(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo set(StdVideoEncodeH264ReferenceListsInfoFlags flags, byte num_ref_idx_l0_active_minus1, byte num_ref_idx_l1_active_minus1, ByteBuffer RefPicList0, ByteBuffer RefPicList1, byte refList0ModOpCount, byte refList1ModOpCount, StdVideoEncodeH264RefListModEntry.Buffer pRefList0ModOperations, StdVideoEncodeH264RefListModEntry.Buffer pRefList1ModOperations, StdVideoEncodeH264RefPicMarkingEntry.Buffer pRefPicMarkingOperations) {
        flags(flags);
        num_ref_idx_l0_active_minus1(num_ref_idx_l0_active_minus1);
        num_ref_idx_l1_active_minus1(num_ref_idx_l1_active_minus1);
        RefPicList0(RefPicList0);
        RefPicList1(RefPicList1);
        refList0ModOpCount(refList0ModOpCount);
        refList1ModOpCount(refList1ModOpCount);
        pRefList0ModOperations(pRefList0ModOperations);
        pRefList1ModOperations(pRefList1ModOperations);
        pRefPicMarkingOperations(pRefPicMarkingOperations);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfo set(StdVideoEncodeH264ReferenceListsInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264ReferenceListsInfo malloc() {
        return new StdVideoEncodeH264ReferenceListsInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264ReferenceListsInfo calloc() {
        return new StdVideoEncodeH264ReferenceListsInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264ReferenceListsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264ReferenceListsInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264ReferenceListsInfo create(long address) {
        return new StdVideoEncodeH264ReferenceListsInfo(address, null);
    }

    public static StdVideoEncodeH264ReferenceListsInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264ReferenceListsInfo(address, null);
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

    public static StdVideoEncodeH264ReferenceListsInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceListsInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264ReferenceListsInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceListsInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags nflags(long struct) {
        return StdVideoEncodeH264ReferenceListsInfoFlags.create(struct + FLAGS);
    }

    public static byte nnum_ref_idx_l0_active_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_REF_IDX_L0_ACTIVE_MINUS1);
    }

    public static byte nnum_ref_idx_l1_active_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_REF_IDX_L1_ACTIVE_MINUS1);
    }

    public static ByteBuffer nRefPicList0(long struct) {
        return MemoryUtil.memByteBuffer(struct + REFPICLIST0, 32);
    }

    public static byte nRefPicList0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + REFPICLIST0 + (Checks.check(index, 32) * 1));
    }

    public static ByteBuffer nRefPicList1(long struct) {
        return MemoryUtil.memByteBuffer(struct + REFPICLIST1, 32);
    }

    public static byte nRefPicList1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + REFPICLIST1 + (Checks.check(index, 32) * 1));
    }

    public static byte nrefList0ModOpCount(long struct) {
        return MemoryUtil.memGetByte(struct + REFLIST0MODOPCOUNT);
    }

    public static byte nrefList1ModOpCount(long struct) {
        return MemoryUtil.memGetByte(struct + REFLIST1MODOPCOUNT);
    }

    public static byte nrefPicMarkingOpCount(long struct) {
        return MemoryUtil.memGetByte(struct + REFPICMARKINGOPCOUNT);
    }

    public static ByteBuffer nreserved1(long struct) {
        return MemoryUtil.memByteBuffer(struct + RESERVED1, 7);
    }

    public static byte nreserved1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + RESERVED1 + (Checks.check(index, 7) * 1));
    }

    public static StdVideoEncodeH264RefListModEntry.Buffer npRefList0ModOperations(long struct) {
        return StdVideoEncodeH264RefListModEntry.createSafe(MemoryUtil.memGetAddress(struct + PREFLIST0MODOPERATIONS), Byte.toUnsignedInt(nrefList0ModOpCount(struct)));
    }

    public static StdVideoEncodeH264RefListModEntry.Buffer npRefList1ModOperations(long struct) {
        return StdVideoEncodeH264RefListModEntry.createSafe(MemoryUtil.memGetAddress(struct + PREFLIST1MODOPERATIONS), Byte.toUnsignedInt(nrefList1ModOpCount(struct)));
    }

    public static StdVideoEncodeH264RefPicMarkingEntry.Buffer npRefPicMarkingOperations(long struct) {
        return StdVideoEncodeH264RefPicMarkingEntry.create(MemoryUtil.memGetAddress(struct + PREFPICMARKINGOPERATIONS), Byte.toUnsignedInt(nrefPicMarkingOpCount(struct)));
    }

    public static void nflags(long struct, StdVideoEncodeH264ReferenceListsInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH264ReferenceListsInfoFlags.SIZEOF);
    }

    public static void nnum_ref_idx_l0_active_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_REF_IDX_L0_ACTIVE_MINUS1, value);
    }

    public static void nnum_ref_idx_l1_active_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_REF_IDX_L1_ACTIVE_MINUS1, value);
    }

    public static void nRefPicList0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REFPICLIST0, value.remaining() * 1);
    }

    public static void nRefPicList0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + REFPICLIST0 + (Checks.check(index, 32) * 1), value);
    }

    public static void nRefPicList1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REFPICLIST1, value.remaining() * 1);
    }

    public static void nRefPicList1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + REFPICLIST1 + (Checks.check(index, 32) * 1), value);
    }

    public static void nrefList0ModOpCount(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REFLIST0MODOPCOUNT, value);
    }

    public static void nrefList1ModOpCount(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REFLIST1MODOPCOUNT, value);
    }

    public static void nrefPicMarkingOpCount(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REFPICMARKINGOPCOUNT, value);
    }

    public static void nreserved1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESERVED1, value.remaining() * 1);
    }

    public static void nreserved1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1 + (Checks.check(index, 7) * 1), value);
    }

    public static void npRefList0ModOperations(long struct, StdVideoEncodeH264RefListModEntry.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREFLIST0MODOPERATIONS, MemoryUtil.memAddressSafe(value));
        nrefList0ModOpCount(struct, value == null ? (byte) 0 : (byte) value.remaining());
    }

    public static void npRefList1ModOperations(long struct, StdVideoEncodeH264RefListModEntry.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREFLIST1MODOPERATIONS, MemoryUtil.memAddressSafe(value));
        nrefList1ModOpCount(struct, value == null ? (byte) 0 : (byte) value.remaining());
    }

    public static void npRefPicMarkingOperations(long struct, StdVideoEncodeH264RefPicMarkingEntry.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREFPICMARKINGOPERATIONS, value.address());
        nrefPicMarkingOpCount(struct, (byte) value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PREFPICMARKINGOPERATIONS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceListsInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceListsInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264ReferenceListsInfo, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264ReferenceListsInfo ELEMENT_FACTORY = StdVideoEncodeH264ReferenceListsInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264ReferenceListsInfo.SIZEOF);
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
        public StdVideoEncodeH264ReferenceListsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH264ReferenceListsInfoFlags flags() {
            return StdVideoEncodeH264ReferenceListsInfo.nflags(address());
        }

        @NativeType("uint8_t")
        public byte num_ref_idx_l0_active_minus1() {
            return StdVideoEncodeH264ReferenceListsInfo.nnum_ref_idx_l0_active_minus1(address());
        }

        @NativeType("uint8_t")
        public byte num_ref_idx_l1_active_minus1() {
            return StdVideoEncodeH264ReferenceListsInfo.nnum_ref_idx_l1_active_minus1(address());
        }

        @NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer RefPicList0() {
            return StdVideoEncodeH264ReferenceListsInfo.nRefPicList0(address());
        }

        @NativeType("uint8_t")
        public byte RefPicList0(int index) {
            return StdVideoEncodeH264ReferenceListsInfo.nRefPicList0(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer RefPicList1() {
            return StdVideoEncodeH264ReferenceListsInfo.nRefPicList1(address());
        }

        @NativeType("uint8_t")
        public byte RefPicList1(int index) {
            return StdVideoEncodeH264ReferenceListsInfo.nRefPicList1(address(), index);
        }

        @NativeType("uint8_t")
        public byte refList0ModOpCount() {
            return StdVideoEncodeH264ReferenceListsInfo.nrefList0ModOpCount(address());
        }

        @NativeType("uint8_t")
        public byte refList1ModOpCount() {
            return StdVideoEncodeH264ReferenceListsInfo.nrefList1ModOpCount(address());
        }

        @NativeType("uint8_t")
        public byte refPicMarkingOpCount() {
            return StdVideoEncodeH264ReferenceListsInfo.nrefPicMarkingOpCount(address());
        }

        @NativeType("StdVideoEncodeH264RefListModEntry const *")
        public StdVideoEncodeH264RefListModEntry.Buffer pRefList0ModOperations() {
            return StdVideoEncodeH264ReferenceListsInfo.npRefList0ModOperations(address());
        }

        @NativeType("StdVideoEncodeH264RefListModEntry const *")
        public StdVideoEncodeH264RefListModEntry.Buffer pRefList1ModOperations() {
            return StdVideoEncodeH264ReferenceListsInfo.npRefList1ModOperations(address());
        }

        @NativeType("StdVideoEncodeH264RefPicMarkingEntry const *")
        public StdVideoEncodeH264RefPicMarkingEntry.Buffer pRefPicMarkingOperations() {
            return StdVideoEncodeH264ReferenceListsInfo.npRefPicMarkingOperations(address());
        }

        public Buffer flags(StdVideoEncodeH264ReferenceListsInfoFlags value) {
            StdVideoEncodeH264ReferenceListsInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH264ReferenceListsInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264ReferenceListsInfo.nnum_ref_idx_l0_active_minus1(address(), value);
            return this;
        }

        public Buffer num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264ReferenceListsInfo.nnum_ref_idx_l1_active_minus1(address(), value);
            return this;
        }

        public Buffer RefPicList0(@NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH264ReferenceListsInfo.nRefPicList0(address(), value);
            return this;
        }

        public Buffer RefPicList0(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH264ReferenceListsInfo.nRefPicList0(address(), index, value);
            return this;
        }

        public Buffer RefPicList1(@NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH264ReferenceListsInfo.nRefPicList1(address(), value);
            return this;
        }

        public Buffer RefPicList1(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH264ReferenceListsInfo.nRefPicList1(address(), index, value);
            return this;
        }

        public Buffer refList0ModOpCount(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264ReferenceListsInfo.nrefList0ModOpCount(address(), value);
            return this;
        }

        public Buffer refList1ModOpCount(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264ReferenceListsInfo.nrefList1ModOpCount(address(), value);
            return this;
        }

        public Buffer pRefList0ModOperations(@NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) {
            StdVideoEncodeH264ReferenceListsInfo.npRefList0ModOperations(address(), value);
            return this;
        }

        public Buffer pRefList1ModOperations(@NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) {
            StdVideoEncodeH264ReferenceListsInfo.npRefList1ModOperations(address(), value);
            return this;
        }

        public Buffer pRefPicMarkingOperations(@NativeType("StdVideoEncodeH264RefPicMarkingEntry const *") StdVideoEncodeH264RefPicMarkingEntry.Buffer value) {
            StdVideoEncodeH264ReferenceListsInfo.npRefPicMarkingOperations(address(), value);
            return this;
        }
    }
}
