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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo.class */
public class StdVideoEncodeH265PictureInfo extends Struct<StdVideoEncodeH265PictureInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int PIC_TYPE;
    public static final int SPS_VIDEO_PARAMETER_SET_ID;
    public static final int PPS_SEQ_PARAMETER_SET_ID;
    public static final int PPS_PIC_PARAMETER_SET_ID;
    public static final int SHORT_TERM_REF_PIC_SET_IDX;
    public static final int PICORDERCNTVAL;
    public static final int TEMPORALID;
    public static final int RESERVED1;
    public static final int PREFLISTS;
    public static final int PSHORTTERMREFPICSET;
    public static final int PLONGTERMREFPICS;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH265PictureInfoFlags.SIZEOF, StdVideoEncodeH265PictureInfoFlags.ALIGNOF), __member(4), __member(1), __member(1), __member(1), __member(1), __member(4), __member(1), __array(1, 7), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        PIC_TYPE = layout.offsetof(1);
        SPS_VIDEO_PARAMETER_SET_ID = layout.offsetof(2);
        PPS_SEQ_PARAMETER_SET_ID = layout.offsetof(3);
        PPS_PIC_PARAMETER_SET_ID = layout.offsetof(4);
        SHORT_TERM_REF_PIC_SET_IDX = layout.offsetof(5);
        PICORDERCNTVAL = layout.offsetof(6);
        TEMPORALID = layout.offsetof(7);
        RESERVED1 = layout.offsetof(8);
        PREFLISTS = layout.offsetof(9);
        PSHORTTERMREFPICSET = layout.offsetof(10);
        PLONGTERMREFPICS = layout.offsetof(11);
    }

    protected StdVideoEncodeH265PictureInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265PictureInfo create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265PictureInfo(address, container);
    }

    public StdVideoEncodeH265PictureInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH265PictureInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH265PictureType")
    public int pic_type() {
        return npic_type(address());
    }

    @NativeType("uint8_t")
    public byte sps_video_parameter_set_id() {
        return nsps_video_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte pps_seq_parameter_set_id() {
        return npps_seq_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte pps_pic_parameter_set_id() {
        return npps_pic_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte short_term_ref_pic_set_idx() {
        return nshort_term_ref_pic_set_idx(address());
    }

    @NativeType("int32_t")
    public int PicOrderCntVal() {
        return nPicOrderCntVal(address());
    }

    @NativeType("uint8_t")
    public byte TemporalId() {
        return nTemporalId(address());
    }

    @NativeType("StdVideoEncodeH265ReferenceModifications const *")
    public StdVideoEncodeH265ReferenceModifications pRefLists() {
        return npRefLists(address());
    }

    @NativeType("StdVideoH265ShortTermRefPicSet const *")
    public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
        return npShortTermRefPicSet(address());
    }

    @NativeType("StdVideoEncodeH265LongTermRefPics const *")
    public StdVideoEncodeH265LongTermRefPics pLongTermRefPics() {
        return npLongTermRefPics(address());
    }

    public StdVideoEncodeH265PictureInfo flags(StdVideoEncodeH265PictureInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo flags(Consumer<StdVideoEncodeH265PictureInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH265PictureInfo pic_type(@NativeType("StdVideoH265PictureType") int value) {
        npic_type(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo sps_video_parameter_set_id(@NativeType("uint8_t") byte value) {
        nsps_video_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) {
        npps_seq_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) {
        npps_pic_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo short_term_ref_pic_set_idx(@NativeType("uint8_t") byte value) {
        nshort_term_ref_pic_set_idx(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo PicOrderCntVal(@NativeType("int32_t") int value) {
        nPicOrderCntVal(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo TemporalId(@NativeType("uint8_t") byte value) {
        nTemporalId(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo pRefLists(@NativeType("StdVideoEncodeH265ReferenceModifications const *") StdVideoEncodeH265ReferenceModifications value) {
        npRefLists(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) {
        npShortTermRefPicSet(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo pLongTermRefPics(@NativeType("StdVideoEncodeH265LongTermRefPics const *") StdVideoEncodeH265LongTermRefPics value) {
        npLongTermRefPics(address(), value);
        return this;
    }

    public StdVideoEncodeH265PictureInfo set(StdVideoEncodeH265PictureInfoFlags flags, int pic_type, byte sps_video_parameter_set_id, byte pps_seq_parameter_set_id, byte pps_pic_parameter_set_id, byte short_term_ref_pic_set_idx, int PicOrderCntVal, byte TemporalId, StdVideoEncodeH265ReferenceModifications pRefLists, StdVideoH265ShortTermRefPicSet pShortTermRefPicSet, StdVideoEncodeH265LongTermRefPics pLongTermRefPics) {
        flags(flags);
        pic_type(pic_type);
        sps_video_parameter_set_id(sps_video_parameter_set_id);
        pps_seq_parameter_set_id(pps_seq_parameter_set_id);
        pps_pic_parameter_set_id(pps_pic_parameter_set_id);
        short_term_ref_pic_set_idx(short_term_ref_pic_set_idx);
        PicOrderCntVal(PicOrderCntVal);
        TemporalId(TemporalId);
        pRefLists(pRefLists);
        pShortTermRefPicSet(pShortTermRefPicSet);
        pLongTermRefPics(pLongTermRefPics);
        return this;
    }

    public StdVideoEncodeH265PictureInfo set(StdVideoEncodeH265PictureInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265PictureInfo malloc() {
        return new StdVideoEncodeH265PictureInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265PictureInfo calloc() {
        return new StdVideoEncodeH265PictureInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265PictureInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265PictureInfo create(long address) {
        return new StdVideoEncodeH265PictureInfo(address, null);
    }

    public static StdVideoEncodeH265PictureInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265PictureInfo(address, null);
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

    public static StdVideoEncodeH265PictureInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH265PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265PictureInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH265PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH265PictureInfoFlags nflags(long struct) {
        return StdVideoEncodeH265PictureInfoFlags.create(struct + FLAGS);
    }

    public static int npic_type(long struct) {
        return MemoryUtil.memGetInt(struct + PIC_TYPE);
    }

    public static byte nsps_video_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + SPS_VIDEO_PARAMETER_SET_ID);
    }

    public static byte npps_seq_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_SEQ_PARAMETER_SET_ID);
    }

    public static byte npps_pic_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_PIC_PARAMETER_SET_ID);
    }

    public static byte nshort_term_ref_pic_set_idx(long struct) {
        return MemoryUtil.memGetByte(struct + SHORT_TERM_REF_PIC_SET_IDX);
    }

    public static int nPicOrderCntVal(long struct) {
        return MemoryUtil.memGetInt(struct + PICORDERCNTVAL);
    }

    public static byte nTemporalId(long struct) {
        return MemoryUtil.memGetByte(struct + TEMPORALID);
    }

    public static ByteBuffer nreserved1(long struct) {
        return MemoryUtil.memByteBuffer(struct + RESERVED1, 7);
    }

    public static byte nreserved1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + RESERVED1 + (Checks.check(index, 7) * 1));
    }

    public static StdVideoEncodeH265ReferenceModifications npRefLists(long struct) {
        return StdVideoEncodeH265ReferenceModifications.create(MemoryUtil.memGetAddress(struct + PREFLISTS));
    }

    public static StdVideoH265ShortTermRefPicSet npShortTermRefPicSet(long struct) {
        return StdVideoH265ShortTermRefPicSet.create(MemoryUtil.memGetAddress(struct + PSHORTTERMREFPICSET));
    }

    public static StdVideoEncodeH265LongTermRefPics npLongTermRefPics(long struct) {
        return StdVideoEncodeH265LongTermRefPics.create(MemoryUtil.memGetAddress(struct + PLONGTERMREFPICS));
    }

    public static void nflags(long struct, StdVideoEncodeH265PictureInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH265PictureInfoFlags.SIZEOF);
    }

    public static void npic_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIC_TYPE, value);
    }

    public static void nsps_video_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SPS_VIDEO_PARAMETER_SET_ID, value);
    }

    public static void npps_seq_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_SEQ_PARAMETER_SET_ID, value);
    }

    public static void npps_pic_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_PIC_PARAMETER_SET_ID, value);
    }

    public static void nshort_term_ref_pic_set_idx(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SHORT_TERM_REF_PIC_SET_IDX, value);
    }

    public static void nPicOrderCntVal(long struct, int value) {
        MemoryUtil.memPutInt(struct + PICORDERCNTVAL, value);
    }

    public static void nTemporalId(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TEMPORALID, value);
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

    public static void npRefLists(long struct, StdVideoEncodeH265ReferenceModifications value) {
        MemoryUtil.memPutAddress(struct + PREFLISTS, value.address());
    }

    public static void npShortTermRefPicSet(long struct, StdVideoH265ShortTermRefPicSet value) {
        MemoryUtil.memPutAddress(struct + PSHORTTERMREFPICSET, value.address());
    }

    public static void npLongTermRefPics(long struct, StdVideoEncodeH265LongTermRefPics value) {
        MemoryUtil.memPutAddress(struct + PLONGTERMREFPICS, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PREFLISTS));
        Checks.check(MemoryUtil.memGetAddress(struct + PSHORTTERMREFPICSET));
        Checks.check(MemoryUtil.memGetAddress(struct + PLONGTERMREFPICS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265PictureInfo, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265PictureInfo ELEMENT_FACTORY = StdVideoEncodeH265PictureInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265PictureInfo.SIZEOF);
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
        public StdVideoEncodeH265PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH265PictureInfoFlags flags() {
            return StdVideoEncodeH265PictureInfo.nflags(address());
        }

        @NativeType("StdVideoH265PictureType")
        public int pic_type() {
            return StdVideoEncodeH265PictureInfo.npic_type(address());
        }

        @NativeType("uint8_t")
        public byte sps_video_parameter_set_id() {
            return StdVideoEncodeH265PictureInfo.nsps_video_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte pps_seq_parameter_set_id() {
            return StdVideoEncodeH265PictureInfo.npps_seq_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte pps_pic_parameter_set_id() {
            return StdVideoEncodeH265PictureInfo.npps_pic_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte short_term_ref_pic_set_idx() {
            return StdVideoEncodeH265PictureInfo.nshort_term_ref_pic_set_idx(address());
        }

        @NativeType("int32_t")
        public int PicOrderCntVal() {
            return StdVideoEncodeH265PictureInfo.nPicOrderCntVal(address());
        }

        @NativeType("uint8_t")
        public byte TemporalId() {
            return StdVideoEncodeH265PictureInfo.nTemporalId(address());
        }

        @NativeType("StdVideoEncodeH265ReferenceModifications const *")
        public StdVideoEncodeH265ReferenceModifications pRefLists() {
            return StdVideoEncodeH265PictureInfo.npRefLists(address());
        }

        @NativeType("StdVideoH265ShortTermRefPicSet const *")
        public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
            return StdVideoEncodeH265PictureInfo.npShortTermRefPicSet(address());
        }

        @NativeType("StdVideoEncodeH265LongTermRefPics const *")
        public StdVideoEncodeH265LongTermRefPics pLongTermRefPics() {
            return StdVideoEncodeH265PictureInfo.npLongTermRefPics(address());
        }

        public Buffer flags(StdVideoEncodeH265PictureInfoFlags value) {
            StdVideoEncodeH265PictureInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH265PictureInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer pic_type(@NativeType("StdVideoH265PictureType") int value) {
            StdVideoEncodeH265PictureInfo.npic_type(address(), value);
            return this;
        }

        public Buffer sps_video_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265PictureInfo.nsps_video_parameter_set_id(address(), value);
            return this;
        }

        public Buffer pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265PictureInfo.npps_seq_parameter_set_id(address(), value);
            return this;
        }

        public Buffer pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265PictureInfo.npps_pic_parameter_set_id(address(), value);
            return this;
        }

        public Buffer short_term_ref_pic_set_idx(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265PictureInfo.nshort_term_ref_pic_set_idx(address(), value);
            return this;
        }

        public Buffer PicOrderCntVal(@NativeType("int32_t") int value) {
            StdVideoEncodeH265PictureInfo.nPicOrderCntVal(address(), value);
            return this;
        }

        public Buffer TemporalId(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265PictureInfo.nTemporalId(address(), value);
            return this;
        }

        public Buffer pRefLists(@NativeType("StdVideoEncodeH265ReferenceModifications const *") StdVideoEncodeH265ReferenceModifications value) {
            StdVideoEncodeH265PictureInfo.npRefLists(address(), value);
            return this;
        }

        public Buffer pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) {
            StdVideoEncodeH265PictureInfo.npShortTermRefPicSet(address(), value);
            return this;
        }

        public Buffer pLongTermRefPics(@NativeType("StdVideoEncodeH265LongTermRefPics const *") StdVideoEncodeH265LongTermRefPics value) {
            StdVideoEncodeH265PictureInfo.npLongTermRefPics(address(), value);
            return this;
        }
    }
}
