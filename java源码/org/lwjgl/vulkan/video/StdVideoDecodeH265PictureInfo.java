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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265PictureInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265PictureInfo.class */
public class StdVideoDecodeH265PictureInfo extends Struct<StdVideoDecodeH265PictureInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int SPS_SEQ_PARAMETER_SET_ID;
    public static final int PPS_PIC_PARAMETER_SET_ID;
    public static final int NUMDELTAPOCSOFREFRPSIDX;
    public static final int PICORDERCNTVAL;
    public static final int NUMBITSFORSTREFPICSETINSLICE;
    public static final int RESERVED;
    public static final int REFPICSETSTCURRBEFORE;
    public static final int REFPICSETSTCURRAFTER;
    public static final int REFPICSETLTCURR;

    static {
        Struct.Layout layout = __struct(__member(StdVideoDecodeH265PictureInfoFlags.SIZEOF, StdVideoDecodeH265PictureInfoFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(4), __member(2), __member(2), __array(1, 8), __array(1, 8), __array(1, 8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        SPS_SEQ_PARAMETER_SET_ID = layout.offsetof(1);
        PPS_PIC_PARAMETER_SET_ID = layout.offsetof(2);
        NUMDELTAPOCSOFREFRPSIDX = layout.offsetof(3);
        PICORDERCNTVAL = layout.offsetof(4);
        NUMBITSFORSTREFPICSETINSLICE = layout.offsetof(5);
        RESERVED = layout.offsetof(6);
        REFPICSETSTCURRBEFORE = layout.offsetof(7);
        REFPICSETSTCURRAFTER = layout.offsetof(8);
        REFPICSETLTCURR = layout.offsetof(9);
    }

    protected StdVideoDecodeH265PictureInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeH265PictureInfo create(long address, ByteBuffer container) {
        return new StdVideoDecodeH265PictureInfo(address, container);
    }

    public StdVideoDecodeH265PictureInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoDecodeH265PictureInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte sps_seq_parameter_set_id() {
        return nsps_seq_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte pps_pic_parameter_set_id() {
        return npps_pic_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte NumDeltaPocsOfRefRpsIdx() {
        return nNumDeltaPocsOfRefRpsIdx(address());
    }

    @NativeType("int32_t")
    public int PicOrderCntVal() {
        return nPicOrderCntVal(address());
    }

    @NativeType("uint16_t")
    public short NumBitsForSTRefPicSetInSlice() {
        return nNumBitsForSTRefPicSetInSlice(address());
    }

    @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
    public ByteBuffer RefPicSetStCurrBefore() {
        return nRefPicSetStCurrBefore(address());
    }

    @NativeType("uint8_t")
    public byte RefPicSetStCurrBefore(int index) {
        return nRefPicSetStCurrBefore(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
    public ByteBuffer RefPicSetStCurrAfter() {
        return nRefPicSetStCurrAfter(address());
    }

    @NativeType("uint8_t")
    public byte RefPicSetStCurrAfter(int index) {
        return nRefPicSetStCurrAfter(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
    public ByteBuffer RefPicSetLtCurr() {
        return nRefPicSetLtCurr(address());
    }

    @NativeType("uint8_t")
    public byte RefPicSetLtCurr(int index) {
        return nRefPicSetLtCurr(address(), index);
    }

    public StdVideoDecodeH265PictureInfo flags(StdVideoDecodeH265PictureInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo flags(Consumer<StdVideoDecodeH265PictureInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoDecodeH265PictureInfo sps_seq_parameter_set_id(@NativeType("uint8_t") byte value) {
        nsps_seq_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) {
        npps_pic_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo NumDeltaPocsOfRefRpsIdx(@NativeType("uint8_t") byte value) {
        nNumDeltaPocsOfRefRpsIdx(address(), value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo PicOrderCntVal(@NativeType("int32_t") int value) {
        nPicOrderCntVal(address(), value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo NumBitsForSTRefPicSetInSlice(@NativeType("uint16_t") short value) {
        nNumBitsForSTRefPicSetInSlice(address(), value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo RefPicSetStCurrBefore(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) {
        nRefPicSetStCurrBefore(address(), value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo RefPicSetStCurrBefore(int index, @NativeType("uint8_t") byte value) {
        nRefPicSetStCurrBefore(address(), index, value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo RefPicSetStCurrAfter(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) {
        nRefPicSetStCurrAfter(address(), value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo RefPicSetStCurrAfter(int index, @NativeType("uint8_t") byte value) {
        nRefPicSetStCurrAfter(address(), index, value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo RefPicSetLtCurr(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) {
        nRefPicSetLtCurr(address(), value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo RefPicSetLtCurr(int index, @NativeType("uint8_t") byte value) {
        nRefPicSetLtCurr(address(), index, value);
        return this;
    }

    public StdVideoDecodeH265PictureInfo set(StdVideoDecodeH265PictureInfoFlags flags, byte sps_seq_parameter_set_id, byte pps_pic_parameter_set_id, byte NumDeltaPocsOfRefRpsIdx, int PicOrderCntVal, short NumBitsForSTRefPicSetInSlice, ByteBuffer RefPicSetStCurrBefore, ByteBuffer RefPicSetStCurrAfter, ByteBuffer RefPicSetLtCurr) {
        flags(flags);
        sps_seq_parameter_set_id(sps_seq_parameter_set_id);
        pps_pic_parameter_set_id(pps_pic_parameter_set_id);
        NumDeltaPocsOfRefRpsIdx(NumDeltaPocsOfRefRpsIdx);
        PicOrderCntVal(PicOrderCntVal);
        NumBitsForSTRefPicSetInSlice(NumBitsForSTRefPicSetInSlice);
        RefPicSetStCurrBefore(RefPicSetStCurrBefore);
        RefPicSetStCurrAfter(RefPicSetStCurrAfter);
        RefPicSetLtCurr(RefPicSetLtCurr);
        return this;
    }

    public StdVideoDecodeH265PictureInfo set(StdVideoDecodeH265PictureInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeH265PictureInfo malloc() {
        return new StdVideoDecodeH265PictureInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeH265PictureInfo calloc() {
        return new StdVideoDecodeH265PictureInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeH265PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeH265PictureInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeH265PictureInfo create(long address) {
        return new StdVideoDecodeH265PictureInfo(address, null);
    }

    public static StdVideoDecodeH265PictureInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeH265PictureInfo(address, null);
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

    public static StdVideoDecodeH265PictureInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeH265PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeH265PictureInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeH265PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoDecodeH265PictureInfoFlags nflags(long struct) {
        return StdVideoDecodeH265PictureInfoFlags.create(struct + FLAGS);
    }

    public static byte nsps_seq_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + SPS_SEQ_PARAMETER_SET_ID);
    }

    public static byte npps_pic_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_PIC_PARAMETER_SET_ID);
    }

    public static byte nNumDeltaPocsOfRefRpsIdx(long struct) {
        return MemoryUtil.memGetByte(struct + NUMDELTAPOCSOFREFRPSIDX);
    }

    public static int nPicOrderCntVal(long struct) {
        return MemoryUtil.memGetInt(struct + PICORDERCNTVAL);
    }

    public static short nNumBitsForSTRefPicSetInSlice(long struct) {
        return MemoryUtil.memGetShort(struct + NUMBITSFORSTREFPICSETINSLICE);
    }

    public static short nreserved(long struct) {
        return MemoryUtil.memGetShort(struct + RESERVED);
    }

    public static ByteBuffer nRefPicSetStCurrBefore(long struct) {
        return MemoryUtil.memByteBuffer(struct + REFPICSETSTCURRBEFORE, 8);
    }

    public static byte nRefPicSetStCurrBefore(long struct, int index) {
        return MemoryUtil.memGetByte(struct + REFPICSETSTCURRBEFORE + (Checks.check(index, 8) * 1));
    }

    public static ByteBuffer nRefPicSetStCurrAfter(long struct) {
        return MemoryUtil.memByteBuffer(struct + REFPICSETSTCURRAFTER, 8);
    }

    public static byte nRefPicSetStCurrAfter(long struct, int index) {
        return MemoryUtil.memGetByte(struct + REFPICSETSTCURRAFTER + (Checks.check(index, 8) * 1));
    }

    public static ByteBuffer nRefPicSetLtCurr(long struct) {
        return MemoryUtil.memByteBuffer(struct + REFPICSETLTCURR, 8);
    }

    public static byte nRefPicSetLtCurr(long struct, int index) {
        return MemoryUtil.memGetByte(struct + REFPICSETLTCURR + (Checks.check(index, 8) * 1));
    }

    public static void nflags(long struct, StdVideoDecodeH265PictureInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoDecodeH265PictureInfoFlags.SIZEOF);
    }

    public static void nsps_seq_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SPS_SEQ_PARAMETER_SET_ID, value);
    }

    public static void npps_pic_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_PIC_PARAMETER_SET_ID, value);
    }

    public static void nNumDeltaPocsOfRefRpsIdx(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUMDELTAPOCSOFREFRPSIDX, value);
    }

    public static void nPicOrderCntVal(long struct, int value) {
        MemoryUtil.memPutInt(struct + PICORDERCNTVAL, value);
    }

    public static void nNumBitsForSTRefPicSetInSlice(long struct, short value) {
        MemoryUtil.memPutShort(struct + NUMBITSFORSTREFPICSETINSLICE, value);
    }

    public static void nreserved(long struct, short value) {
        MemoryUtil.memPutShort(struct + RESERVED, value);
    }

    public static void nRefPicSetStCurrBefore(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REFPICSETSTCURRBEFORE, value.remaining() * 1);
    }

    public static void nRefPicSetStCurrBefore(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + REFPICSETSTCURRBEFORE + (Checks.check(index, 8) * 1), value);
    }

    public static void nRefPicSetStCurrAfter(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REFPICSETSTCURRAFTER, value.remaining() * 1);
    }

    public static void nRefPicSetStCurrAfter(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + REFPICSETSTCURRAFTER + (Checks.check(index, 8) * 1), value);
    }

    public static void nRefPicSetLtCurr(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REFPICSETLTCURR, value.remaining() * 1);
    }

    public static void nRefPicSetLtCurr(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + REFPICSETLTCURR + (Checks.check(index, 8) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265PictureInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265PictureInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeH265PictureInfo, Buffer> implements NativeResource {
        private static final StdVideoDecodeH265PictureInfo ELEMENT_FACTORY = StdVideoDecodeH265PictureInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeH265PictureInfo.SIZEOF);
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
        public StdVideoDecodeH265PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoDecodeH265PictureInfoFlags flags() {
            return StdVideoDecodeH265PictureInfo.nflags(address());
        }

        @NativeType("uint8_t")
        public byte sps_seq_parameter_set_id() {
            return StdVideoDecodeH265PictureInfo.nsps_seq_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte pps_pic_parameter_set_id() {
            return StdVideoDecodeH265PictureInfo.npps_pic_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte NumDeltaPocsOfRefRpsIdx() {
            return StdVideoDecodeH265PictureInfo.nNumDeltaPocsOfRefRpsIdx(address());
        }

        @NativeType("int32_t")
        public int PicOrderCntVal() {
            return StdVideoDecodeH265PictureInfo.nPicOrderCntVal(address());
        }

        @NativeType("uint16_t")
        public short NumBitsForSTRefPicSetInSlice() {
            return StdVideoDecodeH265PictureInfo.nNumBitsForSTRefPicSetInSlice(address());
        }

        @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
        public ByteBuffer RefPicSetStCurrBefore() {
            return StdVideoDecodeH265PictureInfo.nRefPicSetStCurrBefore(address());
        }

        @NativeType("uint8_t")
        public byte RefPicSetStCurrBefore(int index) {
            return StdVideoDecodeH265PictureInfo.nRefPicSetStCurrBefore(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
        public ByteBuffer RefPicSetStCurrAfter() {
            return StdVideoDecodeH265PictureInfo.nRefPicSetStCurrAfter(address());
        }

        @NativeType("uint8_t")
        public byte RefPicSetStCurrAfter(int index) {
            return StdVideoDecodeH265PictureInfo.nRefPicSetStCurrAfter(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
        public ByteBuffer RefPicSetLtCurr() {
            return StdVideoDecodeH265PictureInfo.nRefPicSetLtCurr(address());
        }

        @NativeType("uint8_t")
        public byte RefPicSetLtCurr(int index) {
            return StdVideoDecodeH265PictureInfo.nRefPicSetLtCurr(address(), index);
        }

        public Buffer flags(StdVideoDecodeH265PictureInfoFlags value) {
            StdVideoDecodeH265PictureInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoDecodeH265PictureInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer sps_seq_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoDecodeH265PictureInfo.nsps_seq_parameter_set_id(address(), value);
            return this;
        }

        public Buffer pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoDecodeH265PictureInfo.npps_pic_parameter_set_id(address(), value);
            return this;
        }

        public Buffer NumDeltaPocsOfRefRpsIdx(@NativeType("uint8_t") byte value) {
            StdVideoDecodeH265PictureInfo.nNumDeltaPocsOfRefRpsIdx(address(), value);
            return this;
        }

        public Buffer PicOrderCntVal(@NativeType("int32_t") int value) {
            StdVideoDecodeH265PictureInfo.nPicOrderCntVal(address(), value);
            return this;
        }

        public Buffer NumBitsForSTRefPicSetInSlice(@NativeType("uint16_t") short value) {
            StdVideoDecodeH265PictureInfo.nNumBitsForSTRefPicSetInSlice(address(), value);
            return this;
        }

        public Buffer RefPicSetStCurrBefore(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) {
            StdVideoDecodeH265PictureInfo.nRefPicSetStCurrBefore(address(), value);
            return this;
        }

        public Buffer RefPicSetStCurrBefore(int index, @NativeType("uint8_t") byte value) {
            StdVideoDecodeH265PictureInfo.nRefPicSetStCurrBefore(address(), index, value);
            return this;
        }

        public Buffer RefPicSetStCurrAfter(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) {
            StdVideoDecodeH265PictureInfo.nRefPicSetStCurrAfter(address(), value);
            return this;
        }

        public Buffer RefPicSetStCurrAfter(int index, @NativeType("uint8_t") byte value) {
            StdVideoDecodeH265PictureInfo.nRefPicSetStCurrAfter(address(), index, value);
            return this;
        }

        public Buffer RefPicSetLtCurr(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) {
            StdVideoDecodeH265PictureInfo.nRefPicSetLtCurr(address(), value);
            return this;
        }

        public Buffer RefPicSetLtCurr(int index, @NativeType("uint8_t") byte value) {
            StdVideoDecodeH265PictureInfo.nRefPicSetLtCurr(address(), index, value);
            return this;
        }
    }
}
