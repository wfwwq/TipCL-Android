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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet.class */
public class StdVideoH264PictureParameterSet extends Struct<StdVideoH264PictureParameterSet> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int SEQ_PARAMETER_SET_ID;
    public static final int PIC_PARAMETER_SET_ID;
    public static final int NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1;
    public static final int NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1;
    public static final int WEIGHTED_BIPRED_IDC;
    public static final int PIC_INIT_QP_MINUS26;
    public static final int PIC_INIT_QS_MINUS26;
    public static final int CHROMA_QP_INDEX_OFFSET;
    public static final int SECOND_CHROMA_QP_INDEX_OFFSET;
    public static final int PSCALINGLISTS;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH264PpsFlags.SIZEOF, StdVideoH264PpsFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(4), __member(1), __member(1), __member(1), __member(1), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        SEQ_PARAMETER_SET_ID = layout.offsetof(1);
        PIC_PARAMETER_SET_ID = layout.offsetof(2);
        NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1 = layout.offsetof(3);
        NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1 = layout.offsetof(4);
        WEIGHTED_BIPRED_IDC = layout.offsetof(5);
        PIC_INIT_QP_MINUS26 = layout.offsetof(6);
        PIC_INIT_QS_MINUS26 = layout.offsetof(7);
        CHROMA_QP_INDEX_OFFSET = layout.offsetof(8);
        SECOND_CHROMA_QP_INDEX_OFFSET = layout.offsetof(9);
        PSCALINGLISTS = layout.offsetof(10);
    }

    protected StdVideoH264PictureParameterSet(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH264PictureParameterSet create(long address, ByteBuffer container) {
        return new StdVideoH264PictureParameterSet(address, container);
    }

    public StdVideoH264PictureParameterSet(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH264PpsFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte seq_parameter_set_id() {
        return nseq_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte pic_parameter_set_id() {
        return npic_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte num_ref_idx_l0_default_active_minus1() {
        return nnum_ref_idx_l0_default_active_minus1(address());
    }

    @NativeType("uint8_t")
    public byte num_ref_idx_l1_default_active_minus1() {
        return nnum_ref_idx_l1_default_active_minus1(address());
    }

    @NativeType("StdVideoH264WeightedBipredIdc")
    public int weighted_bipred_idc() {
        return nweighted_bipred_idc(address());
    }

    @NativeType("int8_t")
    public byte pic_init_qp_minus26() {
        return npic_init_qp_minus26(address());
    }

    @NativeType("int8_t")
    public byte pic_init_qs_minus26() {
        return npic_init_qs_minus26(address());
    }

    @NativeType("int8_t")
    public byte chroma_qp_index_offset() {
        return nchroma_qp_index_offset(address());
    }

    @NativeType("int8_t")
    public byte second_chroma_qp_index_offset() {
        return nsecond_chroma_qp_index_offset(address());
    }

    @NativeType("StdVideoH264ScalingLists const *")
    public StdVideoH264ScalingLists pScalingLists() {
        return npScalingLists(address());
    }

    public StdVideoH264PictureParameterSet flags(StdVideoH264PpsFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet flags(Consumer<StdVideoH264PpsFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH264PictureParameterSet seq_parameter_set_id(@NativeType("uint8_t") byte value) {
        nseq_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet pic_parameter_set_id(@NativeType("uint8_t") byte value) {
        npic_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet num_ref_idx_l0_default_active_minus1(@NativeType("uint8_t") byte value) {
        nnum_ref_idx_l0_default_active_minus1(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet num_ref_idx_l1_default_active_minus1(@NativeType("uint8_t") byte value) {
        nnum_ref_idx_l1_default_active_minus1(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet weighted_bipred_idc(@NativeType("StdVideoH264WeightedBipredIdc") int value) {
        nweighted_bipred_idc(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet pic_init_qp_minus26(@NativeType("int8_t") byte value) {
        npic_init_qp_minus26(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet pic_init_qs_minus26(@NativeType("int8_t") byte value) {
        npic_init_qs_minus26(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet chroma_qp_index_offset(@NativeType("int8_t") byte value) {
        nchroma_qp_index_offset(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet second_chroma_qp_index_offset(@NativeType("int8_t") byte value) {
        nsecond_chroma_qp_index_offset(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet pScalingLists(@NativeType("StdVideoH264ScalingLists const *") StdVideoH264ScalingLists value) {
        npScalingLists(address(), value);
        return this;
    }

    public StdVideoH264PictureParameterSet set(StdVideoH264PpsFlags flags, byte seq_parameter_set_id, byte pic_parameter_set_id, byte num_ref_idx_l0_default_active_minus1, byte num_ref_idx_l1_default_active_minus1, int weighted_bipred_idc, byte pic_init_qp_minus26, byte pic_init_qs_minus26, byte chroma_qp_index_offset, byte second_chroma_qp_index_offset, StdVideoH264ScalingLists pScalingLists) {
        flags(flags);
        seq_parameter_set_id(seq_parameter_set_id);
        pic_parameter_set_id(pic_parameter_set_id);
        num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1);
        num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1);
        weighted_bipred_idc(weighted_bipred_idc);
        pic_init_qp_minus26(pic_init_qp_minus26);
        pic_init_qs_minus26(pic_init_qs_minus26);
        chroma_qp_index_offset(chroma_qp_index_offset);
        second_chroma_qp_index_offset(second_chroma_qp_index_offset);
        pScalingLists(pScalingLists);
        return this;
    }

    public StdVideoH264PictureParameterSet set(StdVideoH264PictureParameterSet src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH264PictureParameterSet malloc() {
        return new StdVideoH264PictureParameterSet(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH264PictureParameterSet calloc() {
        return new StdVideoH264PictureParameterSet(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH264PictureParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH264PictureParameterSet(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH264PictureParameterSet create(long address) {
        return new StdVideoH264PictureParameterSet(address, null);
    }

    public static StdVideoH264PictureParameterSet createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH264PictureParameterSet(address, null);
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

    public static StdVideoH264PictureParameterSet malloc(MemoryStack stack) {
        return new StdVideoH264PictureParameterSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH264PictureParameterSet calloc(MemoryStack stack) {
        return new StdVideoH264PictureParameterSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH264PpsFlags nflags(long struct) {
        return StdVideoH264PpsFlags.create(struct + FLAGS);
    }

    public static byte nseq_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + SEQ_PARAMETER_SET_ID);
    }

    public static byte npic_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + PIC_PARAMETER_SET_ID);
    }

    public static byte nnum_ref_idx_l0_default_active_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1);
    }

    public static byte nnum_ref_idx_l1_default_active_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1);
    }

    public static int nweighted_bipred_idc(long struct) {
        return MemoryUtil.memGetInt(struct + WEIGHTED_BIPRED_IDC);
    }

    public static byte npic_init_qp_minus26(long struct) {
        return MemoryUtil.memGetByte(struct + PIC_INIT_QP_MINUS26);
    }

    public static byte npic_init_qs_minus26(long struct) {
        return MemoryUtil.memGetByte(struct + PIC_INIT_QS_MINUS26);
    }

    public static byte nchroma_qp_index_offset(long struct) {
        return MemoryUtil.memGetByte(struct + CHROMA_QP_INDEX_OFFSET);
    }

    public static byte nsecond_chroma_qp_index_offset(long struct) {
        return MemoryUtil.memGetByte(struct + SECOND_CHROMA_QP_INDEX_OFFSET);
    }

    public static StdVideoH264ScalingLists npScalingLists(long struct) {
        return StdVideoH264ScalingLists.create(MemoryUtil.memGetAddress(struct + PSCALINGLISTS));
    }

    public static void nflags(long struct, StdVideoH264PpsFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH264PpsFlags.SIZEOF);
    }

    public static void nseq_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SEQ_PARAMETER_SET_ID, value);
    }

    public static void npic_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PIC_PARAMETER_SET_ID, value);
    }

    public static void nnum_ref_idx_l0_default_active_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1, value);
    }

    public static void nnum_ref_idx_l1_default_active_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1, value);
    }

    public static void nweighted_bipred_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + WEIGHTED_BIPRED_IDC, value);
    }

    public static void npic_init_qp_minus26(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PIC_INIT_QP_MINUS26, value);
    }

    public static void npic_init_qs_minus26(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PIC_INIT_QS_MINUS26, value);
    }

    public static void nchroma_qp_index_offset(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_QP_INDEX_OFFSET, value);
    }

    public static void nsecond_chroma_qp_index_offset(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SECOND_CHROMA_QP_INDEX_OFFSET, value);
    }

    public static void npScalingLists(long struct, StdVideoH264ScalingLists value) {
        MemoryUtil.memPutAddress(struct + PSCALINGLISTS, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSCALINGLISTS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH264PictureParameterSet, Buffer> implements NativeResource {
        private static final StdVideoH264PictureParameterSet ELEMENT_FACTORY = StdVideoH264PictureParameterSet.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH264PictureParameterSet.SIZEOF);
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
        public StdVideoH264PictureParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH264PpsFlags flags() {
            return StdVideoH264PictureParameterSet.nflags(address());
        }

        @NativeType("uint8_t")
        public byte seq_parameter_set_id() {
            return StdVideoH264PictureParameterSet.nseq_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte pic_parameter_set_id() {
            return StdVideoH264PictureParameterSet.npic_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte num_ref_idx_l0_default_active_minus1() {
            return StdVideoH264PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(address());
        }

        @NativeType("uint8_t")
        public byte num_ref_idx_l1_default_active_minus1() {
            return StdVideoH264PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(address());
        }

        @NativeType("StdVideoH264WeightedBipredIdc")
        public int weighted_bipred_idc() {
            return StdVideoH264PictureParameterSet.nweighted_bipred_idc(address());
        }

        @NativeType("int8_t")
        public byte pic_init_qp_minus26() {
            return StdVideoH264PictureParameterSet.npic_init_qp_minus26(address());
        }

        @NativeType("int8_t")
        public byte pic_init_qs_minus26() {
            return StdVideoH264PictureParameterSet.npic_init_qs_minus26(address());
        }

        @NativeType("int8_t")
        public byte chroma_qp_index_offset() {
            return StdVideoH264PictureParameterSet.nchroma_qp_index_offset(address());
        }

        @NativeType("int8_t")
        public byte second_chroma_qp_index_offset() {
            return StdVideoH264PictureParameterSet.nsecond_chroma_qp_index_offset(address());
        }

        @NativeType("StdVideoH264ScalingLists const *")
        public StdVideoH264ScalingLists pScalingLists() {
            return StdVideoH264PictureParameterSet.npScalingLists(address());
        }

        public Buffer flags(StdVideoH264PpsFlags value) {
            StdVideoH264PictureParameterSet.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH264PpsFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer seq_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoH264PictureParameterSet.nseq_parameter_set_id(address(), value);
            return this;
        }

        public Buffer pic_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoH264PictureParameterSet.npic_parameter_set_id(address(), value);
            return this;
        }

        public Buffer num_ref_idx_l0_default_active_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH264PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(address(), value);
            return this;
        }

        public Buffer num_ref_idx_l1_default_active_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH264PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(address(), value);
            return this;
        }

        public Buffer weighted_bipred_idc(@NativeType("StdVideoH264WeightedBipredIdc") int value) {
            StdVideoH264PictureParameterSet.nweighted_bipred_idc(address(), value);
            return this;
        }

        public Buffer pic_init_qp_minus26(@NativeType("int8_t") byte value) {
            StdVideoH264PictureParameterSet.npic_init_qp_minus26(address(), value);
            return this;
        }

        public Buffer pic_init_qs_minus26(@NativeType("int8_t") byte value) {
            StdVideoH264PictureParameterSet.npic_init_qs_minus26(address(), value);
            return this;
        }

        public Buffer chroma_qp_index_offset(@NativeType("int8_t") byte value) {
            StdVideoH264PictureParameterSet.nchroma_qp_index_offset(address(), value);
            return this;
        }

        public Buffer second_chroma_qp_index_offset(@NativeType("int8_t") byte value) {
            StdVideoH264PictureParameterSet.nsecond_chroma_qp_index_offset(address(), value);
            return this;
        }

        public Buffer pScalingLists(@NativeType("StdVideoH264ScalingLists const *") StdVideoH264ScalingLists value) {
            StdVideoH264PictureParameterSet.npScalingLists(address(), value);
            return this;
        }
    }
}
